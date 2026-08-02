package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton;

import Sc.InterfaceC4008j;
import a00.C4908c;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ReserveButtonVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.ReserveButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ReserveButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/ReserveButtonBinder;", "reserveButtonBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/ReserveButtonBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;LSc/j;)V", "", "bindButton", "()V", "", "show", "bindOverlay", "(Z)V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ReserveButtonVO;Ll20/d;)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "onDetach", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/ReserveButtonBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindSteps", "Ljava/util/List;", "wishlistService$delegate", "LSc/j;", "getWishlistService", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistService", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "wishlistSubscriber", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2ReserveButtonViewHolder extends k<TileGrid2ReserveButtonVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final TileOverlayBinder overlayBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReserveButtonBinder reserveButtonBinder;

    @NotNull
    private final TileGrid2ReserveButtonView view;

    /* renamed from: wishlistService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wishlistService;

    @NotNull
    private final WishlistSubscriber wishlistSubscriber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2ReserveButtonViewHolder(@NotNull TileGrid2ReserveButtonView view, @NotNull ComposerReferences refs, @NotNull ReserveButtonBinder reserveButtonBinder, @NotNull FrameBinder frameBinder, @NotNull TileOverlayBinder overlayBinder, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy) {
        super(view);
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(reserveButtonBinder, "reserveButtonBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        this.view = view;
        this.refs = refs;
        this.reserveButtonBinder = reserveButtonBinder;
        this.frameBinder = frameBinder;
        this.overlayBinder = overlayBinder;
        this.bindSteps = C7714v.a0(new TileGrid2ReserveButtonViewHolder$bindSteps$1(this));
        this.wishlistService = wishlistServiceLazy;
        this.wishlistSubscriber = new WishlistSubscriber(wishlistServiceLazy, new TileGrid2ReserveButtonViewHolder$wishlistSubscriber$1(this));
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton() {
        TileGrid2ReserveButtonVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.view.setAccesibilityTileID(boundData.getAccesibilityTileID());
        this.reserveButtonBinder.bindButton(this.view.getReserveButton(), boundData.getMolecule(), this);
        WishlistTileKey wishlistKey = boundData.getWishlistKey();
        TileOverlayBinder.bind$default(this.overlayBinder, wishlistKey != null ? getWishlistService().isRemovedFromWishlist(wishlistKey) : false, boundData.getOverlayItem(), RoundMode.BOTTOM, null, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOverlay(boolean show) {
        TileGrid2ReserveButtonVO boundData;
        TileOverlayBinder tileOverlayBinder = this.overlayBinder;
        TileGrid2DTO.OverlayItem overlayItem = null;
        if (show && (boundData = getBoundData()) != null) {
            overlayItem = boundData.getOverlayItem();
        }
        TileOverlayBinder.bind$default(tileOverlayBinder, show, overlayItem, RoundMode.BOTTOM, null, null, 24, null);
    }

    private final WishlistService getWishlistService() {
        return (WishlistService) this.wishlistService.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton.TileGrid2ReserveButtonViewHolder$onAttach$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                WishlistSubscriber wishlistSubscriber;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                wishlistSubscriber = TileGrid2ReserveButtonViewHolder.this.wishlistSubscriber;
                D a11 = K.a(TileGrid2ReserveButtonViewHolder.this);
                composerReferences = TileGrid2ReserveButtonViewHolder.this.refs;
                C4908c g10 = composerReferences.getContainer().g();
                TileGrid2ReserveButtonVO boundData = TileGrid2ReserveButtonViewHolder.this.getBoundData();
                wishlistSubscriber.subscribeIfNeed(a11, g10, boundData != null ? boundData.getWishlistKey() : null);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TileGrid2ReserveButtonViewHolder.this.getLifecycle().e(this);
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TileGrid2ReserveButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.frameBinder.bind(this.bindSteps, item.getViewItemKey());
    }
}
