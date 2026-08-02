package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.nr2;
import xsna.rb30;

@Deprecated
/* loaded from: classes13.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final rb30 d;
    public final rb30 e;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ View c;

        public a(View view, boolean z) {
            this.b = z;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            this.c.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.b) {
                this.c.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.d = new rb30(75L);
        this.e = new rb30(0L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public final AnimatorSet E(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        rb30 rb30Var = z ? this.d : this.e;
        if (z) {
            if (!z2) {
                view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        rb30Var.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        nr2.E(animatorSet, arrayList);
        animatorSet.addListener(new a(view2, z));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new rb30(75L);
        this.e = new rb30(0L);
    }
}
