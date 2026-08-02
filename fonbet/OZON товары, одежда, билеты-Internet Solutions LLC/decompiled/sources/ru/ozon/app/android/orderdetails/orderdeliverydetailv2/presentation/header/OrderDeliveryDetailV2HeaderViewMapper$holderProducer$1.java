package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.header;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.OrderDiliveryDetailHeaderV2Binding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/header/OrderDeliveryV2HeaderViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderDeliveryDetailV2HeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OrderDeliveryV2HeaderViewHolder> {
    public static final OrderDeliveryDetailV2HeaderViewMapper$holderProducer$1 INSTANCE = new OrderDeliveryDetailV2HeaderViewMapper$holderProducer$1();

    OrderDeliveryDetailV2HeaderViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final OrderDeliveryV2HeaderViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        OrderDiliveryDetailHeaderV2Binding bind = OrderDiliveryDetailHeaderV2Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new OrderDeliveryV2HeaderViewHolder(bind, composerReferences);
    }
}
