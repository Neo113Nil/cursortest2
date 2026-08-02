package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.UnityAdsConstants;
import xsna.d3m;

/* compiled from: VkFabBehaviour.kt */
/* loaded from: classes17.dex */
public final class VkFabBehaviour extends FloatingActionButton.Behavior {
    public final LinearInterpolator d;
    public final long e;
    public boolean f;
    public boolean g;

    public VkFabBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinearInterpolator();
        this.e = 200L;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        super.t(coordinatorLayout, floatingActionButton, view2, i, i2, i3, i4, i5);
        long j = this.e;
        LinearInterpolator linearInterpolator = this.d;
        if ((i2 > 0 || i4 > 0) && !this.f) {
            this.g = false;
            this.f = true;
            int i6 = ((ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin;
            d3m.b(floatingActionButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            floatingActionButton.animate().translationY(floatingActionButton.getHeight() + i6).setInterpolator(linearInterpolator).setDuration(j).start();
            return;
        }
        if ((i2 < 0 || i4 < 0) && !this.g) {
            this.g = true;
            this.f = false;
            d3m.b(floatingActionButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatingActionButton.getTranslationY(), 1);
            floatingActionButton.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(linearInterpolator).setDuration(j).start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public VkFabBehaviour() {
        this.d = new LinearInterpolator();
        this.e = 200L;
    }
}
