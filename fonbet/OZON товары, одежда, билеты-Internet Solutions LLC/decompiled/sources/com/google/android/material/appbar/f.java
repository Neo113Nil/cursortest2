package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import java.util.Objects;

/* loaded from: classes.dex */
final class f implements D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CollapsingToolbarLayout f57967a;

    f(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f57967a = collapsingToolbarLayout;
    }

    @Override // androidx.core.view.D
    public final C5353y0 onApplyWindowInsets(View view, @NonNull C5353y0 c5353y0) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f57967a;
        int i11 = Y.f42258g;
        C5353y0 c5353y02 = collapsingToolbarLayout.getFitsSystemWindows() ? c5353y0 : null;
        if (!Objects.equals(collapsingToolbarLayout.f57942x, c5353y02)) {
            collapsingToolbarLayout.f57942x = c5353y02;
            collapsingToolbarLayout.requestLayout();
        }
        return c5353y0.c();
    }
}
