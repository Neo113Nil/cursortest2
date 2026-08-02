package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class AFg1ySDK extends AFe1bSDK<AFf1aSDK> {
    public final AFf1bSDK areAllFieldsValid;
    private final AFg1zSDK component1;
    private final AFd1rSDK component2;
    public AFf1aSDK component3;
    public AFi1xSDK component4;
    private final AFg1wSDK copy;
    private final AFe1qSDK copydefault;
    private final String equals;
    private final AFg1uSDK hashCode;
    private final AFg1vSDK toString;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFg1ySDK(AFg1zSDK aFg1zSDK, AFd1rSDK aFd1rSDK, AFg1uSDK aFg1uSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1wSDK aFg1wSDK, String str, AFf1bSDK aFf1bSDK) {
        super(AFf1wSDK.RC_CDN, new AFf1wSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component1 = aFg1zSDK;
        this.component2 = aFd1rSDK;
        this.hashCode = aFg1uSDK;
        this.toString = aFg1vSDK;
        this.copydefault = aFe1qSDK;
        this.copy = aFg1wSDK;
        this.equals = str;
        this.areAllFieldsValid = aFf1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() throws Exception {
        try {
            AFf1aSDK areAllFieldsValid = areAllFieldsValid();
            this.component3 = areAllFieldsValid;
            if (areAllFieldsValid == AFf1aSDK.FAILURE) {
                return AFe1dSDK.FAILURE;
            }
            return AFe1dSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.e(AFh1xSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1aSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFh1xSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1aSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1aSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1aSDK areAllFieldsValid() throws InterruptedException, InterruptedIOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.equals;
        String str3 = this.hashCode.component2;
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFh1xSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFh1xSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1kSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component2.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(AFh1xSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1aSDK.FAILURE;
            }
            try {
                if (this.copy.getRevenue()) {
                    AFLogger.INSTANCE.i(AFh1xSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    AFe1iSDK<AFi1ySDK> AFAdRevenueData = ((AFe1rSDK) AFe1qSDK.getMediationNetwork(new Object[]{this.copydefault, Boolean.valueOf(this.copy.getMediationNetwork()), Boolean.valueOf(this.copy.getCurrencyIso4217Code()), str, 1500}, 1386933028, -1386933027, 1500)).AFAdRevenueData();
                    if (AFAdRevenueData.isSuccessful()) {
                        AFi1ySDK body = AFAdRevenueData.getBody();
                        String currencyIso4217Code = AFAdRevenueData.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                        String currencyIso4217Code2 = AFAdRevenueData.getCurrencyIso4217Code("CF-Cache-Status");
                        String str4 = this.hashCode.component2;
                        if (str4 != null && str4.trim().length() != 0) {
                            AFi1wSDK monetizationNetwork = this.component1.getMonetizationNetwork(body, currencyIso4217Code, str, str4);
                            if (monetizationNetwork.getMediationNetwork()) {
                                long monetizationNetwork2 = this.copy.getMonetizationNetwork();
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1xSDK aFh1xSDK = AFh1xSDK.REMOTE_CONTROL;
                                StringBuilder sb = new StringBuilder("using max-age fallback: ");
                                sb.append(monetizationNetwork2);
                                sb.append(" seconds");
                                aFLogger.v(aFh1xSDK, sb.toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFg1vSDK aFg1vSDK = this.toString;
                                aFg1vSDK.getMediationNetwork.getMonetizationNetwork("af_remote_config", Base64.encodeToString(body.getMonetizationNetwork.getBytes(Charset.defaultCharset()), 2));
                                aFg1vSDK.AFAdRevenueData = aFg1vSDK.getMonetizationNetwork;
                                aFg1vSDK.getMediationNetwork.AFAdRevenueData("af_rc_timestamp", currentTimeMillis2);
                                aFg1vSDK.getMediationNetwork.AFAdRevenueData("af_rc_max_age", monetizationNetwork2);
                                aFg1vSDK.getMonetizationNetwork = body;
                                aFg1vSDK.getCurrencyIso4217Code = currentTimeMillis2;
                                aFg1vSDK.getRevenue = monetizationNetwork2;
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFh1xSDK aFh1xSDK2 = AFh1xSDK.REMOTE_CONTROL;
                                StringBuilder sb2 = new StringBuilder("Config successfully updated, timeToLive: ");
                                sb2.append(monetizationNetwork2);
                                sb2.append(" seconds");
                                aFLogger2.d(aFh1xSDK2, sb2.toString());
                                getMonetizationNetwork(str, currentTimeMillis, monetizationNetwork.getMonetizationNetwork, currencyIso4217Code2, AFAdRevenueData);
                                return AFf1aSDK.SUCCESS;
                            }
                            getMonetizationNetwork(str, currentTimeMillis, monetizationNetwork.getMonetizationNetwork, currencyIso4217Code2, AFAdRevenueData);
                            AFLogger.INSTANCE.w(AFh1xSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1aSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFh1xSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1aSDK.FAILURE;
                    }
                    getMonetizationNetwork(str, currentTimeMillis, null, null, AFAdRevenueData);
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFh1xSDK aFh1xSDK3 = AFh1xSDK.REMOTE_CONTROL;
                    StringBuilder sb3 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb3.append(AFAdRevenueData.getStatusCode());
                    aFLogger3.w(aFh1xSDK3, sb3.toString());
                    return AFf1aSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFh1xSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1aSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK4 = AFh1xSDK.REMOTE_CONTROL;
                StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                sb4.append(e.getMessage());
                aFLogger4.e(aFh1xSDK4, sb4.toString(), e, true, false, false);
                getMediationNetwork(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFf1aSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger aFLogger5 = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK5 = AFh1xSDK.REMOTE_CONTROL;
                StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                sb5.append(th.getMessage());
                aFLogger5.e(aFh1xSDK5, sb5.toString(), th, true, false, false);
                getMediationNetwork(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1aSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getMonetizationNetwork(String str, long j, AFi1uSDK aFi1uSDK, String str2, AFe1iSDK<AFi1ySDK> aFe1iSDK) {
        getMediationNetwork(str, j, aFe1iSDK, aFe1iSDK != null ? aFe1iSDK.getBody() : null, aFi1uSDK, str2 != null ? str2 : null, null);
    }

    private void getMediationNetwork(String str, long j, AFe1iSDK<?> aFe1iSDK, AFi1ySDK aFi1ySDK, AFi1uSDK aFi1uSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        if (aFe1iSDK != null) {
            j2 = aFe1iSDK.getMonetizationNetwork.getCurrencyIso4217Code;
            i = aFe1iSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().getCurrencyIso4217Code;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.component4 = new AFi1xSDK(aFi1ySDK != null ? aFi1ySDK.getCurrencyIso4217Code : null, str, j2, System.currentTimeMillis() - j, i2, aFi1uSDK, str2, th2);
    }
}
