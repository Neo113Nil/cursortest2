package com.vk.superapp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.ir;
import xsna.lhg;
import xsna.n8g;
import xsna.rqi;

/* compiled from: PagerIndicatorView.kt */
/* loaded from: classes6.dex */
public final class PagerIndicatorView extends View {
    public static final int j = iah0.a(7);
    public static final int k = iah0.a(11);
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public final Paint i;

    public PagerIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        this.d = k;
        int i = j;
        this.g = i;
        this.h = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.i = paint;
        int f = e3m.f(R.attr.vk_ui_icon_secondary, context);
        setDotColor(n8g.l(f, 76));
        setSelectedDotColor(f);
    }

    public final int getDotColor() {
        return this.e;
    }

    public final int getDotCount() {
        return this.b;
    }

    public final int getDotSpacing() {
        return this.d;
    }

    public final int getSelectedDotColor() {
        return this.f;
    }

    public final int getSelectedDotPosition() {
        return this.c;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        if (this.b <= 0) {
            return super.getSuggestedMinimumHeight();
        }
        return getPaddingBottom() + getPaddingTop() + this.g;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i = this.b;
        if (i <= 0) {
            return super.getSuggestedMinimumWidth();
        }
        return getPaddingRight() + getPaddingLeft() + ir.b(i, 1, this.d, (i - 1) * this.h) + this.g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        if (this.b <= 0) {
            return;
        }
        float measuredWidth = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
        float measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || measuredHeight <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int i3 = j;
        int i4 = 0;
        Paint paint = this.i;
        int i5 = this.h;
        if (i5 == i3) {
            float min = Math.min(this.d, measuredWidth / (this.b - 1));
            int i6 = this.b;
            float f = (measuredWidth - ((i6 - 1) * min)) / i6;
            if (f > measuredHeight) {
                f = measuredHeight;
            }
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float f2 = (measuredWidth - (((i6 - 1) * min) + (i6 * f))) / 2.0f;
            float paddingTop = (measuredHeight / 2.0f) + getPaddingTop();
            float f3 = f / 2.0f;
            int i7 = this.b;
            while (i4 < i7) {
                paint.setColor(i4 == this.c ? this.f : this.e);
                canvas.drawCircle(((f + min) * i4) + f2 + f3, paddingTop, f3, paint);
                i4++;
            }
            return;
        }
        if (i5 <= 0 || (i = this.g) <= 0) {
            return;
        }
        int i8 = this.b - 1;
        float a = (measuredWidth - rqi.a(i8, this.d, i8 * i5, i)) / 2.0f;
        float paddingTop2 = (measuredHeight / 2.0f) + getPaddingTop();
        float f4 = i5 / 2.0f;
        float f5 = i / 2.0f;
        int i9 = this.b;
        while (i4 < i9) {
            int i10 = this.c;
            int i11 = i10 == i4 ? this.f : this.e;
            float f6 = i10 == i4 ? f5 : f4;
            if (i10 < i4) {
                int i12 = this.d;
                i2 = i12 + i + ((i5 + i12) * (i4 - 1));
            } else {
                i2 = (this.d + i5) * i4;
            }
            paint.setColor(i11);
            canvas.drawCircle(i2 + a + f6, paddingTop2, f6, paint);
            i4++;
        }
    }

    public final void setDotColor(int i) {
        if (this.e != i) {
            this.e = i;
            invalidate();
        }
    }

    public final void setDotCount(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Count value cannot be negative: "));
        }
        if (this.b != i) {
            this.b = i;
            if (this.c >= i) {
                setSelectedDotPosition(i - 1);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setDotSpacing(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setSelectedDotColor(int i) {
        if (this.f != i) {
            this.f = i;
            invalidate();
        }
    }

    public final void setSelectedDotPosition(int i) {
        if (this.c != i) {
            this.c = i;
            invalidate();
        }
    }
}
