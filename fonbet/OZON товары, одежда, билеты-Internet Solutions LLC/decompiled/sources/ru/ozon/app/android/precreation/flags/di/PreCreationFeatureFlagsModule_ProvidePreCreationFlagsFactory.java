package ru.ozon.app.android.precreation.flags.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class PreCreationFeatureFlagsModule_ProvidePreCreationFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> providePreCreationFlags(PreCreationFeatureFlagsModule preCreationFeatureFlagsModule) {
        Set<FeatureFlagRegistrationModel> providePreCreationFlags = preCreationFeatureFlagsModule.providePreCreationFlags();
        j.d(providePreCreationFlags);
        return providePreCreationFlags;
    }
}
