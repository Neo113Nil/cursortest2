package ru.ozon.app.android.debugmenu.storage;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/debugmenu/storage/TrackerLoggerSettingsStorageImpl;", "Lru/ozon/app/android/debugmenu/storage/TrackerLoggerSettingsStorage;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "isEventsLoggerEnabled", "", "isPerformanceLoggerEnabled", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerLoggerSettingsStorageImpl implements TrackerLoggerSettingsStorage {

    @NotNull
    private final SharedPreferences sharedPreferences;

    public TrackerLoggerSettingsStorageImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorage
    public boolean isEventsLoggerEnabled() {
        return this.sharedPreferences.getBoolean("TrackerLoggerSettingsStorage.TRACKER_EVENTS_LOGGER_ENABLED", true);
    }

    @Override // ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorage
    public boolean isPerformanceLoggerEnabled() {
        return this.sharedPreferences.getBoolean("TrackerLoggerSettingsStorage.TRACKER_PERF_LOGGER_ENABLED", true);
    }
}
