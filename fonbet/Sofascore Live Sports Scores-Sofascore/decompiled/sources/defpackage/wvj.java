package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wvj {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public o41 l;
    public o41 m;
    public o41 n;
    public o41 o;
    public o41 p;
    public z78 q;
    public z78 r;
    public z78 s;
    public z78 t;
    public z78 u;
    public o41 v;
    public o41 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public wvj(x50 x50Var) {
        t50 t50Var = x50Var.a;
        this.l = t50Var == null ? null : t50Var.g();
        z50 z50Var = x50Var.b;
        this.m = z50Var == null ? null : z50Var.g();
        r50 r50Var = x50Var.c;
        this.n = r50Var == null ? null : r50Var.g();
        s50 s50Var = x50Var.d;
        this.o = s50Var == null ? null : s50Var.g();
        s50 s50Var2 = x50Var.f;
        this.q = s50Var2 == null ? null : s50Var2.g();
        this.x = x50Var.m;
        s50 s50Var3 = x50Var.h;
        this.s = s50Var3 == null ? null : s50Var3.g();
        s50 s50Var4 = x50Var.i;
        this.t = s50Var4 == null ? null : s50Var4.g();
        s50 s50Var5 = x50Var.j;
        this.u = s50Var5 == null ? null : s50Var5.g();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        s50 s50Var6 = x50Var.g;
        this.r = s50Var6 == null ? null : s50Var6.g();
        r50 r50Var2 = x50Var.e;
        if (r50Var2 != null) {
            this.p = r50Var2.g();
        }
        s50 s50Var7 = x50Var.k;
        if (s50Var7 != null) {
            this.v = s50Var7.g();
        } else {
            this.v = null;
        }
        s50 s50Var8 = x50Var.l;
        if (s50Var8 != null) {
            this.w = s50Var8.g();
        } else {
            this.w = null;
        }
    }

    public final void a(p41 p41Var) {
        p41Var.f(this.p);
        p41Var.f(this.v);
        p41Var.f(this.w);
        p41Var.f(this.l);
        p41Var.f(this.m);
        p41Var.f(this.n);
        p41Var.f(this.o);
        p41Var.f(this.q);
        p41Var.f(this.r);
        p41Var.f(this.s);
        p41Var.f(this.t);
        p41Var.f(this.u);
    }

    public final void b(k41 k41Var) {
        o41 o41Var = this.p;
        if (o41Var != null) {
            o41Var.a(k41Var);
        }
        o41 o41Var2 = this.v;
        if (o41Var2 != null) {
            o41Var2.a(k41Var);
        }
        o41 o41Var3 = this.w;
        if (o41Var3 != null) {
            o41Var3.a(k41Var);
        }
        o41 o41Var4 = this.l;
        if (o41Var4 != null) {
            o41Var4.a(k41Var);
        }
        o41 o41Var5 = this.m;
        if (o41Var5 != null) {
            o41Var5.a(k41Var);
        }
        o41 o41Var6 = this.n;
        if (o41Var6 != null) {
            o41Var6.a(k41Var);
        }
        o41 o41Var7 = this.o;
        if (o41Var7 != null) {
            o41Var7.a(k41Var);
        }
        z78 z78Var = this.q;
        if (z78Var != null) {
            z78Var.a(k41Var);
        }
        z78 z78Var2 = this.r;
        if (z78Var2 != null) {
            z78Var2.a(k41Var);
        }
        z78 z78Var3 = this.s;
        if (z78Var3 != null) {
            z78Var3.a(k41Var);
            this.s.a(new vvj(this, 0));
        }
        z78 z78Var4 = this.t;
        if (z78Var4 != null) {
            z78Var4.a(k41Var);
            this.t.a(new vvj(this, 1));
        }
        z78 z78Var5 = this.u;
        if (z78Var5 != null) {
            z78Var5.a(k41Var);
            this.u.a(new vvj(this, 2));
        }
    }

    public final boolean c(wj9 wj9Var, Object obj) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (obj == nmb.a) {
            o41 o41Var = this.l;
            if (o41Var == null) {
                this.l = new gkk(wj9Var, new PointF());
                return true;
            }
            o41Var.j(wj9Var);
            return true;
        }
        if (obj == nmb.b) {
            o41 o41Var2 = this.m;
            if (o41Var2 == null) {
                this.m = new gkk(wj9Var, new PointF());
                return true;
            }
            o41Var2.j(wj9Var);
            return true;
        }
        if (obj == nmb.c) {
            o41 o41Var3 = this.m;
            if (o41Var3 instanceof myh) {
                myh myhVar = (myh) o41Var3;
                wj9 wj9Var2 = myhVar.m;
                myhVar.m = wj9Var;
                return true;
            }
        }
        if (obj == nmb.d) {
            o41 o41Var4 = this.m;
            if (o41Var4 instanceof myh) {
                myh myhVar2 = (myh) o41Var4;
                wj9 wj9Var3 = myhVar2.n;
                myhVar2.n = wj9Var;
                return true;
            }
        }
        if (obj == nmb.j) {
            o41 o41Var5 = this.n;
            if (o41Var5 == null) {
                this.n = new gkk(wj9Var, new prg());
                return true;
            }
            o41Var5.j(wj9Var);
            return true;
        }
        if (obj == nmb.k) {
            o41 o41Var6 = this.o;
            if (o41Var6 == null) {
                this.o = new gkk(wj9Var, valueOf2);
                return true;
            }
            o41Var6.j(wj9Var);
            return true;
        }
        if (obj == 3) {
            o41 o41Var7 = this.p;
            if (o41Var7 == null) {
                this.p = new gkk(wj9Var, 100);
                return true;
            }
            o41Var7.j(wj9Var);
            return true;
        }
        if (obj == nmb.A) {
            o41 o41Var8 = this.v;
            if (o41Var8 == null) {
                this.v = new gkk(wj9Var, valueOf);
                return true;
            }
            o41Var8.j(wj9Var);
            return true;
        }
        if (obj == nmb.B) {
            o41 o41Var9 = this.w;
            if (o41Var9 == null) {
                this.w = new gkk(wj9Var, valueOf);
                return true;
            }
            o41Var9.j(wj9Var);
            return true;
        }
        if (obj == nmb.o) {
            z78 z78Var = this.q;
            if (z78Var == null) {
                z78Var = new z78(Collections.singletonList(new nja(valueOf2)));
                this.q = z78Var;
            }
            z78Var.j(wj9Var);
            return true;
        }
        if (obj == nmb.p) {
            z78 z78Var2 = this.r;
            if (z78Var2 == null) {
                z78Var2 = new z78(Collections.singletonList(new nja(valueOf2)));
                this.r = z78Var2;
            }
            z78Var2.j(wj9Var);
            return true;
        }
        if (obj == nmb.l) {
            z78 z78Var3 = this.s;
            if (z78Var3 == null) {
                z78Var3 = new z78(Collections.singletonList(new nja(valueOf2)));
                this.s = z78Var3;
            }
            z78Var3.j(wj9Var);
            return true;
        }
        if (obj == nmb.m) {
            z78 z78Var4 = this.t;
            if (z78Var4 == null) {
                z78Var4 = new z78(Collections.singletonList(new nja(valueOf2)));
                this.t = z78Var4;
            }
            z78Var4.j(wj9Var);
            return true;
        }
        if (obj != nmb.n) {
            return false;
        }
        z78 z78Var5 = this.u;
        if (z78Var5 == null) {
            z78Var5 = new z78(Collections.singletonList(new nja(valueOf2)));
            this.u = z78Var5;
        }
        z78Var5.j(wj9Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        z78 z78Var;
        z78 z78Var2;
        PointF pointF;
        prg prgVar;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        z78 z78Var3 = this.s;
        if ((z78Var3 == null || z78Var3.l() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (((z78Var = this.t) == null || z78Var.l() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((z78Var2 = this.u) == null || z78Var2.l() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            o41 o41Var = this.m;
            if (o41Var != null && (pointF2 = (PointF) o41Var.e()) != null) {
                float f = pointF2.x;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                o41 o41Var2 = this.o;
                if (o41Var2 != null) {
                    float floatValue = o41Var2 instanceof gkk ? ((Float) o41Var2.e()).floatValue() : ((z78) o41Var2).l();
                    if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (o41Var != null) {
                float f2 = o41Var.d;
                PointF pointF3 = (PointF) o41Var.e();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                o41Var.i(1.0E-4f + f2);
                PointF pointF4 = (PointF) o41Var.e();
                o41Var.i(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            if (this.q != null) {
                float cos = this.r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float sin = this.r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f5 = -sin;
                fArr[3] = f5;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f5;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            o41 o41Var3 = this.n;
            if (o41Var3 != null && (prgVar = (prg) o41Var3.e()) != null) {
                float f6 = prgVar.a;
                if (f6 != 1.0f || prgVar.b != 1.0f) {
                    matrix.preScale(f6, prgVar.b);
                }
            }
            o41 o41Var4 = this.l;
            if (o41Var4 != null && (pointF = (PointF) o41Var4.e()) != null) {
                float f7 = pointF.x;
                if (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            z78 z78Var4 = this.s;
            float l = z78Var4 != null ? z78Var4.l() : 0.0f;
            z78 z78Var5 = this.t;
            float l2 = z78Var5 != null ? z78Var5.l() : 0.0f;
            z78 z78Var6 = this.u;
            float l3 = z78Var6 != null ? z78Var6.l() : 0.0f;
            if (this.k || l != this.f || l2 != this.g || l3 != this.h) {
                this.f = l;
                this.g = l2;
                this.h = l3;
                if (l != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.i = (float) Math.cos(Math.toRadians(l));
                } else {
                    this.i = 1.0f;
                }
                if (l2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.j = (float) Math.cos(Math.toRadians(l2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            o41 o41Var5 = this.l;
            PointF pointF5 = o41Var5 == null ? null : (PointF) o41Var5.e();
            o41 o41Var6 = this.m;
            PointF pointF6 = o41Var6 == null ? null : (PointF) o41Var6.e();
            o41 o41Var7 = this.n;
            prg prgVar2 = o41Var7 != null ? (prg) o41Var7.e() : null;
            float f8 = prgVar2 != null ? prgVar2.a : 1.0f;
            float f9 = prgVar2 != null ? prgVar2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF6.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (l3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preRotate(l3);
            }
            if (l2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(f11, 1.0f);
            }
            if (l != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF5.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        o41 o41Var = this.m;
        PointF pointF = o41Var == null ? null : (PointF) o41Var.e();
        o41 o41Var2 = this.n;
        prg prgVar = o41Var2 == null ? null : (prg) o41Var2.e();
        o41 o41Var3 = this.l;
        PointF pointF2 = o41Var3 != null ? (PointF) o41Var3.e() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        z78 z78Var = this.s;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float l = z78Var != null ? z78Var.l() * f : 0.0f;
        z78 z78Var2 = this.t;
        float l2 = z78Var2 != null ? z78Var2.l() * f : 0.0f;
        z78 z78Var3 = this.u;
        float l3 = z78Var3 != null ? z78Var3.l() * f : 0.0f;
        if (l == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && l2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && l3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            o41 o41Var4 = this.o;
            if (o41Var4 != null) {
                float floatValue = ((Float) o41Var4.e()).floatValue() * f;
                float f3 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f2 = pointF2.y;
                }
                matrix.preRotate(floatValue, f3, f2);
            }
        } else {
            float cos = l != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (float) Math.cos(Math.toRadians(l)) : 1.0f;
            float cos2 = l2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (float) Math.cos(Math.toRadians(l2)) : 1.0f;
            if (l3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f4 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f2 = pointF2.y;
                }
                matrix.preRotate(l3, f4, f2);
            }
            if (l2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(cos2, 1.0f);
            }
            if (l != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, cos);
            }
        }
        if (prgVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(prgVar.a, d), (float) Math.pow(prgVar.b, d));
        }
        return matrix;
    }
}
