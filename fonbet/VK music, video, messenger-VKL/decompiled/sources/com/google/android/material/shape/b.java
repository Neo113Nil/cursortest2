package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shape.d;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.BitSet;
import xsna.ryo;
import xsna.uuj;
import xsna.wuj;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes.dex */
public final class b {
    public final d[] a = new d[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final d g = new d();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes13.dex */
    public static class a {
        public static final b a = new b();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: com.google.android.material.shape.b$b, reason: collision with other inner class name */
    public interface InterfaceC0124b {
    }

    public b() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new d();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(com.google.android.material.shape.a aVar, float f, RectF rectF, InterfaceC0124b interfaceC0124b, @NonNull Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        d[] dVarArr;
        Matrix[] matrixArr2;
        BitSet bitSet;
        d.g[] gVarArr;
        BitSet bitSet2;
        d.g[] gVarArr2;
        char c;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            dVarArr = this.a;
            matrixArr2 = this.b;
            if (i3 >= 4) {
                break;
            }
            uuj uujVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? aVar.f : aVar.e : aVar.h : aVar.g;
            wuj wujVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? aVar.b : aVar.a : aVar.d : aVar.c;
            d dVar = dVarArr[i3];
            wujVar.getClass();
            wujVar.f(dVar, f, uujVar.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 != 1) {
                c = 1;
                if (i3 == 2) {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.bottom);
                } else if (i3 != 3) {
                    i2 = i3;
                    pointF.set(rectF.right, rectF.top);
                } else {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.top);
                }
            } else {
                c = 1;
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            d dVar2 = dVarArr[i2];
            fArr[0] = dVar2.c;
            fArr[c] = dVar2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[c]);
            matrixArr[i2].preRotate(f2);
            i3 = i4;
        }
        int i5 = 1;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            d dVar3 = dVarArr[i6];
            fArr[0] = dVar3.a;
            fArr[i5] = dVar3.b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[0], fArr[i5]);
            } else {
                path.lineTo(fArr[0], fArr[i5]);
            }
            dVarArr[i6].c(matrixArr2[i6], path);
            if (interfaceC0124b != null) {
                d dVar4 = dVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                bitSet2 = materialShapeDrawable.containsIncompatibleShadowOp;
                bitSet2.set(i6, dVar4.i);
                gVarArr2 = materialShapeDrawable.cornerShadowOperation;
                dVar4.b(dVar4.f);
                gVarArr2[i6] = new c(new ArrayList(dVar4.h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            d dVar5 = dVarArr[i6];
            fArr[0] = dVar5.c;
            fArr[i5] = dVar5.d;
            matrixArr2[i6].mapPoints(fArr);
            d dVar6 = dVarArr[i8];
            float f3 = dVar6.a;
            float[] fArr2 = this.i;
            fArr2[0] = f3;
            fArr2[i5] = dVar6.b;
            matrixArr2[i8].mapPoints(fArr2);
            d[] dVarArr2 = dVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[i5] - fArr2[i5])) - 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            d dVar7 = dVarArr2[i6];
            fArr[0] = dVar7.c;
            fArr[i5] = dVar7.d;
            matrixArr2[i6].mapPoints(fArr);
            int i9 = i5;
            float abs = (i6 == i9 || i6 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[i9]);
            d dVar8 = this.g;
            dVar8.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ryo ryoVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? aVar.j : aVar.i : aVar.l : aVar.k;
            ryoVar.b(max, abs, f, dVar8);
            Path path4 = this.j;
            path4.reset();
            dVar8.c(matrixArr[i6], path4);
            if (this.l && (ryoVar.a() || b(path4, i6) || b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = dVar8.a;
                i5 = 1;
                fArr[1] = dVar8.b;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                dVar8.c(matrixArr[i6], path2);
            } else {
                i5 = 1;
                dVar8.c(matrixArr[i6], path);
            }
            if (interfaceC0124b != null) {
                Matrix matrix2 = matrixArr[i6];
                MaterialShapeDrawable materialShapeDrawable2 = MaterialShapeDrawable.this;
                bitSet = materialShapeDrawable2.containsIncompatibleShadowOp;
                bitSet.set(i6 + 4, dVar8.i);
                gVarArr = materialShapeDrawable2.edgeShadowOperation;
                dVar8.b(dVar8.f);
                gVarArr[i6] = new c(new ArrayList(dVar8.h), new Matrix(matrix2));
            }
            dVarArr = dVarArr2;
            i6 = i7;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
