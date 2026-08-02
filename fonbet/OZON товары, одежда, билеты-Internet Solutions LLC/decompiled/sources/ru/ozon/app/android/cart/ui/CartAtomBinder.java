package ru.ozon.app.android.cart.ui;

import B0.C2454a;
import BT.c;
import Ej.b;
import Lm0.a;
import Sc.InterfaceC4008j;
import Tc.d;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.domain.delegate.CartAtomEnablingStateDelegate;
import ru.ozon.app.android.cart.domain.model.CartAtomViewState;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 n2\u00020\u0001:\u0001nB)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010#J\u001b\u0010%\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b,\u0010-J)\u00100\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020.2\u0006\u0010+\u001a\u00020/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b0\u00101J)\u00103\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u0002022\u0006\u0010+\u001a\u00020/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u0002022\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J)\u0010:\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u0002092\u0006\u0010+\u001a\u00020/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010?J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0011H\u0002¢\u0006\u0004\bE\u0010#J#\u0010H\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0018\u00010G*\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ\u001b\u0010L\u001a\u00020\u0011*\u00020J2\u0006\u0010\u0016\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\u00020\u001e*\u000202H\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR*\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR#\u0010`\u001a\n [*\u0004\u0018\u00010Z0Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010iR\u0016\u0010j\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lru/ozon/app/android/cart/ui/CartAtomBinder;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;", "enablingStateDelegate", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "init", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;LWZ/l;)V", "atomView", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "", "widgetId", "bind", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/lang/Long;)V", "", "adult", "bindAdult", "(Z)V", "clear", "()V", "unbind", "attachAnalytics", "(LWZ/l;)V", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "applyCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "action", "applyAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Long;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "onAddToCartButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "onAddToCartButtonWithQuantity", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "", "productId", "discardAddingToCart", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "onAddToCartButtonImage", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/cart/domain/model/CartAtomViewState;", "cartAtomViewState", "bindAtom", "(Lru/ozon/app/android/cart/domain/model/CartAtomViewState;)V", "bindButtonWithQty", "Lru/ozon/app/android/account/adult/ui/AdultListener;", "adultListener", "adultWrapper", "(Lru/ozon/app/android/account/adult/ui/AdultListener;)V", "handleSuccessResultAdultDialog", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "", "toParams", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;)Ljava/util/Map;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "appendLocator", "(Landroid/view/ViewGroup;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;)V", "availabilityQuantity", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;)Z", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lkotlin/Function0;", "adultDialogCommitListener", "Lkotlin/jvm/functions/Function0;", "getAdultDialogCommitListener", "()Lkotlin/jvm/functions/Function0;", "setAdultDialogCommitListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "shakeAnimation$delegate", "LSc/j;", "getShakeAnimation", "()Landroid/view/animation/Animation;", "shakeAnimation", "Lnc/a;", "disposables", "Lnc/a;", "atomState", "Lru/ozon/app/android/cart/domain/model/CartAtomViewState;", "Ljava/lang/ref/WeakReference;", "atomViewRef", "Ljava/lang/ref/WeakReference;", "Ljava/lang/String;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Z", "getAtomView", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartAtomBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function0<Unit> adultDialogCommitListener;

    @NotNull
    private final AdultHandler adultHandler;
    private CartAtomViewState atomState;
    private WeakReference<SingleAtom> atomViewRef;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final CartAtomEnablingStateDelegate enablingStateDelegate;
    private boolean isAdult;
    private String productId;

    /* renamed from: shakeAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shakeAnimation;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/ui/CartAtomBinder$Companion;", "", "<init>", "()V", "LOCATOR_ADD_TO_CART", "", "LOCATOR_COUNTER", "LOCATOR_COUNTER_PLUS_DISABLED", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartAtomBinder(@NotNull Context context, @NotNull AdultHandler adultHandler, @NotNull CartAtomEnablingStateDelegate enablingStateDelegate, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(enablingStateDelegate, "enablingStateDelegate");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.adultHandler = adultHandler;
        this.enablingStateDelegate = enablingStateDelegate;
        this.cartService = cartService;
        this.shakeAnimation = LazyUtilsKt.unsafeLazy(new CartAtomBinder$shakeAnimation$2(context));
        this.disposables = new C8486a();
    }

    private final void adultWrapper(AdultListener adultListener) {
        G supportFragmentManager;
        SingleAtom atomView = getAtomView();
        Context context = atomView != null ? atomView.getContext() : null;
        r rVar = context instanceof r ? (r) context : null;
        if (rVar == null || (supportFragmentManager = rVar.getSupportFragmentManager()) == null) {
            return;
        }
        AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.isAdult, supportFragmentManager, adultListener, null, false, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    private final void appendLocator(ViewGroup viewGroup, ButtonV3Atom.AddToCartAtom addToCartAtom) {
        ?? first;
        if (addToCartAtom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            if (viewGroup.getChildCount() == 1 && (first = ViewGroupExtKt.first(viewGroup)) != 0) {
                viewGroup = first;
            }
            ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) addToCartAtom;
            int currentItems = addToCartButtonWithQuantity.getCurrentItems();
            viewGroup.setContentDescription(currentItems == 0 ? "AddToCartButton" : !availabilityQuantity(addToCartButtonWithQuantity) ? b.a(currentItems, "AddToCartItems_disabled_plus_") : b.a(currentItems, "AddToCartItems_"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyAction(AtomAction action, Long widgetId) {
        if (!(action instanceof AtomAction.Click)) {
            return false;
        }
        CartAtomViewState cartAtomViewState = this.atomState;
        ButtonV3Atom.AddToCartAtom atom = cartAtomViewState != null ? cartAtomViewState.getAtom() : null;
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            onAddToCartButton((ButtonV3Atom.AddToCartAtom.AddToCartButton) atom, (AtomAction.Click) action, widgetId);
            return true;
        }
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            onAddToCartButtonWithQuantity((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atom, (AtomAction.Click) action, widgetId);
            return true;
        }
        if (!(atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage)) {
            return false;
        }
        onAddToCartButtonImage((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom, (AtomAction.Click) action, widgetId);
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
        if (cartAtomViewState == null || (atom = cartAtomViewState.getAtom()) == null) {
            return;
        }
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            boolean hasProduct = cartState.hasProduct(longValue);
            CartAtomViewState computeAddToCartAtom = this.enablingStateDelegate.computeAddToCartAtom(cartState, atom, longValue, hasProduct);
            if (((ButtonV3Atom.AddToCartAtom.AddToCartButton) atom).isActive() != hasProduct) {
                bindAtom(computeAddToCartAtom);
                return;
            }
            return;
        }
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            bindButtonWithQty(this.enablingStateDelegate.computeButtonWithQuantityAtom(cartState, (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atom, longValue));
            return;
        }
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) {
            boolean hasProduct2 = cartState.hasProduct(longValue);
            CartAtomViewState computeAddToCartAtom2 = this.enablingStateDelegate.computeAddToCartAtom(cartState, atom, longValue, hasProduct2);
            if (((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom).isActive() != hasProduct2) {
                bindAtom(computeAddToCartAtom2);
            }
        }
    }

    private final void attachAnalytics(l tokenizedAnalytics) {
        this.cartService.attach(tokenizedAnalytics);
    }

    private final boolean availabilityQuantity(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        return addToCartButtonWithQuantity.getMaxItems() - addToCartButtonWithQuantity.getCurrentItems() > 0;
    }

    private final void bindAtom(CartAtomViewState cartAtomViewState) {
        this.atomState = cartAtomViewState;
        ButtonV3Atom.AddToCartAtom atom = cartAtomViewState.getAtom();
        if (atom != null) {
            SingleAtom atomView = getAtomView();
            if (atomView != null) {
                SingleAtom.bind$default(atomView, atom, false, 2, null);
            }
            this.enablingStateDelegate.setupAddToCartButtonState(getAtomView(), cartAtomViewState);
        }
    }

    private final void bindButtonWithQty(CartAtomViewState cartAtomViewState) {
        ButtonV3Atom.AddToCartAtom atom = cartAtomViewState.getAtom();
        if (atom != null && !cartAtomViewState.equals(this.atomState)) {
            this.atomState = cartAtomViewState;
            SingleAtom atomView = getAtomView();
            if (atomView != null) {
                SingleAtom.bind$default(atomView, atom, false, 2, null);
            }
            SingleAtom atomView2 = getAtomView();
            if (atomView2 != null) {
                appendLocator(atomView2, atom);
            }
        }
        this.enablingStateDelegate.setupAddToCartButtonState(getAtomView(), cartAtomViewState);
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
            SingleAtom atomView = getAtomView();
            if (atomView != null) {
                atomView.startAnimation(getShakeAnimation());
            }
        }
    }

    private final SingleAtom getAtomView() {
        WeakReference<SingleAtom> weakReference = this.atomViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final Animation getShakeAnimation() {
        return (Animation) this.shakeAnimation.getValue();
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
            adultWrapper(new AdultListener() { // from class: ru.ozon.app.android.cart.ui.CartAtomBinder$onAddToCartButton$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    C8486a c8486a;
                    CartService cartService;
                    Map params2;
                    Function0 function0;
                    LinkedHashMap linkedHashMap;
                    CartAtomBinder.this.handleSuccessResultAdultDialog();
                    c8486a = CartAtomBinder.this.disposables;
                    cartService = CartAtomBinder.this.cartService;
                    Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    Long selectedDeliverySchema = action2 != null ? action2.getSelectedDeliverySchema() : null;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    CartAtomBinder cartAtomBinder = CartAtomBinder.this;
                    ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton = atom;
                    params2 = cartAtomBinder.toParams(addToCartButton.getExtend());
                    if (params2 != null) {
                        linkedHashMap2.putAll(params2);
                    }
                    Map<String, String> extendMap = addToCartButton.getExtendMap();
                    if (extendMap != null) {
                        linkedHashMap2.putAll(extendMap);
                    }
                    if (linkedHashMap2.isEmpty()) {
                        function0 = null;
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        function0 = null;
                    }
                    AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, str, i11, selectedDeliverySchema, trackingInfo, widgetId, null, null, null, null, linkedHashMap, 480, null);
                    x a11 = C8125a.a();
                    addProductToCart$default.getClass();
                    vc.l lVar = new vc.l(addProductToCart$default, a11);
                    Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
                    RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, function0, new CartAtomBinder$onAddToCartButton$1$onAdultAccept$3(a.f17149a), 1, function0));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            });
            return;
        }
        if (Intrinsics.d(id2, "removeFromCart")) {
            C8486a c8486a = this.disposables;
            CartService cartService = this.cartService;
            Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
            ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
            Long selectedDeliverySchema = action2 != null ? action2.getSelectedDeliverySchema() : null;
            d builder = new d();
            Map<String, String> params2 = toParams(atom.getExtend());
            if (params2 != null) {
                builder.putAll(params2);
            }
            Map<String, String> extendMap = atom.getExtendMap();
            if (extendMap != null) {
                builder.putAll(extendMap);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            d u11 = builder.u();
            AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, str, intValue, selectedDeliverySchema, trackingInfo, widgetId, null, !u11.isEmpty() ? u11 : null, 32, null);
            x a11 = C8125a.a();
            removeProductFromCart$default.getClass();
            vc.l lVar = new vc.l(removeProductFromCart$default, a11);
            Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
            RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, null, new CartAtomBinder$onAddToCartButton$4(a.f17149a), 1, null));
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
            vc.l lVar = new vc.l(addProductToCart$default, a11);
            Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
            RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(lVar, null, new CartAtomBinder$onAddToCartButtonImage$1(a.f17149a), 1, null));
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
            vc.l lVar2 = new vc.l(removeProductFromCart$default, a12);
            Intrinsics.checkNotNullExpressionValue(lVar2, "observeOn(...)");
            RxExtKt.plusAssign(c8486a2, RxExtKt.subscribeBy$default(lVar2, null, new CartAtomBinder$onAddToCartButtonImage$2(a.f17149a), 1, null));
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
        final CartAtomBinder$onAddToCartButtonWithQuantity$errorListener$1 cartAtomBinder$onAddToCartButtonWithQuantity$errorListener$1 = new CartAtomBinder$onAddToCartButtonWithQuantity$errorListener$1(this, atom, str);
        if (intValue != 0) {
            adultWrapper(new AdultListener() { // from class: ru.ozon.app.android.cart.ui.CartAtomBinder$onAddToCartButtonWithQuantity$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    C8486a c8486a;
                    CartService cartService;
                    Map params2;
                    CartAtomBinder.this.handleSuccessResultAdultDialog();
                    c8486a = CartAtomBinder.this.disposables;
                    cartService = CartAtomBinder.this.cartService;
                    Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
                    String id2 = action.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    String str3 = id2;
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    Long selectedDeliverySchema = action2 != null ? action2.getSelectedDeliverySchema() : null;
                    params2 = CartAtomBinder.this.toParams(atom.getExtend());
                    RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.addProductToCart$default(cartService, str, intValue, selectedDeliverySchema, trackingInfo, widgetId, str3, null, null, null, params2, 448, null), null, cartAtomBinder$onAddToCartButtonWithQuantity$errorListener$1, 1, null));
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    CartAtomBinder.this.discardAddingToCart(atom, str);
                }
            });
            return;
        }
        C8486a c8486a = this.disposables;
        CartService cartService = this.cartService;
        Map<String, TokenizedTrackingInfo> trackingInfo = atom.getTrackingInfo();
        ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
        RxExtKt.plusAssign(c8486a, RxExtKt.subscribeBy$default(CartService.DefaultImpls.removeProductFromCart$default(cartService, str, intValue, action2 != null ? action2.getSelectedDeliverySchema() : null, trackingInfo, widgetId, null, null, 96, null), null, cartAtomBinder$onAddToCartButtonWithQuantity$errorListener$1, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> toParams(ButtonV3Atom.Extend extend) {
        if (extend != null) {
            return C2454a.b("enum", extend.toString());
        }
        return null;
    }

    public final void bind(@NotNull SingleAtom atomView, @NotNull AtomDTO atom, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (!(atom instanceof ButtonV3Atom.AddToCartAtom)) {
            SingleAtom.bind$default(atomView, atom, false, 2, null);
            atomView.setOnAction(actionHandler);
            return;
        }
        ButtonV3Atom.AddToCartAtom addToCartAtom = (ButtonV3Atom.AddToCartAtom) atom;
        this.atomState = new CartAtomViewState(addToCartAtom, true);
        this.atomViewRef = new WeakReference<>(atomView);
        ButtonV3Atom.AddToCartAtom.Action action = addToCartAtom.getAction();
        this.productId = action != null ? action.getId() : null;
        attachAnalytics(tokenizedAnalytics);
        SingleAtom.bind$default(atomView, atom, false, 2, null);
        appendLocator(atomView, addToCartAtom);
        atomView.setOnAction(new CartAtomBinder$bind$1(this, widgetId, actionHandler));
    }

    public final void bindAdult(boolean adult) {
        this.isAdult = adult;
    }

    public final void clear() {
        this.atomState = null;
        this.productId = null;
        unbind();
    }

    public final void init(@NotNull SingleAtom view, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.atomViewRef = new WeakReference<>(view);
        attachAnalytics(tokenizedAnalytics);
        this.disposables.d();
        C8486a c8486a = this.disposables;
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a()).subscribe(new BT.b(new CartAtomBinder$init$1(this), 2), new c(new CartAtomBinder$init$2(a.f17149a), 3));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    public final void setAdultDialogCommitListener(Function0<Unit> function0) {
        this.adultDialogCommitListener = function0;
    }

    public final void unbind() {
        WeakReference<SingleAtom> weakReference = this.atomViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.disposables.d();
    }
}
