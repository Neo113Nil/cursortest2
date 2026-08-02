package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class akg {
    public final lgg a;
    public final String b;
    public final jod c;
    public final String d;
    public final qc4 e;
    public final zjg f;

    public akg(Context context, lgg lggVar, zjg zjgVar) {
        jod W = hkg.W();
        qc4 qc4Var = new qc4(context, 2);
        this.a = lggVar;
        this.b = "https://mobileconfig.sascdn.com/api/config/VERSIONID_PLACEHOLDER/SITEID_PLACEHOLDER".replace("VERSIONID_PLACEHOLDER", "3131");
        this.d = "SCSRemoteConfig3131";
        this.c = W;
        this.e = qc4Var;
        this.f = zjgVar;
    }

    public static void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = null;
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!next.equals("TTL") && !next.equals("smart") && (obj instanceof JSONObject)) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(next, mha.v((JSONObject) obj));
            }
        }
    }

    public final void b(Exception exc) {
        this.a.a.c(exc, false);
    }

    public final void c(JSONObject jSONObject, int i, boolean z) {
        lgg lggVar = this.a;
        try {
            zjg a = zjg.a(jSONObject);
            qc4 qc4Var = this.e;
            if (qc4Var != null && z) {
                String str = this.d + "-" + i;
                long j = a.a * 1000;
                if (j > 604800000) {
                    fjg.c().f(1);
                    j = 604800000;
                }
                jSONObject.put("expirationDate", System.currentTimeMillis() + j);
                String jSONObject2 = jSONObject.toString();
                Context context = qc4Var.b;
                SharedPreferences.Editor edit = context.getSharedPreferences(a5f.e(context), 0).edit();
                edit.putString(str, jSONObject2);
                edit.apply();
            }
            xw3.L(s9a.c(z45.a), null, null, new gje(lggVar.a, a, null, 29), 3);
            mha.v(jSONObject.getJSONObject("smart"));
            a(jSONObject);
        } catch (Exception unused) {
            b(new wo0(dmi.q("Invalid remote configuration: ", jSONObject.toString())));
        }
    }
}
