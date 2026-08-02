package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity;

import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/FavoriteEntityApi;", "", "", "actionName", "", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;", "updateFavorite", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteEntityApi {
    @POST("composer-api.bx/_action/v2/{actionName}")
    @NotNull
    y<ActionV2Response<UpdateFavoriteResponse>> updateFavorite(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, String> request);
}
