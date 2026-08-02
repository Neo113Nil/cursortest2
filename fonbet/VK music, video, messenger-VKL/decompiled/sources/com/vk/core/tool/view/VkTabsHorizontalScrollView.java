package com.vk.core.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkTabsHorizontalScrollView.kt */
/* loaded from: classes17.dex */
public final class VkTabsHorizontalScrollView extends HorizontalScrollView {
    public boolean b;
    public boolean c;

    public VkTabsHorizontalScrollView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final boolean getLeftFadingEdgeEnabled() {
        return this.b;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.b ? super.getLeftFadingEdgeStrength() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean getRightFadingEdgeEnabled() {
        return this.c;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return this.c ? super.getRightFadingEdgeStrength() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void setLeftFadingEdgeEnabled(boolean z) {
        this.b = z;
        setHorizontalFadingEdgeEnabled(z || this.c);
    }

    public final void setRightFadingEdgeEnabled(boolean z) {
        this.c = z;
        setHorizontalFadingEdgeEnabled(this.b || z);
    }

    public VkTabsHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkTabsHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkTabsHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkTabsHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
