package ru.ozon.android.messenger.blocks.actionButton;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements Function2<ActionButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends d>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends d> invoke(ActionButtonDTO actionButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ActionButtonDTO state = actionButtonDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new d(blockId, state.getButton()));
    }
}
