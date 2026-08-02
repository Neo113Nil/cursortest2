package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aqk {
    public final fp4 a;
    public final ppk b;
    public final h12 c = new h12(4);
    public final eij d = new eij(1);
    public final eij e = new eij(1);
    public final xl0 f;
    public final qpk g;
    public long h;
    public long i;
    public long j;
    public zqk k;
    public long l;

    public aqk(fp4 fp4Var, ppk ppkVar, qpk qpkVar) {
        this.a = fp4Var;
        this.b = ppkVar;
        this.g = qpkVar;
        xl0 xl0Var = new xl0(4);
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        xl0Var.b = 0;
        xl0Var.c = -1;
        xl0Var.d = 0;
        xl0Var.f = new long[highestOneBit];
        xl0Var.e = highestOneBit - 1;
        this.f = xl0Var;
        this.h = C.TIME_UNSET;
        this.k = zqk.d;
        this.i = C.TIME_UNSET;
        this.j = C.TIME_UNSET;
    }

    public final void a(long j, long j2) {
        final fp4 fp4Var = this.a;
        ru4 ru4Var = (ru4) fp4Var.c;
        while (true) {
            xl0 xl0Var = this.f;
            int i = xl0Var.d;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                yhk.d();
                return;
            }
            long j3 = ((long[]) xl0Var.f)[xl0Var.b];
            Long l = (Long) this.e.f(j3);
            ppk ppkVar = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                ppkVar.e(2);
            }
            long j4 = this.l;
            ppk ppkVar2 = this.b;
            h12 h12Var = this.c;
            int a = ppkVar2.a(j3, j, j2, j4, false, false, h12Var);
            if (a != 5 && a != 4) {
                this.g.a(j3, h12Var.a);
            }
            final int i2 = 0;
            if (a == 0 || a == 1) {
                this.i = j3;
                boolean z = a == 0;
                long g = xl0Var.g();
                zqk zqkVar = (zqk) this.d.f(g);
                if (zqkVar != null && !zqkVar.equals(zqk.d) && !zqkVar.equals(this.k)) {
                    this.k = zqkVar;
                    qm8 qm8Var = new qm8();
                    qm8Var.u = zqkVar.a;
                    qm8Var.v = zqkVar.b;
                    qm8Var.n = sjc.p("video/raw");
                    fp4Var.b = new b(qm8Var);
                    ru4Var.i.execute(new mc3(23, fp4Var, zqkVar));
                }
                long nanoTime = z ? System.nanoTime() : h12Var.b;
                r14 = ppkVar.e == 3 ? 0 : 1;
                ppkVar.e = 3;
                ppkVar.l.getClass();
                ppkVar.g = nik.T(SystemClock.elapsedRealtime());
                if (r14 != 0 && ru4Var.e != null) {
                    ru4Var.i.execute(new Runnable() { // from class: qu4
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            fp4 fp4Var2 = fp4Var;
                            switch (i3) {
                                case 0:
                                    ((ru4) fp4Var2.c).h.a();
                                    break;
                                default:
                                    ((ru4) fp4Var2.c).h.b();
                                    break;
                            }
                        }
                    });
                }
                b bVar = (b) fp4Var.b;
                ru4Var.j.c(g, nanoTime, bVar == null ? new b(new qm8()) : bVar, null);
                w3c w3cVar = (w3c) ru4Var.d.remove();
                w3cVar.c.K0(w3cVar.a, w3cVar.b, nanoTime);
            } else if (a == 2 || a == 3) {
                this.i = j3;
                xl0Var.g();
                ru4Var.i.execute(new Runnable() { // from class: qu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = r2;
                        fp4 fp4Var2 = fp4Var;
                        switch (i3) {
                            case 0:
                                ((ru4) fp4Var2.c).h.a();
                                break;
                            default:
                                ((ru4) fp4Var2.c).h.b();
                                break;
                        }
                    }
                });
                w3c w3cVar2 = (w3c) ru4Var.d.remove();
                b4c b4cVar = w3cVar2.c;
                r2c r2cVar = w3cVar2.a;
                int i3 = w3cVar2.b;
                Trace.beginSection("dropVideoBuffer");
                r2cVar.x(i3);
                Trace.endSection();
                b4cVar.P0(0, 1);
            } else {
                if (a != 4) {
                    if (a == 5) {
                        return;
                    }
                    a70.r(String.valueOf(a));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
