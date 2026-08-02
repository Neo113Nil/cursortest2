package ru.ozon.app.android.pdp.di.components;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListFragment;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/di/components/CrossSaleListFragmentComponent;", "", "inject", "", "crossSaleListFragment", "Lru/ozon/app/android/pdp/view/crosssale/CrossSaleListFragment;", "Factory", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CrossSaleListFragmentComponent {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/di/components/CrossSaleListFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/pdp/di/components/CrossSaleListFragmentComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CrossSaleListFragmentComponent create(@NotNull NavigationComponentApi navigationComponentApi);
    }

    void inject(@NotNull CrossSaleListFragment crossSaleListFragment);
}
