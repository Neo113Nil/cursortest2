package ru.ozon.app.android.cabinet.profileAvatar.data.repository;

import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepository;", "", "", "filePath", "Lio/reactivex/y;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;", "uploadAvatar", "(Ljava/lang/String;)Lio/reactivex/y;", "Lio/reactivex/b;", "removeAvatar", "()Lio/reactivex/b;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvatarRepository {
    @NotNull
    AbstractC7094b removeAvatar();

    @NotNull
    y<UploadAvatarResponse> uploadAvatar(@NotNull String filePath);
}
