package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isActive", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PdpCouponListV2ItemViewHolder$1$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ PdpCouponListV2ItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpCouponListV2ItemViewHolder$1$2(PdpCouponListV2ItemViewHolder pdpCouponListV2ItemViewHolder) {
        super(1);
        this.this$0 = pdpCouponListV2ItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        PdpCouponItemListV2VO pdpCouponItemListV2VO;
        Function1 function1;
        Function1 function12;
        l lVar;
        pdpCouponItemListV2VO = this.this$0.currentItem;
        if (pdpCouponItemListV2VO != null) {
            PdpCouponListV2ItemViewHolder pdpCouponListV2ItemViewHolder = this.this$0;
            if (z11) {
                function1 = pdpCouponListV2ItemViewHolder.onHighlightClick;
                function1.invoke(pdpCouponItemListV2VO);
                return;
            }
            t tokenizedEvent = pdpCouponItemListV2VO.getPromocode().getTokenizedEvent();
            if (tokenizedEvent != null) {
                lVar = pdpCouponListV2ItemViewHolder.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
            function12 = pdpCouponListV2ItemViewHolder.onCouponApplyClick;
            function12.invoke(pdpCouponItemListV2VO);
        }
    }
}
