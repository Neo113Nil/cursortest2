package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductItemViewHolder$ignoreActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$ignoreActionHandler$1(ProductItemViewHolder productItemViewHolder) {
        super(1);
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        RateItemsV2VO.HideButtonVO hideButtonVO;
        t tokenizedEvent;
        l lVar;
        Function2 function2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            RateItemsV2VO.RateItemVO.RateProductItemVO item = this.this$0.getItem();
            if (item != null && (hideButtonVO = item.getHideButtonVO()) != null && (tokenizedEvent = hideButtonVO.getTokenizedEvent()) != null) {
                ProductItemViewHolder productItemViewHolder = this.this$0;
                lVar = productItemViewHolder.tokenizedAnalytics;
                function2 = productItemViewHolder.analyticsModifier;
                TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, tokenizedEvent, new ProductItemViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(function2));
            }
            action = ((AtomAction.ComposerAction) action).mutateTrackingInfo((Map<String, TokenizedTrackingInfo>) null);
        }
        function1 = this.this$0.ignoreItemActionHandler;
        function1.invoke(action);
    }
}
