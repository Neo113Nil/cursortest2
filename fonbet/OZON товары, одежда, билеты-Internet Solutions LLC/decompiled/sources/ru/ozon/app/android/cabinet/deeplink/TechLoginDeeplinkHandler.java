package ru.ozon.app.android.cabinet.deeplink;

import B0.C2454a;
import BF.a;
import Bc.l;
import Bc.r;
import GZ.j;
import IZ.c;
import Sc.o;
import android.content.Context;
import android.net.Uri;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import pZ.e;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.domain.session.state.AuthState;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import spay.sdk.api.ErrorCode;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\r*\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020#2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/TechLoginDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "authInteractor", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "authFlowMapper", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/domain/session/interactors/AuthInteractor;Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "LpZ/e;", "createAuthDestination", "(LGZ/j;)LpZ/e;", "Landroid/net/Uri;", "deeplink", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/state/AuthState;", "createRequest", "(Landroid/net/Uri;)Lio/reactivex/y;", "", "action", "", "", "body", "callAction", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "phone", "otpId", "createAction", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toDestination", "(Lru/ozon/app/android/domain/session/state/AuthState;)LpZ/e;", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/c;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/c;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "Companion", "NotFoundOTPException", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TechLoginDeeplinkHandler extends c {

    @NotNull
    private final AuthFlowMapper authFlowMapper;

    @NotNull
    private final AuthInteractor authInteractor;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/TechLoginDeeplinkHandler$NotFoundOTPException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class NotFoundOTPException extends RuntimeException {
        public NotFoundOTPException() {
            super("Не указан otp!");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TechLoginDeeplinkHandler(@NotNull AuthInteractor authInteractor, @NotNull AuthFlowMapper authFlowMapper, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(authFlowMapper, "authFlowMapper");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        this.authInteractor = authInteractor;
        this.authFlowMapper = authFlowMapper;
    }

    private final y<AuthState> callAction(String action, Map<String, ? extends Object> body) {
        y<Response> callAction = this.authInteractor.callAction(action, body);
        a aVar = new a(new TechLoginDeeplinkHandler$callAction$1(this), 4);
        callAction.getClass();
        r rVar = new r(callAction, aVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthState callAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AuthState) function1.invoke(p02);
    }

    private final String createAction(String phone, String otpId) {
        String builder = Uri.parse("fastEntryMobile").buildUpon().appendQueryParameter("phone", phone).appendQueryParameter("otpId", otpId).appendQueryParameter("forcePhoneRegistration", "false").toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e createAuthDestination(j route) {
        try {
            AuthState d11 = createRequest(route.b()).d();
            if (d11 != null) {
                return toDestination(d11);
            }
            return null;
        } catch (Exception e11) {
            Lm0.a.f17149a.d(e11);
            return null;
        }
    }

    private final y<AuthState> createRequest(Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("otp");
        if (queryParameter == null) {
            l e11 = y.e(new NotFoundOTPException());
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        String queryParameter2 = deeplink.getQueryParameter("phone");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = deeplink.getQueryParameter("otpid");
        if (queryParameter3 == null) {
            queryParameter3 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
        }
        return callAction(createAction(queryParameter2, queryParameter3), C2454a.b("otp", queryParameter));
    }

    private final e toDestination(AuthState authState) {
        String str;
        if (authState instanceof AuthState.BiometricDialog) {
            str = ((AuthState.BiometricDialog) authState).getConfig().getDeeplink();
        } else if (authState instanceof AuthState.Complete) {
            str = ((AuthState.Complete) authState).getDeeplink();
        } else if (authState instanceof AuthState.Redirect) {
            str = ((AuthState.Redirect) authState).getDeeplink();
        } else if (authState instanceof AuthState.Reload) {
            str = ((AuthState.Reload) authState).getDeeplink();
        } else {
            if (!(authState instanceof AuthState.SequentialDialog) && !(authState instanceof AuthState.ValidationError) && !(authState instanceof AuthState.Restriction)) {
                throw new o();
            }
            str = null;
        }
        if (str == null) {
            str = "ozon://my";
        }
        return new e(str);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getScheme(), "ozontech") && Lh.a.f(route, "login") && (queryParameter = route.b().getQueryParameter("otp")) != null && queryParameter.length() != 0;
    }

    @Override // IZ.a
    @NotNull
    public C8882c getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C8882c(new TechLoginDeeplinkHandler$getDestination$1(this, route, null));
    }
}
