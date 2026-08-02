package ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "", "", "filePath", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/UploadAvatarResponse;", "uploadAvatar", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "removeAvatar", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AvatarRepository {
    Object removeAvatar(@NotNull d<? super Unit> dVar);

    Object uploadAvatar(@NotNull String str, @NotNull d<? super UploadAvatarResponse> dVar);
}
