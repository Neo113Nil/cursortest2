package com.vk.clips.design.view.hsl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.vk.camera.editor.clips.filters.R$styleable;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import xsna.dn70;
import xsna.drm0;
import xsna.lhg;

/* compiled from: HslSeekView.kt */
/* loaded from: classes16.dex */
public final class HslSeekView extends BaseSeekView {
    public static final float u = dn70.a() * 7.0f;
    public static final float v;
    public static final float w;
    public static final float x;
    public static final int y;
    public static final int z;
    public final RectF j;
    public float k;
    public final float l;
    public final RectF m;
    public final String n;
    public final Paint o;
    public final int p;
    public final int q;
    public final Paint r;
    public final Paint s;
    public final Paint t;

    static {
        float a = dn70.a() * 3.0f;
        v = a;
        w = a / 2.0f;
        x = dn70.a() * 12.0f;
        y = dn70.b(16);
        z = dn70.b(46);
    }

    public HslSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = new RectF();
        this.m = new RectF();
        this.n = "";
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_gray_400));
        b.j(paint, context, FontFamily.REGULAR, Float.valueOf(12.0f), 8);
        this.o = paint;
        this.p = context.getColor(R.color.vk_gray_750);
        this.q = context.getColor(R.color.vk_gray_100);
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(v);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.vk_white));
        paint3.setStyle(style);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(R.color.vk_black_alpha12));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(dn70.a() * 0.5f);
        this.t = paint4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        this.n = string == null ? this.n : string;
        obtainStyledAttributes.recycle();
        this.l = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        setContentDescription(this.n + ", " + getTextValue());
    }

    private final String getTextValue() {
        int ceil = (int) Math.ceil((getInternalValue() - 0.5f) * 200.0f);
        return ceil == 0 ? "" : ceil > 0 ? lhg.a(ceil, "+") : String.valueOf(ceil);
    }

    @Override // com.vk.clips.design.view.hsl.BaseSeekView
    public final void a() {
        float width = getTrackBound().width() * ((float) Math.abs(getInternalValue() - 0.5d));
        double internalValue = getInternalValue();
        float f = w;
        RectF rectF = this.j;
        if (internalValue > 0.5d) {
            rectF.left = getTrackBound().centerX() - f;
            rectF.right = getTrackBound().centerX() + width + f;
            this.k = rectF.right - f;
        } else {
            rectF.left = (getTrackBound().centerX() - width) - f;
            rectF.right = getTrackBound().centerX() + f;
            this.k = rectF.left + f;
        }
    }

    @Override // com.vk.clips.design.view.hsl.BaseSeekView
    public final void d(float f, boolean z2) {
        super.d(f, z2);
        setContentDescription(this.n + ", " + getTextValue());
    }

    @Override // com.vk.clips.design.view.hsl.BaseSeekView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float centerY = getTrackBound().centerY();
        int i = this.p;
        Paint paint = this.r;
        paint.setColor(i);
        canvas.drawLine(getTrackBound().left, centerY, getTrackBound().right, centerY, paint);
        RectF rectF = this.j;
        float centerY2 = rectF.centerY();
        paint.setColor(this.q);
        canvas.drawLine(rectF.left, centerY2, rectF.right, centerY2, paint);
        float f = this.k;
        float centerY3 = rectF.centerY();
        Paint paint2 = this.s;
        float f2 = u;
        canvas.drawCircle(f, centerY3, f2, paint2);
        canvas.drawCircle(this.k, rectF.centerY(), f2, this.t);
        RectF rectF2 = this.m;
        float f3 = rectF2.left;
        float f4 = rectF2.bottom;
        Paint paint3 = this.o;
        float f5 = f4 - paint3.getFontMetrics().descent;
        paint3.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(this.n, f3, f5, paint3);
        String textValue = getTextValue();
        if (drm0.N(textValue)) {
            return;
        }
        float f6 = rectF2.right;
        float f7 = rectF2.bottom - paint3.getFontMetrics().descent;
        paint3.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(textValue, f6, f7, paint3);
    }

    @Override // com.vk.clips.design.view.hsl.BaseSeekView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        getTrackBound().left = getPaddingLeft();
        float f = v;
        getTrackBound().top = (getHeight() - y) - (f / 2.0f);
        getTrackBound().right = getWidth() - getPaddingRight();
        getTrackBound().bottom = getTrackBound().top + f;
        float paddingLeft = getPaddingLeft();
        RectF rectF = this.m;
        rectF.left = paddingLeft;
        rectF.right = getWidth() - getPaddingRight();
        rectF.bottom = getTrackBound().centerY() - x;
        rectF.top = rectF.bottom - this.l;
        this.j.set(getTrackBound());
        this.k = getTrackBound().centerX();
        b();
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(z, 1073741824));
    }
}
