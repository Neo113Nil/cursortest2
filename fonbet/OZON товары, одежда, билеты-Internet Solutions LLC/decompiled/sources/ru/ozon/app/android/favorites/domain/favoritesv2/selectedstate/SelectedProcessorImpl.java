package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProcessorImpl;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/BaseSelectedProcessor;", "selectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;)V", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedProcessorImpl extends BaseSelectedProcessor {

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    public SelectedProcessorImpl(@NotNull SelectedProductsManager selectedProductsManager) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        this.selectedProductsManager = selectedProductsManager;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.BaseSelectedProcessor
    @NotNull
    public SelectedProductsManager getSelectedProductsManager() {
        return this.selectedProductsManager;
    }
}
