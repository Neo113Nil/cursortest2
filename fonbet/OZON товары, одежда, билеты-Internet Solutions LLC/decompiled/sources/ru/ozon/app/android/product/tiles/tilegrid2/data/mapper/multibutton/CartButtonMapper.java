package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.multibutton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2MapperKt;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2ProductMapper;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.AddToCartContainerMultiButtonModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.AddToCartMultiButtonModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.MultiButtonModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.ReserveMultiButtonModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ButtonsVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2EmptyButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ReserveButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.product.tiles.utils.AccessibilityUtilsKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.AddToCartContainerDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.MultiButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.RelatedProductsCurtain;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/multibutton/CartButtonMapper;", "", "<init>", "()V", "toCartButtonVO", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "tileGrid", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "index", "", "overlayItem", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "theme", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "mapButton", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/MultiButtonModel;", "button", "args", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/multibutton/MultiButtonMapperArgs;", "recShelfAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "formWidgetId", "", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartButtonMapper {
    private final long formWidgetId(TileGrid2ItemDTO tileGrid) {
        Long sku = tileGrid.getSku();
        return ("TileGrid2Cart_" + sku).hashCode();
    }

    private final MultiButtonModel mapButton(Object button, MultiButtonMapperArgs args, AtomActionDTO recShelfAction) {
        if (button instanceof AddToCartButtonDTO) {
            return new AddToCartMultiButtonModel(args.getId(), (AddToCartButtonDTO) button, recShelfAction);
        }
        if (button instanceof FavoriteReserveButtonMolecule) {
            return new ReserveMultiButtonModel(args.getId(), (FavoriteReserveButtonMolecule) button);
        }
        if (!(button instanceof AddToCartContainerDTO)) {
            return null;
        }
        return new AddToCartContainerMultiButtonModel(args.getId(), (AddToCartContainerDTO) button, recShelfAction);
    }

    @NotNull
    public final TileGrid2ButtonsVO toCartButtonVO(@NotNull TileGrid2ItemDTO tileGrid, int index, TileGrid2DTO.OverlayItem overlayItem, @NotNull TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(tileGrid, "tileGrid");
        Intrinsics.checkNotNullParameter(theme, "theme");
        long formWidgetId = formWidgetId(tileGrid);
        long productWidgetId = TileGrid2ProductMapper.INSTANCE.getProductWidgetId(tileGrid);
        String accesibilityTileID = AccessibilityUtilsKt.toAccesibilityTileID(productWidgetId);
        MultiButtonDTO multiButton = tileGrid.getMultiButton();
        if (multiButton == null) {
            return TileGrid2EmptyButtonVO.INSTANCE.getInstance(productWidgetId);
        }
        MultiButtonMapperArgs multiButtonMapperArgs = new MultiButtonMapperArgs(formWidgetId);
        SelectionProductsTileKey mapToSelectionKey = TileGrid2MapperKt.mapToSelectionKey(tileGrid);
        WishlistTileKey mapToWishlistKey = TileGrid2MapperKt.mapToWishlistKey(tileGrid);
        long widgetId = TileGrid2MapperKt.getWidgetId(tileGrid);
        MultiButtonModel mapButton = mapButton(multiButton.getExpressButton(), multiButtonMapperArgs, multiButton.getExpressButtonRecShelfAction());
        MultiButtonModel mapButton2 = mapButton(multiButton.getOzonButton(), multiButtonMapperArgs, multiButton.getOzonButtonRecShelfAction());
        if (mapButton2 instanceof AddToCartContainerMultiButtonModel) {
            AddToCartContainerMultiButtonModel addToCartContainerMultiButtonModel = (AddToCartContainerMultiButtonModel) mapButton2;
            RelatedProductsCurtain relatedProductsCurtain = multiButton.getRelatedProductsCurtain();
            return new TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO(formWidgetId, addToCartContainerMultiButtonModel, mapToWishlistKey, mapToSelectionKey, overlayItem, theme, productWidgetId, accesibilityTileID, index, relatedProductsCurtain != null ? CartButtonMapperKt.toVo(relatedProductsCurtain, formWidgetId) : null, TileGrid2VOKt.getTileId(tileGrid), widgetId);
        }
        if (mapButton instanceof AddToCartContainerMultiButtonModel) {
            AddToCartContainerMultiButtonModel addToCartContainerMultiButtonModel2 = (AddToCartContainerMultiButtonModel) mapButton;
            RelatedProductsCurtain relatedProductsCurtain2 = multiButton.getRelatedProductsCurtain();
            return new TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO(formWidgetId, addToCartContainerMultiButtonModel2, mapToWishlistKey, mapToSelectionKey, overlayItem, theme, productWidgetId, accesibilityTileID, index, relatedProductsCurtain2 != null ? CartButtonMapperKt.toVo(relatedProductsCurtain2, formWidgetId) : null, TileGrid2VOKt.getTileId(tileGrid), widgetId);
        }
        boolean z11 = mapButton instanceof AddToCartMultiButtonModel;
        if (z11 && (mapButton2 instanceof AddToCartMultiButtonModel)) {
            AddToCartMultiButtonModel addToCartMultiButtonModel = (AddToCartMultiButtonModel) mapButton;
            AddToCartMultiButtonModel addToCartMultiButtonModel2 = (AddToCartMultiButtonModel) mapButton2;
            RelatedProductsCurtain relatedProductsCurtain3 = multiButton.getRelatedProductsCurtain();
            return new TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO(formWidgetId, addToCartMultiButtonModel, mapToWishlistKey, mapToSelectionKey, overlayItem, theme, productWidgetId, accesibilityTileID, index, addToCartMultiButtonModel2, relatedProductsCurtain3 != null ? CartButtonMapperKt.toVo(relatedProductsCurtain3, formWidgetId) : null, TileGrid2VOKt.getTileId(tileGrid), widgetId);
        }
        if (mapButton2 instanceof AddToCartMultiButtonModel) {
            AddToCartMultiButtonModel addToCartMultiButtonModel3 = (AddToCartMultiButtonModel) mapButton2;
            RelatedProductsCurtain relatedProductsCurtain4 = multiButton.getRelatedProductsCurtain();
            return new TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO(formWidgetId, addToCartMultiButtonModel3, mapToWishlistKey, mapToSelectionKey, overlayItem, theme, productWidgetId, accesibilityTileID, index, relatedProductsCurtain4 != null ? CartButtonMapperKt.toVo(relatedProductsCurtain4, formWidgetId) : null, TileGrid2VOKt.getTileId(tileGrid), widgetId);
        }
        if (mapButton2 instanceof ReserveMultiButtonModel) {
            return new TileGrid2ReserveButtonVO(formWidgetId, productWidgetId, accesibilityTileID, index, ((ReserveMultiButtonModel) mapButton2).getButton(), mapToWishlistKey, overlayItem);
        }
        if (!z11) {
            return mapButton instanceof ReserveMultiButtonModel ? new TileGrid2ReserveButtonVO(formWidgetId, productWidgetId, accesibilityTileID, index, ((ReserveMultiButtonModel) mapButton).getButton(), mapToWishlistKey, overlayItem) : TileGrid2EmptyButtonVO.INSTANCE.getInstance(productWidgetId);
        }
        AddToCartMultiButtonModel addToCartMultiButtonModel4 = (AddToCartMultiButtonModel) mapButton;
        RelatedProductsCurtain relatedProductsCurtain5 = multiButton.getRelatedProductsCurtain();
        return new TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO(formWidgetId, addToCartMultiButtonModel4, mapToWishlistKey, mapToSelectionKey, overlayItem, theme, productWidgetId, accesibilityTileID, index, relatedProductsCurtain5 != null ? CartButtonMapperKt.toVo(relatedProductsCurtain5, formWidgetId) : null, TileGrid2VOKt.getTileId(tileGrid), widgetId);
    }
}
