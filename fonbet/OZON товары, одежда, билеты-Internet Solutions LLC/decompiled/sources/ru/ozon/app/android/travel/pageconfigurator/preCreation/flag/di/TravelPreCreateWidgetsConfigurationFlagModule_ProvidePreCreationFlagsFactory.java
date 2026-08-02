package ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelPreCreateWidgetsConfigurationFlagModule_ProvidePreCreationFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> providePreCreationFlags(TravelPreCreateWidgetsConfigurationFlagModule travelPreCreateWidgetsConfigurationFlagModule) {
        Set<FeatureFlagRegistrationModel> providePreCreationFlags = travelPreCreateWidgetsConfigurationFlagModule.providePreCreationFlags();
        j.d(providePreCreationFlags);
        return providePreCreationFlags;
    }
}
