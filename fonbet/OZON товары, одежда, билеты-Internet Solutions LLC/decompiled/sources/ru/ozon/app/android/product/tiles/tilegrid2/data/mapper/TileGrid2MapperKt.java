package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "mapToWishlistKey", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;)Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "mapToSelectionKey", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "toCheckBoxDTOStatus", "(Z)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "getWidgetId", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;)J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "getSeparatedButtonOffset", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)I", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2MapperKt {
    public static final int getSeparatedButtonOffset(ButtonV3DTO buttonV3DTO) {
        ButtonV3DTO.Sizes size;
        return TileGrid2Constants.INSTANCE.getBannerRootBottomPadding() + ((buttonV3DTO == null || (size = buttonV3DTO.getSize()) == null) ? 0 : ResourceExtKt.toPx(size.getHeight()));
    }

    public static final long getWidgetId(@NotNull TileGrid2ItemDTO tileGrid2ItemDTO) {
        AtomActionDTO action;
        String link;
        Uri parse;
        String queryParameter;
        Long y02;
        Intrinsics.checkNotNullParameter(tileGrid2ItemDTO, "<this>");
        TileGrid2ItemDTO.KebabDTO kebab = tileGrid2ItemDTO.getKebab();
        if (kebab == null || (action = kebab.getAction()) == null || (link = action.getLink()) == null || (parse = Uri.parse(link)) == null || (queryParameter = parse.getQueryParameter("widget_id")) == null || (y02 = h.y0(queryParameter)) == null) {
            return -1L;
        }
        return y02.longValue();
    }

    public static final SelectionProductsTileKey mapToSelectionKey(TileGrid2ItemDTO tileGrid2ItemDTO) {
        List<Object> topRightButtons;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        if (tileGrid2ItemDTO == null || (topRightButtons = tileGrid2ItemDTO.getTopRightButtons()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : topRightButtons) {
            if (obj instanceof IconButtonV3DTO) {
                arrayList.add(obj);
            }
        }
        IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) C7714v.M(arrayList);
        if (iconButtonV3DTO == null || (common = iconButtonV3DTO.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("selectionUUID")) == null) {
            return null;
        }
        return new SelectionProductsTileKey(TileGrid2VOKt.getTileId(tileGrid2ItemDTO), str);
    }

    public static final WishlistTileKey mapToWishlistKey(TileGrid2ItemDTO tileGrid2ItemDTO) {
        List<Object> topRightButtons;
        IconButtonV3DTO actionButton;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Long y02;
        if (tileGrid2ItemDTO != null && (topRightButtons = tileGrid2ItemDTO.getTopRightButtons()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : topRightButtons) {
                if (obj instanceof FavoriteToggleProductButtonMolecule) {
                    arrayList.add(obj);
                }
            }
            FavoriteToggleProductButtonMolecule favoriteToggleProductButtonMolecule = (FavoriteToggleProductButtonMolecule) C7714v.M(arrayList);
            if (favoriteToggleProductButtonMolecule != null && (actionButton = favoriteToggleProductButtonMolecule.getActionButton()) != null && (common = actionButton.getCommon()) != null && (action = common.getAction()) != null && (params = action.getParams()) != null && (str = params.get("id")) != null && (y02 = h.y0(str)) != null) {
                return new WishlistTileKey(Long.valueOf(y02.longValue()), TileGrid2VOKt.getTileId(tileGrid2ItemDTO));
            }
        }
        return null;
    }

    @NotNull
    public static final CheckBoxDTO.CheckboxStatus toCheckBoxDTOStatus(boolean z11) {
        return z11 ? CheckBoxDTO.CheckboxStatus.SELECTED : CheckBoxDTO.CheckboxStatus.EMPTY;
    }
}
