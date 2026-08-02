package ru.ozon.app.android.separator.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class SeparatorFlagsModule_ProvideFlagsFactory implements e<FeatureFlagRegistrationModel> {
    public static FeatureFlagRegistrationModel provideFlags(SeparatorFlagsModule separatorFlagsModule) {
        FeatureFlagRegistrationModel provideFlags = separatorFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
