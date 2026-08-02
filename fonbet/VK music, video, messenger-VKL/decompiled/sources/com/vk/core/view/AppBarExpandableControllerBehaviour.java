package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarExpandableControllerBehaviour.kt */
/* loaded from: classes17.dex */
public class AppBarExpandableControllerBehaviour extends AppBarLayout.Behavior {
    public boolean q;

    public AppBarExpandableControllerBehaviour() {
        this.q = true;
    }

    @Override // xsna.dwu, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (this.q) {
            return super.C(coordinatorLayout, appBarLayout, motionEvent);
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: U */
    public boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return this.q && super.z(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    public AppBarExpandableControllerBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = true;
    }
}
