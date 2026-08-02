package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1uSDK implements AFe1xSDK {
    public final AFf1tSDK AFKeystoreWrapper;
    private final AFc1hSDK AFLogger;

    @Nullable
    private AFf1zSDK afInfoLog;
    private final AFf1rSDK d;
    private final AFd1tSDK e;

    @Nullable
    private AFh1kSDK force;
    private final AFe1ySDK i;
    private final Object registerClient = new Object();
    private final AFf1oSDK unregisterClient;
    private final AFc1gSDK v;
    private final AFf1vSDK w;

    public AFf1uSDK(AFf1rSDK aFf1rSDK, AFc1hSDK aFc1hSDK, AFf1oSDK aFf1oSDK, AFf1tSDK aFf1tSDK, AFd1tSDK aFd1tSDK, AFf1vSDK aFf1vSDK, AFc1gSDK aFc1gSDK, AFe1ySDK aFe1ySDK) {
        this.d = aFf1rSDK;
        this.AFLogger = aFc1hSDK;
        this.unregisterClient = aFf1oSDK;
        this.AFKeystoreWrapper = aFf1tSDK;
        this.e = aFd1tSDK;
        this.w = aFf1vSDK;
        this.v = aFc1gSDK;
        this.i = aFe1ySDK;
        aFe1ySDK.d.add(this);
    }

    private void unregisterClient(@NonNull AFf1zSDK aFf1zSDK, @Nullable AFe1aSDK aFe1aSDK) {
        synchronized (this.registerClient) {
            this.afInfoLog = aFf1zSDK;
        }
        if (aFe1aSDK != null) {
            aFe1aSDK.onRemoteConfigUpdateFinished(aFf1zSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void AFKeystoreWrapper(AFe1vSDK<?> aFe1vSDK) {
        if (aFe1vSDK instanceof AFf1ySDK) {
            AFf1ySDK aFf1ySDK = (AFf1ySDK) aFe1vSDK;
            synchronized (this.registerClient) {
                this.force = null;
            }
            unregisterClient(AFf1zSDK.FAILURE, aFf1ySDK.registerClient);
        }
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void AFLogger(AFe1vSDK<?> aFe1vSDK, AFd1bSDK aFd1bSDK) {
        if (aFe1vSDK instanceof AFf1ySDK) {
            AFf1ySDK aFf1ySDK = (AFf1ySDK) aFe1vSDK;
            AFf1zSDK aFf1zSDK = aFf1ySDK.i;
            if (aFf1zSDK == null) {
                AFLogger.INSTANCE.w(LogTag.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1zSDK = AFf1zSDK.FAILURE;
            }
            if (aFf1zSDK != AFf1zSDK.USE_CACHED) {
                AFh1kSDK aFh1kSDK = aFf1ySDK.force;
                synchronized (this.registerClient) {
                    this.force = aFh1kSDK;
                }
            }
            unregisterClient(aFf1zSDK, aFf1ySDK.registerClient);
        }
    }

    public final void registerClient(@Nullable AFe1aSDK aFe1aSDK) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(this.d, this.AFLogger, this.unregisterClient, this.AFKeystoreWrapper, this.e, this.w, this.v, "v1", aFe1aSDK);
        AFe1ySDK aFe1ySDK = this.i;
        aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(aFf1ySDK));
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void unregisterClient(AFe1vSDK<?> aFe1vSDK) {
    }

    @Override // com.appsflyer.internal.AFe1xSDK
    public final void registerClient(AFe1vSDK<?> aFe1vSDK) {
    }

    @Nullable
    public final AFh1kSDK AFLogger() {
        AFh1kSDK aFh1kSDK;
        synchronized (this.registerClient) {
            aFh1kSDK = this.force;
            this.force = null;
        }
        return aFh1kSDK;
    }
}
