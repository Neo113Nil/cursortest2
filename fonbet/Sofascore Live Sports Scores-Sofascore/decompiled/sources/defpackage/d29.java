package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d29 extends a71 {
    public gkk A;
    public final String q;
    public final boolean r;
    public final nkb s;
    public final nkb t;
    public final RectF u;
    public final int v;
    public final int w;
    public final y19 x;
    public final y19 y;
    public final y19 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d29(gmb gmbVar, p41 p41Var, c29 c29Var) {
        super(gmbVar, p41Var, r3, r4, c29Var.j, c29Var.d, c29Var.g, c29Var.k, c29Var.l);
        Paint.Join join;
        Paint.Join join2;
        int C = wt3.C(c29Var.h);
        Paint.Cap cap = C != 0 ? C != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int C2 = wt3.C(c29Var.i);
        if (C2 == 0) {
            join = Paint.Join.MITER;
        } else if (C2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (C2 != 2) {
                join2 = null;
                this.s = new nkb((Object) null);
                this.t = new nkb((Object) null);
                this.u = new RectF();
                this.q = c29Var.a;
                this.v = c29Var.b;
                this.r = c29Var.m;
                this.w = (int) (gmbVar.a.b() / 32.0f);
                o41 g = c29Var.c.g();
                this.x = (y19) g;
                g.a(this);
                p41Var.f(g);
                o41 g2 = c29Var.e.g();
                this.y = (y19) g2;
                g2.a(this);
                p41Var.f(g2);
                o41 g3 = c29Var.f.g();
                this.z = (y19) g3;
                g3.a(this);
                p41Var.f(g3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        this.s = new nkb((Object) null);
        this.t = new nkb((Object) null);
        this.u = new RectF();
        this.q = c29Var.a;
        this.v = c29Var.b;
        this.r = c29Var.m;
        this.w = (int) (gmbVar.a.b() / 32.0f);
        o41 g4 = c29Var.c.g();
        this.x = (y19) g4;
        g4.a(this);
        p41Var.f(g4);
        o41 g22 = c29Var.e.g();
        this.y = (y19) g22;
        g22.a(this);
        p41Var.f(g22);
        o41 g32 = c29Var.f.g();
        this.z = (y19) g32;
        g32.a(this);
        p41Var.f(g32);
    }

    @Override // defpackage.a71, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        if (obj == nmb.J) {
            gkk gkkVar = this.A;
            p41 p41Var = this.f;
            if (gkkVar != null) {
                p41Var.o(gkkVar);
            }
            if (wj9Var == null) {
                this.A = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.A = gkkVar2;
            gkkVar2.a(this);
            p41Var.f(this.A);
        }
    }

    public final int[] f(int[] iArr) {
        gkk gkkVar = this.A;
        if (gkkVar != null) {
            Integer[] numArr = (Integer[]) gkkVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.a71, defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        e(this.u, matrix, false);
        int i2 = this.v;
        y19 y19Var = this.x;
        y19 y19Var2 = this.z;
        y19 y19Var3 = this.y;
        if (i2 == 1) {
            long h = h();
            nkb nkbVar = this.s;
            shader = (LinearGradient) nkbVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) y19Var3.e();
                PointF pointF2 = (PointF) y19Var2.e();
                x19 x19Var = (x19) y19Var.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(x19Var.b), x19Var.a, Shader.TileMode.CLAMP);
                nkbVar.g(radialGradient, h);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.g(canvas, matrix, i, uc5Var);
        }
        long h2 = h();
        nkb nkbVar2 = this.t;
        shader = (RadialGradient) nkbVar2.c(h2);
        if (shader == null) {
            PointF pointF3 = (PointF) y19Var3.e();
            PointF pointF4 = (PointF) y19Var2.e();
            x19 x19Var2 = (x19) y19Var.e();
            int[] f = f(x19Var2.b);
            float[] fArr = x19Var2.a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), f, fArr, Shader.TileMode.CLAMP);
            nkbVar2.g(radialGradient, h2);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, uc5Var);
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.q;
    }

    public final int h() {
        float f = this.y.d;
        float f2 = this.w;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.z.d * f2);
        int round3 = Math.round(this.x.d * f2);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
