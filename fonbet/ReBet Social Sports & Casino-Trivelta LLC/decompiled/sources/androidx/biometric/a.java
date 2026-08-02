package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.biometric.BiometricPrompt;
import p0.C6030a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public BiometricPrompt$AuthenticationCallback f17454a;

    /* renamed from: b, reason: collision with root package name */
    public C6030a.c f17455b;

    /* renamed from: c, reason: collision with root package name */
    public final d f17456c;

    /* renamed from: androidx.biometric.a$a, reason: collision with other inner class name */
    public class C0343a extends C6030a.c {
        public C0343a() {
        }

        @Override // p0.C6030a.c
        public void a(int i10, CharSequence charSequence) {
            a.this.f17456c.a(i10, charSequence);
        }

        @Override // p0.C6030a.c
        public void b() {
            a.this.f17456c.b();
        }

        @Override // p0.C6030a.c
        public void c(int i10, CharSequence charSequence) {
            a.this.f17456c.c(charSequence);
        }

        @Override // p0.C6030a.c
        public void d(C6030a.d dVar) {
            a.this.f17456c.d(new BiometricPrompt.b(dVar != null ? g.c(dVar.a()) : null, 2));
        }
    }

    public static class b {

        /* renamed from: androidx.biometric.a$b$a, reason: collision with other inner class name */
        public class C0344a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f17458a;

            public C0344a(d dVar) {
                this.f17458a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f17458a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f17458a.b();
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.c b10 = authenticationResult != null ? g.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        i11 = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    i11 = 2;
                }
                this.f17458a.d(new BiometricPrompt.b(b10, i11));
            }
        }

        @NonNull
        public static BiometricPrompt$AuthenticationCallback a(@NonNull d dVar) {
            return new C0344a(dVar);
        }
    }

    public static class c {
        public static int a(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public static class d {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(CharSequence charSequence);

        public abstract void d(BiometricPrompt.b bVar);
    }

    public a(d dVar) {
        this.f17456c = dVar;
    }

    public BiometricPrompt$AuthenticationCallback a() {
        if (this.f17454a == null) {
            this.f17454a = b.a(this.f17456c);
        }
        return this.f17454a;
    }

    public C6030a.c b() {
        if (this.f17455b == null) {
            this.f17455b = new C0343a();
        }
        return this.f17455b;
    }
}
