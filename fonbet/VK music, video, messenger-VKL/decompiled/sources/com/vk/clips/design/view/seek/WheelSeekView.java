package com.vk.clips.design.view.seek;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.drm0;
import xsna.epx;
import xsna.fot;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.pkx0;
import xsna.rl3;
import xsna.rqi;
import xsna.s3q0;
import xsna.swe0;

/* compiled from: WheelSeekView.kt */
/* loaded from: classes16.dex */
public class WheelSeekView extends View implements pkx0.b {
    public static final int H = iah0.a(20);
    public static final int I = iah0.a(8);
    public static final int J = iah0.a(28);
    public static final float K = iah0.b(8.0f);
    public static final float L = iah0.b(10.0f);
    public static final float M = iah0.b(1.0f);
    public static final float N = iah0.b(2.0f);
    public static final float O = iah0.b(2.0f);
    public static final int P = iah0.a(2);
    public static final float Q = iah0.b(64.0f);
    public static final float R = iah0.b(5.0f);
    public static final float S = iah0.b(4.0f);
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint.FontMetrics D;
    public final Paint.FontMetrics E;
    public float F;
    public int G;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public float[] i;
    public final int j;
    public int k;
    public float[] l;
    public Float m;
    public final Matrix n;
    public izs<? super Float, s3q0> o;
    public gzs<s3q0> p;
    public gzs<s3q0> q;
    public gzs<s3q0> r;
    public int s;
    public boolean t;
    public String u;
    public a v;
    public final pkx0 w;
    public final fot x;
    public final Paint y;
    public final Paint z;

    /* compiled from: WheelSeekView.kt */
    public interface a {
        float a(float f);
    }

