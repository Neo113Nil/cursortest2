package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di;

import BZ.e;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonWidgetMapper;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/di/OrderDoneCrossButtonWidgetComponent$Companion$create$1", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/di/OrderDoneCrossButtonWidgetComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/core/OrderDoneCrossButtonWidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonecrossbutton/core/OrderDoneCrossButtonWidgetMapper;", "mapper", "LGZ/g;", "router$delegate", "getRouter", "()LGZ/g;", "router", "LBZ/e;", "miniAppConfigHolder$delegate", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneCrossButtonWidgetComponent$Companion$create$1 implements OrderDoneCrossButtonWidgetComponent {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;

    /* renamed from: miniAppConfigHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j miniAppConfigHolder;
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: router$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j router;

    OrderDoneCrossButtonWidgetComponent$Companion$create$1(C7475g c7475g) {
        Context context = ComposerWidgetComponentStorageKt.getContext(c7475g);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        this.mapper = k.b(OrderDoneCrossButtonWidgetComponent$Companion$create$1$mapper$2.INSTANCE);
        this.router = k.b(new OrderDoneCrossButtonWidgetComponent$Companion$create$1$router$2(this));
        this.miniAppConfigHolder = k.b(new OrderDoneCrossButtonWidgetComponent$Companion$create$1$miniAppConfigHolder$2(this));
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetComponent
    public OrderDoneCrossButtonWidgetMapper getMapper() {
        return (OrderDoneCrossButtonWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetComponent
    public e getMiniAppConfigHolder() {
        return (e) this.miniAppConfigHolder.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetComponent
    public g getRouter() {
        return (g) this.router.getValue();
    }
}
