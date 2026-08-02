package ru.ozon.app.android.orderdetails.productsToPay.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewMapper.ProductsToPayCellMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper.ProductsToPayMapper;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u00060\u0017j\u0002`\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/orderdetails/productsToPay/di/ProductsToPayWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/orderdetails/productsToPay/di/ProductsToPayWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "getAccountComponentApi", "()Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getAnalyticsComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewMapper/ProductsToPayMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewMapper/ProductsToPayMapper;", "mapper", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewMapper/ProductsToPayCellMapper;", "cellMapper$delegate", "getCellMapper", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewMapper/ProductsToPayCellMapper;", "cellMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "getAdultDelegate", "()Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayWidgetComponent$Companion$create$1$1 implements ProductsToPayWidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final RetainComposerComponentApi analyticsComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ProductsToPayWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: cellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cellMapper = k.b(ProductsToPayWidgetComponent$Companion$create$1$1$cellMapper$2.INSTANCE);

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new ProductsToPayWidgetComponent$Companion$create$1$1$tokenizedAnalytics$2(this));

    ProductsToPayWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.analyticsComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayWidgetComponent
    public AdultDelegate<ProductsToPayVO.ProductImageVO> getAdultDelegate() {
        return new AdultDelegate<>(this.accountComponentApi.getAdultHandler());
    }

    public final RetainComposerComponentApi getAnalyticsComponentApi() {
        return this.analyticsComponentApi;
    }

    @Override // ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayWidgetComponent
    public ProductsToPayCellMapper getCellMapper() {
        return (ProductsToPayCellMapper) this.cellMapper.getValue();
    }

    @Override // ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayWidgetComponent
    public ProductsToPayMapper getMapper() {
        return (ProductsToPayMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayWidgetComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }
}
