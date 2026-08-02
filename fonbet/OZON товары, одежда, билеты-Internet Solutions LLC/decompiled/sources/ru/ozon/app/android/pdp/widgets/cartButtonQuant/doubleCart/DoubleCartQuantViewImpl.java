package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonQuantDoublecartBinding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuant;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.QuantDtoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0017\u001a\u00020\u0016*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0017\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R2\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'RB\u0010+\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u0016\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R2\u00101\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R2\u00104\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R$\u00108\u001a\u0004\u0018\u0001078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0016\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR)\u0010R\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0016\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010%¨\u0006S"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewImpl;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isVibration", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;", "dto", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "cartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "isInCart", "isAutomaticAnimation", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;ZZ)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "resolveClickAction", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "vo", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)V", "Z", "Lkotlin/Function1;", "onAddToCartClick", "Lkotlin/jvm/functions/Function1;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function1;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "onAddToCartClickRecommendation", "Lfd/n;", "getOnAddToCartClickRecommendation", "()Lfd/n;", "setOnAddToCartClickRecommendation", "(Lfd/n;)V", "onMinusCartClick", "getOnMinusCartClick", "setOnMinusCartClick", "onPlusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "recommendationDeeplink", "Ljava/lang/String;", "getRecommendationDeeplink", "()Ljava/lang/String;", "setRecommendationDeeplink", "(Ljava/lang/String;)V", "showinfoDigitalModal", "getShowinfoDigitalModal", "setShowinfoDigitalModal", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "firstBtnInitialViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "secondBtnInitialViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonQuantDoublecartBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonQuantDoublecartBinding;", "onAction$delegate", "LSc/j;", "getOnAction", "onAction", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantViewImpl extends LinearLayout implements DoubleCartQuantView {
    private ActionHandler.Builder actionHandlerBuilder;

    @NotNull
    private final WidgetCartbuttonQuantDoublecartBinding binding;
    private CartButtonQuantViewState firstBtnInitialViewState;
    private final boolean isVibration;

    /* renamed from: onAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onAction;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onAddToCartClick;
    private InterfaceC6511n<? super DoubleCartQuantVO.CartMode, ? super String, ? super AtomAction, Unit> onAddToCartClickRecommendation;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onMinusCartClick;
    private Function1<? super DoubleCartQuantVO.CartMode, Unit> onPlusCartClick;
    private String recommendationDeeplink;
    private CartButtonQuantViewState secondBtnInitialViewState;
    private Function1<? super String, Unit> showinfoDigitalModal;
    private DoubleCartQuantVO vo;

    public /* synthetic */ DoubleCartQuantViewImpl(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z11);
    }

    private final Function1<AtomAction, Unit> getOnAction() {
        return (Function1) this.onAction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveClickAction(ButtonV3Atom.LargeButton button, DoubleCartQuantVO.CartMode cartMode) {
        AtomAction atomAction;
        Function1<AtomAction, Unit> onAction;
        Map<String, String> params;
        String str;
        Function1<String, Unit> showinfoDigitalModal;
        AtomActionDTO action = button != null ? button.getAction() : null;
        if (action != null && (params = action.getParams()) != null && (str = params.get("infoDigitalModalDeeplink")) != null && (showinfoDigitalModal = getShowinfoDigitalModal()) != null) {
            showinfoDigitalModal.invoke(str);
        }
        if (!Intrinsics.d(action != null ? action.getId() : null, "addToCart")) {
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, button.getTrackingInfo())) == null || (onAction = getOnAction()) == null) {
                return;
            }
            onAction.invoke(atomAction);
            return;
        }
        Map<String, String> params2 = action.getParams();
        setRecommendationDeeplink(params2 != null ? params2.get("recommendationsDeeplink") : null);
        AtomAction parseAdditionalAction = CartButtonQuantActionHandler.INSTANCE.parseAdditionalAction(action.getParams());
        if (this.isVibration) {
            VibrationExtKt.vibrateSingle(this);
        }
        InterfaceC6511n<DoubleCartQuantVO.CartMode, String, AtomAction, Unit> onAddToCartClickRecommendation = getOnAddToCartClickRecommendation();
        if (onAddToCartClickRecommendation != null) {
            onAddToCartClickRecommendation.invoke(cartMode, getRecommendationDeeplink(), parseAdditionalAction);
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void bind(@NotNull DoubleCartQuantVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        WidgetCartbuttonQuantDoublecartBinding widgetCartbuttonQuantDoublecartBinding = this.binding;
        this.vo = vo;
        bind(widgetCartbuttonQuantDoublecartBinding.firstCb.getButton(), vo.getFirstCartData().getToCart().getButtonWithIcon(), DoubleCartQuantVO.CartMode.FIRST, vo.getStyle(), vo.getFirstCartData().getIsInCart(), false);
        widgetCartbuttonQuantDoublecartBinding.firstCb.getButton().setEnabled(vo.getFirstCartData().getToCart().getButtonWithIcon().getButton().getAction() != null);
        widgetCartbuttonQuantDoublecartBinding.firstCb.bindBadge(vo.getFirstCartData().getToCart().getButtonWithIcon().getBadge());
        CartButtonQuant secondCb = widgetCartbuttonQuantDoublecartBinding.secondCb;
        Intrinsics.checkNotNullExpressionValue(secondCb, "secondCb");
        bind(secondCb, vo.getSecondCartData().getToCart().getButtonWithIcon(), DoubleCartQuantVO.CartMode.SECOND, vo.getStyle(), vo.getFirstCartData().getIsInCart(), false);
        widgetCartbuttonQuantDoublecartBinding.secondCb.setEnabled(vo.getSecondCartData().getToCart().getButtonWithIcon().getButton().getAction() != null);
        widgetCartbuttonQuantDoublecartBinding.secondCb.onGradientAnimationFinish(new DoubleCartQuantViewImpl$bind$1$1(this, widgetCartbuttonQuantDoublecartBinding));
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public ActionHandler.Builder getActionHandlerBuilder() {
        return this.actionHandlerBuilder;
    }

    public InterfaceC6511n<DoubleCartQuantVO.CartMode, String, AtomAction, Unit> getOnAddToCartClickRecommendation() {
        return this.onAddToCartClickRecommendation;
    }

    public String getRecommendationDeeplink() {
        return this.recommendationDeeplink;
    }

    public Function1<String, Unit> getShowinfoDigitalModal() {
        return this.showinfoDigitalModal;
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

    public void setRecommendationDeeplink(String str) {
        this.recommendationDeeplink = str;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantView
    public void setShowinfoDigitalModal(Function1<? super String, Unit> function1) {
        this.showinfoDigitalModal = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleCartQuantViewImpl(@NotNull Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVibration = z11;
        WidgetCartbuttonQuantDoublecartBinding inflate = WidgetCartbuttonQuantDoublecartBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.onAction = DelegatesKt.lazyUnsafe(new DoubleCartQuantViewImpl$onAction$2(this));
        setId(R$id.cartBtn);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        inflate.getConstraintLayout().setClickable(true);
        setGravity(80);
    }

    private final void bind(CartButtonQuant cartButtonQuant, CartButtonQuantDto.CartButton cartButton, DoubleCartQuantVO.CartMode cartMode, CartButtonQuantDto.CartButtonStyle cartButtonStyle, boolean z11, boolean z12) {
        Context context = cartButtonQuant.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CartButtonQuantViewState cartButtonViewState$default = QuantDtoMappersKt.toCartButtonViewState$default(cartButton, context, cartButtonStyle, cartMode, z11, z12, null, null, 96, null);
        if (cartMode == DoubleCartQuantVO.CartMode.FIRST && this.firstBtnInitialViewState == null) {
            this.firstBtnInitialViewState = cartButtonViewState$default;
        }
        if (cartMode == DoubleCartQuantVO.CartMode.SECOND && this.secondBtnInitialViewState == null) {
            this.secondBtnInitialViewState = cartButtonViewState$default;
        }
        cartButtonQuant.setViewState(cartButtonViewState$default);
        ViewExtKt.setOnClickListenerThrottle$default(cartButtonQuant, 0L, new DoubleCartQuantViewImpl$bind$3(this, cartButton, cartMode), 1, null);
    }
}
