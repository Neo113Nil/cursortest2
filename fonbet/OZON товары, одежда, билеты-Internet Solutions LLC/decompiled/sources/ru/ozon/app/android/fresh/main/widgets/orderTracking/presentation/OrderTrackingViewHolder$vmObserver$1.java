package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class OrderTrackingViewHolder$vmObserver$1 extends AbstractC7737t implements Function1<ActionV2Response<OrderTrackingDTO>, Unit> {
    final /* synthetic */ OrderTrackingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingViewHolder$vmObserver$1(OrderTrackingViewHolder orderTrackingViewHolder) {
        super(1);
        this.this$0 = orderTrackingViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<OrderTrackingDTO> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<OrderTrackingDTO> actionV2Response) {
        OrderTrackingMapper orderTrackingMapper;
        ComposerReferences composerReferences;
        OrderTrackingItemsAdapter orderTrackingItemsAdapter;
        this.this$0.appendPagePayloads(actionV2Response.getTrackingPayloads());
        OrderTrackingDTO data = actionV2Response.getData();
        if (data != null) {
            OrderTrackingViewHolder orderTrackingViewHolder = this.this$0;
            orderTrackingMapper = orderTrackingViewHolder.orderTrackingMapper;
            OrderTrackingVO boundedData = orderTrackingViewHolder.getBoundedData();
            OrderTrackingVO mapOrderTrackingDTOToVO = orderTrackingMapper.mapOrderTrackingDTOToVO(data, boundedData != null ? Long.valueOf(boundedData.getId()) : null);
            composerReferences = orderTrackingViewHolder.composerReferences;
            composerReferences.getController().d(mapOrderTrackingDTOToVO);
            orderTrackingItemsAdapter = orderTrackingViewHolder.adapter;
            orderTrackingItemsAdapter.submitList(mapOrderTrackingDTOToVO.getItems());
        }
    }
}
