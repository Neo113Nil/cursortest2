package ru.ozon.app.android.account.orders.shipmentwidget.v2.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ShipmentWidgetV2ComponentV2$Companion$create$1$1$parser$2 extends AbstractC7737t implements Function0<ShipmentWidgetV2Parser> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShipmentWidgetV2ComponentV2$Companion$create$1$1$parser$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ShipmentWidgetV2Parser invoke() {
        return new ShipmentWidgetV2Parser(((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getJsonDeserializer(), ((ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class)).getContext());
    }
}
