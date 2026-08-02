package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t29 implements p29 {
    public final xj2 b;
    public final wj2 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public qy1 y;
    public int z;

    public t29() {
        xj2 xj2Var = new xj2();
        wj2 wj2Var = new wj2();
        this.b = xj2Var;
        this.c = wj2Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = r13.b;
        this.p = j;
        this.q = j;
        this.u = 8.0f;
        this.z = 0;
    }

    @Override // defpackage.p29
    public final float A() {
        return this.k;
    }

    @Override // defpackage.p29
    public final void B(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.p29
    public final void C(float f) {
        this.t = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.p29
    public final void D(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.p29
    public final void E(uj2 uj2Var) {
        xx.b(uj2Var).drawRenderNode(this.d);
    }

    @Override // defpackage.p29
    public final void F(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.p29
    public final void G(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.p29
    public final void H(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.p29
    public final float I() {
        return this.n;
    }

    @Override // defpackage.p29
    public final float J() {
        return this.m;
    }

    @Override // defpackage.p29
    public final float K() {
        return this.r;
    }

    @Override // defpackage.p29
    public final void L(int i) {
        this.z = i;
        R();
    }

    @Override // defpackage.p29
    public final void M(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.p29
    public final float N() {
        return this.o;
    }

    @Override // defpackage.p29
    public final float O() {
        return this.l;
    }

    public final void P() {
        boolean z = this.v;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.w) {
            this.w = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.x) {
            this.x = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.z;
        if (i != 1 && this.j == 3 && this.y == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // defpackage.p29
    public final float a() {
        return this.i;
    }

    @Override // defpackage.p29
    public final qy1 b() {
        return this.y;
    }

    @Override // defpackage.p29
    public final void c(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.p29
    public final void d(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(eq3.X(i));
        R();
    }

    @Override // defpackage.p29
    public final void e() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.p29
    public final int f() {
        return this.z;
    }

    @Override // defpackage.p29
    public final ay1 g() {
        return null;
    }

    @Override // defpackage.p29
    public final void h(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = d7a.I(j);
    }

    @Override // defpackage.p29
    public final float i() {
        return this.s;
    }

    @Override // defpackage.p29
    public final boolean j() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.p29
    public final float k() {
        return this.t;
    }

    @Override // defpackage.p29
    public final long l() {
        return this.p;
    }

    @Override // defpackage.p29
    public final long m() {
        return this.q;
    }

    @Override // defpackage.p29
    public final void n(long j) {
        this.p = j;
        this.d.setAmbientShadowColor(hkg.s0(j));
    }

    @Override // defpackage.p29
    public final void o() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // defpackage.p29
    public final void p(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.p29
    public final float q() {
        return this.u;
    }

    @Override // defpackage.p29
    public final void r(qy1 qy1Var) {
        this.y = qy1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            qz.A(this.d, qy1Var);
        }
    }

    @Override // defpackage.p29
    public final void s(boolean z) {
        this.v = z;
        P();
    }

    @Override // defpackage.p29
    public final void t(kx4 kx4Var, ema emaVar, n29 n29Var, oo ooVar) {
        wj2 wj2Var = this.c;
        RecordingCanvas beginRecording = this.d.beginRecording();
        try {
            xj2 xj2Var = this.b;
            wx wxVar = xj2Var.a;
            Canvas canvas = wxVar.a;
            wxVar.a = beginRecording;
            sx2 sx2Var = wj2Var.b;
            sx2Var.L(kx4Var);
            sx2Var.M(emaVar);
            sx2Var.b = n29Var;
            sx2Var.N(this.e);
            sx2Var.K(wxVar);
            ooVar.invoke(wj2Var);
            xj2Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.p29
    public final void u(long j) {
        this.q = j;
        this.d.setSpotShadowColor(hkg.s0(j));
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
        this.u = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.p29
    public final void x(float f) {
        this.r = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.p29
    public final int y() {
        return this.j;
    }

    @Override // defpackage.p29
    public final void z(float f) {
        this.s = f;
        this.d.setRotationY(f);
    }
}
