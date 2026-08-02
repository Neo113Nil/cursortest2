package ru.ozon.app.android.delivery.customActionsHandlers.openNotificationSettings;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.notifications.utils.NotificationHelper;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/openNotificationSettings/OpenNotificationSettingsActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "notificationsHandler", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "<init>", "(Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "openNotificationSettingsAndPopBackStack", "context", "Landroid/content/Context;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenNotificationSettingsActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final EnableNotificationsSuggestingHandler notificationsHandler;

    public OpenNotificationSettingsActionHandler(@NotNull EnableNotificationsSuggestingHandler notificationsHandler) {
        Intrinsics.checkNotNullParameter(notificationsHandler, "notificationsHandler");
        this.notificationsHandler = notificationsHandler;
        this.actionId = "enableNotifications";
    }

    private final void openNotificationSettingsAndPopBackStack(Context context, CustomActionHandler.HandlerReferences handlerRefs) {
        NotificationHelper.INSTANCE.openNotificationsSettings(context);
        handlerRefs.getRefs().getNavigator().popBackStack();
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
        boolean isSystemNotificationsTurnedOn = NotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(handlerRefs.getRefs().getContainer().i());
        if (!(action instanceof AtomAction.Click) || isSystemNotificationsTurnedOn) {
            return;
        }
        r i11 = handlerRefs.getRefs().getContainer().i();
        if (Build.VERSION.SDK_INT < 33) {
            openNotificationSettingsAndPopBackStack(i11, handlerRefs);
            return;
        }
        if (PermissionExtensionsKt.isPermissionGranted(i11, "android.permission.POST_NOTIFICATIONS")) {
            return;
        }
        if (this.notificationsHandler.isPermissionForPushNotificationsForApiMoreThan32Requested()) {
            openNotificationSettingsAndPopBackStack(i11, handlerRefs);
        } else {
            this.notificationsHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
            ActivitiesKt.requestPermission(handlerRefs.getRefs().getContainer().i(), new OpenNotificationSettingsActionHandler$processAction$1(handlerRefs));
        }
    }
}
