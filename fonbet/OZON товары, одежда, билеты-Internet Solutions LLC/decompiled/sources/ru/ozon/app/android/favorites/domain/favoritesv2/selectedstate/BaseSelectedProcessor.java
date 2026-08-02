package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedIconStateInfo;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/BaseSelectedProcessor;", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "<init>", "()V", "Lkotlin/Function2;", "", "", "", "onStateChangedListener", "startProcessing", "(Lkotlin/jvm/functions/Function2;)V", "stopProcessing", "Lru/ozon/app/android/favorites/common/SelectedIconStateInfo;", "selectionInfo", "onSelectionChanged", "(Lru/ozon/app/android/favorites/common/SelectedIconStateInfo;)V", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseSelectedProcessor implements SelectedProcessor {
    private Function2<? super Long, ? super Boolean, Unit> onStateChangedListener;

    @NotNull
    public abstract SelectedProductsManager getSelectedProductsManager();

    @Override // ru.ozon.app.android.favorites.common.SelectedProcessor
    public void onSelectionChanged(@NotNull SelectedIconStateInfo selectionInfo) {
        Intrinsics.checkNotNullParameter(selectionInfo, "selectionInfo");
        if (selectionInfo.getIsSelected()) {
            getSelectedProductsManager().removeProduct(selectionInfo.getSku());
        } else {
            getSelectedProductsManager().addProduct(selectionInfo.getSku());
        }
        Function2<? super Long, ? super Boolean, Unit> function2 = this.onStateChangedListener;
        if (function2 != null) {
            function2.invoke(Long.valueOf(selectionInfo.getSku()), Boolean.valueOf(!selectionInfo.getIsSelected()));
        }
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProcessor
    public void startProcessing(@NotNull Function2<? super Long, ? super Boolean, Unit> onStateChangedListener) {
        Intrinsics.checkNotNullParameter(onStateChangedListener, "onStateChangedListener");
        this.onStateChangedListener = onStateChangedListener;
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProcessor
    public void stopProcessing() {
        this.onStateChangedListener = null;
    }
}
