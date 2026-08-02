package ru.ozon.app.android.session.userSocialsMobile.data.item;

import We.C;
import We.K;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileRepository;", "", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileApi;", "api", "<init>", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileApi;)V", "", "body", "link", "Lio/reactivex/y;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UnbindResponse;", "unbindSocial", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSocialsMobileRepository {

    @NotNull
    private final UserSocialsMobileApi api;

    public UserSocialsMobileRepository(@NotNull UserSocialsMobileApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @NotNull
    public final y<UnbindResponse> unbindSocial(@NotNull String body, @NotNull String link) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(link, "link");
        K.Companion companion = K.INSTANCE;
        String jSONObject = new JSONObject(body).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        C.f33536g.getClass();
        C b11 = C.a.b("application/json");
        companion.getClass();
        return this.api.unbindSocial(K.Companion.b(jSONObject, b11), link);
    }
}
