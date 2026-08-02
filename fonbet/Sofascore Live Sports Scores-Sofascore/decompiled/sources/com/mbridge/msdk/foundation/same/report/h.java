package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.net.URLEncoder;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h {
    public static final String b = "h";
    private final Context a;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a() {
        try {
            if (j.a()) {
                String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(b2);
                if (f == null) {
                    f = com.mbridge.msdk.setting.i.b().a();
                }
                String d = com.mbridge.msdk.foundation.tools.g.d();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(U3.i.W, "2000053");
                jSONObject.put("Appid", b2);
                jSONObject.put("uptips2", f.x0());
                jSONObject.put("info_status", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().g());
                jSONObject.put("iseu", f.H());
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(L6.X0, d);
                }
                jSONObject.put("GDPR_area", f.K0());
                jSONObject.put("GDPR_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                j.c();
            }
        } catch (Throwable th) {
            q0.b(b, th.getMessage());
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(U3.i.W, URLEncoder.encode("2000066", C4427z5.O));
            jSONObject.put("rid", URLEncoder.encode(str, C4427z5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C4427z5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, C4427z5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C4427z5.O));
            jSONObject.put("err_method", str5);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e) {
            q0.b(b, e.getMessage());
        }
    }

    public h(Context context, int i) {
        this.a = context;
    }

    public void a(int i, int i2, String str, String str2, String str3) {
        i.a(this.a, i, i2, str, str2, str3);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(U3.i.W, URLEncoder.encode("2000065", C4427z5.O));
            jSONObject.put("rid", URLEncoder.encode(str, C4427z5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C4427z5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, C4427z5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C4427z5.O));
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, URLEncoder.encode(str5, C4427z5.O));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e) {
            q0.b(b, e.getMessage());
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        try {
            int s = m0.s(this.a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.W, URLEncoder.encode("2000071", C4427z5.O));
            jSONObject.put("rid", URLEncoder.encode(str, C4427z5.O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C4427z5.O));
            jSONObject.put(BidResponsedEx.KEY_CID, URLEncoder.encode(str3, C4427z5.O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C4427z5.O));
            jSONObject.put("reason", URLEncoder.encode(str5, C4427z5.O));
            jSONObject.put("network_type", URLEncoder.encode(String.valueOf(s), C4427z5.O));
            jSONObject.put("result", URLEncoder.encode("0", C4427z5.O));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e) {
            q0.b(b, e.getMessage());
        }
    }

    public void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        JSONObject a = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (a != null) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(a);
        }
    }

    public void a(int i, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(j.a((Campaign) null, i, "request"));
    }

    public void a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_type", "1");
            jSONObject.put(BidResponsedEx.KEY_CID, str);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put(U3.i.W, "2000027");
            jSONObject.put("http_url", str3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e) {
            q0.b(b, e.getMessage());
        }
    }
}
