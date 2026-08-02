package n1;

import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import l1.C7833m0;
import l1.InterfaceC7802U;
import l1.s0;
import n1.C8408a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8409b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8408a.b f76285a;

    C8409b(C8408a.b bVar) {
        this.f76285a = bVar;
    }

    public final void a(@NotNull s0 s0Var) {
        this.f76285a.a().u(s0Var);
    }

    public final void b(float f7, float f11, float f12, float f13, int i11) {
        this.f76285a.a().e(f7, f11, f12, f13, i11);
    }

    public final void c(float f7, float f11, float f12, float f13) {
        C8408a.b bVar = this.f76285a;
        InterfaceC7802U a11 = bVar.a();
        long a12 = C7465k.a(C7464j.f(bVar.e()) - (f12 + f7), C7464j.d(bVar.e()) - (f13 + f11));
        if (C7464j.f(a12) < 0.0f || C7464j.d(a12) < 0.0f) {
            C7833m0.a("Width and height must be greater than or equal to zero");
            throw null;
        }
        bVar.k(a12);
        a11.f(f7, f11);
    }

    public final void d() {
        InterfaceC7802U a11 = this.f76285a.a();
        a11.f(C7459e.g(0L), C7459e.h(0L));
        a11.t();
        a11.f(-C7459e.g(0L), -C7459e.h(0L));
    }

    public final void e(float f7, float f11, long j11) {
        InterfaceC7802U a11 = this.f76285a.a();
        a11.f(C7459e.g(j11), C7459e.h(j11));
        a11.o(f7, f11);
        a11.f(-C7459e.g(j11), -C7459e.h(j11));
    }

    public final void f(@NotNull float[] fArr) {
        this.f76285a.a().s(fArr);
    }

    public final void g(float f7, float f11) {
        this.f76285a.a().f(f7, f11);
    }
}
