package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"toShort", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getKey", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "extractActionByFlag", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {
    private static final AtomActionDTO extractActionByFlag(FavoriteEntity favoriteEntity) {
        return (favoriteEntity.isFavorite() ? favoriteEntity.getUnfavoriteButton() : favoriteEntity.getFavoriteButton()).getAction();
    }

    @NotNull
    public static final KeyFavoriteEntityModel getKey(@NotNull FavoriteEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "<this>");
        return new KeyFavoriteEntityModel(favoriteEntity.getId(), favoriteEntity.getType());
    }

    @NotNull
    public static final ShortFavEntity toShort(@NotNull FavoriteEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "<this>");
        return new ShortFavEntity(getKey(favoriteEntity), extractActionByFlag(favoriteEntity), favoriteEntity.isFavorite());
    }
}
