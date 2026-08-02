package ru.ozon.app.android.update;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateIntervalStorageImpl;", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "updatedTime", "", "getUpdatedTime", "()J", "interval", "getInterval", "()Ljava/lang/Long;", "nextInterval", "", "canUpdate", "", "clear", "Companion", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppUpdateIntervalStorageImpl implements InAppUpdateIntervalStorage {
    private static final long DEFAULT_INTERVAL = TimeUnit.DAYS.toMillis(7);

    @NotNull
    private final SharedPreferences prefs;

    public InAppUpdateIntervalStorageImpl(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    private final Long getInterval() {
        if (this.prefs.contains("UPDATE_IN_APP_INTERVAL")) {
            return Long.valueOf(this.prefs.getLong("UPDATE_IN_APP_INTERVAL", 0L));
        }
        return null;
    }

    private final long getUpdatedTime() {
        return this.prefs.getLong("UPDATE_IN_APP_UPDATED_TIME", 0L);
    }

    @Override // ru.ozon.app.android.update.InAppUpdateIntervalStorage
    public boolean canUpdate() {
        return System.currentTimeMillis() >= getUpdatedTime();
    }

    @Override // ru.ozon.app.android.update.InAppUpdateIntervalStorage
    public void clear() {
        this.prefs.edit().remove("UPDATE_IN_APP_UPDATED_TIME").remove("UPDATE_IN_APP_INTERVAL").apply();
    }

    @Override // ru.ozon.app.android.update.InAppUpdateIntervalStorage
    public void nextInterval() {
        Long interval = getInterval();
        long longValue = interval != null ? interval.longValue() / 2 : DEFAULT_INTERVAL;
        this.prefs.edit().putLong("UPDATE_IN_APP_UPDATED_TIME", System.currentTimeMillis() + longValue).putLong("UPDATE_IN_APP_INTERVAL", longValue).apply();
    }
}
