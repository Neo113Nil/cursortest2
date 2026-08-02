package ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository;

import We.D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarApi;", "", "LWe/D$c;", "body", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/UploadAvatarResponse;", "uploadImage", "(LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "removeImage", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarOptionsRequest;", "request", "setOptions", "(Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarOptionsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AvatarApi {
    @DELETE("composer-api.bx/_action/removeAvatar")
    Object removeImage(@NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/setAvatarOptions")
    Object setOptions(@Body @NotNull AvatarOptionsRequest avatarOptionsRequest, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/uploadAvatar")
    @Multipart
    Object uploadImage(@NotNull @Part D.c cVar, @NotNull d<? super UploadAvatarResponse> dVar);
}
