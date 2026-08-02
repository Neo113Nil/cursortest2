package ru.ozon.android.messenger.blocks.ai.divider;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements Function2<AiDividerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(AiDividerDTO aiDividerDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiDividerDTO state = aiDividerDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new b(blockId, state.getText()));
    }
}
