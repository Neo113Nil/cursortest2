package ru.ozon.app.android.tileselector.domain.selectedstate;

import Sc.InterfaceC4008j;
import j10.InterfaceC7238a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProvider;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "defaultSelectedProductsManager", "LSc/j;", "provideSelectedProductsManager", "(Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProvider;Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;Lru/ozon/app/android/favorites/common/SelectedProductsManager;)LSc/j;", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "provideUgcSelectedProductsManager", "(Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProvider;Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;)Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "tileselector_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectedProductsManagerProviderKt {
    @NotNull
    public static final InterfaceC4008j<SelectedProductsManager> provideSelectedProductsManager(@NotNull SelectedProductsManagerProvider selectedProductsManagerProvider, @NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull SelectedProductsManager defaultSelectedProductsManager) {
        Intrinsics.checkNotNullParameter(selectedProductsManagerProvider, "<this>");
        Intrinsics.checkNotNullParameter(retainComposerComponentApi, "retainComposerComponentApi");
        Intrinsics.checkNotNullParameter(defaultSelectedProductsManager, "defaultSelectedProductsManager");
        InterfaceC7238a<l> composerStore = retainComposerComponentApi.getComposerStore();
        return selectedProductsManagerProvider.get(composerStore.hashCode(), composerStore.b().l().j(), defaultSelectedProductsManager);
    }

    public static final UgcSelectedProductsManager provideUgcSelectedProductsManager(@NotNull SelectedProductsManagerProvider selectedProductsManagerProvider, @NotNull RetainComposerComponentApi retainComposerComponentApi) {
        Intrinsics.checkNotNullParameter(selectedProductsManagerProvider, "<this>");
        Intrinsics.checkNotNullParameter(retainComposerComponentApi, "retainComposerComponentApi");
        InterfaceC7238a<l> composerStore = retainComposerComponentApi.getComposerStore();
        return selectedProductsManagerProvider.get(composerStore.hashCode(), composerStore.b().l().j());
    }
}
