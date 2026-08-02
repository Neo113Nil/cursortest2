package ru.ozon.android.messenger.framework.presentation.ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class I0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AiFloatingButtonContainer f89266a;

    I0(AiFloatingButtonContainer aiFloatingButtonContainer) {
        this.f89266a = aiFloatingButtonContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f89266a.f89210a = null;
    }
}
