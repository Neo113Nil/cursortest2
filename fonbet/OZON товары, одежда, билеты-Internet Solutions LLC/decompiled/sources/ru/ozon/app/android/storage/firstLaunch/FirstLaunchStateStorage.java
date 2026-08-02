package ru.ozon.app.android.storage.firstLaunch;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "", "showedNewOnboarding", "", "getNotificationPermissionRequested", "setShowedNewOnboarding", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setNotificationPermissionRequested", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FirstLaunchStateStorage {
    boolean getNotificationPermissionRequested();

    void setNotificationPermissionRequested(boolean value);

    void setShowedNewOnboarding(boolean value);

    boolean showedNewOnboarding();
}
