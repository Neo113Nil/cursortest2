package ru.ozon.app.android.ui.start.launch.notification;

import Ib.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.start.LaunchDeeplink;
import ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ui/start/launch/notification/RequestNotificationPermissionProcessor;", "Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "LIb/a;", "Lru/ozon/app/android/ui/start/launch/notification/BxNotificationPermissionProcessor;", "bxNotificationPermissionProcessor", "Lru/ozon/app/android/ui/start/launch/notification/SelectNotificationPermissionProcessor;", "selectNotificationPermissionProcessor", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(LIb/a;LIb/a;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "start", "()Lru/ozon/app/android/ui/start/LaunchDeeplink;", "LIb/a;", "Lru/ozon/app/android/utils/AppType;", "", "priority", "I", "getPriority", "()I", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RequestNotificationPermissionProcessor implements LauncherStateDialogProcessor {

    @NotNull
    private final AppType appType;

    @NotNull
    private final a<BxNotificationPermissionProcessor> bxNotificationPermissionProcessor;
    private final int priority;

    @NotNull
    private final a<SelectNotificationPermissionProcessor> selectNotificationPermissionProcessor;

    public RequestNotificationPermissionProcessor(@NotNull a<BxNotificationPermissionProcessor> bxNotificationPermissionProcessor, @NotNull a<SelectNotificationPermissionProcessor> selectNotificationPermissionProcessor, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(bxNotificationPermissionProcessor, "bxNotificationPermissionProcessor");
        Intrinsics.checkNotNullParameter(selectNotificationPermissionProcessor, "selectNotificationPermissionProcessor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.bxNotificationPermissionProcessor = bxNotificationPermissionProcessor;
        this.selectNotificationPermissionProcessor = selectNotificationPermissionProcessor;
        this.appType = appType;
        this.priority = 2;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    public int getPriority() {
        return this.priority;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    @NotNull
    public LaunchDeeplink start() {
        return ((LauncherStateDialogProcessor) (this.appType == AppType.SELECT ? this.selectNotificationPermissionProcessor : this.bxNotificationPermissionProcessor).get()).start();
    }
}
