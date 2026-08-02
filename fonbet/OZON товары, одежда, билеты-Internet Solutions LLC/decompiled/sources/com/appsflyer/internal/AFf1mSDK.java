package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import g.C6594f;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class AFf1mSDK extends AFe1eSDK<Map<String, Object>> {
    private static final int registerClient = (int) TimeUnit.SECONDS.toMillis(2);
    private final Uri AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f57427d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f57428e;

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f57429i;
    private final AFc1pSDK unregisterClient;

    public AFf1mSDK(@NonNull Context context, @NonNull AFc1pSDK aFc1pSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.f57428e = context;
        this.unregisterClient = aFc1pSDK;
        this.AFLogger = uri;
        this.f57429i = list;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder b11 = C6594f.b("Validate if link ", str, " belongs to ESP domains: ");
        b11.append(this.f57429i);
        AFLogger.afRDLog(b11.toString());
        try {
            return this.f57429i.contains(new URL(str).getHost());
        } catch (MalformedURLException e11) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e11);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1dSDK values() throws Exception {
        Integer num = null;
        if (!AFKeystoreWrapper(this.AFLogger.toString())) {
            AFb1tSDK.valueOf().values(this.f57428e, this.unregisterClient, this.AFLogger, null);
            return AFe1dSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.AFLogger.toString();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        String str = null;
        while (i11 < 5) {
            Map<String, Object> values = values(Uri.parse(obj));
            String str2 = (String) values.get("res");
            Integer num2 = (Integer) values.get("status");
            String str3 = (String) values.get("error");
            if (str2 == null || !AFKeystoreWrapper(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i11 < 4) {
                arrayList.add(str2);
            }
            i11++;
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
        synchronized (this.unregisterClient) {
            this.unregisterClient.AFKeystoreWrapper("af_deeplink_r", hashMap);
            this.unregisterClient.AFKeystoreWrapper("af_deeplink", this.AFLogger.toString());
        }
        AFb1tSDK.valueOf().values(this.f57428e, this.unregisterClient, obj != null ? Uri.parse(obj) : this.AFLogger, this.AFLogger);
        this.f57427d = hashMap;
        return AFe1dSDK.SUCCESS;
    }

    private static Map<String, Object> values(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i11 = registerClient;
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.13.1");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
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
}
