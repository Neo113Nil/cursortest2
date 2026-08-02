package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class OrderInfoViewHolder$orderInfoItemsAdapter$1 extends AbstractC7737t implements Function1<OrderInfoVO.OrderProduct, Unit> {
    final /* synthetic */ OrderInfoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderInfoViewHolder$orderInfoItemsAdapter$1(OrderInfoViewHolder orderInfoViewHolder) {
        super(1);
        this.this$0 = orderInfoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderInfoVO.OrderProduct orderProduct) {
        invoke2(orderProduct);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderInfoVO.OrderProduct product) {
        AtomAction action;
        Function1 function1;
        Intrinsics.checkNotNullParameter(product, "product");
        OrderInfoVO boundData = this.this$0.getBoundData();
        if (boundData == null || (action = boundData.getProductsListAction()) == null) {
            action = product.getAction();
        }
        if (action != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
    }
}
