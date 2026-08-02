package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile;

import Vg.d;
import a00.C4911f;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u0018*\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u001a\u0010%\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPostMobile/SubmitBloggerPostActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDto", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "responseAction", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/atoms/af/AtomAction;)V", "getErrorNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lkotlin/Function1;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "", "buildBloggerPostParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "processAction", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubmitBloggerPostActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;

    public SubmitBloggerPostActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionId = "submitBloggerPostMobile";
    }

    private final Map<String, Object> buildBloggerPostParams(AtomAction.ComposerAction action) {
        Tc.d builder = new Tc.d();
        Map<String, String> params = action.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerReferences) {
        return new ActionHandler.Builder(handlerReferences.getRefs(), handlerReferences.getNestedPagesProvider(), new SubmitBloggerPostActionHandler$createActionHandler$1(handlerReferences), new SubmitBloggerPostActionHandler$createActionHandler$2(handlerReferences)).customActionHandlers(new SubmitBloggerPostActionHandler$createActionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getErrorNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.reviews_try_again_later_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences) {
        createActionHandler(handlerReferences).invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notificationDto, ComposerReferences refs, AtomAction responseAction) {
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        C4911f container = refs.getContainer();
        ViewGroup rootView = responseAction != null ? ContextExtKt.getRootView(container.a()) : ContextExtKt.getRootView(container.c());
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationDto, container.i(), null, 8, null).show();
    }

    static /* synthetic */ void showNotification$default(SubmitBloggerPostActionHandler submitBloggerPostActionHandler, NotificationDTO notificationDTO, ComposerReferences composerReferences, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            atomAction = null;
        }
        submitBloggerPostActionHandler.showNotification(notificationDTO, composerReferences, atomAction);
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
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new SubmitBloggerPostActionHandler$processAction$1(handlerRefs.getRefs().getController(), this, new ActionV2Request(buildBloggerPostParams(composerAction), composerAction.getActionName(), false, 4, null), handlerRefs, null), 3);
        }
    }
}
