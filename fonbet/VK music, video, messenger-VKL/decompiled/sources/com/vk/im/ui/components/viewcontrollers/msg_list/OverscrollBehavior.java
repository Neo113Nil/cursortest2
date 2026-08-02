package com.vk.im.ui.components.viewcontrollers.msg_list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import xsna.b0u0;
import xsna.iut0;
import xsna.yj0;

/* compiled from: OverscrollBehavior.kt */
/* loaded from: classes2.dex */
public final class OverscrollBehavior extends CoordinatorLayout.c<View> {
    public final boolean b;
    public int c;

    public OverscrollBehavior() {
        this(false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void B(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        D(view2);
    }

    public final void D(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            b0u0 b = iut0.b(viewGroup.getChildAt(i));
            WeakReference<View> weakReference = b.a;
            b.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            View view2 = weakReference.get();
            if (view2 != null) {
                view2.animate().setInterpolator(accelerateDecelerateInterpolator);
            }
            b.e(new yj0(this, viewGroup));
            View view3 = weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        if (this.c == 0) {
            return false;
        }
        D(view2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 == 0) {
            return;
        }
        this.c -= i4 / 4;
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            viewGroup.getChildAt(i6).setTranslationY(this.c);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.c = 0;
        return true;
    }

    public OverscrollBehavior(Context context, AttributeSet attributeSet) {
        this(false);
    }

    public OverscrollBehavior(boolean z) {
        this.b = z;
    }
}
