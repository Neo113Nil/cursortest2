package com.vk.ecomm.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.ecomm.design.R$styleable;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.krv0;

/* compiled from: DiscreteProgressBar.kt */
/* loaded from: classes18.dex */
public final class DiscreteProgressBar extends View {
    public int b;
    public int c;
    public Drawable d;
    public Drawable e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final Paint k;
    public int l;
    public int m;

    public DiscreteProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final float getAllDotsWidth() {
        float f = this.i;
        return ((this.f + f) * this.m) - f;
    }

    public final void a(TypedArray typedArray) {
        this.b = typedArray.getInt(7, krv0.l(R.attr.vk_ui_track_background));
        this.c = typedArray.getInt(0, krv0.l(R.attr.vk_ui_text_accent));
        this.d = typedArray.getDrawable(8);
        this.e = typedArray.getDrawable(1);
        this.f = typedArray.getDimensionPixelSize(6, iah0.a(14));
        this.g = typedArray.getDimensionPixelSize(4, iah0.a(3));
        this.i = typedArray.getDimensionPixelSize(5, iah0.a(4));
        this.h = typedArray.getDimensionPixelSize(3, iah0.a(8));
        setMax(typedArray.getInt(9, 10));
        setProgress(typedArray.getInt(10, 0));
        this.j = typedArray.getBoolean(2, false);
    }

    public final int getMax() {
        return this.m;
    }

    public final int getProgress() {
        return this.l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.i + this.f;
        int paddingLeft = getPaddingLeft();
        int i = this.m;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) ((i2 * f) + paddingLeft);
            i2++;
            boolean z = this.j;
            Paint paint = this.k;
            if (z) {
                if (i2 <= this.l) {
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setBounds(i3, getPaddingTop(), ((int) this.f) + i3, getPaddingTop() + ((int) this.g));
                        drawable.draw(canvas);
                    } else {
                        paint.setColor(this.c);
                        float f2 = i3;
                        RectF rectF = new RectF(f2, getPaddingTop(), this.f + f2, getPaddingTop() + this.g);
                        float f3 = this.h;
                        canvas.drawRoundRect(rectF, f3, f3, paint);
                    }
                } else {
                    Drawable drawable2 = this.d;
                    if (drawable2 != null) {
                        drawable2.setBounds(i3, getPaddingTop(), ((int) this.f) + i3, getPaddingTop() + ((int) this.g));
                        drawable2.draw(canvas);
                    } else {
                        paint.setColor(this.b);
                        float f4 = i3;
                        RectF rectF2 = new RectF(f4, getPaddingTop(), this.f + f4, getPaddingTop() + this.g);
                        float f5 = this.h;
                        canvas.drawRoundRect(rectF2, f5, f5, paint);
                    }
                }
            } else if (i2 == this.l) {
                Drawable drawable3 = this.e;
                if (drawable3 != null) {
                    drawable3.setBounds(i3, getPaddingTop(), ((int) this.f) + i3, getPaddingTop() + ((int) this.g));
                    drawable3.draw(canvas);
                } else {
                    paint.setColor(this.c);
                    float f6 = i3;
                    RectF rectF3 = new RectF(f6, getPaddingTop(), this.f + f6, getPaddingTop() + this.g);
                    float f7 = this.h;
                    canvas.drawRoundRect(rectF3, f7, f7, paint);
                }
            } else {
                Drawable drawable4 = this.d;
                if (drawable4 != null) {
                    drawable4.setBounds(i3, getPaddingTop(), ((int) this.f) + i3, getPaddingTop() + ((int) this.g));
                    drawable4.draw(canvas);
                } else {
                    paint.setColor(this.b);
                    float f8 = i3;
                    RectF rectF4 = new RectF(f8, getPaddingTop(), this.f + f8, getPaddingTop() + this.g);
                    float f9 = this.h;
                    canvas.drawRoundRect(rectF4, f9, f9, paint);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            i2 = getPaddingTop() + getPaddingBottom() + ((int) this.g);
        }
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
            float f = this.i;
            this.f = ((size + f) / this.m) - f;
        } else {
            i = (int) (getAllDotsWidth() + getPaddingLeft() + getPaddingRight());
        }
        setMeasuredDimension(i, i2);
    }

    public final void setActiveColor(int i) {
        this.c = i;
        invalidate();
    }

    public final void setActiveDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public final void setCumulative(boolean z) {
        this.j = z;
        invalidate();
    }

    public final void setInactiveColor(int i) {
        this.b = i;
        invalidate();
    }

    public final void setInactiveDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public final void setMax(int i) {
        if (i < 0) {
            this.m = 0;
        }
        if (i < this.l) {
            setProgress(-1);
        }
        this.m = i;
        requestLayout();
    }

    public final void setProgress(int i) {
        if (i > this.m) {
            return;
        }
        if (i < 0) {
            this.l = 0;
        }
        this.l = i;
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DiscreteProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.k = paint;
        this.m = 10;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            Float valueOf = this.d != null ? Float.valueOf(r4.getIntrinsicWidth()) : null;
            if (valueOf != null) {
                this.f = valueOf.floatValue();
            }
            Float valueOf2 = this.d != null ? Float.valueOf(r4.getIntrinsicHeight()) : null;
            if (valueOf2 != null) {
                this.g = valueOf2.floatValue();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
