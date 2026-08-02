package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: VKAppBarLayout.kt */
/* loaded from: classes17.dex */
public final class VKAppBarLayout extends AppBarLayout {

    /* compiled from: VKAppBarLayout.kt */
    public static final class SafeAppBarLayoutBehavior extends AppBarLayout.Behavior {
        public SafeAppBarLayoutBehavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            try {
                super.R(coordinatorLayout, appBarLayout, i);
            } catch (Exception unused) {
            }
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, xsna.azt0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            try {
                super.R(coordinatorLayout, (AppBarLayout) view, i);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        public SafeAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public VKAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new SafeAppBarLayoutBehavior();
    }
}
