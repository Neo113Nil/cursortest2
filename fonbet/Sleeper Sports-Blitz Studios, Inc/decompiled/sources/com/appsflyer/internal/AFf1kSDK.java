package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.facebook.common.util.UriUtil;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class AFf1kSDK extends AFe1bSDK<Map<String, Object>> {
    private static final int component1 = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1pSDK areAllFieldsValid;
    private Map<String, Object> component2;
    private final Uri component3;
    private final AFc1kSDK component4;
    private final List<String> equals;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFf1kSDK(AFc1kSDK aFc1kSDK, AFc1pSDK aFc1pSDK, Uri uri, List<String> list) {
        super(AFf1wSDK.RESOLVE_ESP, new AFf1wSDK[]{AFf1wSDK.RC_CDN}, "ResolveEsp");
        this.component4 = aFc1kSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.component3 = uri;
        this.equals = list;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() throws Exception {
        Integer num = null;
        if (!getCurrencyIso4217Code(this.component3.toString())) {
            this.component4.r_(this.areAllFieldsValid, this.component3, null);
            return AFe1dSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.component3.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> t_ = t_(Uri.parse(obj));
            String str2 = (String) t_.get(UriUtil.LOCAL_RESOURCE_SCHEME);
            Integer num2 = (Integer) t_.get("status");
            String str3 = (String) t_.get("error");
            if (str2 == null || !getCurrencyIso4217Code(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UriUtil.LOCAL_RESOURCE_SCHEME, obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.areAllFieldsValid) {
            this.areAllFieldsValid.AFAdRevenueData("af_deeplink_r", hashMap);
            this.areAllFieldsValid.AFAdRevenueData("af_deeplink", this.component3.toString());
        }
        this.component4.r_(this.areAllFieldsValid, obj != null ? Uri.parse(obj) : this.component3, this.component3);
        this.component2 = hashMap;
        return AFe1dSDK.SUCCESS;
    }

    private static Map<String, Object> t_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = component1;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.15.1");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put(UriUtil.LOCAL_RESOURCE_SCHEME, httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return hashMap;
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return hashMap;
        }
    }

    private boolean getCurrencyIso4217Code(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.equals);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
