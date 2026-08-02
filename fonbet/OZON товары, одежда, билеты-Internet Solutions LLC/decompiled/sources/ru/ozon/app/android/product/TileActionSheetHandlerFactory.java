package ru.ozon.app.android.product;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "", "favoriteInteractor", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "subscriptionService", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "favoritesComposerActionHandler", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "<init>", "(Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/subscription/SubscriptionService;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "create", "Lru/ozon/app/android/product/TileActionSheetHandler;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "actionListener", "Lru/ozon/app/android/favorites/domain/bottomsheet/ActionListener;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileActionSheetHandlerFactory {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;

    @NotNull
    private final SubscriptionService subscriptionService;

    public TileActionSheetHandlerFactory(@NotNull FavoriteInteractor favoriteInteractor, @NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull ActionV2Repository actionV2Repository, @NotNull SubscriptionService subscriptionService, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        this.favoriteInteractor = favoriteInteractor;
        this.favoriteEventManager = favoriteEventManager;
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.actionV2Repository = actionV2Repository;
        this.subscriptionService = subscriptionService;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
    }

    @NotNull
    public final TileActionSheetHandler create(@NotNull ComposerReferences references, @NotNull ActionListener actionListener) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        return new TileActionSheetHandler(references, this.favoritesListsInteractor, this.favoriteInteractor, this.favoriteEventManager, this.subscriptionService, actionListener, this.actionV2Repository, this.favoritesComposerActionHandler);
    }
}
