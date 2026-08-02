package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler;

import De.s;
import Nh.a;
import Sc.InterfaceC4008j;
import Sc.k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/actionHandler/RemoveSelectionItemProductActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventManager", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;)V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "SelectionProductRemoveResponse", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveSelectionItemProductActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final SelectionProductsEventManager selectionProductsEventManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC4008j<M> coroutineScope$delegate = k.b(RemoveSelectionItemProductActionHandler$Companion$coroutineScope$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/actionHandler/RemoveSelectionItemProductActionHandler$Companion;", "", "<init>", "()V", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "", "ACTION_ID", "Ljava/lang/String;", "SKU_PARAM", "SELECTION_UUID_PARAM", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final M getCoroutineScope() {
            return (M) RemoveSelectionItemProductActionHandler.coroutineScope$delegate.getValue();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/actionHandler/RemoveSelectionItemProductActionHandler$SelectionProductRemoveResponse;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class SelectionProductRemoveResponse {
        public static final int $stable = NotificationDTO.$stable;
        private final NotificationDTO notification;

        public SelectionProductRemoveResponse(NotificationDTO notificationDTO) {
            this.notification = notificationDTO;
        }

        public static /* synthetic */ SelectionProductRemoveResponse copy$default(SelectionProductRemoveResponse selectionProductRemoveResponse, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = selectionProductRemoveResponse.notification;
            }
            return selectionProductRemoveResponse.copy(notificationDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getNotification() {
            return this.notification;
        }

        @NotNull
        public final SelectionProductRemoveResponse copy(NotificationDTO notification) {
            return new SelectionProductRemoveResponse(notification);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectionProductRemoveResponse) && Intrinsics.d(this.notification, ((SelectionProductRemoveResponse) other).notification);
        }

        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public int hashCode() {
            NotificationDTO notificationDTO = this.notification;
            if (notificationDTO == null) {
                return 0;
            }
            return notificationDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("SelectionProductRemoveResponse(notification=", ")", this.notification);
        }
    }

    public RemoveSelectionItemProductActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull SelectionProductsEventManager selectionProductsEventManager) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(selectionProductsEventManager, "selectionProductsEventManager");
        this.actionV2Repository = actionV2Repository;
        this.selectionProductsEventManager = selectionProductsEventManager;
        this.actionId = "removeSelectionItemProduct";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new RemoveSelectionItemProductActionHandler$createActionHandler$1(handlerRefs), new RemoveSelectionItemProductActionHandler$createActionHandler$2(handlerRefs)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.collapse_widget_notification_warning_title_android), StringProvider.getString(ru.ozon.app.android.pdp.ui.configurators.R$string.reviews_try_again_later), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showNotification(CustomActionHandler.HandlerReferences handlerReferences, NotificationDTO notificationDTO, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new RemoveSelectionItemProductActionHandler$showNotification$2(handlerReferences, notificationDTO, this, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    static /* synthetic */ Object showNotification$default(RemoveSelectionItemProductActionHandler removeSelectionItemProductActionHandler, CustomActionHandler.HandlerReferences handlerReferences, NotificationDTO notificationDTO, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            notificationDTO = null;
        }
        return removeSelectionItemProductActionHandler.showNotification(handlerReferences, notificationDTO, dVar);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        Map<String, String> params;
        String str;
        Long y02;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.ComposerAction) || (params = (composerAction = (AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        long longValue = y02.longValue();
        Map<String, String> params2 = composerAction.getParams();
        if (params2 == null || (str2 = params2.get("selectionUuid")) == null) {
            return;
        }
        String actionName = composerAction.getActionName();
        Object params3 = composerAction.getParams();
        if (params3 == null) {
            params3 = new JSONObject();
        }
        ActionV2Request actionV2Request = new ActionV2Request(params3, actionName, false, 4, null);
        this.selectionProductsEventManager.onSelectionProductsChanged(new SelectionProductEvent.ProductRemovalStarted(longValue, str2));
        C10727i.c(Companion.getCoroutineScope(), null, null, new RemoveSelectionItemProductActionHandler$processAction$1(this, actionV2Request, handlerRefs, longValue, str2, null), 3);
    }
}
