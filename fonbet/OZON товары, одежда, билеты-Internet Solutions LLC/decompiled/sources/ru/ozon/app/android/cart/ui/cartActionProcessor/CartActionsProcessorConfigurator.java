package ru.ozon.app.android.cart.ui.cartActionProcessor;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.FreshAddToCartRetryHandler;
import ru.ozon.app.android.cart.common.domain.FreshAddToCartRetryHandlerKt;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.domain.NotificationDelegate;
import ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers.CartActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R$\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/cart/ui/cartActionProcessor/CartActionsProcessorConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartProvider", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;LVg/d;LPc/a;)V", "Lru/ozon/app/android/cart/common/models/CartAction;", "action", "", "observeActions", "(Lru/ozon/app/android/cart/common/models/CartAction;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "references", "Lru/ozon/app/android/cart/common/models/CartAction$CartShowRestriction;", "showRestriction", "(Lru/ozon/app/android/composer/ConfiguratorReferences;Lru/ozon/app/android/cart/common/models/CartAction$CartShowRestriction;)V", "refs", "", "deeplink", "dismissBottomSheetDialog", "(Lru/ozon/app/android/composer/ConfiguratorReferences;Ljava/lang/String;)V", "onComposerInitialized", "()V", "Lru/ozon/app/android/cart/common/domain/CartService;", "LVg/d;", "Lru/ozon/app/android/cart/common/di/CartComponentApi;", "component$delegate", "LSc/j;", "getComponent", "()Lru/ozon/app/android/cart/common/di/CartComponentApi;", "component", "Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;", "freshAddToCartRetryHandler$delegate", "getFreshAddToCartRetryHandler", "()Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;", "freshAddToCartRetryHandler", "Lru/ozon/app/android/cart/domain/NotificationDelegate;", "notification$delegate", "getNotification", "()Lru/ozon/app/android/cart/domain/NotificationDelegate;", "notification", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartActionsProcessorConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final CartService cartService;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j component;

    @NotNull
    private final d customActionHandlersStoreFactory;

    /* renamed from: freshAddToCartRetryHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j freshAddToCartRetryHandler;

    /* renamed from: notification$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notification;

    public CartActionsProcessorConfigurator(@NotNull CartService cartService, @NotNull d customActionHandlersStoreFactory, @NotNull a<AddToCartViewModel> addToCartProvider) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(addToCartProvider, "addToCartProvider");
        this.cartService = cartService;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.component = k.b(new CartActionsProcessorConfigurator$component$2(this));
        this.freshAddToCartRetryHandler = k.b(new CartActionsProcessorConfigurator$freshAddToCartRetryHandler$2(this));
        this.notification = k.b(new CartActionsProcessorConfigurator$notification$2(this, addToCartProvider));
    }

    private final void dismissBottomSheetDialog(ConfiguratorReferences refs, String deeplink) {
        ComponentCallbacksC5392m parentFragment;
        G parentFragmentManager;
        G d11 = refs.getOwnerContainer().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        ComponentCallbacksC5392m g02 = d11 != null ? d11.g0(deeplink) : null;
        ComponentCallbacksC5392m c11 = refs.getOwnerContainer().c();
        if (c11 != null && (parentFragment = c11.getParentFragment()) != null && (parentFragmentManager = parentFragment.getParentFragmentManager()) != null) {
            componentCallbacksC5392m = parentFragmentManager.g0(deeplink);
        }
        if (g02 instanceof DialogInterfaceOnCancelListenerC5390k) {
            ((DialogInterfaceOnCancelListenerC5390k) g02).dismiss();
        } else if (componentCallbacksC5392m instanceof DialogInterfaceOnCancelListenerC5390k) {
            ((DialogInterfaceOnCancelListenerC5390k) componentCallbacksC5392m).dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartComponentApi getComponent() {
        return (CartComponentApi) this.component.getValue();
    }

    private final FreshAddToCartRetryHandler getFreshAddToCartRetryHandler() {
        return (FreshAddToCartRetryHandler) this.freshAddToCartRetryHandler.getValue();
    }

    private final NotificationDelegate getNotification() {
        return (NotificationDelegate) this.notification.getValue();
    }

    private final void observeActions(CartAction action) {
        Function1<? super AtomAction, Unit> function1;
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        if (action instanceof CartAction.CartShowNotificationBar) {
            getNotification().show(((CartAction.CartShowNotificationBar) action).getNotificationBar());
            return;
        }
        if (action instanceof CartAction.CartShowRestriction) {
            showRestriction(references, (CartAction.CartShowRestriction) action);
            return;
        }
        if (action instanceof CartAction.CartOpenSheetDeeplink) {
            CartAction.CartOpenSheetDeeplink cartOpenSheetDeeplink = (CartAction.CartOpenSheetDeeplink) action;
            dismissBottomSheetDialog(references, cartOpenSheetDeeplink.getDeeplink());
            getFreshAddToCartRetryHandler().saveAddressPopUpProducts(FreshAddToCartRetryHandlerKt.mapItemsToProducts(cartOpenSheetDeeplink.getProducts()));
            ComposerNavigator.DefaultImpls.openDeeplink$default(references.getNavigator(), cartOpenSheetDeeplink.getDeeplink(), null, 2, null);
            return;
        }
        if (!(action instanceof CartAction.Action) || (function1 = this.actionHandler) == null) {
            return;
        }
        function1.invoke(AtomActionMapperKt.toAtomAction(((CartAction.Action) action).getAction(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onComposerInitialized$observeActions(CartActionsProcessorConfigurator cartActionsProcessorConfigurator, CartAction cartAction, kotlin.coroutines.d dVar) {
        cartActionsProcessorConfigurator.observeActions(cartAction);
        return Unit.f71690a;
    }

    private final void showRestriction(ConfiguratorReferences references, CartAction.CartShowRestriction action) {
        C4911f ownerContainer = references.getOwnerContainer();
        ViewGroup rootView = ContextExtKt.getRootView(ownerContainer.j());
        if (rootView != null) {
            RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(action.getRestriction()), ownerContainer.g(), null, this.actionHandler, null, null, null, 232, null);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C2399j.C(new C2408n0(this.cartService.getCartActionsFlow(), new CartActionsProcessorConfigurator$onComposerInitialized$1(this)), K.a(getOwner()));
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        this.actionHandler = new CartActionHandler.Builder(((RetainComposerComponentApi) references.getComposerWidgetComponentStorage().getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(references.getOwnerContainer(), references.getViewModelOwnerProvider())).customActionHandlers(new CartActionsProcessorConfigurator$onComposerInitialized$2(this)).buildHandler();
    }
}
