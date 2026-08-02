package ru.ozon.app.android.pdp.widgets.deliveryV6.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6AsyncPlaceholderMapper$2 extends AbstractC7737t implements Function0<DeliveryV6AsyncPlaceholderMapper> {
    final /* synthetic */ DeliveryV6WidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6AsyncPlaceholderMapper$2(DeliveryV6WidgetComponent$Companion$create$1$1 deliveryV6WidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = deliveryV6WidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DeliveryV6AsyncPlaceholderMapper invoke() {
        AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        androidPlatformComponentDependencies = this.this$0.platformComponentDependencies;
        return new DeliveryV6AsyncPlaceholderMapper(androidPlatformComponentDependencies.getAppType() == AppType.SELECT);
    }
}
