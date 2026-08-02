package ru.ozon.app.android.favorites.data.favoriteslist;

import io.reactivex.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.FavoritesListsException;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListResponse;
import vc.C10300e;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/f;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListResponse;)Lio/reactivex/f;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$renameFavoritesList$2 extends AbstractC7737t implements Function1<RenameFavoritesListResponse, f> {
    public static final FavoritesListsRepositoryImpl$renameFavoritesList$2 INSTANCE = new FavoritesListsRepositoryImpl$renameFavoritesList$2();

    FavoritesListsRepositoryImpl$renameFavoritesList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final f invoke(RenameFavoritesListResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String errorForUser = it.getErrorForUser();
        if (errorForUser == null || errorForUser.length() == 0) {
            return C10300e.f102773a;
        }
        throw new FavoritesListsException(it.getErrorForUser(), null);
    }
}
