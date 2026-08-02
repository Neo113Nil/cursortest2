package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j7.C7293b;
import j7.C7300i;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes9.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final C7300i f58853c;

    /* renamed from: d, reason: collision with root package name */
    private final C7300i f58854d;

    final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f58856b;

        a(boolean z11, View view) {
            this.f58855a = z11;
            this.f58856b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f58855a) {
                return;
            }
            this.f58856b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f58855a) {
                this.f58856b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f58853c = new C7300i(75L);
        this.f58854d = new C7300i(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected final AnimatorSet e(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C7300i c7300i = z11 ? this.f58853c : this.f58854d;
        if (z11) {
            if (!z12) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c7300i.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C7293b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z11, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58853c = new C7300i(75L);
        this.f58854d = new C7300i(0L);
    }
}
