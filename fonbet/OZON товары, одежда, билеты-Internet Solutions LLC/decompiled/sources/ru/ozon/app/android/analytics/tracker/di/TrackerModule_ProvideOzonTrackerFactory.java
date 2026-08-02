package ru.ozon.app.android.analytics.tracker.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;

/* loaded from: classes6.dex */
public final class TrackerModule_ProvideOzonTrackerFactory implements e<InterfaceC6369b> {
    public static InterfaceC6369b provideOzonTracker(TrackerModule trackerModule, Context context, OzonTrackerSettings ozonTrackerSettings) {
        InterfaceC6369b provideOzonTracker = trackerModule.provideOzonTracker(context, ozonTrackerSettings);
        j.d(provideOzonTracker);
        return provideOzonTracker;
    }
}
