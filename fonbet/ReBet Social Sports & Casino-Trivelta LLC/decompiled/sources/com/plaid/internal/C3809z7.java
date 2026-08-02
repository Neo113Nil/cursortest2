package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.z7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3809z7 {
    @NotNull
    public static final Ph.P a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R.string.plaid_view_coroutine_scope);
        Ph.P p10 = tag instanceof Ph.P ? (Ph.P) tag : null;
        if (p10 != null) {
            return p10;
        }
        ViewOnAttachStateChangeListenerC3800y7 viewOnAttachStateChangeListenerC3800y7 = new ViewOnAttachStateChangeListenerC3800y7();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3800y7);
        return viewOnAttachStateChangeListenerC3800y7;
    }
}
