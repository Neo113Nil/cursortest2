package ru.ozon.android.messenger.blocks.floatbutton.ai;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements Function2<AiFloatingButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends g>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends g> invoke(AiFloatingButtonDTO aiFloatingButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiFloatingButtonDTO state = aiFloatingButtonDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new g(blockId, state.getCenterButton(), state.getRightIconButton(), state.getTestInfo(), state.getNeedsShadow(), state.getTrackingInfo()));
    }
}
