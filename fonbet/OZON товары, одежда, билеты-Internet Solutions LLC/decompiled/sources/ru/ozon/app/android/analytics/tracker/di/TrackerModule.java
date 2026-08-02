package ru.ozon.app.android.analytics.tracker.di;

import Ci0.g;
import android.content.Context;
import ei0.C6371d;
import ei0.InterfaceC6369b;
import fi0.e;
import fi0.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/analytics/tracker/di/TrackerModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "settings", "Lei0/b;", "provideOzonTracker", "(Landroid/content/Context;Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;)Lei0/b;", "Lfi0/w;", "provideTrackerDynamicSettings", "(Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;)Lfi0/w;", "ozonTracker", "Lfi0/e;", "provideCustomPropertyTracker", "(Lei0/b;)Lfi0/e;", "Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "provideDeviceHardwareInfoProvider", "(Lei0/b;)Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerModule {
    @NotNull
    public final e provideCustomPropertyTracker(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        return ozonTracker.getCustomPropertyTracker();
    }

    @NotNull
    public final DeviceHardwareInfoProvider provideDeviceHardwareInfoProvider(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        return ozonTracker.getDeviceHardwareInfoProvider();
    }

    @NotNull
    public final InterfaceC6369b provideOzonTracker(@NotNull Context context, @NotNull OzonTrackerSettings settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        InterfaceC6369b c6371d = settings.getIsEnabled() ? (InterfaceC6369b) InterfaceC6369b.f62344a.a(context, settings.getTrackerSettings()) : new C6371d(context, settings.getTrackerSettings());
        Boolean isTestMode = settings.getIsTestMode();
        if (isTestMode != null) {
            c6371d.b(isTestMode.booleanValue());
        }
        g.f5125a.g(c6371d);
        return c6371d;
    }

    @NotNull
    public final w provideTrackerDynamicSettings(@NotNull OzonTrackerSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return settings.getTrackerSettings().x();
    }
}
