package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class d {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;

    /* compiled from: ShapePath.java */
    /* loaded from: classes13.dex */
    public static class a extends g {
        public final c c;

        public a(c cVar) {
            this.c = cVar;
        }

        @Override // com.google.android.material.shape.d.g
        public final void a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            c cVar = this.c;
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(cVar.b, cVar.c, cVar.d, cVar.e), i, cVar.f, cVar.g);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes13.dex */
    public static class b extends g {
        public final e c;
        public final float d;
        public final float e;

        public b(e eVar, float f, float f2) {
            this.c = eVar;
            this.d = f;
            this.e = f2;
        }

        @Override // com.google.android.material.shape.d.g
        public final void a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            e eVar = this.c;
            float f = eVar.c;
            float f2 = this.e;
            float f3 = eVar.b;
            float f4 = this.d;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(f - f2, f3 - f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            shadowRenderer.drawEdgeShadow(canvas, matrix2, rectF, i);
        }

        public final float b() {
            e eVar = this.c;
            return (float) Math.toDegrees(Math.atan((eVar.c - this.e) / (eVar.b - this.d)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes13.dex */
    public static class c extends f {
        public static final RectF h = new RectF();

        @Deprecated
        public final float b;

        @Deprecated
        public final float c;

        @Deprecated
        public final float d;

        @Deprecated
        public final float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        public static void b(c cVar, float f) {
            cVar.f = f;
        }

        public static void c(c cVar, float f) {
            cVar.g = f;
        }

        @Override // com.google.android.material.shape.d.f
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f = this.d;
            float f2 = this.e;
            RectF rectF = h;
            rectF.set(this.b, this.c, f, f2);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: com.google.android.material.shape.d$d, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0125d extends f {
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        public C0125d(float f, float f2, float f3, float f4, float f5, float f6) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = f6;
        }

        @Override // com.google.android.material.shape.d.f
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes13.dex */
    public static class e extends f {
        public float b;
        public float c;

        @Override // com.google.android.material.shape.d.f
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes13.dex */
    public static abstract class f {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    public static abstract class g {
        public static final Matrix b = new Matrix();
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);
    }

    public d() {
        e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        c.b(cVar, f6);
        c.c(cVar, f7);
        this.g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.h.add(aVar);
        this.e = f9;
        double d = f8;
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
        this.d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.c;
        float f6 = this.d;
        c cVar = new c(f5, f6, f5, f6);
        c.b(cVar, this.e);
        c.c(cVar, f4);
        this.h.add(new a(cVar));
        this.e = f2;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((f) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        b bVar = new b(eVar, this.c, this.d);
        float b2 = bVar.b() + 270.0f;
        float b3 = bVar.b() + 270.0f;
        b(b2);
        this.h.add(bVar);
        this.e = b3;
        this.c = f2;
        this.d = f3;
    }

    public final void e(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}
