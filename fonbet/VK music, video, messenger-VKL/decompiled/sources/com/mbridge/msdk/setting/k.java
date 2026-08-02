package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.core.network.model.HttpRequest;
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dq;
import xsna.oyh0;

/* compiled from: SettingRequestController.java */
/* loaded from: classes14.dex */
public class k {
    private static final String b = "k";
    private String a;

    /* compiled from: SettingRequestController.java */
    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e) {
                q0.b(k.b, e.getMessage());
            }
        }
    }

    /* compiled from: SettingRequestController.java */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        public c(Context context, String str, String str2) {
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = false;
            oyh0.a("fetch CNDSettingHost failed, errorCode = ", str, k.b);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(k.b, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().x.add(str2.trim());
                }
            }
            k.this.a(this.b, this.c, this.d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().s && com.mbridge.msdk.foundation.same.net.utils.d.h().r && com.mbridge.msdk.foundation.same.net.utils.d.h().w < com.mbridge.msdk.foundation.same.net.utils.d.h().x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                        }
                    }
                    return str2.concat("/setting");
                }
            }
        } catch (Throwable th) {
            q0.b(b, th.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th) {
            q0.b(b, th.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + TimeUtils.MILLISECONDS_PER_DAY) {
                String a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(a2)) {
                    for (String str3 : a2.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", 60000L);
        } catch (Throwable th) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = false;
            q0.b(b, th.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.W++;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g d2 = i.b().d(str);
            String B0 = d2.B0();
            if (TextUtils.isEmpty(B0)) {
                B0 = "";
            }
            eVar.a("vtag", B0);
            eVar.a("current_pipeline_id", String.valueOf(d2.b0()));
            eVar.a("p_p_c_id", String.valueOf(d2.f0()));
            eVar.a("c_m_l_id", String.valueOf(d2.o()));
            eVar.a("csi", com.mbridge.msdk.foundation.same.report.metrics.d.b().d());
            eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
            eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
            eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
            String a2 = d2.a();
            this.a = a2;
            eVar.a("a_stid", TextUtils.isEmpty(a2) ? "" : this.a);
        } catch (Throwable th) {
            q0.b(b, th.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().s && com.mbridge.msdk.foundation.same.net.utils.d.h().r && com.mbridge.msdk.foundation.same.net.utils.d.h().w < com.mbridge.msdk.foundation.same.net.utils.d.h().x.size()) {
                String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().w);
                if (!TextUtils.isEmpty(str5)) {
                    if (!str5.startsWith("http")) {
                        if (str5.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                        }
                    }
                    str4 = str5.concat("/setting");
                }
            }
        } catch (Throwable th2) {
            q0.b(b, th2.getMessage());
        }
        cVar.get(1, str4, eVar, dVar, "setting", 60000L);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        String md5 = SameMD5.getMD5(v0.d());
        a(context, str, str2, "0", new b(md5, i.b().h(str), str, md5, context, str2));
        a(3, 0, "");
    }

    /* compiled from: SettingRequestController.java */
    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    String optString = jSONObject.optString("vtag", "");
                    String optString2 = jSONObject.optString("rid", "");
                    JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String f = i.b().f(this.b, this.c);
                            if (!TextUtils.isEmpty(f)) {
                                try {
                                    optJSONObject = i.b().a(new JSONObject(f), optJSONObject);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        optJSONObject.put("current_time", System.currentTimeMillis());
                        optJSONObject.put("vtag", optString);
                        optJSONObject.put("rid", optString2);
                        i.b().a(this.b, this.c, optJSONObject.toString());
                    }
                } else {
                    i.b().j(this.b, this.c);
                }
                k.this.a(1, 1, "");
            } catch (Exception e2) {
                q0.b(k.b, e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            k.this.a(2, 1, "");
        }
    }

    /* compiled from: SettingRequestController.java */
    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Context d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, Context context, String str5) {
            super(str, str2);
            this.b = str3;
            this.c = str4;
            this.d = context;
            this.e = str5;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:5|(13:47|48|8|(2:12|13)|17|(2:19|(1:21))(2:44|(1:46))|22|23|24|(1:26)|28|(1:30)|31)|7|8|(3:10|12|13)|17|(0)(0)|22|23|24|(0)|28|(0)|31) */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        
            com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.setting.k.b, r1.getMessage());
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[Catch: Exception -> 0x0038, TryCatch #3 {Exception -> 0x0038, blocks: (B:3:0x000b, B:5:0x0011, B:8:0x003c, B:10:0x0045, B:16:0x005a, B:17:0x0065, B:19:0x0079, B:21:0x0083, B:22:0x00a0, B:28:0x00e0, B:30:0x00ea, B:31:0x00f7, B:32:0x010a, B:43:0x00d5, B:44:0x008d, B:46:0x0097, B:51:0x002c, B:52:0x0101, B:48:0x0025, B:13:0x004b, B:24:0x00bc, B:26:0x00c6), top: B:2:0x000b, inners: #1, #2, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #4 {Exception -> 0x00d4, blocks: (B:24:0x00bc, B:26:0x00c6), top: B:23:0x00bc, outer: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ea A[Catch: Exception -> 0x0038, TryCatch #3 {Exception -> 0x0038, blocks: (B:3:0x000b, B:5:0x0011, B:8:0x003c, B:10:0x0045, B:16:0x005a, B:17:0x0065, B:19:0x0079, B:21:0x0083, B:22:0x00a0, B:28:0x00e0, B:30:0x00ea, B:31:0x00f7, B:32:0x010a, B:43:0x00d5, B:44:0x008d, B:46:0x0097, B:51:0x002c, B:52:0x0101, B:48:0x0025, B:13:0x004b, B:24:0x00bc, B:26:0x00c6), top: B:2:0x000b, inners: #1, #2, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008d A[Catch: Exception -> 0x0038, TryCatch #3 {Exception -> 0x0038, blocks: (B:3:0x000b, B:5:0x0011, B:8:0x003c, B:10:0x0045, B:16:0x005a, B:17:0x0065, B:19:0x0079, B:21:0x0083, B:22:0x00a0, B:28:0x00e0, B:30:0x00ea, B:31:0x00f7, B:32:0x010a, B:43:0x00d5, B:44:0x008d, B:46:0x0097, B:51:0x002c, B:52:0x0101, B:48:0x0025, B:13:0x004b, B:24:0x00bc, B:26:0x00c6), top: B:2:0x000b, inners: #1, #2, #4 }] */
        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            try {
                if (v0.a(jSONObject)) {
                    boolean d = h.d(jSONObject);
                    String g = i.b().g(this.b);
                    if (!TextUtils.isEmpty(g)) {
                        try {
                            jSONObject2 = new JSONObject(g);
                        } catch (Exception e) {
                            q0.b(k.b, e.getMessage());
                        }
                        if (jSONObject.optInt("vtag_status", 0) == 1 && !TextUtils.isEmpty(g)) {
                            try {
                                jSONObject = i.b().a(new JSONObject(g), jSONObject);
                            } catch (Exception e2) {
                                q0.b(k.b, e2.getMessage());
                            }
                        }
                        l.a(jSONObject);
                        jSONObject.put("current_time", System.currentTimeMillis());
                        if (com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                            if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                                jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().i);
                            }
                        } else if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().m);
                        }
                        h.b(jSONObject, jSONObject2, this.c, d);
                        i.b().h(this.b, jSONObject.toString());
                        com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                        l.a();
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.d, jSONObject.optString("mraid_js"));
                        }
                        if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                            com.mbridge.msdk.setting.util.b.c().a(this.d, jSONObject.optString("web_env_url"));
                        }
                        k.this.a(this.d, this.b);
                    }
                    jSONObject2 = null;
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        jSONObject = i.b().a(new JSONObject(g), jSONObject);
                    }
                    l.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                    }
                    h.b(jSONObject, jSONObject2, this.c, d);
                    i.b().h(this.b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    l.a();
                    if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                    }
                    k.this.a(this.d, this.b);
                } else {
                    i.b().l(this.b);
                }
                k.this.c();
            } catch (Exception e3) {
                q0.b(k.b, e3.getMessage());
            }
            try {
                k.this.a(1, 0, "");
            } catch (Throwable th) {
                q0.b(k.b, th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                k.this.a(2, 0, str);
            } catch (Throwable th) {
                q0.b(k.b, th.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().w++;
            }
            k.this.a(this.d, this.b, this.e);
            k.this.c();
            dq.i("get app setting error", str, k.b);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (i.b().g(str3, str) && i.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = X3.j.d + str3 + X3.j.e;
            eVar.a("unit_ids", str4);
            eVar.a("app_id", str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String J = i.b().d(str, str4).J();
                if (TextUtils.isEmpty(J)) {
                    J = "";
                }
                eVar.a("vtag", J);
            } catch (Throwable th) {
                q0.b(b, th.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", 60000L);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g f;
        i b2 = i.b();
        if (b2 != null && (f = b2.f(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = f.W();
            MBridgeConstans.OMID_JS_H5_URL = f.V();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, String str) {
        String str2;
        g f;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().t));
            eVar.a("result", Integer.valueOf(i));
            eVar.a("type", Integer.valueOf(i2));
            if (i2 == 0) {
                str2 = b();
                eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
                eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
                eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
                String str3 = "";
                eVar.a("a_stid", TextUtils.isEmpty(this.a) ? "" : this.a);
                if (i == 2 && (f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b())) != null) {
                    String a2 = f.a();
                    if (!TextUtils.isEmpty(a2)) {
                        str3 = a2;
                    }
                    eVar.a("a_stid_n", str3);
                }
            } else {
                str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", str2);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th) {
            q0.b(b, th.getMessage());
        }
    }
}
