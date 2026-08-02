package b1;

import b1.AbstractC2346O;
import com.google.common.collect.AbstractC3445z;
import e1.Z;
import java.util.List;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2355i implements InterfaceC2341J {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2346O.c f24590a = new AbstractC2346O.c();

    public final void A0(int i10, int i11) {
        y0(i10, -9223372036854775807L, i11, false);
    }

    @Override // b1.InterfaceC2341J
    public final boolean B() {
        return t0() != -1;
    }

    public final void B0(int i10) {
        int t02 = t0();
        if (t02 == -1) {
            w0(i10);
        } else if (t02 == h0()) {
            x0(i10);
        } else {
            A0(t02, i10);
        }
    }

    public final void C0(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        z0(Math.max(currentPosition, 0L), i10);
    }

    public final void D0(int i10) {
        int u02 = u0();
        if (u02 == -1) {
            w0(i10);
        } else if (u02 == h0()) {
            x0(i10);
        } else {
            A0(u02, i10);
        }
    }

    @Override // b1.InterfaceC2341J
    public final boolean E(int i10) {
        return R().b(i10);
    }

    public final void E0(List list) {
        o(list, true);
    }

    @Override // b1.InterfaceC2341J
    public final boolean G() {
        AbstractC2346O I10 = I();
        return !I10.q() && I10.n(h0(), this.f24590a).f24385i;
    }

    @Override // b1.InterfaceC2341J
    public final void L() {
        if (I().q() || j()) {
            w0(9);
            return;
        }
        if (B()) {
            B0(9);
        } else if (s0() && G()) {
            A0(h0(), 9);
        } else {
            w0(9);
        }
    }

    @Override // b1.InterfaceC2341J
    public final void P(z zVar) {
        E0(AbstractC3445z.u(zVar));
    }

    @Override // b1.InterfaceC2341J
    public final void Q(int i10, long j10) {
        y0(i10, j10, 10, false);
    }

    @Override // b1.InterfaceC2341J
    public final long W() {
        AbstractC2346O I10 = I();
        if (I10.q()) {
            return -9223372036854775807L;
        }
        return I10.n(h0(), this.f24590a).d();
    }

    @Override // b1.InterfaceC2341J
    public final boolean a0() {
        return u0() != -1;
    }

    @Override // b1.InterfaceC2341J
    public final boolean f0() {
        AbstractC2346O I10 = I();
        return !I10.q() && I10.n(h0(), this.f24590a).f24384h;
    }

    @Override // b1.InterfaceC2341J
    public final boolean isPlaying() {
        return g0() == 3 && S() && H() == 0;
    }

    @Override // b1.InterfaceC2341J
    public final void l() {
        t(0, Integer.MAX_VALUE);
    }

    @Override // b1.InterfaceC2341J
    public final int m() {
        long e02 = e0();
        long duration = getDuration();
        if (e02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Z.o(Z.k1(e02, duration), 0, 100);
    }

    @Override // b1.InterfaceC2341J
    public final void n() {
        A0(h0(), 4);
    }

    @Override // b1.InterfaceC2341J
    public final void o0() {
        C0(c0(), 12);
    }

    @Override // b1.InterfaceC2341J
    public final void p0() {
        C0(-r0(), 11);
    }

    @Override // b1.InterfaceC2341J
    public final void pause() {
        x(false);
    }

    @Override // b1.InterfaceC2341J
    public final void play() {
        x(true);
    }

    @Override // b1.InterfaceC2341J
    public final boolean s0() {
        AbstractC2346O I10 = I();
        return !I10.q() && I10.n(h0(), this.f24590a).f();
    }

    @Override // b1.InterfaceC2341J
    public final void seekTo(long j10) {
        z0(j10, 5);
    }

    public final int t0() {
        AbstractC2346O I10 = I();
        if (I10.q()) {
            return -1;
        }
        return I10.e(h0(), v0(), m0());
    }

    @Override // b1.InterfaceC2341J
    public final void u() {
        if (I().q() || j()) {
            w0(7);
            return;
        }
        boolean a02 = a0();
        if (s0() && !f0()) {
            if (a02) {
                D0(7);
                return;
            } else {
                w0(7);
                return;
            }
        }
        if (!a02 || getCurrentPosition() > V()) {
            z0(0L, 7);
        } else {
            D0(7);
        }
    }

    public final int u0() {
        AbstractC2346O I10 = I();
        if (I10.q()) {
            return -1;
        }
        return I10.l(h0(), v0(), m0());
    }

    public final int v0() {
        int l02 = l0();
        if (l02 == 1) {
            return 0;
        }
        return l02;
    }

    public final void w0(int i10) {
        y0(-1, -9223372036854775807L, i10, false);
    }

    public final void x0(int i10) {
        y0(h0(), -9223372036854775807L, i10, true);
    }

    public abstract void y0(int i10, long j10, int i11, boolean z10);

    public final void z0(long j10, int i10) {
        y0(h0(), j10, i10, false);
    }
}
