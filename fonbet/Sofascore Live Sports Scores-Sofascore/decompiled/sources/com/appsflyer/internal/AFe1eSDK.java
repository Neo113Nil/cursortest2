package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.wt3;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1vSDK<Map<String, Object>> {
    private static final int registerClient = 2000;
    private final List<String> e;
    private Map<String, Object> force;
    private final AFa1hSDK i;
    private final Uri v;
    private final AFa1mSDK w;

    public AFe1eSDK(@NonNull AFa1mSDK aFa1mSDK, @NonNull AFa1hSDK aFa1hSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1aSDK.e, new AFe1zSDK[]{AFd1aSDK.registerClient}, "ResolveEsp");
        this.w = aFa1mSDK;
        this.i = aFa1hSDK;
        this.v = uri;
        this.e = list;
    }

    private boolean AFLogger(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        StringBuilder q = wt3.q("Validate if link ", str, " belongs to ESP domains: ");
        q.append(this.e);
        aFLogger.v(logTag, q.toString());
        try {
            return this.e.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.INSTANCE.e(LogTag.DDL, "MalformedURLException ESP link", e, false, false);
            return false;
        }
    }

    private static Map<String, Object> w_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            aFLogger.d(logTag, sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = registerClient;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "7.0.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            aFLogger.d(logTag, "ESP deeplink resolving is finished");
            return hashMap;
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.INSTANCE.e(LogTag.DDL, th.getMessage() != null ? th.getMessage() : "Error resolving ESP deeplink", th);
            return hashMap;
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    @NonNull
    public final AFd1bSDK unregisterClient() throws Exception {
        Integer num = null;
        if (!AFLogger(this.v.toString())) {
            this.w.f_(this.i, this.v, null);
            return AFd1bSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.v.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> w_ = w_(Uri.parse(obj));
            String str2 = (String) w_.get("res");
            Integer num2 = (Integer) w_.get("status");
            String str3 = (String) w_.get("error");
            if (str2 == null || !AFLogger(str2)) {
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
        hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.i) {
            this.i.registerClient("af_deeplink_r", hashMap);
            this.i.registerClient("af_deeplink", this.v.toString());
        }
        this.w.f_(this.i, obj != null ? Uri.parse(obj) : this.v, this.v);
        this.force = hashMap;
        return AFd1bSDK.SUCCESS;
    }
}
