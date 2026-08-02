package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.ShortFavEntity;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"extractRequestData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteRequestData;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {
    public static final UpdateFavoriteRequestData extractRequestData(@NotNull ShortFavEntity shortFavEntity) {
        String link;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(shortFavEntity, "<this>");
        AtomActionDTO action = shortFavEntity.getAction();
        if (action == null || (link = action.getLink()) == null || (params = shortFavEntity.getAction().getParams()) == null) {
            return null;
        }
        return new UpdateFavoriteRequestData(link, params);
    }
}
