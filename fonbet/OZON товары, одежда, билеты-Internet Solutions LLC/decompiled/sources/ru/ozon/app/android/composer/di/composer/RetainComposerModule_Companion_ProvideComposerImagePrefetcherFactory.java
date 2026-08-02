package ru.ozon.app.android.composer.di.composer;

import Jb.e;
import Jb.j;
import l20.c;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import w10.InterfaceC10409a;

/* loaded from: classes6.dex */
public final class RetainComposerModule_Companion_ProvideComposerImagePrefetcherFactory implements e<InterfaceC10409a> {
    public static InterfaceC10409a provideComposerImagePrefetcher(FeatureService featureService, ImagePrefetchInfoProviderStorage<c> imagePrefetchInfoProviderStorage) {
        InterfaceC10409a provideComposerImagePrefetcher = RetainComposerModule.INSTANCE.provideComposerImagePrefetcher(featureService, imagePrefetchInfoProviderStorage);
        j.d(provideComposerImagePrefetcher);
        return provideComposerImagePrefetcher;
    }
}
