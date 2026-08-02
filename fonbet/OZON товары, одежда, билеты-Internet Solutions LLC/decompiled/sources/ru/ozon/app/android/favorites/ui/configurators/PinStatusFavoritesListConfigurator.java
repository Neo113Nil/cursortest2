package ru.ozon.app.android.favorites.ui.configurators;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/PinStatusFavoritesListConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/FavoritesListsUpdateEventsConfigurator;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "<init>", "(Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "handleEvents", "", "events", "", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "updateFavoritesState", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PinStatusFavoritesListConfigurator extends FavoritesListsUpdateEventsConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStatusFavoritesListConfigurator(@NotNull FavoritesListsEventsManager favoritesListsEventsManager) {
        super(favoritesListsEventsManager);
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.FavoritesListsUpdateEventsConfigurator
    public void handleEvents(@NotNull List<? extends FavoritesListsEventsManager.FavoritesListsEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.contains(FavoritesListsEventsManager.FavoritesListsEvent.PinStatusChanged.INSTANCE)) {
            updateFavoritesState();
        }
    }

    public void updateFavoritesState() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }
}
