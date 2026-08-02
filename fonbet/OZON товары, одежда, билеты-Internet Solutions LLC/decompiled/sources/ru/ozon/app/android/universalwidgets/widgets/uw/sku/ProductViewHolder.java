package ru.ozon.app.android.universalwidgets.widgets.uw.sku;

import Vg.c;
import WZ.t;
import android.view.View;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.product.multiframe.MultiFrameBinderDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010\u001eJ#\u0010*\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010)\u001a\u00060'j\u0002`(H\u0014¢\u0006\u0004\b*\u0010+J3\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010.\u001a\u00060,j\u0002`-2\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/ProductViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "", "Lru/ozon/app/android/product/multiframe/BinderFrameWrapper;", "productPropertyBinders", "Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;", "frameBinder", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Ljava/util/Set;Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;LVg/c;)V", "item", "", "widgetId", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/product/common/product/ProductVO;Ljava/lang/String;Lru/ozon/composer/ui/widget/f;)V", "setRootLocatorIfExists", "()Lkotlin/Unit;", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "onAttach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "(Lru/ozon/app/android/product/common/product/ProductVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Ljava/util/Set;", "Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;", "LVg/c;", "productVO", "Lru/ozon/app/android/product/common/product/ProductVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ProductViewHolder extends k<ProductVO> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final MultiFrameBinderDelegate<ProductVO> frameBinder;

    @NotNull
    private final Set<BinderFrameWrapper<ProductVO>> productPropertyBinders;
    private ProductVO productVO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull Set<BinderFrameWrapper<ProductVO>> productPropertyBinders, @NotNull MultiFrameBinderDelegate<ProductVO> frameBinder, @NotNull c customActionHandlersStore) {
        super(containerView);
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(productPropertyBinders, "productPropertyBinders");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.productPropertyBinders = productPropertyBinders;
        this.frameBinder = frameBinder;
        this.customActionHandlersStore = customActionHandlersStore;
        Iterator<T> it = productPropertyBinders.iterator();
        while (it.hasNext()) {
            ProductPropertyBinder.init$default(((BinderFrameWrapper) it.next()).getBinder(), this, this.composerReferences, this.customActionHandlersStore, null, 8, null);
        }
        MultiFrameBinderDelegate<ProductVO> multiFrameBinderDelegate = this.frameBinder;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        multiFrameBinderDelegate.init(itemView);
        MultiFrameBinderDelegate<ProductVO> multiFrameBinderDelegate2 = this.frameBinder;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        multiFrameBinderDelegate2.applyRecycler((c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setRootLocatorIfExists() {
        TestInfo widgetTestInfo;
        String automatizationId;
        ProductVO boundData = getBoundData();
        if (boundData == null || (widgetTestInfo = boundData.getWidgetTestInfo()) == null || (automatizationId = widgetTestInfo.getAutomatizationId()) == null) {
            return null;
        }
        this.containerView.setContentDescription(automatizationId);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.frameBinder.onAttach(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        Iterator<T> it = this.productPropertyBinders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().detach();
        }
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
        Iterator<T> it = this.productPropertyBinders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().recycle();
        }
        this.frameBinder.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Iterator<T> it = this.productPropertyBinders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().onViewInVisibleBounds();
        }
        setRootLocatorIfExists();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        Iterator<T> it = this.productPropertyBinders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().onViewOutOfVisibleBounds();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.productVO = item;
        final View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        G.a(itemView, new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.ProductViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        Iterator<T> it = this.productPropertyBinders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().bindVO(item);
        }
        this.frameBinder.bind(item, info, this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ProductViewHolder) item, trackingData, viewedPond);
        String c11 = trackingData.c();
        if (c11 == null) {
            c11 = "";
        }
        trackView(item, c11, viewedPond);
    }

    private final void trackView(ProductVO item, String widgetId, f viewedPond) {
        t tokenizedEvent;
        if (viewedPond == null || viewedPond.b(item.getId(), widgetId) || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        viewedPond.d(Long.valueOf(item.getId()), widgetId);
    }
}
