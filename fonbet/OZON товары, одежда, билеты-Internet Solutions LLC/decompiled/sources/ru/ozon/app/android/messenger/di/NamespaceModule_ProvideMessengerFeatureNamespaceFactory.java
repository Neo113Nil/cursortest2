package ru.ozon.app.android.messenger.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class NamespaceModule_ProvideMessengerFeatureNamespaceFactory implements e<String> {
    public static String provideMessengerFeatureNamespace(NamespaceModule namespaceModule, AppType appType, FeatureChecker featureChecker) {
        String provideMessengerFeatureNamespace = namespaceModule.provideMessengerFeatureNamespace(appType, featureChecker);
        j.d(provideMessengerFeatureNamespace);
        return provideMessengerFeatureNamespace;
    }
}
