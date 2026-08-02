package ru.ozon.app.android.favorites.data.api;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/data/api/FavoriteApi;", "", "Lru/ozon/app/android/favorites/data/api/FavoriteRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse;", "addFavorite", "(Lru/ozon/app/android/favorites/data/api/FavoriteRequest;)Lio/reactivex/y;", "removeFromFavorites", "Lru/ozon/app/android/favorites/data/api/FavoriteResponse;", "checkFavorite", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteApi {
    @POST("/composer-api.bx/_action/v2/favoriteBatchAddItems")
    @NotNull
    y<ActionV2Response<ChangeFavoriteStateResponse>> addFavorite(@Body @NotNull FavoriteRequest request);

    @POST("/composer-api.bx/_action/v2/favoriteCheckItems")
    @NotNull
    y<ActionV2Response<FavoriteResponse>> checkFavorite(@Body @NotNull FavoriteRequest request);

    @POST("/composer-api.bx/_action/v2/favoriteBatchDeleteItems")
    @NotNull
    y<ActionV2Response<ChangeFavoriteStateResponse>> removeFromFavorites(@Body @NotNull FavoriteRequest request);
}
