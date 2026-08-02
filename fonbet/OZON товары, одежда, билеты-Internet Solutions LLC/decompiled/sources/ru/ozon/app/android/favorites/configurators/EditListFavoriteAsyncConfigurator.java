package ru.ozon.app.android.favorites.configurators;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.ui.configurators.EditListFavoriteConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/configurators/EditListFavoriteAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/EditListFavoriteConfigurator;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoritesComposerActionHandler", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "<init>", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "updateFavoriteState", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditListFavoriteAsyncConfigurator extends EditListFavoriteConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditListFavoriteAsyncConfigurator(@NotNull FavoriteEventManager favoriteEventManager, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        super(favoriteEventManager, favoritesComposerActionHandler);
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.EditListFavoriteConfigurator
    public void updateFavoriteState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
