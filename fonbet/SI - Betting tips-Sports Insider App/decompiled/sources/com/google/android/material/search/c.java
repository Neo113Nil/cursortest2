package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.k2;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5925a;

    public /* synthetic */ c(Object obj) {
        this.f5925a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f5925a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public k2 onApplyWindowInsets(View view, k2 k2Var, ViewUtils.RelativePadding relativePadding) {
        k2 lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = ((SearchView) this.f5925a).lambda$setUpToolbarInsetListener$4(view, k2Var, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }
}
