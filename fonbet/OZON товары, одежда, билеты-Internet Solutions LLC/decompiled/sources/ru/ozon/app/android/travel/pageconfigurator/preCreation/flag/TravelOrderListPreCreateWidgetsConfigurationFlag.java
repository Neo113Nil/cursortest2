package ru.ozon.app.android.travel.pageconfigurator.preCreation.flag;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/preCreation/flag/TravelOrderListPreCreateWidgetsConfigurationFlag;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "<init>", "()V", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "featureName", "getFeatureName", "createModel", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "createModel$pageconfigurator_prodGoogleAllVendorsRelease", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelOrderListPreCreateWidgetsConfigurationFlag implements FeatureFlag {

    @NotNull
    public static final TravelOrderListPreCreateWidgetsConfigurationFlag INSTANCE = new TravelOrderListPreCreateWidgetsConfigurationFlag();

    @NotNull
    private static final String serviceName = "mobile_travel";

    @NotNull
    private static final String featureName = "travel_order_list_pre_create_widgets_configuration";

    private TravelOrderListPreCreateWidgetsConfigurationFlag() {
    }

    @NotNull
    public final FeatureFlagRegistrationModel createModel$pageconfigurator_prodGoogleAllVendorsRelease() {
        return FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel(INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Набор имен виджетов с версией для прогрева на странице списка заказов трэвела.\nДля cellList перед названием виджета добавляется идентификатор, чтобы не аффектить другие команды, например: travelCellListV2.\nФормат: {widgetName}V{widgetVersion}.\nПример: \"travelCellListV2,travelNavBarV1,travelNavTitleV1,travelFiltersButtonV2\".", "https://jit.o3.ru/browse/OTMOB-2098", "https://jit.o3.ru/browse/MOB-9730")));
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
