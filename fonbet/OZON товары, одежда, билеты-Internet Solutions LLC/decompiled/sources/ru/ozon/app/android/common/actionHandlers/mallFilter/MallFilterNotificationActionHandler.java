package ru.ozon.app.android.common.actionHandlers.mallFilter;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u0004\u0018\u00010\u001a*\u00020\bH\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\f2\u0006\u0010\t\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/mallFilter/MallFilterNotificationActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Landroid/content/SharedPreferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "requestNotification", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "showErrorNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "saveViewCount", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "isRequestNeeded", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "", "getOnboardingKey", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/lang/String;", "", "getOnboardingCount", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/lang/Integer;", "getRefreshLink", "resetScope", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroid/content/SharedPreferences;", "Lxe/M;", "scope", "Lxe/M;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MallFilterNotificationActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private M scope;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/mallFilter/MallFilterNotificationActionHandler$Companion;", "", "<init>", "()V", "NOTIFICATION_ONBOARDING_COUNT_PARAM", "", "NOTIFICATION_ONBOARDING_KEY", "NOTIFICATION_ONBOARDING_DEFAULT_COUNT", "", "FILTER_REFRESH_PARAM", "ACTION_ID", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MallFilterNotificationActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.actionV2Repository = actionV2Repository;
        this.sharedPreferences = sharedPreferences;
        this.actionId = "showMallFilterNotification";
    }

    private final Integer getOnboardingCount(AtomAction.ComposerAction composerAction) {
        String str;
        Map<String, String> params = composerAction.getParams();
        if (params == null || (str = params.get("onboardingCount")) == null) {
            return null;
        }
        return h.w0(str);
    }

    private final String getOnboardingKey(AtomAction.ComposerAction composerAction) {
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            return params.get("onboardingKey");
        }
        return null;
    }

    private final String getRefreshLink(AtomAction.ComposerAction composerAction) {
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            return params.get("refreshLink");
        }
        return null;
    }

    private final boolean isRequestNeeded(AtomAction.ComposerAction action) {
        Integer onboardingCount;
        String onboardingKey = getOnboardingKey(action);
        if (onboardingKey != null && (onboardingCount = getOnboardingCount(action)) != null) {
            if (this.sharedPreferences.getInt(onboardingKey, 0) < onboardingCount.intValue()) {
                return true;
            }
        }
        return false;
    }

    private final void requestNotification(AtomAction.ComposerAction action, CustomActionHandler.HandlerReferences handlerRefs) {
        resetScope();
        M m11 = this.scope;
        if (m11 != null) {
            C10727i.c(m11, null, null, new MallFilterNotificationActionHandler$requestNotification$1(action, this, handlerRefs, null), 3);
        }
    }

    private final void resetScope() {
        M m11 = this.scope;
        if (m11 != null) {
            N.c(m11, null);
        }
        this.scope = CoroutineUtilsKt.getSafeScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveViewCount(AtomAction.ComposerAction action) {
        String onboardingKey = getOnboardingKey(action);
        if (onboardingKey == null) {
            return;
        }
        int i11 = this.sharedPreferences.getInt(onboardingKey, 0);
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(onboardingKey, i11 + 1);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(CustomActionHandler.HandlerReferences handlerRefs) {
        showNotificationBar(new NotificationDTO(StringProvider.getString(R$string.collapse_widget_notification_warning_title_android), StringProvider.getString(R$string.collapse_widget_notification_warning_subtitle_android), 0, 0, null, null, null, null, null, NotificationDTO.Preset.WARNING, 496, null), handlerRefs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationBar(NotificationModelWrapper notification, CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup composerContainer;
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().i());
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(composerContainer, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(composerContainer, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager, notification, handlerRefs.getRefs().getContainer().i(), null, 8, null).show();
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
            if (isRequestNeeded(composerAction)) {
                requestNotification(composerAction, handlerRefs);
            }
            InterfaceC7851b.a.a(handlerRefs.getRefs().getController(), getRefreshLink(composerAction), null, null, null, 14);
        }
    }
}
