package ru.ozon.app.android.favorites.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.deeplink.BrandsFilterValuesDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.CreateFavoritesListDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.CreateFavoritesListSelectDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.CreateWishlistGiftDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FamilyDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesCreateDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesEditProductFavList;
import ru.ozon.app.android.favorites.deeplink.FavoritesListDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesListsSelectDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesSellersDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.FavoritesSharedListDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.ListAccessControlDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.ListsFavoritesDeeplinkHandler;
import ru.ozon.app.android.favorites.deeplink.RenameFavoritesListDeeplinkHandler;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/di/FavoritesNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesNavigationModule {

    @NotNull
    public static final FavoritesNavigationModule INSTANCE = new FavoritesNavigationModule();

    private FavoritesNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate, @NotNull FeatureChecker featureChecker, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.b(new FavoritesDeeplinkHandler(favoritesDeeplinkHandlerDelegate), new FavoritesEditProductFavList(favoritesDeeplinkHandlerDelegate, featureChecker), new ListAccessControlDeeplinkHandler(favoritesDeeplinkHandlerDelegate), new FavoritesSellersDeeplinkHandler(favoritesDeeplinkHandlerDelegate, appType), new FavoritesListsSelectDeeplinkHandler(), new FavoritesCreateDeeplinkHandler(), new BrandsFilterValuesDeeplinkHandler(appType), new RenameFavoritesListDeeplinkHandler(favoritesDeeplinkHandlerDelegate), new FavoritesListDeeplinkHandler(favoritesDeeplinkHandlerDelegate, appType), new ListsFavoritesDeeplinkHandler(favoritesDeeplinkHandlerDelegate, featureChecker), new FavoritesSharedListDeeplinkHandler(), new CreateFavoritesListDeeplinkHandler(), new CreateFavoritesListSelectDeeplinkHandler(favoritesDeeplinkHandlerDelegate), new FamilyDeeplinkHandler(), new CreateWishlistGiftDeeplinkHandler());
    }
}
