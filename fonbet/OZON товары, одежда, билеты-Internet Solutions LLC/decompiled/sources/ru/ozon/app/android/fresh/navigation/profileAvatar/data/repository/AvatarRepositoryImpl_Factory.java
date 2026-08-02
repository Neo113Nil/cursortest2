package ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository;

import Jb.e;
import Pc.a;

/* loaded from: classes6.dex */
public final class AvatarRepositoryImpl_Factory implements e<AvatarRepositoryImpl> {
    private final a<AvatarApi> avatarApiProvider;

    public AvatarRepositoryImpl_Factory(a<AvatarApi> aVar) {
        this.avatarApiProvider = aVar;
    }

    public static AvatarRepositoryImpl_Factory create(a<AvatarApi> aVar) {
        return new AvatarRepositoryImpl_Factory(aVar);
    }

    public static AvatarRepositoryImpl newInstance(AvatarApi avatarApi) {
        return new AvatarRepositoryImpl(avatarApi);
    }

    @Override // Pc.a
    public AvatarRepositoryImpl get() {
        return newInstance(this.avatarApiProvider.get());
    }
}
