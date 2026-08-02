package ru.ozon.app.android.ui.start.launch;

import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.start.EmptyDeeplink;
import ru.ozon.app.android.ui.start.LaunchDeeplink;
import ru.ozon.app.android.ui.start.UpdateDeeplink;
import ru.ozon.app.android.update.InAppUpdateController;
import ru.ozon.app.android.update.InAppUpdateInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ui/start/launch/UpdateInAppLaunchStateDialogProcessor;", "Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "inAppUpdateController", "Lru/ozon/app/android/update/InAppUpdateController;", "<init>", "(Lru/ozon/app/android/update/InAppUpdateController;)V", "priority", "", "getPriority", "()I", "start", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateInAppLaunchStateDialogProcessor implements LauncherStateDialogProcessor {

    @NotNull
    private final InAppUpdateController inAppUpdateController;
    private final int priority;

    public UpdateInAppLaunchStateDialogProcessor(@NotNull InAppUpdateController inAppUpdateController) {
        Intrinsics.checkNotNullParameter(inAppUpdateController, "inAppUpdateController");
        this.inAppUpdateController = inAppUpdateController;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    public int getPriority() {
        return this.priority;
    }

    @Override // ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor
    @NotNull
    public LaunchDeeplink start() {
        try {
            InAppUpdateInfo updateState = this.inAppUpdateController.getUpdateState();
            return updateState != null ? new UpdateDeeplink(updateState) : EmptyDeeplink.INSTANCE;
        } catch (Exception e11) {
            a.f17149a.e(e11);
            return EmptyDeeplink.INSTANCE;
        }
    }
}
