package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import WZ.l;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Action;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WannaDiscountV2ViewHolder$1$1 extends AbstractC7737t implements Function2<Integer, AtomAction, Unit> {
    final /* synthetic */ WannaDiscountV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewHolder$1$1(WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder) {
        super(2);
        this.this$0 = wannaDiscountV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AtomAction atomAction) {
        invoke(num.intValue(), atomAction);
        return Unit.f71690a;
    }

    public final void invoke(int i11, AtomAction action) {
        WannaDiscountV2VO boundedData;
        WannaDiscountV2ViewModel wannaDiscountV2ViewModel;
        t mapToTokenizedEvent$default;
        l lVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.Click) && (boundedData = this.this$0.getBoundedData()) != null) {
            List<WannaDiscountV2VO.Discount> discounts = boundedData.getDiscounts();
            wannaDiscountV2ViewModel = this.this$0.viewModel;
            wannaDiscountV2ViewModel.sendUserAction(new WannaDiscountV2Action.UpdateDiscounts(discounts, i11));
            WannaDiscountV2VO.Discount discount = discounts.get(i11);
            this.this$0.updatePrice(boundedData.getPriceInput(), discount.getDiscountPrice());
            Map<String, TokenizedTrackingInfo> trackingInfo = discount.getDiscount().getTrackingInfo();
            if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null)) == null) {
                return;
            }
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        }
    }
}
