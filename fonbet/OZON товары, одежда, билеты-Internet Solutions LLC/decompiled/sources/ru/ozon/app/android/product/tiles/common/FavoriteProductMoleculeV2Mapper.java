package ru.ozon.app.android.product.tiles.common;

import B0.C2454a;
import Sc.InterfaceC4008j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteTestInfo;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "", "<init>", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "", "compactFavoriteIcon", "isLikezone", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "extractFavButton", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;ZZ)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "extractUnFavButton", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "mapToListAction", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "dto", "isCompact", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "map", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;ZZ)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "", "addToListActionParams$delegate", "LSc/j;", "getAddToListActionParams", "()Ljava/util/Map;", "addToListActionParams", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FavoriteProductMoleculeV2Mapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: addToListActionParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addToListActionParams = LazyUtilsKt.unsafeLazy(FavoriteProductMoleculeV2Mapper$addToListActionParams$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper$Companion;", "", "<init>", "()V", "FAV_ICON_DEFAULT", "", "UN_FAV_ICON_DEFAULT", "FAV_ICON_COMPACT", "UN_FAV_ICON_COMPACT", "FAV_ICON_LIKEZONE", "UN_FAV_ICON_LIKEZONE", "DEFAULT_FAV_LINK", "DEFAULT_UN_FAV_LINK", "FAV_ACTION_ID", "UN_FAV_ACTION_ID", "PARAMS_ID_KEY", "DEFAULT_LOGIN_URL", "ACTION_SCREEN_SIZE_KEY", "ACTION_SCREEN_SIZE_VALUE", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ButtonV3Atom.SmallIconButton extractFavButton(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11, boolean z12) {
        String str = z11 ? "ic_m_multicolor_heart_compact" : "ic_m_multicolor_heart";
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

    private final ButtonV3Atom.SmallIconButton extractUnFavButton(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11, boolean z12) {
        String str = z11 ? "ic_m_multicolor_heart_filled_compact" : z12 ? "ic_m_multicolor_heart_three_dimensional" : "ic_m_multicolor_heart_filled";
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

    private final Map<String, String> getAddToListActionParams() {
        return (Map) this.addToListActionParams.getValue();
    }

    public static /* synthetic */ FavoriteProductMolecule map$default(FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return favoriteProductMoleculeV2Mapper.map(favoriteProductMoleculeV2, z11, z12);
    }

    private final AtomActionDTO mapToListAction(String str) {
        return str != null ? new AtomActionDTO(AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE, str, null, getAddToListActionParams(), 4, null) : new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, "ozon://login", null, null, 12, null);
    }

    @NotNull
    public final FavoriteProductMolecule map(@NotNull FavoriteProductMoleculeV2 dto, boolean isCompact, boolean isLikezone) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        FavoriteProductMolecule.ThemeType themeType = FavoriteProductMolecule.ThemeType.THEME_TYPE_ICON_SMALL;
        Long y02 = h.y0(dto.getId());
        long longValue = y02 != null ? y02.longValue() : 0L;
        Boolean isFav = dto.isFav();
        return new FavoriteProductMolecule(themeType, longValue, isFav != null ? isFav.booleanValue() : false, extractFavButton(dto, isCompact, isLikezone), extractUnFavButton(dto, isCompact, isLikezone), mapToListAction(dto.getFavListsLink()), null, 64, null);
    }
}
