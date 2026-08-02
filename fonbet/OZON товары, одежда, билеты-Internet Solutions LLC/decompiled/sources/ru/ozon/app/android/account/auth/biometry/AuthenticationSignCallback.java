package ru.ozon.app.android.account.auth.biometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.auth.biometry.keystore.Signer;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;", "", "<init>", "()V", "onAuthenticationSucceeded", "", "signer", "Lru/ozon/app/android/account/auth/biometry/keystore/Signer;", "onAuthenticationError", "errorCode", "", "errString", "", "onAuthenticationFailed", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AuthenticationSignCallback {
    public void onAuthenticationError(int errorCode, @NotNull CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
    }

    public void onAuthenticationFailed() {
    }

    public void onAuthenticationSucceeded(@NotNull Signer signer) {
        Intrinsics.checkNotNullParameter(signer, "signer");
    }
}
