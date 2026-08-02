package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;

/* compiled from: RatioView.kt */
/* loaded from: classes17.dex */
public class RatioView extends View {
    public int b;
    public float c;

    public RatioView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.c;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i3 = this.b;
            if (i3 == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / f), 1073741824);
            } else if (i3 == 1) {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) / f), 1073741824);
            }
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RatioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = 1;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2 != null ? context2.obtainStyledAttributes(attributeSet, R$styleable.g) : null;
        if (obtainStyledAttributes != null) {
            this.c = obtainStyledAttributes.getFloat(1, this.c);
            this.b = obtainStyledAttributes.getInt(0, this.b);
            obtainStyledAttributes.recycle();
        }
    }
}
