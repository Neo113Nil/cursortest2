package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;

/* compiled from: SimpleRatioFrameLayout.kt */
/* loaded from: classes17.dex */
public class SimpleRatioFrameLayout extends FrameLayout {
    public int b;
    public float c;
    public int d;

    public SimpleRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.c;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.d;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int i4 = this.b;
        if (i4 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / f), 1073741824);
        } else if (i4 == 1) {
            i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) / f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxWidth(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public final void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.b = i;
            requestLayout();
        }
    }

    public final void setRatio(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        requestLayout();
    }

    public /* synthetic */ SimpleRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public SimpleRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = 1;
        this.d = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.h);
        this.c = obtainStyledAttributes.getFloat(1, this.c);
        this.b = obtainStyledAttributes.getInt(0, this.b);
        obtainStyledAttributes.recycle();
    }
}
