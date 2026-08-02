package ru.ozon.app.android.favorites.configurators;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.configurators.CreateFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.shoppinglists.FavoritesListsUpdate;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/configurators/CreateFavoritesListAsyncConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/CreateFavoritesListConfigurator;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;LWZ/l;)V", "", "updateFavoritesState", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateFavoritesListAsyncConfigurator extends CreateFavoritesListConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFavoritesListAsyncConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull l tokenizedAnalytics) {
        super(favoritesListsEventsManager, favoritesComposerActionHandler, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.CreateFavoritesListConfigurator
    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(FavoritesListsUpdate.INSTANCE);
    }
}
