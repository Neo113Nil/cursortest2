package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import Al.ViewOnClickListenerC2437a;
import BE.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.PdpCartbuttonInCartPlusMinusV4Binding;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonCartV4Binding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.DtoMappersKt;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010$\u001a\u00020\u000f*\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u000f*\u00020\u001d2\u0006\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R:\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u000f\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010=\u001a\u0004\u0018\u00010<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f\u0018\u00010C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u00106\"\u0004\bL\u00108R \u0010M\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010U\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010X\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010TR\u001f\u0010[\u001a\r\u0012\t\u0012\u00070\u001d¢\u0006\u0002\bZ0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010RR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010RR\u001b\u0010b\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b^\u0010_*\u0004\b`\u0010aR\u001b\u0010f\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bc\u0010d*\u0004\be\u0010a¨\u0006g"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewV4;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isVibration", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "button", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "style", "isInCart", "bindMainButton", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Z)V", "", "additionalButtons", "bindAdditionalButtons", "(Ljava/lang/Object;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)V", "Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartPlusMinusV4Binding;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;", "quantity", "freeRest", "multiplicity", "", "backgroundColor", "bindMinusPlus", "(Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartPlusMinusV4Binding;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons$AdditionalButtonDTO$MinusPlus;IIILjava/lang/String;)V", "isEnabled", "bindPlus", "(Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartPlusMinusV4Binding;Z)V", "Z", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAddToCartClick", "Lkotlin/jvm/functions/Function2;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function2;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onMinusCartClick", "Lkotlin/jvm/functions/Function0;", "getOnMinusCartClick", "()Lkotlin/jvm/functions/Function0;", "setOnMinusCartClick", "(Lkotlin/jvm/functions/Function0;)V", "onPlusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "Lkotlin/Function1;", "showinfoDigitalModal", "Lkotlin/jvm/functions/Function1;", "getShowinfoDigitalModal", "()Lkotlin/jvm/functions/Function1;", "setShowinfoDigitalModal", "(Lkotlin/jvm/functions/Function1;)V", "onAddToCartClickRelatedProducts", "getOnAddToCartClickRelatedProducts", "setOnAddToCartClickRelatedProducts", "onAction", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonCartV4Binding;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonCartV4Binding;", "iconTintEnable$delegate", "LSc/j;", "getIconTintEnable", "()I", "iconTintEnable", "iconTintDisable$delegate", "getIconTintDisable", "iconTintDisable", "LSc/j;", "Lkotlin/jvm/internal/EnhancedNullability;", "plusMinusButtonLazy", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "iconButtonLazy", "getPlusMinusButtonBinding", "()Lru/ozon/app/android/pdp/databinding/PdpCartbuttonInCartPlusMinusV4Binding;", "getPlusMinusButtonBinding$delegate", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewV4;)Ljava/lang/Object;", "plusMinusButtonBinding", "getIconButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getIconButtonView$delegate", "iconButtonView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartViewV4 extends LinearLayout implements CartView {
    private ActionHandler.Builder actionHandlerBuilder;

    @NotNull
    private final WidgetCartbuttonCartV4Binding binding;

    @NotNull
    private final InterfaceC4008j<SmallIconButtonView> iconButtonLazy;

    /* renamed from: iconTintDisable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintDisable;

    /* renamed from: iconTintEnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconTintEnable;
    private final boolean isVibration;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private Function2<? super String, ? super AtomAction, Unit> onAddToCartClick;
    private Function0<Unit> onAddToCartClickRelatedProducts;
    private Function0<Unit> onMinusCartClick;
    private Function0<Unit> onPlusCartClick;

    @NotNull
    private final InterfaceC4008j<PdpCartbuttonInCartPlusMinusV4Binding> plusMinusButtonLazy;
    private Function1<? super String, Unit> showinfoDigitalModal;

    public /* synthetic */ CartViewV4(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z11);
    }

    private final void bindAdditionalButtons(Object additionalButtons, boolean isInCart, CartVO vo) {
        if ((additionalButtons instanceof CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus) && isInCart) {
            if (this.iconButtonLazy.isInitialized()) {
                ViewExtKt.gone(getIconButtonView());
            }
            PdpCartbuttonInCartPlusMinusV4Binding plusMinusButtonBinding = getPlusMinusButtonBinding();
            CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus minusPlus = (CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus) additionalButtons;
            int quantity = vo.getQuantity();
            int freeRest = vo.getFreeRest();
            Integer multiplicityValue = vo.getMultiplicityValue();
            bindMinusPlus(plusMinusButtonBinding, minusPlus, quantity, freeRest, multiplicityValue != null ? multiplicityValue.intValue() : 1, minusPlus.getBackgroundColor());
            return;
        }
        if (additionalButtons instanceof ButtonV3Atom.SmallIconButton) {
            if (this.plusMinusButtonLazy.isInitialized()) {
                LinearLayoutCompat constraintLayout = getPlusMinusButtonBinding().getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewExtKt.gone(constraintLayout);
            }
            WrappedIconButtonHolderKt.bind(getIconButtonView(), (ButtonV3Atom.SmallIconButton) additionalButtons, this.onAction);
            return;
        }
        if (this.iconButtonLazy.isInitialized()) {
            ViewExtKt.gone(getIconButtonView());
        }
        if (this.plusMinusButtonLazy.isInitialized()) {
            LinearLayoutCompat constraintLayout2 = getPlusMinusButtonBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.gone(constraintLayout2);
        }
    }

    private final void bindMainButton(CartButtonV4Dto.CartButton button, CartButtonV4Dto.CartButtonStyle style, boolean isInCart) {
        WidgetCartbuttonCartV4Binding widgetCartbuttonCartV4Binding = this.binding;
        CartButton cartButton = widgetCartbuttonCartV4Binding.mainBtn;
        Context context = widgetCartbuttonCartV4Binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cartButton.setViewState(DtoMappersKt.toCartButtonViewState$default(button, context, style, null, isInCart, 4, null));
        this.binding.mainBtn.setEnabled(button.getButton().getAction() != null);
        this.binding.mainBtn.setOnClickListener(new a(3, button, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMainButton$lambda$2(CartButtonV4Dto.CartButton cartButton, CartViewV4 cartViewV4, View view) {
        AtomAction atomAction;
        AtomActionDTO action = cartButton.getButton().getAction();
        if (Intrinsics.d(action != null ? action.getId() : null, "addToCart") && cartViewV4.isVibration) {
            VibrationExtKt.vibrateSingle(cartViewV4);
        }
        ButtonV3Atom.LargeButton button = cartButton.getButton();
        AtomActionDTO action2 = button.getAction();
        if (action2 == null || (atomAction = AtomActionMapperKt.toAtomAction(action2, button.getTrackingInfo())) == null) {
            return;
        }
        cartViewV4.onAction.invoke(atomAction);
    }

    private final void bindMinusPlus(PdpCartbuttonInCartPlusMinusV4Binding pdpCartbuttonInCartPlusMinusV4Binding, CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO.MinusPlus minusPlus, int i11, int i12, int i13, String str) {
        LinearLayoutCompat constraintLayout = pdpCartbuttonInCartPlusMinusV4Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
        TextAtom placeholder = minusPlus.getPlaceholder();
        TextDTO cartButtonQuantityPlaceholder = ExtKt.toCartButtonQuantityPlaceholder(placeholder != null ? TextMapperKt.dsTextAtom$default(placeholder, null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, false, 4093, null) : null, i11);
        TextAtomV2View quantityTav = pdpCartbuttonInCartPlusMinusV4Binding.quantityTav;
        Intrinsics.checkNotNullExpressionValue(quantityTav, "quantityTav");
        TextHolderKt.bind$default(quantityTav, cartButtonQuantityPlaceholder, null, 2, null);
        bindPlus(pdpCartbuttonInCartPlusMinusV4Binding, i11 + i13 <= i12);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, str, R$color.layer_floor_0);
        LinearLayoutCompat constraintLayout2 = pdpCartbuttonInCartPlusMinusV4Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewExtKt.setBackgroundTint(constraintLayout2, parseColor);
        pdpCartbuttonInCartPlusMinusV4Binding.minusIb.setOnClickListener(new BC.a(this, 11));
        pdpCartbuttonInCartPlusMinusV4Binding.plusIb.setOnClickListener(new ViewOnClickListenerC2437a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$3(CartViewV4 cartViewV4, View view) {
        Function0<Unit> onMinusCartClick = cartViewV4.getOnMinusCartClick();
        if (onMinusCartClick != null) {
            onMinusCartClick.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMinusPlus$lambda$4(CartViewV4 cartViewV4, View view) {
        Function0<Unit> onPlusCartClick = cartViewV4.getOnPlusCartClick();
        if (onPlusCartClick != null) {
            onPlusCartClick.invoke();
        }
    }

    private final void bindPlus(PdpCartbuttonInCartPlusMinusV4Binding pdpCartbuttonInCartPlusMinusV4Binding, boolean z11) {
        pdpCartbuttonInCartPlusMinusV4Binding.plusIb.setEnabled(z11);
        ImageButton plusIb = pdpCartbuttonInCartPlusMinusV4Binding.plusIb;
        Intrinsics.checkNotNullExpressionValue(plusIb, "plusIb");
        ThemeExtKt.tint(plusIb, Integer.valueOf(z11 ? getIconTintEnable() : getIconTintDisable()));
    }

    private final SmallIconButtonView getIconButtonView() {
        return this.iconButtonLazy.getValue();
    }

    private final int getIconTintDisable() {
        return ((Number) this.iconTintDisable.getValue()).intValue();
    }

    private final int getIconTintEnable() {
        return ((Number) this.iconTintEnable.getValue()).intValue();
    }

    private final PdpCartbuttonInCartPlusMinusV4Binding getPlusMinusButtonBinding() {
        return this.plusMinusButtonLazy.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void bind(@NotNull CartVO vo) {
        CartButtonV4Dto.Configuration.CartData.Buttons.AdditionalButtonDTO additionalButton;
        Intrinsics.checkNotNullParameter(vo, "vo");
        ButtonV3Atom.LargeButton mainButton = ExtKt.mainButton(vo.getInCart());
        boolean isInCart = vo.getIsInCart();
        CartButtonV4Dto.CartButton buttonWithIcon = (isInCart ? vo.getInCart() : vo.getToCart()).getButtonWithIcon();
        Object obj = null;
        if (!isInCart ? (additionalButton = vo.getToCart().getAdditionalButton()) != null : (additionalButton = vo.getInCart().getAdditionalButton()) != null) {
            obj = additionalButton.getButton();
        }
        if (ExtKt.getSelectedDeliverySchema(ExtKt.mainButton(vo.getToCart())) != null && mainButton.getTheme() != ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_GREEN) {
            bindMainButton(buttonWithIcon, vo.getStyle(), isInCart);
            CartButton mainBtn = this.binding.mainBtn;
            Intrinsics.checkNotNullExpressionValue(mainBtn, "mainBtn");
            ViewExtKt.disable(mainBtn);
            return;
        }
        CartButton mainBtn2 = this.binding.mainBtn;
        Intrinsics.checkNotNullExpressionValue(mainBtn2, "mainBtn");
        ViewExtKt.enable(mainBtn2);
        bindMainButton(buttonWithIcon, vo.getStyle(), isInCart);
        bindAdditionalButtons(obj, isInCart, vo);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public ActionHandler.Builder getActionHandlerBuilder() {
        return this.actionHandlerBuilder;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public Function2<String, AtomAction, Unit> getOnAddToCartClick() {
        return this.onAddToCartClick;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public Function0<Unit> getOnAddToCartClickRelatedProducts() {
        return this.onAddToCartClickRelatedProducts;
    }

    public Function0<Unit> getOnMinusCartClick() {
        return this.onMinusCartClick;
    }

    public Function0<Unit> getOnPlusCartClick() {
        return this.onPlusCartClick;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public Function1<String, Unit> getShowinfoDigitalModal() {
        return this.showinfoDigitalModal;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void setActionHandlerBuilder(ActionHandler.Builder builder) {
        this.actionHandlerBuilder = builder;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void setOnAddToCartClick(Function2<? super String, ? super AtomAction, Unit> function2) {
        this.onAddToCartClick = function2;
    }

    public void setOnAddToCartClickRelatedProducts(Function0<Unit> function0) {
        this.onAddToCartClickRelatedProducts = function0;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void setOnMinusCartClick(Function0<Unit> function0) {
        this.onMinusCartClick = function0;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void setOnPlusCartClick(Function0<Unit> function0) {
        this.onPlusCartClick = function0;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView
    public void setShowinfoDigitalModal(Function1<? super String, Unit> function1) {
        this.showinfoDigitalModal = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewV4(@NotNull Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVibration = z11;
        this.onAction = new CartButtonActionHandler(this);
        WidgetCartbuttonCartV4Binding inflate = WidgetCartbuttonCartV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.iconTintEnable = DelegatesKt.lazyUnsafe(new CartViewV4$iconTintEnable$2(context));
        this.iconTintDisable = DelegatesKt.lazyUnsafe(new CartViewV4$iconTintDisable$2(this, context));
        this.plusMinusButtonLazy = DelegatesKt.lazyUnsafe(new CartViewV4$plusMinusButtonLazy$1(this));
        this.iconButtonLazy = DelegatesKt.lazyUnsafe(new CartViewV4$iconButtonLazy$1(context, this));
        setId(R$id.cartBtn);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(this, dimens.getDP_16(), 0, dimens.getDP_16(), 0, 10, null);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        inflate.getConstraintLayout().setClickable(true);
    }
}
