package ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation;

import WZ.l;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.data.FinanceWidgetCardDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FinanceWidgetV2Kt$FinanceWidgetV2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ l $analytics;
    final /* synthetic */ FinanceWidgetV2VO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinanceWidgetV2Kt$FinanceWidgetV2$1$1(FinanceWidgetV2VO financeWidgetV2VO, l lVar) {
        super(0);
        this.$state = financeWidgetV2VO;
        this.$analytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t b11;
        t b12;
        t tokenizedEvent = this.$state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.$analytics, tokenizedEvent);
        }
        Map<String, TokenizedTrackingInfo> trackingInfo2 = this.$state.getLeftCard().getCommon().getTrackingInfo();
        if (trackingInfo2 != null && (b12 = x.b(trackingInfo2, Long.valueOf(this.$state.getId()), null)) != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.$analytics, b12);
        }
        FinanceWidgetCardDTO rightCard = this.$state.getRightCard();
        if (rightCard == null || (common = rightCard.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null || (b11 = x.b(trackingInfo, Long.valueOf(this.$state.getId()), null)) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.$analytics, b11);
    }
}
