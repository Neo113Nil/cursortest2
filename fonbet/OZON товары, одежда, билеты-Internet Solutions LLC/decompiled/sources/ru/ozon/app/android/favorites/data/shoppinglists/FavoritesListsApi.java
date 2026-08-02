package ru.ozon.app.android.favorites.data.shoppinglists;

import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.ChangeListPinStatusRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteListSetSKUs;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RemoveFavoritesListsRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListResponse;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\t2\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001eH'¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/FavoritesListsApi;", "", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "createFavoriteList", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListRequest;)Lio/reactivex/y;", "", "actionName", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteListSetSKUs;", "Lio/reactivex/b;", "favortieListSetSKUs", "(Ljava/lang/String;Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteListSetSKUs;)Lio/reactivex/b;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListRequest;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListResponse;", "renameFavoritesList", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/RemoveFavoritesListsRequest;", "removeFavoritesLists", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/RemoveFavoritesListsRequest;)Lio/reactivex/b;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListRequest;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListResponse;", "favoriteShareList", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeListPinStatusRequest;", "changePinStatus", "(Ljava/lang/String;Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeListPinStatusRequest;)Lio/reactivex/b;", ImagesContract.URL, "", "body", "changeAccess", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoritesListsApi {
    @POST
    @NotNull
    AbstractC7094b changeAccess(@Url @NotNull String url, @Body @NotNull Map<String, String> body);

    @POST("composer-api.bx/_action/v2/{actionName}")
    @NotNull
    AbstractC7094b changePinStatus(@Path("actionName") @NotNull String actionName, @Body @NotNull ChangeListPinStatusRequest request);

    @POST("composer-api.bx/_action/v2/favoriteCreateList")
    @NotNull
    y<ActionV2Response<CreateFavoritesListResponse>> createFavoriteList(@Body @NotNull CreateFavoritesListRequest request);

    @POST("composer-api.bx/_action/v2/favoriteShareList")
    @NotNull
    y<ActionV2Response<FavoriteShareListResponse>> favoriteShareList(@Body @NotNull FavoriteShareListRequest request);

    @POST("composer-api.bx/_action/v2/{actionName}")
    @NotNull
    AbstractC7094b favortieListSetSKUs(@Path("actionName") @NotNull String actionName, @Body @NotNull FavoriteListSetSKUs request);

    @POST("composer-api.bx/_action/v2/favoriteDeleteList")
    @NotNull
    AbstractC7094b removeFavoritesLists(@Body @NotNull RemoveFavoritesListsRequest request);

    @POST("composer-api.bx/_action/v2/favoriteRenameList")
    @NotNull
    y<ActionV2Response<RenameFavoritesListResponse>> renameFavoritesList(@Body @NotNull RenameFavoritesListRequest request);
}
