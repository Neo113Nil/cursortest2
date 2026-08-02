package defpackage;

import android.view.Surface;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ru4 implements xqk {
    public final ppk a;
    public final qpk b;
    public final aqk c;
    public final ArrayDeque d;
    public Surface e;
    public b f;
    public long g;
    public vqk h;
    public Executor i;
    public npk j;

    public ru4(ppk ppkVar, qpk qpkVar, tqi tqiVar) {
        this.a = ppkVar;
        this.b = qpkVar;
        ppkVar.l = tqiVar;
        this.c = new aqk(new fp4(this), ppkVar, qpkVar);
        this.d = new ArrayDeque();
        this.f = new b(new qm8());
        this.g = C.TIME_UNSET;
        this.h = vqk.a;
        this.i = new hg0(2);
        this.j = new pu4();
    }

    @Override // defpackage.xqk
    public final void a(float f) {
        this.a.h(f);
    }

    @Override // defpackage.xqk
    public final void b(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xqk
    public final void c() {
        aqk aqkVar = this.c;
        long j = aqkVar.h;
        if (j == C.TIME_UNSET) {
            j = Long.MIN_VALUE;
            aqkVar.h = Long.MIN_VALUE;
            aqkVar.i = Long.MIN_VALUE;
        }
        aqkVar.j = j;
    }

    @Override // defpackage.xqk
    public final void d(v3c v3cVar) {
        this.h = v3cVar;
        this.i = f35.a;
    }

    @Override // defpackage.xqk
    public final void e(b bVar, long j, int i, List list) {
        z1a.E(list.isEmpty());
        int i2 = bVar.v;
        int i3 = bVar.w;
        b bVar2 = this.f;
        int i4 = bVar2.v;
        aqk aqkVar = this.c;
        if (i2 != i4 || i3 != bVar2.w) {
            eij eijVar = aqkVar.d;
            long j2 = aqkVar.h;
            eijVar.a(new zqk(i2, i3), j2 == C.TIME_UNSET ? 0L : j2 + 1);
        }
        float f = bVar.z;
        if (f != this.f.z) {
            this.a.f(f);
        }
        this.f = bVar;
        if (j != this.g) {
            if (aqkVar.f.d == 0) {
                aqkVar.b.e(i);
                aqkVar.l = j;
            } else {
                eij eijVar2 = aqkVar.e;
                long j3 = aqkVar.h;
                eijVar2.a(Long.valueOf(j), j3 == C.TIME_UNSET ? -4611686018427387904L : j3 + 1);
            }
            this.g = j;
        }
    }

    @Override // defpackage.xqk
    public final void f(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xqk
    public final boolean g(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.xqk
    public final void h() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xqk
    public final void i(Surface surface, ijh ijhVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.xqk
    public final boolean isEnded() {
        aqk aqkVar = this.c;
        long j = aqkVar.j;
        return j != C.TIME_UNSET && aqkVar.i == j;
    }

    @Override // defpackage.xqk
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.xqk
    public final boolean j(b bVar) {
        return true;
    }

    @Override // defpackage.xqk
    public final void k() {
        ppk ppkVar = this.a;
        if (ppkVar.e == 0) {
            ppkVar.e = 1;
        }
    }

    @Override // defpackage.xqk
    public final Surface l() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.xqk
    public final void m() {
        this.b.b();
        ppk ppkVar = this.a;
        ppkVar.d = false;
        ppkVar.i = C.TIME_UNSET;
        zpk zpkVar = ppkVar.b;
        zpkVar.d = false;
        vpk vpkVar = zpkVar.c;
        if (vpkVar != null) {
            vpkVar.f();
        }
        zpkVar.a();
    }

    @Override // defpackage.xqk
    public final void n() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.xqk
    public final void o(int i) {
        zpk zpkVar = this.a.b;
        if (zpkVar.j == i) {
            return;
        }
        zpkVar.j = i;
        zpkVar.d(true);
    }

    @Override // defpackage.xqk
    public final void p() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.xqk
    public final boolean q(long j, w3c w3cVar) {
        this.d.add(w3cVar);
        aqk aqkVar = this.c;
        xl0 xl0Var = aqkVar.f;
        int i = xl0Var.d;
        long[] jArr = (long[]) xl0Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                zzl.s();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = xl0Var.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) xl0Var.f, 0, jArr2, i3, i2);
            xl0Var.b = 0;
            int i4 = xl0Var.d;
            xl0Var.c = i4 - 1;
            xl0Var.f = jArr2;
            xl0Var.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (xl0Var.c + 1) & xl0Var.e;
        xl0Var.c = i5;
        jArr[i5] = j;
        xl0Var.d = i + 1;
        aqkVar.h = j;
        aqkVar.j = C.TIME_UNSET;
        this.i.execute(new wb3(this, 16));
        return true;
    }

    @Override // defpackage.xqk
    public final void r(boolean z) {
        if (z) {
            ppk ppkVar = this.a;
            ppkVar.b.b();
            ppkVar.h = C.TIME_UNSET;
            ppkVar.f = C.TIME_UNSET;
            ppkVar.e = Math.min(ppkVar.e, 1);
            ppkVar.i = C.TIME_UNSET;
            ppkVar.n = false;
        }
        this.b.b();
        aqk aqkVar = this.c;
        eij eijVar = aqkVar.d;
        xl0 xl0Var = aqkVar.f;
        xl0Var.b = 0;
        xl0Var.c = -1;
        xl0Var.d = 0;
        aqkVar.h = C.TIME_UNSET;
        aqkVar.i = C.TIME_UNSET;
        aqkVar.j = C.TIME_UNSET;
        eij eijVar2 = aqkVar.e;
        if (eijVar2.h() > 0) {
            z1a.s(eijVar2.h() > 0);
            while (eijVar2.h() > 1) {
                eijVar2.e();
            }
            Object e = eijVar2.e();
            e.getClass();
            aqkVar.l = ((Long) e).longValue();
        }
        if (eijVar.h() > 0) {
            z1a.s(eijVar.h() > 0);
            while (eijVar.h() > 1) {
                eijVar.e();
            }
            Object e2 = eijVar.e();
            e2.getClass();
            eijVar.a((zqk) e2, 0L);
        }
        this.d.clear();
    }

    @Override // defpackage.xqk
    public final void render(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (tf6 e) {
            throw new wqk(e, this.f);
        }
    }

    @Override // defpackage.xqk
    public final void s(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.xqk
    public final void t(npk npkVar) {
        this.j = npkVar;
    }

    @Override // defpackage.xqk
    public final void release() {
    }
}
