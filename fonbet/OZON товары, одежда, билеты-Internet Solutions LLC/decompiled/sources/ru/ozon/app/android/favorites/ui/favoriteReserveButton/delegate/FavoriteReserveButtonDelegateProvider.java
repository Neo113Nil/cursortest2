package ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegateProvider;", "", "LPc/a;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;", "get", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;", "LPc/a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteReserveButtonDelegateProvider {

    @NotNull
    private final a<FavoriteReserveButtonViewModel> viewModelProvider;

    public FavoriteReserveButtonDelegateProvider(@NotNull a<FavoriteReserveButtonViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
    }

    @NotNull
    public final FavoriteReserveButtonDelegate get(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new FavoriteReserveButtonDelegateImpl(refs, this.viewModelProvider);
    }
}
