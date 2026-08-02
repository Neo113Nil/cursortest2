package defpackage;

import com.facebook.internal.k0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o2g {
    public static boolean b;
    public static final o2g a = new o2g();
    public static final ArrayList c = new ArrayList();
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (!cw3.a.contains(this)) {
            try {
                Iterator it = new ArrayList(c).iterator();
                while (it.hasNext()) {
                    n2g n2gVar = (n2g) it.next();
                    if (n2gVar != null && Intrinsics.c(str, n2gVar.a)) {
                        for (String str3 : n2gVar.b.keySet()) {
                            if (Intrinsics.c(str2, str3)) {
                                return (String) n2gVar.b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = d;
        ArrayList arrayList = c;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            u k = x.k(w.b(), false);
            if (k != null && (str = k.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        next.getClass();
                        HashMap hashMap = new HashMap();
                        n2g n2gVar = new n2g();
                        n2gVar.a = next;
                        n2gVar.b = hashMap;
                        if (optJSONObject != null) {
                            n2gVar.b = k0.h(optJSONObject);
                            arrayList.add(n2gVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
