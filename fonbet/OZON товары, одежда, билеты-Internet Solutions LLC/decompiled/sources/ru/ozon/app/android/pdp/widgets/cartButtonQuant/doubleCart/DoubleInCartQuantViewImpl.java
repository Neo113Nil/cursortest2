package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import Dy.ViewOnClickListenerC2883a;
import En.ViewOnClickListenerC2972a;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.PdpCartbuttonQuantInCartBinding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.QuantDtoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
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
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001f\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R2\u0010)\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00101\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u00020\u0014\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R2\u00107\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R2\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R)\u0010J\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010,R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010H\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010P¨\u0006U"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleInCartQuantViewImpl;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;", "button", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "vo", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "firstData", "secondData", "", "bindMainButton", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;", "quantity", "freeRest", "multiplicity", "", "backgroundColor", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "mode", "bindMinusPlus", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;IIILjava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)V", "", "isEnabled", "bindPlus", "(Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)V", "Lkotlin/Function1;", "onAddToCartClick", "Lkotlin/jvm/functions/Function1;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function1;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAddToCartClickRecommendation", "Lfd/n;", "getOnAddToCartClickRecommendation", "()Lfd/n;", "setOnAddToCartClickRecommendation", "(Lfd/n;)V", "onMinusCartClick", "getOnMinusCartClick", "setOnMinusCartClick", "onPlusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "showinfoDigitalModal", "getShowinfoDigitalModal", "setShowinfoDigitalModal", "onAction$delegate", "LSc/j;", "getOnAction", "onAction", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonQuantInCartBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonQuantInCartBinding;", "iconTintEnable$delegate", "getIconTintEnable", "()I", "iconTintEnable", "iconTintDisable$delegate", "getIconTintDisable", "iconTintDisable", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleInCartQuantViewImpl extends LinearLayout implements DoubleCartQuantView {
    private ActionHandler.Builder actionHandlerBuilder;

    @NotNull
    private final PdpCartbuttonQuantInCartBinding binding;

    /* renamed from: iconTintDisable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintDisable;

    /* renamed from: iconTintEnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintEnable;

    /* renamed from: onAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onAction;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onAddToCartClick;
    private InterfaceC6511n<? super DoubleCartQuantVO.CartMode, ? super String, ? super AtomAction, Unit> onAddToCartClickRecommendation;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onMinusCartClick;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onPlusCartClick;
    private Function1<? super String, Unit> showinfoDigitalModal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleCartQuantVO.CartMode.values().length];
            try {
                iArr[DoubleCartQuantVO.CartMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleCartQuantVO.CartMode.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DoubleInCartQuantViewImpl(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindMainButton(CartButtonQuantDto.CartButton button, CartButtonQuantDto.CartButtonStyle style, CartQuantVO vo, OzonSpannableString firstData, OzonSpannableString secondData) {
        OzonSpannableString appendQuant;
        OzonSpannableString quantData;
        PdpCartbuttonQuantInCartBinding pdpCartbuttonQuantInCartBinding = this.binding;
        CartButtonQuant cartButtonQuant = pdpCartbuttonQuantInCartBinding.mainBtn;
        Context context = pdpCartbuttonQuantInCartBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appendQuant = DoubleInCartQuantViewImplKt.appendQuant(button.getButton().getText(), vo);
        quantData = DoubleInCartQuantViewImplKt.quantData(vo, firstData, secondData);
        cartButtonQuant.setViewState(QuantDtoMappersKt.toCartButtonViewState$default(button, context, style, null, true, false, appendQuant, quantData, 4, null));
        this.binding.mainBtn.setOnClickListener(new a(4, button, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMainButton$lambda$1(CartButtonQuantDto.CartButton cartButton, DoubleInCartQuantViewImpl doubleInCartQuantViewImpl, View view) {
        AtomAction atomAction;
        Function1<AtomAction, Unit> onAction;
        ButtonV3Atom.LargeButton button = cartButton.getButton();
        AtomActionDTO action = button.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, button.getTrackingInfo())) == null || (onAction = doubleInCartQuantViewImpl.getOnAction()) == null) {
            return;
        }
        onAction.invoke(atomAction);
    }

    private final void bindMinusPlus(CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus button, int quantity, int freeRest, int multiplicity, String backgroundColor, DoubleCartQuantVO.CartMode mode) {
        PdpCartbuttonQuantInCartBinding pdpCartbuttonQuantInCartBinding = this.binding;
        View constraintLayout = pdpCartbuttonQuantInCartBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
        LinearLayoutCompat plusMinuSLl = pdpCartbuttonQuantInCartBinding.plusMinuSLl;
        Intrinsics.checkNotNullExpressionValue(plusMinuSLl, "plusMinuSLl");
        ViewExtKt.show(plusMinuSLl);
        TextAtom placeholder = button.getPlaceholder();
        TextDTO cartButtonQuantityPlaceholder = ExtKt.toCartButtonQuantityPlaceholder(placeholder != null ? TextMapperKt.dsTextAtom$default(placeholder, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, false, 4093, null) : null, quantity);
        TextAtomV2View quantityTav = pdpCartbuttonQuantInCartBinding.quantityTav;
        Intrinsics.checkNotNullExpressionValue(quantityTav, "quantityTav");
        TextHolderKt.bind$default(quantityTav, cartButtonQuantityPlaceholder, null, 2, null);
        bindPlus(quantity + multiplicity <= freeRest);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColor, R$color.layer_floor_0);
        LinearLayoutCompat plusMinuSLl2 = pdpCartbuttonQuantInCartBinding.plusMinuSLl;
        Intrinsics.checkNotNullExpressionValue(plusMinuSLl2, "plusMinuSLl");
        ViewExtKt.setBackgroundTint(plusMinuSLl2, parseColor);
        pdpCartbuttonQuantInCartBinding.minusIb.setOnClickListener(new ViewOnClickListenerC2883a(10, this, mode));
        pdpCartbuttonQuantInCartBinding.plusIb.setOnClickListener(new ViewOnClickListenerC2972a(3, this, mode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$4$lambda$2(DoubleInCartQuantViewImpl doubleInCartQuantViewImpl, DoubleCartQuantVO.CartMode cartMode, View view) {
        Function1<DoubleCartQuantVO.CartMode, Unit> onMinusCartClick = doubleInCartQuantViewImpl.getOnMinusCartClick();
        if (onMinusCartClick != null) {
            onMinusCartClick.invoke(cartMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$4$lambda$3(DoubleInCartQuantViewImpl doubleInCartQuantViewImpl, DoubleCartQuantVO.CartMode cartMode, View view) {
        Function1<DoubleCartQuantVO.CartMode, Unit> onPlusCartClick = doubleInCartQuantViewImpl.getOnPlusCartClick();
        if (onPlusCartClick != null) {
            onPlusCartClick.invoke(cartMode);
        }
    }

    private final void bindPlus(boolean isEnabled) {
        PdpCartbuttonQuantInCartBinding pdpCartbuttonQuantInCartBinding = this.binding;
        pdpCartbuttonQuantInCartBinding.plusIb.setEnabled(isEnabled);
        ImageButton plusIb = pdpCartbuttonQuantInCartBinding.plusIb;
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

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void bind(@NotNull DoubleCartQuantVO vo) {
        CartQuantVO firstCartData;
        Intrinsics.checkNotNullParameter(vo, "vo");
        int i11 = WhenMappings.$EnumSwitchMapping$0[vo.getMode().ordinal()];
        if (i11 == 1) {
            firstCartData = vo.getFirstCartData();
        } else if (i11 != 2) {
            return;
        } else {
            firstCartData = vo.getSecondCartData();
        }
        CartQuantVO cartQuantVO = firstCartData;
        CartButtonQuantDto.CartButton buttonWithIcon = cartQuantVO.getInCart().getButtonWithIcon();
        CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton = cartQuantVO.getInCart().getAdditionalButton();
        Object button = additionalButton != null ? additionalButton.getButton() : null;
        CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus minusPlus = button instanceof CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus ? (CartButtonQuantDto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus) button : null;
        if (minusPlus == null) {
            return;
        }
        bindMainButton(buttonWithIcon, vo.getStyle(), cartQuantVO, vo.getFirstCartData().getInCart().getButtonWithIcon().getButton().getSubtext(), vo.getSecondCartData().getInCart().getButtonWithIcon().getButton().getSubtext());
        int quantity = cartQuantVO.getQuantity();
        int freeRest = cartQuantVO.getFreeRest();
        Integer multiplicityValue = cartQuantVO.getMultiplicityValue();
        bindMinusPlus(minusPlus, quantity, freeRest, multiplicityValue != null ? multiplicityValue.intValue() : 1, minusPlus.getBackgroundColor(), vo.getMode());
        ViewExtKt.updatePadding$default(this, 0, vo.hasBadge() ? Dimens.INSTANCE.getDP_4() : 0, 0, 0, 13, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public ActionHandler.Builder getActionHandlerBuilder() {
        return this.actionHandlerBuilder;
    }

    public Function1<DoubleCartQuantVO.CartMode, Unit> getOnMinusCartClick() {
        return this.onMinusCartClick;
    }

    public Function1<DoubleCartQuantVO.CartMode, Unit> getOnPlusCartClick() {
        return this.onPlusCartClick;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setActionHandlerBuilder(ActionHandler.Builder builder) {
        this.actionHandlerBuilder = builder;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setOnAddToCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1) {
        this.onAddToCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setOnAddToCartClickRecommendation(InterfaceC6511n<? super DoubleCartQuantVO.CartMode, ? super String, ? super AtomAction, Unit> interfaceC6511n) {
        this.onAddToCartClickRecommendation = interfaceC6511n;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setOnMinusCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1) {
        this.onMinusCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setOnPlusCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1) {
        this.onPlusCartClick = function1;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setShowinfoDigitalModal(Function1<? super String, Unit> function1) {
        this.showinfoDigitalModal = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleInCartQuantViewImpl(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onAction = DelegatesKt.lazyUnsafe(new DoubleInCartQuantViewImpl$onAction$2(this));
        PdpCartbuttonQuantInCartBinding inflate = PdpCartbuttonQuantInCartBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.iconTintEnable = DelegatesKt.lazyUnsafe(new DoubleInCartQuantViewImpl$iconTintEnable$2(context));
        this.iconTintDisable = DelegatesKt.lazyUnsafe(new DoubleInCartQuantViewImpl$iconTintDisable$2(context));
        setId(R$id.cartBtn);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        inflate.getConstraintLayout().setClickable(true);
    }
}
