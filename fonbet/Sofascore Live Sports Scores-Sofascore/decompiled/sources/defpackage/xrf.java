package defpackage;

import com.facebook.internal.k0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xrf {
    public static boolean b;
    public static final xrf a = new xrf();
    public static HashMap c = new HashMap();

    public final void a() {
        HashSet e;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            u k = x.k(w.b(), false);
            if (k == null) {
                return;
            }
            try {
                c = new HashMap();
                JSONArray jSONArray = k.p;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean has = jSONObject.has(U3.i.W);
                    boolean has2 = jSONObject.has(U3.i.X);
                    if (has && has2) {
                        String string = jSONObject.getString(U3.i.W);
                        JSONArray jSONArray2 = jSONObject.getJSONArray(U3.i.X);
                        if (string != null && (e = k0.e(jSONArray2)) != null) {
                            c.put(string, e);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
