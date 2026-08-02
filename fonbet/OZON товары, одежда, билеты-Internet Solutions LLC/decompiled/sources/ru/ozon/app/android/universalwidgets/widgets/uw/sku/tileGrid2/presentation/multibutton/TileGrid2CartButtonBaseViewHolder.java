package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import Xo.b;
import a00.C4908c;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedBottomSheetDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.selections.subscriber.SelectionProductsEventsHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 W*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u00042\u00020\u0005:\u0001WBq\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H&¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00028\u00002\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010%J\u0017\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020!H\u0016¢\u0006\u0004\b1\u0010%J\u0017\u00104\u001a\u00020!2\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b4\u00105J%\u00109\u001a\u00020!2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0018\u000106H\u0004¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\bG\u0010HR\u001b\u0010M\u001a\u00020\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020!0Q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/TileGrid2CartButtonBaseViewHolder;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "T", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;", "addToCartBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedBottomSheetDelegate;", "relatedBottomSheetDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandlerLazy", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;LWZ/l;LVg/c;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LSc/j;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;LSc/j;LSc/j;)V", "", "show", "", "bindOverlay", "(Z)V", "bindButtons", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;Ll20/d;)V", "onAttach", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "onPlusClicked", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;)V", "", "", "params", "onSuccessFromCart", "(Ljava/util/Map;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;", "LWZ/l;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "wishlistService$delegate", "getWishlistService", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistService", "selectionProductsEventsHandler$delegate", "getSelectionProductsEventsHandler", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/selections/subscriber/SelectionProductsEventsHandler;", "selectionProductsEventsHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "wishlistSubscriber", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TileGrid2CartButtonBaseViewHolder<T extends TileGrid2CartButtonVO> extends k<T> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddToCartViewStateBinder addToCartBinder;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final TileOverlayBinder overlayBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final InterfaceC4008j<TileRelatedBottomSheetDelegate> relatedBottomSheetDelegate;

    /* renamed from: selectionProductsEventsHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectionProductsEventsHandler;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final View view;

    /* renamed from: wishlistService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wishlistService;

    @NotNull
    private final WishlistSubscriber wishlistSubscriber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2CartButtonBaseViewHolder(@NotNull View view, @NotNull ComposerReferences refs, @NotNull AddToCartViewStateBinder addToCartBinder, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull FrameBinder frameBinder, @NotNull InterfaceC4008j<TileRelatedBottomSheetDelegate> relatedBottomSheetDelegate, @NotNull TileOverlayBinder overlayBinder, @NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull InterfaceC4008j<? extends SelectionProductsEventsHandler> selectionProductsEventsHandlerLazy) {
        super(view);
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(addToCartBinder, "addToCartBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(relatedBottomSheetDelegate, "relatedBottomSheetDelegate");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        Intrinsics.checkNotNullParameter(selectionProductsEventsHandlerLazy, "selectionProductsEventsHandlerLazy");
        this.view = view;
        this.refs = refs;
        this.addToCartBinder = addToCartBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.frameBinder = frameBinder;
        this.relatedBottomSheetDelegate = relatedBottomSheetDelegate;
        this.overlayBinder = overlayBinder;
        this.steps = C7714v.a0(new b(this, 3));
        this.wishlistService = wishlistServiceLazy;
        this.selectionProductsEventsHandler = selectionProductsEventsHandlerLazy;
        this.wishlistSubscriber = new WishlistSubscriber(wishlistServiceLazy, new TileGrid2CartButtonBaseViewHolder$wishlistSubscriber$1(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new TileGrid2CartButtonBaseViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        addToCartBinder.init(tokenizedAnalytics);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOverlay(boolean show) {
        TileGrid2CartButtonVO tileGrid2CartButtonVO;
        TileOverlayBinder tileOverlayBinder = this.overlayBinder;
        TileGrid2DTO.OverlayItem overlayItem = null;
        if (show && (tileGrid2CartButtonVO = (TileGrid2CartButtonVO) getBoundData()) != null) {
            overlayItem = tileGrid2CartButtonVO.getOverlayItem();
        }
        TileOverlayBinder.bind$default(tileOverlayBinder, show, overlayItem, RoundMode.BOTTOM, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(TileGrid2CartButtonBaseViewHolder tileGrid2CartButtonBaseViewHolder) {
        tileGrid2CartButtonBaseViewHolder.bindButtons();
        return Unit.f71690a;
    }

    public abstract void bindButtons();

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @NotNull
    protected final SelectionProductsEventsHandler getSelectionProductsEventsHandler() {
        return (SelectionProductsEventsHandler) this.selectionProductsEventsHandler.getValue();
    }

    @NotNull
    protected final WishlistService getWishlistService() {
        return (WishlistService) this.wishlistService.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
        getLifecycle().a(new DefaultLifecycleObserver(this) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.TileGrid2CartButtonBaseViewHolder$onAttach$1
            final /* synthetic */ TileGrid2CartButtonBaseViewHolder<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                WishlistSubscriber wishlistSubscriber;
                ComposerReferences composerReferences;
                AddToCartViewStateBinder addToCartViewStateBinder;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onCreate(owner);
                wishlistSubscriber = ((TileGrid2CartButtonBaseViewHolder) this.this$0).wishlistSubscriber;
                D a11 = K.a(this.this$0);
                composerReferences = ((TileGrid2CartButtonBaseViewHolder) this.this$0).refs;
                C4908c g10 = composerReferences.getContainer().g();
                TileGrid2CartButtonVO tileGrid2CartButtonVO = (TileGrid2CartButtonVO) this.this$0.getBoundData();
                wishlistSubscriber.subscribeIfNeed(a11, g10, tileGrid2CartButtonVO != null ? tileGrid2CartButtonVO.getWishlistKey() : null);
                TileGrid2CartButtonVO tileGrid2CartButtonVO2 = (TileGrid2CartButtonVO) this.this$0.getBoundData();
                if (tileGrid2CartButtonVO2 != null && tileGrid2CartButtonVO2.getSelectionKey() != null) {
                    this.this$0.getSelectionProductsEventsHandler().subscribeToSelectionProductsEvents();
                }
                addToCartViewStateBinder = ((TileGrid2CartButtonBaseViewHolder) this.this$0).addToCartBinder;
                addToCartViewStateBinder.subscribe();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                AddToCartViewStateBinder addToCartViewStateBinder;
                TileOverlayBinder tileOverlayBinder;
                Intrinsics.checkNotNullParameter(owner, "owner");
                addToCartViewStateBinder = ((TileGrid2CartButtonBaseViewHolder) this.this$0).addToCartBinder;
                addToCartViewStateBinder.unsubscribe();
                tileOverlayBinder = ((TileGrid2CartButtonBaseViewHolder) this.this$0).overlayBinder;
                tileOverlayBinder.unsubscribe();
                this.this$0.getLifecycle().e(this);
                TileGrid2CartButtonVO tileGrid2CartButtonVO = (TileGrid2CartButtonVO) this.this$0.getBoundData();
                if (tileGrid2CartButtonVO == null || tileGrid2CartButtonVO.getSelectionKey() == null) {
                    return;
                }
                this.this$0.getSelectionProductsEventsHandler().reset();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                TileOverlayBinder tileOverlayBinder;
                Intrinsics.checkNotNullParameter(owner, "owner");
                tileOverlayBinder = ((TileGrid2CartButtonBaseViewHolder) this.this$0).overlayBinder;
                tileOverlayBinder.subscribe();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                TileOverlayBinder tileOverlayBinder;
                Intrinsics.checkNotNullParameter(owner, "owner");
                tileOverlayBinder = ((TileGrid2CartButtonBaseViewHolder) this.this$0).overlayBinder;
                tileOverlayBinder.unsubscribe();
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onDetach();
        this.addToCartBinder.unsubscribe();
        this.overlayBinder.unsubscribe();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onPlusClicked(@NotNull TileRelatedProductsCurtainVO relatedProductsCurtain) {
        String skuId;
        Intrinsics.checkNotNullParameter(relatedProductsCurtain, "relatedProductsCurtain");
        TileRelatedBottomSheetDelegate value = this.relatedBottomSheetDelegate.getValue();
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposerReferences composerReferences = this.refs;
        l lVar = this.tokenizedAnalytics;
        TileGrid2CartButtonVO tileGrid2CartButtonVO = (TileGrid2CartButtonVO) getBoundData();
        value.loadRelatedProducts(context, composerReferences, lVar, relatedProductsCurtain, (tileGrid2CartButtonVO == null || (skuId = TileGrid2CartButtonVOKt.getSkuId(tileGrid2CartButtonVO)) == null) ? null : h.y0(skuId));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onSuccessFromCart(Map<String, String> params) {
        String str;
        Boolean t02;
        this.relatedBottomSheetDelegate.getValue().showMiniState((params == null || (str = params.get("showRecoms")) == null || (t02 = h.t0(str)) == null) ? false : t02.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull T item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }
}
