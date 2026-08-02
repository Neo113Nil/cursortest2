package com.ironsource.sdk.controller;

import com.ironsource.C4452n4;
import com.ironsource.C4476oa;
import com.ironsource.C4494pa;
import com.ironsource.C4510q8;
import com.ironsource.C4671z8;
import com.ironsource.InterfaceC4458na;
import com.ironsource.Oc;
import com.ironsource.V5;
import com.ironsource.X5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class j {
    private final String a;
    private final X5 b;

    public j(String str, X5 x5) {
        this.a = str;
        this.b = x5;
    }

    private C4671z8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(V5.c.c) || !jSONObject.has("fileName")) {
            throw new Exception(V5.a.a);
        }
        String string = jSONObject.getString(V5.c.c);
        return new C4671z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    public void a(JSONObject jSONObject, InterfaceC4458na interfaceC4458na) {
        char c;
        C4476oa c4476oa = new C4476oa(jSONObject);
        C4494pa c4494pa = new C4494pa(interfaceC4458na);
        try {
            String b = c4476oa.b();
            JSONObject c2 = c4476oa.c();
            C4671z8 b2 = b(c2, this.a);
            IronSourceStorageUtils.ensurePathSafety(b2, this.a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(V5.b.a)) {
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
                    if (b.equals(V5.b.e)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 537556755:
                    if (b.equals(V5.b.f)) {
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
                    if (b.equals(V5.b.d)) {
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
                this.b.a(b2, c2.optString(V5.c.a), c2.optInt("connectionTimeout"), c2.optInt("readTimeout"), a(c4476oa, c4494pa));
                return;
            }
            if (c == 1) {
                this.b.a(b2);
                c4494pa.b(c4476oa, a(c4476oa, b2.a()));
                return;
            }
            if (c == 2) {
                this.b.b(b2);
                c4494pa.b(c4476oa, a(c4476oa, b2.a()));
                return;
            }
            if (c == 3) {
                c4494pa.b(c4476oa, a(c4476oa, this.b.c(b2)));
                return;
            }
            if (c == 4) {
                c4494pa.b(c4476oa, a(c4476oa, this.b.d(b2)));
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(b2, c2.optJSONObject(V5.c.g));
                c4494pa.b(c4476oa, a(c4476oa, b2.a()));
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
            c4494pa.a(c4476oa, a(c4476oa, e.getMessage()));
        }
    }

    public class a implements Oc {
        final /* synthetic */ C4494pa a;
        final /* synthetic */ C4476oa b;

        public a(C4494pa c4494pa, C4476oa c4476oa) {
            this.a = c4494pa;
            this.b = c4476oa;
        }

        @Override // com.ironsource.Oc
        public void a(C4671z8 c4671z8) {
            try {
                C4494pa c4494pa = this.a;
                C4476oa c4476oa = this.b;
                c4494pa.b(c4476oa, j.this.a(c4476oa, c4671z8.a()));
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C4671z8 c4671z8, C4510q8 c4510q8) {
            try {
                C4494pa c4494pa = this.a;
                C4476oa c4476oa = this.b;
                c4494pa.a(c4476oa, j.this.a(c4476oa, c4510q8.b()));
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Oc a(C4476oa c4476oa, C4494pa c4494pa) {
        return new a(c4494pa, c4476oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4476oa c4476oa, JSONObject jSONObject) {
        try {
            return c4476oa.e().put("result", jSONObject);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C4476oa c4476oa, long j) {
        try {
            return c4476oa.e().put("result", j);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4476oa c4476oa, String str) {
        try {
            return c4476oa.e().put("errMsg", str);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private C4671z8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(V5.c.d)) {
            return new C4671z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(V5.c.d)));
        }
        throw new Exception(V5.a.b);
    }
}
