package i6;

import T7.A;
import T7.C1662b;
import T7.C1682w;
import T7.Y;
import android.app.Activity;
import g6.C4331C;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f48120a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final String f48121b = b.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f48122c;

    public static final void b() {
        try {
            if (Y7.a.d(b.class)) {
                return;
            }
            try {
                C4331C.t().execute(new Runnable() { // from class: i6.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                Y y10 = Y.f11042a;
                Y.j0(f48121b, e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public static final void c() {
        if (Y7.a.d(b.class)) {
            return;
        }
        try {
            if (C1662b.f11059f.h(C4331C.l())) {
                return;
            }
            f48120a.e();
            f48122c = true;
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (Y7.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f48122c && !d.f48124d.c().isEmpty()) {
                    f.f48131e.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public final void e() {
        String k10;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            A a10 = A.f10965a;
            C1682w q10 = A.q(C4331C.m(), false);
            if (q10 == null || (k10 = q10.k()) == null) {
                return;
            }
            d.f48124d.d(k10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
