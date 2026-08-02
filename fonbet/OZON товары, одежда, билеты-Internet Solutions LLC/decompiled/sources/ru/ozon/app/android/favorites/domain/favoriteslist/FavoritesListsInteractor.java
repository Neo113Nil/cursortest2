package ru.ozon.app.android.favorites.domain.favoriteslist;

import W10.c;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J]\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJY\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 JG\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b\"\u0010#J5\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0006H&¢\u0006\u0004\b+\u0010,J+\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00022\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020.H&¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "sharedListHash", "fromList", "", "category", "parentCategoryId", "", "isWishlist", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "createFavoritesList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lio/reactivex/y;", "favoritesListId", "", "productIds", "link", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "from", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "addProductsToFavoritesList", "(JLjava/util/List;Ljava/lang/String;LW10/c;Ljava/lang/String;)Lio/reactivex/y;", "id", "Lio/reactivex/b;", "renameFavoritesList", "(JLjava/lang/String;)Lio/reactivex/b;", "removeFavoritesList", "(J)Lio/reactivex/b;", "productId", "removeProductFromFavoritesList", "(JJLjava/lang/String;LW10/c;)Lio/reactivex/y;", "permission", "shareAsManager", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;", "shareFavoritesList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "actionName", "listId", "changePinStatus", "(Ljava/lang/String;J)Lio/reactivex/b;", "path", "", "params", "changeAccess", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoritesListsInteractor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ y addProductsToFavoritesList$default(FavoritesListsInteractor favoritesListsInteractor, long j11, List list, String str, c cVar, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProductsToFavoritesList");
            }
            if ((i11 & 4) != 0) {
                str = "favoriteListAdd";
            }
            return favoritesListsInteractor.addProductsToFavoritesList(j11, list, str, (i11 & 8) != 0 ? null : cVar, (i11 & 16) != 0 ? null : str2);
        }

        public static /* synthetic */ y createFavoritesList$default(FavoritesListsInteractor favoritesListsInteractor, String str, String str2, String str3, Long l11, Long l12, Boolean bool, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFavoritesList");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                l11 = null;
            }
            if ((i11 & 16) != 0) {
                l12 = null;
            }
            if ((i11 & 32) != 0) {
                bool = null;
            }
            return favoritesListsInteractor.createFavoritesList(str, str2, str3, l11, l12, bool);
        }
    }

    @NotNull
    y<ActionV2Response<FavoriteActionV2Response>> addProductsToFavoritesList(long favoritesListId, @NotNull List<Long> productIds, @NotNull String link, c trackingData, String from);

    @NotNull
    AbstractC7094b changeAccess(@NotNull String path, @NotNull Map<String, String> params);

    @NotNull
    AbstractC7094b changePinStatus(@NotNull String actionName, long listId);

    @NotNull
    y<CreateFavoritesList> createFavoritesList(String title, String sharedListHash, String fromList, Long category, Long parentCategoryId, Boolean isWishlist);

    @NotNull
    AbstractC7094b removeFavoritesList(long id2);

    @NotNull
    y<ActionV2Response<FavoriteActionV2Response>> removeProductFromFavoritesList(long favoritesListId, long productId, @NotNull String link, c trackingData);

    @NotNull
    AbstractC7094b renameFavoritesList(long id2, @NotNull String title);

    @NotNull
    y<FavoriteShareListVO> shareFavoritesList(long id2, String permission, Boolean shareAsManager);
}
