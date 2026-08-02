package com.vk.music.onboarding.impl.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: DisableableAppBarLayoutBehavior.kt */
/* loaded from: classes3.dex */
public final class DisableableAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public boolean q;

    public DisableableAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = true;
    }

    @Override // xsna.dwu, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.q && super.C(coordinatorLayout, (AppBarLayout) view, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: U */
    public final boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return this.q && super.z(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
