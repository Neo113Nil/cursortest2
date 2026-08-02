package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryReviewFormFooterViewHolder$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ DeliveryReviewFormViewModel $this_with;
    final /* synthetic */ DeliveryReviewFormFooterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormFooterViewHolder$2$1(DeliveryReviewFormFooterViewHolder deliveryReviewFormFooterViewHolder, DeliveryReviewFormViewModel deliveryReviewFormViewModel) {
        super(1);
        this.this$0 = deliveryReviewFormFooterViewHolder;
        this.$this_with = deliveryReviewFormViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Function1 function1;
        DeliveryReviewFormFooterVO deliveryReviewFormFooterVO;
        ButtonV3Atom.LargeButton button;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof AtomAction.ComposerAction)) {
            function1 = this.this$0.actionHandler;
            function1.invoke(it);
            return;
        }
        deliveryReviewFormFooterVO = this.this$0.itemVo;
        if (deliveryReviewFormFooterVO != null && (button = deliveryReviewFormFooterVO.getButton()) != null && (trackingInfo = button.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(deliveryReviewFormFooterVO.getId()), null, 2, null)) != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) it;
        this.$this_with.sendForm(composerAction.getActionName(), composerAction.getParams());
    }
}
