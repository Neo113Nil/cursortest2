package ru.ozon.android.messenger.blocks.travelOrders;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class o implements Function2<TravelOrdersDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends p>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends p> invoke(TravelOrdersDTO travelOrdersDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        TravelOrdersDTO state = travelOrdersDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        List<TravelOrderDTO> orders = state.getOrders();
        ArrayList arrayList = new ArrayList(C7714v.z(orders, 10));
        for (TravelOrderDTO travelOrderDTO : orders) {
            arrayList.add(new a(travelOrderDTO.getProductMedia(), travelOrderDTO.getTitle(), travelOrderDTO.getSubtitle(), travelOrderDTO.getAction(), travelOrderDTO.getTrackingInfo()));
        }
        return C7714v.a0(new p(blockId, arrayList, state.getBackgroundColor(), state.getCornerRadius()));
    }
}
