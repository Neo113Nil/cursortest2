package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFe1oSDK<Result> extends AFe1vSDK<AFd1iSDK<Result>> {

    @Nullable
    private String afDebugLog;
    private AFc1sSDK e;
    public final AFf1oSDK force;

    @Nullable
    private final AFh1fSDK i;
    protected final AFd1tSDK registerClient;
    protected final AFd1ySDK v;

    @Nullable
    public AFd1iSDK<Result> w;

    public AFe1oSDK(@NonNull AFe1zSDK aFe1zSDK, @NonNull AFe1zSDK[] aFe1zSDKArr, @NonNull AFc1aSDK aFc1aSDK, @Nullable String str, @Nullable String str2) {
        this(aFe1zSDK, aFe1zSDKArr, aFc1aSDK.d(), aFc1aSDK.values(), aFc1aSDK.AFLoggerLogLevel(), aFc1aSDK.getEntries(), str, aFc1aSDK.enableTCFDataCollection());
        this.afDebugLog = str2;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public void AFLogger() {
        String str;
        if (this.AFKeystoreWrapper == AFd1bSDK.SUCCESS) {
            String str2 = this.afDebugLog;
            if (str2 != null) {
                this.e.registerClient(str2);
                return;
            }
            return;
        }
        if (d() || (str = this.afDebugLog) == null) {
            return;
        }
        this.e.registerClient(str);
    }

    @Nullable
    public abstract AppsFlyerRequestListener AFLoggerLogLevel();

    public boolean a_() {
        return true;
    }

    public abstract boolean afInfoLog();

    @Nullable
    public abstract AFd1qSDK<Result> d(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1vSDK
    public boolean d() {
        if (force() instanceof AFe1qSDK) {
            return false;
        }
        if (this.AFKeystoreWrapper == AFd1bSDK.TIMEOUT) {
            return true;
        }
        Throwable force = force();
        return (force instanceof IOException) && !(force instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public long registerClient() {
        return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NonNull
    public AFd1bSDK unregisterClient() throws Exception {
        if (a_() && this.force.AFLogger()) {
            AppsFlyerRequestListener AFLoggerLogLevel = AFLoggerLogLevel();
            if (AFLoggerLogLevel != null) {
                AFLoggerLogLevel.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1qSDK();
        }
        AFf1oSDK aFf1oSDK = this.force;
        String str = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener AFLoggerLogLevel2 = AFLoggerLogLevel();
            if (AFLoggerLogLevel2 != null) {
                AFLoggerLogLevel2.onError(41, "No dev key");
            }
            throw new AFe1uSDK();
        }
        AFd1qSDK<Result> d = d(str);
        if (d == null) {
            AFLogger.INSTANCE.e(LogTag.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            return AFd1bSDK.FAILURE;
        }
        if (afInfoLog()) {
            unregisterClient(d.unregisterClient);
        }
        AFd1iSDK<Result> AFLogger = d.AFLogger();
        this.w = AFLogger;
        this.v.d(d.unregisterClient.registerClient, AFLogger.getStatusCode(), AFLogger.getBody().toString());
        AppsFlyerRequestListener AFLoggerLogLevel3 = AFLoggerLogLevel();
        if (AFLoggerLogLevel3 != null) {
            if (AFLogger.isSuccessful()) {
                AFLoggerLogLevel3.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(AFLogger.getStatusCode());
                AFLoggerLogLevel3.onError(50, sb.toString());
            }
        }
        return AFLogger.isSuccessful() ? AFd1bSDK.SUCCESS : AFd1bSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void w() {
        super.w();
        if (afInfoLog()) {
            AFf1oSDK aFf1oSDK = this.force;
            String str = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            AFd1qSDK<Result> d = d(str);
            if (d != null) {
                unregisterClient(d.unregisterClient);
            } else {
                AFLogger.INSTANCE.e(LogTag.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            }
        }
    }

    public AFe1oSDK(@NonNull AFe1zSDK aFe1zSDK, @NonNull AFe1zSDK[] aFe1zSDKArr, @NonNull AFc1aSDK aFc1aSDK, @Nullable String str) {
        this(aFe1zSDK, aFe1zSDKArr, aFc1aSDK.d(), aFc1aSDK.values(), aFc1aSDK.AFLoggerLogLevel(), aFc1aSDK.getEntries(), str, aFc1aSDK.enableTCFDataCollection());
    }

    private AFe1oSDK(@NonNull AFe1zSDK aFe1zSDK, @NonNull AFe1zSDK[] aFe1zSDKArr, @NonNull AFd1tSDK aFd1tSDK, @NonNull AFf1oSDK aFf1oSDK, @NonNull AFd1ySDK aFd1ySDK, @NonNull AFc1sSDK aFc1sSDK, @Nullable String str, @Nullable AFh1fSDK aFh1fSDK) {
        super(aFe1zSDK, aFe1zSDKArr, str);
        this.registerClient = aFd1tSDK;
        this.force = aFf1oSDK;
        this.v = aFd1ySDK;
        this.e = aFc1sSDK;
        this.i = aFh1fSDK;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void unregisterClient(Throwable th) {
        Throwable th2;
        String message;
        boolean z = th instanceof HttpException;
        boolean z2 = !z;
        if (th instanceof AFe1qSDK) {
            AFLogger.INSTANCE.e(LogTag.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
            th2 = th;
        } else {
            th2 = th;
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.HTTP_CLIENT;
            aFLogger.e(logTag, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, false, false, z2);
            aFLogger.w(logTag, "Error while sending request to server: ".concat(String.valueOf(th2)));
        }
        AppsFlyerRequestListener AFLoggerLogLevel = AFLoggerLogLevel();
        if (AFLoggerLogLevel != null) {
            if (z) {
                message = AFe1pSDK.d((HttpException) th2, this.i);
            } else {
                message = th2.getMessage() != null ? th2.getMessage() : "";
            }
            AFLoggerLogLevel.onError(40, message);
        }
    }

    private void unregisterClient(AFd1lSDK aFd1lSDK) {
        String str = this.afDebugLog;
        this.afDebugLog = this.e.AFLogger(new AFc1vSDK(aFd1lSDK.registerClient, aFd1lSDK.AFKeystoreWrapper, "7.0.0", this.d, aFd1lSDK.AFLogger));
        if (str != null) {
            this.e.registerClient(str);
        }
    }
}
