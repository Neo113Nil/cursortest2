package r;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.hardware.fingerprint.b;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.z0;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import r.o;
import r.x;
import ru.ozon.app.android.R;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C9091d extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    Handler f82303a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    p f82304b;

    /* renamed from: r.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f82306b;

        a(int i11, CharSequence charSequence) {
            this.f82305a = i11;
            this.f82306b = charSequence;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091d.this.f82304b.k0().onAuthenticationError(this.f82305a, this.f82306b);
        }
    }

    /* renamed from: r.d$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f82309b;

        b(int i11, CharSequence charSequence) {
            this.f82308a = i11;
            this.f82309b = charSequence;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091d.this.E(this.f82308a, this.f82309b);
        }
    }

    /* renamed from: r.d$c */
    private static class c {
        static Intent a(@NonNull KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* renamed from: r.d$d, reason: collision with other inner class name */
    private static class C1400d {
        static void a(@NonNull BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(@NonNull BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        @NonNull
        static BiometricPrompt c(@NonNull BiometricPrompt.Builder builder) {
            return builder.build();
        }

        @NonNull
        static BiometricPrompt.Builder d(@NonNull Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void f(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void g(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: r.d$e */
    private static class e {
        static void a(@NonNull BiometricPrompt.Builder builder, boolean z11) {
            builder.setConfirmationRequired(z11);
        }

        static void b(@NonNull BiometricPrompt.Builder builder, boolean z11) {
            builder.setDeviceCredentialAllowed(z11);
        }
    }

    /* renamed from: r.d$f */
    private static class f {
        static void a(@NonNull BiometricPrompt.Builder builder, int i11) {
            builder.setAllowedAuthenticators(i11);
        }
    }

    /* renamed from: r.d$g */
    private static class g implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f82311a = new Handler(Looper.getMainLooper());

        g() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.f82311a.post(runnable);
        }
    }

    /* renamed from: r.d$h */
    private static class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<C9091d> f82312a;

        h(C9091d c9091d) {
            this.f82312a = new WeakReference<>(c9091d);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<C9091d> weakReference = this.f82312a;
            if (weakReference.get() != null) {
                weakReference.get().I();
            }
        }
    }

    /* renamed from: r.d$i */
    private static class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<p> f82313a;

        i(p pVar) {
            this.f82313a = new WeakReference<>(pVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<p> weakReference = this.f82313a;
            if (weakReference.get() != null) {
                weakReference.get().Q0(false);
            }
        }
    }

    /* renamed from: r.d$j */
    private static class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<p> f82314a;

        j(p pVar) {
            this.f82314a = new WeakReference<>(pVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<p> weakReference = this.f82314a;
            if (weakReference.get() != null) {
                weakReference.get().W0(false);
            }
        }
    }

    private void F(int i11, @NonNull CharSequence charSequence) {
        if (this.f82304b.y0()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f82304b.w0()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f82304b.K0(false);
            this.f82304b.l0().execute(new a(i11, charSequence));
        }
    }

    private void G(@NonNull o.b bVar) {
        if (this.f82304b.w0()) {
            this.f82304b.K0(false);
            this.f82304b.l0().execute(new m(this, bVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    private void H(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.f82304b.V0(2);
        this.f82304b.T0(charSequence);
    }

    private void v() {
        this.f82304b.a1(false);
        if (isAdded()) {
            G parentFragmentManager = getParentFragmentManager();
            u uVar = (u) parentFragmentManager.g0("androidx.biometric.FingerprintDialogFragment");
            if (uVar != null) {
                if (uVar.isAdded()) {
                    uVar.dismissAllowingStateLoss();
                    return;
                }
                Q p11 = parentFragmentManager.p();
                p11.q(uVar);
                p11.j();
            }
        }
    }

    private boolean x() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            return true;
        }
        androidx.fragment.app.r activity = getActivity();
        if (activity != null && this.f82304b.m0() != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i11 == 28) {
                if (str != null) {
                    for (String str3 : activity.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                String str4 = Build.MODEL;
                if (str4 != null) {
                    for (String str5 : activity.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                        if (str4.startsWith(str5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return i11 == 28 && !y.a(getContext());
    }

    private void y() {
        androidx.fragment.app.r activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a11 = x.a.a(activity);
        if (a11 == null) {
            E(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence u02 = this.f82304b.u0();
        CharSequence t02 = this.f82304b.t0();
        this.f82304b.getClass();
        if (t02 == null) {
            t02 = null;
        }
        Intent a12 = c.a(a11, u02, t02);
        if (a12 == null) {
            E(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f82304b.O0(true);
        if (x()) {
            v();
        }
        a12.setFlags(134742016);
        startActivityForResult(a12, 1);
    }

    final void A() {
        if (x()) {
            H(getString(R.string.fingerprint_not_recognized));
        }
        if (this.f82304b.w0()) {
            this.f82304b.l0().execute(new RunnableC9092e(this));
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    final void B(@NonNull CharSequence charSequence) {
        if (x()) {
            H(charSequence);
        }
    }

    final void C(@NonNull o.b bVar) {
        G(bVar);
    }

    final void D() {
        y();
    }

    final void E(int i11, @NonNull CharSequence charSequence) {
        F(i11, charSequence);
        dismiss();
    }

    final void I() {
        if (this.f82304b.E0()) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f82304b.a1(true);
        this.f82304b.K0(true);
        if (!x()) {
            BiometricPrompt.Builder d11 = C1400d.d(requireContext().getApplicationContext());
            CharSequence u02 = this.f82304b.u0();
            CharSequence t02 = this.f82304b.t0();
            this.f82304b.getClass();
            if (u02 != null) {
                C1400d.g(d11, u02);
            }
            if (t02 != null) {
                C1400d.f(d11, t02);
            }
            CharSequence s02 = this.f82304b.s0();
            if (!TextUtils.isEmpty(s02)) {
                C1400d.e(d11, s02, this.f82304b.l0(), this.f82304b.r0());
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                e.a(d11, this.f82304b.x0());
            }
            int d02 = this.f82304b.d0();
            if (i11 >= 30) {
                f.a(d11, d02);
            } else if (i11 >= 29) {
                e.b(d11, C9089b.b(d02));
            }
            BiometricPrompt c11 = C1400d.c(d11);
            Context context = getContext();
            BiometricPrompt.CryptoObject b11 = r.b(this.f82304b.m0());
            CancellationSignal b12 = this.f82304b.j0().b();
            g gVar = new g();
            BiometricPrompt$AuthenticationCallback a11 = this.f82304b.e0().a();
            try {
                if (b11 == null) {
                    C1400d.b(c11, b12, gVar, a11);
                } else {
                    C1400d.a(c11, b11, b12, gVar, a11);
                }
                return;
            } catch (NullPointerException e11) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e11);
                E(1, context != null ? context.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        androidx.core.hardware.fingerprint.b b13 = androidx.core.hardware.fingerprint.b.b(applicationContext);
        int i12 = !b13.d() ? 12 : !b13.c() ? 11 : 0;
        if (i12 != 0) {
            E(i12, t.a(i12, applicationContext));
            return;
        }
        if (isAdded()) {
            this.f82304b.S0(true);
            String str = Build.MODEL;
            if (!s.b(applicationContext)) {
                this.f82303a.postDelayed(new RunnableC9099l(this), 500L);
                new u().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f82304b.L0(0);
            o.c m02 = this.f82304b.m0();
            b.d dVar = null;
            if (m02 != null) {
                Cipher a12 = m02.a();
                if (a12 != null) {
                    dVar = new b.d(a12);
                } else {
                    Signature d12 = m02.d();
                    if (d12 != null) {
                        dVar = new b.d(d12);
                    } else {
                        Mac c12 = m02.c();
                        if (c12 != null) {
                            dVar = new b.d(c12);
                        } else if (Build.VERSION.SDK_INT >= 30 && m02.b() != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            try {
                b13.a(dVar, this.f82304b.j0().c(), this.f82304b.e0().b());
            } catch (NullPointerException e12) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e12);
                E(1, t.a(1, applicationContext));
            }
        }
    }

    final void dismiss() {
        this.f82304b.a1(false);
        v();
        if (!this.f82304b.y0() && isAdded()) {
            Q p11 = getParentFragmentManager().p();
            p11.q(this);
            p11.j();
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        this.f82304b.Q0(true);
                        this.f82303a.postDelayed(new i(this.f82304b), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1) {
            this.f82304b.O0(false);
            if (i12 == -1) {
                G(new o.b(null, 1));
            } else {
                E(10, getString(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        p pVar = (p) new z0(getActivity()).a(p.class);
        this.f82304b = pVar;
        pVar.h0().observe(this, new C9093f(this));
        this.f82304b.f0().observe(this, new C9094g(this));
        this.f82304b.g0().observe(this, new C9095h(this));
        this.f82304b.v0().observe(this, new C9096i(this));
        this.f82304b.D0().observe(this, new C9097j(this));
        this.f82304b.A0().observe(this, new C9098k(this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && C9089b.b(this.f82304b.d0())) {
            this.f82304b.W0(true);
            this.f82303a.postDelayed(new j(this.f82304b), 250L);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f82304b.y0()) {
            return;
        }
        androidx.fragment.app.r activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            u(0);
        }
    }

    final void t(@NonNull o.d dVar, o.c cVar) {
        androidx.fragment.app.r activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f82304b.Z0(dVar);
        int a11 = C9089b.a(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && a11 == 15 && cVar == null) {
            this.f82304b.P0(r.a());
        } else {
            this.f82304b.P0(cVar);
        }
        if (w()) {
            this.f82304b.Y0(getString(R.string.confirm_device_credential_password));
        } else {
            this.f82304b.Y0(null);
        }
        if (w() && n.c(activity).a(255) != 0) {
            this.f82304b.K0(true);
            y();
        } else if (this.f82304b.z0()) {
            this.f82303a.postDelayed(new h(this), 600L);
        } else {
            I();
        }
    }

    final void u(int i11) {
        if (i11 == 3 || !this.f82304b.C0()) {
            if (x()) {
                this.f82304b.L0(i11);
                if (i11 == 1) {
                    F(10, t.a(10, getContext()));
                }
            }
            this.f82304b.j0().a();
        }
    }

    final boolean w() {
        return Build.VERSION.SDK_INT <= 28 && C9089b.b(this.f82304b.d0());
    }

    final void z(int i11, CharSequence charSequence) {
        int i12;
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 6:
            default:
                i11 = 8;
                break;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ((i11 == 7 || i11 == 9) && context != null && x.b(context) && C9089b.b(this.f82304b.d0()))) {
            y();
            return;
        }
        if (!x()) {
            if (charSequence == null) {
                charSequence = getString(R.string.default_error_msg) + " " + i11;
            }
            E(i11, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = t.a(i11, getContext());
        }
        if (i11 == 5) {
            int i02 = this.f82304b.i0();
            if (i02 == 0 || i02 == 3) {
                F(i11, charSequence);
            }
            dismiss();
            return;
        }
        if (this.f82304b.B0()) {
            E(i11, charSequence);
        } else {
            H(charSequence);
            Handler handler = this.f82303a;
            b bVar = new b(i11, charSequence);
            Context context2 = getContext();
            if (context2 != null) {
                String str = Build.MODEL;
                if (s.b(context2)) {
                    i12 = 0;
                    handler.postDelayed(bVar, i12);
                }
            }
            i12 = 2000;
            handler.postDelayed(bVar, i12);
        }
        this.f82304b.S0(true);
    }
}
