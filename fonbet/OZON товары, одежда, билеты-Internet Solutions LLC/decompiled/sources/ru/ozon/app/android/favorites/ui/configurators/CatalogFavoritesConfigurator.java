package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/CatalogFavoritesConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/FavoritesConfigurator;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "", "LA00/a$J$a;", "events", "", "fetchUpdateFavorites", "(Ljava/util/List;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogFavoritesConfigurator extends FavoritesConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogFavoritesConfigurator(@NotNull FavoriteManager favoriteManager) {
        super(favoriteManager);
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator
    public void fetchUpdateFavorites(@NotNull List<? extends a.J.InterfaceC0007a> events) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(events, "events");
        for (a.J.InterfaceC0007a interfaceC0007a : events) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                controller.update(interfaceC0007a);
            }
        }
    }
}
