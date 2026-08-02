package ru.ozon.android.messenger.framework.presentation.models;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h {
    @NotNull
    public static final c a(@NotNull String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new c(itemId, 0);
    }

    @NotNull
    public static final String b(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.getBlockId().a();
    }
}
