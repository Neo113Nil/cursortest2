package ru.ozon.app.android.storage.firstLaunch;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorageImpl;", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "wasNotificationPermissionRequested", "", "getWasNotificationPermissionRequested", "()Z", "showedNewOnboarding", "getShowedNewOnboarding", "getNotificationPermissionRequested", "setShowedNewOnboarding", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setNotificationPermissionRequested", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstLaunchStateStorageImpl implements FirstLaunchStateStorage {

    @NotNull
    private final SharedPreferences prefs;

    public FirstLaunchStateStorageImpl(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    private final boolean getShowedNewOnboarding() {
        return this.prefs.getBoolean("SHOWED_NEW_ONBOARDING", false);
    }

    private final boolean getWasNotificationPermissionRequested() {
        return this.prefs.getBoolean("IS_NOTIFICATIONS_PERMISSIONS_WAS_REQUESTED", false);
    }

    @Override // ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage
    public boolean getNotificationPermissionRequested() {
        return getWasNotificationPermissionRequested();
    }

    @Override // ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage
    public void setNotificationPermissionRequested(boolean value) {
        this.prefs.edit().putBoolean("IS_NOTIFICATIONS_PERMISSIONS_WAS_REQUESTED", value).apply();
    }

    @Override // ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage
    public void setShowedNewOnboarding(boolean value) {
        this.prefs.edit().putBoolean("SHOWED_NEW_ONBOARDING", value).apply();
    }

    @Override // ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage
    public boolean showedNewOnboarding() {
        return getShowedNewOnboarding();
    }
}
