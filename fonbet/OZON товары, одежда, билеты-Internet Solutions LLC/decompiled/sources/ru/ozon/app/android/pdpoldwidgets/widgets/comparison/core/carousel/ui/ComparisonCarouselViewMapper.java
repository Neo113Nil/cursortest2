package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Pc.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00152\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavDelegateProvider", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "comparisonCarouselViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LPc/a;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LPc/a;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "LPc/a;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselMapper;", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselView;", "carouselView", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselView;", "viewItem", "Lru/ozon/composer/ui/widget/l;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonCarouselViewMapper extends SingleNoUiViewMapper<ComparisonDTO, ComparisonCarouselVO> {
    private ComparisonCarouselView carouselView;

    @NotNull
    private final a<CartAtomBinder> cartAtomBinder;

    @NotNull
    private final ComparisonCarouselViewModel comparisonCarouselViewModel;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final ComparisonCarouselMapper mapper;

    @NotNull
    private final ProductFavoriteDelegateProvider productFavDelegateProvider;
    private l viewItem;

    public ComparisonCarouselViewMapper(@NotNull ProductFavoriteDelegateProvider productFavDelegateProvider, @NotNull ComparisonCarouselViewModel comparisonCarouselViewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull a<CartAtomBinder> cartAtomBinder) {
        Intrinsics.checkNotNullParameter(productFavDelegateProvider, "productFavDelegateProvider");
        Intrinsics.checkNotNullParameter(comparisonCarouselViewModel, "comparisonCarouselViewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        this.productFavDelegateProvider = productFavDelegateProvider;
        this.comparisonCarouselViewModel = comparisonCarouselViewModel;
        this.handlersInhibitor = handlersInhibitor;
        this.cartAtomBinder = cartAtomBinder;
        this.mapper = new ComparisonCarouselMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        this.viewItem = viewObject;
        ComparisonCarouselView comparisonCarouselView = this.carouselView;
        if (comparisonCarouselView != null) {
            c d11 = viewObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model.ComparisonCarouselVO");
            comparisonCarouselView.bind((ComparisonCarouselVO) d11);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        AppBarLayout composerAppbar;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        View inflate = ViewGroupExtKt.inflate(composerRootView, R$layout.pdp_widget_comparison_carousel);
        ConstraintLayout constraintLayout = inflate instanceof ConstraintLayout ? (ConstraintLayout) inflate : null;
        if (constraintLayout == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView)) == null) {
            return;
        }
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(composerRootView);
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(composerRootView);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) constraintLayout.findViewById(R$id.compareProductsCarouselContainerCL);
        Intrinsics.f(constraintLayout2);
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.comparisonCarouselViewModel.getCarouselBehaviorMode().isCollapsed() ? constraintLayout2.getMinHeight() : constraintLayout2.getMaxHeight();
        constraintLayout2.setLayoutParams(layoutParams);
        LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(composerRootView);
        composerTopContainer.addView(constraintLayout);
        ViewGroup.LayoutParams layoutParams2 = composerTopContainer.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        final CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams2;
        composerTopContainer.setOutlineProvider(ViewOutlineProvider.PADDED_BOUNDS);
        Intrinsics.f(constraintLayout2);
        fVar.i(new ComparisonCarouselBehavior(constraintLayout2, composerRecyclerView, composerContainer, new ComparisonCarouselViewMapper$constructLayout$1$1$1(composerAppbar, composerTopContainer), this.comparisonCarouselViewModel));
        int i11 = Y.f42258g;
        if (!composerAppbar.isLaidOut() || composerAppbar.isLayoutRequested()) {
            composerAppbar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselViewMapper$constructLayout$lambda$4$lambda$3$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ((ViewGroup.MarginLayoutParams) CoordinatorLayout.f.this).topMargin = view.getMeasuredHeight();
                }
            });
        } else {
            ((ViewGroup.MarginLayoutParams) fVar).topMargin = composerAppbar.getMeasuredHeight();
        }
        composerTopContainer.setLayoutParams(fVar);
        PdpWidgetComparisonCarouselBinding bind = PdpWidgetComparisonCarouselBinding.bind(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.carouselView = new ComparisonCarouselView(bind, this.comparisonCarouselViewModel, references, new ComparisonCarouselViewMapper$constructLayout$2(this), this.productFavDelegateProvider, voHelper, this.handlersInhibitor, this.cartAtomBinder, references.getTokenizedAnalytics());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        PdpWidgetComparisonCarouselBinding binding;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).clearOnScrollListeners();
        LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(composerRootView);
        ComparisonCarouselView comparisonCarouselView = this.carouselView;
        composerTopContainer.removeView((comparisonCarouselView == null || (binding = comparisonCarouselView.getBinding()) == null) ? null : binding.getConstraintLayout());
        this.carouselView = null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public ComparisonCarouselMapper getMapper() {
        return this.mapper;
    }
}
