package ru.ozon.app.android.favorites.configurators;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.configurators.DeleteFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/configurators/DeleteFavoritesListAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/DeleteFavoritesListConfigurator;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "updateFavoritesState", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeleteFavoritesListAsyncConfigurator extends DeleteFavoritesListConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteFavoritesListAsyncConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventsManager) {
        super(favoritesListsEventsManager);
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.DeleteFavoritesListConfigurator
    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
