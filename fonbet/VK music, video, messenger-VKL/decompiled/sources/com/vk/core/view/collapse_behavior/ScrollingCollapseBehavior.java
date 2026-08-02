package com.vk.core.view.collapse_behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ScrollingCollapseBehavior.kt */
/* loaded from: classes17.dex */
public final class ScrollingCollapseBehavior extends CoordinatorLayout.c<View> {
    public ScrollingCollapseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return (view2 instanceof CoordinatorLayout.b) && (((CoordinatorLayout.b) view2).getBehavior() instanceof CollapseBehavior);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view.setTranslationY(view2.getBottom());
        return true;
    }
}
