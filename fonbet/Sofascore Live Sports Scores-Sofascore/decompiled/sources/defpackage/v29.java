package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v29 implements p29 {
    public static final u29 C = new u29();
    public float A;
    public qy1 B;
    public final ba5 b;
    public final xj2 c;
    public final itk d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;
    public float z;

    public v29(ba5 ba5Var) {
        xj2 xj2Var = new xj2();
        wj2 wj2Var = new wj2();
        this.b = ba5Var;
        this.c = xj2Var;
        itk itkVar = new itk(ba5Var, xj2Var, wj2Var);
        this.d = itkVar;
        this.e = ba5Var.getResources();
        this.f = new Rect();
        ba5Var.addView(itkVar);
        itkVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = r13.b;
        this.w = j;
        this.x = j;
    }

    @Override // defpackage.p29
    public final float A() {
        return this.r;
    }

    @Override // defpackage.p29
    public final void B(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.p29
    public final void C(float f) {
        this.A = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.p29
    public final void D(Outline outline, long j) {
        itk itkVar = this.d;
        itkVar.e = outline;
        itkVar.invalidateOutline();
        if ((this.m || itkVar.getClipToOutline()) && outline != null) {
            itkVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.p29
    public final void E(uj2 uj2Var) {
        Rect rect;
        boolean z = this.k;
        itk itkVar = this.d;
        if (z) {
            if ((this.m || itkVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = itkVar.getWidth();
                rect.bottom = itkVar.getHeight();
            } else {
                rect = null;
            }
            itkVar.setClipBounds(rect);
        }
        if (xx.b(uj2Var).isHardwareAccelerated()) {
            this.b.a(uj2Var, itkVar, itkVar.getDrawingTime());
        }
    }

    @Override // defpackage.p29
    public final void F(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.p29
    public final void G(long j) {
        long j2 = 9223372034707292159L & j;
        itk itkVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            itkVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            itkVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c90.I(itkVar);
                return;
            }
            this.q = true;
            itkVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            itkVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.p29
    public final void H(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.p29
    public final float I() {
        return this.u;
    }

    @Override // defpackage.p29
    public final float J() {
        return this.t;
    }

    @Override // defpackage.p29
    public final float K() {
        return this.y;
    }

    @Override // defpackage.p29
    public final void L(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.p29
    public final void M(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.p29
    public final float N() {
        return this.v;
    }

    @Override // defpackage.p29
    public final float O() {
        return this.s;
    }

    public final void P(int i) {
        Paint paint = this.g;
        itk itkVar = this.d;
        boolean z = true;
        if (i == 1) {
            itkVar.setLayerType(2, paint);
        } else if (i == 2) {
            itkVar.setLayerType(0, paint);
            z = false;
        } else {
            itkVar.setLayerType(0, paint);
        }
        itkVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // defpackage.p29
    public final float a() {
        return this.p;
    }

    @Override // defpackage.p29
    public final qy1 b() {
        return this.B;
    }

    @Override // defpackage.p29
    public final void c(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.p29
    public final void d(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(eq3.Z(i)));
        Q();
    }

    @Override // defpackage.p29
    public final void e() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.p29
    public final int f() {
        return this.o;
    }

    @Override // defpackage.p29
    public final ay1 g() {
        return null;
    }

    @Override // defpackage.p29
    public final void h(int i, int i2, long j) {
        boolean a = c7a.a(this.j, j);
        itk itkVar = this.d;
        if (a) {
            int i3 = this.h;
            if (i3 != i) {
                itkVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                itkVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || itkVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            itkVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                itkVar.setPivotX(i5 / 2.0f);
                itkVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.p29
    public final float i() {
        return this.z;
    }

    @Override // defpackage.p29
    public final float k() {
        return this.A;
    }

    @Override // defpackage.p29
    public final long l() {
        return this.w;
    }

    @Override // defpackage.p29
    public final long m() {
        return this.x;
    }

    @Override // defpackage.p29
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            c90.Q(hkg.s0(j), this.d);
        }
    }

    @Override // defpackage.p29
    public final void o() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // defpackage.p29
    public final void p(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.p29
    public final float q() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.p29
    public final void r(qy1 qy1Var) {
        this.B = qy1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            qz.B(this.d, qy1Var);
        }
    }

    @Override // defpackage.p29
    public final void s(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.p29
    public final void t(kx4 kx4Var, ema emaVar, n29 n29Var, oo ooVar) {
        itk itkVar = this.d;
        ViewParent parent = itkVar.getParent();
        ba5 ba5Var = this.b;
        if (parent == null) {
            ba5Var.addView(itkVar);
        }
        itkVar.g = kx4Var;
        itkVar.h = emaVar;
        itkVar.i = ooVar;
        itkVar.j = n29Var;
        if (itkVar.isAttachedToWindow()) {
            itkVar.setVisibility(4);
            itkVar.setVisibility(0);
            try {
                wx wxVar = this.c.a;
                u29 u29Var = C;
                Canvas canvas = wxVar.a;
                wxVar.a = u29Var;
                ba5Var.a(wxVar, itkVar, itkVar.getDrawingTime());
                wxVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.p29
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            c90.R(hkg.s0(j), this.d);
        }
    }

    @Override // defpackage.p29
    public final Matrix v() {
        return this.d.getMatrix();
    }

    @Override // defpackage.p29
    public final void w(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.p29
    public final void x(float f) {
        this.y = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.p29
    public final int y() {
        return this.n;
    }

    @Override // defpackage.p29
    public final void z(float f) {
        this.z = f;
        this.d.setRotationY(f);
    }
}
