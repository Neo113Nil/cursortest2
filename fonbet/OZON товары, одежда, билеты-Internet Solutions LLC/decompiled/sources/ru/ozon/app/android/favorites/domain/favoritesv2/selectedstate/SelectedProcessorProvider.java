package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;", "", "LSc/j;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "get", "(LSc/j;)Lru/ozon/app/android/favorites/common/SelectedProcessor;", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;)Lru/ozon/app/android/favorites/common/SelectedProcessor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SelectedProcessorProvider {
    @NotNull
    SelectedProcessor get(@NotNull InterfaceC4008j<? extends SelectedProductsManager> selectedProductsManager);

    @NotNull
    SelectedProcessor get(@NotNull SelectedProductsManager selectedProductsManager);
}
