package ru.ozon.app.android.account.orders.orderlist.v4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.orders.orderlist.v4.core.OrderListV4Parser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/account/orders/orderlist/v4/di/OrderListV4Component$Companion$create$1$1", "Lru/ozon/app/android/account/orders/orderlist/v4/di/OrderListV4Component;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/account/orders/orderlist/v4/core/OrderListV4Parser;", "orderListParser$delegate", "LSc/j;", "getOrderListParser", "()Lru/ozon/app/android/account/orders/orderlist/v4/core/OrderListV4Parser;", "orderListParser", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListV4Component$Companion$create$1$1 implements OrderListV4Component {
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: orderListParser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderListParser = k.b(new OrderListV4Component$Companion$create$1$1$orderListParser$2(this));

    OrderListV4Component$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v4.di.OrderListV4Component
    public OrderListV4Parser getOrderListParser() {
        return (OrderListV4Parser) this.orderListParser.getValue();
    }
}
