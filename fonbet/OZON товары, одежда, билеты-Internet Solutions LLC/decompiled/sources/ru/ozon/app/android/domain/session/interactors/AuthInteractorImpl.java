package ru.ozon.app.android.domain.session.interactors;

import Bc.m;
import Hs.b;
import Hs.c;
import io.reactivex.C;
import io.reactivex.y;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.BiometryInfoRepository;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/domain/session/interactors/AuthInteractorImpl;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "biometryInfoRepository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "authResponseMapper", "<init>", "(Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;)V", "", "", "", "body", "action", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "createRequest", "(Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "callAction", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "callActionWithTracking", "(Ljava/lang/String;LW10/c;Ljava/util/Map;)Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "", "sendTrackEvent", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/repository/BiometryInfoRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthInteractorImpl implements AuthInteractor {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final AuthResponseMapper authResponseMapper;

    @NotNull
    private final BiometryInfoRepository biometryInfoRepository;

    public AuthInteractorImpl(@NotNull BiometryInfoRepository biometryInfoRepository, @NotNull ActionV2Repository actionRepository, @NotNull AuthResponseMapper authResponseMapper) {
        Intrinsics.checkNotNullParameter(biometryInfoRepository, "biometryInfoRepository");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(authResponseMapper, "authResponseMapper");
        this.biometryInfoRepository = biometryInfoRepository;
        this.actionRepository = actionRepository;
        this.authResponseMapper = authResponseMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C callAction$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C callActionWithTracking$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    private final ActionV2Request createRequest(Map<String, ? extends Object> body, String action) {
        LinkedHashMap u11 = U.u(body);
        HashMap<String, ? extends Object> biometryInfo = this.biometryInfoRepository.getBiometryInfo();
        final AuthInteractorImpl$createRequest$1$1 authInteractorImpl$createRequest$1$1 = new AuthInteractorImpl$createRequest$1$1(u11);
        biometryInfo.forEach(new BiConsumer() { // from class: Hs.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function2.this.invoke(obj, obj2);
            }
        });
        return new ActionV2Request(u11, action, false, 4, null);
    }

    @Override // ru.ozon.app.android.domain.session.interactors.AuthInteractor
    @NotNull
    public y<Response> callAction(@NotNull String action, @NotNull Map<String, ? extends Object> body) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(body, "body");
        y callAction = this.actionRepository.callAction(createRequest(body, action), Response.class);
        c cVar = new c(new AuthInteractorImpl$callAction$1(this), 0);
        callAction.getClass();
        m mVar = new m(callAction, cVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.domain.session.interactors.AuthInteractor
    @NotNull
    public y<Response> callActionWithTracking(@NotNull String action, @NotNull W10.c trackingData, @NotNull Map<String, ? extends Object> body) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(body, "body");
        y callActionWithTracking = this.actionRepository.callActionWithTracking(createRequest(body, action), trackingData, Response.class);
        b bVar = new b(new AuthInteractorImpl$callActionWithTracking$1(this), 0);
        callActionWithTracking.getClass();
        m mVar = new m(callActionWithTracking, bVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.domain.session.interactors.AuthInteractor
    @NotNull
    public y<ActionV2Response<Unit>> sendTrackEvent(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this.actionRepository.callAction(new ActionV2Request(null, action, false, 5, null), Unit.class);
    }
}
