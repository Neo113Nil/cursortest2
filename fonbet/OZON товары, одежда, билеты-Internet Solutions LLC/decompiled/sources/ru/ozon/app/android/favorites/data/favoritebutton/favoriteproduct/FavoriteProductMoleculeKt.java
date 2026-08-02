package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"getButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getAnalyticActionType", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteProductMoleculeKt {
    @NotNull
    public static final String getAnalyticActionType(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "<this>");
        return (favoriteProductMolecule.isFavorite() ? ActionType.UNFAVORITE.INSTANCE : ActionType.FAVORITE.INSTANCE).getType();
    }

    @NotNull
    public static final ButtonV3Atom.SmallIconButton getButton(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "<this>");
        return favoriteProductMolecule.isFavorite() ? favoriteProductMolecule.getUnfavoriteButton() : favoriteProductMolecule.getFavoriteButton();
    }
}
