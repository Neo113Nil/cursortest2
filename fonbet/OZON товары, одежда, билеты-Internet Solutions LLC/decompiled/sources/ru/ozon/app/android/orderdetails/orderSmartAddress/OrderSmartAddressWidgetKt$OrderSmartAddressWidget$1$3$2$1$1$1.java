package ru.ozon.app.android.orderdetails.orderSmartAddress;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject.OrderSmartAddressVO;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$2$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ i<OrderSmartAddressVO> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$2$1$1$1(i<OrderSmartAddressVO> iVar, l lVar) {
        super(0);
        this.$this_content = iVar;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t mapToTokenizedEvent$default;
        OrderSmartAddressVO b11 = this.$this_content.b();
        Intrinsics.g(b11, "null cannot be cast to non-null type ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject.OrderSmartAddressVO");
        OrderSmartAddressVO orderSmartAddressVO = b11;
        l lVar = this.$tokenizedAnalytics;
        Map<String, TokenizedTrackingInfo> trackingInfo = orderSmartAddressVO.getCommon().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(orderSmartAddressVO.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
    }
}
