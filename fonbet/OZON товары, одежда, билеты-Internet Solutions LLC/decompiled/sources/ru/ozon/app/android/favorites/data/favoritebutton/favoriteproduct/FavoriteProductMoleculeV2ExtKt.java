package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import B0.C2454a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "", "compactFavoriteIcon", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "mapToV1", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Z)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "extractFavButton", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Z)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "extractUnFavButton", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "mapToListAction", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductMoleculeV2ExtKt {
    private static final ButtonV3Atom.SmallIconButton extractFavButton(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11) {
        String str = z11 ? "ic_compact_fav" : "ic_m_fav_tiles_normal";
        ButtonV3Atom.SmallIconButtonStyle smallIconButtonStyle = ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR;
        Map<String, TokenizedTrackingInfo> trackingInfo = favoriteProductMoleculeV2.getTrackingInfo();
        FavoriteTestInfo testInfo = favoriteProductMoleculeV2.getTestInfo();
        TestInfo favoriteButton = testInfo != null ? testInfo.getFavoriteButton() : null;
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.COMPOSER_ACTION;
        String favLink = favoriteProductMoleculeV2.getFavLink();
        if (favLink == null) {
            favLink = "favoriteBatchAddItems";
        }
        return new ButtonV3Atom.SmallIconButton(str, new AtomActionDTO(behavior, favLink, "addToFavorites", C2454a.b("sku", favoriteProductMoleculeV2.getId())), null, smallIconButtonStyle, null, favoriteButton, trackingInfo, 20, null);
    }

    private static final ButtonV3Atom.SmallIconButton extractUnFavButton(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11) {
        String str = z11 ? "ic_compact_unfav" : "ic_m_fav_tiles_active";
        ButtonV3Atom.SmallIconButtonStyle smallIconButtonStyle = ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR;
        Map<String, TokenizedTrackingInfo> trackingInfo = favoriteProductMoleculeV2.getTrackingInfo();
        FavoriteTestInfo testInfo = favoriteProductMoleculeV2.getTestInfo();
        TestInfo unFavoriteButton = testInfo != null ? testInfo.getUnFavoriteButton() : null;
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.COMPOSER_ACTION;
        String unfavLink = favoriteProductMoleculeV2.getUnfavLink();
        if (unfavLink == null) {
            unfavLink = "favoriteBatchDeleteItems";
        }
        return new ButtonV3Atom.SmallIconButton(str, new AtomActionDTO(behavior, unfavLink, "removeFromFavorites", C2454a.b("sku", favoriteProductMoleculeV2.getId())), null, smallIconButtonStyle, null, unFavoriteButton, trackingInfo, 20, null);
    }

    private static final AtomActionDTO mapToListAction(String str) {
        return str == null ? new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, "ozon://login", null, null, 12, null) : new AtomActionDTO(AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE, str, null, C2454a.b("screenSizeType", "wrap"), 4, null);
    }

    @NotNull
    public static final FavoriteProductMolecule mapToV1(@NotNull FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11) {
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV2, "<this>");
        FavoriteProductMolecule.ThemeType themeType = FavoriteProductMolecule.ThemeType.THEME_TYPE_ICON_SMALL;
        Long y02 = h.y0(favoriteProductMoleculeV2.getId());
        long longValue = y02 != null ? y02.longValue() : 0L;
        Boolean isFav = favoriteProductMoleculeV2.isFav();
        return new FavoriteProductMolecule(themeType, longValue, isFav != null ? isFav.booleanValue() : false, extractFavButton(favoriteProductMoleculeV2, z11), extractUnFavButton(favoriteProductMoleculeV2, z11), mapToListAction(favoriteProductMoleculeV2.getFavListsLink()), null, 64, null);
    }

    public static /* synthetic */ FavoriteProductMolecule mapToV1$default(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return mapToV1(favoriteProductMoleculeV2, z11);
    }
}
