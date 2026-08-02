package ru.ozon.app.android.fresh.geo.ui.molecules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductFavoriteExpressMoleculeViewKt {
    @NotNull
    public static final ButtonV3Atom.SmallIconButton getButton(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "<this>");
        return favoriteProductMolecule.isFavorite() ? favoriteProductMolecule.getUnfavoriteButton() : favoriteProductMolecule.getFavoriteButton();
    }
}
