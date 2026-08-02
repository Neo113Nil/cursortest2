package com.vk.pullfromtopofrecycler.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: ExpandableAppBarLayout.kt */
/* loaded from: classes5.dex */
public final class ExpandableAppBarLayout extends AppBarLayout {
    public final PullingHandlingBehavior B;

    public ExpandableAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new PullingHandlingBehavior(this);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        super.getBehavior();
        return this.B;
    }
}
