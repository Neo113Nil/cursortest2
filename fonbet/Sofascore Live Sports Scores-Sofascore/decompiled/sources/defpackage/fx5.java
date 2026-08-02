package defpackage;

import com.facebook.appevents.e;
import com.facebook.internal.k0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fx5 {
    public static boolean b;
    public static final fx5 a = new fx5();
    public static final ArrayList c = new ArrayList();
    public static final HashSet d = new HashSet();

    public static final void b(ArrayList arrayList) {
        if (cw3.a.contains(fx5.class)) {
            return;
        }
        try {
            if (b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (d.contains(((e) it.next()).e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            cw3.a(fx5.class, th);
        }
    }

    public final synchronized void a() {
        u k;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            k = x.k(w.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
            return;
        }
        if (k == null) {
            return;
        }
        String str = k.l;
        if (str != null && str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        HashSet hashSet = d;
                        next.getClass();
                        hashSet.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        next.getClass();
                        ArrayList arrayList = new ArrayList();
                        ex5 ex5Var = new ex5();
                        ex5Var.a = next;
                        ex5Var.b = arrayList;
                        if (optJSONArray != null) {
                            ex5Var.b = k0.f(optJSONArray);
                        }
                        c.add(ex5Var);
                    }
                }
            }
        }
    }
}
