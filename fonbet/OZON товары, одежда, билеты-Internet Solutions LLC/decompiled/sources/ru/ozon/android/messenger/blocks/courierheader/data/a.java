package ru.ozon.android.messenger.blocks.courierheader.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.courierheader.data.CourierHeaderDTO;
import ru.ozon.android.messenger.blocks.courierheader.presentation.a;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements Function2<CourierHeaderDTO, c, List<? extends ru.ozon.android.messenger.blocks.courierheader.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.courierheader.presentation.a> invoke(CourierHeaderDTO courierHeaderDTO, c cVar) {
        ArrayList arrayList;
        CourierHeaderDTO state = courierHeaderDTO;
        c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        TextDTO title = state.getTitle();
        List<CourierHeaderDTO.Item> items = state.getItems();
        if (items != null) {
            List<CourierHeaderDTO.Item> list = items;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (CourierHeaderDTO.Item item : list) {
                arrayList.add(new a.C1486a(item.getTitle(), item.getElems(), item.getAction(), item.getBadge(), item.getTrackingInfo()));
            }
        } else {
            arrayList = null;
        }
        return C7714v.a0(new ru.ozon.android.messenger.blocks.courierheader.presentation.a(blockId, title, arrayList, state.getTrackingInfo()));
    }
}
