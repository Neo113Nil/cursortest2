package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: SameCommonReporter.java */
/* loaded from: classes13.dex */
public class l {
    private final Map<String, String> a;
    private final String b;

    /* compiled from: SameCommonReporter.java */
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
            jSONObject.put("key", this.b);
            a(this.a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("SameCommonReporter", th.getMessage());
        }
    }

    private l(b bVar) {
        this.b = bVar.b;
        this.a = bVar.a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, B5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
