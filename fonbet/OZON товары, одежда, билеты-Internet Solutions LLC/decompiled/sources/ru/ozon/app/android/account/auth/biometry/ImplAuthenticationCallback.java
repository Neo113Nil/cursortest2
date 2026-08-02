package ru.ozon.app.android.account.auth.biometry;

import java.security.Signature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.app.android.account.auth.biometry.keystore.SignerImpl;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/auth/biometry/ImplAuthenticationCallback;", "Lr/o$a;", "Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;", "authenticationSignCallback", "<init>", "(Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;)V", "Lr/o$b;", "result", "", "onAuthenticationSucceeded", "(Lr/o$b;)V", "", "errorCode", "", "errString", "onAuthenticationError", "(ILjava/lang/CharSequence;)V", "onAuthenticationFailed", "()V", "Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImplAuthenticationCallback extends o.a {

    @NotNull
    private final AuthenticationSignCallback authenticationSignCallback;

    public ImplAuthenticationCallback(@NotNull AuthenticationSignCallback authenticationSignCallback) {
        Intrinsics.checkNotNullParameter(authenticationSignCallback, "authenticationSignCallback");
        this.authenticationSignCallback = authenticationSignCallback;
    }

    @Override // r.o.a
    public void onAuthenticationError(int errorCode, @NotNull CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        this.authenticationSignCallback.onAuthenticationError(errorCode, errString);
    }

    @Override // r.o.a
    public void onAuthenticationFailed() {
        this.authenticationSignCallback.onAuthenticationFailed();
    }

    @Override // r.o.a
    public void onAuthenticationSucceeded(@NotNull o.b result) {
        Signature d11;
        Intrinsics.checkNotNullParameter(result, "result");
        o.c b11 = result.b();
        SignerImpl signerImpl = (b11 == null || (d11 = b11.d()) == null) ? null : new SignerImpl(d11);
        if (signerImpl != null) {
            this.authenticationSignCallback.onAuthenticationSucceeded(signerImpl);
        } else {
            this.authenticationSignCallback.onAuthenticationError(-1, "");
        }
    }
}
