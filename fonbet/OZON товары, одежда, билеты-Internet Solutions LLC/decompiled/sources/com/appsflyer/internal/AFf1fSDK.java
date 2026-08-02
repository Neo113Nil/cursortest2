package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1fSDK extends AFe1eSDK<AFf1gSDK> {
    private final AFf1eSDK AFLogger;
    private final AFg1xSDK afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    public AFf1gSDK f57411d;

    /* renamed from: e, reason: collision with root package name */
    public final AFf1cSDK f57412e;
    private final AFe1wSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFg1ySDK f57413i;
    private final AFd1sSDK registerClient;
    public AFh1eSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final AFf1aSDK f57414v;

    /* renamed from: w, reason: collision with root package name */
    private final String f57415w;

    public AFf1fSDK(@NonNull AFf1eSDK aFf1eSDK, @NonNull AFd1sSDK aFd1sSDK, @NonNull AFg1xSDK aFg1xSDK, @NonNull AFg1ySDK aFg1ySDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFf1aSDK aFf1aSDK, @NonNull String str, AFf1cSDK aFf1cSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.f57411d = null;
        this.AFLogger = aFf1eSDK;
        this.registerClient = aFd1sSDK;
        this.afInfoLog = aFg1xSDK;
        this.f57413i = aFg1ySDK;
        this.force = aFe1wSDK;
        this.f57414v = aFf1aSDK;
        this.f57415w = str;
        this.f57412e = aFf1cSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1gSDK unregisterClient() throws InterruptedException, InterruptedIOException {
        String str;
        AFh1gSDK aFh1gSDK;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.f57415w;
        String str3 = this.afInfoLog.registerClient;
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1gSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1gSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1mSDK.AFInAppEventType(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.registerClient.AFInAppEventParameterName.valueOf.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1gSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1gSDK.FAILURE;
            }
            try {
                if (!this.f57414v.AFKeystoreWrapper()) {
                    AFLogger.INSTANCE.d(AFg1gSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1gSDK.USE_CACHED;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK = AFg1gSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1gSDK, "Cached config is expired, updating...");
                AFe1hSDK<AFh1hSDK> AFInAppEventParameterName = this.force.valueOf(this.f57414v.valueOf(), this.f57414v.AFInAppEventType(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).AFInAppEventParameterName();
                if (!AFInAppEventParameterName.isSuccessful()) {
                    valueOf(str, currentTimeMillis, null, null, AFInAppEventParameterName);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(AFInAppEventParameterName.getStatusCode());
                    aFLogger.w(aFg1gSDK, sb2.toString());
                    return AFf1gSDK.FAILURE;
                }
                AFh1hSDK body = AFInAppEventParameterName.getBody();
                String values = AFInAppEventParameterName.values("x-amz-meta-af-auth-v1");
                String values2 = AFInAppEventParameterName.values("X-Af-Date");
                String values3 = AFInAppEventParameterName.values("CF-Cache-Status");
                String str4 = this.afInfoLog.registerClient;
                boolean AFKeystoreWrapper = new AFf1dSDK().AFKeystoreWrapper(values2);
                if (str4 != null && str4.trim().length() != 0) {
                    AFh1cSDK AFInAppEventType = this.AFLogger.AFInAppEventType(body, values, str, str4);
                    if (!AFInAppEventType.AFInAppEventType()) {
                        valueOf(str, currentTimeMillis, AFInAppEventType.AFInAppEventParameterName, values3, AFInAppEventParameterName);
                        aFLogger.w(aFg1gSDK, "fetched config is not valid (MITM?) refuse to use it.");
                        return AFf1gSDK.FAILURE;
                    }
                    if (!AFKeystoreWrapper && (aFh1gSDK = body.AFInAppEventType) != null) {
                        aFh1gSDK.valueOf = null;
                    }
                    long AFInAppEventParameterName2 = this.f57414v.AFInAppEventParameterName();
                    StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                    sb3.append(AFInAppEventParameterName2);
                    sb3.append(" seconds");
                    aFLogger.v(aFg1gSDK, sb3.toString());
                    long currentTimeMillis2 = System.currentTimeMillis();
                    AFg1ySDK aFg1ySDK = this.f57413i;
                    String str5 = str;
                    try {
                        try {
                            aFg1ySDK.AFKeystoreWrapper.valueOf("af_remote_config", Base64.encodeToString(body.AFKeystoreWrapper.getBytes(Charset.defaultCharset()), 2));
                            aFg1ySDK.AFInAppEventType = aFg1ySDK.AFInAppEventParameterName;
                            aFg1ySDK.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_timestamp", currentTimeMillis2);
                            aFg1ySDK.AFKeystoreWrapper.AFInAppEventParameterName("af_rc_max_age", AFInAppEventParameterName2);
                            aFg1ySDK.AFInAppEventParameterName = body;
                            aFg1ySDK.values = currentTimeMillis2;
                            aFg1ySDK.valueOf = AFInAppEventParameterName2;
                            StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                            sb4.append(AFInAppEventParameterName2);
                            sb4.append(" seconds");
                            aFLogger.d(aFg1gSDK, sb4.toString());
                            valueOf(str5, currentTimeMillis, AFInAppEventType.AFInAppEventParameterName, values3, AFInAppEventParameterName);
                            return AFf1gSDK.SUCCESS;
                        } catch (IOException e11) {
                            e = e11;
                            str = str5;
                            currentTimeMillis = currentTimeMillis;
                            IOException iOException = e;
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK2 = AFg1gSDK.REMOTE_CONTROL;
                            StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                            sb5.append(iOException.getMessage());
                            aFLogger2.e(aFg1gSDK2, sb5.toString(), iOException, true, false, false);
                            valueOf(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                            if (iOException.getCause() instanceof InterruptedIOException) {
                                throw ((InterruptedIOException) iOException.getCause());
                            }
                            return AFf1gSDK.FAILURE;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str5;
                            currentTimeMillis = currentTimeMillis;
                            Throwable th3 = th;
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK3 = AFg1gSDK.REMOTE_CONTROL;
                            StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                            sb6.append(th3.getMessage());
                            aFLogger3.e(aFg1gSDK3, sb6.toString(), th3, true, false, false);
                            valueOf(str, currentTimeMillis, null, null, null, null, th3);
                            if (th3.getCause() instanceof InterruptedException) {
                                throw ((InterruptedException) th3.getCause());
                            }
                            return AFf1gSDK.FAILURE;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        str = str5;
                    } catch (Throwable th4) {
                        th = th4;
                        str = str5;
                    }
                }
                aFLogger.w(aFg1gSDK, "Dev key is not set, SDK is not started.");
                return AFf1gSDK.FAILURE;
            } catch (IOException e13) {
                e = e13;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void valueOf(String str, long j11, AFh1bSDK aFh1bSDK, String str2, AFe1hSDK<AFh1hSDK> aFe1hSDK) {
        valueOf(str, j11, aFe1hSDK, aFe1hSDK != null ? aFe1hSDK.getBody() : null, aFh1bSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1dSDK values() throws Exception {
        try {
            AFf1gSDK unregisterClient = unregisterClient();
            this.f57411d = unregisterClient;
            return unregisterClient == AFf1gSDK.FAILURE ? AFe1dSDK.FAILURE : AFe1dSDK.SUCCESS;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f57411d = AFf1gSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.f57411d = AFf1gSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (InterruptedIOException e12) {
            e = e12;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f57411d = AFf1gSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        }
    }

    private void valueOf(String str, long j11, AFe1hSDK<?> aFe1hSDK, AFh1hSDK aFh1hSDK, AFh1bSDK aFh1bSDK, String str2, Throwable th2) {
        long j12;
        int i11;
        Throwable th3;
        if (aFe1hSDK != null) {
            j12 = aFe1hSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            i11 = aFe1hSDK.getStatusCode();
        } else {
            j12 = 0;
            i11 = 0;
        }
        int i12 = i11;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j12 = ((HttpException) th2).getMetrics().AFKeystoreWrapper;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.unregisterClient = new AFh1eSDK(aFh1hSDK != null ? aFh1hSDK.values : null, str, j12, System.currentTimeMillis() - j11, i12, aFh1bSDK, str2, th3);
    }
}
