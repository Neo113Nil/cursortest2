package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import Pc.a;
import Vg.c;
import WZ.l;
import android.view.View;
import androidx.core.view.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.ProductWidgetVO;
import ru.ozon.app.android.universalwidgets.databinding.WidgetScrollLayoutBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.SkuScrollMultiFrameDelegateProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileWidgetHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004Be\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\u001eH\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010 J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00101\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/common/ProductWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LPc/a;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;", "frameDelegateProvider", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LPc/a;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;LVg/c;)V", "", "setRootLocatorIfExists", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/product/common/ProductWidgetVO;Ll20/d;)V", "onRecycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "swipeGalleryToFirstVideo", "Lru/ozon/app/android/videocover/HorizontalScrollDelegate;", "getHorizontalDelegate", "()Lru/ozon/app/android/videocover/HorizontalScrollDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "horizontalScrollDelegate", "Lru/ozon/app/android/videocover/HorizontalScrollDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/databinding/WidgetScrollLayoutBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/WidgetScrollLayoutBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductsAdapter;", "productsAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductsAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollMarginDecoration;", "marginDecorator", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollMarginDecoration;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollWidgetViewHolder extends k<ProductWidgetVO> implements VideoTileWidgetHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetScrollLayoutBinding binding;

    @NotNull
    private final HorizontalScrollDelegate horizontalScrollDelegate;

    @NotNull
    private final SkuScrollMarginDecoration marginDecorator;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ScrollProductsAdapter productsAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull AdultHandler adultHandler, @NotNull a<CartAtomBinder> cartAtomBinder, @NotNull l tokenizedAnalytics, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull SkuScrollMultiFrameDelegateProvider frameDelegateProvider, @NotNull VideoTileDelegate videoTileDelegate, @NotNull PlayerPreloader playerPreloader, @NotNull c customActionHandlersStore) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(frameDelegateProvider, "frameDelegateProvider");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.ref = ref;
        this.videoTileDelegate = videoTileDelegate;
        this.playerPreloader = playerPreloader;
        HorizontalScrollDelegate horizontalScrollDelegate = new HorizontalScrollDelegate(null, 1, null);
        this.horizontalScrollDelegate = horizontalScrollDelegate;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new ScrollWidgetViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.actionHandler = buildHandler;
        WidgetScrollLayoutBinding bind = WidgetScrollLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ScrollProductsAdapter scrollProductsAdapter = new ScrollProductsAdapter(ref, this, adultListDelegateProvider, cartAtomBinder, buildHandler, tokenizedAnalytics, adultHandler, this, frameDelegateProvider, videoTileDelegate, customActionHandlersStore, playerPreloader);
        this.productsAdapter = scrollProductsAdapter;
        SkuScrollMarginDecoration skuScrollMarginDecoration = new SkuScrollMarginDecoration();
        this.marginDecorator = skuScrollMarginDecoration;
        RecyclerView recyclerView = bind.productsRv;
        recyclerView.setAdapter(scrollProductsAdapter);
        recyclerView.addItemDecoration(skuScrollMarginDecoration);
        recyclerView.setHasFixedSize(true);
        recyclerView.setRecycledViewPool(ref.getComposerViewPoolProvider().getViewPool());
        horizontalScrollDelegate.attachToRv(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRootLocatorIfExists() {
        TestInfo testInfo;
        String automatizationId;
        ProductWidgetVO boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        this.binding.getConstraintLayout().setContentDescription(automatizationId);
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public HorizontalScrollDelegate getHorizontalDelegate() {
        ProductWidgetVO boundedData = getBoundedData();
        if (boundedData == null || !boundedData.getHasVideoCover()) {
            return null;
        }
        return this.horizontalScrollDelegate;
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        ProductWidgetVO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.productsRv.getLayoutManager();
            boundedData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.videoTileDelegate.onWidgetHolderScrolledInVisibleBounds(this);
        setRootLocatorIfExists();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (this.ref.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
            this.videoTileDelegate.onWidgetHolderScrolledOutOfVisibleBounds(this);
        }
    }

    @Override // ru.ozon.app.android.videocover.VideoTileWidgetHolder
    public void swipeGalleryToFirstVideo() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        G.a(itemView, new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.ScrollWidgetViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        this.productsAdapter.setWidgetInfo(info);
        this.productsAdapter.setItems(item.getProducts());
        this.productsAdapter.setWidgetId(item.getId());
        if (item.getResetScroll()) {
            this.binding.productsRv.scrollToPosition(0);
            item.setResetScroll(false);
        } else {
            RecyclerView.o layoutManager = this.binding.productsRv.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(item.getLayoutManagerState());
            }
        }
    }
}
