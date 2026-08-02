package ru.ozon.app.android.analytics.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.flags.tracker.TrackerProductSendingPeriod;
import ru.ozon.app.android.composer.flags.RumWidgetsFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/analytics/flags/AnalyticsFlagsModule;", "", "<init>", "()V", "provideFeatureFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFeatureFlags() {
        FeatureFlagRegistrationModel featureFlagRegistrationModel = new FeatureFlagRegistrationModel((FeatureFlag) TrackerEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName$default("Трэкер", null, null, 6, null));
        ClearEventUnderDateFlag clearEventUnderDateFlag = ClearEventUnderDateFlag.INSTANCE;
        FeatureFlagRegistrationModel[] elements = {featureFlagRegistrationModel, new FeatureFlagRegistrationModel((FeatureFlag) clearEventUnderDateFlag, 24, FeatureFlagKt.featureFlagDisplayedName$default(clearEventUnderDateFlag.getFeatureName(), null, null, 6, null)), new FeatureFlagRegistrationModel((FeatureFlag) PerformanceTrackingEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Performance метрики", "https://jit.ozon.ru/browse/ANDROID-6708", "https://jit.ozon.ru/browse/BX-2252")), new FeatureFlagRegistrationModel((FeatureFlag) LogProcessCreationTimeFeatureFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Логгирование времени создания процесса", "https://jit.o3.ru/browse/ANDROID-32027", "https://jit.o3.ru/browse/MOB-6930")), new FeatureFlagRegistrationModel((FeatureFlag) TrackStartupStepsTimeFeatureFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Детализированный трекинг времени старта", "https://jit.o3.ru/browse/ANDROID-32326", "https://jit.o3.ru/browse/MOB-7073")), new FeatureFlagRegistrationModel((FeatureFlag) BxPerformanceTrackingEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Разделить управление семплированием по доменным зонам", "https://jit.ozon.ru/browse/ANDROID-25468", "https://jit.ozon.ru/browse/MOB-3032")), new FeatureFlagRegistrationModel((FeatureFlag) ImagePlaceholderTrackingEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Performance метрики для плейсхолдеров изображений", "https://jit.ozon.ru/browse/ANDROID-16681", "https://jit.ozon.ru/browse/BX-8046")), new FeatureFlagRegistrationModel((FeatureFlag) RumImagesFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Семплирование перфоманс аналитики картинок", "https://jit.ozon.ru/browse/ANDROID-15713", "https://jit.ozon.ru/browse/BX-7824")), new FeatureFlagRegistrationModel((FeatureFlag) RumImageErrorsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Семплирование аналитики ошибок при загрузке картинок", null, "https://jit.o3.ru/browse/MP-1111", 2, null)), new FeatureFlagRegistrationModel((FeatureFlag) FpsHitchFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Аналитика по просадке fps", "https://jit.ozon.ru/browse/BX-7826", "https://jit.ozon.ru/browse/BX-7826")), new FeatureFlagRegistrationModel((FeatureFlag) PerfPagePartTrackingEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Отдельные Фича-флаги по событиям PAGE_PART и IMAGE", "https://jit.o3.ru/browse/ANDROID-22067", "https://jit.o3.ru/browse/MOB-1378")), new FeatureFlagRegistrationModel((FeatureFlag) RumWidgetsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("RUM widgets", "https://jit.ozon.ru/browse/ANDROID-14297", "https://jit.ozon.ru/browse/BX-6711")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerBackgroundModeFlags$TrackerDelayedSendingAnalyticsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Отложенная отправка бизнес аналитики в трекере при сворачивании приложения", "https://jit.o3.ru/browse/ANDROID-37091", "https://jit.o3.ru/browse/MP-876")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerBackgroundModeFlags$TrackerDelayedSendingPerfAnalyticsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("отложенная отправка перформанс аналитики при сворачивании приложения", "https://jit.o3.ru/browse/ANDROID-37091", "https://jit.o3.ru/browse/MP-876")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerBackgroundModeFlags$TrackerForceSendingAnalyticsOnMinimizeFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Принудительная отправка бизнес аналитики при сворачивании приложения", "https://jit.o3.ru/browse/ANDROID-37091", "https://jit.o3.ru/browse/MP-876")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerBackgroundModeFlags$TrackerForceSendingPerfAnalyticsOnMinimizeFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Принудительная отправка перформанс аналитики при сворачивании приложения", "https://jit.o3.ru/browse/ANDROID-37091", "https://jit.o3.ru/browse/MP-876")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerBackgroundModeFlags$TrackerPerformanceEventUnderDateInMinutesFlag.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Время жизни эвента, по истечению которого эвент считается \"протухшим\" и не отправляется на бек", "https://jit.o3.ru/browse/ANDROID-37091", "https://jit.o3.ru/browse/MP-876")), new FeatureFlagRegistrationModel((FeatureFlag) new FeatureFlag() { // from class: ru.ozon.app.android.analytics.flags.tracker.logging.TrackerLoggingFlags$TrackerMonitoringEnabled

            @NotNull
            private static final String serviceName = "mobile_platform";

            @NotNull
            private static final String featureName = "tracker_monitoring_enabled";

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getFeatureName() {
                return featureName;
            }

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getServiceName() {
                return serviceName;
            }
        }, false, FeatureFlagKt.featureFlagDisplayedName("Включение логирования отправки эвентов в logging.o3", "https://jit.o3.ru/browse/ANDROID-39984", "https://jit.o3.ru/browse/MP-4101")), new FeatureFlagRegistrationModel((FeatureFlag) new FeatureFlag() { // from class: ru.ozon.app.android.analytics.flags.tracker.logging.TrackerLoggingFlags$TrackerUndeliveredEventsLoggingEnabled

            @NotNull
            private static final String serviceName = "mobile_platform";

            @NotNull
            private static final String featureName = "tracker_undelivered_events_logging_enabled";

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getFeatureName() {
                return featureName;
            }

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getServiceName() {
                return serviceName;
            }
        }, false, FeatureFlagKt.featureFlagDisplayedName("Включение логирования ошибки отправки продуктовой аналитики", "https://jit.o3.ru/browse/ANDROID-39984", "https://jit.o3.ru/browse/MP-4101")), new FeatureFlagRegistrationModel((FeatureFlag) new FeatureFlag() { // from class: ru.ozon.app.android.analytics.flags.tracker.logging.TrackerLoggingFlags$TrackerRemoveOutdatedEventsLoggingEnabled

            @NotNull
            private static final String serviceName = "mobile_platform";

            @NotNull
            private static final String featureName = "tracker_remove_outdated_events_logging_enabled";

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getFeatureName() {
                return featureName;
            }

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getServiceName() {
                return serviceName;
            }
        }, false, FeatureFlagKt.featureFlagDisplayedName("Включение логирования удаления \"протухших\" эвентов продуктовой аналитики", "https://jit.o3.ru/browse/ANDROID-39984", "https://jit.o3.ru/browse/MP-4101")), new FeatureFlagRegistrationModel((FeatureFlag) new FeatureFlag() { // from class: ru.ozon.app.android.analytics.flags.tracker.logging.TrackerLoggingFlags$TrackerDeleteEventsByBadRequestLoggingEnabled

            @NotNull
            private static final String serviceName = "mobile_platform";

            @NotNull
            private static final String featureName = "tracker_delete_events_by_bad_request_logging_enabled";

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getFeatureName() {
                return featureName;
            }

            @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
            @NotNull
            public String getServiceName() {
                return serviceName;
            }
        }, false, FeatureFlagKt.featureFlagDisplayedName("Включение логирования удаления эвентов продуктовой аналитики из-за HTTP 400", "https://jit.o3.ru/browse/ANDROID-39984", "https://jit.o3.ru/browse/MP-4101")), new FeatureFlagRegistrationModel((FeatureFlag) TrackerProductSendingPeriod.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Период отправки продуктовой аналитики", "https://jit.o3.ru/browse/ANDROID-40848", "https://jit.o3.ru/browse/MP-4066"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
