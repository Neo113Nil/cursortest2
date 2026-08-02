package ru.ozon.app.android.analytics.tracker.di;

import Jb.e;
import Jb.j;
import fi0.w;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;

/* loaded from: classes6.dex */
public final class TrackerModule_ProvideTrackerDynamicSettingsFactory implements e<w> {
    public static w provideTrackerDynamicSettings(TrackerModule trackerModule, OzonTrackerSettings ozonTrackerSettings) {
        w provideTrackerDynamicSettings = trackerModule.provideTrackerDynamicSettings(ozonTrackerSettings);
        j.d(provideTrackerDynamicSettings);
        return provideTrackerDynamicSettings;
    }
}
