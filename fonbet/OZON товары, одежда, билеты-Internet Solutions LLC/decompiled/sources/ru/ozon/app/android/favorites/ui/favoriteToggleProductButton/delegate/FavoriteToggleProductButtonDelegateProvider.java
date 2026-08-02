package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate;

import Pc.a;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;", "", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/viewmodel/FavoriteToggleProductButtonViewModel;", "viewModelProvider", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "<init>", "(LVg/d;LPc/a;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "get", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "LPc/a;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteToggleProductButtonDelegateProvider {

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final a<FavoriteToggleProductButtonViewModel> viewModelProvider;

    public FavoriteToggleProductButtonDelegateProvider(@NotNull d customActionHandlersStoreFactory, @NotNull a<FavoriteToggleProductButtonViewModel> viewModelProvider, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.viewModelProvider = viewModelProvider;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
    }

    @NotNull
    public final FavoriteToggleProductButtonDelegate get(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        return new FavoriteToggleProductButtonDelegateImpl(composerReferences, this.customActionHandlersStoreFactory, this.viewModelProvider, this.favoritesComposerActionHandler);
    }
}
