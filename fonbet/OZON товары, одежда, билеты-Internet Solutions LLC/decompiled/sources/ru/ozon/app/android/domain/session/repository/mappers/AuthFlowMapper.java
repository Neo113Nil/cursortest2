package ru.ozon.app.android.domain.session.repository.mappers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.domain.session.api.auth.models.AuthMethod;
import ru.ozon.app.android.domain.session.api.auth.models.AuthMethodsKt;
import ru.ozon.app.android.domain.session.api.auth.models.Data;
import ru.ozon.app.android.domain.session.api.auth.models.Error;
import ru.ozon.app.android.domain.session.api.auth.models.MappedAuthMethods;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.api.auth.models.Status;
import ru.ozon.app.android.domain.session.models.BiometricDialogConfig;
import ru.ozon.app.android.domain.session.state.AuthState;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/domain/session/repository/mappers/AuthFlowMapper;", "", "keyStoreRepository", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "<init>", "(Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;)V", "mapToState", "Lru/ozon/app/android/domain/session/state/AuthState;", "response", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "biometricDialogConfig", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "biometry", "Lru/ozon/app/android/domain/session/api/auth/models/Data$DialogBiometry;", "status", "Lru/ozon/app/android/domain/session/api/auth/models/Status;", "mapToDialogBiometry", "Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry;", "isShowBiometryDialog", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthFlowMapper {

    @NotNull
    private final KeyStoreRepository keyStoreRepository;

    public AuthFlowMapper(@NotNull KeyStoreRepository keyStoreRepository) {
        Intrinsics.checkNotNullParameter(keyStoreRepository, "keyStoreRepository");
        this.keyStoreRepository = keyStoreRepository;
    }

    private final BiometricDialogConfig biometricDialogConfig(Data.DialogBiometry biometry, Status status) {
        return new BiometricDialogConfig(biometry.getPermission().getTitle(), biometry.getPermission().getSubtitle(), biometry.getAnalyticTag(), status != null ? status.getDeeplink() : null);
    }

    private final boolean isShowBiometryDialog(Data.DialogBiometry biometry) {
        return biometry.isNeedToSetBiometry() && this.keyStoreRepository.canAuth();
    }

    private final Data.DialogBiometry mapToDialogBiometry(Data.Biometry biometry) {
        String analyticTag;
        Boolean isNeedToSetBiometry = biometry.isNeedToSetBiometry();
        if (isNeedToSetBiometry == null) {
            return null;
        }
        boolean booleanValue = isNeedToSetBiometry.booleanValue();
        Data.Biometry.Permission permission = biometry.getPermission();
        if (permission == null || (analyticTag = biometry.getAnalyticTag()) == null) {
            return null;
        }
        return new Data.DialogBiometry(booleanValue, permission, analyticTag);
    }

    public final AuthState mapToState(@NotNull Response response) {
        AuthMethod authMethod;
        Data.Biometry biometry;
        Intrinsics.checkNotNullParameter(response, "response");
        Data data = response.getData();
        Data.DialogBiometry mapToDialogBiometry = (data == null || (biometry = data.getBiometry()) == null) ? null : mapToDialogBiometry(biometry);
        Status status = response.getStatus();
        Error error = response.getError();
        Data data2 = response.getData();
        MappedAuthMethods desirable = (data2 == null || (authMethod = data2.getAuthMethod()) == null) ? null : AuthMethodsKt.toDesirable(authMethod);
        if (desirable != null && Intrinsics.d(desirable.getType(), "sequential")) {
            return new AuthState.SequentialDialog(null, mapToDialogBiometry != null ? biometricDialogConfig(mapToDialogBiometry, status) : null);
        }
        if (mapToDialogBiometry != null && isShowBiometryDialog(mapToDialogBiometry)) {
            return new AuthState.BiometricDialog(biometricDialogConfig(mapToDialogBiometry, status));
        }
        if (h.D(error != null ? error.getType() : null, "VALIDATION", true)) {
            return new AuthState.ValidationError(error != null ? error.getFields() : null);
        }
        if (h.D(error != null ? error.getType() : null, "RESTRICTION", true)) {
            return new AuthState.Restriction(error != null ? error.getMessage() : null);
        }
        if (h.D(error != null ? error.getType() : null, "RELOAD", true)) {
            String deeplink = error != null ? error.getDeeplink() : null;
            String message = error != null ? error.getMessage() : null;
            Data data3 = response.getData();
            return new AuthState.Reload(deeplink, message, data3 != null ? data3.getPostData() : null);
        }
        if (status != null ? Intrinsics.d(status.isCompleted(), Boolean.TRUE) : false) {
            return new AuthState.Complete(status.getMessage(), status.getDeeplink());
        }
        if ((status != null ? status.getDeeplink() : null) == null) {
            return null;
        }
        String deeplink2 = status.getDeeplink();
        if (deeplink2 == null) {
            deeplink2 = "";
        }
        Data data4 = response.getData();
        return new AuthState.Redirect(deeplink2, data4 != null ? data4.getPostData() : null);
    }
}
