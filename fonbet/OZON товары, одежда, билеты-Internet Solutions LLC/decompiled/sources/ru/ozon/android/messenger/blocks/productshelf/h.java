package ru.ozon.android.messenger.blocks.productshelf;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h implements Function2<ProductShelfDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends i>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends i> invoke(ProductShelfDTO productShelfDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ProductShelfDTO state = productShelfDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new i(blockId, state.getImage(), state.getPrice(), state.getProductName(), state.getButtons(), state.getPriceBadges(), state.getBottomBadges(), state.getAction(), state.getUpdateBlockAction(), state.getTrackingInfo()));
    }
}
