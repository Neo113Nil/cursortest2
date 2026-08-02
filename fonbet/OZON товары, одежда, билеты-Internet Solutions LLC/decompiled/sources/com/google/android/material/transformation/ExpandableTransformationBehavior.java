package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes9.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f58841b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected void c(View view, View view2, boolean z11, boolean z12) {
        AnimatorSet animatorSet = this.f58841b;
        boolean z13 = animatorSet != null;
        if (z13) {
            animatorSet.cancel();
        }
        AnimatorSet e11 = e(view, view2, z11, z13);
        this.f58841b = e11;
        e11.addListener(new a(this));
        this.f58841b.start();
        if (z12) {
            return;
        }
        this.f58841b.end();
    }

    @NonNull
    protected abstract AnimatorSet e(View view, View view2, boolean z11, boolean z12);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
