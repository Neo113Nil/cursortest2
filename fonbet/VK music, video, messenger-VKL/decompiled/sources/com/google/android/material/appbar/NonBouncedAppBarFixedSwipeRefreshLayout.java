package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.RecursiveSwipeRefreshLayout;
import xsna.awt0;

/* compiled from: NonBouncedAppBarFixedSwipeRefreshLayout.kt */
/* loaded from: classes13.dex */
public final class NonBouncedAppBarFixedSwipeRefreshLayout extends RecursiveSwipeRefreshLayout {
    public NonBouncedAppBarFixedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static NonBouncedAppBarLayout B(View view) {
        if (view instanceof NonBouncedAppBarLayout) {
            return (NonBouncedAppBarLayout) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        for (View view2 : awt0.d((ViewGroup) view)) {
            NonBouncedAppBarLayout B = B(view2);
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    @Override // com.vk.core.ui.RecursiveSwipeRefreshLayout, com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout
    public final boolean f() {
        NonBouncedAppBarLayout B = B(this);
        if (super.f()) {
            return true;
        }
        return B != null && B.e();
    }
}
