package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import WZ.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.ComposerSnapshotOutsideScreenEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetReturnFlag;
import ru.ozon.app.android.pdp.flags.HapticsActionEnabledFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.loader.CartButtonLoaderFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import v10.C10183a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartButtonBottomSheetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/loader/CartButtonLoaderFactory;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "binder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;Lru/ozon/app/android/network/abtool/FeatureChecker;Landroidx/coordinatorlayout/widget/CoordinatorLayout;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;)V", "", "addView", "()V", "removeView", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewV4;", "cartView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewV4;", "Landroid/view/View;", "stickyPlaceHolderView", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "bottomContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "bottomSheetView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "getMetricView", "()Landroid/view/View;", "metricView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonBottomSheetViewHolder extends AbstractC6065b<CartVO> implements CartButtonLoaderFactory {

    @NotNull
    private final CartViewBinder binder;

    @NotNull
    private final LinearLayout bottomContainer;

    @NotNull
    private final RelatedProductsBottomSheetView bottomSheetView;

    @NotNull
    private final CartViewV4 cartView;

    @NotNull
    private final i container;

    @NotNull
    private final CoordinatorLayout parent;

    @NotNull
    private final PDPOnBoardingViewModel pdpOnBoardingViewModel;

    @NotNull
    private final View stickyPlaceHolderView;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartButtonBottomSheetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<CartVO> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CartVO invoke() {
            CartVO boundData = CartButtonBottomSheetViewHolder.this.getBoundData();
            if (boundData != null) {
                return boundData;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartButtonBottomSheetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String relatedProductsCurtain;
            CartVO boundData = CartButtonBottomSheetViewHolder.this.getBoundData();
            if (boundData == null || (relatedProductsCurtain = boundData.getRelatedProductsCurtain()) == null) {
                return;
            }
            CartButtonBottomSheetViewHolder.this.bottomSheetView.loadComposer(relatedProductsCurtain);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartButtonBottomSheetViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            CartButtonBottomSheetViewHolder.this.bottomSheetView.showMiniState(z11);
        }
    }

    public CartButtonBottomSheetViewHolder(@NotNull i container, @NotNull CartViewBinder binder, @NotNull FeatureChecker featureChecker, @NotNull CoordinatorLayout parent, @NotNull l tokenizedAnalytics, @NotNull PDPOnBoardingViewModel pdpOnBoardingViewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(pdpOnBoardingViewModel, "pdpOnBoardingViewModel");
        this.container = container;
        this.binder = binder;
        this.parent = parent;
        this.pdpOnBoardingViewModel = pdpOnBoardingViewModel;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        CartViewV4 cartViewV4 = new CartViewV4(L11, null, 0, featureChecker.isEnabled(HapticsActionEnabledFlag.INSTANCE), 6, null);
        this.cartView = cartViewV4;
        View view = new View(container.L());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        this.stickyPlaceHolderView = view;
        this.bottomContainer = C10183a.c(container.Y());
        Context L12 = container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        RelatedProductsBottomSheetView relatedProductsBottomSheetView = new RelatedProductsBottomSheetView(L12, container, cartViewV4, featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetReturnFlag.INSTANCE), featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag.INSTANCE), tokenizedAnalytics, featureChecker.isEnabled(ComposerSnapshotOutsideScreenEnabled.INSTANCE), new CartButtonBottomSheetViewHolder$bottomSheetView$1(this));
        this.bottomSheetView = relatedProductsBottomSheetView;
        CartViewBinder.onContainerInitialized$default(binder, cartViewV4, new AnonymousClass1(), container, this, null, 16, null);
        parent.addView(relatedProductsBottomSheetView);
        cartViewV4.setOnAddToCartClickRelatedProducts(new AnonymousClass2());
        binder.setOnShowRelatedProductsBottomSheet(new AnonymousClass3());
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        super.addView();
        this.bottomContainer.addView(this.stickyPlaceHolderView);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.cartView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.bottomSheetView.onDetach();
        this.parent.removeView(this.bottomSheetView);
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        super.removeView();
        this.bottomContainer.removeView(this.stickyPlaceHolderView);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CartVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binder.onBind(this.cartView, item, this.container, new CartButtonBottomSheetViewHolder$bind$1(this, item));
    }
}
