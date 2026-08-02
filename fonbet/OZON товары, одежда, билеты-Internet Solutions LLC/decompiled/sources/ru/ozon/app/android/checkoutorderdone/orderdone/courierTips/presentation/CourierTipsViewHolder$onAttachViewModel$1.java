package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/data/CourierTipsDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierTipsViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<ComposerAsyncWidgetResponse<CourierTipsDTO>, Unit> {
    final /* synthetic */ CourierTipsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewHolder$onAttachViewModel$1(CourierTipsViewHolder courierTipsViewHolder) {
        super(1);
        this.this$0 = courierTipsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ComposerAsyncWidgetResponse<CourierTipsDTO> composerAsyncWidgetResponse) {
        invoke2(composerAsyncWidgetResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposerAsyncWidgetResponse<CourierTipsDTO> composerAsyncWidgetResponse) {
        CourierTipsMapper courierTipsMapper;
        ComposerReferences composerReferences;
        l lVar;
        Map<String, String> trackingPayloads = composerAsyncWidgetResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            lVar = this.this$0.tokenizedAnalytics;
            lVar.e(trackingPayloads);
        }
        CourierTipsDTO state = composerAsyncWidgetResponse.getState();
        CourierTipsVO boundedData = this.this$0.getBoundedData();
        if (boundedData != null) {
            long id2 = boundedData.getId();
            courierTipsMapper = this.this$0.mapper;
            CourierTipsVO mapDTOToVO$default = CourierTipsMapper.mapDTOToVO$default(courierTipsMapper, state, id2, null, 4, null);
            composerReferences = this.this$0.refs;
            composerReferences.getController().update(mapDTOToVO$default);
        }
    }
}
