package com.vk.music.onboarding.impl.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.view.components.search.VkSearchView;

/* compiled from: RecyclerViewScrollWithSearchFieldBehavior.kt */
/* loaded from: classes3.dex */
public final class RecyclerViewScrollWithSearchFieldBehavior extends CoordinatorLayout.c<View> {
    public float b;

    public RecyclerViewScrollWithSearchFieldBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1.0f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return view2 instanceof VkSearchView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        float y = view2.getY() + view2.getMeasuredHeight();
        boolean z = this.b == y;
        boolean z2 = !z;
        if (!z) {
            view.setY(y);
            this.b = view.getY();
        }
        return z2;
    }
}
