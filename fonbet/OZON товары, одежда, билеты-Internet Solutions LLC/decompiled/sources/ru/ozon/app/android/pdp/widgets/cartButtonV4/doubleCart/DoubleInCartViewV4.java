package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import En.ViewOnClickListenerC2972a;
import Fs.ViewOnClickListenerC3059a;
import LB.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.PdpCartbuttonInCartV4Binding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.DtoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R2\u0010%\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*RB\u0010-\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R2\u00103\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R2\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R$\u0010:\u001a\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R*\u0010D\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR)\u0010M\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010(R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010SR\u001b\u0010W\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010S¨\u0006X"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "button", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "style", "bindMainButton", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;", "quantity", "freeRest", "multiplicity", "", "backgroundColor", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "bindMinusPlus", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;IIILjava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "", "isEnabled", "bindPlus", "(Z)V", "Lkotlin/Function1;", "onAddToCartClick", "Lkotlin/jvm/functions/Function1;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function1;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAddToCartClickRecommendation", "Lfd/n;", "getOnAddToCartClickRecommendation", "()Lfd/n;", "setOnAddToCartClickRecommendation", "(Lfd/n;)V", "onMinusCartClick", "getOnMinusCartClick", "setOnMinusCartClick", "onPlusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "showinfoDigitalModal", "getShowinfoDigitalModal", "setShowinfoDigitalModal", "Lkotlin/Function0;", "onAddToCartClickRelatedProducts", "Lkotlin/jvm/functions/Function0;", "getOnAddToCartClickRelatedProducts", "()Lkotlin/jvm/functions/Function0;", "setOnAddToCartClickRelatedProducts", "(Lkotlin/jvm/functions/Function0;)V", "onAction$delegate", "LSc/j;", "getOnAction", "onAction", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartV4Binding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartV4Binding;", "iconTintEnable$delegate", "getIconTintEnable", "()I", "iconTintEnable", "iconTintDisable$delegate", "getIconTintDisable", "iconTintDisable", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleInCartViewV4 extends LinearLayout implements DoubleCartView {
    private ActionHandler.Builder actionHandlerBuilder;

    @NotNull
    private final PdpCartbuttonInCartV4Binding binding;

    /* renamed from: iconTintDisable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintDisable;

    /* renamed from: iconTintEnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintEnable;

    /* renamed from: onAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onAction;
    private Function1<? super DoubleCartVO.CartMode, Unit> onAddToCartClick;
    private InterfaceC6511n<? super DoubleCartVO.CartMode, ? super String, ? super AtomAction, Unit> onAddToCartClickRecommendation;
    private Function0<Unit> onAddToCartClickRelatedProducts;
    private Function1<? super DoubleCartVO.CartMode, Unit> onMinusCartClick;
    private Function1<? super DoubleCartVO.CartMode, Unit> onPlusCartClick;
    private Function1<? super String, Unit> showinfoDigitalModal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleCartVO.CartMode.values().length];
            try {
                iArr[DoubleCartVO.CartMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleCartVO.CartMode.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DoubleInCartViewV4(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindMainButton(CartButtonV4Dto.CartButton button, CartButtonV4Dto.CartButtonStyle style) {
        PdpCartbuttonInCartV4Binding pdpCartbuttonInCartV4Binding = this.binding;
        CartButton cartButton = pdpCartbuttonInCartV4Binding.mainBtn;
        Context context = pdpCartbuttonInCartV4Binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cartButton.setViewState(DtoMappersKt.toCartButtonViewState$default(button, context, style, null, true, 4, null));
        this.binding.mainBtn.setOnClickListener(new ViewOnClickListenerC3059a(4, button, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMainButton$lambda$1(CartButtonV4Dto.CartButton cartButton, DoubleInCartViewV4 doubleInCartViewV4, View view) {
        AtomAction atomAction;
        Function1<AtomAction, Unit> onAction;
        ButtonV3Atom.LargeButton button = cartButton.getButton();
        AtomActionDTO action = button.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, button.getTrackingInfo())) == null || (onAction = doubleInCartViewV4.getOnAction()) == null) {
            return;
        }
        onAction.invoke(atomAction);
    }

    private final void bindMinusPlus(CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus button, int quantity, int freeRest, int multiplicity, String backgroundColor, DoubleCartVO.CartMode mode) {
        PdpCartbuttonInCartV4Binding pdpCartbuttonInCartV4Binding = this.binding;
        View constraintLayout = pdpCartbuttonInCartV4Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
        LinearLayoutCompat plusMinuSLl = pdpCartbuttonInCartV4Binding.plusMinuSLl;
        Intrinsics.checkNotNullExpressionValue(plusMinuSLl, "plusMinuSLl");
        ViewExtKt.show(plusMinuSLl);
        TextAtom placeholder = button.getPlaceholder();
        TextDTO cartButtonQuantityPlaceholder = ExtKt.toCartButtonQuantityPlaceholder(placeholder != null ? TextMapperKt.dsTextAtom$default(placeholder, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, false, 4093, null) : null, quantity);
        TextAtomV2View quantityTav = pdpCartbuttonInCartV4Binding.quantityTav;
        Intrinsics.checkNotNullExpressionValue(quantityTav, "quantityTav");
        TextHolderKt.bind$default(quantityTav, cartButtonQuantityPlaceholder, null, 2, null);
        bindPlus(quantity + multiplicity <= freeRest);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColor, R$color.layer_floor_0);
        LinearLayoutCompat plusMinuSLl2 = pdpCartbuttonInCartV4Binding.plusMinuSLl;
        Intrinsics.checkNotNullExpressionValue(plusMinuSLl2, "plusMinuSLl");
        ViewExtKt.setBackgroundTint(plusMinuSLl2, parseColor);
        pdpCartbuttonInCartV4Binding.minusIb.setOnClickListener(new ViewOnClickListenerC2972a(5, this, mode));
        pdpCartbuttonInCartV4Binding.plusIb.setOnClickListener(new a(5, this, mode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$4$lambda$2(DoubleInCartViewV4 doubleInCartViewV4, DoubleCartVO.CartMode cartMode, View view) {
        Function1<DoubleCartVO.CartMode, Unit> onMinusCartClick = doubleInCartViewV4.getOnMinusCartClick();
        if (onMinusCartClick != null) {
            onMinusCartClick.invoke(cartMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$4$lambda$3(DoubleInCartViewV4 doubleInCartViewV4, DoubleCartVO.CartMode cartMode, View view) {
        Function1<DoubleCartVO.CartMode, Unit> onPlusCartClick = doubleInCartViewV4.getOnPlusCartClick();
        if (onPlusCartClick != null) {
            onPlusCartClick.invoke(cartMode);
        }
    }

    private final void bindPlus(boolean isEnabled) {
        PdpCartbuttonInCartV4Binding pdpCartbuttonInCartV4Binding = this.binding;
        pdpCartbuttonInCartV4Binding.plusIb.setEnabled(isEnabled);
        ImageButton plusIb = pdpCartbuttonInCartV4Binding.plusIb;
        Intrinsics.checkNotNullExpressionValue(plusIb, "plusIb");
        ThemeExtKt.tint(plusIb, Integer.valueOf(isEnabled ? getIconTintEnable() : getIconTintDisable()));
    }

    private final int getIconTintDisable() {
        return ((Number) this.iconTintDisable.getValue()).intValue();
    }

    private final int getIconTintEnable() {
        return ((Number) this.iconTintEnable.getValue()).intValue();
    }

    private final Function1<AtomAction, Unit> getOnAction() {
        return (Function1) this.onAction.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void bind(@NotNull DoubleCartVO vo) {
        CartVO firstCartData;
        Intrinsics.checkNotNullParameter(vo, "vo");
        int i11 = WhenMappings.$EnumSwitchMapping$0[vo.getMode().ordinal()];
        if (i11 == 1) {
            firstCartData = vo.getFirstCartData();
        } else if (i11 != 2) {
            return;
        } else {
            firstCartData = vo.getSecondCartData();
        }
        CartButtonV4Dto.CartButton buttonWithIcon = firstCartData.getInCart().getButtonWithIcon();
        CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton = firstCartData.getInCart().getAdditionalButton();
        Object button = additionalButton != null ? additionalButton.getButton() : null;
        CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus minusPlus = button instanceof CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus ? (CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus) button : null;
        if (minusPlus == null) {
            return;
        }
        bindMainButton(buttonWithIcon, vo.getStyle());
        int quantity = firstCartData.getQuantity();
        int freeRest = firstCartData.getFreeRest();
        Integer multiplicityValue = firstCartData.getMultiplicityValue();
        bindMinusPlus(minusPlus, quantity, freeRest, multiplicityValue != null ? multiplicityValue.intValue() : 1, minusPlus.getBackgroundColor(), vo.getMode());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public ActionHandler.Builder getActionHandlerBuilder() {
        return this.actionHandlerBuilder;
    }

    public Function1<DoubleCartVO.CartMode, Unit> getOnMinusCartClick() {
        return this.onMinusCartClick;
    }

    public Function1<DoubleCartVO.CartMode, Unit> getOnPlusCartClick() {
        return this.onPlusCartClick;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setActionHandlerBuilder(ActionHandler.Builder builder) {
        this.actionHandlerBuilder = builder;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setOnAddToCartClick(Function1<? super DoubleCartVO.CartMode, Unit> function1) {
        this.onAddToCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setOnAddToCartClickRecommendation(InterfaceC6511n<? super DoubleCartVO.CartMode, ? super String, ? super AtomAction, Unit> interfaceC6511n) {
        this.onAddToCartClickRecommendation = interfaceC6511n;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setOnAddToCartClickRelatedProducts(Function0<Unit> function0) {
        this.onAddToCartClickRelatedProducts = function0;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setOnMinusCartClick(Function1<? super DoubleCartVO.CartMode, Unit> function1) {
        this.onMinusCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setOnPlusCartClick(Function1<? super DoubleCartVO.CartMode, Unit> function1) {
        this.onPlusCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setShowinfoDigitalModal(Function1<? super String, Unit> function1) {
        this.showinfoDigitalModal = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleInCartViewV4(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onAction = DelegatesKt.lazyUnsafe(new DoubleInCartViewV4$onAction$2(this));
        PdpCartbuttonInCartV4Binding inflate = PdpCartbuttonInCartV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.iconTintEnable = DelegatesKt.lazyUnsafe(new DoubleInCartViewV4$iconTintEnable$2(context));
        this.iconTintDisable = DelegatesKt.lazyUnsafe(new DoubleInCartViewV4$iconTintDisable$2(this, context));
        setId(R$id.cartBtn);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        inflate.getConstraintLayout().setClickable(true);
    }
}
