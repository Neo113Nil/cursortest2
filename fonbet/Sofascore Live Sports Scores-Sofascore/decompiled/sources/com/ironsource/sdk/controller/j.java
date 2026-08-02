package com.ironsource.sdk.controller;

import com.ironsource.C4157k4;
import com.ironsource.C4215n8;
import com.ironsource.C4217na;
import com.ironsource.C4235oa;
import com.ironsource.C4376w8;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.Nc;
import com.ironsource.S5;
import com.ironsource.U5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import defpackage.ogj;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class j {
    private final String a;
    private final U5 b;

    public j(String str, U5 u5) {
        this.a = str;
        this.b = u5;
    }

    private C4376w8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(S5.c.c) || !jSONObject.has(S5.c.b)) {
            ogj.k(S5.a.a);
            return null;
        }
        String string = jSONObject.getString(S5.c.c);
        return new C4376w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(S5.c.b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public void a(JSONObject jSONObject, InterfaceC4199ma interfaceC4199ma) {
        C4217na c4217na = new C4217na(jSONObject);
        C4235oa c4235oa = new C4235oa(interfaceC4199ma);
        try {
            String b = c4217na.b();
            JSONObject c = c4217na.c();
            C4376w8 b2 = b(c, this.a);
            IronSourceStorageUtils.ensurePathSafety(b2, this.a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(S5.b.a)) {
                        this.b.a(b2, c.optString(S5.c.a), c.optInt("connectionTimeout"), c.optInt("readTimeout"), a(c4217na, c4235oa));
                        break;
                    }
                    break;
                case -1137024519:
                    if (b.equals("deleteFolder")) {
                        this.b.b(b2);
                        c4235oa.b(c4217na, a(c4217na, b2.a()));
                        break;
                    }
                    break;
                case -318115535:
                    if (b.equals(S5.b.e)) {
                        c4235oa.b(c4217na, a(c4217na, this.b.d(b2)));
                        break;
                    }
                    break;
                case 537556755:
                    if (b.equals(S5.b.f)) {
                        this.b.a(b2, c.optJSONObject(S5.c.g));
                        c4235oa.b(c4217na, a(c4217na, b2.a()));
                        break;
                    }
                    break;
                case 1764172231:
                    if (b.equals("deleteFile")) {
                        this.b.a(b2);
                        c4235oa.b(c4217na, a(c4217na, b2.a()));
                        break;
                    }
                    break;
                case 1953259713:
                    if (b.equals(S5.b.d)) {
                        c4235oa.b(c4217na, a(c4217na, this.b.c(b2)));
                        break;
                    }
                    break;
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
            c4235oa.a(c4217na, a(c4217na, e.getMessage()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Nc {
        final /* synthetic */ C4235oa a;
        final /* synthetic */ C4217na b;

        public a(C4235oa c4235oa, C4217na c4217na) {
            this.a = c4235oa;
            this.b = c4217na;
        }

        @Override // com.ironsource.Nc
        public void a(C4376w8 c4376w8) {
            try {
                C4235oa c4235oa = this.a;
                C4217na c4217na = this.b;
                c4235oa.b(c4217na, j.this.a(c4217na, c4376w8.a()));
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C4376w8 c4376w8, C4215n8 c4215n8) {
            try {
                C4235oa c4235oa = this.a;
                C4217na c4217na = this.b;
                c4235oa.a(c4217na, j.this.a(c4217na, c4215n8.b()));
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Nc a(C4217na c4217na, C4235oa c4235oa) {
        return new a(c4235oa, c4217na);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4217na c4217na, JSONObject jSONObject) {
        try {
            return c4217na.e().put("result", jSONObject);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C4217na c4217na, long j) {
        try {
            return c4217na.e().put("result", j);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4217na c4217na, String str) {
        try {
            return c4217na.e().put("errMsg", str);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private C4376w8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(S5.c.d)) {
            return new C4376w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(S5.c.d)));
        }
        ogj.k(S5.a.b);
        return null;
    }
}
