package ru.ozon.app.android.account.auth.biometry;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.security.Signature;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;", "", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "keyStoreRepository", "<init>", "(Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;)V", "Landroidx/fragment/app/m;", "fragment", "Lr/o$d;", "info", "Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;", "authenticationSignCallback", "", "authenticate", "(Landroidx/fragment/app/m;Lr/o$d;Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;)V", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BiometryAuthenicator {
    private final ExecutorService executor;

    @NotNull
    private final KeyStoreRepository keyStoreRepository;

    public BiometryAuthenicator(@NotNull KeyStoreRepository keyStoreRepository) {
        Intrinsics.checkNotNullParameter(keyStoreRepository, "keyStoreRepository");
        this.keyStoreRepository = keyStoreRepository;
        this.executor = Executors.newSingleThreadExecutor();
    }

    public final void authenticate(@NotNull ComponentCallbacksC5392m fragment, @NotNull o.d info, @NotNull AuthenticationSignCallback authenticationSignCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(authenticationSignCallback, "authenticationSignCallback");
        o oVar = new o(fragment, this.executor, new ImplAuthenticationCallback(authenticationSignCallback));
        Signature initSign = this.keyStoreRepository.initSign();
        o.c cVar = initSign != null ? new o.c(initSign) : null;
        if (cVar == null) {
            authenticationSignCallback.onAuthenticationError(-1, "");
        } else {
            oVar.b(info, cVar);
        }
    }
}
