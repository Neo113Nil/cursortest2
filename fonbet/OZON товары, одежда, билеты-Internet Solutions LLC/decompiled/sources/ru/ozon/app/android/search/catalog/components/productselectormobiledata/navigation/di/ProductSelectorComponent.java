package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di;

import androidx.appcompat.app.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.ProductSelectorActivity;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/di/ProductSelectorComponent;", "", "inject", "", "activity", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorActivity;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ProductSelectorComponent {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/di/ProductSelectorComponent$Factory;", "", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Landroidx/appcompat/app/g;", "activity", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/di/ProductSelectorComponent;", "create", "(Lru/ozon/app/android/navigation/di/NavigationComponentApi;Landroidx/appcompat/app/g;)Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/di/ProductSelectorComponent;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ProductSelectorComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull g activity);
    }

    void inject(@NotNull ProductSelectorActivity activity);
}
