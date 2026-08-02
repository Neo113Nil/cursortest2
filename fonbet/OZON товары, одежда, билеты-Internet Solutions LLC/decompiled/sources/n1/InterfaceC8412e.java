package n1;

import Z1.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import l1.AbstractC7799Q;
import l1.C7795M;
import l1.C7809a0;
import l1.InterfaceC7829k0;
import l1.s0;
import l1.t0;
import l1.w0;
import n1.C8408a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8412e extends Z1.d {
    static void I0(InterfaceC8412e interfaceC8412e, AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, float f7, AbstractC8413f abstractC8413f, int i11) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j14 = j11;
        interfaceC8412e.H1(abstractC7799Q, j14, (i11 & 4) != 0 ? r1(interfaceC8412e.i(), j14) : j12, j13, (i11 & 16) != 0 ? 1.0f : f7, (i11 & 32) != 0 ? C8415h.f76287a : abstractC8413f);
    }

    static /* synthetic */ void O0(InterfaceC8412e interfaceC8412e, AbstractC7799Q abstractC7799Q, float f7, long j11, C8416i c8416i, int i11) {
        if ((i11 & 2) != 0) {
            f7 = C7464j.e(interfaceC8412e.i()) / 2.0f;
        }
        float f11 = f7;
        if ((i11 & 4) != 0) {
            j11 = interfaceC8412e.A0();
        }
        interfaceC8412e.d0(abstractC7799Q, f11, j11, c8416i);
    }

    static /* synthetic */ void Q(InterfaceC8412e interfaceC8412e, long j11, long j12, long j13, float f7, C7809a0 c7809a0, int i11) {
        long j14 = (i11 & 2) != 0 ? 0L : j12;
        interfaceC8412e.C0(j11, j14, (i11 & 4) != 0 ? r1(interfaceC8412e.i(), j14) : j13, (i11 & 8) != 0 ? 1.0f : f7, C8415h.f76287a, (i11 & 32) != 0 ? null : c7809a0, (i11 & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void X(InterfaceC8412e interfaceC8412e, s0 s0Var, long j11, AbstractC8413f abstractC8413f, int i11) {
        if ((i11 & 8) != 0) {
            abstractC8413f = C8415h.f76287a;
        }
        interfaceC8412e.T0(s0Var, j11, abstractC8413f, (i11 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void k0(InterfaceC8412e interfaceC8412e, AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, AbstractC8413f abstractC8413f, int i11, int i12) {
        if ((i12 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        interfaceC8412e.V0(abstractC7799Q, j13, (i12 & 4) != 0 ? r1(interfaceC8412e.i(), j13) : j12, (i12 & 8) != 0 ? 1.0f : f7, (i12 & 16) != 0 ? C8415h.f76287a : abstractC8413f, (i12 & 64) != 0 ? 3 : i11);
    }

    static /* synthetic */ void m1(InterfaceC8412e interfaceC8412e, long j11, float f7, long j12, int i11) {
        if ((i11 & 4) != 0) {
            j12 = interfaceC8412e.A0();
        }
        interfaceC8412e.R(j11, f7, j12, C8415h.f76287a, (i11 & 64) != 0 ? 3 : 0);
    }

    static void p0(InterfaceC8412e interfaceC8412e, long j11, long j12, long j13, long j14, C8416i c8416i, int i11) {
        long j15 = (i11 & 2) != 0 ? 0L : j12;
        interfaceC8412e.H0(j11, j15, (i11 & 4) != 0 ? r1(interfaceC8412e.i(), j15) : j13, j14, (i11 & 16) != 0 ? C8415h.f76287a : c8416i);
    }

    private static long r1(long j11, long j12) {
        return C7465k.a(C7464j.f(j11) - C7459e.g(j12), C7464j.d(j11) - C7459e.h(j12));
    }

    static /* synthetic */ void x1(InterfaceC8412e interfaceC8412e, s0 s0Var, AbstractC7799Q abstractC7799Q, float f7, C8416i c8416i, int i11) {
        if ((i11 & 4) != 0) {
            f7 = 1.0f;
        }
        float f11 = f7;
        AbstractC8413f abstractC8413f = c8416i;
        if ((i11 & 8) != 0) {
            abstractC8413f = C8415h.f76287a;
        }
        interfaceC8412e.S0(s0Var, abstractC7799Q, f11, abstractC8413f, (i11 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void y1(InterfaceC8412e interfaceC8412e, InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, float f7, AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11, int i12, int i13) {
        interfaceC8412e.t0(interfaceC7829k0, (i13 & 2) != 0 ? 0L : j11, j12, (i13 & 8) != 0 ? 0L : j13, (i13 & 16) != 0 ? j12 : j14, (i13 & 32) != 0 ? 1.0f : f7, (i13 & 64) != 0 ? C8415h.f76287a : abstractC8413f, c7809a0, (i13 & 256) != 0 ? 3 : i11, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 1 : i12);
    }

    default long A0() {
        return C7465k.b(w0().e());
    }

    void C0(long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11);

    void E1(long j11, float f7, float f11, long j12, long j13, @NotNull AbstractC8413f abstractC8413f);

    void H0(long j11, long j12, long j13, long j14, @NotNull AbstractC8413f abstractC8413f);

    void H1(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f);

    void R(long j11, float f7, long j12, @NotNull AbstractC8413f abstractC8413f, int i11);

    void S0(@NotNull s0 s0Var, @NotNull AbstractC7799Q abstractC7799Q, float f7, @NotNull AbstractC8413f abstractC8413f, int i11);

    void T0(@NotNull s0 s0Var, long j11, @NotNull AbstractC8413f abstractC8413f, int i11);

    void U(long j11, long j12, long j13, float f7, int i11, t0 t0Var);

    void V0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f, int i11);

    void d0(@NotNull AbstractC7799Q abstractC7799Q, float f7, long j11, @NotNull C8416i c8416i);

    @NotNull
    s getLayoutDirection();

    void h0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, float f11);

    default long i() {
        return w0().e();
    }

    void j1(@NotNull InterfaceC7829k0 interfaceC7829k0, @NotNull AbstractC8413f abstractC8413f, C7795M c7795m);

    default void t0(@NotNull InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11, int i12) {
        y1(this, interfaceC7829k0, j11, j12, j13, j14, f7, abstractC8413f, c7809a0, i11, 0, UserVerificationMethods.USER_VERIFY_NONE);
    }

    void t1(@NotNull w0 w0Var, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f);

    @NotNull
    C8408a.b w0();
}
