package ru.ozon.app.android.favorites.data.favoriteslist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.FavoritesListsException;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "kotlin.jvm.PlatformType", "nwModel", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;)Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$createFavoritesList$3 extends AbstractC7737t implements Function1<CreateFavoritesListResponse, CreateFavoritesList> {
    public static final FavoritesListsRepositoryImpl$createFavoritesList$3 INSTANCE = new FavoritesListsRepositoryImpl$createFavoritesList$3();

    FavoritesListsRepositoryImpl$createFavoritesList$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CreateFavoritesList invoke(CreateFavoritesListResponse nwModel) {
        Intrinsics.checkNotNullParameter(nwModel, "nwModel");
        String errorForUser = nwModel.getErrorForUser();
        if (errorForUser != null && errorForUser.length() != 0) {
            throw new FavoritesListsException(nwModel.getErrorForUser(), null);
        }
        Long id2 = nwModel.getId();
        if (id2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long longValue = id2.longValue();
        String deeplink = nwModel.getDeeplink();
        if (deeplink == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String link = nwModel.getLink();
        if (link == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String title = nwModel.getTitle();
        if (title == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String description = nwModel.getDescription();
        if (description != null) {
            return new CreateFavoritesList(longValue, deeplink, link, title, description);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
