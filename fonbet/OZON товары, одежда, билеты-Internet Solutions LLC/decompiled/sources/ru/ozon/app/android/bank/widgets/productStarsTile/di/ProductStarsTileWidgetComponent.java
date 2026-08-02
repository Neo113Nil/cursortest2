package ru.ozon.app.android.bank.widgets.productStarsTile.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel;
import ru.ozon.app.android.cart.common.di.CartServiceApi;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/di/ProductStarsTileWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "viewModel", "Factory", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProductStarsTileWidgetComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/di/ProductStarsTileWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/bank/widgets/productStarsTile/di/ProductStarsTileWidgetComponent;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        ProductStarsTileWidgetComponent create(@NotNull CartServiceApi cartServiceApi, @NotNull ActionComponentApi actionComponentApi);
    }

    @NotNull
    ProductStarsTileWidgetViewModel getViewModel();
}
