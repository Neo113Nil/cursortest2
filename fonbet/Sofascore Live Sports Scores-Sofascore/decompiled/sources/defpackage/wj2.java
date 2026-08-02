package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wj2 implements ha5 {
    public final vj2 a;
    public final sx2 b;
    public gtj c;
    public gtj d;

    public wj2() {
        nx4 nx4Var = xw3.d;
        ema emaVar = ema.a;
        vj2 vj2Var = new vj2();
        vj2Var.a = nx4Var;
        vj2Var.b = emaVar;
        vj2Var.c = bm5.a;
        vj2Var.d = 0L;
        this.a = vj2Var;
        sx2 sx2Var = new sx2();
        sx2Var.c = this;
        sx2Var.a = new hpo(sx2Var);
        this.b = sx2Var;
    }

    public static gtj a(wj2 wj2Var, long j, ja5 ja5Var, float f, ay1 ay1Var, int i) {
        gtj c = wj2Var.c(ja5Var);
        Paint paint = (Paint) c.d;
        if (f != 1.0f) {
            j = r13.c(j, r13.d(j) * f);
        }
        long b = hkg.b(paint.getColor());
        int i2 = r13.j;
        if (!e8k.a(b, j)) {
            c.v(j);
        }
        if (((Shader) c.e) != null) {
            c.z(null);
        }
        if (!Intrinsics.c((ay1) c.f, ay1Var)) {
            c.w(ay1Var);
        }
        if (c.b != i) {
            c.u(i);
        }
        if (paint.isFilterBitmap()) {
            return c;
        }
        c.x(1);
        return c;
    }

    @Override // defpackage.ha5
    public final void A(long j, float f, float f2, long j2, long j3, float f3, ja5 ja5Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, ja5Var, f3, null, 3));
    }

    @Override // defpackage.ha5
    public final void A0(n52 n52Var, long j, long j2, float f, int i, float f2) {
        uj2 uj2Var = this.a.c;
        gtj gtjVar = this.d;
        if (gtjVar == null) {
            gtjVar = yqo.n();
            gtjVar.E(1);
            this.d = gtjVar;
        }
        Paint paint = (Paint) gtjVar.d;
        if (n52Var != null) {
            n52Var.a(f2, n(), gtjVar);
        } else if (paint.getAlpha() / 255.0f != f2) {
            gtjVar.t(f2);
        }
        if (!Intrinsics.c((ay1) gtjVar.f, null)) {
            gtjVar.w(null);
        }
        if (gtjVar.b != 3) {
            gtjVar.u(3);
        }
        if (paint.getStrokeWidth() != f) {
            gtjVar.D(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (gtjVar.n() != i) {
            gtjVar.B(i);
        }
        if (gtjVar.o() != 0) {
            gtjVar.C(0);
        }
        if (!Intrinsics.c((c20) gtjVar.c, null)) {
            gtjVar.y(null);
        }
        if (!paint.isFilterBitmap()) {
            gtjVar.x(1);
        }
        uj2Var.e(j, j2, gtjVar);
    }

    @Override // defpackage.ha5
    public final sx2 L0() {
        return this.b;
    }

    @Override // defpackage.ha5
    public final void Q0(long j, long j2, long j3, float f, ja5 ja5Var, ay1 ay1Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, ja5Var, f, ay1Var, i));
    }

    @Override // defpackage.ha5
    public final void T(n52 n52Var, long j, long j2, float f, ja5 ja5Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(n52Var, ja5Var, f, null, i, 1));
    }

    @Override // defpackage.ha5
    public final void X(long j, long j2, long j3, long j4, ja5 ja5Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, ja5Var, 1.0f, null, 3));
    }

    public final gtj b(n52 n52Var, ja5 ja5Var, float f, ay1 ay1Var, int i, int i2) {
        gtj c = c(ja5Var);
        Paint paint = (Paint) c.d;
        if (n52Var != null) {
            n52Var.a(f, n(), c);
        } else {
            if (((Shader) c.e) != null) {
                c.z(null);
            }
            long b = hkg.b(paint.getColor());
            long j = r13.b;
            if (!e8k.a(b, j)) {
                c.v(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c.t(f);
            }
        }
        if (!Intrinsics.c((ay1) c.f, ay1Var)) {
            c.w(ay1Var);
        }
        if (c.b != i) {
            c.u(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c;
        }
        c.x(i2);
        return c;
    }

    public final gtj c(ja5 ja5Var) {
        if (Intrinsics.c(ja5Var, e28.a)) {
            gtj gtjVar = this.c;
            if (gtjVar != null) {
                return gtjVar;
            }
            gtj n = yqo.n();
            n.E(0);
            this.c = n;
            return n;
        }
        if (!(ja5Var instanceof jii)) {
            zzl.b();
            return null;
        }
        gtj gtjVar2 = this.d;
        if (gtjVar2 == null) {
            gtjVar2 = yqo.n();
            gtjVar2.E(1);
            this.d = gtjVar2;
        }
        Paint paint = (Paint) gtjVar2.d;
        float strokeWidth = paint.getStrokeWidth();
        jii jiiVar = (jii) ja5Var;
        c20 c20Var = jiiVar.e;
        float f = jiiVar.a;
        if (strokeWidth != f) {
            gtjVar2.D(f);
        }
        int n2 = gtjVar2.n();
        int i = jiiVar.c;
        if (n2 != i) {
            gtjVar2.B(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = jiiVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int o = gtjVar2.o();
        int i2 = jiiVar.d;
        if (o != i2) {
            gtjVar2.C(i2);
        }
        if (!Intrinsics.c((c20) gtjVar2.c, c20Var)) {
            gtjVar2.y(c20Var);
        }
        return gtjVar2;
    }

    @Override // defpackage.ha5
    public final void c0(a10 a10Var, long j, ay1 ay1Var) {
        this.a.c.m(a10Var, j, b(null, e28.a, 1.0f, ay1Var, 3, 1));
    }

    @Override // defpackage.ha5
    public final void d0(a10 a10Var, long j, long j2, long j3, float f, ay1 ay1Var, int i) {
        this.a.c.s(a10Var, j, j2, j3, b(null, e28.a, f, ay1Var, 3, i));
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.a.getFontScale();
    }

    @Override // defpackage.ha5
    public final ema getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.a.j();
    }

    @Override // defpackage.ha5
    public final void k0(b20 b20Var, n52 n52Var, float f, ja5 ja5Var, int i) {
        this.a.c.b(b20Var, b(n52Var, ja5Var, f, null, i, 1));
    }

    @Override // defpackage.ha5
    public final void l0(b20 b20Var, long j, float f, ja5 ja5Var) {
        this.a.c.b(b20Var, a(this, j, ja5Var, f, null, 3));
    }

    @Override // defpackage.ha5
    public final void q(long j, long j2, long j3, float f, int i, c20 c20Var, float f2) {
        uj2 uj2Var = this.a.c;
        gtj gtjVar = this.d;
        if (gtjVar == null) {
            gtjVar = yqo.n();
            gtjVar.E(1);
            this.d = gtjVar;
        }
        Paint paint = (Paint) gtjVar.d;
        if (f2 != 1.0f) {
            j = r13.c(j, r13.d(j) * f2);
        }
        long b = hkg.b(paint.getColor());
        int i2 = r13.j;
        if (!e8k.a(b, j)) {
            gtjVar.v(j);
        }
        if (((Shader) gtjVar.e) != null) {
            gtjVar.z(null);
        }
        if (!Intrinsics.c((ay1) gtjVar.f, null)) {
            gtjVar.w(null);
        }
        if (gtjVar.b != 3) {
            gtjVar.u(3);
        }
        if (paint.getStrokeWidth() != f) {
            gtjVar.D(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (gtjVar.n() != i) {
            gtjVar.B(i);
        }
        if (gtjVar.o() != 0) {
            gtjVar.C(0);
        }
        if (!Intrinsics.c((c20) gtjVar.c, c20Var)) {
            gtjVar.y(c20Var);
        }
        if (!paint.isFilterBitmap()) {
            gtjVar.x(1);
        }
        uj2Var.e(j2, j3, gtjVar);
    }

    @Override // defpackage.ha5
    public final void r(long j, float f, long j2, float f2, ja5 ja5Var) {
        this.a.c.c(f, j2, a(this, j, ja5Var, f2, null, 3));
    }
}
