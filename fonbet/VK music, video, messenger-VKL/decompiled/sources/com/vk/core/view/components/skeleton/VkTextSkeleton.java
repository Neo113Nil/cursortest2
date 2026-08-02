package com.vk.core.view.components.skeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import kotlin.LazyThreadSafetyMode;
import xsna.hbh0;
import xsna.i3g;
import xsna.msy;
import xsna.rl3;
import xsna.tj0;
import xsna.too0;
import xsna.vjv0;

/* compiled from: VkTextSkeleton.kt */
/* loaded from: classes17.dex */
public final class VkTextSkeleton extends AppCompatTextView implements vjv0, too0 {
    public static final /* synthetic */ int j = 0;
    public final Object b;
    public boolean c;
    public final Path d;
    public final Rect e;
    public final int[] f;
    public int g;
    public a h;
    public boolean i;

    public VkTextSkeleton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.core.view.shimmer.b getShimmerDrawable() {
        return (com.vk.core.view.shimmer.b) this.b.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        getShimmerDrawable().Ng();
    }

    public a getArea() {
        return this.h;
    }

    public boolean getShimmerManagedExternally() {
        return this.i;
    }

    public final int getSingleLineWidth() {
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        getShimmerDrawable().c();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally() || (valueAnimator = getShimmerDrawable().g) == null) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        float width2;
        a area = getArea();
        com.vk.core.view.shimmer.b shimmerDrawable = getShimmerDrawable();
        int[] iArr = this.f;
        b.a(this, area, shimmerDrawable, this.e, iArr);
        boolean z = this.c;
        Path path = this.d;
        if (z) {
            int i = 0;
            this.c = false;
            path.reset();
            Context context = getContext();
            float textSize = getTextSize();
            float f = textSize <= tj0.a(2, 14.5f, context) ? 8.0f : textSize <= tj0.a(2, 16.5f, context) ? 12.0f : 16.0f;
            float applyDimension = TypedValue.applyDimension(2, f, getContext().getResources().getDisplayMetrics());
            float a = hbh0.a(getContext(), f <= 10.0f ? 2.0f : 4.0f);
            int lineCount = getLineCount();
            while (i < lineCount) {
                if (getLineCount() == 1 && this.g > 0) {
                    width = Math.min(getWidth() - getPaddingRight(), this.g);
                } else if (i != getLineCount() - 1 || getLineCount() <= 1) {
                    width = getWidth() - getPaddingRight();
                } else {
                    width2 = (getWidth() - getPaddingRight()) * 0.75f;
                    float f2 = width2;
                    float fontMetricsInt = ((getPaint().getFontMetricsInt(null) - applyDimension) / 2) + ((i == 0 || !getIncludeFontPadding()) ? getLayout().getLineTop(i) : getPaint().getFontMetricsInt(null) + (getLayout().getLineTop(i) - getFirstBaselineToTopHeight())) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    path.addRoundRect(getPaddingLeft(), fontMetricsInt, f2, fontMetricsInt + applyDimension + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a, Path.Direction.CW);
                    i++;
                }
                width2 = width;
                float f22 = width2;
                float fontMetricsInt2 = ((getPaint().getFontMetricsInt(null) - applyDimension) / 2) + ((i == 0 || !getIncludeFontPadding()) ? getLayout().getLineTop(i) : getPaint().getFontMetricsInt(null) + (getLayout().getLineTop(i) - getFirstBaselineToTopHeight())) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                path.addRoundRect(getPaddingLeft(), fontMetricsInt2, f22, fontMetricsInt2 + applyDimension + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a, Path.Direction.CW);
                i++;
            }
        }
        canvas.clipPath(path);
        getShimmerDrawable().a(canvas, r3.left);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        com.vk.core.view.shimmer.b shimmerDrawable;
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        if (i == 0) {
            getShimmerDrawable().c();
        } else if ((i == 4 || i == 8) && (valueAnimator = (shimmerDrawable = getShimmerDrawable()).g) != null && valueAnimator.isStarted()) {
            shimmerDrawable.g.cancel();
        }
    }

    @Override // xsna.vjv0
    public void setArea(a aVar) {
        this.h = aVar;
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        super.setLines(i);
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "";
        }
        setText(rl3.Z(strArr, "\n", null, null, null, 62));
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        com.vk.core.view.shimmer.b shimmerDrawable = getShimmerDrawable();
        shimmerDrawable.b = themableShimmer;
        shimmerDrawable.b();
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.i = z;
    }

    public final void setSingleLineWidth(int i) {
        this.g = i;
        this.c = true;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == getShimmerDrawable();
    }

    public VkTextSkeleton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new i3g(context, 2));
        this.c = true;
        this.d = new Path();
        this.e = new Rect();
        this.f = new int[2];
        this.h = a.c.a;
        getShimmerDrawable().setCallback(this);
    }
}
