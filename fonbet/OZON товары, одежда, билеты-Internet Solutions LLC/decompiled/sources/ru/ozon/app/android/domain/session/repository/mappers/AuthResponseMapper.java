package ru.ozon.app.android.domain.session.repository.mappers;

import BY.i;
import Bc.q;
import Bc.r;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.domain.session.api.auth.models.Data;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.api.auth.models.Status;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;
import ru.ozon.app.android.storage.user.model.User;
import vc.s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "response", "Lio/reactivex/y;", "handleToken", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lio/reactivex/y;", "Lru/ozon/app/android/account/user/UserManager;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthResponseMapper {

    @NotNull
    private final UserManager userManager;

    public AuthResponseMapper(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.userManager = userManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response handleToken$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Response) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response handleToken$lambda$1(Response response) {
        return response;
    }

    @NotNull
    public final y<Response> handleToken(final Response response) {
        Status status;
        Status status2;
        Data data;
        if (((response == null || (data = response.getData()) == null) ? null : data.getAuthToken()) != null) {
            q f7 = y.f(response);
            Intrinsics.checkNotNullExpressionValue(f7, "just(...)");
            return f7;
        }
        boolean z11 = false;
        if ((response == null || (status2 = response.getStatus()) == null) ? false : Intrinsics.d(status2.isCompleted(), Boolean.TRUE)) {
            Data data2 = response.getData();
            if (data2 != null ? Intrinsics.d(data2.isRegister(), Boolean.TRUE) : false) {
                y<User> updateProfileInfo = this.userManager.updateProfileInfo();
                i iVar = new i(new AuthResponseMapper$handleToken$1(response), 1);
                updateProfileInfo.getClass();
                r rVar = new r(updateProfileInfo, iVar);
                Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                return rVar;
            }
        }
        if (response != null && (status = response.getStatus()) != null) {
            z11 = Intrinsics.d(status.isCompleted(), Boolean.TRUE);
        }
        if (!z11) {
            q f11 = y.f(response);
            Intrinsics.checkNotNullExpressionValue(f11, "just(...)");
            return f11;
        }
        AbstractC7094b fetchUser = this.userManager.fetchUser();
        Callable callable = new Callable() { // from class: Js.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Response handleToken$lambda$1;
                handleToken$lambda$1 = AuthResponseMapper.handleToken$lambda$1(Response.this);
                return handleToken$lambda$1;
            }
        };
        fetchUser.getClass();
        s sVar = new s(fetchUser, callable);
        Intrinsics.checkNotNullExpressionValue(sVar, "toSingle(...)");
        return sVar;
    }
}
