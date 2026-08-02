package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.transition.a0;
import androidx.transition.l0;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class TextScale extends a0 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@NonNull l0 l0Var) {
        View view = l0Var.f2725b;
        if (view instanceof TextView) {
            l0Var.f2724a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.a0
    public void captureEndValues(@NonNull l0 l0Var) {
        captureValues(l0Var);
    }

    @Override // androidx.transition.a0
    public void captureStartValues(@NonNull l0 l0Var) {
        captureValues(l0Var);
    }

    @Override // androidx.transition.a0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        if (l0Var == null || l0Var2 == null || !(l0Var.f2725b instanceof TextView)) {
            return null;
        }
        View view = l0Var2.f2725b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap hashMap = l0Var.f2724a;
        HashMap hashMap2 = l0Var2.f2724a;
        float floatValue = hashMap.get(PROPNAME_SCALE) != null ? ((Float) hashMap.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get(PROPNAME_SCALE) != null ? ((Float) hashMap2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}
