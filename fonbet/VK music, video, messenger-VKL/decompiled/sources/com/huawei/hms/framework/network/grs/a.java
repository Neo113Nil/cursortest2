package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class a {
    private static final String e = "a";
    private final GrsBaseInfo a;
    private com.huawei.hms.framework.network.grs.e.a b;
    private g c;
    private com.huawei.hms.framework.network.grs.e.c d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    public static class C0153a implements com.huawei.hms.framework.network.grs.b {
        String a;
        Map<String, String> b;
        IQueryUrlsCallBack c;
        Context d;
        GrsBaseInfo e;
        com.huawei.hms.framework.network.grs.e.a f;

        public C0153a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = map;
            this.c = iQueryUrlsCallBack;
            this.d = context;
            this.e = grsBaseInfo;
            this.f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
                return;
            }
            if (this.b != null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                this.c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> a = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.a, true);
            if (a == null || a.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
            }
            if (a == null) {
                a = new ConcurrentHashMap<>();
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            this.c.onCallBackSuccess(a);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String j = dVar.j();
            Map<String, String> a = a.a(j, this.a);
            if (!a.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
                this.c.onCallBackSuccess(a);
                return;
            }
            Map<String, String> map = this.b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(this.b).toString()));
                this.c.onCallBackSuccess(this.b);
                return;
            }
            if (this.b != null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.a);
                this.c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(j)) {
                Logger.e(a.e, "The serviceName[%s] is not configured on the GRS server.", this.a);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> a2 = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.a, true);
            if (a2 == null || a2.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.a);
            }
            if (a2 == null) {
                a2 = new ConcurrentHashMap<>();
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.a, StringUtils.anonymizeMessage(new JSONObject(a2).toString()));
            this.c.onCallBackSuccess(a2);
        }
    }

    public static class b implements com.huawei.hms.framework.network.grs.b {
        String a;
        String b;
        IQueryUrlCallBack c;
        String d;
        Context e;
        GrsBaseInfo f;
        com.huawei.hms.framework.network.grs.e.a g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.a = str;
            this.b = str2;
            this.c = iQueryUrlCallBack;
            this.d = str3;
            this.e = context;
            this.f = grsBaseInfo;
            this.g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(this.d));
                this.c.onCallBackSuccess(this.d);
                return;
            }
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                this.c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String a = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.a, this.b, true);
            if (a == null || a.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(a));
            this.c.onCallBackSuccess(a);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String j = dVar.j();
            Map<String, String> a = a.a(j, this.a);
            if (a.containsKey(this.b)) {
                String str = a.e;
                String str2 = this.a;
                String str3 = this.b;
                Logger.i(str, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str2, str3, StringUtils.anonymizeMessage(a.get(str3)));
                this.c.onCallBackSuccess(a.get(this.b));
                return;
            }
            if (!TextUtils.isEmpty(this.d)) {
                String str4 = a.e;
                String str5 = this.a;
                String str6 = this.b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str5, str6, StringUtils.anonymizeMessage(a.get(str6)));
                this.c.onCallBackSuccess(this.d);
                return;
            }
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.a, this.b);
                this.c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(j)) {
                Logger.e(a.e, "The serviceName[%s][%s] is not configured on the GRS server.", this.a, this.b);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String a2 = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.a, this.b, true);
            if (a2 == null || a2.isEmpty()) {
                Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.a, this.b);
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.a, this.b, StringUtils.anonymizeMessage(a2));
            this.c.onCallBackSuccess(a2);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.a = grsBaseInfo;
        this.b = aVar;
        this.c = gVar;
        this.d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    public String a(Context context, String str, int i) {
        com.huawei.hms.framework.network.grs.g.d a = this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), str, this.d, i);
        return a == null ? "" : a.m() ? this.b.a().a(this.a.getGrsParasKey(true, true, context), "") : a.j();
    }

    public String a(String str, String str2, Context context, int i) {
        String str3;
        String str4;
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str5 = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(str5)) {
            Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str5));
            return str5;
        }
        String a = a(context, str, i);
        String str6 = a(a, str).get(str2);
        if (!TextUtils.isEmpty(str6)) {
            Logger.i(e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str6));
            return str6;
        }
        if (TextUtils.isEmpty(str5)) {
            if (!TextUtils.isEmpty(a)) {
                Logger.e(e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str7 = e;
            Logger.i(str7, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = str;
            str4 = str2;
            str5 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str3, str4, true);
            if (str5 == null || str5.isEmpty()) {
                Logger.e(str7, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str3, str4);
            }
        } else {
            str3 = str;
            str4 = str2;
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(str5));
        return str5;
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public Map<String, String> a(String str, Context context, int i) {
        String str2;
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a = a(str, bVar, context);
        if (bVar.a() && !a.isEmpty()) {
            Logger.i(e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            return a;
        }
        String a2 = a(context, str, i);
        Map<String, String> a3 = a(a2, str);
        if (!a3.isEmpty()) {
            Logger.i(e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a3).toString()));
            return a3;
        }
        if (a.isEmpty()) {
            if (!TextUtils.isEmpty(a2)) {
                Logger.e(e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str3 = e;
            Logger.i(str3, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            str2 = str;
            a = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str2, true);
            if (a == null || a.isEmpty()) {
                Logger.e(str3, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str2);
            }
        } else {
            str2 = str;
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str2, StringUtils.anonymizeMessage(a != null ? new JSONObject(a).toString() : ""));
        return a;
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a = this.b.a(this.a, str, bVar, context);
        if (a != null && !a.isEmpty()) {
            Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return a;
        }
        Map<String, String> a2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.b, this.a, str, false);
        Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return a2 != null ? a2 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e2) {
            Logger.w(e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a = a(str, bVar, context);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new C0153a(str, a, iQueryUrlsCallBack, context, this.a, this.b), str, this.d, i);
        } else if (a.isEmpty()) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(a);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.a, this.b), str, this.d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
