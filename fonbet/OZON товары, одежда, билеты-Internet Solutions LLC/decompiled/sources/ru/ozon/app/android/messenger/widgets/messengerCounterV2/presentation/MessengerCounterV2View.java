package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import B5.v;
import B90.I;
import H5.e;
import P5.b;
import Sc.InterfaceC4008j;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bx.messenger.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\fR\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changeModeAnimation", "()V", "Landroid/widget/FrameLayout$LayoutParams;", "createLayoutParamsForIndicator", "()Landroid/widget/FrameLayout$LayoutParams;", "createLayoutParamsForIconButton", "playAnimation", "cancelAnimation", "", "tint", "setTint", "(Ljava/lang/String;)V", "prepareViewsBeforeAnimation", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView$delegate", "LSc/j;", "getIndicatorView", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "iconButtonView$delegate", "getIconButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "iconButtonView", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "colorMessengerIcon", "I", "Landroid/animation/ObjectAnimator;", "indicatorAnimation$delegate", "getIndicatorAnimation", "()Landroid/animation/ObjectAnimator;", "indicatorAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "iconButtonAnimation$delegate", "getIconButtonAnimation", "()Lcom/airbnb/lottie/LottieAnimationView;", "iconButtonAnimation", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerCounterV2View extends FrameLayout {
    private AnimatorSet animatorSet;
    private int colorMessengerIcon;

    /* renamed from: iconButtonAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonAnimation;

    /* renamed from: iconButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonView;

    /* renamed from: indicatorAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorAnimation;

    /* renamed from: indicatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ICON_BUTTON_SIZE = ResourceExtKt.toPx(44);
    private static final int ICON_BUTTON_ANIMATION_PADDING = ResourceExtKt.toPx(8);
    private static final int INDICATOR_WIDTH = ResourceExtKt.toPx(23);
    private static final int INDICATOR_HEIGHT = ResourceExtKt.toPx(16);
    private static final int INDICATOR_MARGIN_TOP = ResourceExtKt.toPx(4);
    private static final int INDICATOR_MARGIN_RIGHT = ResourceExtKt.toPx(3);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View$Companion;", "", "<init>", "()V", "", "ICON_BUTTON_ANIMATION_PADDING", "I", "getICON_BUTTON_ANIMATION_PADDING", "()I", "", "BADGE_ANIMATION_DELAY", "J", "BADGE_ANIMATION_DURATION", "DEFAULT_COLOR", "", "INDICATOR_ELEVATION", "F", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getICON_BUTTON_ANIMATION_PADDING() {
            return MessengerCounterV2View.ICON_BUTTON_ANIMATION_PADDING;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessengerCounterV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void changeModeAnimation() {
        getIconButtonAnimation().addValueCallback(new e("**"), (e) v.f2780F, (P5.e<e>) new I(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter changeModeAnimation$lambda$1(MessengerCounterV2View messengerCounterV2View, b bVar) {
        return new PorterDuffColorFilter(messengerCounterV2View.colorMessengerIcon, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout.LayoutParams createLayoutParamsForIconButton() {
        int i11 = ICON_BUTTON_SIZE;
        return new FrameLayout.LayoutParams(i11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout.LayoutParams createLayoutParamsForIndicator() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(INDICATOR_WIDTH, INDICATOR_HEIGHT);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(0, INDICATOR_MARGIN_TOP, INDICATOR_MARGIN_RIGHT, 0);
        return layoutParams;
    }

    private final ObjectAnimator getIndicatorAnimation() {
        return (ObjectAnimator) this.indicatorAnimation.getValue();
    }

    public final void cancelAnimation() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
    }

    @NotNull
    public final LottieAnimationView getIconButtonAnimation() {
        return (LottieAnimationView) this.iconButtonAnimation.getValue();
    }

    @NotNull
    public final SmallIconButtonView getIconButtonView() {
        return (SmallIconButtonView) this.iconButtonView.getValue();
    }

    @NotNull
    public final IndicatorView getIndicatorView() {
        return (IndicatorView) this.indicatorView.getValue();
    }

    public final void playAnimation() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        getIconButtonAnimation().playAnimation();
        if (ViewExtKt.isVisible(getIconButtonView())) {
            ViewExtKt.gone(getIconButtonView());
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(1000L);
        animatorSet2.play(getIndicatorAnimation());
        animatorSet2.start();
        this.animatorSet = animatorSet2;
    }

    public final void prepareViewsBeforeAnimation() {
        getIconButtonView().setColorFilter(this.colorMessengerIcon, PorterDuff.Mode.SRC_IN);
        ViewExtKt.invisible(getIconButtonView());
        getIndicatorView().setScaleX(0.0f);
        getIndicatorView().setScaleY(0.0f);
        ViewExtKt.show(getIconButtonAnimation());
    }

    public final void setTint(String tint) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, tint);
        this.colorMessengerIcon = parseColor != null ? parseColor.intValue() : -1;
        changeModeAnimation();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCounterV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.indicatorView = LazyUtilsKt.unsafeLazy(new MessengerCounterV2View$indicatorView$2(context, this));
        this.iconButtonView = LazyUtilsKt.unsafeLazy(new MessengerCounterV2View$iconButtonView$2(context, this));
        this.colorMessengerIcon = -1;
        this.indicatorAnimation = LazyUtilsKt.unsafeLazy(new MessengerCounterV2View$indicatorAnimation$2(this));
        this.iconButtonAnimation = LazyUtilsKt.unsafeLazy(new MessengerCounterV2View$iconButtonAnimation$2(context, this));
        setId(R$id.bellCl);
        addView(getIconButtonView());
        addView(getIndicatorView());
        addView(getIconButtonAnimation());
    }
}
