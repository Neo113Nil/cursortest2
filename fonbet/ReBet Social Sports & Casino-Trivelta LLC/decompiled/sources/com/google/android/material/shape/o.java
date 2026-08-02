package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class o {
    private final p[] cornerPaths = new p[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];

    /* renamed from: a, reason: collision with root package name */
    public final PointF f35839a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final Path f35840b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f35841c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final p f35842d = new p();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];

    /* renamed from: e, reason: collision with root package name */
    public final Path f35843e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f35844f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public boolean f35845g = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f35846a = new o();
    }

    public interface b {
        void a(p pVar, Matrix matrix, int i10);

        void b(p pVar, Matrix matrix, int i10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final n f35847a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f35848b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f35849c;

        /* renamed from: d, reason: collision with root package name */
        public final b f35850d;

        /* renamed from: e, reason: collision with root package name */
        public final float f35851e;

        public c(n nVar, float f10, RectF rectF, b bVar, Path path) {
            this.f35850d = bVar;
            this.f35847a = nVar;
            this.f35851e = f10;
            this.f35849c = rectF;
            this.f35848b = path;
        }
    }

    public o() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.cornerPaths[i10] = new p();
            this.cornerTransforms[i10] = new Matrix();
            this.edgeTransforms[i10] = new Matrix();
        }
    }

    public static o l() {
        return a.f35846a;
    }

    public final float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    public final void b(c cVar, int i10) {
        this.scratch[0] = this.cornerPaths[i10].k();
        this.scratch[1] = this.cornerPaths[i10].l();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        if (i10 == 0) {
            Path path = cVar.f35848b;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f35848b;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i10].d(this.cornerTransforms[i10], cVar.f35848b);
        b bVar = cVar.f35850d;
        if (bVar != null) {
            bVar.a(this.cornerPaths[i10], this.cornerTransforms[i10], i10);
        }
    }

    public final void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i10].i();
        this.scratch[1] = this.cornerPaths[i10].j();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i11].k();
        this.scratch2[1] = this.cornerPaths[i11].l();
        this.cornerTransforms[i11].mapPoints(this.scratch2);
        float f10 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float j10 = j(cVar.f35849c, i10);
        this.f35842d.n(0.0f, 0.0f);
        g k10 = k(i10, cVar.f35847a);
        k10.b(max, j10, cVar.f35851e, this.f35842d);
        this.f35843e.reset();
        this.f35842d.d(this.edgeTransforms[i10], this.f35843e);
        if (this.f35845g && (k10.a() || m(this.f35843e, i10) || m(this.f35843e, i11))) {
            Path path = this.f35843e;
            path.op(path, this.f35841c, Path.Op.DIFFERENCE);
            this.scratch[0] = this.f35842d.k();
            this.scratch[1] = this.f35842d.l();
            this.edgeTransforms[i10].mapPoints(this.scratch);
            Path path2 = this.f35840b;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f35842d.d(this.edgeTransforms[i10], this.f35840b);
        } else {
            this.f35842d.d(this.edgeTransforms[i10], cVar.f35848b);
        }
        b bVar = cVar.f35850d;
        if (bVar != null) {
            bVar.b(this.f35842d, this.edgeTransforms[i10], i10);
        }
    }

    public void d(n nVar, float f10, RectF rectF, Path path) {
        e(nVar, f10, rectF, null, path);
    }

    public void e(n nVar, float f10, RectF rectF, b bVar, Path path) {
        f(nVar, null, f10, rectF, bVar, path);
    }

    public void f(n nVar, float[] fArr, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f35840b.rewind();
        this.f35841c.rewind();
        this.f35841c.addRect(rectF, Path.Direction.CW);
        c cVar = new c(nVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            n(cVar, i10, fArr);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f35840b.close();
        if (this.f35840b.isEmpty()) {
            return;
        }
        path.op(this.f35840b, Path.Op.UNION);
    }

    public final void g(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public d h(int i10, n nVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? nVar.t() : nVar.r() : nVar.j() : nVar.l();
    }

    public final e i(int i10, n nVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? nVar.s() : nVar.q() : nVar.i() : nVar.k();
    }

    public final float j(RectF rectF, int i10) {
        float[] fArr = this.scratch;
        p pVar = this.cornerPaths[i10];
        fArr[0] = pVar.f35854c;
        fArr[1] = pVar.f35855d;
        this.cornerTransforms[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    public final g k(int i10, n nVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? nVar.o() : nVar.p() : nVar.n() : nVar.h();
    }

    public final boolean m(Path path, int i10) {
        this.f35844f.reset();
        this.cornerPaths[i10].d(this.cornerTransforms[i10], this.f35844f);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f35844f.computeBounds(rectF, true);
        path.op(this.f35844f, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void n(c cVar, int i10, float[] fArr) {
        i(i10, cVar.f35847a).b(this.cornerPaths[i10], 90.0f, cVar.f35851e, cVar.f35849c, fArr == null ? h(i10, cVar.f35847a) : new com.google.android.material.shape.c(fArr[i10]));
        float a10 = a(i10);
        this.cornerTransforms[i10].reset();
        g(i10, cVar.f35849c, this.f35839a);
        Matrix matrix = this.cornerTransforms[i10];
        PointF pointF = this.f35839a;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i10].preRotate(a10);
    }

    public final void o(int i10) {
        this.scratch[0] = this.cornerPaths[i10].i();
        this.scratch[1] = this.cornerPaths[i10].j();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        float a10 = a(i10);
        this.edgeTransforms[i10].reset();
        Matrix matrix = this.edgeTransforms[i10];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i10].preRotate(a10);
    }
}
