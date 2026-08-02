package ru.ozon.app.android.orderdetails.orderactions.v2.presentation;

import WZ.l;
import WZ.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.orderdetails.orderactions.v2.presentation.OrderActionsV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OrderActionsV2ComposableKt$OrderActionsV2Composable$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OrderActionsV2VO $item;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderActionsV2ComposableKt$OrderActionsV2Composable$1$1(OrderActionsV2VO orderActionsV2VO, l lVar) {
        super(0);
        this.$item = orderActionsV2VO;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<OrderActionsV2VO.OrderActionV2VO> actions = this.$item.getActions();
        l lVar = this.$tokenizedAnalytics;
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            t tokenizedEvent = ((OrderActionsV2VO.OrderActionV2VO) it.next()).getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
        }
    }
}
