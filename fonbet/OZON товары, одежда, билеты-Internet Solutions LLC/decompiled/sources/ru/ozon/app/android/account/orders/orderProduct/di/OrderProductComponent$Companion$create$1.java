package ru.ozon.app.android.account.orders.orderProduct.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.orderProduct.mappers.OrderProductItemMapper;
import ru.ozon.app.android.account.orders.orderProduct.mappers.OrderProductSeparatorMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"ru/ozon/app/android/account/orders/orderProduct/di/OrderProductComponent$Companion$create$1", "Lru/ozon/app/android/account/orders/orderProduct/di/OrderProductComponent;", "Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductSeparatorMapper;", "separatorMapper$delegate", "LSc/j;", "getSeparatorMapper", "()Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductSeparatorMapper;", "separatorMapper", "Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductItemMapper;", "productsItemMapper$delegate", "getProductsItemMapper", "()Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductItemMapper;", "productsItemMapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductComponent$Companion$create$1 implements OrderProductComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider;

    /* renamed from: separatorMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j separatorMapper = LazyUtilsKt.unsafeLazy(OrderProductComponent$Companion$create$1$separatorMapper$2.INSTANCE);

    /* renamed from: productsItemMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productsItemMapper = LazyUtilsKt.unsafeLazy(OrderProductComponent$Companion$create$1$productsItemMapper$2.INSTANCE);

    OrderProductComponent$Companion$create$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.adultListDelegateProvider = k.b(new OrderProductComponent$Companion$create$1$adultListDelegateProvider$2(this, c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdultHandler getAdultHandler() {
        return ((AccountComponentApi) this.$storage.getComponent(AccountComponentApi.class)).getAdultHandler();
    }

    @Override // ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent
    public OrderProductItemMapper getProductsItemMapper() {
        return (OrderProductItemMapper) this.productsItemMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent
    public OrderProductSeparatorMapper getSeparatorMapper() {
        return (OrderProductSeparatorMapper) this.separatorMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
