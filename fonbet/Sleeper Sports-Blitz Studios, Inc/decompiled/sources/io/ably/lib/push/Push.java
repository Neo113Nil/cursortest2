package io.ably.lib.push;

import android.content.Context;
import android.preference.PreferenceManager;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.push.ActivationStateMachine;
import io.ably.lib.rest.AblyBase;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class Push extends PushBase {
    private static final String TAG = "io.ably.lib.push.Push";
    protected ActivationContext activationContext;

    public Push(AblyBase ablyBase) {
        super(ablyBase);
        this.activationContext = null;
    }

    public void activate() throws AblyException {
        activate(false);
    }

    public void activate(boolean z) throws AblyException {
        Log.v(TAG, "activate(): useCustomRegistrar=" + z);
        getStateMachine().handleEvent(ActivationStateMachine.CalledActivate.useCustomRegistrar(z, PreferenceManager.getDefaultSharedPreferences(getApplicationContext())));
    }

    public void deactivate() throws AblyException {
        deactivate(false);
    }

    public void deactivate(boolean z) throws AblyException {
        Log.v(TAG, "deactivate(): useCustomRegistrar=" + z);
        getStateMachine().handleEvent(ActivationStateMachine.CalledDeactivate.useCustomRegistrar(z, PreferenceManager.getDefaultSharedPreferences(getApplicationContext())));
    }

    synchronized ActivationStateMachine getStateMachine() throws AblyException {
        return getActivationContext().getActivationStateMachine();
    }

    public void tryRequestRegistrationToken() {
        try {
            if (getLocalDevice().isRegistered()) {
                Log.v(TAG, "Local device is registered.");
                getStateMachine().getRegistrationToken();
            } else {
                Log.v(TAG, "Local device is not registered.");
            }
        } catch (AblyException e) {
            Log.e(TAG, "couldn't validate existing push recipient device details", e);
        }
    }

    Context getApplicationContext() throws AblyException {
        Context applicationContext = this.rest.platform.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        Log.e(TAG, "getApplicationContext(): Unable to get application context; not set");
        throw AblyException.fromErrorInfo(new ErrorInfo("Unable to get application context; not set", 40000, 400));
    }

    public ActivationContext getActivationContext() throws AblyException {
        if (this.activationContext == null) {
            Log.v(TAG, "getActivationContext(): creating a new context and returning that");
            this.activationContext = ActivationContext.getActivationContext(getApplicationContext(), (AblyRest) this.rest);
        } else {
            Log.v(TAG, "getActivationContext(): returning existing content");
        }
        return this.activationContext;
    }

    public LocalDevice getLocalDevice() throws AblyException {
        return getActivationContext().getLocalDevice();
    }

    @Override // io.ably.lib.push.PushBase
    Param[] pushRequestHeaders(boolean z) {
        Param[] pushRequestHeaders = super.pushRequestHeaders(z);
        if (z) {
            try {
                Param[] deviceIdentityHeaders = getLocalDevice().deviceIdentityHeaders();
                if (deviceIdentityHeaders != null) {
                    Log.v(TAG, "pushRequestHeaders(): deviceIdentityHeaders=" + Arrays.toString(deviceIdentityHeaders));
                    return HttpUtils.mergeHeaders(pushRequestHeaders, deviceIdentityHeaders);
                }
                Log.w(TAG, "pushRequestHeaders(): Local device returned null device identity headers!");
                return pushRequestHeaders;
            } catch (AblyException e) {
                Log.w(TAG, "pushRequestHeaders(): Failed to get device identity headers. forLocalDevice=" + z, e);
            }
        }
        return pushRequestHeaders;
    }

    @Override // io.ably.lib.push.PushBase
    Param[] pushRequestHeaders(String str) {
        boolean z = false;
        if (str != null) {
            try {
                if (str.equals(getLocalDevice().id)) {
                    z = true;
                }
            } catch (AblyException e) {
                Log.w(TAG, "pushRequestHeaders(): deviceId=" + str, e);
            }
        }
        return pushRequestHeaders(z);
    }
}
