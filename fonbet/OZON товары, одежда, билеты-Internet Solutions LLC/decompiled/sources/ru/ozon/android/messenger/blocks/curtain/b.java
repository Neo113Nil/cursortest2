package ru.ozon.android.messenger.blocks.curtain;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b implements Function2<CurtainModalWrapperDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends c>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends c> invoke(CurtainModalWrapperDTO curtainModalWrapperDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        CurtainModalWrapperDTO state = curtainModalWrapperDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new c(blockId, state.getCurtain().getTitle(), state.getCurtain().getImage(), state.getCurtain().getMessage(), state.getCurtain().getButtons(), state.getCurtain().getBackgroundColor(), state.getCurtain().getTrackingInfo()));
    }
}
