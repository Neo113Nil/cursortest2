package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProviderImpl;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorProvider;", "<init>", "()V", "LSc/j;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "get", "(LSc/j;)Lru/ozon/app/android/favorites/common/SelectedProcessor;", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;)Lru/ozon/app/android/favorites/common/SelectedProcessor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedProcessorProviderImpl implements SelectedProcessorProvider {
    @Override // ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider
    @NotNull
    public SelectedProcessor get(@NotNull InterfaceC4008j<? extends SelectedProductsManager> selectedProductsManager) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        return new LazySelectedProcessorImpl(selectedProductsManager);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider
    @NotNull
    public SelectedProcessor get(@NotNull SelectedProductsManager selectedProductsManager) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        return new SelectedProcessorImpl(selectedProductsManager);
    }
}
