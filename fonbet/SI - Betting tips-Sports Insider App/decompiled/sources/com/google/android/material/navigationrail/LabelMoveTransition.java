package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.transition.a0;
import androidx.transition.l0;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class LabelMoveTransition extends a0 {
    private static final float HORIZONTAL_DISTANCE = -30.0f;
    private static final String LABEL_VISIBILITY = "NavigationRailLabelVisibility";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createAnimator$0(View view, ValueAnimator valueAnimator) {
        view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * HORIZONTAL_DISTANCE);
    }

    @Override // androidx.transition.a0
    public void captureEndValues(@NonNull l0 l0Var) {
        l0Var.f2724a.put(LABEL_VISIBILITY, Integer.valueOf(l0Var.f2725b.getVisibility()));
    }

    @Override // androidx.transition.a0
    public void captureStartValues(@NonNull l0 l0Var) {
        l0Var.f2724a.put(LABEL_VISIBILITY, Integer.valueOf(l0Var.f2725b.getVisibility()));
    }

    @Override // androidx.transition.a0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            return null;
        }
        HashMap hashMap = l0Var.f2724a;
        if (l0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = l0Var2.f2724a;
        if (hashMap.get(LABEL_VISIBILITY) == null || hashMap2.get(LABEL_VISIBILITY) == null || ((Integer) hashMap.get(LABEL_VISIBILITY)).intValue() != 8 || ((Integer) hashMap2.get(LABEL_VISIBILITY)).intValue() != 0) {
            return null;
        }
        final View view = l0Var2.f2725b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LabelMoveTransition.lambda$createAnimator$0(view, valueAnimator);
            }
        });
        return ofFloat;
    }
}
