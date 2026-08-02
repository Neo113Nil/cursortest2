package ru.ozon.app.android.domain.session.api.auth;

import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.domain.session.api.auth.models.AuthBiometricSettingRequest;
import ru.ozon.app.android.domain.session.api.auth.models.ClearBiometryDeviceRequest;
import ru.ozon.app.android.domain.session.api.auth.models.PublicKeyRequest;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/AuthBiometricApi;", "", "Lru/ozon/app/android/domain/session/api/auth/models/PublicKeyRequest;", "request", "Lio/reactivex/b;", "setDevicePublicKey", "(Lru/ozon/app/android/domain/session/api/auth/models/PublicKeyRequest;)Lio/reactivex/b;", "Lru/ozon/app/android/domain/session/api/auth/models/AuthBiometricSettingRequest;", "saveAuthBiometricSettings", "(Lru/ozon/app/android/domain/session/api/auth/models/AuthBiometricSettingRequest;)Lio/reactivex/b;", "Lru/ozon/app/android/domain/session/api/auth/models/ClearBiometryDeviceRequest;", "clearBiometryDeviceRequest", "clearBiometryByDevice", "(Lru/ozon/app/android/domain/session/api/auth/models/ClearBiometryDeviceRequest;)Lio/reactivex/b;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AuthBiometricApi {
    @POST("composer-api.bx/_action/clearBiometryByDevice")
    @NotNull
    AbstractC7094b clearBiometryByDevice(@Body @NotNull ClearBiometryDeviceRequest clearBiometryDeviceRequest);

    @POST("composer-api.bx/_action/saveAuthBiometrySettings")
    @NotNull
    AbstractC7094b saveAuthBiometricSettings(@Body @NotNull AuthBiometricSettingRequest request);

    @POST("composer-api.bx/_action/setDevicePublicKey")
    @NotNull
    AbstractC7094b setDevicePublicKey(@Body @NotNull PublicKeyRequest request);
}
