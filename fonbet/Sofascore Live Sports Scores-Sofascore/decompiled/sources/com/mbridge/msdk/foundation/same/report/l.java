package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class l {
    private final Map<String, String> a;
    private final String b;

    private l(b bVar) {
        this.b = bVar.b;
        this.a = bVar.a;
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e) {
            q0.b("SameCommonReporter", e.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.W, this.b);
            a(this.a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("SameCommonReporter", th.getMessage());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        private final Map<String, String> a = new HashMap();
        private final String b;

        public b(String str) {
            this.b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, C4427z5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
