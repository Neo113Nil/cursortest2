package ru.ozon.app.android.favorites.data.favoriteslist;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListResponse;)Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$shareFavoritesList$2 extends AbstractC7737t implements Function1<FavoriteShareListResponse, FavoriteShareListVO> {
    public static final FavoritesListsRepositoryImpl$shareFavoritesList$2 INSTANCE = new FavoritesListsRepositoryImpl$shareFavoritesList$2();

    FavoritesListsRepositoryImpl$shareFavoritesList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FavoriteShareListVO invoke(FavoriteShareListResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new FavoriteShareListVO(g.c(it.getTitle(), " ", it.getUrl()));
    }
}
