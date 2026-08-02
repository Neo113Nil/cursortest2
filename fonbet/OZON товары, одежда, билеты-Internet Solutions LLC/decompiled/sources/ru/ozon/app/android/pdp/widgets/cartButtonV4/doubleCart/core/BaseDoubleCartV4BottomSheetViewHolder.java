package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.ComposerSnapshotOutsideScreenEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag;
import ru.ozon.app.android.pdp.flags.CartButtonV4RelatedProductsBottomSheetReturnFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4BottomSheetViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.loader.CartButtonLoaderFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u0019*\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/core/BaseDoubleCartV4BottomSheetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/loader/CartButtonLoaderFactory;", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "binder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "doubleCartView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Landroidx/coordinatorlayout/widget/CoordinatorLayout;LSc/j;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;)V", "vo", "", "bindBinder", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "createAndBind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "analytics", "", "relatedProductsCurtain", "postBind", "(Landroid/view/View;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;Ljava/lang/String;)V", "view", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "addView", "()V", "removeView", "item", "bind", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "LSc/j;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "doubleInCartView$delegate", "getDoubleInCartView", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "doubleInCartView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "bottomSheetView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "currentView", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "initialCartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "stickyPlaceHolderView", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "bottomContainer", "Landroid/widget/LinearLayout;", "Landroid/os/Handler;", "bindHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "bindRunnable", "Ljava/lang/Runnable;", "getMetricView", "()Landroid/view/View;", "metricView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseDoubleCartV4BottomSheetViewHolder extends AbstractC6065b<DoubleCartVO> implements CartButtonLoaderFactory {

    @NotNull
    private final Handler bindHandler;
    private Runnable bindRunnable;

    @NotNull
    private final DoubleCartViewBinder binder;

    @NotNull
    private final LinearLayout bottomContainer;

    @NotNull
    private final RelatedProductsBottomSheetView bottomSheetView;

    @NotNull
    private final i container;
    private DoubleCartView currentView;

    @NotNull
    private final InterfaceC4008j<DoubleCartView> doubleCartView;

    /* renamed from: doubleInCartView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j doubleInCartView;
    private DoubleCartVO.CartMode initialCartMode;

    @NotNull
    private final CoordinatorLayout parent;

    @NotNull
    private final PDPOnBoardingViewModel pdpOnBoardingViewModel;

    @NotNull
    private final View stickyPlaceHolderView;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4BottomSheetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            BaseDoubleCartV4BottomSheetViewHolder.this.bottomSheetView.showMiniState(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDoubleCartV4BottomSheetViewHolder(@NotNull i container, @NotNull DoubleCartViewBinder binder, @NotNull FeatureChecker featureChecker, @NotNull DoubleCartVO.CartMode mode, @NotNull CoordinatorLayout parent, @NotNull InterfaceC4008j<? extends DoubleCartView> doubleCartView, @NotNull l tokenizedAnalytics, @NotNull PDPOnBoardingViewModel pdpOnBoardingViewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(doubleCartView, "doubleCartView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(pdpOnBoardingViewModel, "pdpOnBoardingViewModel");
        this.container = container;
        this.binder = binder;
        this.parent = parent;
        this.doubleCartView = doubleCartView;
        this.pdpOnBoardingViewModel = pdpOnBoardingViewModel;
        this.doubleInCartView = k.b(new BaseDoubleCartV4BottomSheetViewHolder$doubleInCartView$2(this));
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        Object view = view(mode);
        Intrinsics.g(view, "null cannot be cast to non-null type android.view.View");
        RelatedProductsBottomSheetView relatedProductsBottomSheetView = new RelatedProductsBottomSheetView(L11, container, (View) view, featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetReturnFlag.INSTANCE), featureChecker.isEnabled(CartButtonV4RelatedProductsBottomSheetCloseAfterScrollFlag.INSTANCE), tokenizedAnalytics, featureChecker.isEnabled(ComposerSnapshotOutsideScreenEnabled.INSTANCE), new BaseDoubleCartV4BottomSheetViewHolder$bottomSheetView$1(this));
        this.bottomSheetView = relatedProductsBottomSheetView;
        this.currentView = view(mode);
        this.initialCartMode = mode;
        View view2 = new View(container.L());
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        this.stickyPlaceHolderView = view2;
        this.bottomContainer = C10183a.c(container.Y());
        this.bindHandler = new Handler(Looper.getMainLooper());
        this.initialCartMode = mode;
        DoubleCartView view3 = view(mode);
        DoubleCartView doubleCartView2 = view3 == null ? null : view3;
        if (doubleCartView2 != null) {
            this.currentView = doubleCartView2;
            DoubleCartViewBinder.onContainerInitialized$default(binder, doubleCartView2, new BaseDoubleCartV4BottomSheetViewHolder$1$1(this), container, this, null, 16, null);
        }
        binder.setOnShowRelatedProductsBottomSheet(new AnonymousClass2());
        parent.addView(relatedProductsBottomSheetView);
    }

    private final void bindBinder(DoubleCartView doubleCartView, DoubleCartVO doubleCartVO) {
        this.binder.bind(doubleCartView, doubleCartVO, this.container, new BaseDoubleCartV4BottomSheetViewHolder$bindBinder$1(doubleCartView, this, doubleCartVO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createAndBind(DoubleCartVO vo) {
        BaseDoubleCartV4BottomSheetViewHolder baseDoubleCartV4BottomSheetViewHolder;
        DoubleCartView view = view(vo.getMode());
        if (vo.getFirstCartData().getIsUpdateData()) {
            this.initialCartMode = vo.getMode();
            baseDoubleCartV4BottomSheetViewHolder = this;
            DoubleCartViewBinder.onContainerInitialized$default(this.binder, view, new BaseDoubleCartV4BottomSheetViewHolder$createAndBind$1$1(this), this.container, baseDoubleCartV4BottomSheetViewHolder, null, 16, null);
            RelatedProductsBottomSheetView relatedProductsBottomSheetView = baseDoubleCartV4BottomSheetViewHolder.bottomSheetView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.View");
            relatedProductsBottomSheetView.updateHeaderView((View) view);
            baseDoubleCartV4BottomSheetViewHolder.currentView = view;
        } else {
            baseDoubleCartV4BottomSheetViewHolder = this;
        }
        baseDoubleCartV4BottomSheetViewHolder.binder.bind(view, vo, baseDoubleCartV4BottomSheetViewHolder.container, new BaseDoubleCartV4BottomSheetViewHolder$createAndBind$1$2(view, this, vo));
    }

    private final DoubleInCartViewV4 getDoubleInCartView() {
        return (DoubleInCartViewV4) this.doubleInCartView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postBind(final View view, final CurtainTrackingInfoVO curtainTrackingInfoVO, final String str) {
        if (str != null) {
            Runnable runnable = this.bindRunnable;
            if (runnable != null) {
                this.bindHandler.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: sD.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseDoubleCartV4BottomSheetViewHolder.postBind$lambda$6$lambda$5(BaseDoubleCartV4BottomSheetViewHolder.this, curtainTrackingInfoVO, str, view);
                }
            };
            this.bindHandler.post(runnable2);
            this.bindRunnable = runnable2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postBind$lambda$6$lambda$5(BaseDoubleCartV4BottomSheetViewHolder baseDoubleCartV4BottomSheetViewHolder, CurtainTrackingInfoVO curtainTrackingInfoVO, String str, View view) {
        baseDoubleCartV4BottomSheetViewHolder.bottomSheetView.bind(curtainTrackingInfoVO, str);
        View view2 = baseDoubleCartV4BottomSheetViewHolder.stickyPlaceHolderView;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.bottomMargin = view.getHeight();
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        view2.setLayoutParams(marginLayoutParams);
    }

    private final DoubleCartView view(DoubleCartVO.CartMode mode) {
        return mode == DoubleCartVO.CartMode.DEFAULT ? this.doubleCartView.getValue() : getDoubleInCartView();
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        super.addView();
        this.bottomContainer.addView(this.stickyPlaceHolderView);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    /* renamed from: getMetricView, reason: from getter */
    public View getStickyPlaceHolderView() {
        return this.stickyPlaceHolderView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        Runnable runnable = this.bindRunnable;
        if (runnable != null) {
            this.bindHandler.removeCallbacks(runnable);
        }
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
    public void bind(@NotNull DoubleCartVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getMode() != this.initialCartMode) {
            createAndBind(item);
            return;
        }
        DoubleCartView doubleCartView = this.currentView;
        if (doubleCartView != null) {
            bindBinder(doubleCartView, item);
        }
    }
}
