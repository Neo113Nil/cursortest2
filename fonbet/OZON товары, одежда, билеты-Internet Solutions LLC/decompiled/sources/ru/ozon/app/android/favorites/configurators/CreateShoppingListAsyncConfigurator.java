package ru.ozon.app.android.favorites.configurators;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/configurators/CreateShoppingListAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/CreateShoppingListConfigurator;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "<init>", "(LGZ/g;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "", "updateFavoritesState", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateShoppingListAsyncConfigurator extends CreateShoppingListConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListAsyncConfigurator(@NotNull g ozonRouter, @NotNull FavoritesListsEventsManager favoritesListsEventsManager) {
        super(ozonRouter, favoritesListsEventsManager);
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator
    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
