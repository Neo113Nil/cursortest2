package ru.ozon.android.messenger.blocks.chat.common.menuItems;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static final b a(@NotNull ContextMenuItemDTO contextMenuItemDTO) {
        Intrinsics.checkNotNullParameter(contextMenuItemDTO, "<this>");
        return new b(contextMenuItemDTO.getTitle(), contextMenuItemDTO.getIcon(), contextMenuItemDTO.getBackgroundColor(), contextMenuItemDTO.getAction(), contextMenuItemDTO.getTrackingInfo());
    }
}
