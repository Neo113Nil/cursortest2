package ru.ozon.app.android.fresh.navigation.profileAvatar.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

/* loaded from: classes6.dex */
public final class AvatarProfileViewModel_Factory implements e<AvatarProfileViewModel> {
    private final a<CoroutineDispatcherProvider> dispatcherProvider;
    private final a<ImageResizer> imageResizerProvider;
    private final a<AvatarRepository> repositoryProvider;

    public AvatarProfileViewModel_Factory(a<AvatarRepository> aVar, a<CoroutineDispatcherProvider> aVar2, a<ImageResizer> aVar3) {
        this.repositoryProvider = aVar;
        this.dispatcherProvider = aVar2;
        this.imageResizerProvider = aVar3;
    }

    public static AvatarProfileViewModel_Factory create(a<AvatarRepository> aVar, a<CoroutineDispatcherProvider> aVar2, a<ImageResizer> aVar3) {
        return new AvatarProfileViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static AvatarProfileViewModel newInstance(AvatarRepository avatarRepository, CoroutineDispatcherProvider coroutineDispatcherProvider, ImageResizer imageResizer) {
        return new AvatarProfileViewModel(avatarRepository, coroutineDispatcherProvider, imageResizer);
    }

    @Override // Pc.a
    public AvatarProfileViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.dispatcherProvider.get(), this.imageResizerProvider.get());
    }
}
