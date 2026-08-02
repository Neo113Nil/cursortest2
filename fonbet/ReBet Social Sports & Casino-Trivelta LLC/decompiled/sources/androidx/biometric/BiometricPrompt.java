package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.D;
import androidx.lifecycle.U;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class BiometricPrompt {

    /* renamed from: a, reason: collision with root package name */
    public FragmentManager f17404a;

    public static class ResetCallbackObserver implements androidx.lifecycle.r {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17405a;

        @D(AbstractC2185j.a.ON_DESTROY)
        public void resetCallback() {
            if (this.f17405a.get() != null) {
                ((BiometricViewModel) this.f17405a.get()).G();
            }
        }
    }

    public static abstract class a {
        public void f(int i10, CharSequence charSequence) {
        }

        public void g() {
        }

        public void h(b bVar) {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f17406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17407b;

        public b(c cVar, int i10) {
            this.f17406a = cVar;
            this.f17407b = i10;
        }

        public int a() {
            return this.f17407b;
        }

        public c b() {
            return this.f17406a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f17412a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f17413b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f17414c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f17415d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f17416e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17417f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17418g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public CharSequence f17419a = null;

            /* renamed from: b, reason: collision with root package name */
            public CharSequence f17420b = null;

            /* renamed from: c, reason: collision with root package name */
            public CharSequence f17421c = null;

            /* renamed from: d, reason: collision with root package name */
            public CharSequence f17422d = null;

            /* renamed from: e, reason: collision with root package name */
            public boolean f17423e = true;

            /* renamed from: f, reason: collision with root package name */
            public boolean f17424f = false;

            /* renamed from: g, reason: collision with root package name */
            public int f17425g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f17419a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.b.e(this.f17425g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + androidx.biometric.b.a(this.f17425g));
                }
                int i10 = this.f17425g;
                boolean c10 = i10 != 0 ? androidx.biometric.b.c(i10) : this.f17424f;
                if (TextUtils.isEmpty(this.f17422d) && !c10) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f17422d) || !c10) {
                    return new d(this.f17419a, this.f17420b, this.f17421c, this.f17422d, this.f17423e, this.f17424f, this.f17425g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(int i10) {
                this.f17425g = i10;
                return this;
            }

            public a c(boolean z10) {
                this.f17423e = z10;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f17421c = charSequence;
                return this;
            }

            public a e(CharSequence charSequence) {
                this.f17422d = charSequence;
                return this;
            }

            public a f(CharSequence charSequence) {
                this.f17420b = charSequence;
                return this;
            }

            public a g(CharSequence charSequence) {
                this.f17419a = charSequence;
                return this;
            }
        }

        public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f17412a = charSequence;
            this.f17413b = charSequence2;
            this.f17414c = charSequence3;
            this.f17415d = charSequence4;
            this.f17416e = z10;
            this.f17417f = z11;
            this.f17418g = i10;
        }

        public int a() {
            return this.f17418g;
        }

        public CharSequence b() {
            return this.f17414c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f17415d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f17413b;
        }

        public CharSequence e() {
            return this.f17412a;
        }

        public boolean f() {
            return this.f17416e;
        }

        public boolean g() {
            return this.f17417f;
        }
    }

    public BiometricPrompt(AbstractActivityC2168s abstractActivityC2168s, Executor executor, a aVar) {
        if (abstractActivityC2168s == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        g(abstractActivityC2168s.getSupportFragmentManager(), f(abstractActivityC2168s), executor, aVar);
    }

    public static androidx.biometric.d d(FragmentManager fragmentManager) {
        return (androidx.biometric.d) fragmentManager.p0("androidx.biometric.BiometricFragment");
    }

    public static androidx.biometric.d e(FragmentManager fragmentManager) {
        androidx.biometric.d d10 = d(fragmentManager);
        if (d10 != null) {
            return d10;
        }
        androidx.biometric.d t02 = androidx.biometric.d.t0();
        fragmentManager.s().e(t02, "androidx.biometric.BiometricFragment").i();
        fragmentManager.k0();
        return t02;
    }

    public static BiometricViewModel f(AbstractActivityC2168s abstractActivityC2168s) {
        if (abstractActivityC2168s != null) {
            return (BiometricViewModel) new U(abstractActivityC2168s).a(BiometricViewModel.class);
        }
        return null;
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        b(dVar, null);
    }

    public final void b(d dVar, c cVar) {
        FragmentManager fragmentManager = this.f17404a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.X0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            e(this.f17404a).d0(dVar, cVar);
        }
    }

    public void c() {
        FragmentManager fragmentManager = this.f17404a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        androidx.biometric.d d10 = d(fragmentManager);
        if (d10 == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            d10.g0(3);
        }
    }

    public final void g(FragmentManager fragmentManager, BiometricViewModel biometricViewModel, Executor executor, a aVar) {
        this.f17404a = fragmentManager;
        if (biometricViewModel != null) {
            if (executor != null) {
                biometricViewModel.O(executor);
            }
            biometricViewModel.N(aVar);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f17408a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f17409b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f17410c;

        /* renamed from: d, reason: collision with root package name */
        public final IdentityCredential f17411d;

        public c(Signature signature) {
            this.f17408a = signature;
            this.f17409b = null;
            this.f17410c = null;
            this.f17411d = null;
        }

        public Cipher a() {
            return this.f17409b;
        }

        public IdentityCredential b() {
            return this.f17411d;
        }

        public Mac c() {
            return this.f17410c;
        }

        public Signature d() {
            return this.f17408a;
        }

        public c(Cipher cipher) {
            this.f17408a = null;
            this.f17409b = cipher;
            this.f17410c = null;
            this.f17411d = null;
        }

        public c(Mac mac) {
            this.f17408a = null;
            this.f17409b = null;
            this.f17410c = mac;
            this.f17411d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f17408a = null;
            this.f17409b = null;
            this.f17410c = null;
            this.f17411d = identityCredential;
        }
    }
}
