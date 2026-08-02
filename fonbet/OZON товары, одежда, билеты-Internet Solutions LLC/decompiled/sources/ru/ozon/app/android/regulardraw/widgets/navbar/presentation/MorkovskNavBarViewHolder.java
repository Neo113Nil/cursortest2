package ru.ozon.app.android.regulardraw.widgets.navbar.presentation;

import MU.a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6067d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.databinding.WidgetMorkovskNavbarBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.navbar.ShadowImageButton;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotBackgroundGradientVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarButtonVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarVO;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u0015*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00152\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00152\b\b\u0001\u0010!\u001a\u00020\u001d2\b\b\u0001\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010(J'\u0010.\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0015068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/presentation/MorkovskNavBarViewHolder;", "Ld20/d;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarVO;", "Ll10/i;", "container", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskNavbarBinding;", "toolBarViewBinding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/AppBarLayout;Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskNavbarBinding;LWZ/l;LVg/d;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;)V", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotBackgroundGradientVO;", "background", "", "bindBg", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotBackgroundGradientVO;)V", "Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarButtonVO;", "item", "bindOrGone", "(Lru/ozon/app/android/regulardraw/widgets/navbar/ShadowImageButton;Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarButtonVO;)V", "", "color", "bindStatusBar", "(Ljava/lang/Integer;)V", "gradientStart", "gradientEnd", "setGradient", "(II)V", "bind", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lru/ozon/app/android/regulardraw/databinding/WidgetMorkovskNavbarBinding;", "LWZ/l;", "LVg/d;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/GradientDrawable;", "gradientBackground", "Landroid/graphics/drawable/GradientDrawable;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskNavBarViewHolder extends AbstractC6067d<CarrotNavBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppBarLayout appBarLayout;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final GradientDrawable gradientBackground;

    @NotNull
    private final MorkovskOnboardingDelegate onboardingDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final WidgetMorkovskNavbarBinding toolBarViewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorkovskNavBarViewHolder(@NotNull i container, @NotNull AppBarLayout appBarLayout, @NotNull WidgetMorkovskNavbarBinding toolBarViewBinding, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull MorkovskOnboardingDelegate onboardingDelegate) {
        super(container, new a(toolBarViewBinding, 1));
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(toolBarViewBinding, "toolBarViewBinding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(onboardingDelegate, "onboardingDelegate");
        this.container = container;
        this.appBarLayout = appBarLayout;
        this.toolBarViewBinding = toolBarViewBinding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.onboardingDelegate = onboardingDelegate;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new MorkovskNavBarViewHolder$actionHandler$1(this)).buildHandler();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        this.gradientBackground = gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _init_$lambda$0(WidgetMorkovskNavbarBinding widgetMorkovskNavbarBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout constraintLayout = widgetMorkovskNavbarBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final void bindBg(CarrotBackgroundGradientVO background) {
        if (background == null) {
            this.toolBarViewBinding.getConstraintLayout().setBackground(null);
            bindStatusBar(null);
            return;
        }
        String startColor = background.getStartColor();
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        int parseColor = UtilKt.parseColor(startColor, L11);
        String endColor = background.getEndColor();
        Context L12 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        setGradient(parseColor, UtilKt.parseColor(endColor, L12));
        bindStatusBar(Integer.valueOf(parseColor));
    }

    private final void bindOrGone(ShadowImageButton shadowImageButton, CarrotNavBarButtonVO carrotNavBarButtonVO) {
        Integer num;
        shadowImageButton.setVisibility(carrotNavBarButtonVO == null ? 4 : 0);
        if (carrotNavBarButtonVO == null) {
            return;
        }
        shadowImageButton.setClickable(true);
        shadowImageButton.setFocusable(true);
        ImageViewExtKt.load$default(shadowImageButton, carrotNavBarButtonVO.getIcon().getIcon(), null, null, null, null, false, null, 126, null);
        String tintColor = carrotNavBarButtonVO.getIcon().getTintColor();
        if (tintColor != null) {
            Context context = shadowImageButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = Integer.valueOf(UtilKt.parseColor(tintColor, context));
        } else {
            num = null;
        }
        ThemeExtKt.tint(shadowImageButton, num);
        shadowImageButton.setOnClickListener(new BP.a(6, carrotNavBarButtonVO, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$8(CarrotNavBarButtonVO carrotNavBarButtonVO, MorkovskNavBarViewHolder morkovskNavBarViewHolder, View view) {
        AtomAction action = carrotNavBarButtonVO.getAction();
        if (action != null) {
            morkovskNavBarViewHolder.actionHandler.invoke(action);
        }
    }

    private final void bindStatusBar(Integer color) {
        this.toolBarViewBinding.statusBarSpace.setBackgroundColor(color != null ? color.intValue() : 0);
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(b11, newState, 0);
        StatusBarController.setStatusBarContentColor$default(statusBarController, this.container.K().b(), newState, true, false, 8, null);
    }

    private final void setGradient(int gradientStart, int gradientEnd) {
        Integer J11;
        int[] colors;
        Integer J12;
        int[] colors2 = this.gradientBackground.getColors();
        if (colors2 == null || (J11 = C7705l.J(colors2, 0)) == null || J11.intValue() != gradientStart || (colors = this.gradientBackground.getColors()) == null || (J12 = C7705l.J(colors, 1)) == null || J12.intValue() != gradientEnd) {
            this.gradientBackground.setColors(new int[]{gradientStart, gradientEnd});
        }
        this.toolBarViewBinding.navbarContainer.setBackground(this.gradientBackground);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        AppBarLayout appBarLayout = this.appBarLayout;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = 0;
        marginLayoutParams.topMargin = 0;
        appBarLayout.setLayoutParams(marginLayoutParams);
        View statusBarSpace = this.toolBarViewBinding.statusBarSpace;
        Intrinsics.checkNotNullExpressionValue(statusBarSpace, "statusBarSpace");
        ViewGroup.LayoutParams layoutParams2 = statusBarSpace.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.height = UtilKt.getStatusBarHeight(this.container.K());
        statusBarSpace.setLayoutParams(marginLayoutParams2);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        AppBarLayout appBarLayout = this.appBarLayout;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = UtilKt.getStatusBarHeight(this.container.K());
        appBarLayout.setLayoutParams(marginLayoutParams);
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 != null) {
            StatusBarController.setStatusBarColorByTheme$default(StatusBarController.INSTANCE, b11, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CarrotNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.appBarLayout.setFitsSystemWindows(true);
        bindBg(item.getBackgroundGradient());
        this.toolBarViewBinding.currencyBadge.bindOrInvisible(item.getBalance(), new MorkovskNavBarViewHolder$bind$1(this));
        ShadowImageButton menuButton = this.toolBarViewBinding.menuButton;
        Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
        bindOrGone(menuButton, item.getMenuButton());
        ShadowImageButton rightButton = this.toolBarViewBinding.rightButton;
        Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
        bindOrGone(rightButton, item.getRightButton());
        if (item.getBalance() != null) {
            MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding = this.onboardingDelegate.provideMorokvskOnboarding();
            OnboardingModel.Companion companion = OnboardingModel.INSTANCE;
            MorkovskCurrencyBadge currencyBadge = this.toolBarViewBinding.currencyBadge;
            Intrinsics.checkNotNullExpressionValue(currencyBadge, "currencyBadge");
            provideMorokvskOnboarding.putOnboardingModel(new OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel(companion.createGetViewReferenceCallback(currencyBadge)));
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull CarrotNavBarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((MorkovskNavBarViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
