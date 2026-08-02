package defpackage;

import android.os.Bundle;
import com.facebook.internal.k0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o4h {
    public static boolean b;
    public static final o4h a = new o4h();
    public static HashSet c = new HashSet();
    public static HashMap d = new HashMap();

    public static final void b(Bundle bundle, String str) {
        if (cw3.a.contains(o4h.class)) {
            return;
        }
        try {
            str.getClass();
            if (b && bundle != null) {
                if (!c.isEmpty() || d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) d.get(str);
                        Iterator it = new ArrayList(bundle.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            o4h o4hVar = a;
                            str2.getClass();
                            if (!cw3.a.contains(o4hVar)) {
                                try {
                                    if (c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th) {
                                    cw3.a(o4hVar, th);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            cw3.a(o4h.class, th2);
        }
    }

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
                c = new HashSet();
                d = new HashMap();
                JSONArray jSONArray = k.q;
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
                        if (jSONArray2 != null && (e = k0.e(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                c = e;
                            } else {
                                d.put(string, e);
                            }
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
