package ru.ozon.app.android.account.auth.biometry.keystore;

import Lm0.a;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.n;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepositoryImpl;", "Lru/ozon/app/android/account/auth/biometry/keystore/KeyStoreRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "canAuthByBiometrySystem", "()Z", "canAuth", "Ljava/security/Signature;", "initSign", "()Ljava/security/Signature;", "", "deleteKey", "()V", "Landroid/content/Context;", "Ljava/security/KeyStore;", "keyStore", "Ljava/security/KeyStore;", "Ljava/security/KeyPairGenerator;", "keyGenerator", "Ljava/security/KeyPairGenerator;", "Lr/n;", "biometricManager", "Lr/n;", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyStoreRepositoryImpl implements KeyStoreRepository {

    @NotNull
    private final n biometricManager;

    @NotNull
    private final Context context;
    private KeyPairGenerator keyGenerator;
    private KeyStore keyStore;

    public KeyStoreRepositoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        n c11 = n.c(context);
        Intrinsics.checkNotNullExpressionValue(c11, "from(...)");
        this.biometricManager = c11;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.keyStore = keyStore;
        } catch (Exception e11) {
            a.f17149a.w(e11);
        }
        try {
            this.keyGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        } catch (Exception e12) {
            a.f17149a.w(e12);
        }
    }

    private final boolean canAuthByBiometrySystem() {
        KeyguardManager keyguardManager = (KeyguardManager) androidx.core.content.a.getSystemService(this.context, KeyguardManager.class);
        FingerprintManager fingerprintManager = (FingerprintManager) androidx.core.content.a.getSystemService(this.context, FingerprintManager.class);
        return PermissionExtensionsKt.isPermissionGranted(this.context, "android.permission.USE_FINGERPRINT") && fingerprintManager != null && fingerprintManager.hasEnrolledFingerprints() && keyguardManager != null && keyguardManager.isKeyguardSecure();
    }

    @Override // ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository
    public boolean canAuth() {
        return this.keyStore != null && this.keyGenerator != null && this.biometricManager.a(255) == 0 && canAuthByBiometrySystem();
    }

    @Override // ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository
    public void deleteKey() {
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            Intrinsics.n("keyStore");
            throw null;
        }
        if (keyStore.containsAlias("OZON_PAY_KEY")) {
            try {
                KeyStore keyStore2 = this.keyStore;
                if (keyStore2 != null) {
                    keyStore2.deleteEntry("OZON_PAY_KEY");
                } else {
                    Intrinsics.n("keyStore");
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository
    public Signature initSign() {
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            KeyStore keyStore = this.keyStore;
            if (keyStore == null) {
                Intrinsics.n("keyStore");
                throw null;
            }
            Key key = keyStore.getKey("OZON_PAY_KEY", null);
            PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
            if (privateKey == null) {
                return null;
            }
            signature.initSign(privateKey);
            return signature;
        } catch (Exception unused) {
            return null;
        }
    }
}
