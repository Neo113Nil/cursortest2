package ru.ozon.app.android.account.user;

import Bc.r;
import Bc.t;
import Cw.c;
import Mc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.model.composer.GetUserRequest;
import ru.ozon.app.android.account.user.model.composer.GetUserResponse;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserModel;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileRequest;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileResponse;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/user/NetworkUserDataStore;", "", "Lru/ozon/app/android/account/user/UserApi;", "userApi", "<init>", "(Lru/ozon/app/android/account/user/UserApi;)V", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserModel;", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileRequest;", "toPatchUserRequest", "(Lru/ozon/app/android/account/user/model/composer/patch/PatchUserModel;)Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileRequest;", "", "", "mapSexFromInt", "(I)Ljava/lang/String;", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse;", "Lru/ozon/app/android/storage/user/model/User;", "toUser", "(Lru/ozon/app/android/account/user/model/composer/GetUserResponse;)Lru/ozon/app/android/storage/user/model/User;", "Lru/ozon/app/android/account/user/model/composer/GetUserRequest;", "request", "Lio/reactivex/y;", "getUserInfoV2", "(Lru/ozon/app/android/account/user/model/composer/GetUserRequest;)Lio/reactivex/y;", "user", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;", "patchUserInfo", "(Lru/ozon/app/android/account/user/model/composer/patch/PatchUserModel;)Lio/reactivex/y;", "Lru/ozon/app/android/account/user/UserApi;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkUserDataStore {

    @NotNull
    private final UserApi userApi;

    public NetworkUserDataStore(@NotNull UserApi userApi) {
        Intrinsics.checkNotNullParameter(userApi, "userApi");
        this.userApi = userApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final User getUserInfoV2$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (User) function1.invoke(p02);
    }

    private final String mapSexFromInt(int i11) {
        return i11 == 1 ? "female" : "male";
    }

    private final PatchUserProfileRequest toPatchUserRequest(PatchUserModel patchUserModel) {
        String firstName = patchUserModel.getFirstName();
        String lastName = patchUserModel.getLastName();
        Integer sex = patchUserModel.getSex();
        return new PatchUserProfileRequest(firstName, lastName, sex != null ? mapSexFromInt(sex.intValue()) : null, patchUserModel.getBirthdate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final User toUser(GetUserResponse getUserResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ?? r62;
        String str9;
        String str10;
        String phone;
        long userId = getUserResponse.getUserId();
        GetUserResponse.Profile profile = getUserResponse.getProfile();
        if (profile == null || (str = profile.getFirstName()) == null) {
            str = "";
        }
        GetUserResponse.Profile profile2 = getUserResponse.getProfile();
        if (profile2 == null || (str2 = profile2.getLastName()) == null) {
            str2 = "";
        }
        GetUserResponse.Profile profile3 = getUserResponse.getProfile();
        if (profile3 == null || (str3 = profile3.getMiddleName()) == null) {
            str3 = "";
        }
        GetUserResponse.Profile profile4 = getUserResponse.getProfile();
        boolean d11 = Intrinsics.d(profile4 != null ? profile4.getSex() : null, "female");
        GetUserResponse.Credentials credentials = getUserResponse.getCredentials();
        if (credentials == null || (str4 = credentials.getEmail()) == null) {
            str4 = "";
        }
        GetUserResponse.Profile profile5 = getUserResponse.getProfile();
        if (profile5 == null || (str5 = profile5.getBirthDate()) == null) {
            str5 = "";
        }
        GetUserResponse.Credentials credentials2 = getUserResponse.getCredentials();
        if (credentials2 == null || (phone = credentials2.getPhone()) == null) {
            String str11 = str5;
            str6 = "";
            str7 = str2;
            str8 = str3;
            r62 = d11;
            str9 = str4;
            str10 = str11;
        } else {
            str7 = str2;
            str8 = str3;
            r62 = d11;
            str9 = str4;
            str10 = str5;
            str6 = phone;
        }
        return new User(userId, str, str7, str8, r62, str9, str10, str6);
    }

    @NotNull
    public final y<User> getUserInfoV2(@NotNull GetUserRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        r rVar = new r(this.userApi.getUser(request).j(a.b()).g(a.a()), new c(new NetworkUserDataStore$getUserInfoV2$1(this), 13));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    @NotNull
    public final y<PatchUserProfileResponse> patchUserInfo(@NotNull PatchUserModel user) {
        Intrinsics.checkNotNullParameter(user, "user");
        t g10 = this.userApi.patchUserProfile(toPatchUserRequest(user)).j(a.b()).g(a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }
}
