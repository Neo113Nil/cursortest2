package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hl implements kl6 {
    public final nkk c;
    public final nm2 d;
    public ol6 e;
    public long f;
    public boolean h;
    public boolean i;
    public final jl a = new jl(true, null);
    public final nkk b = new nkk(a.o);
    public long g = -1;

    public hl() {
        nkk nkkVar = new nkk(10);
        this.c = nkkVar;
        byte[] bArr = nkkVar.a;
        this.d = new nm2(bArr, bArr.length, 2, (byte) 0);
    }

    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        qx9.u(this.e);
        long j = ((ap4) ml6Var).c;
        nkk nkkVar = this.b;
        int read = ((ap4) ml6Var).read(nkkVar.a, 0, a.o);
        boolean z = read == -1;
        if (!this.i) {
            this.e.d(new aw0(C.TIME_UNSET));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        nkkVar.E(0);
        nkkVar.D(read);
        boolean z2 = this.h;
        jl jlVar = this.a;
        if (!z2) {
            jlVar.g(4, this.f);
            this.h = true;
        }
        jlVar.f(nkkVar);
        return 0;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.e = ol6Var;
        this.a.h(ol6Var, new c2k(0, 1, 0, (byte) 0));
        ol6Var.endTracks();
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        nkk nkkVar;
        int i = 0;
        while (true) {
            nkkVar = this.c;
            ml6Var.peekFully(nkkVar.a, 0, 10);
            nkkVar.E(0);
            if (nkkVar.u() != 4801587) {
                break;
            }
            nkkVar.F(3);
            int r = nkkVar.r();
            i += r + 10;
            ml6Var.advancePeekPosition(r);
        }
        ml6Var.resetPeekPosition();
        ml6Var.advancePeekPosition(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            ap4 ap4Var = (ap4) ml6Var;
            ap4Var.peekFully(nkkVar.a, 0, 2, false);
            nkkVar.E(0);
            if ((nkkVar.x() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ap4Var.peekFully(nkkVar.a, 0, 4, false);
                nm2 nm2Var = this.d;
                nm2Var.q(14);
                int i5 = nm2Var.i(13);
                if (i5 <= 6) {
                    i4++;
                    ap4Var.f = 0;
                    ap4Var.b(i4, false);
                } else {
                    ap4Var.b(i5 - 6, false);
                    i3 += i5;
                }
            } else {
                i4++;
                ap4Var.f = 0;
                ap4Var.b(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.h = false;
        this.a.seek();
        this.f = j2;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
