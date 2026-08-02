package ru.ozon.android.messenger.blocks.chat.common;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {
    public static final void a(@NotNull View view, @NotNull j shimmer) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(shimmer, "shimmer");
        Drawable foreground = view.getForeground();
        if ((foreground instanceof j ? (j) foreground : null) != null) {
            return;
        }
        shimmer.start();
        view.setForeground(shimmer);
    }
}
