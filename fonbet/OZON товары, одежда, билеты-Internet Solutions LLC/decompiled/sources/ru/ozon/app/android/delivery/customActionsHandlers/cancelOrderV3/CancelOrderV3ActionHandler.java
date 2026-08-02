package ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3;

import Ge.f;
import Sc.o;
import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.l;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u00112\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00112\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u001a\u0010/\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/cancelOrderV3/CancelOrderV3ActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "cacheHandler", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "response", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleSuccess", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "showMessage", "(La00/f;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "Lkotlin/Pair;", "", "", "getMessageIcon", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)Lkotlin/Pair;", "showError", "(La00/f;)V", "clearCart", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CancelOrderV3ActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CartPrefetchController cacheHandler;

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final CartService cartService;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CancelOrderV3ActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull CartPrefetchController cacheHandler, @NotNull CartService cartService, @NotNull CartEventsController cartEventsController) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(cacheHandler, "cacheHandler");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        this.actionV2Repository = actionV2Repository;
        this.cacheHandler = cacheHandler;
        this.cartService = cartService;
        this.cartEventsController = cartEventsController;
        this.actionId = "composerActionWithAction";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        Lm0.a.f17149a.e(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearCart(d<? super Unit> dVar) {
        CancelOrderV3ActionHandler$clearCart$1 cancelOrderV3ActionHandler$clearCart$1;
        int i11;
        if (dVar instanceof CancelOrderV3ActionHandler$clearCart$1) {
            cancelOrderV3ActionHandler$clearCart$1 = (CancelOrderV3ActionHandler$clearCart$1) dVar;
            int i12 = cancelOrderV3ActionHandler$clearCart$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cancelOrderV3ActionHandler$clearCart$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cancelOrderV3ActionHandler$clearCart$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cancelOrderV3ActionHandler$clearCart$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.cacheHandler.clearCache(CartPrefetchController.ClearCacheReason.CANCEL_ORDER_HANDLER_V3);
                    this.cartEventsController.setEvent(CartRefreshReason.CancelOrder.INSTANCE);
                    AbstractC7094b updateCart$default = CartService.DefaultImpls.updateCart$default(this.cartService, null, null, 3, null);
                    cancelOrderV3ActionHandler$clearCart$1.label = 1;
                    if (f.a(updateCart$default, cancelOrderV3ActionHandler$clearCart$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        cancelOrderV3ActionHandler$clearCart$1 = new CancelOrderV3ActionHandler$clearCart$1(this, dVar);
        Object obj2 = cancelOrderV3ActionHandler$clearCart$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cancelOrderV3ActionHandler$clearCart$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    private final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new CancelOrderV3ActionHandler$createActionHandler$1(handlerRefs), new CancelOrderV3ActionHandler$createActionHandler$2(handlerRefs)).buildHandler();
    }

    private final Pair<Integer, String> getMessageIcon(ComposerActionWithActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return new Pair<>(null, null);
        }
        if (i11 == 2) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_check_green), UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken());
        }
        if (i11 == 3) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_warning), UniColors.GRAPHIC_WARNING_PRIMARY.getToken());
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccess(ActionV2Response<ComposerActionWithActionDTO> response, CustomActionHandler.HandlerReferences handlerRefs) {
        ComposerActionWithActionDTO.MessageDTO message;
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        AtomActionDTO action;
        C4911f container = handlerRefs.getRefs().getContainer();
        ComposerActionWithActionDTO data = response.getData();
        NotificationDTO notificationBar = data != null ? data.getNotificationBar() : null;
        ComposerActionWithActionDTO data2 = response.getData();
        AtomAction atomAction = (data2 == null || (action = data2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
        if (notificationBar != null) {
            if ((atomAction instanceof AtomAction.DismissAndScroll) || (atomAction instanceof AtomAction.DismissRedirect) || (atomAction instanceof AtomAction.DismissRefresh) || (atomAction instanceof AtomAction.Dismiss)) {
                rootView = ContextExtKt.getRootView(container.a());
            } else {
                ComponentCallbacksC5392m c11 = container.c();
                rootView = c11 != null ? c11.getView() : null;
            }
            if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
                return;
            } else {
                NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notificationBar, container.i(), createActionHandler(handlerRefs)).show();
            }
        } else {
            ComposerActionWithActionDTO data3 = response.getData();
            if (data3 != null && (message = data3.getMessage()) != null) {
                showMessage(container, message);
            }
        }
        if (atomAction != null) {
            createActionHandler(handlerRefs).invoke(atomAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void showMessage(C4911f container, ComposerActionWithActionDTO.MessageDTO message) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        Pair<Integer, String> messageIcon = getMessageIcon(message);
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message.getMessage()), null, null, messageIcon.a(), null, messageIcon.b(), null, null, null, null, null, 3000L, null, null, container.g(), 57178, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            InterfaceC7851b controller = handlerRefs.getRefs().getController();
            controller.e(new l.a.C1079a(0L, null, 3));
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new CancelOrderV3ActionHandler$processAction$1(action, this, handlerRefs, controller, new ActionV2Request(composerAction.getParams(), composerAction.getActionName(), false, 4, null), null), 3);
        }
    }
}
