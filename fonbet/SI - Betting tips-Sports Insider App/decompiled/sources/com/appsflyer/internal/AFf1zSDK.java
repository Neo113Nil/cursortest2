package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFf1zSDK extends AFe1mSDK<Map<String, Object>> {
    private static final int component2 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1mSDK component1;
    private final AFa1jSDK component3;
    private final Uri component4;
    private final List<String> copy;

    public AFf1zSDK(AFa1mSDK aFa1mSDK, @NonNull AFa1jSDK aFa1jSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1pSDK.RESOLVE_ESP, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1mSDK;
        this.component3 = aFa1jSDK;
        this.component4 = uri;
        this.copy = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder p10 = d9.e.p("Validate if link ", str, " belongs to ESP domains: ");
        p10.append(this.copy);
        AFLogger.afRDLog(p10.toString());
        try {
            return this.copy.contains(new URL(str).getHost());
        } catch (MalformedURLException e7) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e7);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i5 = component2;
            httpURLConnection.setReadTimeout(i5);
            httpURLConnection.setConnectTimeout(i5);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.5");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put(PredictionTable.statusColumn, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return hashMap;
        } catch (Throwable th2) {
            hashMap.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return hashMap;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @NonNull
    public final AFe1uSDK getRevenue() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component4.toString())) {
            this.component1.j_(this.component3, this.component4, null);
            return AFe1uSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        String str = null;
        while (i5 < 5) {
            Map<String, Object> r_ = r_(Uri.parse(obj));
            String str2 = (String) r_.get("res");
            Integer num2 = (Integer) r_.get(PredictionTable.statusColumn);
            String str3 = (String) r_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i5 < 4) {
                arrayList.add(str2);
            }
            i5++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put(PredictionTable.statusColumn, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.component3) {
            this.component3.getRevenue("af_deeplink_r", hashMap);
            this.component3.getRevenue("af_deeplink", this.component4.toString());
        }
        this.component1.j_(this.component3, obj != null ? Uri.parse(obj) : this.component4, this.component4);
        this.areAllFieldsValid = hashMap;
        return AFe1uSDK.SUCCESS;
    }
}
