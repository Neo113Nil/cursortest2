package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1ySDK extends AFe1vSDK<AFf1zSDK> {
    private final AFc1gSDK AFLoggerLogLevel;
    private final AFf1vSDK afDebugLog;
    private final String afErrorLog;
    private final AFf1tSDK afInfoLog;
    private final AFd1tSDK afWarnLog;
    private final AFf1rSDK e;
    public AFh1kSDK force;

    @Nullable
    public AFf1zSDK i;

    @Nullable
    public final AFe1aSDK registerClient;
    private final AFc1hSDK v;
    private final AFf1oSDK w;

    public AFf1ySDK(@NonNull AFf1rSDK aFf1rSDK, @NonNull AFc1hSDK aFc1hSDK, @NonNull AFf1oSDK aFf1oSDK, @NonNull AFf1tSDK aFf1tSDK, @NonNull AFd1tSDK aFd1tSDK, @NonNull AFf1vSDK aFf1vSDK, @NonNull AFc1gSDK aFc1gSDK, @NonNull String str, @Nullable AFe1aSDK aFe1aSDK) {
        super(AFd1aSDK.registerClient, new AFe1zSDK[0], "UpdateRemoteConfiguration");
        this.i = null;
        this.e = aFf1rSDK;
        this.v = aFc1hSDK;
        this.w = aFf1oSDK;
        this.afInfoLog = aFf1tSDK;
        this.afWarnLog = aFd1tSDK;
        this.afDebugLog = aFf1vSDK;
        this.AFLoggerLogLevel = aFc1gSDK;
        this.afErrorLog = str;
        this.registerClient = aFe1aSDK;
    }

    private void AFLogger(String str, long j, AFh1nSDK aFh1nSDK, @Nullable String str2, @Nullable AFd1iSDK<AFh1lSDK> aFd1iSDK) {
        unregisterClient(str, j, aFd1iSDK, aFd1iSDK != null ? aFd1iSDK.getBody() : null, aFh1nSDK, str2 != null ? str2 : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011c A[Catch: all -> 0x00a3, IOException -> 0x00a7, TryCatch #6 {IOException -> 0x00a7, all -> 0x00a3, blocks: (B:13:0x006d, B:15:0x0091, B:17:0x00ff, B:19:0x011c, B:21:0x0136, B:23:0x013c, B:24:0x0146, B:26:0x015e, B:29:0x016a, B:31:0x0174, B:39:0x01e3, B:69:0x0201, B:71:0x0212, B:73:0x0141, B:74:0x0218, B:76:0x00ab, B:78:0x00b1, B:79:0x00c1, B:82:0x00c8, B:84:0x00cc, B:87:0x00db, B:92:0x00f3), top: B:12:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0218 A[Catch: all -> 0x00a3, IOException -> 0x00a7, TRY_LEAVE, TryCatch #6 {IOException -> 0x00a7, all -> 0x00a3, blocks: (B:13:0x006d, B:15:0x0091, B:17:0x00ff, B:19:0x011c, B:21:0x0136, B:23:0x013c, B:24:0x0146, B:26:0x015e, B:29:0x016a, B:31:0x0174, B:39:0x01e3, B:69:0x0201, B:71:0x0212, B:73:0x0141, B:74:0x0218, B:76:0x00ab, B:78:0x00b1, B:79:0x00c1, B:82:0x00c8, B:84:0x00cc, B:87:0x00db, B:92:0x00f3), top: B:12:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1zSDK i() throws InterruptedException, InterruptedIOException {
        String str;
        boolean z;
        AFh1jSDK aFh1jSDK;
        AFd1iSDK<AFh1lSDK> AFLogger;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.afErrorLog;
        AFf1oSDK aFf1oSDK = this.w;
        String str3 = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK));
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(LogTag.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(LogTag.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1xSDK.d(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.v.registerClient.d.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1zSDK.FAILURE;
            }
            try {
                boolean booleanValue = ((Boolean) this.afDebugLog.unregisterClient.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) this.afDebugLog.AFLogger.getValue()).booleanValue();
                AFf1vSDK aFf1vSDK = this.afDebugLog;
                if (aFf1vSDK.AFKeystoreWrapper.setCustomerUserId == null) {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Cold start detected - fetching config from CDN", false, 4, null);
                } else {
                    AFh1lSDK aFh1lSDK = aFf1vSDK.registerClient.registerClient;
                    if (aFh1lSDK != null) {
                        AFh1rSDK aFh1rSDK = aFh1lSDK.AFKeystoreWrapper;
                        boolean z2 = false;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        if (aFh1rSDK != null && (aFh1jSDK = aFh1rSDK.unregisterClient) != null && timeUnit.toMillis(aFh1jSDK.unregisterClient) > AFh1jSDK.registerClient()) {
                            z2 = true;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        AFf1tSDK aFf1tSDK = aFf1vSDK.registerClient;
                        z = booleanValue2;
                        long j = currentTimeMillis2 - aFf1tSDK.AFLogger;
                        long millis = timeUnit.toMillis(aFf1tSDK.AFKeystoreWrapper);
                        if (!z2 && j <= millis) {
                            AFLogger.INSTANCE.d(LogTag.REMOTE_CONTROL, "Using cached config (warm start, config valid)");
                            return AFf1zSDK.USE_CACHED;
                        }
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.REMOTE_CONTROL;
                        aFLogger.d(logTag, "Fetching config (cold start or stale)...");
                        AFLogger = this.afWarnLog.unregisterClient(booleanValue, z, str, TTAdConstant.STYLE_SIZE_RADIO_3_2).AFLogger();
                        if (AFLogger.isSuccessful()) {
                            AFLogger(str, currentTimeMillis, null, null, AFLogger);
                            StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                            sb.append(AFLogger.getStatusCode());
                            aFLogger.w(logTag, sb.toString());
                            return AFf1zSDK.FAILURE;
                        }
                        AFh1lSDK body = AFLogger.getBody();
                        String unregisterClient = AFLogger.unregisterClient("x-amz-meta-af-auth-v1");
                        String unregisterClient2 = AFLogger.unregisterClient("CF-Cache-Status");
                        String unregisterClient3 = AFLogger.unregisterClient("af-net-tkn");
                        if (unregisterClient3 == null || unregisterClient3.isEmpty()) {
                            aFLogger.d(logTag, "Network token header not present in the response");
                        } else {
                            this.AFLoggerLogLevel.setCustomerUserId = unregisterClient3;
                        }
                        AFf1oSDK aFf1oSDK2 = this.w;
                        String str4 = (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK2}, 343398987, -343398985, System.identityHashCode(aFf1oSDK2));
                        if (str4 != null && str4.trim().length() != 0) {
                            AFh1eSDK registerClient = this.e.registerClient(body, unregisterClient, str, str4);
                            if (!registerClient.AFLogger) {
                                AFLogger(str, currentTimeMillis, registerClient.AFKeystoreWrapper, unregisterClient2, AFLogger);
                                aFLogger.w(logTag, "fetched config is not valid (MITM?) refuse to use it.");
                                return AFf1zSDK.FAILURE;
                            }
                            long d = this.afDebugLog.d();
                            StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                            sb2.append(d);
                            sb2.append(" seconds");
                            aFLogger.v(logTag, sb2.toString());
                            long currentTimeMillis3 = System.currentTimeMillis();
                            AFf1tSDK aFf1tSDK2 = this.afInfoLog;
                            String str5 = str;
                            try {
                            } catch (IOException e) {
                                e = e;
                                str = str5;
                            } catch (Throwable th) {
                                th = th;
                                str = str5;
                            }
                            try {
                                aFf1tSDK2.d.d("af_remote_config", Base64.encodeToString(body.d.getBytes(Charset.defaultCharset()), 2));
                                aFf1tSDK2.unregisterClient = aFf1tSDK2.registerClient;
                                aFf1tSDK2.d.AFLogger("af_rc_timestamp", currentTimeMillis3);
                                aFf1tSDK2.d.AFLogger("af_rc_max_age", d);
                                aFf1tSDK2.registerClient = body;
                                aFf1tSDK2.AFLogger = currentTimeMillis3;
                                aFf1tSDK2.AFKeystoreWrapper = d;
                                StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                                sb3.append(d);
                                sb3.append(" seconds");
                                aFLogger.d(logTag, sb3.toString());
                                AFLogger(str5, currentTimeMillis, registerClient.AFKeystoreWrapper, unregisterClient2, AFLogger);
                                return AFf1zSDK.SUCCESS;
                            } catch (IOException e2) {
                                e = e2;
                                str = str5;
                                currentTimeMillis = currentTimeMillis;
                                IOException iOException = e;
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                LogTag logTag2 = LogTag.REMOTE_CONTROL;
                                StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                                sb4.append(iOException.getMessage());
                                aFLogger2.e(logTag2, sb4.toString(), iOException, true, false, false);
                                unregisterClient(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                                if (iOException.getCause() instanceof InterruptedIOException) {
                                    throw ((InterruptedIOException) iOException.getCause());
                                }
                                return AFf1zSDK.FAILURE;
                            } catch (Throwable th2) {
                                th = th2;
                                str = str5;
                                currentTimeMillis = currentTimeMillis;
                                Throwable th3 = th;
                                AFLogger aFLogger3 = AFLogger.INSTANCE;
                                LogTag logTag3 = LogTag.REMOTE_CONTROL;
                                StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                                sb5.append(th3.getMessage());
                                aFLogger3.e(logTag3, sb5.toString(), th3, true, false, false);
                                unregisterClient(str, currentTimeMillis, null, null, null, null, th3);
                                if (th3.getCause() instanceof InterruptedException) {
                                    throw ((InterruptedException) th3.getCause());
                                }
                                return AFf1zSDK.FAILURE;
                            }
                        }
                        aFLogger.w(logTag, "Dev key is not set, SDK is not started.");
                        return AFf1zSDK.FAILURE;
                    }
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
                }
                z = booleanValue2;
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                LogTag logTag4 = LogTag.REMOTE_CONTROL;
                aFLogger4.d(logTag4, "Fetching config (cold start or stale)...");
                AFLogger = this.afWarnLog.unregisterClient(booleanValue, z, str, TTAdConstant.STYLE_SIZE_RADIO_3_2).AFLogger();
                if (AFLogger.isSuccessful()) {
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void unregisterClient(String str, long j, @Nullable AFd1iSDK<?> aFd1iSDK, AFh1lSDK aFh1lSDK, AFh1nSDK aFh1nSDK, @Nullable String str2, @Nullable Throwable th) {
        long j2;
        int i;
        Throwable th2;
        if (aFd1iSDK != null) {
            j2 = aFd1iSDK.AFLogger.registerClient;
            i = aFd1iSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().registerClient;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.force = new AFh1kSDK(aFh1lSDK != null ? aFh1lSDK.registerClient : null, str, j2, System.currentTimeMillis() - j, i2, aFh1nSDK, str2, th2);
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NonNull
    public final AFd1bSDK unregisterClient() throws Exception {
        try {
            AFf1zSDK i = i();
            this.i = i;
            if (i == AFf1zSDK.FAILURE) {
                return AFd1bSDK.FAILURE;
            }
            return AFd1bSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.e(LogTag.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.i = AFf1zSDK.FAILURE;
            return AFd1bSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.e(LogTag.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.i = AFf1zSDK.FAILURE;
            return AFd1bSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.i = AFf1zSDK.FAILURE;
            return AFd1bSDK.TIMEOUT;
        }
    }
}
