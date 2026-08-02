package com.vk.core.view.avatars;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.x9;

/* compiled from: StoryBorderView.kt */
/* loaded from: classes17.dex */
public final class StoryBorderView extends View {
    public final Paint b;
    public LinearGradient c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final int j;
    public boolean k;

    public StoryBorderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.ImageView";
    }

    public final int getBorderColor() {
        return this.e;
    }

    public final int getBorderGradientEndColor() {
        return this.i;
    }

    public final int getBorderGradientStartColor() {
        return this.h;
    }

    public final int getBorderWidth() {
        return this.f;
    }

    public final int getPadding() {
        return this.g;
    }

    public final int getViewSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawOval(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.d;
        setMeasuredDimension(i3, i3);
    }

    public final void setBorderColor(int i) {
        if (this.e != i) {
            this.e = i;
            this.b.setColor(i);
            invalidate();
        }
    }

    public final void setBorderGradientEndColor(int i) {
        this.i = i;
    }

    public final void setBorderGradientStartColor(int i) {
        this.h = i;
    }

    public final void setBorderWidth(int i) {
        if (this.f != i) {
            this.f = i;
            this.b.setStrokeWidth(i);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.d = Math.min(layoutParams != null ? layoutParams.width : 0, layoutParams != null ? layoutParams.height : 0);
        this.c = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d, this.h, this.i, Shader.TileMode.MIRROR);
        if (this.d <= 0) {
            throw new IllegalArgumentException("Only exact size supported, specify avatar sizes in layout params");
        }
    }

    public final void setLive(boolean z) {
        if (this.k != z) {
            LinearGradient linearGradient = z ? this.c : null;
            Paint paint = this.b;
            paint.setShader(linearGradient);
            paint.setColor(z ? this.j : this.e);
            this.k = z;
            invalidate();
        }
    }

    public final void setPadding(int i) {
        if (this.g != i) {
            this.g = i;
            setPadding(i, i, i, i);
        }
    }

    public final void setViewSize(int i) {
        this.d = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.STROKE);
        this.b = c;
        dhr0.a.getClass();
        dhr0.f.getClass();
        this.j = e3m.f(R.attr.vk_ui_accent_red, context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.C);
        setBorderColor(obtainStyledAttributes.getInt(0, 0));
        this.h = obtainStyledAttributes.getInt(2, 0);
        this.i = obtainStyledAttributes.getInt(1, 0);
        setBorderWidth(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        obtainStyledAttributes.recycle();
    }
}
