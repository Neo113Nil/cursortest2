package ru.ozon.app.android.favorites.domain.favoriteslist;

import Bc.v;
import DM.h;
import GH.a;
import W10.c;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository;
import ru.ozon.app.android.favorites.data.shoppinglists.models.ChangeProductsStateInFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJS\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J1\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00152\u0006\u0010'\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000f2\b\u0010.\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020(2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u00105J+\u00109\u001a\u00020(2\u0006\u00106\u001a\u00020\u000f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f07H\u0016¢\u0006\u0004\b9\u0010:R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractorImpl;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepository;", "favoritesListsRepository", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepository;)V", "", "favoritesListId", "", "productIds", "", "link", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "from", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "addProductsToFavoritesList", "(JLjava/util/List;Ljava/lang/String;LW10/c;Ljava/lang/String;)Lio/reactivex/y;", "productId", "removeProductFromFavoritesList", "(JJLjava/lang/String;LW10/c;)Lio/reactivex/y;", SelectionItemFormDTO.TITLE_FIELD_NAME, "sharedListHash", "fromList", "category", "parentCategoryId", "", "isWishlist", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "createFavoritesList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lio/reactivex/y;", "id", "Lio/reactivex/b;", "renameFavoritesList", "(JLjava/lang/String;)Lio/reactivex/b;", "removeFavoritesList", "(J)Lio/reactivex/b;", "permission", "shareAsManager", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;", "shareFavoritesList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "actionName", "listId", "changePinStatus", "(Ljava/lang/String;J)Lio/reactivex/b;", "path", "", "params", "changeAccess", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepository;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesListsInteractorImpl implements FavoritesListsInteractor {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final FavoritesListsRepository favoritesListsRepository;

    @NotNull
    private final JsonParser jsonDeserializer;

    public FavoritesListsInteractorImpl(@NotNull JsonParser jsonDeserializer, @NotNull ActionV2Repository actionV2Repository, @NotNull FavoritesListsRepository favoritesListsRepository) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(favoritesListsRepository, "favoritesListsRepository");
        this.jsonDeserializer = jsonDeserializer;
        this.actionV2Repository = actionV2Repository;
        this.favoritesListsRepository = favoritesListsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C addProductsToFavoritesList$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C removeProductFromFavoritesList$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public y<ActionV2Response<FavoriteActionV2Response>> addProductsToFavoritesList(long favoritesListId, @NotNull List<Long> productIds, @NotNull String link, c trackingData, String from) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(link, "link");
        ActionV2Request actionV2Request = new ActionV2Request(new ChangeProductsStateInFavoritesListRequest(favoritesListId, productIds, from), link, false, 4, null);
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, FavoriteActionV2Response.class);
        h hVar = new h(new FavoritesListsInteractorImpl$addProductsToFavoritesList$1(this), 7);
        callActionWithTracking.getClass();
        v vVar = new v(callActionWithTracking, hVar);
        Intrinsics.checkNotNullExpressionValue(vVar, "onErrorResumeNext(...)");
        return vVar;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public AbstractC7094b changeAccess(@NotNull String path, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        return this.favoritesListsRepository.changeAccess(path, params);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public AbstractC7094b changePinStatus(@NotNull String actionName, long listId) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return this.favoritesListsRepository.changePinStatus(actionName, listId);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public y<CreateFavoritesList> createFavoritesList(String title, String sharedListHash, String fromList, Long category, Long parentCategoryId, Boolean isWishlist) {
        return this.favoritesListsRepository.createFavoritesList(title, sharedListHash, fromList, category, parentCategoryId, isWishlist);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public AbstractC7094b removeFavoritesList(long id2) {
        return this.favoritesListsRepository.removeFavoritesList(id2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public y<ActionV2Response<FavoriteActionV2Response>> removeProductFromFavoritesList(long favoritesListId, long productId, @NotNull String link, c trackingData) {
        Intrinsics.checkNotNullParameter(link, "link");
        ActionV2Request actionV2Request = new ActionV2Request(new ChangeProductsStateInFavoritesListRequest(favoritesListId, C7714v.a0(Long.valueOf(productId)), null, 4, null), link, false, 4, 0 == true ? 1 : 0);
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, FavoriteActionV2Response.class);
        a aVar = new a(new FavoritesListsInteractorImpl$removeProductFromFavoritesList$1(this), 13);
        callActionWithTracking.getClass();
        v vVar = new v(callActionWithTracking, aVar);
        Intrinsics.checkNotNullExpressionValue(vVar, "onErrorResumeNext(...)");
        return vVar;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public AbstractC7094b renameFavoritesList(long id2, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return this.favoritesListsRepository.renameFavoritesList(id2, title);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor
    @NotNull
    public y<FavoriteShareListVO> shareFavoritesList(long id2, String permission, Boolean shareAsManager) {
        return this.favoritesListsRepository.shareFavoritesList(id2, permission, shareAsManager);
    }
}
