package r;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;
import androidx.core.hardware.fingerprint.b;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import r.o;
import r.p;
import r.r;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9088a {

    /* renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f82296a;

    /* renamed from: b, reason: collision with root package name */
    private b.AbstractC0770b f82297b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final p.b f82298c;

    /* renamed from: r.a$a, reason: collision with other inner class name */
    final class C1398a extends b.AbstractC0770b {
        C1398a() {
        }

        @Override // androidx.core.hardware.fingerprint.b.AbstractC0770b
        public final void a(int i11, CharSequence charSequence) {
            C9088a.this.f82298c.a(i11, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.b.AbstractC0770b
        public final void b() {
            C9088a.this.f82298c.b();
        }

        @Override // androidx.core.hardware.fingerprint.b.AbstractC0770b
        public final void c(CharSequence charSequence) {
            C9088a.this.f82298c.d(charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.b.AbstractC0770b
        public final void d(b.c cVar) {
            b.d a11 = cVar.a();
            o.c cVar2 = null;
            if (a11 != null) {
                Cipher a12 = a11.a();
                if (a12 != null) {
                    cVar2 = new o.c(a12);
                } else {
                    Signature c11 = a11.c();
                    if (c11 != null) {
                        cVar2 = new o.c(c11);
                    } else {
                        Mac b11 = a11.b();
                        if (b11 != null) {
                            cVar2 = new o.c(b11);
                        }
                    }
                }
            }
            C9088a.this.f82298c.c(new o.b(cVar2, 2));
        }
    }

    /* renamed from: r.a$b */
    private static class b {

        /* renamed from: r.a$b$a, reason: collision with other inner class name */
        final class C1399a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f82300a;

            C1399a(d dVar) {
                this.f82300a = dVar;
            }

            public void onAuthenticationError(int i11, CharSequence charSequence) {
                this.f82300a.a(i11, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f82300a.b();
            }

            public void onAuthenticationHelp(int i11, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject cryptoObject;
                IdentityCredential b11;
                o.c cVar = null;
                if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
                    Cipher d11 = r.b.d(cryptoObject);
                    if (d11 != null) {
                        cVar = new o.c(d11);
                    } else {
                        Signature f7 = r.b.f(cryptoObject);
                        if (f7 != null) {
                            cVar = new o.c(f7);
                        } else {
                            Mac e11 = r.b.e(cryptoObject);
                            if (e11 != null) {
                                cVar = new o.c(e11);
                            } else if (Build.VERSION.SDK_INT >= 30 && (b11 = r.c.b(cryptoObject)) != null) {
                                cVar = new o.c(b11);
                            }
                        }
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                int i12 = -1;
                if (i11 >= 30) {
                    if (authenticationResult != null) {
                        i12 = c.a(authenticationResult);
                    }
                } else if (i11 != 29) {
                    i12 = 2;
                }
                this.f82300a.c(new o.b(cVar, i12));
            }
        }

        @NonNull
        static BiometricPrompt$AuthenticationCallback a(@NonNull d dVar) {
            return new C1399a(dVar);
        }
    }

    /* renamed from: r.a$c */
    private static class c {
        static int a(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* renamed from: r.a$d */
    static class d {
        void a(int i11, CharSequence charSequence) {
            throw null;
        }

        void b() {
            throw null;
        }

        void c(@NonNull o.b bVar) {
            throw null;
        }
    }

    C9088a(@NonNull p.b bVar) {
        this.f82298c = bVar;
    }

    @NonNull
    final BiometricPrompt$AuthenticationCallback a() {
        if (this.f82296a == null) {
            this.f82296a = b.a(this.f82298c);
        }
        return this.f82296a;
    }

    @NonNull
    final b.AbstractC0770b b() {
        if (this.f82297b == null) {
            this.f82297b = new C1398a();
        }
        return this.f82297b;
    }
}
