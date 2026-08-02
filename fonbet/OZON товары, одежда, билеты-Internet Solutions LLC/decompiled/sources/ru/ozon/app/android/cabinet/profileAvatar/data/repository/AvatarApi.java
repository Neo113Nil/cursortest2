package ru.ozon.app.android.cabinet.profileAvatar.data.repository;

import We.D;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarApi;", "", "LWe/D$c;", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;", "uploadImage", "(LWe/D$c;)Lio/reactivex/y;", "Lio/reactivex/b;", "removeImage", "()Lio/reactivex/b;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarOptionsRequest;", "request", "setOptions", "(Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarOptionsRequest;)Lio/reactivex/b;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvatarApi {
    @DELETE("composer-api.bx/_action/removeAvatar")
    @NotNull
    AbstractC7094b removeImage();

    @POST("composer-api.bx/_action/setAvatarOptions")
    @NotNull
    AbstractC7094b setOptions(@Body @NotNull AvatarOptionsRequest request);

    @POST("composer-api.bx/_action/uploadAvatar")
    @NotNull
    @Multipart
    y<UploadAvatarResponse> uploadImage(@NotNull @Part D.c body);
}
