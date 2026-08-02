package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s29 implements p29 {
    public static final AtomicBoolean C = new AtomicBoolean(true);
    public boolean A;
    public qy1 B;
    public final xj2 b;
    public final wj2 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public s29(xy xyVar, xj2 xj2Var, wj2 wj2Var) {
        this.b = xj2Var;
        this.c = wj2Var;
        RenderNode create = RenderNode.create("Compose", xyVar);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (C.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                oyf.c(create, oyf.a(create));
                oyf.d(create, oyf.b(create));
            }
            nyf.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = r13.b;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    @Override // defpackage.p29
    public final float A() {
        return this.n;
    }

    @Override // defpackage.p29
    public final void B(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.p29
    public final void C(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.p29
    public final void D(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.p29
    public final void E(uj2 uj2Var) {
        DisplayListCanvas b = xx.b(uj2Var);
        b.getClass();
        b.drawRenderNode(this.d);
    }

    @Override // defpackage.p29
    public final void F(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.p29
    public final void G(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.p29
    public final void H(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.p29
    public final float I() {
        return this.q;
    }

    @Override // defpackage.p29
    public final float J() {
        return this.p;
    }

    @Override // defpackage.p29
    public final float K() {
        return this.u;
    }

    @Override // defpackage.p29
    public final void L(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.p29
    public final void M(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.p29
    public final float N() {
        return this.r;
    }

    @Override // defpackage.p29
    public final float O() {
        return this.o;
    }

    public final void P() {
        boolean z = this.y;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.z) {
            this.z = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.A) {
            this.A = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // defpackage.p29
    public final float a() {
        return this.l;
    }

    @Override // defpackage.p29
    public final qy1 b() {
        return this.B;
    }

    @Override // defpackage.p29
    public final void c(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.p29
    public final void d(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(eq3.Z(i)));
        R();
    }

    @Override // defpackage.p29
    public final void e() {
        nyf.a(this.d);
    }

    @Override // defpackage.p29
    public final int f() {
        return this.j;
    }

    @Override // defpackage.p29
    public final ay1 g() {
        return null;
    }

    @Override // defpackage.p29
    public final void h(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (c7a.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.p29
    public final float i() {
        return this.v;
    }

    @Override // defpackage.p29
    public final boolean j() {
        return this.d.isValid();
    }

    @Override // defpackage.p29
    public final float k() {
        return this.w;
    }

    @Override // defpackage.p29
    public final long l() {
        return this.s;
    }

    @Override // defpackage.p29
    public final long m() {
        return this.t;
    }

    @Override // defpackage.p29
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            oyf.c(this.d, hkg.s0(j));
        }
    }

    @Override // defpackage.p29
    public final void o() {
        R();
    }

    @Override // defpackage.p29
    public final void p(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.p29
    public final float q() {
        return this.x;
    }

    @Override // defpackage.p29
    public final void r(qy1 qy1Var) {
        this.B = qy1Var;
    }

    @Override // defpackage.p29
    public final void s(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.p29
    public final void t(kx4 kx4Var, ema emaVar, n29 n29Var, oo ooVar) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            wx wxVar = this.b.a;
            Canvas canvas = wxVar.a;
            wxVar.a = start;
            wj2 wj2Var = this.c;
            sx2 sx2Var = wj2Var.b;
            long I = d7a.I(this.e);
            kx4 u = sx2Var.u();
            ema z = sx2Var.z();
            uj2 t = sx2Var.t();
            long D = sx2Var.D();
            n29 n29Var2 = (n29) sx2Var.b;
            sx2Var.L(kx4Var);
            sx2Var.M(emaVar);
            sx2Var.K(wxVar);
            sx2Var.N(I);
            sx2Var.b = n29Var;
            wxVar.o();
            try {
                ooVar.invoke(wj2Var);
                wxVar.h();
                sx2Var.L(u);
                sx2Var.M(z);
                sx2Var.K(t);
                sx2Var.N(D);
                sx2Var.b = n29Var2;
                wxVar.a = canvas;
            } catch (Throwable th) {
                wxVar.h();
                sx2 sx2Var2 = wj2Var.b;
                sx2Var2.L(u);
                sx2Var2.M(z);
                sx2Var2.K(t);
                sx2Var2.N(D);
                sx2Var2.b = n29Var2;
                throw th;
            }
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.p29
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            oyf.d(this.d, hkg.s0(j));
        }
    }

    @Override // defpackage.p29
    public final Matrix v() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.p29
    public final void w(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.p29
    public final void x(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.p29
    public final int y() {
        return this.k;
    }

    @Override // defpackage.p29
    public final void z(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }
}
