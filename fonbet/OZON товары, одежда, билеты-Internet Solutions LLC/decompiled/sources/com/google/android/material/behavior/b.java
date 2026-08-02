package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import y2.s;

/* loaded from: classes9.dex */
final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeDismissBehavior f58007a;

    b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f58007a = swipeDismissBehavior;
    }

    @Override // y2.s
    public final boolean a(@NonNull View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f58007a;
        if (!swipeDismissBehavior.b(view)) {
            return false;
        }
        int i11 = Y.f42258g;
        boolean z11 = view.getLayoutDirection() == 1;
        int i12 = swipeDismissBehavior.f57995c;
        view.offsetLeftAndRight((!(i12 == 0 && z11) && (i12 != 1 || z11)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}
