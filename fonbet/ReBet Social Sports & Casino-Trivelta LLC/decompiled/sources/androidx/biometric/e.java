package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.C6030a;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f17483a;

    /* renamed from: b, reason: collision with root package name */
    public final BiometricManager f17484b;

    /* renamed from: c, reason: collision with root package name */
    public final C6030a f17485c;

    public static class a {
        public static int a(@NonNull BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager b(@NonNull Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    public static class b {
        public static int a(@NonNull BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    public static class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f17486a;

        public c(Context context) {
            this.f17486a = context.getApplicationContext();
        }

        @Override // androidx.biometric.e.d
        public boolean a() {
            return k.a(this.f17486a) != null;
        }

        @Override // androidx.biometric.e.d
        public boolean b() {
            return k.b(this.f17486a);
        }

        @Override // androidx.biometric.e.d
        public boolean c() {
            return h.a(this.f17486a, Build.MODEL);
        }

        @Override // androidx.biometric.e.d
        public C6030a d() {
            return C6030a.c(this.f17486a);
        }

        @Override // androidx.biometric.e.d
        public BiometricManager e() {
            return a.b(this.f17486a);
        }

        @Override // androidx.biometric.e.d
        public boolean f() {
            return l.a(this.f17486a);
        }
    }

    public interface d {
        boolean a();

        boolean b();

        boolean c();

        C6030a d();

        BiometricManager e();

        boolean f();
    }

    public e(d dVar) {
        this.f17483a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f17484b = i10 >= 29 ? dVar.e() : null;
        this.f17485c = i10 <= 29 ? dVar.d() : null;
    }

    public static e g(Context context) {
        return new e(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f17484b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int b(int i10) {
        if (!androidx.biometric.b.e(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f17483a.a()) {
            return 12;
        }
        if (androidx.biometric.b.c(i10)) {
            return this.f17483a.b() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return androidx.biometric.b.f(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f17483a.f()) {
            return d();
        }
        return 12;
    }

    public final int c() {
        C6030a c6030a = this.f17485c;
        if (c6030a == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (c6030a.f()) {
            return !this.f17485c.e() ? 11 : 0;
        }
        return 12;
    }

    public final int d() {
        return !this.f17483a.b() ? c() : c() == 0 ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e() {
        int f10;
        BiometricPrompt.CryptoObject d10;
        Method c10 = a.c();
        if (c10 != null && (d10 = g.d(g.a())) != null) {
            try {
                Object invoke = c10.invoke(this.f17484b, d10);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                return this.f17483a.c() ? f10 : f10;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                if (this.f17483a.c()) {
                }
            } catch (InvocationTargetException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                f10 = f();
                if (this.f17483a.c()) {
                }
            }
        }
        f10 = f();
        if (this.f17483a.c() && f10 == 0) {
            return d();
        }
    }

    public final int f() {
        BiometricManager biometricManager = this.f17484b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
