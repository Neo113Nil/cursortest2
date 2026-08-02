package ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository;

import Wc.a;
import We.C;
import We.D;
import We.H;
import We.K;
import android.webkit.MimeTypeMap;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepositoryImpl;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarApi;", "avatarApi", "<init>", "(Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarApi;)V", "", "filePath", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/UploadAvatarResponse;", "uploadAvatar", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "removeAvatar", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarApi;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvatarRepositoryImpl implements AvatarRepository {

    @NotNull
    private final AvatarApi avatarApi;

    public AvatarRepositoryImpl(@NotNull AvatarApi avatarApi) {
        Intrinsics.checkNotNullParameter(avatarApi, "avatarApi");
        this.avatarApi = avatarApi;
    }

    @Override // ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository
    public Object removeAvatar(@NotNull d<? super Unit> dVar) {
        Object removeImage = this.avatarApi.removeImage(dVar);
        return removeImage == a.COROUTINE_SUSPENDED ? removeImage : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository
    public Object uploadAvatar(@NotNull String str, @NotNull d<? super UploadAvatarResponse> dVar) {
        File file = new File(str);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        C.f33536g.getClass();
        C b11 = C.a.b(mimeTypeFromExtension);
        D.c.a aVar = D.c.f33553c;
        String name = file.getName();
        K.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        H a11 = K.Companion.a(file, b11);
        aVar.getClass();
        return this.avatarApi.uploadImage(D.c.a.b("upfile", name, a11), dVar);
    }
}
