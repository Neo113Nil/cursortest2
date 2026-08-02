package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\rJ\u0014\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'J\u0006\u0010(\u001a\u00020%J0\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u0007H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020%H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onboardingAnimator", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingAnimator;", "onboardingStyle", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingDelegate$OnboardingStyle;", "viewCornerRadius", "", "dp4", "dp8", "dp16", "dp12", "dp24", "dp32", "strokeWidth", "bgLightColor", "textLightColor", "graphicLightColor", "leftTouchDot", "Landroid/widget/ImageView;", "rightTouchDot", "helpTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "setConstraintIds", "constraintsViewIds", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder$ConstraintsViewIds;", "setStyle", "newStyle", "playAnimationWithEndAction", "", "animationEndAction", "Lkotlin/Function0;", "cancelAnimation", "buildTouchDot", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "buildHelpTitle", "initShadowView", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinchToZoomOnboardingView extends FrameLayout {
    private final int bgLightColor;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final int graphicLightColor;

    @NotNull
    private final AppCompatTextView helpTitle;

    @NotNull
    private final ImageView leftTouchDot;
    private PinchToZoomOnboardingAnimator onboardingAnimator;

    @NotNull
    private PinchToZoomOnboardingDelegate.OnboardingStyle onboardingStyle;

    @NotNull
    private final ImageView rightTouchDot;
    private final int strokeWidth;
    private final int textLightColor;
    private final float viewCornerRadius;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingView$Companion;", "", "<init>", "()V", "SHADOW_ALPHA", "", "DOT_BACKGROUND_ALPHA", "ONBOARDING_LOCATOR", "", "ONBOARDING_TEXT_LOCATOR", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinchToZoomOnboardingDelegate.OnboardingStyle.values().length];
            try {
                iArr[PinchToZoomOnboardingDelegate.OnboardingStyle.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinchToZoomOnboardingDelegate.OnboardingStyle.GRID_WITHOUT_PAGINATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PinchToZoomOnboardingView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final AppCompatTextView buildHelpTitle() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setContentDescription("PinchToZoomOnboardingTextLocator");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        int i11 = this.dp8;
        layoutParams.setMargins(i11, 0, i11, this.dp24);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(StringProvider.getString(R$string.search_pinch_to_zoom_onboarding_title));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
        appCompatTextView.setTextColor(this.textLightColor);
        return appCompatTextView;
    }

    private final ImageView buildTouchDot(int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
        ImageView imageView = new ImageView(getContext());
        imageView.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = this.dp32;
        layoutParams.width = i11;
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        int i12 = this.dp4;
        imageView.setPadding(i12, i12, i12, i12);
        layoutParams.setMargins(leftMargin, topMargin, rightMargin, bottomMargin);
        imageView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c.f(this.bgLightColor, 41));
        gradientDrawable.setStroke(this.strokeWidth, this.graphicLightColor);
        imageView.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(this.graphicLightColor);
        imageView.setImageDrawable(gradientDrawable2);
        return imageView;
    }

    static /* synthetic */ ImageView buildTouchDot$default(PinchToZoomOnboardingView pinchToZoomOnboardingView, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = 0;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return pinchToZoomOnboardingView.buildTouchDot(i11, i12, i13, i14);
    }

    private final void initShadowView() {
        setContentDescription("PinchToZoomOnboardingLocator");
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.setMargins(0, 0, 0, this.dp12);
        setLayoutParams(bVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int f7 = c.f(ThemeExtKt.themeColor(context, R$attr.layerOverlayDimming), 61);
        gradientDrawable.setCornerRadius(this.viewCornerRadius);
        gradientDrawable.setColor(f7);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setAlpha(0.0f);
    }

    public final void cancelAnimation() {
        PinchToZoomOnboardingAnimator pinchToZoomOnboardingAnimator = this.onboardingAnimator;
        if (pinchToZoomOnboardingAnimator != null) {
            pinchToZoomOnboardingAnimator.cancelAnimation();
        }
    }

    public final void playAnimationWithEndAction(@NotNull Function0<Unit> animationEndAction) {
        Intrinsics.checkNotNullParameter(animationEndAction, "animationEndAction");
        PinchToZoomOnboardingAnimator pinchToZoomOnboardingAnimator = new PinchToZoomOnboardingAnimator(this, this.leftTouchDot, this.rightTouchDot);
        this.onboardingAnimator = pinchToZoomOnboardingAnimator;
        pinchToZoomOnboardingAnimator.playAnimationWithEndAction(new PinchToZoomOnboardingView$playAnimationWithEndAction$1(this, animationEndAction));
    }

    @NotNull
    public final PinchToZoomOnboardingView setConstraintIds(@NotNull PinchToZoomOnboardingHolder.ConstraintsViewIds constraintsViewIds) {
        Intrinsics.checkNotNullParameter(constraintsViewIds, "constraintsViewIds");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.f41656t = constraintsViewIds.getStart();
            bVar.f41636i = constraintsViewIds.getTop();
            bVar.f41658v = constraintsViewIds.getEnd();
            bVar.f41642l = constraintsViewIds.getBottom();
        }
        return this;
    }

    @NotNull
    public final PinchToZoomOnboardingView setStyle(@NotNull PinchToZoomOnboardingDelegate.OnboardingStyle newStyle) {
        Intrinsics.checkNotNullParameter(newStyle, "newStyle");
        this.onboardingStyle = newStyle;
        int i11 = WhenMappings.$EnumSwitchMapping$0[newStyle.ordinal()];
        if (i11 == 1) {
            return this;
        }
        if (i11 != 2) {
            throw new o();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, ((ViewGroup.MarginLayoutParams) bVar).topMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, 0);
        setLayoutParams(bVar);
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinchToZoomOnboardingView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onboardingStyle = PinchToZoomOnboardingDelegate.OnboardingStyle.GRID;
        this.viewCornerRadius = ResourceExtKt.toPxF(10);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp8 = ResourceExtKt.toPx(8);
        int px = ResourceExtKt.toPx(16);
        this.dp16 = px;
        this.dp12 = ResourceExtKt.toPx(12);
        this.dp24 = ResourceExtKt.toPx(24);
        int px2 = ResourceExtKt.toPx(32);
        this.dp32 = px2;
        this.strokeWidth = ResourceExtKt.toPx(1);
        this.bgLightColor = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        this.textLightColor = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        this.graphicLightColor = ThemeExtKt.themeColor(context, R$attr.graphicLightKey);
        ImageView buildTouchDot$default = buildTouchDot$default(this, 0, px, px, px, 1, null);
        this.leftTouchDot = buildTouchDot$default;
        ImageView buildTouchDot$default2 = buildTouchDot$default(this, px, 0, 0, px2, 6, null);
        this.rightTouchDot = buildTouchDot$default2;
        AppCompatTextView buildHelpTitle = buildHelpTitle();
        this.helpTitle = buildHelpTitle;
        initShadowView();
        addView(buildHelpTitle);
        addView(buildTouchDot$default);
        addView(buildTouchDot$default2);
    }
}
