package p0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6030a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62884a;

    /* renamed from: p0.a$a, reason: collision with other inner class name */
    public class C0868a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f62885a;

        public C0868a(c cVar) {
            this.f62885a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f62885a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f62885a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f62885a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f62885a.d(new d(C6030a.g(b.b(authenticationResult))));
        }
    }

    /* renamed from: p0.a$b */
    public static class b {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    /* renamed from: p0.a$c */
    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    /* renamed from: p0.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final e f62886a;

        public d(e eVar) {
            this.f62886a = eVar;
        }

        public e a() {
            return this.f62886a;
        }
    }

    public C6030a(Context context) {
        this.f62884a = context;
    }

    public static C6030a c(Context context) {
        return new C6030a(context);
    }

    public static FingerprintManager d(Context context) {
        return b.c(context);
    }

    public static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    public static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0868a(cVar);
    }

    public static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i10, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager d10 = d(this.f62884a);
        if (d10 != null) {
            b.a(d10, i(eVar), cancellationSignal, i10, h(cVar), handler);
        }
    }

    public void b(e eVar, int i10, u0.d dVar, c cVar, Handler handler) {
        a(eVar, i10, dVar != null ? (CancellationSignal) dVar.b() : null, cVar, handler);
    }

    public boolean e() {
        FingerprintManager d10 = d(this.f62884a);
        return d10 != null && b.d(d10);
    }

    public boolean f() {
        FingerprintManager d10 = d(this.f62884a);
        return d10 != null && b.e(d10);
    }

    /* renamed from: p0.a$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f62887a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f62888b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f62889c;

        public e(Signature signature) {
            this.f62887a = signature;
            this.f62888b = null;
            this.f62889c = null;
        }

        public Cipher a() {
            return this.f62888b;
        }

        public Mac b() {
            return this.f62889c;
        }

        public Signature c() {
            return this.f62887a;
        }

        public e(Cipher cipher) {
            this.f62888b = cipher;
            this.f62887a = null;
            this.f62889c = null;
        }

        public e(Mac mac) {
            this.f62889c = mac;
            this.f62888b = null;
            this.f62887a = null;
        }
    }
}
