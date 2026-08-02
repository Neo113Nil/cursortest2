package ru.ozon.app.android.domain.session.interactors;

import Bc.m;
import Hs.d;
import Hs.e;
import W10.c;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.domain.session.api.auth.AuthBiometricApi;
import ru.ozon.app.android.domain.session.api.auth.models.ClearBiometryDeviceRequest;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/domain/session/interactors/BiometryInteractorImpl;", "Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "Lru/ozon/app/android/domain/session/api/auth/AuthBiometricApi;", "biometricApi", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "keyStoreRepository", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "mapper", "<init>", "(Lru/ozon/app/android/domain/session/api/auth/AuthBiometricApi;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;)V", "", "action", "signed", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "auth", "(Ljava/lang/String;Ljava/lang/String;LW10/c;)Lio/reactivex/y;", "Lio/reactivex/b;", "deleteKey", "()Lio/reactivex/b;", "Lru/ozon/app/android/domain/session/api/auth/AuthBiometricApi;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/domain/session/repository/mappers/AuthResponseMapper;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BiometryInteractorImpl implements BiometryInteractor {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @NotNull
    private final AuthBiometricApi biometricApi;

    @NotNull
    private final KeyStoreRepository keyStoreRepository;

    @NotNull
    private final AuthResponseMapper mapper;

    public BiometryInteractorImpl(@NotNull AuthBiometricApi biometricApi, @NotNull ActionV2Repository actionRepository, @NotNull KeyStoreRepository keyStoreRepository, @NotNull ApplicationInfoDataSource applicationInfoDataSource, @NotNull AuthResponseMapper mapper) {
        Intrinsics.checkNotNullParameter(biometricApi, "biometricApi");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(keyStoreRepository, "keyStoreRepository");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.biometricApi = biometricApi;
        this.actionRepository = actionRepository;
        this.keyStoreRepository = keyStoreRepository;
        this.applicationInfoDataSource = applicationInfoDataSource;
        this.mapper = mapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C auth$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C auth$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.domain.session.interactors.BiometryInteractor
    @NotNull
    public y<Response> auth(@NotNull String action, @NotNull String signed, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(signed, "signed");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        y callActionWithTracking = this.actionRepository.callActionWithTracking(new ActionV2Request(U.j(new Pair("deviceId", this.applicationInfoDataSource.getUniqueApplicationId()), new Pair("signature", signed)), action, false, 4, null), trackingData, Response.class);
        d dVar = new d(new BiometryInteractorImpl$auth$1(this), 0);
        callActionWithTracking.getClass();
        m mVar = new m(new m(callActionWithTracking, dVar), new e(new BiometryInteractorImpl$auth$2(this), 0));
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.domain.session.interactors.BiometryInteractor
    @NotNull
    public AbstractC7094b deleteKey() {
        String uniqueApplicationId = this.applicationInfoDataSource.getUniqueApplicationId();
        this.keyStoreRepository.deleteKey();
        return this.biometricApi.clearBiometryByDevice(new ClearBiometryDeviceRequest(uniqueApplicationId));
    }
}
