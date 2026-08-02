package ru.ozon.app.android.travel.feature.entry.flags;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/flags/TravelHomeWarmupAdaptersFlag;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "<init>", "()V", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "featureName", "getFeatureName", "createModel", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelHomeWarmupAdaptersFlag implements FeatureFlag {

    @NotNull
    public static final TravelHomeWarmupAdaptersFlag INSTANCE = new TravelHomeWarmupAdaptersFlag();

    @NotNull
    private static final String serviceName = "mobile_travel";

    @NotNull
    private static final String featureName = "travel_home_warmup_adapters_flag";

    private TravelHomeWarmupAdaptersFlag() {
    }

    @NotNull
    public final FeatureFlagRegistrationModel createModel() {
        return new FeatureFlagRegistrationModel(INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Прогрев moshi адаптеров для главной travel\nФормат: {widgetName}V{widgetVersion}.\nПример: \"hotTicketsV1,travelNotificationModalCheckV1,milesForBuyersV1,searchFormV4,hotelsHorizontalShelvesV1\".", "https://jit.o3.ru/browse/OTMOB-2391", "https://jit.o3.ru/browse/MOB-10453"));
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
