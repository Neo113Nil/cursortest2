package com.socure.idplus.device;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.callback.SigmaDeviceCallback;
import com.socure.idplus.device.context.SigmaDeviceContext;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.d;
import com.socure.idplus.device.internal.j;
import com.socure.idplus.device.internal.sigmaDeviceSession.manager.c;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateCustomerSession;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001*J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\nJ!\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rR\"\u0010!\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/socure/idplus/device/SigmaDevice;", "", "Landroid/content/Context;", "context", "", "sdkKey", "Lcom/socure/idplus/device/SigmaDeviceOptions;", "sigmaDeviceOptions", "Lcom/socure/idplus/device/callback/SigmaDeviceCallback;", "sigmaDeviceCallback", "", "initializeSDK", "customerSessionId", "Lcom/socure/idplus/device/callback/SessionTokenCallback;", "sessionTokenCallback", "addCustomerSessionId", "createNewSession", "pauseDataCollection", "resumeDataCollection", "", "isSDKInitialized$device_risk_sdk_release", "(Ljava/lang/String;Lcom/socure/idplus/device/SigmaDeviceOptions;)Z", "isSDKInitialized", "getSessionToken", "Lcom/socure/idplus/device/context/SigmaDeviceContext;", "sigmaDeviceContext", "processDevice", "b", "Z", "getHasRegisteredActivityLifecycleCallbacks$device_risk_sdk_release", "()Z", "setHasRegisteredActivityLifecycleCallbacks$device_risk_sdk_release", "(Z)V", "hasRegisteredActivityLifecycleCallbacks", "Lcom/socure/idplus/device/internal/a;", "g", "Lcom/socure/idplus/device/internal/a;", "getSocureInternal$device_risk_sdk_release", "()Lcom/socure/idplus/device/internal/a;", "setSocureInternal$device_risk_sdk_release", "(Lcom/socure/idplus/device/internal/a;)V", "socureInternal", "com/socure/idplus/device/a", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SigmaDevice {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f838a = false;

    /* renamed from: b, reason: from kotlin metadata */
    public static boolean hasRegisteredActivityLifecycleCallbacks = false;
    public static String c = "";
    public static boolean d;
    public static SigmaDeviceCallback f;

    /* renamed from: g, reason: from kotlin metadata */
    public static com.socure.idplus.device.internal.a socureInternal;
    public static a h;
    public static final SigmaDevice INSTANCE = new SigmaDevice();
    public static SigmaDeviceOptions e = new SigmaDeviceOptions(false, null, false, null, null, 31, null);

    public static final void access$reset(SigmaDevice sigmaDevice) {
        sigmaDevice.getClass();
        f838a = false;
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            ((j) aVar).b();
        }
        socureInternal = null;
    }

    public static /* synthetic */ void initializeSDK$default(SigmaDevice sigmaDevice, Context context, String str, SigmaDeviceOptions sigmaDeviceOptions, SigmaDeviceCallback sigmaDeviceCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            sigmaDeviceOptions = null;
        }
        sigmaDevice.initializeSDK(context, str, sigmaDeviceOptions, sigmaDeviceCallback);
    }

    public static /* synthetic */ void processDevice$default(SigmaDevice sigmaDevice, SigmaDeviceContext sigmaDeviceContext, SessionTokenCallback sessionTokenCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            sigmaDeviceContext = new SigmaDeviceContext.Other("unknown");
        }
        sigmaDevice.processDevice(sigmaDeviceContext, sessionTokenCallback);
    }

    public final void addCustomerSessionId(String customerSessionId, SessionTokenCallback sessionTokenCallback) {
        Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
        Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
        if (!f838a) {
            sessionTokenCallback.onError(SigmaDeviceError.SdkNotInitializedError, "addCustomerSessionId() cannot be called without initializeSDK()");
            return;
        }
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            j jVar = (j) aVar;
            Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
            Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
            jVar.b.setCustomerSessionId(customerSessionId);
            com.socure.idplus.device.internal.sigmaDeviceSession.manager.j jVar2 = jVar.f;
            jVar2.getClass();
            Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
            jVar2.a(new c(jVar2, new CreateCustomerSession(customerSessionId), sessionTokenCallback));
        }
    }

    public final void createNewSession(String customerSessionId, SessionTokenCallback sessionTokenCallback) {
        Context context;
        Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
        Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
        if (!f838a) {
            sessionTokenCallback.onError(SigmaDeviceError.SdkNotInitializedError, "createNewSession() cannot be called without initializeSDK()");
            return;
        }
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            j jVar = (j) aVar;
            Intrinsics.checkNotNullParameter(customerSessionId, "customerSessionId");
            Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
            jVar.b.setCustomerSessionId(customerSessionId);
            WeakReference weakReference = jVar.g;
            if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                return;
            }
            jVar.a(context, sessionTokenCallback);
        }
    }

    public final boolean getHasRegisteredActivityLifecycleCallbacks$device_risk_sdk_release() {
        return hasRegisteredActivityLifecycleCallbacks;
    }

    public final void getSessionToken(SessionTokenCallback sessionTokenCallback) {
        Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
        if (!f838a) {
            sessionTokenCallback.onError(SigmaDeviceError.SdkNotInitializedError, "getSessionToken() cannot be called without initializeSDK()");
            return;
        }
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            ((j) aVar).a(sessionTokenCallback);
        }
    }

    public final com.socure.idplus.device.internal.a getSocureInternal$device_risk_sdk_release() {
        return socureInternal;
    }

    public final void initializeSDK(Context context, String sdkKey, SigmaDeviceOptions sigmaDeviceOptions, SigmaDeviceCallback sigmaDeviceCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(sigmaDeviceCallback, "sigmaDeviceCallback");
        if (StringsKt.isBlank(sdkKey)) {
            sigmaDeviceCallback.onError(SigmaDeviceError.UnknownError, "The SDK key must not be blank.");
            return;
        }
        a aVar = null;
        String configBaseUrl = sigmaDeviceOptions != null ? sigmaDeviceOptions.getConfigBaseUrl() : null;
        if (configBaseUrl != null) {
            HttpUrl parse = HttpUrl.INSTANCE.parse(configBaseUrl);
            if (((!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"https", "http"}), parse != null ? parse.scheme() : null) || parse == null) ? null : parse.url()) == null) {
                sigmaDeviceCallback.onError(SigmaDeviceError.UnknownError, "The configBaseUrl must be a valid URL.");
                return;
            }
        }
        f = sigmaDeviceCallback;
        if (isSDKInitialized$device_risk_sdk_release(sdkKey, sigmaDeviceOptions)) {
            com.socure.idplus.device.internal.a aVar2 = socureInternal;
            if (aVar2 != null) {
                ((j) aVar2).a(sigmaDeviceCallback);
                return;
            }
            return;
        }
        f838a = true;
        d = false;
        socureInternal = new j(context, sdkKey, e, sigmaDeviceCallback);
        if (!hasRegisteredActivityLifecycleCallbacks) {
            hasRegisteredActivityLifecycleCallbacks = true;
            h = new a();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                a aVar3 = h;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lifecycleCallbacks");
                    aVar3 = null;
                }
                application.registerActivityLifecycleCallbacks(aVar3);
            }
            boolean z = context instanceof Activity;
            Activity activity = z ? (Activity) context : null;
            if (activity != null) {
                a aVar4 = h;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lifecycleCallbacks");
                    aVar4 = null;
                }
                aVar4.onActivityCreated(activity, null);
            }
            Intrinsics.checkNotNullParameter(context, "context");
            if (z) {
                Activity activity2 = (Activity) context;
                if (activity2.getWindow().getDecorView().getRootView().hasWindowFocus()) {
                    a aVar5 = h;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("lifecycleCallbacks");
                    } else {
                        aVar = aVar5;
                    }
                    aVar.onActivityStarted(activity2);
                }
            }
        }
        com.socure.idplus.device.internal.a aVar6 = socureInternal;
        if (aVar6 != null) {
            ((j) aVar6).a(new b());
        }
    }

    public final boolean isSDKInitialized$device_risk_sdk_release(String sdkKey, SigmaDeviceOptions sigmaDeviceOptions) {
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        if (f838a && Intrinsics.areEqual(c, sdkKey)) {
            if (Intrinsics.areEqual(e.getConfigBaseUrl(), sigmaDeviceOptions != null ? sigmaDeviceOptions.getConfigBaseUrl() : null)) {
                return true;
            }
        }
        c = sdkKey;
        if (sigmaDeviceOptions == null) {
            sigmaDeviceOptions = e;
        }
        e = sigmaDeviceOptions;
        return false;
    }

    public final void pauseDataCollection() {
        Intrinsics.checkNotNullParameter("SigmaDevice", "tag");
        Intrinsics.checkNotNullParameter("Pausing behavioral data collection", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SigmaDevice", "Pausing behavioral data collection");
        } else if (ordinal == 1) {
            Log.i("SigmaDevice", "Pausing behavioral data collection");
        }
        d = true;
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter("SocureInternal", "tag");
            Intrinsics.checkNotNullParameter("pauseDataCollection()", "msg");
            com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.f870a;
            ((j) aVar).h.a(true);
        }
    }

    public final void processDevice(SigmaDeviceContext sigmaDeviceContext, SessionTokenCallback sessionTokenCallback) {
        Intrinsics.checkNotNullParameter(sigmaDeviceContext, "sigmaDeviceContext");
        Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
        if (!f838a) {
            sessionTokenCallback.onError(SigmaDeviceError.SdkNotInitializedError, "processDevice() cannot be called without initializeSDK()");
            return;
        }
        if (d) {
            sessionTokenCallback.onError(SigmaDeviceError.SdkPausedError, "processDevice() cannot be called as sdk is paused.");
            return;
        }
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            j jVar = (j) aVar;
            Intrinsics.checkNotNullParameter(sigmaDeviceContext, "sigmaDeviceContext");
            Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
            WeakReference weakReference = jVar.g;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            if (context == null) {
                sessionTokenCallback.onError(SigmaDeviceError.ContextFetchError, "cannot perform Socure device intelligence on a destroyed context");
            } else {
                jVar.a(context, sigmaDeviceContext, new com.socure.idplus.device.internal.c(sessionTokenCallback), new d(sessionTokenCallback));
            }
        }
    }

    public final void resumeDataCollection() {
        Intrinsics.checkNotNullParameter("SigmaDevice", "tag");
        Intrinsics.checkNotNullParameter("Resuming behavioral data collection", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SigmaDevice", "Resuming behavioral data collection");
        } else if (ordinal == 1) {
            Log.i("SigmaDevice", "Resuming behavioral data collection");
        }
        d = false;
        com.socure.idplus.device.internal.a aVar = socureInternal;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter("SocureInternal", "tag");
            Intrinsics.checkNotNullParameter("resumeDataCollection()", "msg");
            com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.f870a;
            ((j) aVar).h.b(true);
        }
    }

    public final void setHasRegisteredActivityLifecycleCallbacks$device_risk_sdk_release(boolean z) {
        hasRegisteredActivityLifecycleCallbacks = z;
    }

    public final void setSocureInternal$device_risk_sdk_release(com.socure.idplus.device.internal.a aVar) {
        socureInternal = aVar;
    }
}
