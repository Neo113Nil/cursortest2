package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate;

import Pc.a;
import Vg.c;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBackgroundBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollBadgesBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollButtonSubtitleBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollTopRightButtonBinder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B]\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;", "", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollBadgesBinder;", "badgesBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollButtonSubtitleBinder;", "subtitleBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollStateBinder;", "stateBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollTopRightButtonBinder;", "topRightButtonsBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductBackgroundBinder;", "backgroundBinder", "<init>", "(LPc/a;LPc/a;LPc/a;LPc/a;LPc/a;LPc/a;)V", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "get", "(Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LVg/c;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "LPc/a;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollMultiFrameDelegateProvider {

    @NotNull
    private final a<ProductBackgroundBinder> backgroundBinder;

    @NotNull
    private final a<SkuScrollBadgesBinder> badgesBinder;

    @NotNull
    private final a<SkuScrollOverlayBinder> overlayBinder;

    @NotNull
    private final a<SkuScrollStateBinder> stateBinder;

    @NotNull
    private final a<SkuScrollButtonSubtitleBinder> subtitleBinder;

    @NotNull
    private final a<SkuScrollTopRightButtonBinder> topRightButtonsBinder;

    public SkuScrollMultiFrameDelegateProvider(@NotNull a<SkuScrollBadgesBinder> badgesBinder, @NotNull a<SkuScrollButtonSubtitleBinder> subtitleBinder, @NotNull a<SkuScrollOverlayBinder> overlayBinder, @NotNull a<SkuScrollStateBinder> stateBinder, @NotNull a<SkuScrollTopRightButtonBinder> topRightButtonsBinder, @NotNull a<ProductBackgroundBinder> backgroundBinder) {
        Intrinsics.checkNotNullParameter(badgesBinder, "badgesBinder");
        Intrinsics.checkNotNullParameter(subtitleBinder, "subtitleBinder");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(stateBinder, "stateBinder");
        Intrinsics.checkNotNullParameter(topRightButtonsBinder, "topRightButtonsBinder");
        Intrinsics.checkNotNullParameter(backgroundBinder, "backgroundBinder");
        this.badgesBinder = badgesBinder;
        this.subtitleBinder = subtitleBinder;
        this.overlayBinder = overlayBinder;
        this.stateBinder = stateBinder;
        this.topRightButtonsBinder = topRightButtonsBinder;
        this.backgroundBinder = backgroundBinder;
    }

    @NotNull
    public final ScrollMultiFrameDelegate get(@NotNull FrameBinder frameBinder, @NotNull c customActionHandlersStore) {
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        SkuScrollBadgesBinder skuScrollBadgesBinder = this.badgesBinder.get();
        Intrinsics.checkNotNullExpressionValue(skuScrollBadgesBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper = new BinderFrameWrapper(1, skuScrollBadgesBinder);
        SkuScrollStateBinder skuScrollStateBinder = this.stateBinder.get();
        Intrinsics.checkNotNullExpressionValue(skuScrollStateBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper2 = new BinderFrameWrapper(2, skuScrollStateBinder);
        SkuScrollTopRightButtonBinder skuScrollTopRightButtonBinder = this.topRightButtonsBinder.get();
        Intrinsics.checkNotNullExpressionValue(skuScrollTopRightButtonBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper3 = new BinderFrameWrapper(3, skuScrollTopRightButtonBinder);
        SkuScrollButtonSubtitleBinder skuScrollButtonSubtitleBinder = this.subtitleBinder.get();
        Intrinsics.checkNotNullExpressionValue(skuScrollButtonSubtitleBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper4 = new BinderFrameWrapper(4, skuScrollButtonSubtitleBinder);
        SkuScrollOverlayBinder skuScrollOverlayBinder = this.overlayBinder.get();
        Intrinsics.checkNotNullExpressionValue(skuScrollOverlayBinder, "get(...)");
        BinderFrameWrapper binderFrameWrapper5 = new BinderFrameWrapper(4, skuScrollOverlayBinder);
        ProductBackgroundBinder productBackgroundBinder = this.backgroundBinder.get();
        Intrinsics.checkNotNullExpressionValue(productBackgroundBinder, "get(...)");
        BinderFrameWrapper[] elements = {binderFrameWrapper, binderFrameWrapper2, binderFrameWrapper3, binderFrameWrapper4, binderFrameWrapper5, new BinderFrameWrapper(0, productBackgroundBinder)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new SkuScrollMultiFrameDelegate(C7705l.j0(elements), frameBinder, customActionHandlersStore);
    }
}
