package com.vk.core.ui.bottomsheet.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetBehaviourExt.kt */
/* loaded from: classes17.dex */
public final class BottomSheetBehaviourExt<V extends View> extends BottomSheetBehavior<V> {
    public static final /* synthetic */ int k0 = 0;
    public boolean j0;

    public BottomSheetBehaviourExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.j0) {
            return false;
        }
        return super.C(coordinatorLayout, v, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.j0) {
            return false;
        }
        return super.m(coordinatorLayout, v, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean y(int i, View view) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        if (this.j0) {
            return false;
        }
        return super.z(coordinatorLayout, v, view, view2, i, i2);
    }

    public BottomSheetBehaviourExt() {
    }
}
