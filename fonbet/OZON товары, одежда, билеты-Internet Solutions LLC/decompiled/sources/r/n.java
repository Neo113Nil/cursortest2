package r;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final c f82325a;

    /* renamed from: b, reason: collision with root package name */
    private final BiometricManager f82326b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.b f82327c;

    private static class a {
        static int a(@NonNull BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(@NonNull Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes8.dex */
    private static class b {
        static int a(@NonNull BiometricManager biometricManager, int i11) {
            return biometricManager.canAuthenticate(i11);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f82328a;

        c(@NonNull Context context) {
            this.f82328a = context.getApplicationContext();
        }

        public final BiometricManager a() {
            return a.b(this.f82328a);
        }

        public final androidx.core.hardware.fingerprint.b b() {
            return androidx.core.hardware.fingerprint.b.b(this.f82328a);
        }

        public final boolean c() {
            return x.a(this.f82328a) != null;
        }

        public final boolean d() {
            return x.b(this.f82328a);
        }

        public final boolean e() {
            return y.a(this.f82328a);
        }

        public final boolean f() {
            String str = Build.MODEL;
            return s.a(this.f82328a);
        }
    }

    n(@NonNull c cVar) {
        this.f82325a = cVar;
        int i11 = Build.VERSION.SDK_INT;
        this.f82326b = i11 >= 29 ? cVar.a() : null;
        this.f82327c = i11 <= 29 ? cVar.b() : null;
    }

    private int b() {
        androidx.core.hardware.fingerprint.b bVar = this.f82327c;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (bVar.d()) {
            return !bVar.c() ? 11 : 0;
        }
        return 12;
    }

    @NonNull
    public static n c(@NonNull Context context) {
        return new n(new c(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i11) {
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject b11;
        int i12 = Build.VERSION.SDK_INT;
        int i13 = 1;
        if (i12 >= 30) {
            BiometricManager biometricManager2 = this.f82326b;
            if (biometricManager2 != null) {
                return b.a(biometricManager2, i11);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!C9089b.c(i11)) {
            return -2;
        }
        if (i11 == 0) {
            return 12;
        }
        c cVar = this.f82325a;
        if (!cVar.c()) {
            return 12;
        }
        int i14 = 0;
        if (C9089b.b(i11)) {
            return cVar.d() ? 0 : 11;
        }
        if (i12 != 29) {
            if (i12 != 28) {
                return b();
            }
            if (cVar.e()) {
                return !cVar.d() ? b() : b() == 0 ? 0 : -1;
            }
            return 12;
        }
        if (C9089b.d(i11)) {
            BiometricManager biometricManager3 = this.f82326b;
            if (biometricManager3 != null) {
                return a.a(biometricManager3);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c11 = a.c();
        if (c11 != null && (b11 = r.b(r.a())) != null) {
            try {
                Object invoke = c11.invoke(this.f82326b, b11);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = this.f82326b;
                if (biometricManager != null) {
                }
                return cVar.f() ? i13 : i13;
            } catch (IllegalArgumentException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = this.f82326b;
                if (biometricManager != null) {
                }
                if (cVar.f()) {
                }
            } catch (InvocationTargetException e13) {
                e = e13;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                biometricManager = this.f82326b;
                if (biometricManager != null) {
                }
                if (cVar.f()) {
                }
            }
        }
        biometricManager = this.f82326b;
        if (biometricManager != null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        } else {
            i13 = a.a(biometricManager);
        }
        if (cVar.f() && i13 == 0) {
            if (!cVar.d()) {
                i14 = b();
            } else if (b() != 0) {
                i14 = -1;
            }
            return i14;
        }
    }
}
