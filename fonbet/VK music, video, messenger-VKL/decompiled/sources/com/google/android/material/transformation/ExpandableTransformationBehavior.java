package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.hl9;

@Deprecated
/* loaded from: classes13.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    @Nullable
    public AnimatorSet c;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void D(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.c;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet E = E(view, view2, z, z3);
        this.c = E;
        E.addListener(new hl9(this, 2));
        this.c.start();
        if (z2) {
            return;
        }
        this.c.end();
    }

    @NonNull
    public abstract AnimatorSet E(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
