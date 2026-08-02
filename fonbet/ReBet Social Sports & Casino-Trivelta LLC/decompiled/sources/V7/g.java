package V7;

import T7.C1678s;
import a8.C1923a;
import g6.C4331C;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12577a = new g();

    public static final void d() {
        if (C4331C.p()) {
            C1678s c1678s = C1678s.f11164a;
            C1678s.a(C1678s.b.CrashReport, new C1678s.a() { // from class: V7.d
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            C1678s.a(C1678s.b.ErrorReport, new C1678s.a() { // from class: V7.e
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            C1678s.a(C1678s.b.AnrReport, new C1678s.a() { // from class: V7.f
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    public static final void e(boolean z10) {
        if (z10) {
            X7.c.f13617b.c();
            C1678s c1678s = C1678s.f11164a;
            if (C1678s.g(C1678s.b.CrashShield)) {
                b.b();
                Y7.a.a();
            }
            if (C1678s.g(C1678s.b.ThreadCheck)) {
                C1923a.a();
            }
        }
    }

    public static final void f(boolean z10) {
        if (z10) {
            Z7.e.d();
        }
    }

    public static final void g(boolean z10) {
        if (z10) {
            W7.e.c();
        }
    }
}
