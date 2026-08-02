package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class AFf1wSDK extends AFe1tSDK<Map<String, Object>> {
    private static final int component3 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1kSDK component1;
    private final AFa1oSDK component2;
    private final Uri component4;
    private final List<String> copydefault;

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 60000L;
    }

    public AFf1wSDK(AFa1oSDK aFa1oSDK, AFa1kSDK aFa1kSDK, Uri uri, List<String> list) {
        super(AFe1uSDK.RESOLVE_ESP, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, "ResolveEsp");
        this.component2 = aFa1oSDK;
        this.component1 = aFa1kSDK;
        this.component4 = uri;
        this.copydefault = list;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        Integer num = null;
        if (!getRevenue(this.component4.toString())) {
            this.component2.i_(this.component1, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> r_ = r_(Uri.parse(obj));
            String str2 = (String) r_.get("res");
            Integer num2 = (Integer) r_.get("status");
            String str3 = (String) r_.get("error");
            if (str2 == null || !getRevenue(str2)) {
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
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.component1) {
            this.component1.AFAdRevenueData("af_deeplink_r", hashMap);
            this.component1.AFAdRevenueData("af_deeplink", this.component4.toString());
        }
        this.component2.i_(this.component1, obj != null ? Uri.parse(obj) : this.component4, this.component4);
        this.areAllFieldsValid = hashMap;
        return AFe1rSDK.SUCCESS;
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = component3;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.16.2");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
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

    private boolean getRevenue(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate if link ").append(str).append(" belongs to ESP domains: ").append(this.copydefault).toString());
        try {
            return this.copydefault.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
