package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class do3 extends x41 {
    public final int o;
    public final long p;
    public final l72 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public do3(re4 re4Var, xe4 xe4Var, b bVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, l72 l72Var) {
        super(re4Var, xe4Var, bVar, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = l72Var;
    }

    @Override // defpackage.j2c
    public final long a() {
        return this.j + this.o;
    }

    @Override // defpackage.j2c
    public final boolean b() {
        return this.t;
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
        this.s = true;
    }

    @Override // defpackage.yfb
    public final void load() {
        z41 z41Var = this.m;
        z41Var.getClass();
        if (this.r == 0) {
            long j = this.p;
            for (hpg hpgVar : (hpg[]) z41Var.c) {
                if (hpgVar.H != j) {
                    hpgVar.H = j;
                    hpgVar.B = true;
                }
            }
            l72 l72Var = this.q;
            long j2 = this.k;
            long j3 = C.TIME_UNSET;
            long j4 = j2 == C.TIME_UNSET ? -9223372036854775807L : j2 - this.p;
            long j5 = this.l;
            if (j5 != C.TIME_UNSET) {
                j3 = j5 - this.p;
            }
            l72Var.b(z41Var, j4, j3);
        }
        try {
            xe4 b = this.b.b(this.r);
            tei teiVar = this.i;
            bp4 bp4Var = new bp4(teiVar, b.f, teiVar.b(b));
            while (!this.s) {
                try {
                    int b2 = this.q.a.b(bp4Var, l72.j);
                    z1a.E(b2 != 1);
                    if (!(b2 == 0)) {
                        break;
                    }
                } finally {
                    this.r = bp4Var.d - this.b.f;
                }
            }
            b bVar = this.d;
            String str = bVar.n;
            int i = bVar.N;
            int i2 = bVar.O;
            if (sjc.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                vsj B = z41Var.B(4);
                int i3 = i * i2;
                long j6 = (this.h - this.g) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    B.g(0, new j9e());
                    B.a(i4 * j6, 0, 0, 0, null);
                }
            }
            qx9.w(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            qx9.w(this.i);
            throw th;
        }
    }
}
