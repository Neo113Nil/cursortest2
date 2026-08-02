package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import Sg.a;
import We.InterfaceC4875q;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import fi0.InterfaceC6571a;
import fi0.c;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.analytics.callback.VideoAnalyzerForceSendingPerfEventsCallback;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;
import ru.ozon.app.android.debugmenu.storage.TrackerLoggerSettingsStorage;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.version.AppVersionService;

/* loaded from: classes6.dex */
public final class AnalyticsDependencyModule_Companion_ProvideOzonTrackerSettingsFactory implements e<OzonTrackerSettings> {
    public static OzonTrackerSettings provideOzonTrackerSettings(Context context, FeatureService featureService, AppsFlyerLib appsFlyerLib, DeviceType deviceType, AppStoreInfoProvider appStoreInfoProvider, InterfaceC4875q interfaceC4875q, InterfaceC6571a interfaceC6571a, Fb0.e eVar, DebugHeaderService debugHeaderService, TrackerLoggerSettingsStorage trackerLoggerSettingsStorage, c cVar, a aVar, VideoAnalyzerForceSendingPerfEventsCallback videoAnalyzerForceSendingPerfEventsCallback, AppVersionService appVersionService, String str, Ld0.c cVar2) {
        OzonTrackerSettings provideOzonTrackerSettings = AnalyticsDependencyModule.INSTANCE.provideOzonTrackerSettings(context, featureService, appsFlyerLib, deviceType, appStoreInfoProvider, interfaceC4875q, interfaceC6571a, eVar, debugHeaderService, trackerLoggerSettingsStorage, cVar, aVar, videoAnalyzerForceSendingPerfEventsCallback, appVersionService, str, cVar2);
        j.d(provideOzonTrackerSettings);
        return provideOzonTrackerSettings;
    }
}
