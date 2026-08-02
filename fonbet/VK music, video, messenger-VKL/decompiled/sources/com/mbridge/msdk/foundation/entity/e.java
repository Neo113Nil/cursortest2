package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.sdk.OkListenerKt;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.h5s;

/* compiled from: ClickTime.java */
/* loaded from: classes13.dex */
public class e {
    private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private String l;
    private int m;
    private String n;
    private String o;
    private int p;
    private String q;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public void e(int i) {
        this.m = i;
    }

    public void f(int i) {
        this.p = i;
    }

    public String g() {
        return this.g;
    }

    public void h(String str) {
        this.l = str;
    }

    public void i(String str) {
        this.n = str;
    }

    public String j() {
        return this.j;
    }

    public void k(String str) {
        this.q = str;
    }

    public String l() {
        return this.l;
    }

    public int m() {
        return this.m;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.o;
    }

    public int p() {
        return this.p;
    }

    public String q() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.a);
        sb.append(", click_duration=");
        sb.append(this.b);
        sb.append(", lastUrl=");
        sb.append(this.j);
        sb.append(", code=");
        sb.append(this.e);
        sb.append(", excepiton=");
        sb.append(this.g);
        sb.append(", header=");
        sb.append(this.h);
        sb.append(", content=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.p);
        sb.append(", click_type=");
        return h5s.c(this.d, X3.j.e, sb);
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.k = i;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public void g(String str) {
        this.j = str;
    }

    public String h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public void j(String str) {
        this.o = str;
    }

    public int k() {
        return this.k;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(String str) {
        this.h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String j = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", j);
            jSONObject.put("code", eVar.e());
            jSONObject.put(OkListenerKt.KEY_EXCEPTION, eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(StatCustomFieldKey.NETWORK_TYPE, eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th) {
            q0.b("ClickTime", th.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put(OkListenerKt.KEY_EXCEPTION, eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put(StatCustomFieldKey.NETWORK_TYPE, eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String q = eVar.q();
                if (!TextUtils.isEmpty(q)) {
                    String str = com.mbridge.msdk.foundation.controller.a.r.get(q);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                q0.b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }
}
