package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.widget.LinearLayout;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButtonViewState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.DtoMappersKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0016\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R2\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRB\u0010#\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R2\u0010)\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR2\u0010,\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u00100\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001b\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR*\u0010@\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR$\u0010K\u001a\u0004\u0018\u00010J8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR)\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u001d¨\u0006U"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/BaseDoubleCartView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "Landroid/content/Context;", "context", "", "isVibration", "<init>", "(Landroid/content/Context;Z)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "cartMode", "", "resolveClickAction", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "dto", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "style", "isInCart", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Z)V", "Z", "Lkotlin/Function1;", "onAddToCartClick", "Lkotlin/jvm/functions/Function1;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function1;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "onAddToCartClickRecommendation", "Lfd/n;", "getOnAddToCartClickRecommendation", "()Lfd/n;", "setOnAddToCartClickRecommendation", "(Lfd/n;)V", "onMinusCartClick", "getOnMinusCartClick", "setOnMinusCartClick", "onPlusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "recommendationDeeplink", "Ljava/lang/String;", "getRecommendationDeeplink", "()Ljava/lang/String;", "setRecommendationDeeplink", "(Ljava/lang/String;)V", "showinfoDigitalModal", "getShowinfoDigitalModal", "setShowinfoDigitalModal", "Lkotlin/Function0;", "onAddToCartClickRelatedProducts", "Lkotlin/jvm/functions/Function0;", "getOnAddToCartClickRelatedProducts", "()Lkotlin/jvm/functions/Function0;", "setOnAddToCartClickRelatedProducts", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "firstBtnInitialViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonViewState;", "secondBtnInitialViewState", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "vo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "getVo", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "setVo", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;)V", "onAction$delegate", "LSc/j;", "getOnAction", "onAction", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseDoubleCartView extends LinearLayout implements DoubleCartView {
    private ActionHandler.Builder actionHandlerBuilder;
    private CartButtonViewState firstBtnInitialViewState;
    private final boolean isVibration;

    /* renamed from: onAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onAction;
    private Function1<? super DoubleCartVO.CartMode, Unit> onAddToCartClick;
    private InterfaceC6511n<? super DoubleCartVO.CartMode, ? super String, ? super AtomAction, Unit> onAddToCartClickRecommendation;
    private Function0<Unit> onAddToCartClickRelatedProducts;
    private Function1<? super DoubleCartVO.CartMode, Unit> onMinusCartClick;
    private Function1<? super DoubleCartVO.CartMode, Unit> onPlusCartClick;
    private String recommendationDeeplink;
    private CartButtonViewState secondBtnInitialViewState;
    private Function1<? super String, Unit> showinfoDigitalModal;
    private DoubleCartVO vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDoubleCartView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isVibration = z11;
        this.onAction = DelegatesKt.lazyUnsafe(new BaseDoubleCartView$onAction$2(this));
        setId(R$id.cartBtn);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setClickable(true);
    }

    private final Function1<AtomAction, Unit> getOnAction() {
        return (Function1) this.onAction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveClickAction(ButtonV3Atom.LargeButton button, DoubleCartVO.CartMode cartMode) {
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
        AtomAction parseAdditionalAction = CartButtonActionHandler.INSTANCE.parseAdditionalAction(action.getParams());
        if (this.isVibration) {
            VibrationExtKt.vibrateSingle(this);
        }
        InterfaceC6511n<DoubleCartVO.CartMode, String, AtomAction, Unit> onAddToCartClickRecommendation = getOnAddToCartClickRecommendation();
        if (onAddToCartClickRecommendation != null) {
            onAddToCartClickRecommendation.invoke(cartMode, getRecommendationDeeplink(), parseAdditionalAction);
        }
        Function0<Unit> onAddToCartClickRelatedProducts = getOnAddToCartClickRelatedProducts();
        if (onAddToCartClickRelatedProducts != null) {
            onAddToCartClickRelatedProducts.invoke();
        }
    }

    protected final void bind(@NotNull CartButton cartButton, @NotNull CartButtonV4Dto.CartButton dto, @NotNull DoubleCartVO.CartMode cartMode, CartButtonV4Dto.CartButtonStyle cartButtonStyle, boolean z11) {
        Intrinsics.checkNotNullParameter(cartButton, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(cartMode, "cartMode");
        Context context = cartButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CartButtonViewState cartButtonViewState = DtoMappersKt.toCartButtonViewState(dto, context, cartButtonStyle, cartMode, z11);
        if (cartMode == DoubleCartVO.CartMode.FIRST && this.firstBtnInitialViewState == null) {
            this.firstBtnInitialViewState = cartButtonViewState;
        }
        if (cartMode == DoubleCartVO.CartMode.SECOND && this.secondBtnInitialViewState == null) {
            this.secondBtnInitialViewState = cartButtonViewState;
        }
        cartButton.setViewState(cartButtonViewState);
        ViewExtKt.setOnClickListenerThrottle$default(cartButton, 0L, new BaseDoubleCartView$bind$2(this, dto, cartMode), 1, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public ActionHandler.Builder getActionHandlerBuilder() {
        return this.actionHandlerBuilder;
    }

    public InterfaceC6511n<DoubleCartVO.CartMode, String, AtomAction, Unit> getOnAddToCartClickRecommendation() {
        return this.onAddToCartClickRecommendation;
    }

    public Function0<Unit> getOnAddToCartClickRelatedProducts() {
        return this.onAddToCartClickRelatedProducts;
    }

    public String getRecommendationDeeplink() {
        return this.recommendationDeeplink;
    }

    public Function1<String, Unit> getShowinfoDigitalModal() {
        return this.showinfoDigitalModal;
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

    public void setRecommendationDeeplink(String str) {
        this.recommendationDeeplink = str;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void setShowinfoDigitalModal(Function1<? super String, Unit> function1) {
        this.showinfoDigitalModal = function1;
    }

    protected final void setVo(DoubleCartVO doubleCartVO) {
        this.vo = doubleCartVO;
    }
}
