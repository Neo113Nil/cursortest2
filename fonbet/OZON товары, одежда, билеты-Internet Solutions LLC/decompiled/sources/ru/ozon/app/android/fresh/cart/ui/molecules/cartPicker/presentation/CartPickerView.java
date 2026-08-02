package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import Bi.a;
import Bi.b;
import Bu.f;
import D40.d;
import Sc.InterfaceC4008j;
import Sc.o;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 ]2\u00020\u0001:\u0002]^B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u0017\u0010\u0016J7\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJq\u0010-\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020!2\u0006\u0010 \u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J/\u0010;\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010B\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u001b\u0010V\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001b\u0010\\\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010U¨\u0006_"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "item", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView$CartPickerListeners;", "listeners", "", "bind", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView$CartPickerListeners;)V", "", "animated", "Lkotlin/Function0;", "onFinished", "collapseToPlusOnly", "(ZLkotlin/jvm/functions/Function0;)V", "expandFromPlusOnly", "quantity", "minValue", "updateCollapsedStateByQuantity", "(IIZLkotlin/jvm/functions/Function0;)V", "setupExpandedWidth", "()V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "size", "", "icon", "iconColor", "backgroundColor", "clickedBackgroundColor", "isDisabled", "Lru/ozon/uni/android/haptic/HapticToken;", "haptic", "Landroid/graphics/drawable/GradientDrawable;", "iconBackground", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindButton", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/android/haptic/HapticToken;Landroid/graphics/drawable/GradientDrawable;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "sizing", "bindLayoutParams", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;)V", "setupClickedColor", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "backgroundColorToken", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "bindBackground", "(Ljava/lang/String;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;)V", "start", "end", "animateWidthChange", "(IILkotlin/jvm/functions/Function0;)V", "currentVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "expandedWidth", "I", "isCollapsedToPlusOnly", "Z", "Landroid/animation/ValueAnimator;", "widthAnimator", "Landroid/animation/ValueAnimator;", "shouldAnimate", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "minusButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "plusButton", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "quantityText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleText", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "plusBackgroundDrawable$delegate", "getPlusBackgroundDrawable", "plusBackgroundDrawable", "minusBackgroundDrawable$delegate", "getMinusBackgroundDrawable", "minusBackgroundDrawable", "Companion", "CartPickerListeners", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerView extends ConstraintLayout {
    private static final int defaultBackgroundColor;
    private static final int defaultMargin;
    private static final int defaultRippleEffectColor;

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;
    private CartPickerVO currentVO;
    private int expandedWidth;
    private boolean isCollapsedToPlusOnly;

    /* renamed from: minusBackgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j minusBackgroundDrawable;

    @NotNull
    private final IconButtonV3View minusButton;

    /* renamed from: plusBackgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusBackgroundDrawable;

    @NotNull
    private final IconButtonV3View plusButton;

    @NotNull
    private final TextAtomV2View quantityText;
    private boolean shouldAnimate;

    @NotNull
    private final TextAtomV2View subtitleText;
    private ValueAnimator widthAnimator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView$CartPickerListeners;", "", "onPlusClickListener", "", "cartPicker", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "currentVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "onMinusClickListener", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CartPickerListeners {
        void onMinusClickListener(@NotNull CartPickerView cartPicker, CartPickerVO currentVO);

        void onPlusClickListener(@NotNull CartPickerView cartPicker, CartPickerVO currentVO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView$Companion;", "", "<init>", "()V", "", "defaultBackgroundColor", "I", "getDefaultBackgroundColor", "()I", "", "HORIZONTAL_BIAS_CENTER", "F", "HORIZONTAL_BIAS_LEFT", "HORIZONTAL_BIAS_RIGHT", "", "ANIMATE_WIDTH_DURATION", "J", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultBackgroundColor() {
            return CartPickerView.defaultBackgroundColor;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartPickerDTO.Sizings.values().length];
            try {
                iArr[CartPickerDTO.Sizings.SIZING_HUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartPickerDTO.Sizings.SIZING_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        UniColors uniColors = UniColors.BG_SECONDARY;
        defaultBackgroundColor = uniColors.getResId();
        defaultRippleEffectColor = uniColors.getResId();
        defaultMargin = ResourceExtKt.toPx(2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartPickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void animateWidthChange(int start, int end, final Function0<Unit> onFinished) {
        ValueAnimator valueAnimator = this.widthAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(start, end);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new f(this, 1));
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView$animateWidthChange$lambda$28$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        };
        ofInt.addListener(animatorListener);
        ofInt.addListener(animatorListener);
        ofInt.start();
        this.widthAnimator = ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateWidthChange$lambda$28$lambda$26(CartPickerView cartPickerView, ValueAnimator valueAnimator) {
        int intValue = ((Integer) a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = cartPickerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = intValue;
        cartPickerView.setLayoutParams(bVar);
    }

    private final void bindBackground(String backgroundColorToken, CartPickerDTO.Sizes size) {
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColorToken, defaultBackgroundColor);
        backgroundDrawable.setColors(new int[]{parseColor, parseColor});
        backgroundDrawable.setCornerRadius(UiExtKt.toPxF(size.getParams().getCornerRadius()));
        setBackground(getBackgroundDrawable());
    }

    private final void bindButton(final IconButtonV3View iconButtonV3View, IconButtonV3DTO.Sizes sizes, String str, String str2, String str3, String str4, boolean z11, final HapticToken hapticToken, GradientDrawable gradientDrawable, final Function2<? super CartPickerView, ? super CartPickerVO, Unit> function2) {
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, new IconButtonV3DTO(sizes, ButtonV3DTO.StyleTypes.CUSTOM, null, str, null, str2, str3, null, null, null, null, null, null, null, 16276, null), null, 2, null);
        iconButtonV3View.setAlpha(z11 ? 0.2f : 1.0f);
        iconButtonV3View.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView$setupListener$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartPickerVO cartPickerVO;
                HapticVibrator.INSTANCE.vibrate(IconButtonV3View.this, hapticToken);
                Function2<CartPickerView, CartPickerVO, Unit> function22 = function2;
                CartPickerView cartPickerView = this;
                cartPickerVO = cartPickerView.currentVO;
                function22.invoke(cartPickerView, cartPickerVO);
            }
        });
        setupClickedColor(iconButtonV3View, str3, str4, gradientDrawable);
    }

    private final void bindLayoutParams(CartPickerDTO.Sizings sizing) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[sizing.ordinal()];
        if (i11 == 1) {
            this.quantityText.getLayoutParams().width = -2;
            this.subtitleText.getLayoutParams().width = -2;
            getLayoutParams().width = -2;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            this.quantityText.getLayoutParams().width = 0;
            this.subtitleText.getLayoutParams().width = 0;
            getLayoutParams().width = -1;
        }
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    private final GradientDrawable getMinusBackgroundDrawable() {
        return (GradientDrawable) this.minusBackgroundDrawable.getValue();
    }

    private final GradientDrawable getPlusBackgroundDrawable() {
        return (GradientDrawable) this.plusBackgroundDrawable.getValue();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupClickedColor(final IconButtonV3View iconButtonV3View, String str, String str2, final GradientDrawable gradientDrawable) {
        if (str2 != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = iconButtonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final int parseColor = styleParser.parseColor(context, str, defaultBackgroundColor);
            Context context2 = iconButtonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final int parseColor2 = styleParser.parseColor(context2, str2, defaultRippleEffectColor);
            iconButtonV3View.setOnTouchListener(new View.OnTouchListener() { // from class: Dt.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z11;
                    IconButtonV3View iconButtonV3View2 = iconButtonV3View;
                    CartPickerView cartPickerView = this;
                    z11 = CartPickerView.setupClickedColor$lambda$23$lambda$22(gradientDrawable, parseColor2, parseColor, iconButtonV3View2, cartPickerView, view, motionEvent);
                    return z11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupClickedColor$lambda$23$lambda$22(GradientDrawable gradientDrawable, int i11, int i12, IconButtonV3View iconButtonV3View, CartPickerView cartPickerView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 11) {
            i11 = i12;
        }
        if (motionEvent.getAction() == 1) {
            iconButtonV3View.performClick();
        }
        gradientDrawable.setCornerRadius(cartPickerView.getBackgroundDrawable().getCornerRadius());
        gradientDrawable.setColors(new int[]{i11, i11});
        view.setBackground(gradientDrawable);
        return true;
    }

    private final void setupExpandedWidth() {
        int intValue;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            Integer valueOf = Integer.valueOf(layoutParams.width);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (intValue = valueOf.intValue()) <= this.expandedWidth) {
                return;
            }
            this.expandedWidth = intValue;
        }
    }

    public final void bind(@NotNull CartPickerVO item, @NotNull CartPickerListeners listeners) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        if (!this.isCollapsedToPlusOnly) {
            setupExpandedWidth();
        }
        IconButtonV3View iconButtonV3View = this.plusButton;
        IconButtonV3DTO.Sizes params = item.getSize().getParams();
        String incrementIcon = item.getIncrementIcon();
        String iconColor = item.getCustomStyle().getIconColor();
        String buttonBackgroundColor = item.getCustomStyle().getButtonBackgroundColor();
        String clickedButtonBackgroundColor = item.getCustomStyle().getClickedButtonBackgroundColor();
        HapticToken hapticPlus = item.getQuantity().getHapticPlus();
        HapticToken hapticToken = HapticToken.SUCCESS;
        bindButton(iconButtonV3View, params, incrementIcon, iconColor, buttonBackgroundColor, clickedButtonBackgroundColor, hapticPlus != hapticToken, item.getQuantity().getHapticPlus(), getPlusBackgroundDrawable(), new CartPickerView$bind$1$1(listeners));
        bindButton(this.minusButton, item.getSize().getParams(), item.getDecrementIcon(), item.getCustomStyle().getIconColor(), item.getCustomStyle().getButtonBackgroundColor(), item.getCustomStyle().getClickedButtonBackgroundColor(), item.getQuantity().getHapticMinus() != hapticToken, item.getQuantity().getHapticMinus(), getMinusBackgroundDrawable(), new CartPickerView$bind$1$2(listeners));
        TextHolderKt.bindOrGone$default(this.quantityText, item.getQuantityTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleText, item.getSubtitle(), null, 2, null);
        bindBackground(item.getCustomStyle().getBackgroundColor(), item.getSize());
        bindLayoutParams(item.getSizing());
        this.currentVO = item;
        updateCollapsedStateByQuantity(item.getQuantity().getValue(), item.getQuantity().getMinValue(), this.shouldAnimate, new CartPickerView$bind$1$3(this));
        requestLayout();
        invalidate();
    }

    public final void collapseToPlusOnly(boolean animated, @NotNull Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        if (animated && this.isCollapsedToPlusOnly) {
            onFinished.invoke();
            return;
        }
        if (this.expandedWidth <= 0 && getWidth() > 0) {
            this.expandedWidth = getWidth();
        }
        this.isCollapsedToPlusOnly = true;
        Integer valueOf = Integer.valueOf(this.plusButton.getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        Integer valueOf2 = Integer.valueOf(valueOf != null ? valueOf.intValue() : this.plusButton.getMeasuredWidth());
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        if (animated && getWidth() != 0 && num != null) {
            animateWidthChange(getWidth(), num.intValue(), new CartPickerView$collapseToPlusOnly$3(onFinished));
            return;
        }
        this.minusButton.setVisibility(8);
        this.quantityText.setVisibility(8);
        this.subtitleText.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = num != null ? num.intValue() : -2;
        setLayoutParams(bVar);
        onFinished.invoke();
    }

    public final void expandFromPlusOnly(boolean animated, @NotNull Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        if (animated && !this.isCollapsedToPlusOnly) {
            onFinished.invoke();
            return;
        }
        this.isCollapsedToPlusOnly = false;
        Integer valueOf = Integer.valueOf(this.expandedWidth);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : -2;
        int width = getWidth() > 0 ? getWidth() : intValue;
        this.minusButton.setVisibility(0);
        this.quantityText.setVisibility(0);
        TextAtomV2View textAtomV2View = this.subtitleText;
        CartPickerVO cartPickerVO = this.currentVO;
        textAtomV2View.setVisibility((cartPickerVO != null ? cartPickerVO.getSubtitle() : null) != null ? 0 : 8);
        if (animated && width != 0) {
            animateWidthChange(width, intValue, new CartPickerView$expandFromPlusOnly$3(onFinished));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = intValue;
        setLayoutParams(bVar);
        this.minusButton.setAlpha(1.0f);
        this.quantityText.setAlpha(1.0f);
        this.subtitleText.setAlpha(1.0f);
        onFinished.invoke();
    }

    public final void setShouldAnimate(boolean z11) {
        this.shouldAnimate = z11;
    }

    public final void updateCollapsedStateByQuantity(int quantity, int minValue, boolean animated, @NotNull Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        if (quantity == 0) {
            this.quantityText.setText(String.valueOf(minValue));
            collapseToPlusOnly(animated, onFinished);
        } else {
            this.quantityText.setText(String.valueOf(quantity));
            expandFromPlusOnly(animated, onFinished);
        }
    }

    public /* synthetic */ CartPickerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartPickerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        int i14 = 0;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i13, i14, i12, defaultConstructorMarker);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.cpMinus, -2, -2);
        c11.f41636i = 0;
        c11.f41642l = 0;
        c11.f41628e = 0;
        c11.f41598E = 0.0f;
        iconButtonV3View.setLayoutParams(c11);
        addView(iconButtonV3View);
        this.minusButton = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, attributeSet2, i13, i14, i12, defaultConstructorMarker);
        ConstraintLayout.b c12 = d.c(iconButtonV3View2, R$id.cpPlus, -2, -2);
        c12.f41636i = 0;
        c12.f41642l = 0;
        c12.f41634h = 0;
        c12.f41598E = 1.0f;
        iconButtonV3View2.setLayoutParams(c12);
        addView(iconButtonV3View2);
        this.plusButton = iconButtonV3View2;
        int i15 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i13, i15, defaultConstructorMarker2);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.cpQuantity, 0, -2);
        d11.f41636i = 0;
        d11.f41630f = iconButtonV3View.getId();
        d11.f41632g = iconButtonV3View2.getId();
        int i16 = defaultMargin;
        ((ViewGroup.MarginLayoutParams) d11).rightMargin = i16;
        ((ViewGroup.MarginLayoutParams) d11).leftMargin = i16;
        d11.f41598E = 0.5f;
        d11.f41604K = 2;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.quantityText = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i13, i15, defaultConstructorMarker2);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.cpSubtitle, 0, -2);
        d12.f41642l = 0;
        d12.f41630f = iconButtonV3View.getId();
        d12.f41632g = iconButtonV3View2.getId();
        ((ViewGroup.MarginLayoutParams) d12).rightMargin = i16;
        ((ViewGroup.MarginLayoutParams) d12).leftMargin = i16;
        d12.f41598E = 0.5f;
        textAtomV2View2.setLayoutParams(d12);
        TextViewExtKt.setTextCopyable(textAtomV2View2, false);
        addView(textAtomV2View2);
        this.subtitleText = textAtomV2View2;
        this.backgroundDrawable = LazyUtilsKt.unsafeLazy(new CartPickerView$backgroundDrawable$2(context));
        this.plusBackgroundDrawable = LazyUtilsKt.unsafeLazy(new CartPickerView$plusBackgroundDrawable$2(context));
        this.minusBackgroundDrawable = LazyUtilsKt.unsafeLazy(new CartPickerView$minusBackgroundDrawable$2(context));
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41640k = textAtomV2View2.getId();
            textAtomV2View.setLayoutParams(bVar);
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View2.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                bVar2.f41638j = textAtomV2View.getId();
                textAtomV2View2.setLayoutParams(bVar2);
                setLayoutParams(new ConstraintLayout.b(-2, -2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
