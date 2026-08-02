package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProductsManagerVmWrapper;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;)V", "", "onCleared", "()V", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedProductsManagerVmWrapper extends w0 {

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    public SelectedProductsManagerVmWrapper(@NotNull SelectedProductsManager selectedProductsManager) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        this.selectedProductsManager = selectedProductsManager;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.selectedProductsManager.clear();
    }
}
