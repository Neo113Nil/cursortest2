package com.vk.newsfeed.common.recycler.holders.zhukov;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.vk.dto.photo.ImageCropData;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropZoomGestureRecognizer;
import xsna.ax0;
import xsna.gn10;
import xsna.gzs;
import xsna.h1j;
import xsna.hn10;
import xsna.in10;
import xsna.qik;

/* compiled from: CroppingHandlingBehavior.kt */
/* loaded from: classes4.dex */
public final class a {
    public final qik a;
    public final com.vk.repository.internal.repos.stickers.suggests.a b;
    public final ax0 c;
    public float e;
    public ImageCropData h;
    public Bitmap i;
    public boolean p;
    public final PointF d = new PointF();
    public final Matrix f = new Matrix();
    public final Matrix g = new Matrix();
    public final RectF j = new RectF();
    public final CropZoomGestureRecognizer k = new CropZoomGestureRecognizer();
    public final PointF l = new PointF();
    public final PointF m = new PointF();
    public final PointF n = new PointF();
    public final float[] o = new float[9];
    public final in10 q = new in10(this);
    public boolean r = true;

    /* compiled from: CroppingHandlingBehavior.kt */
    /* renamed from: com.vk.newsfeed.common.recycler.holders.zhukov.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1373a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropZoomGestureRecognizer.InteractionType.values().length];
            try {
                iArr[CropZoomGestureRecognizer.InteractionType.SCALING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropZoomGestureRecognizer.InteractionType.DRAGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(qik qikVar, com.vk.repository.internal.repos.stickers.suggests.a aVar, ax0 ax0Var) {
        this.a = qikVar;
        this.b = aVar;
        this.c = ax0Var;
    }

    public final RectF a() {
        Matrix matrix = this.g;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        return new RectF(f, f2, ((this.i != null ? r6.getWidth() : 0) * f3) + f, ((this.i != null ? r4.getHeight() : 0) * fArr[4]) + f2);
    }

    public final void b() {
        Matrix matrix = this.g;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        RectF rectF = this.j;
        ImageCropData imageCropData = new ImageCropData(null, (int) Math.floor(Math.abs(f / f3)), (int) Math.floor(Math.abs(f2 / f3)), (int) Math.floor(rectF.width() / f3), (int) Math.floor(rectF.height() / f3), 1, null);
        int c = imageCropData.c();
        int a = imageCropData.a();
        Bitmap bitmap = this.i;
        Integer valueOf = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null;
        Bitmap bitmap2 = this.i;
        Integer valueOf2 = bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null;
        if (valueOf != null && valueOf2 != null) {
            this.r = Math.abs(valueOf2.intValue() - a) >= Math.abs(valueOf.intValue() - c);
        }
        this.b.invoke(imageCropData);
    }

    public final void c(boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF = this.j;
        float f = 2;
        PointF pointF = new PointF(rectF.width() / f, rectF.height() / f);
        RectF a = a();
        PointF pointF2 = new PointF((a.width() / f) + a.left, (a.height() / f) + a.top);
        matrix.setRectToRect(rectF, a, Matrix.ScaleToFit.CENTER);
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f2 = 1.0f / fArr[0];
        float f3 = pointF.x - pointF2.x;
        float f4 = pointF.y - pointF2.y;
        Matrix matrix2 = this.g;
        matrix2.postTranslate(f3, f4);
        matrix2.postScale(f2, f2, pointF.x, pointF.y);
        qik qikVar = this.a;
        if (z) {
            d(qikVar, matrix2, new h1j(this, 3));
        } else {
            qikVar.setImageMatrix(matrix2);
        }
    }

    public final void d(qik qikVar, Matrix matrix, gzs gzsVar) {
        ValueAnimator valueAnimator;
        Matrix imageMatrix = qikVar.getImageMatrix();
        in10 in10Var = this.q;
        float[] fArr = in10Var.c;
        float[] fArr2 = in10Var.b;
        if (in10Var.a() && (valueAnimator = in10Var.f) != null) {
            valueAnimator.cancel();
        }
        imageMatrix.getValues(fArr2);
        matrix.getValues(fArr);
        ValueAnimator ofObject = ValueAnimator.ofObject(in10Var.g, fArr2, fArr);
        ofObject.addListener(new hn10(gzsVar));
        ofObject.addUpdateListener(new gn10(in10Var, 0));
        ofObject.setDuration(300L);
        ofObject.start();
        in10Var.f = ofObject;
    }

    public final void e() {
        if (!this.p) {
            if (this.i != null) {
                c(false);
                return;
            }
            return;
        }
        ImageCropData imageCropData = this.h;
        if (imageCropData != null) {
            int d = imageCropData.d();
            int e = imageCropData.e();
            int c = imageCropData.c();
            Matrix matrix = this.g;
            matrix.reset();
            float width = this.j.width() / c;
            matrix.postScale(width, width);
            matrix.postTranslate(-(d * width), -(e * width));
            this.a.setImageMatrix(matrix);
            this.f.set(matrix);
        } else {
            c(false);
        }
        b();
    }
}
