package com.vk.utils.vectordrawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.vk.utils.vectordrawable.AnimationTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import xsna.epx;
import xsna.qlr0;

/* compiled from: EnhancedDrawableExtensions.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final void a(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, String str, AnimationTarget.Property property, Object... objArr) {
        ArrayList<Animator> childAnimations;
        Animator findAnimations = enhancedAnimatedVectorDrawable.findAnimations(str);
        if (findAnimations != null) {
            Object obj = null;
            AnimatorSet animatorSet = findAnimations instanceof AnimatorSet ? (AnimatorSet) findAnimations : null;
            if (animatorSet != null && (childAnimations = animatorSet.getChildAnimations()) != null) {
                Iterator<T> it = childAnimations.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Animator) next) instanceof ObjectAnimator) {
                        obj = next;
                        break;
                    }
                }
                Animator animator = (Animator) obj;
                if (animator != null) {
                    PropertyValuesHolder[] values = ((ObjectAnimator) animator).getValues();
                    for (PropertyValuesHolder propertyValuesHolder : values) {
                        if (epx.f(propertyValuesHolder.getPropertyName(), property.h())) {
                            property.i(propertyValuesHolder, Arrays.copyOf(objArr, objArr.length));
                        }
                    }
                }
            }
            enhancedAnimatedVectorDrawable.invalidateAnimations();
        }
    }

    public static final void b(qlr0 qlr0Var, String str, int i) {
        VectorPath findPath = qlr0Var.findPath(str);
        if (findPath != null) {
            findPath.setFillColor(i);
            qlr0Var.invalidatePath();
        }
    }
}
