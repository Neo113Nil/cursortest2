package ru.ozon.android.messenger.blocks.systemText.data;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.c;

/* loaded from: classes10.dex */
public final class a implements Function2<SystemTextDTO, c, List<? extends ru.ozon.android.messenger.blocks.systemText.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.systemText.presentation.a> invoke(SystemTextDTO systemTextDTO, c cVar) {
        SystemTextDTO state = systemTextDTO;
        c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new ru.ozon.android.messenger.blocks.systemText.presentation.a(blockId, state.getText(), state.getHasTopSeparator(), state.getHasBottomSeparator()));
    }
}