    /* compiled from: WheelSeekView.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            pkx0 pkx0Var = WheelSeekView.this.w;
            pkx0Var.b.forceFinished(true);
            pkx0Var.b(pkx0.a.TOUCH_SCROLL);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            pkx0 pkx0Var = WheelSeekView.this.w;
            pkx0Var.d = 0;
            pkx0Var.b(pkx0.a.FLING);
            Scroller scroller = pkx0Var.b;
            WheelSeekView wheelSeekView = pkx0Var.a;
            scroller.fling(wheelSeekView.getOffset(), 0, -((int) f), 0, wheelSeekView.getMinOffset(), wheelSeekView.getMaxOffset(), 0, 0);
            wheelSeekView.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            pkx0 pkx0Var = WheelSeekView.this.w;
            pkx0Var.b.forceFinished(true);
            pkx0Var.b(pkx0.a.TOUCH_SCROLL);
            pkx0Var.a((int) f);
            return true;
        }
    }

    public WheelSeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e(Paint paint, float f) {
        paint.setAlpha((int) Math.ceil(f * 255.0f));
    }

    private final int getOffsetByValue() {
        return -((int) ((1.0f - this.F) * (getMaxOffset() - getMinOffset())));
    }

    private final float getValueByOffset() {
        float maxOffset = getMaxOffset() - getMinOffset();
        return (maxOffset - Math.abs(this.G)) / maxOffset;
    }

    private final void set_offset(int i) {
        if (i != this.G) {
            this.G = i;
            g();
            invalidate();
        }
    }

    public void a() {
        a aVar = this.v;
        if (aVar != null) {
            float a2 = aVar.a(this.F);
            if (this.F == a2) {
                return;
            }
            f(a2, true);
            set_offset(getOffsetByValue());
        }
    }

    public final LinearGradient b(int i) {
        float width = Q / getWidth();
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{0, i, i, i, 0}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, 0.5f, 1.0f - width, 1.0f}, Shader.TileMode.CLAMP);
        linearGradient.setLocalMatrix(this.n);
        return linearGradient;
    }

    public void c(Canvas canvas) {
        float f;
        RectF rectF = this.c;
        float centerX = rectF.centerX() - (this.s / 2.0f);
        float centerX2 = rectF.centerX() + this.G;
        float f2 = R / 2.0f;
        if (centerX2 < centerX - f2 || centerX2 > centerX + f2) {
            f = 1.0f;
        } else {
            float f3 = f2 / 2.0f;
            f = (swe0.f(Math.abs(centerX2 - centerX), f3, f2) - f3) / f3;
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f4 = (((rectF.bottom - P) - L) - S) - f2;
        float internalAlpha = getInternalAlpha() * f;
        Paint paint = this.z;
        e(paint, internalAlpha);
        canvas.drawCircle(centerX, f4, f2, paint);
    }

    @Override // android.view.View
    public final void computeScroll() {
        pkx0 pkx0Var = this.w;
        Scroller scroller = pkx0Var.b;
        if (scroller.isFinished()) {
            return;
        }
        scroller.computeScrollOffset();
        int currX = scroller.getCurrX();
        if (pkx0Var.d == 0) {
            pkx0Var.d = scroller.getStartX();
        }
        pkx0Var.a(currX - pkx0Var.d);
        pkx0Var.d = currX;
        if (scroller.isFinished()) {
            pkx0Var.b(pkx0.a.IDLE);
        }
    }

    public final void f(float f, boolean z) {
        if (this.F == f) {
            return;
        }
        this.F = f;
        if (z) {
            a aVar = this.v;
            if (aVar != null) {
                f = aVar.a(f);
            }
            izs<? super Float, s3q0> izsVar = this.o;
            if (izsVar != null) {
                izsVar.invoke(Float.valueOf(f));
            }
        }
        invalidate();
    }

    public final void g() {
        Shader shader = this.z.getShader();
        if (shader != null) {
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            matrix.setTranslate(this.G, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            shader.setLocalMatrix(matrix);
        }
        Shader shader2 = this.A.getShader();
        if (shader2 != null) {
            Matrix matrix2 = new Matrix();
            shader2.getLocalMatrix(matrix2);
            matrix2.setTranslate(this.G, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            shader2.setLocalMatrix(matrix2);
        }
    }

    public final float[] getGroupPoints() {
        return this.i;
    }

    public final float getInternalAlpha() {
        return isEnabled() ? 1.0f : 0.32f;
    }

    public final String getLabel() {
        return this.u;
    }

    public final Float getLimitValue() {
        return this.m;
    }

    @Override // xsna.pkx0.b
    public int getMaxOffset() {
        return 0;
    }

    @Override // xsna.pkx0.b
    public int getMinOffset() {
        return -this.s;
    }

    @Override // xsna.pkx0.b
    public int getOffset() {
        return this.G;
    }

    public final gzs<s3q0> getOnEndSeekListener() {
        return this.q;
    }

    public final gzs<s3q0> getOnLimitReachSeekListener() {
        return this.r;
    }

    public final izs<Float, s3q0> getOnSeekListener() {
        return this.o;
    }

    public final gzs<s3q0> getOnStartSeekListener() {
        return this.p;
    }

    @Override // xsna.pkx0.b
    public int getScrollLimit() {
        float f = this.s;
        float f2 = 1;
        Float f3 = this.m;
        return -((int) ((f2 - (f3 != null ? f3.floatValue() : 1.0f)) * f));
    }

    public final a getValueMapper() {
        return this.v;
    }

    public final Paint.FontMetrics getValuesTextFontMetrics() {
        return this.E;
    }

    public final Paint getValuesTextPaint() {
        return this.C;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.u;
        if (str != null) {
            Paint.FontMetrics fontMetrics = this.D;
            float f = (fontMetrics.bottom - fontMetrics.top) - fontMetrics.descent;
            RectF rectF = this.d;
            float f2 = rectF.top + f;
            float centerX = rectF.centerX();
            if (!drm0.N(str)) {
                canvas.drawText(str, centerX, f2, this.B);
            }
        }
        int save = canvas.save();
        canvas.translate(-this.G, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(canvas);
        float[] fArr = this.i;
        if (fArr.length != 0) {
            int length = fArr.length - this.h;
            Paint paint = this.z;
            e(paint, 0.32f);
            canvas.drawLines(fArr, 0, length, paint);
            float[] fArr2 = this.i;
            int length2 = fArr2.length - length;
            e(paint, getInternalAlpha());
            canvas.drawLines(fArr2, length, length2, paint);
            d(canvas, this.i);
        }
        float[] fArr3 = this.l;
        if (fArr3.length != 0) {
            int length3 = fArr3.length - this.k;
            Paint paint2 = this.A;
            e(paint2, 0.32f);
            canvas.drawLines(fArr3, 0, length3, paint2);
            float[] fArr4 = this.l;
            int length4 = fArr4.length - length3;
            e(paint2, getInternalAlpha());
            canvas.drawLines(fArr4, length3, length4, paint2);
        }
        canvas.restoreToCount(save);
        if (isEnabled()) {
            pkx0.a aVar = this.w.c;
            pkx0.a aVar2 = pkx0.a.IDLE;
            Paint paint3 = this.y;
            if (aVar != aVar2) {
                paint3.setColor(this.g);
            } else {
                paint3.setColor(this.f);
            }
            e(paint3, getInternalAlpha());
            RectF rectF2 = this.c;
            float centerX2 = rectF2.centerX();
            float f3 = rectF2.top;
            float f4 = P;
            canvas.drawLine(centerX2, f3 + f4, centerX2, rectF2.bottom - f4, paint3);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float paddingLeft = getPaddingLeft();
        RectF rectF = this.b;
        rectF.left = paddingLeft;
        rectF.top = getPaddingTop();
        rectF.right = getWidth() - getPaddingRight();
        rectF.bottom = getHeight() - getPaddingBottom();
        RectF rectF2 = this.c;
        rectF2.set(rectF);
        rectF2.bottom = rectF.top + J;
        RectF rectF3 = this.d;
        rectF3.set(rectF);
        float f = rectF2.bottom + I;
        rectF3.top = f;
        rectF3.bottom = f + H;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < 41; i8++) {
            if (i8 % 10 == 0) {
                i6 += 4;
            } else {
                i7 += 4;
            }
        }
        if (this.i.length < i6) {
            this.i = new float[i6];
        }
        if (this.l.length < i7) {
            this.l = new float[i7];
        }
        this.h = i6;
        this.k = i7;
        float centerX = rectF2.centerX();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 41; i11++) {
            boolean z2 = i11 % 10 == 0;
            float f3 = rectF2.bottom - P;
            float f4 = f3 - L;
            float f5 = z2 ? N : M;
            if (i11 != 0) {
                float f6 = K + f5;
                centerX -= f6;
                f2 = f6 + f2;
            }
            if (z2) {
                float[] fArr = this.i;
                fArr[i10] = centerX;
                fArr[i10 + 1] = f4;
                int i12 = i10 + 3;
                fArr[i10 + 2] = centerX;
                i10 += 4;
                fArr[i12] = f3;
            } else {
                float[] fArr2 = this.l;
                fArr2[i9] = centerX;
                fArr2[i9 + 1] = f4;
                int i13 = i9 + 3;
                fArr2[i9 + 2] = centerX;
                i9 += 4;
                fArr2[i13] = f3;
            }
        }
        this.s = (int) f2;
        Float f7 = this.m;
        if (f7 != null) {
            float abs = (Math.abs(rl3.j0(this.i) - rl3.f0(this.i)) * f7.floatValue()) - rl3.f0(this.i);
            int length = this.i.length / 4;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                int i15 = i14 * 4;
                if ((-this.i[i15]) > abs) {
                    this.h = i15;
                    break;
                }
                i14++;
            }
            int length2 = this.l.length / 4;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                int i16 = i5 * 4;
                if ((-this.l[i16]) > abs) {
                    this.k = i16;
                    break;
                }
                i5++;
            }
        }
        g();
        this.z.setShader(b(this.e));
        this.A.setShader(b(this.j));
        set_offset(getOffsetByValue());
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + J + I + H, 1073741824));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = this.x.a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            pkx0 pkx0Var = this.w;
            if (pkx0Var.c == pkx0.a.TOUCH_SCROLL) {
                pkx0Var.b(pkx0.a.IDLE);
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        this.w.a(i);
    }

    public final void setCursorScrollingColor(int i) {
        this.g = i;
    }

    public final void setGroupPoints(float[] fArr) {
        this.i = fArr;
    }

    public final void setLabel(String str) {
        if (epx.f(this.u, str)) {
            return;
        }
        this.u = str;
        invalidate();
    }

    public final void setLimitValue(Float f) {
        this.m = f;
        requestLayout();
    }

    @Override // xsna.pkx0.b
    public void setOffset(int i) {
        set_offset(i);
        if (!this.t && this.m != null && i == getScrollLimit() && this.w.c != pkx0.a.IDLE) {
            gzs<s3q0> gzsVar = this.r;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.t = true;
        }
        f(getValueByOffset(), true);
    }

    public final void setOnEndSeekListener(gzs<s3q0> gzsVar) {
        this.q = gzsVar;
    }

    public final void setOnLimitReachSeekListener(gzs<s3q0> gzsVar) {
        this.r = gzsVar;
    }

    public final void setOnSeekListener(izs<? super Float, s3q0> izsVar) {
        this.o = izsVar;
    }

    public final void setOnStartSeekListener(gzs<s3q0> gzsVar) {
        this.p = gzsVar;
    }

    public final void setValue(float f) {
        f(f, false);
        set_offset(getOffsetByValue());
    }

    public final void setValueMapper(a aVar) {
        this.v = aVar;
    }

    public WheelSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        int color = context.getColor(R.color.vk_white);
        this.e = color;
        this.f = context.getColor(R.color.vk_white);
        this.g = context.getColor(R.color.vk_blue_300);
        this.i = new float[0];
        int color2 = context.getColor(R.color.vk_gray_500);
        this.j = color2;
        this.l = new float[0];
        this.n = new Matrix();
        this.w = new pkx0(context, this);
        this.x = new fot(context, new b(), null);
        Paint b2 = rqi.b(1, color);
        Paint.Style style = Paint.Style.FILL;
        b2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        b2.setStrokeCap(cap);
        b2.setStrokeWidth(O);
        this.y = b2;
        Paint paint = new Paint(1);
        paint.setColor(color);
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(N);
        this.z = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(color2);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(M);
        this.A = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.vk_gray_100));
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.j(paint3, context, fontFamily, Float.valueOf(15.0f), 8);
        paint3.setLetterSpacing(-0.01f);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        this.B = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(R.color.vk_gray_500));
        com.vk.typography.b.j(paint4, context, fontFamily, Float.valueOf(13.0f), 8);
        paint4.setLetterSpacing(-0.01f);
        paint4.setTextAlign(align);
        this.C = paint4;
        this.D = paint3.getFontMetrics();
        this.E = paint4.getFontMetrics();
    }

    public void d(Canvas canvas, float[] fArr) {
    }
}
