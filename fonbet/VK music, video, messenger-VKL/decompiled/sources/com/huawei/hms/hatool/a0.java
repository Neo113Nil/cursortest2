package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class a0 implements g {
    private Context a = q0.i();
    private String b;
    private JSONObject c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Boolean h;

    public a0(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.b = str;
        this.c = jSONObject;
        this.d = str2;
        this.e = str3;
        this.f = String.valueOf(j);
        if (z.i(str2, "oper")) {
            p0 a = y.a().a(str2, j);
            this.g = a.a();
            this.h = Boolean.valueOf(a.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        v.a("hmsSdk", "Begin to run EventRecordTask...");
        int h = q0.h();
        int k = a1.k(this.d, this.e);
        if (c0.a(this.a, "stat_v2_1", h * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            v.c("hmsSdk", "stat sp file reach max limited size, delete it");
            d.a(this.a, "stat_v2_1", new String[0]);
            return;
        }
        b1 b1Var = new b1();
        b1Var.b(this.b);
        b1Var.a(this.c.toString());
        b1Var.d(this.e);
        b1Var.c(this.f);
        b1Var.f(this.g);
        Boolean bool = this.h;
        b1Var.e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject d = b1Var.d();
            String a = n1.a(this.d, this.e);
            String a2 = d.a(this.a, "stat_v2_1", a, "");
            try {
                jSONArray = !TextUtils.isEmpty(a2) ? new JSONArray(a2) : new JSONArray();
            } catch (JSONException unused) {
                v.d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(d);
            d.b(this.a, "stat_v2_1", a, jSONArray.toString());
            if (jSONArray.toString().length() > k * 1024) {
                e.a().a(this.d, this.e);
            }
        } catch (JSONException unused2) {
            v.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
