package ru.ozon.app.android.account.user;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.account.user.model.composer.GetUserRequest;
import ru.ozon.app.android.account.user.model.composer.GetUserResponse;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileRequest;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileResponse;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/user/UserApi;", "", "Lru/ozon/app/android/account/user/model/composer/GetUserRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse;", "getUser", "(Lru/ozon/app/android/account/user/model/composer/GetUserRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileRequest;", "body", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;", "patchUserProfile", "(Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileRequest;)Lio/reactivex/y;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserApi {
    @POST("composer-api.bx/_action/getUserV2")
    @NotNull
    y<GetUserResponse> getUser(@Body @NotNull GetUserRequest request);

    @POST("composer-api.bx/_action/patchUserProfile")
    @NotNull
    y<PatchUserProfileResponse> patchUserProfile(@Body @NotNull PatchUserProfileRequest body);
}
