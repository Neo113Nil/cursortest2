package defpackage;

import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q29 implements qyd {
    public n29 a;
    public final k29 b;
    public final xy c;
    public Function2 d;
    public Function0 e;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public pea p;
    public boolean q;
    public boolean r;
    public boolean t;
    public long f = 9223372034707292159L;
    public final float[] h = xzb.a();
    public kx4 k = yqo.c();
    public ema l = ema.a;
    public final wj2 m = new wj2();
    public long o = xvj.b;
    public boolean s = true;
    public final oo u = new oo(this, 21);

    public q29(n29 n29Var, k29 k29Var, xy xyVar, Function2 function2, Function0 function0) {
        this.a = n29Var;
        this.b = k29Var;
        this.c = xyVar;
        this.d = function2;
        this.e = function0;
    }

    public final float[] a() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = xzb.a();
            this.i = fArr;
        }
        if (this.r) {
            this.r = false;
            float[] b = b();
            if (this.s) {
                return b;
            }
            if (!uaa.s(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            n29 n29Var = this.a;
            long j = n29Var.v;
            p29 p29Var = n29Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = yaa.u(d7a.I(this.f));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float J = p29Var.J();
            float I = p29Var.I();
            float K = p29Var.K();
            float i = p29Var.i();
            float k = p29Var.k();
            float A = p29Var.A();
            float O = p29Var.O();
            double d = K * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (I * cos) - (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * sin);
            float f3 = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * cos) + (I * sin);
            double d2 = i * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (J * cos2);
            float f10 = (f3 * cos2) + ((-J) * sin2);
            double d3 = k * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * A;
            float f14 = sin3 * cos * A;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * A;
            float f16 = f12 * O;
            float f17 = cos * cos3 * O;
            float f18 = ((cos3 * f6) + (f11 * f4)) * O;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = y6a.F(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.j || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean t = xy.t();
        xy xyVar = this.c;
        if (t) {
            xyVar.R(-4.0f);
        }
        n29 n29Var = this.a;
        if (!r6a.b(n29Var.t, j)) {
            n29Var.t = j;
            n29Var.a.h((int) (j >> 32), (int) (j & 4294967295L), n29Var.u);
        }
        ViewParent parent = xyVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(xyVar, xyVar);
        }
    }

    public final void e(long j) {
        if (c7a.a(j, this.f)) {
            return;
        }
        if (xy.t()) {
            this.c.R(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.j) {
            this.j = z;
            xy xyVar = this.c;
            l0d l0dVar = xyVar.E;
            boolean z2 = xyVar.G;
            if (!z) {
                if (z2) {
                    return;
                }
                l0dVar.j(this);
                l0d l0dVar2 = xyVar.F;
                if (l0dVar2 != null) {
                    l0dVar2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                l0dVar.a(this);
                return;
            }
            l0d l0dVar3 = xyVar.F;
            if (l0dVar3 == null) {
                l0dVar3 = new l0d();
                xyVar.F = l0dVar3;
            }
            l0dVar3.a(this);
        }
    }

    public final void g() {
        xy.t();
        if (this.j) {
            if (!xvj.a(this.o, xvj.b) && !c7a.a(this.a.u, this.f)) {
                n29 n29Var = this.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.o >> 32)) * ((int) (this.f >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.o & 4294967295L)) * ((int) (this.f & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!dnd.c(n29Var.v, floatToRawIntBits)) {
                    n29Var.v = floatToRawIntBits;
                    n29Var.a.G(floatToRawIntBits);
                }
            }
            this.a.f(this.k, this.l, this.f, this.u);
            f(false);
        }
    }
}
