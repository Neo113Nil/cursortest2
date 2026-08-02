package ru.ozon.app.android.cabinet.profileAvatar.data.repository;

import We.C;
import We.D;
import We.H;
import We.K;
import android.webkit.MimeTypeMap;
import bd.h;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepositoryImpl;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepository;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarApi;", "avatarApi", "<init>", "(Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarApi;)V", "", "filePath", "Lio/reactivex/y;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;", "uploadAvatar", "(Ljava/lang/String;)Lio/reactivex/y;", "Lio/reactivex/b;", "removeAvatar", "()Lio/reactivex/b;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarApi;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarRepositoryImpl implements AvatarRepository {

    @NotNull
    private final AvatarApi avatarApi;

    public AvatarRepositoryImpl(@NotNull AvatarApi avatarApi) {
        Intrinsics.checkNotNullParameter(avatarApi, "avatarApi");
        this.avatarApi = avatarApi;
    }

    @Override // ru.ozon.app.android.cabinet.profileAvatar.data.repository.AvatarRepository
    @NotNull
    public AbstractC7094b removeAvatar() {
        return this.avatarApi.removeImage();
    }

    @Override // ru.ozon.app.android.cabinet.profileAvatar.data.repository.AvatarRepository
    @NotNull
    public y<UploadAvatarResponse> uploadAvatar(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
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
        return this.avatarApi.uploadImage(D.c.a.b("upfile", name, a11));
    }
}
