package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class AFf1rSDK<Result> extends AFe1eSDK<AFe1hSDK<Result>> {
    public AFe1hSDK<Result> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    protected final AFe1wSDK f57438d;

    /* renamed from: e, reason: collision with root package name */
    private AFb1vSDK f57439e;

    /* renamed from: i, reason: collision with root package name */
    private String f57440i;
    public final AFg1xSDK registerClient;
    protected final AFb1bSDK unregisterClient;

    private AFf1rSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFg1xSDK aFg1xSDK, @NonNull AFb1bSDK aFb1bSDK, @NonNull AFb1vSDK aFb1vSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.f57438d = aFe1wSDK;
        this.registerClient = aFg1xSDK;
        this.unregisterClient = aFb1bSDK;
        this.f57439e = aFb1vSDK;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public boolean AFInAppEventParameterName() {
        if (e() instanceof AFf1wSDK) {
            return false;
        }
        if (this.AFInAppEventType == AFe1dSDK.TIMEOUT) {
            return true;
        }
        Throwable e11 = e();
        return (e11 instanceof IOException) && !(e11 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public void AFKeystoreWrapper() {
        String str;
        if (this.AFInAppEventType == AFe1dSDK.SUCCESS) {
            String str2 = this.f57440i;
            if (str2 != null) {
                this.f57439e.AFInAppEventParameterName(str2);
                return;
            }
            return;
        }
        if (AFInAppEventParameterName() || (str = this.f57440i) == null) {
            return;
        }
        this.f57439e.AFInAppEventParameterName(str);
    }

    protected abstract AppsFlyerRequestListener registerClient();

    protected abstract boolean unregisterClient();

    protected boolean v() {
        return true;
    }

    protected abstract AFe1uSDK<Result> valueOf(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void valueOf() {
        String str;
        super.valueOf();
        if (!unregisterClient() || (str = this.registerClient.registerClient) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1uSDK<Result> valueOf = valueOf(str);
        if (valueOf != null) {
            AFInAppEventParameterName(valueOf.AFKeystoreWrapper);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public AFe1dSDK values() throws Exception {
        if (v() && this.registerClient.AFKeystoreWrapper()) {
            AppsFlyerRequestListener registerClient = registerClient();
            if (registerClient != null) {
                registerClient.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1wSDK();
        }
        String str = this.registerClient.registerClient;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener registerClient2 = registerClient();
            if (registerClient2 != null) {
                registerClient2.onError(41, "No dev key");
            }
            throw new AFe1aSDK();
        }
        AFe1uSDK<Result> valueOf = valueOf(str);
        if (valueOf == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFe1dSDK.FAILURE;
        }
        if (unregisterClient()) {
            AFInAppEventParameterName(valueOf.AFKeystoreWrapper);
        }
        AFe1hSDK<Result> AFInAppEventParameterName = valueOf.AFInAppEventParameterName();
        this.AFLogger = AFInAppEventParameterName;
        this.unregisterClient.AFInAppEventParameterName(valueOf.AFKeystoreWrapper.valueOf, AFInAppEventParameterName.getStatusCode(), AFInAppEventParameterName.getBody().toString());
        AppsFlyerRequestListener registerClient3 = registerClient();
        if (registerClient3 != null) {
            if (AFInAppEventParameterName.isSuccessful()) {
                registerClient3.onSuccess();
            } else {
                StringBuilder sb2 = new StringBuilder("Status code failure ");
                sb2.append(AFInAppEventParameterName.getStatusCode());
                registerClient3.onError(50, sb2.toString());
            }
        }
        return AFInAppEventParameterName.isSuccessful() ? AFe1dSDK.SUCCESS : AFe1dSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void AFInAppEventType(Throwable th2) {
        Throwable th3;
        boolean z11 = !(th2 instanceof HttpException);
        if (th2 instanceof AFf1wSDK) {
            th3 = th2;
            AFLogger.INSTANCE.e(AFg1gSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th3, true, false);
        } else {
            th3 = th2;
            AFLogger.INSTANCE.e(AFg1gSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th3)), th3, true, true, z11);
        }
        AppsFlyerRequestListener registerClient = registerClient();
        if (registerClient != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            registerClient.onError(40, message);
        }
    }

    public AFf1rSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1mSDK aFd1mSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1mSDK.AFKeystoreWrapper(), aFd1mSDK.force(), aFd1mSDK.i(), aFd1mSDK.afRDLog(), str);
    }

    private void AFInAppEventParameterName(AFe1oSDK aFe1oSDK) {
        String str = this.f57440i;
        this.f57440i = this.f57439e.AFKeystoreWrapper(new AFb1qSDK(aFe1oSDK.valueOf, aFe1oSDK.values(), "6.13.1", this.AFInAppEventParameterName));
        if (str != null) {
            this.f57439e.AFInAppEventParameterName(str);
        }
    }

    public AFf1rSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1mSDK aFd1mSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1mSDK.AFKeystoreWrapper(), aFd1mSDK.force(), aFd1mSDK.i(), aFd1mSDK.afRDLog(), str);
        this.f57440i = str2;
    }
}
