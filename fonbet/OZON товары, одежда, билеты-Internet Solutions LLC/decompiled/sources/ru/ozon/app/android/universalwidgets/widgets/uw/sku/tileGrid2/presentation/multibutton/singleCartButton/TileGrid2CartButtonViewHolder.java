package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartButton;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.TileGrid2CartButtonBaseViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002By\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartButton/TileGrid2CartButtonViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/TileGrid2CartButtonBaseViewHolder;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2CartButtonSingleVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartButton/TileGrid2SingleCartButtonView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "addToCartButtonsBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedBottomSheetDelegate;", "relatedBottomSheetDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandlerLazy", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartButton/TileGrid2SingleCartButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;LWZ/l;LVg/c;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LSc/j;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;LSc/j;LSc/j;Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;)V", "", "bindButtons", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartButton/TileGrid2SingleCartButtonView;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2CartButtonViewHolder extends TileGrid2CartButtonBaseViewHolder<TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final AddToCartButtonsBinder addToCartButtonsBinder;

    @NotNull
    private final TileOverlayBinder overlayBinder;

    @NotNull
    private final TileDislikeInteractor tileDislikeInteractor;

    @NotNull
    private final TileGrid2SingleCartButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2CartButtonViewHolder(@NotNull TileGrid2SingleCartButtonView view, @NotNull ComposerReferences refs, @NotNull AddToCartButtonsBinder addToCartButtonsBinder, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull FrameBinder frameBinder, @NotNull InterfaceC4008j<TileRelatedBottomSheetDelegate> relatedBottomSheetDelegate, @NotNull TileOverlayBinder overlayBinder, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull InterfaceC4008j<? extends SelectionProductsEventsHandler> selectionProductsEventsHandlerLazy, @NotNull TileDislikeInteractor tileDislikeInteractor) {
        super(view, refs, addToCartButtonsBinder, tokenizedAnalytics, customActionHandlersStore, frameBinder, relatedBottomSheetDelegate, overlayBinder, wishlistServiceLazy, selectionProductsEventsHandlerLazy);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(addToCartButtonsBinder, "addToCartButtonsBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(relatedBottomSheetDelegate, "relatedBottomSheetDelegate");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        Intrinsics.checkNotNullParameter(selectionProductsEventsHandlerLazy, "selectionProductsEventsHandlerLazy");
        Intrinsics.checkNotNullParameter(tileDislikeInteractor, "tileDislikeInteractor");
        this.view = view;
        this.addToCartButtonsBinder = addToCartButtonsBinder;
        this.overlayBinder = overlayBinder;
        this.tileDislikeInteractor = tileDislikeInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.TileGrid2CartButtonBaseViewHolder
    public void bindButtons() {
        TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO tileGrid2CartButtonSingleVO = (TileGrid2CartButtonVO.TileGrid2CartButtonSingleVO) getBoundData();
        if (tileGrid2CartButtonSingleVO == null) {
            return;
        }
        this.view.setAccesibilityTileID(tileGrid2CartButtonSingleVO.getAccesibilityTileID());
        if (tileGrid2CartButtonSingleVO.getSelectionKey() != null) {
            getSelectionProductsEventsHandler().updateSelectionProductsData(tileGrid2CartButtonSingleVO.getTileId(), tileGrid2CartButtonSingleVO.getOverlayItem());
        }
        this.addToCartButtonsBinder.bindButtons(this.view.getAddToCartBtn(), null, tileGrid2CartButtonSingleVO.getFirstButton().getButton(), null, getActionHandler(), Long.valueOf(tileGrid2CartButtonSingleVO.getId()), null, tileGrid2CartButtonSingleVO.getFirstButton().getRecShelfAction(), new TileGrid2CartButtonViewHolder$bindButtons$2(tileGrid2CartButtonSingleVO, this), new TileGrid2CartButtonViewHolder$bindButtons$3(tileGrid2CartButtonSingleVO, this), tileGrid2CartButtonSingleVO.getTheme().getAddToCartButtonConfig());
        TileDislikeId tileDislikeId = new TileDislikeId(tileGrid2CartButtonSingleVO.getTileId(), tileGrid2CartButtonSingleVO.getTileWidgetId());
        WishlistTileKey wishlistKey = tileGrid2CartButtonSingleVO.getWishlistKey();
        boolean isRemovedFromWishlist = wishlistKey != null ? getWishlistService().isRemovedFromWishlist(wishlistKey) : false;
        SelectionProductsTileKey selectionKey = tileGrid2CartButtonSingleVO.getSelectionKey();
        TileOverlayBinder.bind$default(this.overlayBinder, isRemovedFromWishlist || this.tileDislikeInteractor.isDisliked(tileDislikeId) || (selectionKey != null ? getSelectionProductsEventsHandler().isRemovedFromSelectionProducts(selectionKey) : false), tileGrid2CartButtonSingleVO.getOverlayItem(), RoundMode.BOTTOM, tileDislikeId, null, 16, null);
    }
}
