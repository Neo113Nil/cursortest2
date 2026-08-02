package defpackage;

import androidx.media3.common.b;
import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n51 implements jte {
    public final int b;
    public syf d;
    public int e;
    public cse f;
    public tqi g;
    public int h;
    public jpg i;
    public b[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public scc q;
    public iu4 r;
    public final Object a = new Object();
    public final fp4 c = new fp4(23, false);
    public long m = Long.MIN_VALUE;
    public mij p = mij.a;

    public n51(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean k(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public abstract int A(b bVar);

    public int B() {
        return 0;
    }

    public boolean C(long j) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tf6 d(Exception exc, b bVar, boolean z, int i) {
        int i2;
        if (bVar != null && !this.o) {
            this.o = true;
            try {
                i2 = A(bVar) & 7;
            } catch (tf6 unused) {
            } finally {
                this.o = false;
            }
            return new tf6(1, exc, i, h(), this.e, bVar, bVar != null ? 4 : i2, this.q, z);
        }
        i2 = 4;
        return new tf6(1, exc, i, h(), this.e, bVar, bVar != null ? 4 : i2, this.q, z);
    }

    public long f(long j, long j2) {
        if (this.h != 1) {
            return Ua.s;
        }
        if (l() || j()) {
            return 1000000L;
        }
        return Ua.s;
    }

    public m2c g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.m == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j, boolean z, boolean z2);

    public final int v(fp4 fp4Var, im4 im4Var, int i) {
        jpg jpgVar = this.i;
        jpgVar.getClass();
        int e = jpgVar.e(fp4Var, im4Var, i);
        if (e == -4) {
            if (im4Var.i(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = im4Var.k + this.k;
            im4Var.k = j;
            this.m = Math.max(this.m, j);
            return e;
        }
        if (e == -5) {
            b bVar = (b) fp4Var.c;
            bVar.getClass();
            long j2 = bVar.t;
            if (j2 != Long.MAX_VALUE) {
                qm8 a = bVar.a();
                a.s = j2 + this.k;
                fp4Var.c = new b(a);
            }
        }
        return e;
    }

    public abstract void w(long j, long j2);

    public final void x(b[] bVarArr, jpg jpgVar, long j, long j2, scc sccVar) {
        z1a.E(!this.n);
        this.i = jpgVar;
        this.q = sccVar;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = bVarArr;
        this.k = j2;
        t(bVarArr, j, j2, sccVar);
    }

    public final void y(long j, boolean z, boolean z2) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z2) {
            jpg jpgVar = this.i;
            jpgVar.getClass();
            z2 = jpgVar.skipData(j - this.k) != 0;
        }
        o(j, z, z2);
    }

    public void e() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void u() {
    }

    @Override // defpackage.jte
    public void handleMessage(int i, Object obj) {
    }

    public void n(boolean z, boolean z2) {
    }

    public void z(float f, float f2) {
    }

    public void t(b[] bVarArr, long j, long j2, scc sccVar) {
    }
}
