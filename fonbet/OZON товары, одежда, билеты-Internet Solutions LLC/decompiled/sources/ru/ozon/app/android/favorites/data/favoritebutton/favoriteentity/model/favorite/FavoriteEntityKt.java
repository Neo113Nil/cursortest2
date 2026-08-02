package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\u0018\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005*\u00020\u0001¨\u0006\b"}, d2 = {"compareAndGetModel", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "newFavEntity", "clearTrackingInfo", "getButtonTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityKt {
    @NotNull
    public static final FavoriteEntity clearTrackingInfo(@NotNull FavoriteEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "<this>");
        return FavoriteEntity.copy$default(favoriteEntity, null, 0L, false, ButtonV3Atom.SmallIconButton.copy$default(favoriteEntity.getFavoriteButton(), null, null, null, null, null, null, null, 63, null), ButtonV3Atom.SmallIconButton.copy$default(favoriteEntity.getUnfavoriteButton(), null, null, null, null, null, null, null, 63, null), 7, null);
    }

    public static final FavoriteEntity compareAndGetModel(FavoriteEntity favoriteEntity, @NotNull FavoriteEntity newFavEntity) {
        Intrinsics.checkNotNullParameter(newFavEntity, "newFavEntity");
        return (favoriteEntity != null && favoriteEntity.getId() == newFavEntity.getId() && Intrinsics.d(favoriteEntity.getType(), newFavEntity.getType()) && favoriteEntity.isFavorite() != newFavEntity.isFavorite()) ? newFavEntity : favoriteEntity;
    }

    public static final Map<String, TokenizedTrackingInfo> getButtonTrackingInfo(@NotNull FavoriteEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "<this>");
        return (favoriteEntity.isFavorite() ? favoriteEntity.getUnfavoriteButton() : favoriteEntity.getFavoriteButton()).getTrackingInfo();
    }
}
