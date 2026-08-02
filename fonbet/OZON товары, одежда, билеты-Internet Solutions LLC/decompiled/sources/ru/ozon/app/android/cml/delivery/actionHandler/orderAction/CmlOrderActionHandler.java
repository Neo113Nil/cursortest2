package ru.ozon.app.android.cml.delivery.actionHandler.orderAction;

import Sc.s;
import Vg.d;
import W10.c;
import Wc.a;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.l;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/orderAction/CmlOrderActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lru/ozon/app/android/cml/delivery/actionHandler/orderAction/CmlOrderActionResponseDTO;", "callActionWithLoading", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "Lru/ozon/uni/atoms/af/AtomAction;", "successAction", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lkotlin/Function1;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showError", "(La00/f;)V", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/B0;", "actionJob", "Lxe/B0;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlOrderActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;
    private B0 actionJob;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;

    public CmlOrderActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionId = "cmlOrderAction";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callActionWithLoading(AtomAction.ComposerAction composerAction, CustomActionHandler.HandlerReferences handlerReferences, kotlin.coroutines.d<? super CmlOrderActionResponseDTO> dVar) {
        CmlOrderActionHandler$callActionWithLoading$1 cmlOrderActionHandler$callActionWithLoading$1;
        int i11;
        Exception exc;
        CmlOrderActionHandler cmlOrderActionHandler;
        Exception exc2;
        Tc.d builder;
        try {
            try {
                if (dVar instanceof CmlOrderActionHandler$callActionWithLoading$1) {
                    cmlOrderActionHandler$callActionWithLoading$1 = (CmlOrderActionHandler$callActionWithLoading$1) dVar;
                    int i12 = cmlOrderActionHandler$callActionWithLoading$1.label;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        cmlOrderActionHandler$callActionWithLoading$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = cmlOrderActionHandler$callActionWithLoading$1.result;
                        a aVar = a.COROUTINE_SUSPENDED;
                        i11 = cmlOrderActionHandler$callActionWithLoading$1.label;
                        if (i11 != 0) {
                            s.b(obj);
                            try {
                                handlerReferences.getRefs().getController().e(new l.a.C1079a(0L, null, 3));
                                try {
                                    builder = new Tc.d();
                                    builder.putAll(PreorderParamsStore.INSTANCE.getPreorderParams());
                                    Map<String, String> params = composerAction.getParams();
                                    if (params == null) {
                                        params = U.c();
                                    }
                                    builder.putAll(params);
                                } catch (Exception e11) {
                                    exc2 = e11;
                                }
                            } catch (Exception e12) {
                                exc = e12;
                            }
                            try {
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                Tc.d u11 = builder.u();
                                ActionV2Repository actionV2Repository = this.actionV2Repository;
                                ActionV2Request actionV2Request = new ActionV2Request(u11, composerAction.getActionName(), false, 4, null);
                                c trackingData = handlerReferences.getTrackingData();
                                if (trackingData == null) {
                                    trackingData = new c(null, null, null);
                                }
                                cmlOrderActionHandler$callActionWithLoading$1.L$0 = this;
                                cmlOrderActionHandler$callActionWithLoading$1.L$1 = handlerReferences;
                                cmlOrderActionHandler$callActionWithLoading$1.label = 1;
                                obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, CmlOrderActionResponseDTO.class, cmlOrderActionHandler$callActionWithLoading$1);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                cmlOrderActionHandler = this;
                            } catch (Exception e13) {
                                exc2 = e13;
                                exc = exc2;
                                cmlOrderActionHandler = this;
                                Lm0.a.f17149a.e(exc);
                                cmlOrderActionHandler.showError(handlerReferences.getRefs().getContainer());
                                handlerReferences.getRefs().getController().hideLoader();
                                return null;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            handlerReferences = (CustomActionHandler.HandlerReferences) cmlOrderActionHandler$callActionWithLoading$1.L$1;
                            cmlOrderActionHandler = (CmlOrderActionHandler) cmlOrderActionHandler$callActionWithLoading$1.L$0;
                            try {
                                s.b(obj);
                            } catch (Exception e14) {
                                exc = e14;
                                Lm0.a.f17149a.e(exc);
                                cmlOrderActionHandler.showError(handlerReferences.getRefs().getContainer());
                                handlerReferences.getRefs().getController().hideLoader();
                                return null;
                            }
                        }
                        CmlOrderActionResponseDTO cmlOrderActionResponseDTO = (CmlOrderActionResponseDTO) ((ActionV2Response) obj).getData();
                        handlerReferences.getRefs().getController().hideLoader();
                        return cmlOrderActionResponseDTO;
                    }
                }
                if (i11 != 0) {
                }
                CmlOrderActionResponseDTO cmlOrderActionResponseDTO2 = (CmlOrderActionResponseDTO) ((ActionV2Response) obj).getData();
                handlerReferences.getRefs().getController().hideLoader();
                return cmlOrderActionResponseDTO2;
            } catch (Throwable th2) {
                handlerReferences.getRefs().getController().hideLoader();
                throw th2;
            }
        } catch (CancellationException e15) {
            throw e15;
        }
        cmlOrderActionHandler$callActionWithLoading$1 = new CmlOrderActionHandler$callActionWithLoading$1(this, dVar);
        Object obj2 = cmlOrderActionHandler$callActionWithLoading$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cmlOrderActionHandler$callActionWithLoading$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new CmlOrderActionHandler$createActionHandler$1(handlerRefs), new CmlOrderActionHandler$createActionHandler$2(handlerRefs)).customActionHandlers(new CmlOrderActionHandler$createActionHandler$3(this)).buildHandler();
    }

    private final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notificationBar, AtomAction successAction, CustomActionHandler.HandlerReferences handlerRefs) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        C4911f container = handlerRefs.getRefs().getContainer();
        if ((successAction instanceof AtomAction.DismissAndScroll) || (successAction instanceof AtomAction.DismissRedirect) || (successAction instanceof AtomAction.DismissRefresh) || (successAction instanceof AtomAction.Dismiss)) {
            rootView = ContextExtKt.getRootView(container.a());
        } else {
            ComponentCallbacksC5392m c11 = container.c();
            rootView = c11 != null ? c11.getView() : null;
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notificationBar, container.i(), createActionHandler(handlerRefs)).show();
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
            D a11 = K.a(handlerRefs.getRefs().getContainer().g());
            B0 b02 = this.actionJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.actionJob = C10727i.c(a11, null, null, new CmlOrderActionHandler$processAction$1(this, action, handlerRefs, null), 3);
        }
    }
}
