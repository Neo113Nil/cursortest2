package com.vk.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKMultiImageView;
import com.vk.typography.FontFamily;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.List;
import xsna.abg0;
import xsna.an10;
import xsna.d540;
import xsna.dhr0;
import xsna.flo;
import xsna.i35;
import xsna.m33;
import xsna.njt;
import xsna.pba0;
import xsna.upj0;
import xsna.uqm0;

/* compiled from: PhotoStackView.kt */
@Deprecated
/* loaded from: classes17.dex */
public final class PhotoStackView extends VKMultiImageView {
    public static final b M;
    public static final float N;
    public static final float O;
    public static final float P;
    public String A;
    public final float[] B;
    public final SparseIntArray C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final Path H;
    public final ColorStateList I;
    public final ColorStateList J;
    public final int K;
    public boolean L;
    public float f;
    public FontFamily g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public float n;
    public int o;
    public final a p;
    public final a q;
    public final PointF r;
    public final Rect s;
    public final GestureDetector t;
    public c u;
    public Paint v;
    public TextPaint w;
    public float x;
    public boolean y;
    public boolean z;

    /* compiled from: PhotoStackView.kt */
    public static final class a {
        public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* compiled from: PhotoStackView.kt */
    public static final class b {
        public static final float a(b bVar, float f) {
            return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
        }
    }

    /* compiled from: PhotoStackView.kt */
    public interface c {
        void a(int i);
    }

