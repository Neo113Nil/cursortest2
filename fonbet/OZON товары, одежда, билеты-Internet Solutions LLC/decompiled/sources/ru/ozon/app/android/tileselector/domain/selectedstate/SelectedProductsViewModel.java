package ru.ozon.app.android.tileselector.domain.selectedstate;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "onCleared", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "selectedProductsManager", "setSelectedProductsManager", "(Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;)V", "clearProducts", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "tileselector_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectedProductsViewModel extends w0 {
    private UgcSelectedProductsManager selectedProductsManager;

    public final void clearProducts() {
        UgcSelectedProductsManager ugcSelectedProductsManager = this.selectedProductsManager;
        if (ugcSelectedProductsManager != null) {
            ugcSelectedProductsManager.clear();
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        Function0<Unit> onDestroyCallback;
        clearProducts();
        UgcSelectedProductsManager ugcSelectedProductsManager = this.selectedProductsManager;
        if (ugcSelectedProductsManager == null || (onDestroyCallback = ugcSelectedProductsManager.getOnDestroyCallback()) == null) {
            return;
        }
        onDestroyCallback.invoke();
    }

    public final void setSelectedProductsManager(UgcSelectedProductsManager selectedProductsManager) {
        this.selectedProductsManager = selectedProductsManager;
    }
}
