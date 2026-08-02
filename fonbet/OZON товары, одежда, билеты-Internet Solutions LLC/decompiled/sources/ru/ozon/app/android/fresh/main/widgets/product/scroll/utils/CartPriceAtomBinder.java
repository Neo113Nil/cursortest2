package ru.ozon.app.android.fresh.main.widgets.product.scroll.utils;

import BY.g;
import Lm0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.Y;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.delegate.CartAtomEnablingStateDelegate;
import ru.ozon.app.android.cart.domain.model.CartAtomViewState;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.main.ui.atoms.FreshAtomsFactory;
import ru.ozon.app.android.fresh.main.ui.atoms.cartPrice.CartPriceAtomViewState;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import vc.l;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00142\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020,2\u0006\u0010)\u001a\u00020-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u0002002\u0006\u0010)\u001a\u00020-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b1\u00102J)\u00104\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u0002032\u0006\u0010)\u001a\u00020-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u0002002\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b:\u0010;J)\u0010=\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020<2\u0006\u0010)\u001a\u00020-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bG\u0010BJ'\u0010H\u001a\u00020C2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u0002032\u0006\u00107\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR*\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010[\u001a\n Z*\u0004\u0018\u00010Y0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00120`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010gR\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010hR\u0016\u0010i\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;", "enablingStateDelegate", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "view", "", "init", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "atomView", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "widgetId", "bind", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/lang/Long;)V", "", "adult", "bindAdult", "(Z)V", "unbind", "()V", "updateLayoutForCartPriceAtom", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "applyCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "action", "applyAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "onAddToCartButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "onAddToCartButtonWithQuantity", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "onCartPriceExpressAtom", "(Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "", "productId", "discardAddingToCart", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;Ljava/lang/String;)V", "discardAddingToCartPriceAtom", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "onAddToCartButtonImage", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/cart/domain/model/CartAtomViewState;", "cartAtomViewState", "bindAtom", "(Lru/ozon/app/android/cart/domain/model/CartAtomViewState;)V", "Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceAtomViewState;", "cartPriceAtomViewState", "bindCartPriceAtom", "(Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceAtomViewState;)V", "bindButtonWithQty", "computeCartPriceAtom", "(Lru/ozon/app/android/cart/common/domain/CartState;Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;J)Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceAtomViewState;", "Lru/ozon/app/android/account/adult/ui/AdultListener;", "adultListener", "adultWrapper", "(Lru/ozon/app/android/account/adult/ui/AdultListener;)V", "handleSuccessResultAdultDialog", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lkotlin/Function0;", "adultDialogCommitListener", "Lkotlin/jvm/functions/Function0;", "getAdultDialogCommitListener", "()Lkotlin/jvm/functions/Function0;", "setAdultDialogCommitListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "shakeAnimation", "Landroid/view/animation/Animation;", "Lnc/a;", "disposables", "Lnc/a;", "Ljava/util/concurrent/atomic/AtomicReference;", "atomRef", "Ljava/util/concurrent/atomic/AtomicReference;", "atomState", "Lru/ozon/app/android/cart/domain/model/CartAtomViewState;", "cartPriceAtomState", "Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceAtomViewState;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Ljava/lang/String;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Z", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPriceAtomBinder {
    private Function0<Unit> adultDialogCommitListener;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AtomicReference<AtomDTO> atomRef;
    private CartAtomViewState atomState;
    private SingleAtom atomView;
    private CartPriceAtomViewState cartPriceAtomState;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final CartAtomEnablingStateDelegate enablingStateDelegate;
    private boolean isAdult;
    private String productId;
    private final Animation shakeAnimation;

    public CartPriceAtomBinder(@NotNull Context context, @NotNull AdultHandler adultHandler, @NotNull CartAtomEnablingStateDelegate enablingStateDelegate, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(enablingStateDelegate, "enablingStateDelegate");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.adultHandler = adultHandler;
        this.enablingStateDelegate = enablingStateDelegate;
        this.cartService = cartService;
        this.shakeAnimation = AnimationUtils.loadAnimation(context, R$anim.shake);
        this.disposables = new C8486a();
        this.atomRef = new AtomicReference<>(null);
    }

    private final void adultWrapper(AdultListener adultListener) {
        G supportFragmentManager;
        SingleAtom singleAtom = this.atomView;
        Context context = singleAtom != null ? singleAtom.getContext() : null;
        r rVar = context instanceof r ? (r) context : null;
        if (rVar == null || (supportFragmentManager = rVar.getSupportFragmentManager()) == null) {
            return;
        }
        AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.isAdult, supportFragmentManager, adultListener, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyAction(AtomAction action, Long widgetId) {
        if (!(action instanceof AtomAction.Click)) {
            return false;
        }
        CartPriceAtomViewState cartPriceAtomViewState = this.cartPriceAtomState;
        if ((cartPriceAtomViewState != null ? cartPriceAtomViewState.getAtom() : null) != null) {
            CartPriceAtomViewState cartPriceAtomViewState2 = this.cartPriceAtomState;
            CartPriceFreshAtom atom = cartPriceAtomViewState2 != null ? cartPriceAtomViewState2.getAtom() : null;
            Intrinsics.f(atom);
            onCartPriceExpressAtom(atom, (AtomAction.Click) action, widgetId);
            return true;
        }
        CartAtomViewState cartAtomViewState = this.atomState;
        ButtonV3Atom.AddToCartAtom atom2 = cartAtomViewState != null ? cartAtomViewState.getAtom() : null;
        if (atom2 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            onAddToCartButton((ButtonV3Atom.AddToCartAtom.AddToCartButton) atom2, (AtomAction.Click) action, widgetId);
            return true;
        }
        if (atom2 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            onAddToCartButtonWithQuantity((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atom2, (AtomAction.Click) action, widgetId);
            return true;
        }
        if (!(atom2 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage)) {
            return false;
        }
        onAddToCartButtonImage((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom2, (AtomAction.Click) action, widgetId);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCartState(CartState cartState) {
        Long y02;
        ButtonV3Atom.AddToCartAtom atom;
        String str = this.productId;
        if (str == null || (y02 = h.y0(str)) == null) {
            return;
        }
        long longValue = y02.longValue();
        CartAtomViewState cartAtomViewState = this.atomState;
        if (cartAtomViewState == null) {
            CartPriceAtomViewState cartPriceAtomViewState = this.cartPriceAtomState;
            if (cartPriceAtomViewState != null) {
                CartPriceFreshAtom atom2 = cartPriceAtomViewState != null ? cartPriceAtomViewState.getAtom() : null;
                Intrinsics.g(atom2, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom");
                CartPriceAtomViewState computeCartPriceAtom = computeCartPriceAtom(cartState, atom2, longValue);
                if (computeCartPriceAtom.getAtom() == null || computeCartPriceAtom.equals(this.cartPriceAtomState)) {
                    return;
                }
                this.cartPriceAtomState = computeCartPriceAtom;
                SingleAtom singleAtom = this.atomView;
                if (singleAtom != null) {
                    CartPriceFreshAtom atom3 = computeCartPriceAtom.getAtom();
                    Intrinsics.f(atom3);
                    SingleAtom.bind$default(singleAtom, atom3, false, 2, null);
                    return;
                }
                return;
            }
            return;
        }
        ButtonV3Atom.AddToCartAtom atom4 = cartAtomViewState != null ? cartAtomViewState.getAtom() : null;
        if (atom4 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            boolean hasProduct = cartState.hasProduct(longValue);
            CartAtomEnablingStateDelegate cartAtomEnablingStateDelegate = this.enablingStateDelegate;
            CartAtomViewState cartAtomViewState2 = this.atomState;
            ButtonV3Atom.AddToCartAtom atom5 = cartAtomViewState2 != null ? cartAtomViewState2.getAtom() : null;
            Intrinsics.g(atom5, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButton");
            CartAtomViewState computeAddToCartAtom = cartAtomEnablingStateDelegate.computeAddToCartAtom(cartState, (ButtonV3Atom.AddToCartAtom.AddToCartButton) atom5, longValue, hasProduct);
            CartAtomViewState cartAtomViewState3 = this.atomState;
            atom = cartAtomViewState3 != null ? cartAtomViewState3.getAtom() : null;
            Intrinsics.g(atom, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButton");
            if (((ButtonV3Atom.AddToCartAtom.AddToCartButton) atom).isActive() != hasProduct) {
                bindAtom(computeAddToCartAtom);
                return;
            }
            return;
        }
        if (atom4 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            CartAtomEnablingStateDelegate cartAtomEnablingStateDelegate2 = this.enablingStateDelegate;
            CartAtomViewState cartAtomViewState4 = this.atomState;
            atom = cartAtomViewState4 != null ? cartAtomViewState4.getAtom() : null;
            Intrinsics.g(atom, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity");
            bindButtonWithQty(cartAtomEnablingStateDelegate2.computeButtonWithQuantityAtom(cartState, (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atom, longValue));
            return;
        }
        if (atom4 instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) {
            boolean hasProduct2 = cartState.hasProduct(longValue);
            CartAtomEnablingStateDelegate cartAtomEnablingStateDelegate3 = this.enablingStateDelegate;
            CartAtomViewState cartAtomViewState5 = this.atomState;
            ButtonV3Atom.AddToCartAtom atom6 = cartAtomViewState5 != null ? cartAtomViewState5.getAtom() : null;
            Intrinsics.g(atom6, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonImage");
            CartAtomViewState computeAddToCartAtom2 = cartAtomEnablingStateDelegate3.computeAddToCartAtom(cartState, (ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom6, longValue, hasProduct2);
            CartAtomViewState cartAtomViewState6 = this.atomState;
            atom = cartAtomViewState6 != null ? cartAtomViewState6.getAtom() : null;
            Intrinsics.g(atom, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonImage");
            if (((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom).isActive() != hasProduct2) {
                bindAtom(computeAddToCartAtom2);
            }
        }
    }

    private final void bindAtom(CartAtomViewState cartAtomViewState) {
        this.atomState = cartAtomViewState;
        ButtonV3Atom.AddToCartAtom atom = cartAtomViewState.getAtom();
        if (atom != null) {
            SingleAtom singleAtom = this.atomView;
            if (singleAtom != null) {
                SingleAtom.bind$default(singleAtom, atom, false, 2, null);
            }
            this.atomRef.set(cartAtomViewState.getAtom());
            this.enablingStateDelegate.setupAddToCartButtonState(this.atomView, cartAtomViewState);
        }
    }

    private final void bindButtonWithQty(CartAtomViewState cartAtomViewState) {
        if (cartAtomViewState.getAtom() != null && !cartAtomViewState.equals(this.atomState)) {
            this.atomState = cartAtomViewState;
            this.atomRef.set(cartAtomViewState.getAtom());
            SingleAtom singleAtom = this.atomView;
            if (singleAtom != null) {
                ButtonV3Atom.AddToCartAtom atom = cartAtomViewState.getAtom();
                Intrinsics.f(atom);
                SingleAtom.bind$default(singleAtom, atom, false, 2, null);
            }
        }
        this.enablingStateDelegate.setupAddToCartButtonState(this.atomView, cartAtomViewState);
    }

    private final void bindCartPriceAtom(CartPriceAtomViewState cartPriceAtomViewState) {
        this.cartPriceAtomState = cartPriceAtomViewState;
        CartPriceFreshAtom atom = cartPriceAtomViewState.getAtom();
        if (atom != null) {
            SingleAtom singleAtom = this.atomView;
            if (singleAtom != null) {
                SingleAtom.bind$default(singleAtom, atom, false, 2, null);
            }
            this.atomRef.set(cartPriceAtomViewState.getAtom());
        }
    }

    private final CartPriceAtomViewState computeCartPriceAtom(CartState cartState, CartPriceFreshAtom atom, long productId) {
        CartItemInfo cartItemInfo = cartState.getItems().get(Long.valueOf(productId));
        int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
        return new CartPriceAtomViewState(atom.getCurrentItems() != quantity ? atom.copy((r34 & 1) != 0 ? atom.atomType : null, (r34 & 2) != 0 ? atom.theme : null, (r34 & 4) != 0 ? atom.price : null, (r34 & 8) != 0 ? atom.priceColor : null, (r34 & 16) != 0 ? atom.originalPrice : null, (r34 & 32) != 0 ? atom.originalPriceColor : null, (r34 & 64) != 0 ? atom.currentItems : quantity, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? atom.maxQuantity : 0, (r34 & 256) != 0 ? atom.action : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? atom.unitOfMeasure : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? atom.plusButton : null, (r34 & 2048) != 0 ? atom.minusButton : null, (r34 & 4096) != 0 ? atom.backgroundButtonsColor : null, (r34 & 8192) != 0 ? atom.priceWithUnit : null, (r34 & 16384) != 0 ? atom.trackingInfo : null, (r34 & 32768) != 0 ? atom.testInfo : null) : atom, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardAddingToCart(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity atom, String productId) {
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity copy;
        Long y02 = h.y0(productId);
        if (y02 != null) {
            long longValue = y02.longValue();
            CartAtomEnablingStateDelegate cartAtomEnablingStateDelegate = this.enablingStateDelegate;
            CartState cartState = this.cartService.getCartState();
            copy = atom.copy((r32 & 1) != 0 ? atom.maxItems : 0, (r32 & 2) != 0 ? atom.currentItems : CartService.DefaultImpls.getProductInCartCount$default(this.cartService, longValue, null, 2, null), (r32 & 4) != 0 ? atom.text : null, (r32 & 8) != 0 ? atom.style : null, (r32 & 16) != 0 ? atom.theme : null, (r32 & 32) != 0 ? atom.mode : null, (r32 & 64) != 0 ? atom.buttonIconId : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? atom.sellerIcon : null, (r32 & 256) != 0 ? atom.qtyTextDisabled : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? atom.buttonSizeMode : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? atom.action : null, (r32 & 2048) != 0 ? atom.context : null, (r32 & 4096) != 0 ? atom.testInfo : null, (r32 & 8192) != 0 ? atom.trackingInfo : null, (r32 & 16384) != 0 ? atom.extend : null);
            bindAtom(cartAtomEnablingStateDelegate.computeButtonWithQuantityAtom(cartState, copy, longValue));
            SingleAtom singleAtom = this.atomView;
            if (singleAtom != null) {
                singleAtom.startAnimation(this.shakeAnimation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardAddingToCartPriceAtom(String productId) {
        Long y02 = h.y0(productId);
        if (y02 != null) {
            long longValue = y02.longValue();
            CartState cartState = this.cartService.getCartState();
            CartPriceAtomViewState cartPriceAtomViewState = this.cartPriceAtomState;
            CartPriceFreshAtom atom = cartPriceAtomViewState != null ? cartPriceAtomViewState.getAtom() : null;
            Intrinsics.g(atom, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom");
            bindCartPriceAtom(computeCartPriceAtom(cartState, atom, longValue));
            SingleAtom singleAtom = this.atomView;
            if (singleAtom != null) {
                singleAtom.startAnimation(this.shakeAnimation);
            }
        }
    }

    private final AtomDTO getAtom() {
        return this.atomRef.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessResultAdultDialog() {
        Function0<Unit> function0;
        if (!this.isAdult || (function0 = this.adultDialogCommitListener) == null) {
            return;
        }
        function0.invoke();
    }

    private final void onAddToCartButton(final ButtonV3Atom.AddToCartAtom.AddToCartButton atom, AtomAction.Click action, final Long widgetId) {
        final String str;
        Integer w02;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("product_id")) == null) {
            return;
        }
        String str2 = params.get("quantity");
        int intValue = (str2 == null || (w02 = h.w0(str2)) == null) ? 1 : w02.intValue();
        String id2 = action.getId();
        if (Intrinsics.d(id2, "addToCart")) {
            final int i11 = intValue;
            adultWrapper(new AdultListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder$onAddToCartButton$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    C8486a c8486a;
                    CartService cartService;
                    Function0 function0;
                    Long l11;
                    CartPriceAtomBinder.this.handleSuccessResultAdultDialog();
                    c8486a = CartPriceAtomBinder.this.disposables;
                    cartService = CartPriceAtomBinder.this.cartService;
                    Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    if (action2 != null) {
                        l11 = action2.getSelectedDeliverySchema();
                        function0 = null;
                    } else {
                        function0 = null;
                        l11 = null;
                    }
                    AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, str, i11, l11, trackingInfo, widgetId, null, null, null, null, null, 992, null);
                    x a11 = C8125a.a();
                    addProductToCart$default.getClass();
                    l lVar = new l(addProductToCart$default, a11);
                    Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
                    RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, function0, new CartPriceAtomBinder$onAddToCartButton$1$onAdultAccept$1(a.f17149a), 1, function0));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            });
            return;
        }
        int i12 = intValue;
        if (Intrinsics.d(id2, "removeFromCart")) {
            C8486a c8486a = this.disposables;
            CartService cartService = this.cartService;
            Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
            AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, str, i12, action2 != null ? action2.getSelectedDeliverySchema() : null, trackingInfo, widgetId, null, null, 96, null);
            x a11 = C8125a.a();
            removeProductFromCart$default.getClass();
            l lVar = new l(removeProductFromCart$default, a11);
            Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
            RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, null, new CartPriceAtomBinder$onAddToCartButton$2(a.f17149a), 1, null));
        }
    }

    private final void onAddToCartButtonImage(ButtonV3Atom.AddToCartAtom.AddToCartButtonImage atom, AtomAction.Click action, Long widgetId) {
        String str;
        Integer w02;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("product_id")) == null) {
            return;
        }
        String str2 = params.get("quantity");
        int intValue = (str2 == null || (w02 = h.w0(str2)) == null) ? 1 : w02.intValue();
        String id2 = action.getId();
        if (Intrinsics.d(id2, "addToCart")) {
            C8486a c8486a = this.disposables;
            CartService cartService = this.cartService;
            Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, str, intValue, action2 != null ? action2.getSelectedDeliverySchema() : null, trackingInfo, widgetId, null, null, null, null, null, 992, null);
            x a11 = C8125a.a();
            addProductToCart$default.getClass();
            l lVar = new l(addProductToCart$default, a11);
            Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
            RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, null, new CartPriceAtomBinder$onAddToCartButtonImage$1(a.f17149a), 1, null));
            return;
        }
        if (Intrinsics.d(id2, "removeFromCart")) {
            C8486a c8486a2 = this.disposables;
            CartService cartService2 = this.cartService;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action3 = atom.getAction();
            AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService2, str, intValue, action3 != null ? action3.getSelectedDeliverySchema() : null, trackingInfo2, widgetId, null, null, 96, null);
            x a12 = C8125a.a();
            removeProductFromCart$default.getClass();
            l lVar2 = new l(removeProductFromCart$default, a12);
            Intrinsics.checkNotNullExpressionValue(lVar2, "observeOn(...)");
            RxExtKt.plusAssign(c8486a2, RxExtKt.subscribeBy$default(lVar2, null, new CartPriceAtomBinder$onAddToCartButtonImage$2(a.f17149a), 1, null));
        }
    }

    private final void onAddToCartButtonWithQuantity(final ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity atom, final AtomAction.Click action, final Long widgetId) {
        final String str;
        Integer w02;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("product_id")) == null) {
            return;
        }
        String str2 = params.get("count");
        final int intValue = (str2 == null || (w02 = h.w0(str2)) == null) ? 0 : w02.intValue();
        final CartPriceAtomBinder$onAddToCartButtonWithQuantity$errorListener$1 cartPriceAtomBinder$onAddToCartButtonWithQuantity$errorListener$1 = new CartPriceAtomBinder$onAddToCartButtonWithQuantity$errorListener$1(this, atom, str);
        if (intValue != 0) {
            adultWrapper(new AdultListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder$onAddToCartButtonWithQuantity$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    C8486a c8486a;
                    CartService cartService;
                    Function0 function0;
                    Long l11;
                    CartPriceAtomBinder.this.handleSuccessResultAdultDialog();
                    c8486a = CartPriceAtomBinder.this.disposables;
                    cartService = CartPriceAtomBinder.this.cartService;
                    Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
                    String id2 = action.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    String str3 = id2;
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    if (action2 != null) {
                        l11 = action2.getSelectedDeliverySchema();
                        function0 = null;
                    } else {
                        function0 = null;
                        l11 = null;
                    }
                    RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.addProductToCart$default(cartService, str, intValue, l11, trackingInfo, widgetId, str3, null, null, null, null, 960, null), function0, cartPriceAtomBinder$onAddToCartButtonWithQuantity$errorListener$1, 1, function0));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    CartPriceAtomBinder.this.discardAddingToCart(atom, str);
                }
            });
            return;
        }
        C8486a c8486a = this.disposables;
        CartService cartService = this.cartService;
        Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
        ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
        RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.removeProductFromCart$default(cartService, str, intValue, action2 != null ? action2.getSelectedDeliverySchema() : null, trackingInfo, widgetId, null, null, 96, null), null, cartPriceAtomBinder$onAddToCartButtonWithQuantity$errorListener$1, 1, null));
    }

    private final void onCartPriceExpressAtom(final CartPriceFreshAtom atom, final AtomAction.Click action, final Long widgetId) {
        final String str;
        Integer w02;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("product_id")) == null) {
            return;
        }
        String str2 = params.get("count");
        final int intValue = (str2 == null || (w02 = h.w0(str2)) == null) ? 0 : w02.intValue();
        final CartPriceAtomBinder$onCartPriceExpressAtom$errorListener$1 cartPriceAtomBinder$onCartPriceExpressAtom$errorListener$1 = new CartPriceAtomBinder$onCartPriceExpressAtom$errorListener$1(this, str);
        if (intValue != 0) {
            adultWrapper(new AdultListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder$onCartPriceExpressAtom$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    C8486a c8486a;
                    CartService cartService;
                    CartPriceAtomBinder.this.handleSuccessResultAdultDialog();
                    c8486a = CartPriceAtomBinder.this.disposables;
                    cartService = CartPriceAtomBinder.this.cartService;
                    String str3 = str;
                    int i11 = intValue;
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    Long selectedDeliverySchema = action2 != null ? action2.getSelectedDeliverySchema() : null;
                    Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
                    Long l11 = widgetId;
                    String id2 = action.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.addProductToCart$default(cartService, str3, i11, selectedDeliverySchema, trackingInfo, l11, id2, null, null, null, null, 960, null), null, cartPriceAtomBinder$onCartPriceExpressAtom$errorListener$1, 1, null));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    CartPriceAtomBinder.this.discardAddingToCartPriceAtom(str);
                }
            });
            return;
        }
        C8486a c8486a = this.disposables;
        CartService cartService = this.cartService;
        ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
        RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.removeProductFromCart$default(cartService, str, intValue, action2 != null ? action2.getSelectedDeliverySchema() : null, atom.getTrackingInfo(), widgetId, null, null, 96, null), null, cartPriceAtomBinder$onCartPriceExpressAtom$errorListener$1, 1, null));
    }

    private final void updateLayoutForCartPriceAtom() {
        SingleAtom singleAtom;
        AtomDTO atom = getAtom();
        if (atom == null || !(atom instanceof CartPriceFreshAtom) || (singleAtom = this.atomView) == null) {
            return;
        }
        int i11 = Y.f42258g;
        if (!singleAtom.isLaidOut() || singleAtom.isLayoutRequested()) {
            singleAtom.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder$updateLayoutForCartPriceAtom$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = -1;
                    view.setLayoutParams(layoutParams);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = singleAtom.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        singleAtom.setLayoutParams(layoutParams);
    }

    public final void bind(@NotNull SingleAtom atomView, @NotNull AtomDTO atom, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull WZ.l tokenizedAnalytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.atomRef.set(atom);
        boolean z11 = atom instanceof ButtonV3Atom.AddToCartAtom;
        if (!z11 && !(atom instanceof CartPriceFreshAtom)) {
            SingleAtom.bind$default(atomView, atom, false, 2, null);
            atomView.setOnAction(actionHandler);
            return;
        }
        if (z11) {
            ButtonV3Atom.AddToCartAtom addToCartAtom = (ButtonV3Atom.AddToCartAtom) atom;
            this.atomState = new CartAtomViewState(addToCartAtom, true);
            ButtonV3Atom.AddToCartAtom.Action action = addToCartAtom.getAction();
            this.productId = action != null ? action.getId() : null;
        } else if (atom instanceof CartPriceFreshAtom) {
            CartPriceFreshAtom cartPriceFreshAtom = (CartPriceFreshAtom) atom;
            this.cartPriceAtomState = new CartPriceAtomViewState(cartPriceFreshAtom, true);
            ButtonV3Atom.AddToCartAtom.Action action2 = cartPriceFreshAtom.getAction();
            this.productId = action2 != null ? action2.getId() : null;
        }
        this.atomView = atomView;
        this.cartService.attach(tokenizedAnalytics);
        atomView.setAtomsFactory(new FreshAtomsFactory());
        SingleAtom.bind$default(atomView, atom, false, 2, null);
        atomView.setOnAction(new CartPriceAtomBinder$bind$1(this, widgetId, actionHandler));
    }

    public final void bindAdult(boolean adult) {
        this.isAdult = adult;
    }

    public final void init(@NotNull SingleAtom view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.atomView = view;
        updateLayoutForCartPriceAtom();
        this.disposables.d();
        C8486a c8486a = this.disposables;
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a()).subscribe(new g(new CartPriceAtomBinder$init$1(this), 1), new BY.h(new CartPriceAtomBinder$init$2(a.f17149a), 1));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    public final void setAdultDialogCommitListener(Function0<Unit> function0) {
        this.adultDialogCommitListener = function0;
    }

    public final void unbind() {
        this.atomView = null;
        this.productId = null;
        this.disposables.d();
    }
}
