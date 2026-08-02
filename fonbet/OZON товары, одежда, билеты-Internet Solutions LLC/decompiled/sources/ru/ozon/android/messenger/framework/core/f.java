package ru.ozon.android.messenger.framework.core;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    @NotNull
    public static final Context a(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Context requireContext = dVar.d().requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return requireContext;
    }
}
