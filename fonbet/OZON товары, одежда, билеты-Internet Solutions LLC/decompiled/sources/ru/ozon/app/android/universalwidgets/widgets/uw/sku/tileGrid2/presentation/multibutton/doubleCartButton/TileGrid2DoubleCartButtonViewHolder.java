package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.TileGrid2CartButtonBaseViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/TileGrid2CartButtonBaseViewHolder;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2DoubleCartButtonVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "addToCartButtonsBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedBottomSheetDelegate;", "relatedBottomSheetDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandlerLazy", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;LWZ/l;LVg/c;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LSc/j;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;LSc/j;LSc/j;Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;)V", "", "bindButtons", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonView;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2DoubleCartButtonViewHolder extends TileGrid2CartButtonBaseViewHolder<TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO> {

    @NotNull
    private final AddToCartButtonsBinder addToCartButtonsBinder;

    @NotNull
    private final TileOverlayBinder overlayBinder;

    @NotNull
    private final TileDislikeInteractor tileDislikeInteractor;

    @NotNull
    private final TileGrid2DoubleCartButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2DoubleCartButtonViewHolder(@NotNull TileGrid2DoubleCartButtonView view, @NotNull ComposerReferences refs, @NotNull AddToCartButtonsBinder addToCartButtonsBinder, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull FrameBinder frameBinder, @NotNull InterfaceC4008j<TileRelatedBottomSheetDelegate> relatedBottomSheetDelegate, @NotNull TileOverlayBinder overlayBinder, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull InterfaceC4008j<? extends SelectionProductsEventsHandler> selectionProductsEventsHandlerLazy, @NotNull TileDislikeInteractor tileDislikeInteractor) {
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
        TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO tileGrid2DoubleCartButtonVO = (TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO) getBoundData();
        if (tileGrid2DoubleCartButtonVO == null) {
            return;
        }
        this.view.setAccesibilityTileID(tileGrid2DoubleCartButtonVO.getAccesibilityTileID());
        getSelectionProductsEventsHandler().updateSelectionProductsData(tileGrid2DoubleCartButtonVO.getTileId(), tileGrid2DoubleCartButtonVO.getOverlayItem());
        AddToCartButtonsBinder addToCartButtonsBinder = this.addToCartButtonsBinder;
        AddToCartButtonView firstButton = this.view.getFirstButton();
        AddToCartButtonView secondButton = this.view.getSecondButton();
        AddToCartButtonDTO button = tileGrid2DoubleCartButtonVO.getFirstButton().getButton();
        AddToCartButtonDTO button2 = tileGrid2DoubleCartButtonVO.getSecondButton().getButton();
        Function1<AtomAction, Unit> actionHandler = getActionHandler();
        Long valueOf = Long.valueOf(tileGrid2DoubleCartButtonVO.getId());
        Long valueOf2 = Long.valueOf(tileGrid2DoubleCartButtonVO.getId());
        AtomActionDTO recShelfAction = tileGrid2DoubleCartButtonVO.getFirstButton().getRecShelfAction();
        if (recShelfAction == null) {
            recShelfAction = tileGrid2DoubleCartButtonVO.getSecondButton().getRecShelfAction();
        }
        addToCartButtonsBinder.bindButtons(firstButton, secondButton, button, button2, actionHandler, valueOf, valueOf2, recShelfAction, new TileGrid2DoubleCartButtonViewHolder$bindButtons$1(tileGrid2DoubleCartButtonVO, this), new TileGrid2DoubleCartButtonViewHolder$bindButtons$2(tileGrid2DoubleCartButtonVO, this), tileGrid2DoubleCartButtonVO.getTheme().getAddToCartButtonConfig());
        TileDislikeId tileDislikeId = new TileDislikeId(tileGrid2DoubleCartButtonVO.getTileId(), tileGrid2DoubleCartButtonVO.getTileWidgetId());
        WishlistTileKey wishlistKey = tileGrid2DoubleCartButtonVO.getWishlistKey();
        boolean isRemovedFromWishlist = wishlistKey != null ? getWishlistService().isRemovedFromWishlist(wishlistKey) : false;
        SelectionProductsTileKey selectionKey = tileGrid2DoubleCartButtonVO.getSelectionKey();
        TileOverlayBinder.bind$default(this.overlayBinder, isRemovedFromWishlist || this.tileDislikeInteractor.isDisliked(tileDislikeId) || (selectionKey != null ? getSelectionProductsEventsHandler().isRemovedFromSelectionProducts(selectionKey) : false), tileGrid2DoubleCartButtonVO.getOverlayItem(), RoundMode.BOTTOM, tileDislikeId, null, 16, null);
    }
}