    /* compiled from: PhotoStackView.kt */
    public final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            PhotoStackView photoStackView = PhotoStackView.this;
            int marginBetweenImages = (int) (x / (photoStackView.getMarginBetweenImages() + photoStackView.getHeight()));
            if (marginBetweenImages >= photoStackView.b.b.size()) {
                return true;
            }
            photoStackView.playSoundEffect(0);
            c cVar = photoStackView.u;
            if (cVar == null) {
                return true;
            }
            cVar.a(marginBetweenImages);
            return true;
        }
    }

    static {
        b bVar = new b();
        M = bVar;
        N = TypedValue.applyDimension(2, 13.0f, Resources.getSystem().getDisplayMetrics());
        O = b.a(bVar, 2.0f);
        P = b.a(bVar, 0.5f);
    }

    public PhotoStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final float getBorderWidth() {
        return this.i;
    }

    public final float getCornerRadiusImages() {
        return this.n;
    }

    public final int getCount() {
        return this.b.b.size() + (this.z ? 1 : 0);
    }

    public final FontFamily getExtraCounterTextFontFamily() {
        return this.g;
    }

    public final float getExtraCounterTextSize() {
        return this.f;
    }

    public final float getMarginBetweenImages() {
        return this.h;
    }

    public final int getOffset() {
        return this.o;
    }

    public final PointF l(a aVar, a aVar2) {
        float f = aVar2.a - aVar.a;
        float f2 = aVar.c;
        float f3 = aVar2.c;
        float f4 = ((f * f) + ((f2 * f2) - (f3 * f3))) / (f * 2.0f);
        float sqrt = (float) Math.sqrt((f2 * f2) - (f4 * f4));
        float f5 = aVar2.b;
        float f6 = aVar.b;
        float f7 = aVar2.a;
        float f8 = aVar.a;
        float f9 = (f5 - f6) / (f7 - f8);
        PointF pointF = this.r;
        pointF.set((f9 * sqrt) + f8 + f4, ((f4 * f9) + f6) - sqrt);
        return pointF;
    }

    public final void m(int i) {
        this.A = "+" + uqm0.f(i);
        Paint paint = new Paint(1);
        paint.setColor(this.J.getColorForState(getDrawableState(), 0));
        this.v = paint;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(this.I.getColorForState(getDrawableState(), 0));
        com.vk.typography.b.j(textPaint, getContext(), this.g, Float.valueOf(i35.k(this.f / Resources.getSystem().getDisplayMetrics().density, 0)), 8);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float measureText = textPaint.measureText(this.A) / 2.0f;
        float[] fArr = this.B;
        fArr[0] = measureText;
        fArr[1] = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
        this.w = textPaint;
    }

    @Override // com.vk.imageloader.view.VKMultiImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        float f;
        SparseIntArray sparseIntArray;
        float f2;
        float[] fArr2;
        int i;
        int i2;
        float f3;
        float f4;
        Rect rect;
        a aVar;
        a aVar2;
        float f5;
        SparseIntArray sparseIntArray2;
        boolean z;
        int i3;
        boolean z2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        boolean z3 = this.m;
        float[] fArr3 = this.B;
        SparseIntArray sparseIntArray3 = this.C;
        d540<njt> d540Var = this.b;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = false;
        if (z3) {
            int height = getHeight();
            float f7 = height;
            float f8 = f7 + this.h;
            Rect rect2 = this.s;
            rect2.top = 0;
            rect2.bottom = height;
            float exactCenterY = rect2.exactCenterY();
            float f9 = f7 / 2.0f;
            float f10 = this.i / 2.0f;
            float f11 = (this.h / 2.0f) + f9;
            a aVar3 = this.p;
            aVar3.b = exactCenterY;
            aVar3.c = f11;
            a aVar4 = this.q;
            aVar4.b = exactCenterY;
            aVar4.c = f9;
            f = 2.0f;
            int count = getCount();
            int i4 = 0;
            while (i4 < count) {
                float f12 = i4;
                boolean z5 = z4;
                float f13 = (f8 * f12) - (this.o * f8);
                if (i4 > 0) {
                    float f14 = this.x;
                    if (f14 < 1.0f) {
                        f13 -= ((1.0f - f14) * f7) * f12;
                    }
                }
                boolean z6 = i4 == getCount() + (-1) ? true : z5 ? 1 : 0;
                rect2.left = an10.b(f13);
                int b2 = an10.b(f13 + f7);
                rect2.right = b2;
                if (b2 > getMeasuredWidth() || (this.z && z6)) {
                    f6 = f13;
                    break;
                }
                float f15 = f13 + f9;
                Drawable d2 = d540Var.a(i4).d();
                if (d2 == null) {
                    f4 = exactCenterY;
                    f2 = f7;
                    f3 = f9;
                    fArr2 = fArr3;
                    sparseIntArray2 = sparseIntArray3;
                    i = count;
                    i2 = i4;
                    rect = rect2;
                    aVar2 = aVar4;
                    aVar = aVar3;
                } else {
                    f2 = f7;
                    float f16 = f9;
                    d2.setAlpha(sparseIntArray3.get(i4, 255));
                    if (z6 && this.L) {
                        d2.setColorFilter(new upj0(this.K));
                    }
                    boolean p = p(i4);
                    a aVar5 = aVar3;
                    Paint paint = this.D;
                    if (p) {
                        d2.setBounds(rect2);
                        d2.draw(canvas2);
                        if (!this.j) {
                            fArr2 = fArr3;
                            i = count;
                            i2 = i4;
                            f3 = f16;
                            f4 = exactCenterY;
                            rect = rect2;
                            aVar = aVar5;
                            aVar2 = aVar4;
                        } else if (this.k) {
                            canvas2.drawCircle(f15, exactCenterY, f16 - f10, paint);
                            fArr2 = fArr3;
                            f5 = f15;
                            sparseIntArray2 = sparseIntArray3;
                            i = count;
                            i2 = i4;
                            z2 = z6;
                            f3 = f16;
                            f4 = exactCenterY;
                            rect = rect2;
                            aVar = aVar5;
                            aVar2 = aVar4;
                        } else {
                            float f17 = (f15 - f16) + f10;
                            float f18 = (exactCenterY - f16) + f10;
                            float f19 = (f15 + f16) - f10;
                            float f20 = (exactCenterY + f16) - f10;
                            float f21 = this.n;
                            f4 = exactCenterY;
                            f3 = f16;
                            float[] fArr4 = fArr3;
                            rect = rect2;
                            fArr2 = fArr4;
                            i = count;
                            aVar = aVar5;
                            i2 = i4;
                            aVar2 = aVar4;
                            canvas2.drawRoundRect(f17, f18, f19, f20, f21, f21, paint);
                        }
                        canvas2 = canvas;
                        f5 = f15;
                        sparseIntArray2 = sparseIntArray3;
                        z2 = z6;
                    } else {
                        fArr2 = fArr3;
                        i = count;
                        i2 = i4;
                        f3 = f16;
                        f4 = exactCenterY;
                        rect = rect2;
                        aVar = aVar5;
                        aVar2 = aVar4;
                        float f22 = aVar2.c;
                        float f23 = this.i / 2.0f;
                        aVar.a = this.y ? (f22 * 2.0f * this.x) + f15 : f15 - ((f22 * 2.0f) * this.x);
                        canvas2 = canvas;
                        int saveLayer = canvas2.saveLayer(rect.left, rect.top, rect.right, rect.bottom, this.F);
                        d2.setBounds(rect);
                        d2.draw(canvas2);
                        if (!this.j) {
                            f5 = f15;
                            sparseIntArray2 = sparseIntArray3;
                            z = z6;
                            i3 = saveLayer;
                        } else if (this.k) {
                            aVar2.a = f15;
                            PointF l = this.y ? l(aVar, aVar2) : l(aVar2, aVar);
                            Path path = this.H;
                            path.reset();
                            int i5 = pba0.a;
                            double a2 = pba0.a(aVar.a, aVar.b, l.x, l.y);
                            float f24 = aVar.a;
                            float f25 = aVar.c;
                            float f26 = (f24 - f25) - f23;
                            float f27 = aVar.b;
                            f5 = f15;
                            z = z6;
                            sparseIntArray2 = sparseIntArray3;
                            RectF rectF = this.G;
                            rectF.set(f26, (f27 - f25) - f23, f24 + f25 + f23, f27 + f25 + f23);
                            float f28 = (float) a2;
                            path.addArc(rectF, -f28, f28 * 2.0f);
                            double a3 = pba0.a(aVar2.a, aVar2.b, l.x, l.y);
                            rectF.set(rect.left + f23, rect.top + f23, rect.right - f23, rect.bottom - f23);
                            float f29 = (float) a3;
                            path.addArc(rectF, -f29, f29 * 2.0f);
                            canvas2.drawPath(path, paint);
                            i3 = saveLayer;
                        } else {
                            f5 = f15;
                            sparseIntArray2 = sparseIntArray3;
                            z = z6;
                            float f30 = this.n;
                            i3 = saveLayer;
                            canvas2.drawRoundRect((f5 - f22) + f23, (f4 - f22) + f23, (f5 + f22) - f23, (f4 + f22) - f23, f30, f30, paint);
                            float f31 = aVar.a;
                            float f32 = aVar.c;
                            float f33 = aVar.b;
                            float f34 = this.n;
                            canvas2 = canvas;
                            canvas2.drawRoundRect((f31 - f32) - f23, (f33 - f32) - f23, f31 + f32 + f23, f33 + f32 + f23, f34, f34, paint);
                        }
                        boolean z7 = this.l;
                        Paint paint2 = this.E;
                        if (z7) {
                            canvas2.drawCircle(aVar.a, aVar.b, aVar.c, paint2);
                        } else {
                            float f35 = aVar.a;
                            float f36 = aVar.c;
                            float f37 = aVar.b;
                            float f38 = this.n;
                            canvas2.drawRoundRect(f35 - f36, f37 - f36, f35 + f36, f37 + f36, f38, f38, paint2);
                        }
                        canvas2.restoreToCount(i3);
                        z2 = z;
                    }
                    if (z2 && this.L) {
                        String str = this.A;
                        TextPaint textPaint = this.w;
                        if (str != null && textPaint != null) {
                            canvas2.drawText(str, f5 - fArr2[z5 ? 1 : 0], f3 + fArr2[1], textPaint);
                        }
                    }
                }
                rect2 = rect;
                aVar3 = aVar;
                aVar4 = aVar2;
                f6 = f13;
                z4 = z5 ? 1 : 0;
                f7 = f2;
                f9 = f3;
                fArr3 = fArr2;
                count = i;
                sparseIntArray3 = sparseIntArray2;
                i4 = i2 + 1;
                exactCenterY = f4;
            }
            fArr = fArr3;
        } else {
            fArr = fArr3;
            SparseIntArray sparseIntArray4 = sparseIntArray3;
            f = 2.0f;
            int i6 = 0;
            int height2 = getHeight();
            float f39 = height2;
            float f40 = this.h + f39;
            int count2 = getCount() - 1;
            while (true) {
                if (-1 >= count2) {
                    break;
                }
                int count3 = this.y ? (getCount() - 1) - count2 : count2;
                float f41 = count3;
                float f42 = (f40 * f41) - (this.o * f40);
                if (count3 > 0) {
                    float f43 = this.x;
                    if (f43 < 1.0f) {
                        f42 -= ((1.0f - f43) * f39) * f41;
                    }
                }
                int b3 = an10.b(f42);
                int b4 = an10.b(f42 + f39);
                if (b4 > getWidth()) {
                    f6 = f42;
                    break;
                }
                Drawable d3 = d540Var.a(count3).d();
                if (d3 == null) {
                    sparseIntArray = sparseIntArray4;
                } else {
                    sparseIntArray = sparseIntArray4;
                    d3.setAlpha(sparseIntArray.get(count3, 255));
                    if (p(count3)) {
                        d3.setBounds(b3, i6, b4, height2);
                        d3.draw(canvas2);
                    } else {
                        d3.setBounds(b3, i6, b4, height2);
                        d3.draw(canvas2);
                    }
                }
                count2--;
                f6 = f42;
                sparseIntArray4 = sparseIntArray;
                i6 = 0;
            }
        }
        if (this.z) {
            float height3 = getHeight() / f;
            Paint paint3 = this.v;
            TextPaint textPaint2 = this.w;
            String str2 = this.A;
            if (paint3 == null || textPaint2 == null || str2 == null) {
                return;
            }
            float f44 = f6 + height3;
            if (this.m) {
                if (this.k) {
                    canvas2.drawCircle(f44, height3, height3, paint3);
                } else {
                    float f45 = this.n;
                    canvas2.drawRoundRect(f44 - height3, height3 - height3, f44 + height3, height3 + height3, f45, f45, paint3);
                }
            }
            canvas2.drawText(str2, f44 - fArr[0], height3 + fArr[1], textPaint2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            setMeasuredDimension(size2, size);
            return;
        }
        if (this.x >= 1.0f) {
            int count = getCount();
            setMeasuredDimension((count * size) + (count > 0 ? an10.b(this.h * (count - 1)) : 0), size);
            return;
        }
        int count2 = getCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (count2 > 0) {
            f = (this.h * (count2 - 1)) + size + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (count2 > 1) {
            f += (count2 - 1) * size * this.x;
        }
        setMeasuredDimension(an10.b(f), size);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setExtraCounterTextSize(state.b);
            setMarginBetweenImages(state.c);
            setBorderWidth(state.d);
            setDrawBorder(state.e);
            setRoundedImages(state.f);
            setCornerRadiusImages(state.g);
            setRoundedCut(state.h);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.f;
        state.c = this.h;
        state.d = this.i;
        state.e = this.j;
        state.f = this.k;
        state.g = this.n;
        state.h = this.l;
        return state;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setOverlapOffset(this.x);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.u == null || this.x != 1.0f) {
            return super.onTouchEvent(motionEvent);
        }
        this.t.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean p(int i) {
        return this.x == 1.0f || (i == 0 && !this.y) || (this.y && i == getCount() - 1);
    }

    public final void r(int i, List list) {
        int size = list.size();
        if (i >= 0) {
            if (size <= i) {
                i = size;
            }
            size = i;
        }
        setCount(size);
        for (int i2 = 0; i2 < size; i2++) {
            h(i2, (String) list.get(i2));
        }
    }

    public final void setBorderWidth(float f) {
        this.i = b.a(M, f);
        invalidate();
    }

    public final void setCornerRadiusImages(float f) {
        this.n = b.a(M, f);
        x();
        invalidate();
    }

    public final void setCount(int i) {
        if (this.b.b.size() != i) {
            k();
            Drawable drawable = this.d;
            this.d = null;
            for (int i2 = 0; i2 < i; i2++) {
                b();
            }
            setPlaceholder(drawable);
            x();
            requestLayout();
        }
    }

    public final void setDrawBackgrounds(boolean z) {
        this.m = z;
        invalidate();
    }

    public final void setDrawBorder(boolean z) {
        this.j = z;
        invalidate();
    }

    public final void setExtraCounterTextFontFamily(FontFamily fontFamily) {
        this.g = fontFamily;
        invalidate();
    }

    public final void setExtraCounterTextSize(float f) {
        this.f = TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
        invalidate();
    }

    public final void setListener(c cVar) {
        this.u = cVar;
    }

    public final void setMarginBetweenImages(float f) {
        float a2 = b.a(M, f);
        if (this.h == a2) {
            return;
        }
        this.h = a2;
        invalidate();
        requestLayout();
    }

    public final void setOffset(int i) {
        if (i == this.o) {
            return;
        }
        this.o = i;
        requestLayout();
        invalidate();
    }

    public final void setOverlapOffset(float f) {
        if (this.x == f) {
            return;
        }
        this.x = f;
        requestLayout();
        invalidate();
    }

    public final void setReverseStack(boolean z) {
        this.y = z;
        invalidate();
    }

    public final void setRoundedCut(boolean z) {
        this.l = z;
        invalidate();
    }

    public final void setRoundedImages(boolean z) {
        this.k = z;
        x();
        invalidate();
    }

    public final void v(float f, float f2, float f3) {
        setMarginBetweenImages(f2);
        b bVar = M;
        float a2 = (b.a(bVar, f) - b.a(bVar, f2)) / b.a(bVar, f3);
        if (a2 == this.x) {
            return;
        }
        this.x = a2;
        requestLayout();
        invalidate();
    }

    public final void x() {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.b = this.k;
        float f = this.n;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            roundingParams.f(f);
        }
        d540<njt> d540Var = this.b;
        int size = d540Var.b.size();
        for (int i = 0; i < size; i++) {
            flo<njt> a2 = d540Var.a(i);
            if (a2 != null) {
                njt njtVar = a2.d;
                njtVar.getClass();
                njtVar.u(roundingParams);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoStackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.f = N;
        this.g = FontFamily.MEDIUM;
        this.h = O;
        this.i = P;
        this.k = true;
        this.l = true;
        this.m = true;
        this.p = new a();
        this.q = new a();
        this.r = new PointF();
        this.s = new Rect();
        this.t = new GestureDetector(context, new d(), new Handler(Looper.getMainLooper()));
        this.x = 1.0f;
        this.B = new float[2];
        this.C = new SparseIntArray();
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_black_alpha8));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.i);
        this.D = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.E = paint2;
        this.F = new Paint(3);
        this.G = new RectF();
        this.H = new Path();
        abg0 abg0Var = dhr0.t;
        ColorStateList valueOf = ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_text_contrast_themed));
        ColorStateList valueOf2 = ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_secondary));
        this.I = valueOf;
        this.J = valueOf2;
        this.K = context.getColor(R.color.vk_black_alpha35);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.w);
            if (obtainStyledAttributes.hasValue(1)) {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
                this.I = colorStateList != null ? colorStateList : valueOf;
            }
            if (obtainStyledAttributes.hasValue(0)) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                this.J = colorStateList2 != null ? colorStateList2 : valueOf2;
            }
            obtainStyledAttributes.recycle();
        }
        if (this.d == null) {
            this.d = m33.a(R.drawable.user_placeholder, context);
        }
    }

    /* compiled from: PhotoStackView.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public float b;
        public float c;
        public float d;
        public boolean e;
        public boolean f;
        public float g;
        public boolean h;

        /* compiled from: PhotoStackView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            this.b = PhotoStackView.N;
            this.c = PhotoStackView.O;
            this.d = PhotoStackView.P;
            this.f = true;
            this.h = true;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeFloat(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public State(Parcel parcel) {
            super(parcel);
            this.b = PhotoStackView.N;
            this.c = PhotoStackView.O;
            this.d = PhotoStackView.P;
            this.f = true;
            this.h = true;
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readFloat();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readFloat();
            this.h = parcel.readInt() == 1;
        }
    }
}
