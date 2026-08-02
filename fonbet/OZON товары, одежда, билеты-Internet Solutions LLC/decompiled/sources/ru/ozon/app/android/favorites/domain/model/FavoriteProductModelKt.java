package ru.ozon.app.android.favorites.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"toModel", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "getButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAnalyticActionType", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductModelKt {
    @NotNull
    public static final String getAnalyticActionType(@NotNull FavoriteProductModel favoriteProductModel) {
        Intrinsics.checkNotNullParameter(favoriteProductModel, "<this>");
        return (favoriteProductModel.getIsFavorite() ? ActionType.UNFAVORITE.INSTANCE : ActionType.FAVORITE.INSTANCE).getType();
    }

    @NotNull
    public static final IconButtonV3DTO getButton(@NotNull FavoriteProductModel favoriteProductModel) {
        Intrinsics.checkNotNullParameter(favoriteProductModel, "<this>");
        return favoriteProductModel.getIsFavorite() ? favoriteProductModel.getUnfavoriteButton() : favoriteProductModel.getFavoriteButton();
    }

    @NotNull
    public static final FavoriteProductModel toModel(@NotNull FavoriteProductMoleculeV4 favoriteProductMoleculeV4) {
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV4, "<this>");
        return new FavoriteProductModel(favoriteProductMoleculeV4.getSku(), favoriteProductMoleculeV4.isFavorite(), favoriteProductMoleculeV4.getFavoriteButton(), favoriteProductMoleculeV4.getUnfavoriteButton(), favoriteProductMoleculeV4.getAddToListAction(), null, 32, null);
    }
}
