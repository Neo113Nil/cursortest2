package ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.TravelMainPreCreateWidgetsConfigurationFlag;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.TravelOrderListPreCreateWidgetsConfigurationFlag;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.TravelRailwaySERPPreCreateWidgetsConfigurationFlag;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.TravelThankYouPreCreateWidgetsConfigurationFlag;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/preCreation/flag/di/TravelPreCreateWidgetsConfigurationFlagModule;", "", "<init>", "()V", "providePreCreationFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPreCreateWidgetsConfigurationFlagModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> providePreCreationFlags() {
        FeatureFlagRegistrationModel[] elements = {TravelMainPreCreateWidgetsConfigurationFlag.INSTANCE.createModel$pageconfigurator_prodGoogleAllVendorsRelease(), TravelThankYouPreCreateWidgetsConfigurationFlag.INSTANCE.createModel$pageconfigurator_prodGoogleAllVendorsRelease(), TravelOrderListPreCreateWidgetsConfigurationFlag.INSTANCE.createModel$pageconfigurator_prodGoogleAllVendorsRelease(), TravelRailwaySERPPreCreateWidgetsConfigurationFlag.INSTANCE.createModel$pageconfigurator_prodGoogleAllVendorsRelease()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
