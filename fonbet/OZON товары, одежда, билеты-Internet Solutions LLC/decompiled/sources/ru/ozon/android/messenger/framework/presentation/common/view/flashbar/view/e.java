package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.d;

/* loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f91206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f91207b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f91208c;

    e(d dVar, ViewGroup.LayoutParams layoutParams, int i11) {
        this.f91206a = dVar;
        this.f91207b = layoutParams;
        this.f91208c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        d.a aVar;
        View view;
        View view2;
        View view3;
        View view4;
        Intrinsics.checkNotNullParameter(animation, "animation");
        d dVar = this.f91206a;
        aVar = dVar.f91194b;
        view = dVar.f91193a;
        ((b) aVar).m(view);
        view2 = dVar.f91193a;
        view2.setAlpha(1.0f);
        view3 = dVar.f91193a;
        view3.setTranslationX(0.0f);
        ViewGroup.LayoutParams layoutParams = this.f91207b;
        layoutParams.height = this.f91208c;
        view4 = dVar.f91193a;
        view4.setLayoutParams(layoutParams);
    }
}
