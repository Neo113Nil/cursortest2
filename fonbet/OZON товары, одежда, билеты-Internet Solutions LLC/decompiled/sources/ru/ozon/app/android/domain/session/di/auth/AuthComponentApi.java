package ru.ozon.app.android.domain.session.di.auth;

import Fb0.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractor;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractor;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/domain/session/di/auth/AuthComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LFb0/a;", "getBiometryAuth", "()LFb0/a;", "Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "getAuthDeeplinkReceiver", "()Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "getAuthInteractor", "()Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "getBiometryInteractor", "()Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "getSberIdInteractor", "()Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthComponentApi extends InterfaceC6958a {
    @NotNull
    AuthDeeplinkReceiver getAuthDeeplinkReceiver();

    @NotNull
    AuthInteractor getAuthInteractor();

    @NotNull
    a getBiometryAuth();

    @NotNull
    BiometryInteractor getBiometryInteractor();

    @NotNull
    SberIdInteractor getSberIdInteractor();
}
