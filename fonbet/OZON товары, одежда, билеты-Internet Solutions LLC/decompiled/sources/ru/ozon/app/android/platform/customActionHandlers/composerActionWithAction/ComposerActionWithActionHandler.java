package ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction;

import Sc.o;
import Tg.b;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.customActionHandlers.R$string;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.platform.di.module.ComposerActionWithActionErrorsNewAnchorEnabled;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.H0;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b'\u0010(J+\u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001fH\u0004¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/view/View;", "parent", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "getNotificationLayoutManager", "(Landroid/view/View;La00/f;)Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "", "showMessage", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "showError", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LTg/b;", "atomAction", "handleAction", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;LTg/b;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "mapToAtomAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)LTg/b;", "Lkotlin/Function1;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "dataAction", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;LTg/b;)V", "getParentView", "(La00/f;LTg/b;)Landroid/view/View;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ComposerActionWithActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureChecker featureChecker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler$Companion;", "", "<init>", "()V", "SHOW_LOADING_STATE", "", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
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

    public ComposerActionWithActionHandler(@NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appType = appType;
        this.actionV2Repository = actionV2Repository;
        this.featureChecker = featureChecker;
        this.actionId = "composerActionWithAction";
    }

    private final NotificationLayoutManager getNotificationLayoutManager(View parent, C4911f container) {
        if (parent == null) {
            return null;
        }
        try {
            ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(parent);
            if (composerContainer != null) {
                return CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null);
            }
            return null;
        } catch (NullPointerException unused) {
            ViewGroup rootView = ContextExtKt.getRootView(container.a());
            if (rootView != null) {
                return CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView;
        if (this.featureChecker.isEnabled(ComposerActionWithActionErrorsNewAnchorEnabled.INSTANCE)) {
            rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().c());
            if (rootView == null && (rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().a())) == null) {
                return;
            }
        } else {
            rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().a());
            if (rootView == null) {
                return;
            }
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationDTO notificationDTO = new NotificationDTO(StringProvider.getString(R$string.common_something_went_wrong_android), StringProvider.getString(R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 508, null);
        J a11 = C0.a(rootView);
        if (a11 == null) {
            return;
        }
        companion.make(asNotificationLayoutManager$default, notificationDTO, a11, createActionHandler(handlerRefs)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(CustomActionHandler.HandlerReferences handlerRefs, ComposerActionWithActionDTO.MessageDTO message) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationDTO.Preset preset;
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().a());
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        String message2 = message.getMessage();
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            preset = NotificationDTO.Preset.CUSTOM;
        } else if (i11 == 2) {
            preset = NotificationDTO.Preset.SUCCESS;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            preset = NotificationDTO.Preset.WARNING;
        }
        companion.make(asNotificationLayoutManager$default, new NotificationDTO(message2, null, null, null, null, null, null, null, null, preset, 478, null), handlerRefs.getRefs().getContainer().i(), createActionHandler(handlerRefs)).show();
    }

    @NotNull
    protected Function1<AtomAction, Unit> createActionHandler(@NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new ComposerActionWithActionHandler$createActionHandler$1(handlerRefs), new ComposerActionWithActionHandler$createActionHandler$2(handlerRefs)).buildHandler();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    protected final View getParentView(@NotNull C4911f container, b dataAction) {
        Intrinsics.checkNotNullParameter(container, "container");
        if ((dataAction instanceof AtomAction.DismissAndScroll) || (dataAction instanceof AtomAction.DismissRedirect) || (dataAction instanceof AtomAction.DismissRefresh) || (dataAction instanceof AtomAction.Dismiss)) {
            return ContextExtKt.getRootView(container.a());
        }
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 != null) {
            return c11.getView();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void handleAction(@NotNull CustomActionHandler.HandlerReferences handlerRefs, b atomAction) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (atomAction instanceof AtomAction) {
            createActionHandler(handlerRefs).invoke(atomAction);
        }
    }

    @NotNull
    protected b mapToAtomAction(@NotNull AtomActionDTO atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        return AtomActionMapperKt.toAtomAction(atomAction, null);
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            InterfaceC7851b controller = handlerRefs.getRefs().getController();
            C4911f container = handlerRefs.getRefs().getContainer();
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            ActionV2Request actionV2Request = new ActionV2Request(composerAction.getParams(), composerAction.getActionName(), false, 4, null);
            Map<String, String> params = composerAction.getParams();
            boolean parseBoolean = (params == null || (str = params.get("showLoadingState")) == null) ? true : Boolean.parseBoolean(str);
            if (parseBoolean) {
                controller.e(new l.a.C1079a(0L, null, 3));
            }
            ((H0) C10727i.c(K.a(container.g()), null, null, new ComposerActionWithActionHandler$processAction$1(this, actionV2Request, handlerRefs, null), 3)).y(new ComposerActionWithActionHandler$processAction$2(parseBoolean, controller));
        }
    }

    protected void showNotification(@NotNull NotificationDTO notification, @NotNull CustomActionHandler.HandlerReferences handlerRefs, b dataAction) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        C4911f container = handlerRefs.getRefs().getContainer();
        NotificationLayoutManager notificationLayoutManager = getNotificationLayoutManager(getParentView(container, dataAction), container);
        if (notificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(notificationLayoutManager, notification, container.i(), createActionHandler(handlerRefs)).show();
    }
}
