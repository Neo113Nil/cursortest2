package ru.ozon.app.android.travel.pageconfigurator.preCreation.flag;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/preCreation/flag/TravelRailwaySERPPreCreateWidgetsConfigurationFlag;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "<init>", "()V", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "featureName", "getFeatureName", "createModel", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "createModel$pageconfigurator_prodGoogleAllVendorsRelease", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySERPPreCreateWidgetsConfigurationFlag implements FeatureFlag {

    @NotNull
    public static final TravelRailwaySERPPreCreateWidgetsConfigurationFlag INSTANCE = new TravelRailwaySERPPreCreateWidgetsConfigurationFlag();

    @NotNull
    private static final String serviceName = "mobile_travel";

    @NotNull
    private static final String featureName = "railway_serp_perf_config";

    private TravelRailwaySERPPreCreateWidgetsConfigurationFlag() {
    }

    @NotNull
    public final FeatureFlagRegistrationModel createModel$pageconfigurator_prodGoogleAllVendorsRelease() {
        return FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel(INSTANCE, "railwayScrollPriceCalendarV1,travelRailwaySearchResultsV3,travelRailwaySearchResultsV4,travelSortingV2,searchResultsNavTitleV2,iconButtonV1", FeatureFlagKt.featureFlagDisplayedName$default("Набор имен виджетов с версией для прогрева на главной странице трэвела. Формат: {widgetName}V{widgetVersion}. Пример: \"railwayScrollPriceCalendarV1,travelRailwaySearchResultsV3,travelRailwaySearchResultsV4,travelSortingV2,searchResultsNavTitleV2,iconButtonV1\".", null, "https://jit.o3.ru/browse/MOB-10334", 2, null)));
    }

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
}
