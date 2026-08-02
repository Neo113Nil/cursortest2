package ru.ozon.app.android.composer.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class ComposerFlagsModule_ProvideComposerFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideComposerFlags(ComposerFlagsModule composerFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideComposerFlags = composerFlagsModule.provideComposerFlags();
        j.d(provideComposerFlags);
        return provideComposerFlags;
    }
}
