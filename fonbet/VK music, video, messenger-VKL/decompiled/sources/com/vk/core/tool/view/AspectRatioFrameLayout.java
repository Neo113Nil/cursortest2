package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;

/* compiled from: AspectRatioFrameLayout.kt */
/* loaded from: classes17.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public float b;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final float getAspectRation() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.b), 1073741824));
    }

    public final void setAspectRation(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        setAspectRation(obtainStyledAttributes.getFloat(0, 1.0f));
        if (this.b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Aspect ration can't be <= 0");
        }
        obtainStyledAttributes.recycle();
    }
}
