package com.plaid.internal;

import Ph.C1452g0;
import android.view.View;
import com.plaid.link.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.y7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC3800y7 implements Ph.P, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f41216a = Ph.X0.b(null, 1, null).plus(C1452g0.b());

    @Override // Ph.P
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f41216a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R.string.plaid_view_coroutine_scope, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Ph.G0.e(this.f41216a, null, 1, null);
        view.setTag(R.string.plaid_view_coroutine_scope, null);
    }
}
