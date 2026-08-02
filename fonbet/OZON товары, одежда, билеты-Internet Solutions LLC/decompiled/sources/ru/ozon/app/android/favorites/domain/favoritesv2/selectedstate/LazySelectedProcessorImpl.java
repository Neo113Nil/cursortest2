package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/LazySelectedProcessorImpl;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/BaseSelectedProcessor;", "LSc/j;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "lazySelectedProductsManager", "<init>", "(LSc/j;)V", "LSc/j;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LazySelectedProcessorImpl extends BaseSelectedProcessor {

    @NotNull
    private final InterfaceC4008j<SelectedProductsManager> lazySelectedProductsManager;

    /* JADX WARN: Multi-variable type inference failed */
    public LazySelectedProcessorImpl(@NotNull InterfaceC4008j<? extends SelectedProductsManager> lazySelectedProductsManager) {
        Intrinsics.checkNotNullParameter(lazySelectedProductsManager, "lazySelectedProductsManager");
        this.lazySelectedProductsManager = lazySelectedProductsManager;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.BaseSelectedProcessor
    @NotNull
    public SelectedProductsManager getSelectedProductsManager() {
        return this.lazySelectedProductsManager.getValue();
    }
}
