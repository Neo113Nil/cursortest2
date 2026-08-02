package ru.ozon.app.android.platform.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;

/* loaded from: classes7.dex */
public final class AndroidPlatformModule_Companion_ProvideManualStateBundleActivityCallbackFactory implements e<ManualStateBundleActivityCallback> {
    public static ManualStateBundleActivityCallback provideManualStateBundleActivityCallback(FeatureChecker featureChecker, ManualSaveRestoreStateDelegate manualSaveRestoreStateDelegate) {
        ManualStateBundleActivityCallback provideManualStateBundleActivityCallback = AndroidPlatformModule.INSTANCE.provideManualStateBundleActivityCallback(featureChecker, manualSaveRestoreStateDelegate);
        j.d(provideManualStateBundleActivityCallback);
        return provideManualStateBundleActivityCallback;
    }
}
