package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mke implements xqk {
    public hv9 a;
    public b b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ qke f;

    public mke(qke qkeVar, Context context) {
        this.f = qkeVar;
        nik.Q(context);
        av9 av9Var = hv9.b;
        this.a = vvf.e;
        this.e = qke.q;
    }

    @Override // defpackage.xqk
    public final void a(float f) {
        qke qkeVar = this.f;
        qkeVar.i.c(f);
        qkeVar.e.a(f);
    }

    @Override // defpackage.xqk
    public final void b(long j) {
        this.c = j;
    }

    @Override // defpackage.xqk
    public final void c() {
        qke qkeVar = this.f;
        if (qkeVar.o >= C.TIME_UNSET) {
            qkeVar.e.c();
        }
    }

    @Override // defpackage.xqk
    public final void d(v3c v3cVar) {
        this.e = f35.a;
    }

    @Override // defpackage.xqk
    public final void e(b bVar, long j, int i, List list) {
        z1a.E(false);
        this.a = hv9.v(list);
        this.b = bVar;
        qm8 a = bVar.a();
        w13 w13Var = bVar.E;
        if (w13Var == null || !w13Var.d()) {
            w13Var = w13.h;
        }
        a.D = w13Var;
        new b(a);
        throw null;
    }

    @Override // defpackage.xqk
    public final void f(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = hv9.v(list);
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        qm8 a = bVar.a();
        w13 w13Var = bVar.E;
        if (w13Var == null || !w13Var.d()) {
            w13Var = w13.h;
        }
        a.D = w13Var;
        new b(a);
        throw null;
    }

    @Override // defpackage.xqk
    public final boolean g(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.xqk
    public final void i(Surface surface, ijh ijhVar) {
        qke qkeVar = this.f;
        Pair pair = qkeVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((ijh) qkeVar.l.second).equals(ijhVar)) {
            return;
        }
        qkeVar.l = Pair.create(surface, ijhVar);
        int i = ijhVar.a;
    }

    @Override // defpackage.xqk
    public final boolean isEnded() {
        return false;
    }

    @Override // defpackage.xqk
    public final boolean isInitialized() {
        return false;
    }

    @Override // defpackage.xqk
    public final boolean j(b bVar) {
        qke qkeVar = this.f;
        boolean z = true;
        z1a.E(qkeVar.n == 0);
        w13 w13Var = bVar.E;
        if (w13Var == null || !w13Var.d()) {
            w13Var = w13.h;
        }
        int i = w13Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && xw3.H("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        tqi tqiVar = qkeVar.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        qkeVar.k = tqiVar.a(myLooper, null);
                        qkeVar.b.a();
                        throw null;
                    }
                }
            } catch (iy8 e) {
                throw new wqk(e, bVar);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !xw3.H("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z = false;
            }
        } else if (i == 7) {
            z = xw3.H("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            tgj.d0("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            w13 w13Var2 = w13.h;
            tqi tqiVar2 = qkeVar.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            qkeVar.k = tqiVar2.a(myLooper2, null);
            qkeVar.b.a();
            throw null;
        }
        if (i == 2 || i == 10) {
            w13 w13Var3 = w13.h;
        }
        tqi tqiVar22 = qkeVar.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        qkeVar.k = tqiVar22.a(myLooper22, null);
        qkeVar.b.a();
        throw null;
    }

    @Override // defpackage.xqk
    public final void k() {
        qke qkeVar = this.f;
        if (qkeVar.j.h() == 0) {
            qkeVar.e.k();
            return;
        }
        eij eijVar = new eij(1);
        if (qkeVar.j.h() <= 0) {
            qkeVar.j = eijVar;
        } else {
            ((pke) qkeVar.j.e()).getClass();
            throw null;
        }
    }

    @Override // defpackage.xqk
    public final Surface l() {
        z1a.E(false);
        throw null;
    }

    @Override // defpackage.xqk
    public final void m() {
        qke qkeVar = this.f;
        if (qkeVar.d) {
            qkeVar.e.m();
        }
    }

    @Override // defpackage.xqk
    public final void n() {
        qke qkeVar = this.f;
        if (qkeVar.d) {
            qkeVar.e.n();
        }
    }

    @Override // defpackage.xqk
    public final void o(int i) {
        this.f.e.o(i);
    }

    @Override // defpackage.xqk
    public final void p() {
        int i = ijh.c.a;
        this.f.l = null;
    }

    @Override // defpackage.xqk
    public final boolean q(long j, w3c w3cVar) {
        int i;
        z1a.E(false);
        long j2 = j + this.c;
        qke qkeVar = this.f;
        qpk qpkVar = qkeVar.i;
        long j3 = qpkVar.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((j2 - r3) * qpkVar.c) + qpkVar.b);
        if (j3 != C.TIME_UNSET) {
            long j4 = qkeVar.h;
            if (j4 != C.TIME_UNSET && j3 < j4 && (i = this.d) < 2) {
                this.d = i + 1;
                b4c b4cVar = w3cVar.c;
                r2c r2cVar = w3cVar.a;
                int i2 = w3cVar.b;
                Trace.beginSection("dropVideoBuffer");
                r2cVar.x(i2);
                Trace.endSection();
                b4cVar.P0(0, 1);
                return true;
            }
        }
        int i3 = qkeVar.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.xqk
    public final void r(boolean z) {
        eij eijVar;
        qke qkeVar = this.f;
        ru4 ru4Var = qkeVar.e;
        if (qkeVar.n == 1) {
            qkeVar.m++;
            ru4Var.r(z);
            while (true) {
                int h = qkeVar.j.h();
                eijVar = qkeVar.j;
                if (h <= 1) {
                    break;
                } else {
                    eijVar.e();
                }
            }
            if (eijVar.h() == 1) {
                ((pke) qkeVar.j.e()).getClass();
                throw null;
            }
            qkeVar.o = C.TIME_UNSET;
            zqi zqiVar = qkeVar.k;
            zqiVar.getClass();
            zqiVar.e(new yp8(qkeVar, 26));
        }
    }

    @Override // defpackage.xqk
    public final void release() {
        qke qkeVar = this.f;
        if (qkeVar.n == 2) {
            return;
        }
        zqi zqiVar = qkeVar.k;
        if (zqiVar != null) {
            zqiVar.a.removeCallbacksAndMessages(null);
        }
        qkeVar.l = null;
        qkeVar.n = 2;
    }

    @Override // defpackage.xqk
    public final void render(long j, long j2) {
        this.f.e.render(j + this.c, j2);
    }

    @Override // defpackage.xqk
    public final void s(boolean z) {
        qke qkeVar = this.f;
        if (qkeVar.d) {
            qkeVar.e.s(z);
        }
    }

    @Override // defpackage.xqk
    public final void t(npk npkVar) {
        this.f.e.j = npkVar;
    }

    @Override // defpackage.xqk
    public final void h() {
    }
}
