package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import Gt.b;
import Gt.c;
import Pc.a;
import WZ.l;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b+\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewController;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;", "containerView", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "LPc/a;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewModel;", "viewModelProvider", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;LPc/a;LWZ/l;)V", "", "topCornerRadius", "bottomCornerRadius", "", "setCorners", "(FF)V", "initialCorners", "animateCornersChangeSticky", "(F)V", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "tooltipData", "checkTooltip", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;Lkotlin/jvm/functions/Function1;)V", "", "isSticky", "setLocatorsTags", "(Z)V", "isBottomCornersRounded", "setup", "(ZZ)V", "isTopCornersRounded", "animateSetup", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "LPc/a;", "LWZ/l;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartControlsViewController {

    @NotNull
    private final CartControlsView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartTooltipHelper tooltipHelper;

    @NotNull
    private final a<CartControlsViewModel> viewModelProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int tooltipMargin = UiExtKt.toPx(18);

    @NotNull
    private static final TypeEvaluator<Pair<Float, Float>> cornersEvaluator = new b();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewController$Companion;", "", "<init>", "()V", "", "tooltipMargin", "I", "getTooltipMargin", "()I", "", "NON_STICKY_INPUT_VIEW", "Ljava/lang/String;", "STICKY_INPUT_VIEW", "", "ZERO_CORNERS_SIZE", "F", "", "ANIMATION_DURATION", "J", "DEFAULT_TOOLTIP_SHOW_DELAY", "TOOLTIP_SHOW_TIME", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTooltipMargin() {
            return CartControlsViewController.tooltipMargin;
        }

        private Companion() {
        }
    }

    public CartControlsViewController(@NotNull ComposerReferences refs, @NotNull CartControlsView containerView, @NotNull CartTooltipHelper tooltipHelper, @NotNull a<CartControlsViewModel> viewModelProvider, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tooltipHelper, "tooltipHelper");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.containerView = containerView;
        this.tooltipHelper = tooltipHelper;
        this.viewModelProvider = viewModelProvider;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final void animateCornersChangeSticky(float initialCorners) {
        TypeEvaluator<Pair<Float, Float>> typeEvaluator = cornersEvaluator;
        Float valueOf = Float.valueOf(initialCorners);
        Float valueOf2 = Float.valueOf(0.0f);
        ValueAnimator ofObject = ValueAnimator.ofObject(typeEvaluator, new Pair(valueOf, valueOf2), new Pair(Float.valueOf(CartControlsView.INSTANCE.getCornerRadius()), valueOf2));
        ofObject.addUpdateListener(new c(this, 0));
        ofObject.setDuration(250L);
        ofObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCornersChangeSticky$lambda$2$lambda$1(CartControlsViewController cartControlsViewController, ValueAnimator valueAnimator) {
        Pair pair = (Pair) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Pair<kotlin.Float, kotlin.Float>");
        cartControlsViewController.setCorners(((Number) pair.a()).floatValue(), ((Number) pair.b()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkTooltip(CartControlsVO.TooltipData tooltipData) {
        CartControlsViewModel cartControlsViewModel = this.viewModelProvider.get();
        if (cartControlsViewModel != null) {
            cartControlsViewModel.validateTooltip(tooltipData.getKey(), tooltipData.getServerTimestamp(), new CartControlsViewController$checkTooltip$1(this, tooltipData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair cornersEvaluator$lambda$3(float f7, Pair pair, Pair pair2) {
        float floatValue = ((Number) pair2.e()).floatValue() - ((Number) pair.e()).floatValue();
        return new Pair(Float.valueOf((floatValue * f7) + ((Number) pair.e()).floatValue()), Float.valueOf((f7 * (((Number) pair2.f()).floatValue() - ((Number) pair.f()).floatValue())) + ((Number) pair.f()).floatValue()));
    }

    private final void setCorners(float topCornerRadius, float bottomCornerRadius) {
        this.containerView.setCorners(topCornerRadius, bottomCornerRadius);
    }

    public static /* synthetic */ void setup$default(CartControlsViewController cartControlsViewController, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        cartControlsViewController.setup(z11, z12);
    }

    public final void animateSetup(boolean isTopCornersRounded) {
        animateCornersChangeSticky(isTopCornersRounded ? CartControlsView.INSTANCE.getCornerRadius() : 0.0f);
    }

    public final void bind(@NotNull final CartControlsVO vo, @NotNull Function1<? super AtomAction, Unit> onClick) {
        final View view;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.containerView.bindOrGone(vo, onClick);
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return;
        }
        G.a(view, new Runnable() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewController$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                CartControlsView cartControlsView;
                cartControlsView = this.containerView;
                final CartControlsVO cartControlsVO = vo;
                final CartControlsViewController cartControlsViewController = this;
                cartControlsView.postDelayed(new Runnable() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewController$bind$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CartControlsVO.TooltipData tooltipData = CartControlsVO.this.getTooltipData();
                        if (tooltipData != null) {
                            cartControlsViewController.checkTooltip(tooltipData);
                        }
                    }
                }, 500L);
            }
        });
    }

    public final void setLocatorsTags(boolean isSticky) {
        if (isSticky) {
            this.containerView.setContentDescription("cartControlsSticky");
        } else {
            this.containerView.setContentDescription("cartControlsNonSticky");
        }
    }

    public final void setup(boolean isSticky, boolean isBottomCornersRounded) {
        setCorners(isSticky ? CartControlsView.INSTANCE.getCornerRadius() : 0.0f, isBottomCornersRounded ? CartControlsView.INSTANCE.getCornerRadius() : 0.0f);
    }
}
