package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import org.json.JSONObject;

/* compiled from: MetricsReportUtil.java */
/* loaded from: classes13.dex */
public class f {
    private static volatile f b;
    private volatile com.mbridge.msdk.tracker.m a;

    public static f a() {
        if (b == null) {
            synchronized (f.class) {
                try {
                    if (b == null) {
                        b = new f();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public com.mbridge.msdk.tracker.m b() {
        if (this.a == null) {
            this.a = com.mbridge.msdk.foundation.same.report.metrics.d.b().e();
        }
        return this.a;
    }

    public void c() {
        b().a();
    }

    public void a(Context context, String str, String str2, String str3, String str4, int i) {
        com.mbridge.msdk.tracker.m b2 = a().b();
        if (b2 == null) {
            return;
        }
        if (!b2.a("2000105")) {
            q0.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, B5.O));
            }
            jSONObject.put("type", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] e = b2.e();
                jSONObject.put("track_time", e[0]);
                jSONObject.put("track_count", e[1]);
                jSONObject.put("session_id", b2.d());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, B5.O));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("2000105");
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
            eVar.a(c.d());
            b2.d(eVar);
        } catch (Exception e2) {
            q0.b("MetricsReportUtil", e2.getMessage());
        }
    }
}
