package defpackage;

import android.app.Activity;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hmi {
    public static final hmi a = new hmi();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (hmi.class) {
            if (cw3.a.contains(hmi.class)) {
                return;
            }
            try {
                w.c().execute(new x(24));
            } catch (Throwable th) {
                cw3.a(hmi.class, th);
            }
        }
    }

    public static final void d(Activity activity) {
        Set set = cw3.a;
        if (set.contains(hmi.class)) {
            return;
        }
        try {
            if (b.get()) {
                boolean z = false;
                if (!set.contains(it7.class)) {
                    try {
                        z = it7.g;
                    } catch (Throwable th) {
                        cw3.a(it7.class, th);
                    }
                }
                if (z) {
                    if (c.isEmpty()) {
                        if (!d.isEmpty()) {
                        }
                    }
                    HashMap hashMap = wtk.d;
                    yfa.K(activity);
                    return;
                }
            }
            HashMap hashMap2 = wtk.d;
            yfa.L(activity);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            cw3.a(hmi.class, th2);
        }
    }

    public final void b() {
        String str;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            u k = x.k(w.b(), false);
            if (k != null && (str = k.k) != null) {
                c(str);
                if (c.isEmpty() && d.isEmpty()) {
                    return;
                }
                File d2 = stc.d();
                if (d2 == null) {
                    return;
                }
                it7.q(d2);
                WeakReference weakReference = md.k;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void c(String str) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LinkedHashSet linkedHashSet = c;
                    String string = jSONArray.getString(i);
                    string.getClass();
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    LinkedHashSet linkedHashSet2 = d;
                    String string2 = jSONArray2.getString(i2);
                    string2.getClass();
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
