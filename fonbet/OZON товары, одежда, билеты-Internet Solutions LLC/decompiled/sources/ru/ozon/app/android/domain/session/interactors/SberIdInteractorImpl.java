package ru.ozon.app.android.domain.session.interactors;

import Bc.m;
import Sc.InterfaceC3999a;
import android.net.Uri;
import io.reactivex.C;
import io.reactivex.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.AuthRepository;
import ru.ozon.app.android.domain.session.repository.BiometryInfoRepository;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;

@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/domain/session/interactors/SberIdInteractorImpl;", "Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "authResponseMapper", "Lru/ozon/app/android/domain/session/repository/AuthRepository;", "authRepository", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "biometryInfoRepository", "<init>", "(Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;Lru/ozon/app/android/domain/session/repository/AuthRepository;Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;)V", "Landroid/net/Uri;", "uri", "", "", "parseQuery", "(Landroid/net/Uri;)Ljava/util/Map;", "action", "", "", "body", "Lio/reactivex/y;", "getUrl", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "origin", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "auth", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "Lru/ozon/app/android/domain/session/repository/AuthRepository;", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SberIdInteractorImpl implements SberIdInteractor {

    @NotNull
    private final AuthRepository authRepository;

    @NotNull
    private final AuthResponseMapper authResponseMapper;

    @NotNull
    private final BiometryInfoRepository biometryInfoRepository;

    public SberIdInteractorImpl(@NotNull AuthResponseMapper authResponseMapper, @NotNull AuthRepository authRepository, @NotNull BiometryInfoRepository biometryInfoRepository) {
        Intrinsics.checkNotNullParameter(authResponseMapper, "authResponseMapper");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(biometryInfoRepository, "biometryInfoRepository");
        this.authResponseMapper = authResponseMapper;
        this.authRepository = authRepository;
        this.biometryInfoRepository = biometryInfoRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C auth$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    private final Map<String, String> parseQuery(Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String queryParameter = uri.getQueryParameter("state");
        if (queryParameter != null) {
            if (h.K(queryParameter)) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                linkedHashMap.put("state", queryParameter);
            }
        }
        String queryParameter2 = uri.getQueryParameter("code");
        if (queryParameter2 != null) {
            if (h.K(queryParameter2)) {
                queryParameter2 = null;
            }
            if (queryParameter2 != null) {
                linkedHashMap.put("code", queryParameter2);
            }
        }
        String queryParameter3 = uri.getQueryParameter("error");
        if (queryParameter3 != null) {
            String str = h.K(queryParameter3) ? null : queryParameter3;
            if (str != null) {
                linkedHashMap.put("error", str);
            }
        }
        return linkedHashMap;
    }

    @Override // ru.ozon.app.android.domain.session.interactors.SberIdInteractor
    @InterfaceC3999a
    @NotNull
    public y<Response> auth(@NotNull Uri uri, @NotNull String action, String origin) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(action, "action");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> parseQuery = parseQuery(uri);
        if (parseQuery.isEmpty()) {
            parseQuery = null;
        }
        if (parseQuery != null) {
            linkedHashMap.put("data", parseQuery);
        }
        if (origin != null) {
            linkedHashMap.put("origin", origin);
        }
        linkedHashMap.putAll(this.biometryInfoRepository.getBiometryInfo());
        y<Response> callAction = this.authRepository.callAction(action, linkedHashMap);
        DM.a aVar = new DM.a(new SberIdInteractorImpl$auth$4(this.authResponseMapper), 2);
        callAction.getClass();
        m mVar = new m(callAction, aVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.domain.session.interactors.SberIdInteractor
    @InterfaceC3999a
    @NotNull
    public y<String> getUrl(@NotNull String action, @NotNull Map<String, ? extends Object> body) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(body, "body");
        return this.authRepository.getSberAuthUrl(action, body);
    }
}
