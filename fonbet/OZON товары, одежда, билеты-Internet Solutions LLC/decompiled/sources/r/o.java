package r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.X;
import androidx.lifecycle.z0;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private G f82329a;

    public static abstract class a {
        public void onAuthenticationError(int i11, @NonNull CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(@NonNull b bVar) {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f82330a;

        /* renamed from: b, reason: collision with root package name */
        private final int f82331b;

        b(c cVar, int i11) {
            this.f82330a = cVar;
            this.f82331b = i11;
        }

        public final int a() {
            return this.f82331b;
        }

        public final c b() {
            return this.f82330a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f82336a;

        /* renamed from: b, reason: collision with root package name */
        private final String f82337b;

        /* renamed from: c, reason: collision with root package name */
        private final String f82338c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f82339d;

        /* renamed from: e, reason: collision with root package name */
        private final int f82340e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f82341a = null;

            /* renamed from: b, reason: collision with root package name */
            private String f82342b = null;

            /* renamed from: c, reason: collision with root package name */
            private String f82343c = null;

            /* renamed from: d, reason: collision with root package name */
            private boolean f82344d = true;

            /* renamed from: e, reason: collision with root package name */
            private int f82345e = 0;

            @NonNull
            public final d a() {
                if (TextUtils.isEmpty(this.f82341a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!C9089b.c(this.f82345e)) {
                    StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                    sb2.append(Build.VERSION.SDK_INT);
                    sb2.append(": ");
                    int i11 = this.f82345e;
                    sb2.append(i11 != 15 ? i11 != 255 ? i11 != 32768 ? i11 != 32783 ? i11 != 33023 ? String.valueOf(i11) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
                    throw new IllegalArgumentException(sb2.toString());
                }
                int i12 = this.f82345e;
                boolean b11 = i12 != 0 ? C9089b.b(i12) : false;
                if (TextUtils.isEmpty(this.f82343c) && !b11) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f82343c) || !b11) {
                    return new d(this.f82341a, this.f82342b, this.f82344d, this.f82343c, this.f82345e);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            @NonNull
            public final void b(int i11) {
                this.f82345e = i11;
            }

            @NonNull
            public final void c() {
                this.f82344d = false;
            }

            @NonNull
            public final void d(@NonNull String str) {
                this.f82343c = str;
            }

            @NonNull
            public final void e(String str) {
                this.f82342b = str;
            }

            @NonNull
            public final void f(@NonNull String str) {
                this.f82341a = str;
            }
        }

        d(@NonNull String str, String str2, boolean z11, String str3, int i11) {
            this.f82336a = str;
            this.f82337b = str2;
            this.f82338c = str3;
            this.f82339d = z11;
            this.f82340e = i11;
        }

        public final int a() {
            return this.f82340e;
        }

        @NonNull
        public final CharSequence b() {
            String str = this.f82338c;
            return str != null ? str : "";
        }

        public final CharSequence c() {
            return this.f82337b;
        }

        @NonNull
        public final CharSequence d() {
            return this.f82336a;
        }

        public final boolean e() {
            return this.f82339d;
        }
    }

    private static class e implements I {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<p> f82346a;

        e(@NonNull p pVar) {
            this.f82346a = new WeakReference<>(pVar);
        }

        @X(AbstractC5434v.a.ON_DESTROY)
        public void resetCallback() {
            WeakReference<p> weakReference = this.f82346a;
            if (weakReference.get() != null) {
                weakReference.get().F0();
            }
        }
    }

    public o(@NonNull androidx.fragment.app.r rVar, @NonNull B30.d dVar) {
        f(rVar.getSupportFragmentManager(), e(rVar), null, dVar);
    }

    private void c(@NonNull d dVar, c cVar) {
        G g10 = this.f82329a;
        if (g10 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (g10.H0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        G g11 = this.f82329a;
        C9091d c9091d = (C9091d) g11.g0("androidx.biometric.BiometricFragment");
        if (c9091d == null) {
            c9091d = new C9091d();
            Q p11 = g11.p();
            p11.d(c9091d, "androidx.biometric.BiometricFragment");
            p11.j();
            g11.c0();
        }
        c9091d.t(dVar, cVar);
    }

    private static p e(androidx.fragment.app.r rVar) {
        if (rVar != null) {
            return (p) new z0(rVar).a(p.class);
        }
        return null;
    }

    private void f(G g10, p pVar, Executor executor, @NonNull a aVar) {
        this.f82329a = g10;
        if (pVar != null) {
            if (executor != null) {
                pVar.N0(executor);
            }
            pVar.M0(aVar);
        }
    }

    public final void a(@NonNull d dVar) {
        c(dVar, null);
    }

    public final void b(@NonNull d dVar, @NonNull c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int a11 = C9089b.a(dVar, cVar);
        if (C9089b.d(a11)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && C9089b.b(a11)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c(dVar, cVar);
    }

    public final void d() {
        G g10 = this.f82329a;
        if (g10 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        C9091d c9091d = (C9091d) g10.g0("androidx.biometric.BiometricFragment");
        if (c9091d == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            c9091d.u(3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f82332a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f82333b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f82334c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f82335d;

        public c(@NonNull Signature signature) {
            this.f82332a = signature;
            this.f82333b = null;
            this.f82334c = null;
            this.f82335d = null;
        }

        public final Cipher a() {
            return this.f82333b;
        }

        public final IdentityCredential b() {
            return this.f82335d;
        }

        public final Mac c() {
            return this.f82334c;
        }

        public final Signature d() {
            return this.f82332a;
        }

        public c(@NonNull Cipher cipher) {
            this.f82332a = null;
            this.f82333b = cipher;
            this.f82334c = null;
            this.f82335d = null;
        }

        public c(@NonNull Mac mac) {
            this.f82332a = null;
            this.f82333b = null;
            this.f82334c = mac;
            this.f82335d = null;
        }

        public c(@NonNull IdentityCredential identityCredential) {
            this.f82332a = null;
            this.f82333b = null;
            this.f82334c = null;
            this.f82335d = identityCredential;
        }
    }

    public o(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull B30.d dVar) {
        androidx.fragment.app.r activity = componentCallbacksC5392m.getActivity();
        G childFragmentManager = componentCallbacksC5392m.getChildFragmentManager();
        p e11 = e(activity);
        if (e11 != null) {
            componentCallbacksC5392m.getLifecycle().a(new e(e11));
        }
        f(childFragmentManager, e11, null, dVar);
    }

    @SuppressLint({"LambdaLast"})
    public o(@NonNull androidx.fragment.app.r rVar, @NonNull Executor executor, @NonNull a aVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            f(rVar.getSupportFragmentManager(), e(rVar), executor, aVar);
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @SuppressLint({"LambdaLast"})
    public o(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Executor executor, @NonNull a aVar) {
        if (componentCallbacksC5392m == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.r activity = componentCallbacksC5392m.getActivity();
            G childFragmentManager = componentCallbacksC5392m.getChildFragmentManager();
            p e11 = e(activity);
            if (e11 != null) {
                componentCallbacksC5392m.getLifecycle().a(new e(e11));
            }
            f(childFragmentManager, e11, executor, aVar);
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }
}
