package com.google.android.material.transition;

import androidx.annotation.NonNull;
import androidx.transition.a0;
import androidx.transition.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
abstract class TransitionListenerAdapter implements y {
    @Override // androidx.transition.y
    public void onTransitionEnd(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public void onTransitionStart(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public void onTransitionEnd(@NonNull a0 a0Var, boolean z5) {
        onTransitionEnd(a0Var);
    }

    @Override // androidx.transition.y
    public void onTransitionStart(@NonNull a0 a0Var, boolean z5) {
        onTransitionStart(a0Var);
    }

    @Override // androidx.transition.y
    public void onTransitionCancel(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public void onTransitionPause(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public void onTransitionResume(a0 a0Var) {
    }
}
