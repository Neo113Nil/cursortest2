package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1qSDK extends AFe1mSDK<AFf1pSDK> {
    public AFi1wSDK areAllFieldsValid;
    private final AFc1oSDK component1;
    public final AFf1mSDK component2;
    public AFf1pSDK component3;
    private final AFf1nSDK component4;
    private final AFd1nSDK copy;
    private final AFf1jSDK copydefault;
    private final String equals;
    private final AFf1hSDK hashCode;
    private final AFf1eSDK toString;

    public AFf1qSDK(@NonNull AFf1nSDK aFf1nSDK, @NonNull AFc1oSDK aFc1oSDK, @NonNull AFf1eSDK aFf1eSDK, @NonNull AFf1hSDK aFf1hSDK, @NonNull AFd1nSDK aFd1nSDK, @NonNull AFf1jSDK aFf1jSDK, @NonNull String str, AFf1mSDK aFf1mSDK) {
        super(AFe1pSDK.RC_CDN, new AFe1pSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component4 = aFf1nSDK;
        this.component1 = aFc1oSDK;
        this.toString = aFf1eSDK;
        this.hashCode = aFf1hSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFf1jSDK;
        this.equals = str;
        this.component2 = aFf1mSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1pSDK component3() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.equals;
        String mediationNetwork = this.toString.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()}), mediationNetwork);
            if (str != null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1pSDK.FAILURE;
            }
            try {
                if (!this.copydefault.AFAdRevenueData()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1pSDK.USE_CACHED;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
                AFe1wSDK<AFi1vSDK> currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), str, 1500).getCurrencyIso4217Code();
                if (!currencyIso4217Code.isSuccessful()) {
                    getCurrencyIso4217Code(str, currentTimeMillis, null, null, currencyIso4217Code);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(currencyIso4217Code.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb2.toString());
                    return AFf1pSDK.FAILURE;
                }
                AFi1vSDK body = currencyIso4217Code.getBody();
                String revenue = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
                String revenue2 = currencyIso4217Code.getRevenue("CF-Cache-Status");
                String mediationNetwork2 = this.toString.getMediationNetwork();
                if (mediationNetwork2 == null || mediationNetwork2.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1pSDK.FAILURE;
                }
                AFi1sSDK revenue3 = this.component4.getRevenue(body, revenue, str, mediationNetwork2);
                if (!revenue3.getCurrencyIso4217Code()) {
                    getCurrencyIso4217Code(str, currentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1pSDK.FAILURE;
                }
                long currencyIso4217Code2 = this.copydefault.getCurrencyIso4217Code();
                StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                sb3.append(currencyIso4217Code2);
                sb3.append(" seconds");
                aFLogger.v(aFg1cSDK, sb3.toString());
                long currentTimeMillis2 = System.currentTimeMillis();
                AFf1hSDK aFf1hSDK = this.hashCode;
                String str3 = str;
                try {
                } catch (IOException e10) {
                    e = e10;
                    str = str3;
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                }
                try {
                    aFf1hSDK.AFAdRevenueData.getRevenue("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
                    aFf1hSDK.getMediationNetwork = aFf1hSDK.getCurrencyIso4217Code;
                    aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_timestamp", currentTimeMillis2);
                    aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_max_age", currencyIso4217Code2);
                    aFf1hSDK.getCurrencyIso4217Code = body;
                    aFf1hSDK.getRevenue = currentTimeMillis2;
                    aFf1hSDK.getMonetizationNetwork = currencyIso4217Code2;
                    StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb4.append(currencyIso4217Code2);
                    sb4.append(" seconds");
                    aFLogger.d(aFg1cSDK, sb4.toString());
                    getCurrencyIso4217Code(str3, currentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                    return AFf1pSDK.SUCCESS;
                } catch (IOException e11) {
                    e = e11;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    IOException iOException = e;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                    sb5.append(iOException.getMessage());
                    aFLogger2.e(aFg1cSDK2, sb5.toString(), iOException, true, false, false);
                    getMonetizationNetwork(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                    if (iOException.getCause() instanceof InterruptedIOException) {
                        throw ((InterruptedIOException) iOException.getCause());
                    }
                    return AFf1pSDK.FAILURE;
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    Throwable th4 = th;
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                    sb6.append(th4.getMessage());
                    aFLogger3.e(aFg1cSDK3, sb6.toString(), th4, true, false, false);
                    getMonetizationNetwork(str, currentTimeMillis, null, null, null, null, th4);
                    if (th4.getCause() instanceof InterruptedException) {
                        throw ((InterruptedException) th4.getCause());
                    }
                    return AFf1pSDK.FAILURE;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getCurrencyIso4217Code(String str, long j10, AFi1ySDK aFi1ySDK, String str2, AFe1wSDK<AFi1vSDK> aFe1wSDK) {
        getMonetizationNetwork(str, j10, aFe1wSDK, aFe1wSDK != null ? aFe1wSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1uSDK getRevenue() {
        try {
            AFf1pSDK component3 = component3();
            this.component3 = component3;
            return component3 == AFf1pSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
        } catch (InterruptedIOException e10) {
            e = e10;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }

    private void getMonetizationNetwork(String str, long j10, AFe1wSDK<?> aFe1wSDK, AFi1vSDK aFi1vSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th2) {
        long j11;
        int i10;
        Throwable th3;
        if (aFe1wSDK != null) {
            j11 = aFe1wSDK.getMonetizationNetwork.getMediationNetwork;
            i10 = aFe1wSDK.getStatusCode();
        } else {
            j11 = 0;
            i10 = 0;
        }
        int i11 = i10;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j11 = ((HttpException) th2).getMetrics().getMediationNetwork;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.areAllFieldsValid = new AFi1wSDK(aFi1vSDK != null ? aFi1vSDK.AFAdRevenueData : null, str, j11, System.currentTimeMillis() - j10, i11, aFi1ySDK, str2, th3);
    }
}
