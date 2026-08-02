package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface VisibilityAnimatorProvider {
    Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view);

    Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view);
}
