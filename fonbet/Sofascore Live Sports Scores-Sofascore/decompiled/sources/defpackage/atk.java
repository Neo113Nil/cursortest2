package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.b;
import com.facebook.d0;
import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class atk {
    public static final String e;
    public final WeakReference b;
    public Timer c;
    public String d = null;
    public final Handler a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = atk.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        e = canonicalName;
    }

    public atk(Activity activity) {
        this.b = new WeakReference(activity);
    }

    public static final String a() {
        if (cw3.a.contains(atk.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            cw3.a(atk.class, th);
            return null;
        }
    }

    public final void b(d0 d0Var, String str) {
        Set set = cw3.a;
        if (set.contains(this) || d0Var == null) {
            return;
        }
        try {
            g0 c = d0Var.c();
            try {
                JSONObject jSONObject = c.b;
                if (jSONObject == null) {
                    Objects.toString(c.c);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    b bVar = a0.a;
                    synchronized (w.b) {
                    }
                    this.d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(m03.class)) {
                        return;
                    }
                    try {
                        m03.g.set(z);
                    } catch (Throwable th) {
                        cw3.a(m03.class, th);
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public final void c() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            try {
                w.c().execute(new ecg(25, this, new scg(this, 5)));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
