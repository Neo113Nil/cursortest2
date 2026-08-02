package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oih extends x41 {
    public final int o;
    public final b p;
    public long q;
    public boolean r;

    public oih(re4 re4Var, xe4 xe4Var, b bVar, int i, Object obj, long j, long j2, long j3, int i2, b bVar2) {
        super(re4Var, xe4Var, bVar, i, obj, j, j2, C.TIME_UNSET, C.TIME_UNSET, j3);
        this.o = i2;
        this.p = bVar2;
    }

    @Override // defpackage.j2c
    public final boolean b() {
        return this.r;
    }

    @Override // defpackage.yfb
    public final void load() {
        tei teiVar = this.i;
        z41 z41Var = this.m;
        z41Var.getClass();
        int i = 0;
        for (hpg hpgVar : (hpg[]) z41Var.c) {
            if (hpgVar.H != 0) {
                hpgVar.H = 0L;
                hpgVar.B = true;
            }
        }
        vsj B = z41Var.B(this.o);
        B.d(this.p);
        try {
            long b = teiVar.b(this.b.b(this.q));
            if (b != -1) {
                b += this.q;
            }
            bp4 bp4Var = new bp4(teiVar, this.q, b);
            while (true) {
                long j = this.q;
                if (i == -1) {
                    B.a(this.g, 1, (int) j, 0, null);
                    qx9.w(teiVar);
                    this.r = true;
                    return;
                }
                this.q = j + i;
                i = B.c(bp4Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            qx9.w(teiVar);
            throw th;
        }
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
    }
}
