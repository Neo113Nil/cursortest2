package ru.ozon.app.android.button.actions.extendDelivery;

import Pc.a;
import WZ.l;
import WZ.t;
import a00.h;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ExtendDeliveryActionConfig$onAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ActionButtonDTO.ButtonsItem.Action $action;
    final /* synthetic */ h $viewModelOwnerProvider;
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ ExtendDeliveryActionConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtendDeliveryActionConfig$onAction$1(ExtendDeliveryActionConfig extendDeliveryActionConfig, ActionButtonDTO.ButtonsItem.Action action, h hVar, Long l11) {
        super(0);
        this.this$0 = extendDeliveryActionConfig;
        this.$action = action;
        this.$viewModelOwnerProvider = hVar;
        this.$widgetId = l11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent$default;
        l lVar;
        ExtendDeliveryActionDTO extendDeliveryActionDTO = (ExtendDeliveryActionDTO) this.this$0.m494action(this.$action);
        if (extendDeliveryActionDTO != null) {
            h hVar = this.$viewModelOwnerProvider;
            Long l11 = this.$widgetId;
            final ExtendDeliveryActionConfig extendDeliveryActionConfig = this.this$0;
            ActionButtonViewModel actionButtonViewModel = (ActionButtonViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.button.actions.extendDelivery.ExtendDeliveryActionConfig$onAction$1$invoke$lambda$2$$inlined$createViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = ExtendDeliveryActionConfig.this.actionViewModel;
                    ActionButtonViewModel actionButtonViewModel2 = (ActionButtonViewModel) aVar.get();
                    Intrinsics.g(actionButtonViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return actionButtonViewModel2;
                }
            }).a(ActionButtonViewModel.class);
            Map<String, TokenizedTrackingInfo> trackingInfo = extendDeliveryActionDTO.getTrackingInfo();
            if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null)) != null) {
                lVar = extendDeliveryActionConfig.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, tokenizedEvent$default, null, 2, null);
            }
            actionButtonViewModel.onButtonClick(extendDeliveryActionDTO.getActionName(), extendDeliveryActionDTO.getParams(), null);
        }
    }
}
