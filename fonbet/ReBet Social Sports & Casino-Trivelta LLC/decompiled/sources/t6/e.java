package t6;

import T7.A;
import T7.C1682w;
import android.app.Activity;
import g6.C4331C;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import q6.f;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f65698a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f65699b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f65700c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f65701d = new LinkedHashSet();

    public static final synchronized void b() {
        synchronized (e.class) {
            if (Y7.a.d(e.class)) {
                return;
            }
            try {
                C4331C.t().execute(new Runnable() { // from class: t6.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c();
                    }
                });
            } catch (Throwable th2) {
                Y7.a.b(th2, e.class);
            }
        }
    }

    public static final void c() {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f65699b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f65698a.d();
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final boolean e(String event) {
        if (Y7.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f65701d.contains(event);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (Y7.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f65700c.contains(event);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (!f65699b.get() || !C6444a.f() || (f65700c.isEmpty() && f65701d.isEmpty())) {
                    g.f65703d.b(activity);
                    return;
                }
                g.f65703d.a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public final void d() {
        String p10;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            A a10 = A.f10965a;
            C1682w q10 = A.q(C4331C.m(), false);
            if (q10 != null && (p10 = q10.p()) != null) {
                g(p10);
                if (f65700c.isEmpty() && f65701d.isEmpty()) {
                    return;
                }
                q6.f fVar = q6.f.f63425a;
                File l10 = q6.f.l(f.a.MTML_APP_EVENT_PREDICTION);
                if (l10 == null) {
                    return;
                }
                C6444a.d(l10);
                Activity l11 = p6.f.l();
                if (l11 != null) {
                    h(l11);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set set = f65700c;
                    String string = jSONArray2.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                Set set2 = f65701d;
                String string2 = jSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
