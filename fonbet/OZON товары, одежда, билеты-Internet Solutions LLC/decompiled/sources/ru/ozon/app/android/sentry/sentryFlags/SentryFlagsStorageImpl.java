package ru.ozon.app.android.sentry.sentryFlags;

import C.C2702w;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorageImpl;", "Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isEnableSystemEventBreadcrumbs", "()Z", "setEnableSystemEventBreadcrumbs", "(Z)V", "isEnableAppLifecycleBreadcrumbs", "setEnableAppLifecycleBreadcrumbs", "Companion", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SentryFlagsStorageImpl implements SentryFlagsStorage {

    @NotNull
    private final SharedPreferences preferences;

    public SentryFlagsStorageImpl(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage
    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.preferences.getBoolean("is_enable_app_lifecycle_breadcrumbs", false);
    }

    @Override // ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage
    public boolean isEnableSystemEventBreadcrumbs() {
        return this.preferences.getBoolean("is_enable_system_event_breadcrumbs", false);
    }

    @Override // ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage
    public void setEnableAppLifecycleBreadcrumbs(boolean z11) {
        C2702w.e(this.preferences, "is_enable_app_lifecycle_breadcrumbs", z11);
    }

    @Override // ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage
    public void setEnableSystemEventBreadcrumbs(boolean z11) {
        C2702w.e(this.preferences, "is_enable_system_event_breadcrumbs", z11);
    }
}
