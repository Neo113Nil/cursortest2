package ru.ozon.app.android.ui.start.launch;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.start.LaunchDeeplink;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "", "priority", "", "getPriority", "()I", "start", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LauncherStateDialogProcessor {
    int getPriority();

    @NotNull
    LaunchDeeplink start();
}
