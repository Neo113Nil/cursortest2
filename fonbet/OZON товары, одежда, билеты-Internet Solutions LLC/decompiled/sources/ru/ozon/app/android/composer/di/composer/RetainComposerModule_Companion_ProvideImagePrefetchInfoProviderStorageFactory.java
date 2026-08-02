package ru.ozon.app.android.composer.di.composer;

import Jb.e;
import Jb.j;
import l20.c;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;

/* loaded from: classes6.dex */
public final class RetainComposerModule_Companion_ProvideImagePrefetchInfoProviderStorageFactory implements e<ImagePrefetchInfoProviderStorage<c>> {
    public static ImagePrefetchInfoProviderStorage<c> provideImagePrefetchInfoProviderStorage() {
        ImagePrefetchInfoProviderStorage<c> provideImagePrefetchInfoProviderStorage = RetainComposerModule.INSTANCE.provideImagePrefetchInfoProviderStorage();
        j.d(provideImagePrefetchInfoProviderStorage);
        return provideImagePrefetchInfoProviderStorage;
    }
}
