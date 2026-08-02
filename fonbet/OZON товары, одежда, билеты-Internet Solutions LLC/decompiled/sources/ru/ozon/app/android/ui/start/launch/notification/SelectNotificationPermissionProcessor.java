package ru.ozon.app.android.ui.start.launch.notification;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.ui.start.EmptyDeeplink;
import ru.ozon.app.android.ui.start.LaunchDeeplink;
import ru.ozon.app.android.ui.start.RequestNotificationPermission;
import ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ui/start/launch/notification/SelectNotificationPermissionProcessor;", "Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "firstLaunchStateStorage", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;Landroid/content/Context;)V", "priority", "", "getPriority", "()I", "start", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectNotificationPermissionProcessor implements LauncherStateDialogProcessor {

    @NotNull
    private final Context context;

    @NotNull
    private final FirstLaunchStateStorage firstLaunchStateStorage;
    private final int priority;

    public SelectNotificationPermissionProcessor(@NotNull FirstLaunchStateStorage firstLaunchStateStorage, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(firstLaunchStateStorage, "firstLaunchStateStorage");
        Intrinsics.checkNotNullParameter(context, "context");
        this.firstLaunchStateStorage = firstLaunchStateStorage;
        this.context = context;
        this.priority = 2;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    public int getPriority() {
        return this.priority;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    @NotNull
    public LaunchDeeplink start() {
        boolean z11 = Build.VERSION.SDK_INT >= 33;
        boolean notificationPermissionRequested = this.firstLaunchStateStorage.getNotificationPermissionRequested();
        boolean isPermissionGranted = PermissionExtensionsKt.isPermissionGranted(this.context, "android.permission.POST_NOTIFICATIONS");
        if (!z11 || notificationPermissionRequested || isPermissionGranted) {
            return EmptyDeeplink.INSTANCE;
        }
        this.firstLaunchStateStorage.setNotificationPermissionRequested(true);
        return RequestNotificationPermission.INSTANCE;
    }
}
