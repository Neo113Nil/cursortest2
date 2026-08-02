package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.transition.l0;
import androidx.transition.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Hold extends z0 {
    @Override // androidx.transition.z0
    @NonNull
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, l0 l0Var, l0 l0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.z0
    @NonNull
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, l0 l0Var, l0 l0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
