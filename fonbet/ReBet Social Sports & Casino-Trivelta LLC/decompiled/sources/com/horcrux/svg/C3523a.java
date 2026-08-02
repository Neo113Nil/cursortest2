package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.SVGLength;

/* renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3523a {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0540a f38782a;

    /* renamed from: b, reason: collision with root package name */
    public ReadableArray f38783b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38784c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38785d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix f38786e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f38787f;

    /* renamed from: g, reason: collision with root package name */
    public K f38788g;
    private final SVGLength[] mPoints;

    /* renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    public enum EnumC0540a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* renamed from: com.horcrux.svg.a$b */
    public enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    public C3523a(EnumC0540a enumC0540a, SVGLength[] sVGLengthArr, b bVar) {
        this.f38782a = enumC0540a;
        this.mPoints = sVGLengthArr;
        this.f38784c = bVar == b.OBJECT_BOUNDING_BOX;
    }

    public static void c(ReadableArray readableArray, int i10, float[] fArr, int[] iArr, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            fArr[i11] = (float) readableArray.getDouble(i12);
            iArr[i11] = (readableArray.getInt(i12 + 1) & 16777215) | (Math.round((r1 >>> 24) * f10) << 24);
        }
    }

    public final RectF a(RectF rectF) {
        float f10;
        float f11;
        if (!this.f38784c) {
            rectF = new RectF(this.f38787f);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (this.f38784c) {
            f10 = rectF.left;
            f11 = rectF.top;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        return new RectF(f10, f11, width + f10, height + f11);
    }

    public final double b(SVGLength sVGLength, double d10, float f10, float f11) {
        return M.a(sVGLength, d10, 0.0d, (this.f38784c && sVGLength.f38737b == SVGLength.UnitType.NUMBER) ? d10 : f10, f11);
    }

    public void d(b bVar) {
        this.f38785d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    public void e(ReadableArray readableArray) {
        this.f38783b = readableArray;
    }

    public void f(Matrix matrix) {
        this.f38786e = matrix;
    }

    public void g(K k10) {
        this.f38788g = k10;
    }

    public void h(Rect rect) {
        this.f38787f = rect;
    }

    public void i(Paint paint, RectF rectF, float f10, float f11) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d10;
        float f12;
        RectF a10 = a(rectF);
        float width = a10.width();
        float height = a10.height();
        float f13 = a10.left;
        float f14 = a10.top;
        float textSize = paint.getTextSize();
        if (this.f38782a == EnumC0540a.PATTERN) {
            double d11 = width;
            double b10 = b(this.mPoints[0], d11, f10, textSize);
            double d12 = height;
            double b11 = b(this.mPoints[1], d12, f10, textSize);
            double b12 = b(this.mPoints[2], d11, f10, textSize);
            double b13 = b(this.mPoints[3], d12, f10, textSize);
            if (b12 <= 1.0d || b13 <= 1.0d) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) b12, (int) b13, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF viewBox = this.f38788g.getViewBox();
            if (viewBox == null || viewBox.width() <= 0.0f || viewBox.height() <= 0.0f) {
                f12 = height;
            } else {
                f12 = height;
                RectF rectF2 = new RectF((float) b10, (float) b11, (float) b12, (float) b13);
                K k10 = this.f38788g;
                canvas.concat(q0.a(viewBox, rectF2, k10.f38700p, k10.f38701q));
            }
            if (this.f38785d) {
                canvas.scale(width / f10, f12 / f10);
            }
            this.f38788g.draw(canvas, new Paint(), f11);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f38786e;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f38783b.size();
        if (size == 0) {
            E6.a.K(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i10 = size / 2;
        int[] iArr3 = new int[i10];
        float[] fArr3 = new float[i10];
        c(this.f38783b, i10, fArr3, iArr3, f11);
        if (i10 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            E6.a.K(ReactConstants.TAG, "Gradient contains only one stop");
            fArr = fArr4;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0540a enumC0540a = this.f38782a;
        if (enumC0540a == EnumC0540a.LINEAR_GRADIENT) {
            double d13 = width;
            double d14 = f13;
            double b14 = b(this.mPoints[0], d13, f10, textSize) + d14;
            double d15 = height;
            double d16 = f14;
            LinearGradient linearGradient = new LinearGradient((float) b14, (float) (b(this.mPoints[1], d15, f10, textSize) + d16), (float) (d14 + b(this.mPoints[2], d13, f10, textSize)), (float) (b(this.mPoints[3], d15, f10, textSize) + d16), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f38786e != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f38786e);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0540a == EnumC0540a.RADIAL_GRADIENT) {
            double d17 = width;
            double b15 = b(this.mPoints[2], d17, f10, textSize);
            double d18 = height;
            double b16 = b(this.mPoints[3], d18, f10, textSize);
            if (b15 <= 0.0d || b16 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                b15 = d17;
                d10 = d18;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d10 = b16;
            }
            double d19 = d10 / b15;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.mPoints[4], d17, f10, textSize) + f13), (float) (b(this.mPoints[5], d18 / d19, f10, textSize) + (f14 / d19)), (float) b15, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d19);
            Matrix matrix5 = this.f38786e;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
