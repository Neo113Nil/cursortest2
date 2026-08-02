package ru.ozon.app.android.domain.session.repository;

import Bc.m;
import DJ.e;
import Sc.InterfaceC3999a;
import android.net.Uri;
import io.reactivex.C;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.api.auth.CredentialsApi;
import ru.ozon.app.android.domain.session.api.auth.SberAuthApi;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.api.auth.models.SberAuthResponse;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/domain/session/repository/AuthRepository;", "", "Lru/ozon/app/android/domain/session/api/auth/CredentialsApi;", "api", "Lru/ozon/app/android/domain/session/api/auth/SberAuthApi;", "sberAuthApi", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(Lru/ozon/app/android/domain/session/api/auth/CredentialsApi;Lru/ozon/app/android/domain/session/api/auth/SberAuthApi;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", "action", "buildUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "callAction", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "getSberAuthUrl", "Lru/ozon/app/android/domain/session/api/auth/CredentialsApi;", "Lru/ozon/app/android/domain/session/api/auth/SberAuthApi;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthRepository {

    @NotNull
    private final CredentialsApi api;

    @NotNull
    private final NetworkComponentConfig config;

    @NotNull
    private final SberAuthApi sberAuthApi;

    public AuthRepository(@NotNull CredentialsApi api, @NotNull SberAuthApi sberAuthApi, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(sberAuthApi, "sberAuthApi");
        Intrinsics.checkNotNullParameter(config, "config");
        this.api = api;
        this.sberAuthApi = sberAuthApi;
        this.config = config;
    }

    private final String buildUrl(String action) {
        Uri.Builder appendPath = Uri.parse(this.config.getApiUrl()).buildUpon().appendPath("composer-api.bx").appendPath("_action");
        Intrinsics.checkNotNullExpressionValue(appendPath, "appendPath(...)");
        String uri = UriExtKt.appendEndPoint(appendPath, action).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C getSberAuthUrl$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @InterfaceC3999a
    @NotNull
    public final y<Response> callAction(@NotNull String action, @NotNull Map<String, ? extends Object> body) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(body, "body");
        return this.api.callAction(buildUrl(action), body);
    }

    @InterfaceC3999a
    @NotNull
    public final y<String> getSberAuthUrl(@NotNull String action, @NotNull Map<String, ? extends Object> body) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(body, "body");
        y<SberAuthResponse> callAuthUriAction = this.sberAuthApi.callAuthUriAction(buildUrl(action), body);
        e eVar = new e(AuthRepository$getSberAuthUrl$1.INSTANCE, 1);
        callAuthUriAction.getClass();
        m mVar = new m(callAuthUriAction, eVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
