package ru.ozon.app.android.mediaupload.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class UploadFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(UploadFlagsModule uploadFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = uploadFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
