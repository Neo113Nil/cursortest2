package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliverySubmitButtonViewHolder$bindSubmitButton$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ DocsDeliverySubmitButtonVO $item;
    final /* synthetic */ DocsDeliverySubmitButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliverySubmitButtonViewHolder$bindSubmitButton$1(DocsDeliverySubmitButtonVO docsDeliverySubmitButtonVO, DocsDeliverySubmitButtonViewHolder docsDeliverySubmitButtonViewHolder) {
        super(1);
        this.$item = docsDeliverySubmitButtonVO;
        this.this$0 = docsDeliverySubmitButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        DocsDeliveryFormViewModel docsDeliveryFormViewModel;
        t mapToTokenizedEvent$default;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            Map<String, String> params = composerAction.getParams();
            String str = params != null ? params.get("orderId") : null;
            if (str != null) {
                Map<String, TokenizedTrackingInfo> trackingInfo = composerAction.getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.$item.getId()), null, 2, null)) != null) {
                    composerReferences = this.this$0.refs;
                    TokenizedAnalyticsExtensionsKt.processAnyEvents$default(composerReferences.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
                }
                docsDeliveryFormViewModel = this.this$0.viewModel;
                docsDeliveryFormViewModel.onDeliverySubmitted(new DocsDeliveryFormViewModel.DeliveryFormData(str, this.$item.getDeliveryVariantId()));
            }
        }
    }
}
