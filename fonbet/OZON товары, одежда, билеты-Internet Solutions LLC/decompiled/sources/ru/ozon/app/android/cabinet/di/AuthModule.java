package ru.ozon.app.android.cabinet.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.domain.session.api.auth.AuthBiometricApi;
import ru.ozon.app.android.domain.session.api.auth.CredentialsApi;
import ru.ozon.app.android.domain.session.api.auth.SberAuthApi;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/di/AuthModule;", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AuthModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cabinet/di/AuthModule$Companion;", "", "<init>", "()V", "provideAuthBiometricApi", "Lru/ozon/app/android/domain/session/api/auth/AuthBiometricApi;", "retrofit", "Lretrofit2/Retrofit;", "provideApi", "Lru/ozon/app/android/domain/session/api/auth/CredentialsApi;", "provideSberApi", "Lru/ozon/app/android/domain/session/api/auth/SberAuthApi;", "provideAuthDeeplinkReceiver", "Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CredentialsApi provideApi(@NotNull Retrofit retrofit) {
            return (CredentialsApi) C4598rp.b(retrofit, "retrofit", CredentialsApi.class, "create(...)");
        }

        @NotNull
        public final AuthBiometricApi provideAuthBiometricApi(@NotNull Retrofit retrofit) {
            return (AuthBiometricApi) C4598rp.b(retrofit, "retrofit", AuthBiometricApi.class, "create(...)");
        }

        @NotNull
        public final AuthDeeplinkReceiver provideAuthDeeplinkReceiver() {
            return new AuthDeeplinkReceiver();
        }

        @NotNull
        public final SberAuthApi provideSberApi(@NotNull Retrofit retrofit) {
            return (SberAuthApi) C4598rp.b(retrofit, "retrofit", SberAuthApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
