package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public c f35691a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f35692b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f35693c;

    /* renamed from: d, reason: collision with root package name */
    public final PathMeasure f35694d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f35695e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public float f35696a;

        /* renamed from: b, reason: collision with root package name */
        public float f35697b;

        /* renamed from: c, reason: collision with root package name */
        public int f35698c;

        /* renamed from: d, reason: collision with root package name */
        public int f35699d;

        /* renamed from: e, reason: collision with root package name */
        public float f35700e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f35701f;

        /* renamed from: g, reason: collision with root package name */
        public float f35702g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f35703h;
    }

    public l(c cVar) {
        Path path = new Path();
        this.f35692b = path;
        this.f35693c = new Path();
        this.f35694d = new PathMeasure(path, false);
        this.f35691a = cVar;
        this.f35695e = new Matrix();
    }

    public abstract void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11);

    public abstract void b(Canvas canvas, Paint paint, int i10, int i11);

    public abstract void c(Canvas canvas, Paint paint, a aVar, int i10);

    public abstract void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12);

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public void h(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f35691a.h();
        a(canvas, rect, f10, z10, z11);
    }

    public float i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f35704a;
        float[] posVec;
        float[] tanVec;

        public b() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.f35704a = new Matrix();
        }

        public void a(float f10) {
            float[] fArr = this.tanVec;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d10 = f10;
            double d11 = atan2;
            this.posVec[0] = (float) (r2[0] + (Math.cos(d11) * d10));
            this.posVec[1] = (float) (r14[1] + (d10 * Math.sin(d11)));
        }

        public void b(float f10) {
            float[] fArr = this.tanVec;
            float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d10 = f10;
            double d11 = atan2;
            this.posVec[0] = (float) (r2[0] + (Math.cos(d11) * d10));
            this.posVec[1] = (float) (r14[1] + (d10 * Math.sin(d11)));
        }

        public void c() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.f35704a.reset();
        }

        public void d(float f10) {
            this.f35704a.reset();
            this.f35704a.setRotate(f10);
            this.f35704a.mapPoints(this.posVec);
            this.f35704a.mapPoints(this.tanVec);
        }

        public void e(float f10, float f11) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f10;
            fArr[1] = fArr[1] * f11;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f10;
            fArr2[1] = fArr2[1] * f11;
        }

        public void f(float f10, float f11) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f10;
            fArr[1] = fArr[1] + f11;
        }

        public b(l lVar, b bVar) {
            this(bVar.posVec, bVar.tanVec);
        }

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.f35704a = new Matrix();
        }
    }
}
