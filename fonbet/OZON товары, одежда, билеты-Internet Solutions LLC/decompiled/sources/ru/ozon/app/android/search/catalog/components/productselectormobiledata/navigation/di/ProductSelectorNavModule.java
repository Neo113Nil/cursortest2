package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di;

import androidx.appcompat.app.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.ProductSelectorNavigator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/di/ProductSelectorNavModule;", "", "<init>", "()V", "Landroidx/appcompat/app/g;", "activity", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "provideProductSelectorNavigator$search_prodGoogleAllVendorsRelease", "(Landroidx/appcompat/app/g;)Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "provideProductSelectorNavigator", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorNavModule {
    @NotNull
    public final ProductSelectorNavigator provideProductSelectorNavigator$search_prodGoogleAllVendorsRelease(@NotNull g activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new ProductSelectorNavigator(activity);
    }
}
