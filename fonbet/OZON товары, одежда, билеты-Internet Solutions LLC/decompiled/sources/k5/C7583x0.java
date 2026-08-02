package k5;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;

/* renamed from: k5.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7583x0 extends D0<Om0.a> {

    /* renamed from: j, reason: collision with root package name */
    static final String f70877j = C7563s0.a(new byte[]{109, -24, 64, 123, 117, -39, 62, -107, 91, -79, 72, -42, 72, 120, 9, 33, 24, 43, 42, 44, -93, 80, Byte.MIN_VALUE, -108, 90, -58, -97, -27, -77, 88, -41, -55});

    /* renamed from: k, reason: collision with root package name */
    static final String f70878k = C7563s0.a(new byte[]{-73, -64, -79, 26, -119, -122, 111, 123, 39, -100, 3, 25, -60, -90, 84, -5, 57, 82, -77, -5, 93, -86, -41, -52, -99, 71, -10, 102, -85, -99, -86, 100});

    /* renamed from: l, reason: collision with root package name */
    static final String f70879l = C7563s0.a(new byte[]{-127, 114, -91, 0, -80, -68, -9, 50, -102, -50, -73, 32, -36, -116, -79, 13});

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70880e;

    /* renamed from: f, reason: collision with root package name */
    private FingerprintManager f70881f;

    /* renamed from: g, reason: collision with root package name */
    private BiometricManager f70882g;

    /* renamed from: h, reason: collision with root package name */
    private KeyguardManager f70883h;

    /* renamed from: i, reason: collision with root package name */
    private int f70884i;

    C7583x0(@NonNull Context context) {
        super(Mm0.e.AuthenticationInfo);
        this.f70880e = context;
        int i11 = Build.VERSION.SDK_INT;
        this.f70883h = (KeyguardManager) context.getSystemService("keyguard");
        this.f70881f = (FingerprintManager) context.getSystemService("fingerprint");
        if (i11 >= 29) {
            this.f70882g = Jj.a.a(context.getSystemService("biometric"));
        }
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        return new Om0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00df, code lost:
    
        if (r11.f70884i == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k5.D0
    @SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Om0.a u() throws Mm0.a, D1 {
        int i11;
        boolean z11;
        int canAuthenticate;
        int canAuthenticate2;
        int i12 = Build.VERSION.SDK_INT;
        Context context = this.f70880e;
        if (i12 >= 29 && this.f70882g != null && Gf.d.l(context, "android.permission.USE_BIOMETRIC")) {
            if (i12 >= 30) {
                canAuthenticate2 = this.f70882g.canAuthenticate(255);
                this.f70884i = canAuthenticate2;
            } else {
                canAuthenticate = this.f70882g.canAuthenticate();
                this.f70884i = canAuthenticate;
            }
        }
        Om0.a aVar = (Om0.a) super.u();
        if (aVar != null) {
            boolean z12 = false;
            aVar.put(f70877j, Boolean.valueOf(this.f70883h != null ? !r7.isDeviceLocked() : false));
            if (i12 <= 28) {
                FingerprintManager fingerprintManager = this.f70881f;
                if (fingerprintManager != null && Gf.d.l(context, "android.permission.USE_FINGERPRINT")) {
                    z11 = fingerprintManager.isHardwareDetected();
                    aVar.put(f70878k, Boolean.valueOf(z11));
                    if (i12 > 28) {
                        try {
                            KeyStore keyStore = KeyStore.getInstance(C7563s0.a(new byte[]{45, 39, 123, -1, -78, 28, 117, 36, -95, 126, 124, -90, -111, -112, 22, 91}));
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", C7563s0.a(new byte[]{45, 39, 123, -1, -78, 28, 117, 36, -95, 126, 124, -90, -111, -112, 22, 91}));
                            if (keyGenerator != null && keyStore != null) {
                                keyStore.load(null);
                                keyGenerator.init(new KeyGenParameterSpec.Builder(C7563s0.a(new byte[]{-40, -10, -60, 77, -89, -81, 108, 96, 52, 69, -4, -110, -79, 34, 32, -50}), 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
                            }
                        } catch (Exception unused) {
                        }
                        aVar.put(f70879l, Boolean.valueOf(z12));
                    } else {
                        if (i12 >= 29) {
                            if (Gf.d.l(context, "android.permission.USE_BIOMETRIC")) {
                            }
                        }
                        aVar.put(f70879l, Boolean.valueOf(z12));
                    }
                    z12 = true;
                    aVar.put(f70879l, Boolean.valueOf(z12));
                }
                z11 = false;
                aVar.put(f70878k, Boolean.valueOf(z11));
                if (i12 > 28) {
                }
                z12 = true;
                aVar.put(f70879l, Boolean.valueOf(z12));
            } else {
                if (i12 >= 29 && this.f70882g != null && Gf.d.l(context, "android.permission.USE_BIOMETRIC") && (i11 = this.f70884i) != 12 && i11 != 1) {
                    z11 = true;
                    aVar.put(f70878k, Boolean.valueOf(z11));
                    if (i12 > 28) {
                    }
                    z12 = true;
                    aVar.put(f70879l, Boolean.valueOf(z12));
                }
                z11 = false;
                aVar.put(f70878k, Boolean.valueOf(z11));
                if (i12 > 28) {
                }
                z12 = true;
                aVar.put(f70879l, Boolean.valueOf(z12));
            }
        }
        return aVar;
    }
}
