package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/models/FavoriteEntityVO;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "extractButtonByFavoriteFlag", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityVOKt {
    private static final ButtonV3Atom.SmallIconButton extractButtonByFavoriteFlag(FavoriteEntity favoriteEntity) {
        return favoriteEntity.isFavorite() ? favoriteEntity.getUnfavoriteButton() : favoriteEntity.getFavoriteButton();
    }

    @NotNull
    public static final FavoriteEntityVO toVO(@NotNull FavoriteEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "<this>");
        return new FavoriteEntityVO(extractButtonByFavoriteFlag(favoriteEntity));
    }
}
