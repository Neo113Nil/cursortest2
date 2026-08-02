package ru.ozon.android.messenger.blocks.snackbar;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f86427a;

    public b(ViewGroup viewGroup) {
        this.f86427a = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        ViewGroup viewGroup = this.f86427a;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, viewGroup.getHeight(), 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        viewGroup.startAnimation(translateAnimation);
    }
}
