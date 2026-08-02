package ru.ozon.app.android.favorites.configurators;

import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFromFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/configurators/RemoveFromFavoritesListAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/RemoveFromFavoritesListConfigurator;", "<init>", "()V", "updateFavoritesState", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveFromFavoritesListAsyncConfigurator extends RemoveFromFavoritesListConfigurator {
    @Override // ru.ozon.app.android.favorites.ui.configurators.RemoveFromFavoritesListConfigurator
    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
