package ru.ozon.android.messenger.blocks.chat.common;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;

/* loaded from: classes10.dex */
public interface b {
    String a();

    ContextMenuDTO b();

    @NotNull
    List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c();

    @NotNull
    m d();

    @NotNull
    ru.ozon.android.messenger.framework.presentation.models.c getBlockId();
}
