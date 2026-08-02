package com.vk.photos.root.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: NestedScrollingViewBehaviour.kt */
/* loaded from: classes4.dex */
public final class NestedScrollingViewBehaviour extends AppBarLayout.ScrollingViewBehavior {
    public NestedScrollingViewBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return true;
    }
}
