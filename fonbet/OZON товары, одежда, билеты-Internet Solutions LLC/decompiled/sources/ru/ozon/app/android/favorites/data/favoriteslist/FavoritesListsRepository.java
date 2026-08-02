package ru.ozon.app.android.favorites.data.favoriteslist;

import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J]\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001fH&¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepository;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "sharedListHash", "fromList", "", "category", "parentCategoryId", "", "isWishlist", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "createFavoritesList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lio/reactivex/y;", "id", "Lio/reactivex/b;", "renameFavoritesList", "(JLjava/lang/String;)Lio/reactivex/b;", "removeFavoritesList", "(J)Lio/reactivex/b;", "permission", "shareAsManager", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;", "shareFavoritesList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "actionName", "listId", "changePinStatus", "(Ljava/lang/String;J)Lio/reactivex/b;", "path", "", "params", "changeAccess", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoritesListsRepository {
    @NotNull
    AbstractC7094b changeAccess(@NotNull String path, @NotNull Map<String, String> params);

    @NotNull
    AbstractC7094b changePinStatus(@NotNull String actionName, long listId);

    @NotNull
    y<CreateFavoritesList> createFavoritesList(String title, String sharedListHash, String fromList, Long category, Long parentCategoryId, Boolean isWishlist);

    @NotNull
    AbstractC7094b removeFavoritesList(long id2);

    @NotNull
    AbstractC7094b renameFavoritesList(long id2, @NotNull String title);

    @NotNull
    y<FavoriteShareListVO> shareFavoritesList(long id2, String permission, Boolean shareAsManager);
}
