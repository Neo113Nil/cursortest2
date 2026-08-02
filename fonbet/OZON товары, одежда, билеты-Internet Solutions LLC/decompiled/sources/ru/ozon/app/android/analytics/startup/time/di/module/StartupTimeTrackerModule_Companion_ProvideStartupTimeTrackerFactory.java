package ru.ozon.app.android.analytics.startup.time.di.module;

import Jb.e;
import Jb.j;
import Xh0.c;

/* loaded from: classes6.dex */
public final class StartupTimeTrackerModule_Companion_ProvideStartupTimeTrackerFactory implements e<c> {
    public static c provideStartupTimeTracker() {
        c provideStartupTimeTracker = StartupTimeTrackerModule.INSTANCE.provideStartupTimeTracker();
        j.d(provideStartupTimeTracker);
        return provideStartupTimeTracker;
    }
}
