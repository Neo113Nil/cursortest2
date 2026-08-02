package ru.ozon.app.android.favorites.data.favoriteslist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListResponse;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListResponse;", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$renameFavoritesList$1 extends AbstractC7737t implements Function1<ActionV2Response<RenameFavoritesListResponse>, RenameFavoritesListResponse> {
    public static final FavoritesListsRepositoryImpl$renameFavoritesList$1 INSTANCE = new FavoritesListsRepositoryImpl$renameFavoritesList$1();

    FavoritesListsRepositoryImpl$renameFavoritesList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RenameFavoritesListResponse invoke(ActionV2Response<RenameFavoritesListResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getData();
    }
}
