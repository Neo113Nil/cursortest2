package ru.ozon.app.android.checkoutcomposer.deliveryQuantity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetDeliveryQuantityBinding;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.di.DeliveryQuantityWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation.DeliveryQuantityWidgetVH;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/presentation/DeliveryQuantityWidgetVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryQuantityViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, DeliveryQuantityWidgetVH> {
    final /* synthetic */ DeliveryQuantityViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryQuantityViewMapper$holderProducer$1(DeliveryQuantityViewMapper deliveryQuantityViewMapper) {
        super(2);
        this.this$0 = deliveryQuantityViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final DeliveryQuantityWidgetVH invoke(View view, ComposerReferences ref) {
        DeliveryQuantityWidgetComponent deliveryQuantityWidgetComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetDeliveryQuantityBinding bind = WidgetDeliveryQuantityBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        deliveryQuantityWidgetComponent = this.this$0.component;
        return new DeliveryQuantityWidgetVH(bind, deliveryQuantityWidgetComponent.getAppType(), ref);
    }
}
