package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.j9s;
import xsna.jog0;
import xsna.sex0;

/* loaded from: classes.dex */
public final class RoundedCornersDrawable extends j9s implements jog0 {
    public Type f;
    public final RectF g;
    public RectF h;
    public Matrix i;
    public final float[] j;
    public final float[] k;
    public final Paint l;
    public boolean m;
    public float n;
    public int o;
    public int p;
    public float q;
    public boolean r;
    public boolean s;
    public final Path t;
    public final Path u;
    public final RectF v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes12.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CLIPPING;
        public static final Type OVERLAY_COLOR;

        static {
            Type type = new Type("OVERLAY_COLOR", 0);
            OVERLAY_COLOR = type;
            Type type2 = new Type("CLIPPING", 1);
            CLIPPING = type2;
            $VALUES = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornersDrawable(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.f = Type.OVERLAY_COLOR;
        this.g = new RectF();
        this.j = new float[8];
        this.k = new float[8];
        this.l = new Paint(1);
        this.m = false;
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = 0;
        this.p = 0;
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.r = false;
        this.s = false;
        this.t = new Path();
        this.u = new Path();
        this.v = new RectF();
    }

    @Override // xsna.jog0
    public final void a(float f, int i) {
        this.o = i;
        this.n = f;
        q();
        invalidateSelf();
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Rect bounds = getBounds();
        RectF rectF = this.g;
        rectF.set(bounds);
        int i = a.a[this.f.ordinal()];
        Path path = this.t;
        Paint paint = this.l;
        if (i != 1) {
            if (i == 2) {
                if (this.r) {
                    RectF rectF2 = this.h;
                    if (rectF2 == null) {
                        this.h = new RectF(rectF);
                        this.i = new Matrix();
                    } else {
                        rectF2.set(rectF);
                    }
                    RectF rectF3 = this.h;
                    float f = this.n;
                    rectF3.inset(f, f);
                    Matrix matrix = this.i;
                    if (matrix != null) {
                        matrix.setRectToRect(rectF, this.h, Matrix.ScaleToFit.FILL);
                    }
                    int save = canvas.save();
                    canvas.clipRect(rectF);
                    canvas.concat(this.i);
                    super.draw(canvas);
                    canvas.restoreToCount(save);
                } else {
                    super.draw(canvas);
                }
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.p);
                paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                paint.setFilterBitmap(this.s);
                path.setFillType(Path.FillType.EVEN_ODD);
                canvas.drawPath(path, paint);
                if (this.m) {
                    float width = ((rectF.width() - rectF.height()) + this.n) / 2.0f;
                    float height = ((rectF.height() - rectF.width()) + this.n) / 2.0f;
                    if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f2 = rectF.left;
                        canvas2 = canvas;
                        canvas2.drawRect(f2, rectF.top, f2 + width, rectF.bottom, paint);
                        float f3 = rectF.right;
                        canvas2.drawRect(f3 - width, rectF.top, f3, rectF.bottom, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f4 = rectF.left;
                        float f5 = rectF.top;
                        canvas2.drawRect(f4, f5, rectF.right, f5 + height, paint);
                        float f6 = rectF.left;
                        float f7 = rectF.bottom;
                        canvas2.drawRect(f6, f7 - height, rectF.right, f7, paint);
                    }
                }
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            int save2 = canvas2.save();
            canvas2.clipPath(path);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
        }
        if (this.o != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.o);
            paint.setStrokeWidth(this.n);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas2.drawPath(this.u, paint);
        }
    }

    @Override // xsna.jog0
    public final void e(boolean z) {
        if (this.s != z) {
            this.s = z;
            invalidateSelf();
        }
    }

    @Override // xsna.jog0
    public final void f(boolean z) {
        this.m = z;
        q();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void g(float f) {
        this.q = f;
        q();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void i(float[] fArr) {
        float[] fArr2 = this.j;
        if (fArr == null) {
            Arrays.fill(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            sex0.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        q();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void j(float f) {
        Arrays.fill(this.j, f);
        q();
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void n(boolean z) {
        this.r = z;
        q();
        invalidateSelf();
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q();
    }

    public final void q() {
        float[] fArr;
        Path path = this.t;
        path.reset();
        Path path2 = this.u;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.v;
        rectF.set(bounds);
        float f = this.q;
        rectF.inset(f, f);
        if (this.f == Type.OVERLAY_COLOR) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z = this.m;
        float[] fArr2 = this.j;
        if (z) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = this.q;
        rectF.inset(-f2, -f2);
        float f3 = this.n;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.m) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.k;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.q) - (this.n / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = this.n;
        rectF.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // xsna.jog0
    public final void k() {
    }
}
