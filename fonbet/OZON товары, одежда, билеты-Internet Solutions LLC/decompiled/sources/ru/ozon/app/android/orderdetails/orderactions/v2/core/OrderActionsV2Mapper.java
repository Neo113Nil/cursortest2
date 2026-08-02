package ru.ozon.app.android.orderdetails.orderactions.v2.core;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.orderdetails.orderactions.v2.data.OrderActionsV2DTO;
import ru.ozon.app.android.orderdetails.orderactions.v2.presentation.OrderActionsV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\n\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Mapper;", "", "<init>", "()V", "invoke", "Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO;", "state", "Lru/ozon/app/android/orderdetails/orderactions/v2/data/OrderActionsV2DTO;", "stateId", "", "toVo", "id", "", "isVertical", "", "Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO$OrderActionV2VO;", "Lru/ozon/app/android/orderdetails/orderactions/v2/data/OrderActionsV2DTO$OrderActionV2;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderActionsV2Mapper {
    private final OrderActionsV2VO toVo(OrderActionsV2DTO orderActionsV2DTO, long j11, boolean z11) {
        List<OrderActionsV2DTO.OrderActionV2> actions = orderActionsV2DTO.getActions();
        ArrayList arrayList = new ArrayList(C7714v.z(actions, 10));
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((OrderActionsV2DTO.OrderActionV2) it.next(), j11, z11));
        }
        return new OrderActionsV2VO(j11, arrayList);
    }

    @NotNull
    public final OrderActionsV2VO invoke(@NotNull OrderActionsV2DTO state, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return toVo(state, stateId.hashCode(), state.getActions().size() > 2);
    }

    private final OrderActionsV2VO.OrderActionV2VO toVo(OrderActionsV2DTO.OrderActionV2 orderActionV2, long j11, boolean z11) {
        IconDTO icon = orderActionV2.getIcon();
        TextDTO title = orderActionV2.getTitle();
        String backgroundColor = orderActionV2.getBackgroundColor();
        AtomActionDTO action = orderActionV2.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, orderActionV2.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = orderActionV2.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        TestInfo testInfo = orderActionV2.getTestInfo();
        if (testInfo == null) {
            testInfo = new TestInfo("orderActionButton");
        }
        return new OrderActionsV2VO.OrderActionV2VO(icon, title, backgroundColor, atomAction, tokenizedEvent$default, z11, testInfo);
    }
}
