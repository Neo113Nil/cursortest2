package l1;

import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7802U {
    void a(@NotNull InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, @NotNull r0 r0Var);

    void b(@NotNull C7460f c7460f, @NotNull r0 r0Var);

    void c(@NotNull s0 s0Var, @NotNull r0 r0Var);

    void d(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull r0 r0Var);

    void e(float f7, float f11, float f12, float f13, int i11);

    void f(float f7, float f11);

    void g(@NotNull InterfaceC7829k0 interfaceC7829k0, @NotNull r0 r0Var);

    void h(float f7, float f11, float f12, float f13, @NotNull r0 r0Var);

    void i();

    default void j(@NotNull C7460f c7460f, @NotNull C7784B c7784b) {
        m(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h(), c7784b);
    }

    void k(long j11, long j12, @NotNull r0 r0Var);

    void l(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull r0 r0Var);

    void m(float f7, float f11, float f12, float f13, @NotNull r0 r0Var);

    void n(long j11, @NotNull r0 r0Var, float f7);

    void o(float f7, float f11);

    void p();

    void q();

    default void r(@NotNull C7460f c7460f) {
        e(c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h(), 1);
    }

    void s(@NotNull float[] fArr);

    void save();

    void t();

    void u(@NotNull s0 s0Var);
}
