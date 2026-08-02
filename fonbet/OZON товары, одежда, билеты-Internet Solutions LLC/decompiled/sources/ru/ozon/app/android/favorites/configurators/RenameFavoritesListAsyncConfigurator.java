package ru.ozon.app.android.favorites.configurators;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.configurators.RenameFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/configurators/RenameFavoritesListAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/RenameFavoritesListConfigurator;", "favoritesListsEventManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "updateFavoritesState", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenameFavoritesListAsyncConfigurator extends RenameFavoritesListConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenameFavoritesListAsyncConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventManager, @NotNull FeatureChecker featureChecker) {
        super(favoritesListsEventManager, featureChecker);
        Intrinsics.checkNotNullParameter(favoritesListsEventManager, "favoritesListsEventManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.RenameFavoritesListConfigurator
    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
