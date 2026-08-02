package X8;

import b9.C2413c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f13662a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f13663b = LazyKt.lazy(new Function0() { // from class: X8.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C2413c f10;
            f10 = u.f();
            return f10;
        }
    });

    public static final C2413c f() {
        return new C2413c(null, true, false, 4, null);
    }

    public static final void h() {
        f13662a.e().u(0.0f);
    }

    public static final void j() {
        f13662a.e().o();
    }

    public static final void l() {
        f13662a.e().p();
    }

    public final C2413c e() {
        return (C2413c) f13663b.getValue();
    }

    public final void g() {
        if (!f13663b.isInitialized() || e().g() == null) {
            return;
        }
        e().A(new Runnable() { // from class: X8.s
            @Override // java.lang.Runnable
            public final void run() {
                u.h();
            }
        });
    }

    public final void i() {
        if (!f13663b.isInitialized() || e().g() == null) {
            return;
        }
        e().A(new Runnable() { // from class: X8.r
            @Override // java.lang.Runnable
            public final void run() {
                u.j();
            }
        });
    }

    public final void k() {
        if (!f13663b.isInitialized() || e().g() == null) {
            return;
        }
        e().A(new Runnable() { // from class: X8.t
            @Override // java.lang.Runnable
            public final void run() {
                u.l();
            }
        });
    }
}
