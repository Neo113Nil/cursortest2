package ru.ozon.android.messenger.framework.presentation.ai;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnAttachStateChangeListenerC9446t implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnAttachStateChangeListener(this);
        androidx.core.view.Y.A(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
