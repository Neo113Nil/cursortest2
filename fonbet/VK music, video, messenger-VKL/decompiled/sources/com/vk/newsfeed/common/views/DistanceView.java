package com.vk.newsfeed.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.newsfeed.common.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.gbg0;
import xsna.qcy;

/* compiled from: DistanceView.kt */
/* loaded from: classes4.dex */
public final class DistanceView extends AppCompatTextView {
    public DistanceView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public DistanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public DistanceView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ DistanceView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public DistanceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, i, i2);
        setBackgroundResource(R.drawable.distance_background);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, gbg0.a(getResources(), 8.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, gbg0.a(getResources(), 3.0f));
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.style.VkUiTypography_Caption1);
        qcy<Object>[] qcyVarArr = bwt0.a;
        setTextAppearance(resourceId);
        e3m.a aVar = e3m.a;
        setTextColor(context.getColor(R.color.vk_white));
        setMaxLines(1);
        obtainStyledAttributes.recycle();
    }
}
