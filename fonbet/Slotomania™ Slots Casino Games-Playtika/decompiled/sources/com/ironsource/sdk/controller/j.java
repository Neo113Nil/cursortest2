package com.ironsource.sdk.controller;

import com.ironsource.C2556n4;
import com.ironsource.C2562na;
import com.ironsource.C2580oa;
import com.ironsource.C2596p8;
import com.ironsource.C2757y8;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.Nc;
import com.ironsource.T5;
import com.ironsource.V5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes5.dex */
class j {
    private final String a;
    private final V5 b;

    j(String str, V5 v5) {
        this.a = str;
        this.b = v5;
    }

    private C2757y8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(T5.c.c) || !jSONObject.has(T5.c.b)) {
            throw new Exception(T5.a.a);
        }
        String string = jSONObject.getString(T5.c.c);
        return new C2757y8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(T5.c.b));
    }

    void a(JSONObject jSONObject, InterfaceC2544ma interfaceC2544ma) {
        char c;
        C2562na c2562na = new C2562na(jSONObject);
        C2580oa c2580oa = new C2580oa(interfaceC2544ma);
        try {
            String b = c2562na.b();
            JSONObject c2 = c2562na.c();
            C2757y8 b2 = b(c2, this.a);
            IronSourceStorageUtils.ensurePathSafety(b2, this.a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(T5.b.a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137024519:
                    if (b.equals("deleteFolder")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -318115535:
                    if (b.equals(T5.b.e)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 537556755:
                    if (b.equals(T5.b.f)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1764172231:
                    if (b.equals("deleteFile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953259713:
                    if (b.equals(T5.b.d)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(b2, c2.optString(T5.c.a), c2.optInt("connectionTimeout"), c2.optInt("readTimeout"), a(c2562na, c2580oa));
                return;
            }
            if (c == 1) {
                this.b.a(b2);
                c2580oa.b(c2562na, a(c2562na, b2.a()));
                return;
            }
            if (c == 2) {
                this.b.b(b2);
                c2580oa.b(c2562na, a(c2562na, b2.a()));
                return;
            }
            if (c == 3) {
                c2580oa.b(c2562na, a(c2562na, this.b.c(b2)));
                return;
            }
            if (c == 4) {
                c2580oa.b(c2562na, a(c2562na, this.b.d(b2)));
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(b2, c2.optJSONObject(T5.c.g));
                c2580oa.b(c2562na, a(c2562na, b2.a()));
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
            c2580oa.a(c2562na, a(c2562na, e.getMessage()));
        }
    }

    class a implements Nc {
        final /* synthetic */ C2580oa a;
        final /* synthetic */ C2562na b;

        a(C2580oa c2580oa, C2562na c2562na) {
            this.a = c2580oa;
            this.b = c2562na;
        }

        @Override // com.ironsource.Nc
        public void a(C2757y8 c2757y8) {
            try {
                C2580oa c2580oa = this.a;
                C2562na c2562na = this.b;
                c2580oa.b(c2562na, j.this.a(c2562na, c2757y8.a()));
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C2757y8 c2757y8, C2596p8 c2596p8) {
            try {
                C2580oa c2580oa = this.a;
                C2562na c2562na = this.b;
                c2580oa.a(c2562na, j.this.a(c2562na, c2596p8.b()));
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Nc a(C2562na c2562na, C2580oa c2580oa) {
        return new a(c2580oa, c2562na);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C2562na c2562na, JSONObject jSONObject) {
        try {
            return c2562na.e().put("result", jSONObject);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    private JSONObject a(C2562na c2562na, long j) {
        try {
            return c2562na.e().put("result", j);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C2562na c2562na, String str) {
        try {
            return c2562na.e().put("errMsg", str);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    private C2757y8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(T5.c.d)) {
            return new C2757y8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(T5.c.d)));
        }
        throw new Exception(T5.a.b);
    }
}
