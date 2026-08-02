package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalWidgetMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\u00060\u000bj\u0002`\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/di/OrderDoneTotalWidgetComponent$Companion$create$1", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/di/OrderDoneTotalWidgetComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/core/OrderDoneTotalWidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/core/OrderDoneTotalWidgetMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneTotalWidgetComponent$Companion$create$1 implements OrderDoneTotalWidgetComponent {
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderDoneTotalWidgetComponent$Companion$create$1$mapper$2.INSTANCE);

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new OrderDoneTotalWidgetComponent$Companion$create$1$tokenizedAnalytics$2(this));

    OrderDoneTotalWidgetComponent$Companion$create$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di.OrderDoneTotalWidgetComponent
    public OrderDoneTotalWidgetMapper getMapper() {
        return (OrderDoneTotalWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di.OrderDoneTotalWidgetComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }
}
