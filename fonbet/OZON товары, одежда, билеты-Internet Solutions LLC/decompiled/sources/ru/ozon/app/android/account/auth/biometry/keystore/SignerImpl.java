package ru.ozon.app.android.account.auth.biometry.keystore;

import Lm0.a;
import java.security.Signature;
import java.security.SignatureException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/auth/biometry/keystore/SignerImpl;", "Lru/ozon/app/android/account/auth/biometry/keystore/Signer;", "signature", "Ljava/security/Signature;", "<init>", "(Ljava/security/Signature;)V", "sign", "", "message", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SignerImpl implements Signer {

    @NotNull
    private final Signature signature;

    public SignerImpl(@NotNull Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.signature = signature;
    }

    @Override // ru.ozon.app.android.account.auth.biometry.keystore.Signer
    @NotNull
    public String sign(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Signature signature = this.signature;
            byte[] bytes = message.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            signature.update(bytes);
            byte[] sign = this.signature.sign();
            Intrinsics.f(sign);
            return EncryptExtKt.encryptBase64(sign);
        } catch (SignatureException e11) {
            a.f17149a.e(e11);
            return "";
        }
    }
}
