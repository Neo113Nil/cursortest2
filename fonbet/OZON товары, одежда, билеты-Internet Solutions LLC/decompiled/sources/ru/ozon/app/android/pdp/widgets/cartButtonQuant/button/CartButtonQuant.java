package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import Sc.InterfaceC4008j;
import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.content.res.j;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.core.widget.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonV4Binding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0012J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010\u001cJ!\u0010.\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00062\b\b\u0001\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107J\u0013\u00109\u001a\u00020\u0006*\u000208H\u0003¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u00020\f*\u00020;2\b\b\u0001\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020%H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\bA\u0010BR.\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010C\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u001cR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010V\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bU\u0010RR\u001b\u0010Z\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010P\u001a\u0004\b\\\u0010YR\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010aR\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010c¨\u0006e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "enabled", "setEnabled", "(Z)V", "Lkotlin/Function0;", "onFinish", "onGradientAnimationFinish", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "viewState", "startGradientAnimation", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;)Lkotlin/Unit;", "startTextAnimation", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;)V", "cancelAnimations", "()V", "updateState", "updatePremium", "bindPremium", "bindInternal", "hasIcon", "setupPaddings", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;", "size", "setupMargins", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;)V", "setupTextAlignment", "(ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;)V", "setupAnimation", "oldState", "newState", "shouldAnimateTransition", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;)Z", "setupAppearance", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Icon;", "icon", "setupIcon", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Icon;)V", "styleResId", "readTextSizeFromStyle", "(I)I", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "toStyleRes", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;)I", "Landroid/widget/TextView;", "minTextSize", "buttonSize", "setupAutoSizingIfNeeded", "(Landroid/widget/TextView;ILru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;)V", "style", "getTitleTextStyle", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState$Size;Z)I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "getViewState", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "setViewState", "minTextSizeRegular", "I", "minTextSizeIconified", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonV4Binding;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonV4Binding;", "Landroid/view/animation/AnimationSet;", "animationSetFadeIn$delegate", "LSc/j;", "getAnimationSetFadeIn", "()Landroid/view/animation/AnimationSet;", "animationSetFadeIn", "animationSetFadeOut$delegate", "getAnimationSetFadeOut", "animationSetFadeOut", "endGradientColorRightButton$delegate", "getEndGradientColorRightButton", "()I", "endGradientColorRightButton", "endGradientColorLeftButton$delegate", "getEndGradientColorLeftButton", "endGradientColorLeftButton", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonGradientAnimationDrawable;", "gradientAnimationDrawable", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonGradientAnimationDrawable;", "Lkotlin/jvm/functions/Function0;", "isStartAnimation", "Z", "isAnimationCanceled", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuant extends ConstraintLayout {

    /* renamed from: animationSetFadeIn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationSetFadeIn;

    /* renamed from: animationSetFadeOut$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationSetFadeOut;

    @NotNull
    private final WidgetCartbuttonV4Binding binding;

    /* renamed from: endGradientColorLeftButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j endGradientColorLeftButton;

    /* renamed from: endGradientColorRightButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j endGradientColorRightButton;
    private CartButtonGradientAnimationDrawable gradientAnimationDrawable;
    private boolean isAnimationCanceled;
    private boolean isStartAnimation;
    private final int minTextSizeIconified;
    private final int minTextSizeRegular;
    private Function0<Unit> onGradientAnimationFinish;
    private CartButtonQuantViewState viewState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.LargeButton.LargeButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE_WHITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_GREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_FRESH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE_FRESH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartButtonQuant(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindInternal(CartButtonQuantViewState viewState) {
        setupMargins(viewState.getSize());
        setupTextAlignment(CartButtonQuantViewStateKt.getHasIcon(viewState), viewState.getSize());
        setupAnimation(viewState);
        setupAppearance(viewState);
        setupPaddings(CartButtonQuantViewStateKt.getHasIcon(viewState));
        setupIcon(viewState.getIcon());
        WidgetCartbuttonV4Binding widgetCartbuttonV4Binding = this.binding;
        CartButtonQuantDto.ButtonColors priorityColors = viewState.getPriorityColors();
        if (priorityColors != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, priorityColors.getTitleColor());
            if (parseColor != null) {
                widgetCartbuttonV4Binding.btnTitleTv.setTextColor(parseColor.intValue());
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, priorityColors.getSubtitleColor());
            if (parseColor2 != null) {
                widgetCartbuttonV4Binding.btnSubtitleTv.setTextColor(parseColor2.intValue());
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser.parseColor(context3, priorityColors.getBackgroundColor());
            if (parseColor3 != null) {
                setBackgroundTintList(ColorStateList.valueOf(parseColor3.intValue()));
            }
        }
        widgetCartbuttonV4Binding.btnTitleTv.setText(viewState.getTitle());
        TextView btnSubtitleTv = widgetCartbuttonV4Binding.btnSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(btnSubtitleTv, "btnSubtitleTv");
        TextViewExtKt.setTextOrGone(btnSubtitleTv, viewState.getSubtitle());
    }

    private final void bindPremium(CartButtonQuantViewState viewState) {
        int colorRes;
        int color;
        int color2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CartButtonQuantDto.CartButton.PremiumAnimation premiumAnimation = viewState.getPremiumAnimation();
        Integer parseColor = styleParser.parseColor(context, premiumAnimation != null ? premiumAnimation.getAnimationStartColor() : null);
        if (parseColor != null) {
            color = parseColor.intValue();
        } else {
            Context context2 = getContext();
            colorRes = CartButtonQuantKt.toColorRes(viewState.getTheme());
            color = a.getColor(context2, colorRes);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        CartButtonQuantDto.ButtonColors priorityColors = viewState.getPriorityColors();
        Integer parseColor2 = styleParser.parseColor(context3, priorityColors != null ? priorityColors.getBackgroundColor() : null);
        int intValue = parseColor2 != null ? parseColor2.intValue() : viewState.getCartMode() == DoubleCartQuantVO.CartMode.FIRST ? getEndGradientColorLeftButton() : getEndGradientColorRightButton();
        if (this.gradientAnimationDrawable == null) {
            this.gradientAnimationDrawable = new CartButtonGradientAnimationDrawable(color, intValue, viewState.getCartMode() == null ? 900L : 450L);
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        CartButtonQuantDto.ButtonColors priorityColors2 = viewState.getPriorityColors();
        Integer parseColor3 = styleParser.parseColor(context4, priorityColors2 != null ? priorityColors2.getTitleColor() : null);
        if (parseColor3 != null) {
            color2 = parseColor3.intValue();
        } else {
            color2 = a.getColor(getContext(), viewState.getCartMode() == DoubleCartQuantVO.CartMode.FIRST ? R$color.text_primary : R$color.text_primary_inverted);
        }
        setBackground(this.gradientAnimationDrawable);
        this.binding.btnTitleTv.setTextColor(color2);
        this.binding.btnSubtitleTv.setTextColor(color2);
        setupMargins(viewState.getSize());
        setupPaddings(CartButtonQuantViewStateKt.getHasIcon(viewState));
        setupTextAlignment(CartButtonQuantViewStateKt.getHasIcon(viewState), viewState.getSize());
        setupAnimation(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimationSet getAnimationSetFadeIn() {
        return (AnimationSet) this.animationSetFadeIn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimationSet getAnimationSetFadeOut() {
        return (AnimationSet) this.animationSetFadeOut.getValue();
    }

    private final int getEndGradientColorLeftButton() {
        return ((Number) this.endGradientColorLeftButton.getValue()).intValue();
    }

    private final int getEndGradientColorRightButton() {
        return ((Number) this.endGradientColorRightButton.getValue()).intValue();
    }

    private final int getTitleTextStyle(CartButtonQuantViewState.Size style, boolean hasIcon) {
        return (style == CartButtonQuantViewState.Size.MEDIUM && hasIcon) ? R$style.TextStyle_Body_M_Bold : R$style.TextStyle_Body_L_Bold;
    }

    private final int readTextSizeFromStyle(int styleResId) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(styleResId, new int[]{R.attr.textSize});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int b11 = j.b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return b11;
    }

    private final void setupAnimation(CartButtonQuantViewState viewState) {
        setLayoutTransition(new CartButtonQuantSubtitleLayoutTransition(new CartButtonQuant$setupAnimation$1(viewState, this)));
    }

    private final void setupAppearance(CartButtonQuantViewState viewState) {
        if (viewState.getCanReusableAppearance()) {
            return;
        }
        StyleAppearance of2 = StyleAppearance.INSTANCE.of(new CartButtonQuantAppearance(getTitleTextStyle(viewState.getSize(), CartButtonQuantViewStateKt.getHasIcon(viewState))));
        if (viewState.getPremiumAnimation() == null && Intrinsics.d(getBackground(), this.gradientAnimationDrawable) && viewState.getCartMode() == DoubleCartQuantVO.CartMode.IN_CART) {
            setBackground(a.getDrawable(getContext(), R$drawable.o2_button_primary_green));
        }
        ButtonV3Atom.LargeButton.LargeButtonStyle theme = viewState.getTheme();
        if (theme != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            of2.read(context, toStyleRes(theme));
        }
        of2.apply(this);
    }

    private final void setupAutoSizingIfNeeded(TextView textView, int i11, CartButtonQuantViewState.Size size) {
        if (size == CartButtonQuantViewState.Size.MEDIUM) {
            k.c(textView);
            return;
        }
        int textSize = (int) textView.getTextSize();
        Integer valueOf = Integer.valueOf(textSize);
        if (textSize <= i11) {
            valueOf = null;
        }
        if (valueOf != null) {
            k.b(textView, i11, valueOf.intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupIcon(CartButtonQuantViewState.Icon icon) {
        ImageView imageView = this.binding.btnIconIv;
        if (icon != null) {
            Intrinsics.f(imageView);
            ViewExtKt.loadIcon$default(imageView, icon.getImage(), null, null, 6, null);
            ThemeExtKt.tint(imageView, icon.getImageTintColor());
            if (icon.getBackgroundColor() == null) {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.clearBackgroundTint(imageView);
            } else {
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setBackgroundTint(imageView, icon.getBackgroundColor().intValue());
            }
        }
        Intrinsics.f(imageView);
        imageView.setVisibility(icon == null ? 8 : 0);
    }

    private final void setupMargins(CartButtonQuantViewState.Size size) {
        ViewGroup.LayoutParams layoutParams = this.binding.btnSubtitleTv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = size == CartButtonQuantViewState.Size.MEDIUM ? 0 : Dimens.INSTANCE.getDP_2();
    }

    private final void setupPaddings(boolean hasIcon) {
        if (hasIcon) {
            Dimens dimens = Dimens.INSTANCE;
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, dimens.getDP_12(), 0, dimens.getDP_12(), 0, 10, null);
        } else {
            Dimens dimens2 = Dimens.INSTANCE;
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, dimens2.getDP_16(), 0, dimens2.getDP_16(), 0, 10, null);
        }
    }

    private final void setupTextAlignment(boolean hasIcon, CartButtonQuantViewState.Size size) {
        int i11;
        WidgetCartbuttonV4Binding widgetCartbuttonV4Binding = this.binding;
        if (hasIcon) {
            TextView btnTitleTv = widgetCartbuttonV4Binding.btnTitleTv;
            Intrinsics.checkNotNullExpressionValue(btnTitleTv, "btnTitleTv");
            setupAutoSizingIfNeeded(btnTitleTv, this.minTextSizeIconified, size);
            i11 = 5;
        } else {
            TextView btnTitleTv2 = widgetCartbuttonV4Binding.btnTitleTv;
            Intrinsics.checkNotNullExpressionValue(btnTitleTv2, "btnTitleTv");
            setupAutoSizingIfNeeded(btnTitleTv2, this.minTextSizeRegular, size);
            i11 = 4;
        }
        widgetCartbuttonV4Binding.btnTitleTv.setTextAlignment(i11);
        widgetCartbuttonV4Binding.btnSubtitleTv.setTextAlignment(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAnimateTransition(CartButtonQuantViewState oldState, CartButtonQuantViewState newState) {
        return oldState != null && oldState.getSubtitle() == null && newState.getSubtitle() != null && oldState.getTheme() == newState.getTheme();
    }

    private final int toStyleRes(ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle) {
        switch (WhenMappings.$EnumSwitchMapping$0[largeButtonStyle.ordinal()]) {
            case 1:
                return R$style.LargeButton_Primary;
            case 2:
                return R$style.LargeButton_Primary;
            case 3:
                return R$style.LargeButton_Secondary;
            case 4:
                return R$style.LargeButton_Tertiary;
            case 5:
                return R$style.LargeButton_Secondary_Confirmed;
            case 6:
                return R$style.LargeButton_Danger;
            case 7:
                return R$style.LargeButton_Important;
            case 8:
                return R$style.LargeButton_Primary_Green;
            case 9:
                return R$style.LargeButton_Primary_Express;
            case 10:
                return R$style.LargeButton_Primary_Fresh;
            case 11:
                return R$style.LargeButton_Secondary_Fresh;
            case 12:
                return R$style.LargeButton_Tertiary_Fresh;
            default:
                throw new o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePremium(CartButtonQuantViewState viewState) {
        CartButtonGradientAnimationDrawable cartButtonGradientAnimationDrawable = this.gradientAnimationDrawable;
        if (cartButtonGradientAnimationDrawable != null) {
            cartButtonGradientAnimationDrawable.applyEndColor();
        }
        this.binding.btnTitleTv.setText(viewState.getTitle());
        TextView btnTitleTv = this.binding.btnTitleTv;
        Intrinsics.checkNotNullExpressionValue(btnTitleTv, "btnTitleTv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(btnTitleTv);
        TextView btnSubtitleTv = this.binding.btnSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(btnSubtitleTv, "btnSubtitleTv");
        TextViewExtKt.setTextOrGone(btnSubtitleTv, viewState.getSubtitle());
        setupIcon(viewState.getIcon());
    }

    private final void updateState(CartButtonQuantViewState viewState) {
        boolean z11;
        if (viewState.getPremiumAnimation() == null) {
            bindInternal(viewState);
            return;
        }
        setTag(R$id.atom_style_res, viewState.getPremiumAnimation().getAnimationStartColor());
        if (this.isStartAnimation) {
            return;
        }
        bindPremium(viewState);
        z11 = CartButtonQuantKt.isShownPremiumAnimation;
        if (z11) {
            updatePremium(viewState);
        } else if (viewState.getCartMode() != DoubleCartQuantVO.CartMode.FIRST) {
            startGradientAnimation(viewState);
        }
    }

    public final void cancelAnimations() {
        CartButtonGradientAnimationDrawable cartButtonGradientAnimationDrawable = this.gradientAnimationDrawable;
        if (cartButtonGradientAnimationDrawable != null) {
            cartButtonGradientAnimationDrawable.cancel();
        }
        getAnimationSetFadeIn().cancel();
        getAnimationSetFadeOut().cancel();
        setAnimation(null);
        CartButtonQuantKt.isShownPremiumAnimation = true;
        this.isAnimationCanceled = true;
        this.isStartAnimation = false;
    }

    public final CartButtonQuantViewState getViewState() {
        return this.viewState;
    }

    public final void onGradientAnimationFinish(@NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.onGradientAnimationFinish = onFinish;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            CartButtonQuantViewState cartButtonQuantViewState = this.viewState;
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((cartButtonQuantViewState != null ? cartButtonQuantViewState.getSize() : null) == CartButtonQuantViewState.Size.MEDIUM ? Dimens.INSTANCE.getDP_52() : Dimens.INSTANCE.getDP_56(), 1073741824));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ((View) c5314e0.next()).setEnabled(enabled);
            }
        }
    }

    public final void setViewState(CartButtonQuantViewState cartButtonQuantViewState) {
        if (cartButtonQuantViewState != null) {
            CartButtonQuantViewState cartButtonQuantViewState2 = !cartButtonQuantViewState.equals(this.viewState) ? cartButtonQuantViewState : null;
            if (cartButtonQuantViewState2 != null) {
                ButtonV3Atom.LargeButton.LargeButtonStyle theme = cartButtonQuantViewState2.getTheme();
                CartButtonQuantViewState cartButtonQuantViewState3 = this.viewState;
                if (theme == (cartButtonQuantViewState3 != null ? cartButtonQuantViewState3.getTheme() : null)) {
                    cartButtonQuantViewState2 = CartButtonQuantViewState.copy$default(cartButtonQuantViewState2, null, null, null, null, null, true, null, null, null, false, 991, null);
                }
                updateState(cartButtonQuantViewState2);
            }
        }
        this.viewState = cartButtonQuantViewState;
    }

    public final Unit startGradientAnimation(@NotNull CartButtonQuantViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        TextView btnSubtitleTv = this.binding.btnSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(btnSubtitleTv, "btnSubtitleTv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(btnSubtitleTv);
        this.isStartAnimation = true;
        CartButtonGradientAnimationDrawable cartButtonGradientAnimationDrawable = this.gradientAnimationDrawable;
        if (cartButtonGradientAnimationDrawable == null) {
            return null;
        }
        cartButtonGradientAnimationDrawable.startAnimation(0.0f, 1.0f, new CartButtonQuant$startGradientAnimation$1$1(viewState, this));
        return Unit.f71690a;
    }

    public final void startTextAnimation(@NotNull final CartButtonQuantViewState viewState) {
        CharSequence title;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        final I i11 = new I();
        i11.f71783a = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, getHeight() / 2.0f, 0.0f);
        translateAnimation.setDuration(500L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(600L);
        getAnimationSetFadeIn().addAnimation(translateAnimation);
        getAnimationSetFadeIn().addAnimation(alphaAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(getHeight() / 2.0f));
        translateAnimation2.setDuration(500L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(600L);
        getAnimationSetFadeOut().addAnimation(translateAnimation2);
        getAnimationSetFadeOut().addAnimation(alphaAnimation2);
        getAnimationSetFadeOut().setStartOffset(1500L);
        getAnimationSetFadeIn().setAnimationListener(new Animation.AnimationListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant$startTextAnimation$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                boolean z11;
                WidgetCartbuttonV4Binding widgetCartbuttonV4Binding;
                AnimationSet animationSetFadeOut;
                z11 = CartButtonQuant.this.isAnimationCanceled;
                if (z11) {
                    return;
                }
                if (i11.f71783a) {
                    CartButtonQuantDto.CartButton.PremiumAnimation premiumAnimation = viewState.getPremiumAnimation();
                    if ((premiumAnimation != null ? premiumAnimation.getPremiumText() : null) != null) {
                        widgetCartbuttonV4Binding = CartButtonQuant.this.binding;
                        TextView textView = widgetCartbuttonV4Binding.btnTitleTv;
                        animationSetFadeOut = CartButtonQuant.this.getAnimationSetFadeOut();
                        textView.startAnimation(animationSetFadeOut);
                        return;
                    }
                }
                if (CartButtonQuant.this.getViewState() != null) {
                    CartButtonQuant cartButtonQuant = CartButtonQuant.this;
                    CartButtonQuantViewState viewState2 = cartButtonQuant.getViewState();
                    if (viewState2 != null) {
                        cartButtonQuant.updatePremium(viewState2);
                    }
                    cartButtonQuant.cancelAnimations();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        getAnimationSetFadeOut().setAnimationListener(new Animation.AnimationListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant$startTextAnimation$1$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                boolean z11;
                WidgetCartbuttonV4Binding widgetCartbuttonV4Binding;
                WidgetCartbuttonV4Binding widgetCartbuttonV4Binding2;
                AnimationSet animationSetFadeIn;
                WidgetCartbuttonV4Binding widgetCartbuttonV4Binding3;
                AnimationSet animationSetFadeIn2;
                z11 = CartButtonQuant.this.isAnimationCanceled;
                if (z11) {
                    return;
                }
                widgetCartbuttonV4Binding = CartButtonQuant.this.binding;
                widgetCartbuttonV4Binding.btnTitleTv.setText(viewState.getTitle());
                i11.f71783a = false;
                CartButtonQuant.this.setupIcon(viewState.getIcon());
                widgetCartbuttonV4Binding2 = CartButtonQuant.this.binding;
                TextView textView = widgetCartbuttonV4Binding2.btnTitleTv;
                animationSetFadeIn = CartButtonQuant.this.getAnimationSetFadeIn();
                textView.startAnimation(animationSetFadeIn);
                widgetCartbuttonV4Binding3 = CartButtonQuant.this.binding;
                ImageView imageView = widgetCartbuttonV4Binding3.btnIconIv;
                animationSetFadeIn2 = CartButtonQuant.this.getAnimationSetFadeIn();
                imageView.startAnimation(animationSetFadeIn2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        TextView textView = this.binding.btnTitleTv;
        CartButtonQuantDto.CartButton.PremiumAnimation premiumAnimation = viewState.getPremiumAnimation();
        if (premiumAnimation == null || (title = premiumAnimation.getPremiumText()) == null) {
            title = viewState.getTitle();
        }
        textView.setText(title);
        CartButtonQuantDto.CartButton.PremiumAnimation premiumAnimation2 = viewState.getPremiumAnimation();
        if ((premiumAnimation2 != null ? premiumAnimation2.getPremiumText() : null) == null) {
            setupIcon(viewState.getIcon());
        }
        this.binding.btnTitleTv.startAnimation(getAnimationSetFadeIn());
        if (CartButtonQuantViewStateKt.getHasIcon(viewState)) {
            this.binding.btnIconIv.startAnimation(getAnimationSetFadeIn());
        }
    }

    public /* synthetic */ CartButtonQuant(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonQuant(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCartbuttonV4Binding inflate = WidgetCartbuttonV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.animationSetFadeIn = DelegatesKt.lazyUnsafe(CartButtonQuant$animationSetFadeIn$2.INSTANCE);
        this.animationSetFadeOut = DelegatesKt.lazyUnsafe(CartButtonQuant$animationSetFadeOut$2.INSTANCE);
        this.endGradientColorRightButton = DelegatesKt.lazyUnsafe(new CartButtonQuant$endGradientColorRightButton$2(context));
        this.endGradientColorLeftButton = DelegatesKt.lazyUnsafe(new CartButtonQuant$endGradientColorLeftButton$2(context));
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, 0, dimens.getDP_8(), 0, dimens.getDP_8(), 5, null);
        this.minTextSizeRegular = readTextSizeFromStyle(R$style.TextStyle_Body_M);
        this.minTextSizeIconified = readTextSizeFromStyle(R$style.TextStyle_Caption);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                CartButtonQuant.this.removeOnAttachStateChangeListener(this);
                CartButtonQuant.this.cancelAnimations();
            }
        });
    }
}
