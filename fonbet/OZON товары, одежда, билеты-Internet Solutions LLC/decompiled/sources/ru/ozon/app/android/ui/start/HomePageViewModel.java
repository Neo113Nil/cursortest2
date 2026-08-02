package ru.ozon.app.android.ui.start;

import Lg0.c;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ui/start/HomePageViewModel;", "", "", "checkLaunchState", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "getLaunchStateLiveData", "()Landroidx/lifecycle/P;", "launchStateLiveData", "LLg0/c;", "getProtectionAppDialog", "()LLg0/c;", "protectionAppDialog", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HomePageViewModel {
    void checkLaunchState();

    @NotNull
    P<LaunchDeeplink> getLaunchStateLiveData();

    @NotNull
    c getProtectionAppDialog();
}
