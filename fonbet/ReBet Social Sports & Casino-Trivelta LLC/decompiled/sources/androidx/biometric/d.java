package androidx.biometric;

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
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C;
import androidx.lifecycle.U;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p0.C6030a;

/* loaded from: classes.dex */
public class d extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    public Handler f17461m = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public BiometricViewModel f17462n;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17463a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f17464b;

        public a(int i10, CharSequence charSequence) {
            this.f17463a = i10;
            this.f17464b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f17462n.k().f(this.f17463a, this.f17464b);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f17462n.k().g();
        }
    }

    public class c implements C {
        public c() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(BiometricPrompt.b bVar) {
            if (bVar != null) {
                d.this.x0(bVar);
                d.this.f17462n.K(null);
            }
        }
    }

    /* renamed from: androidx.biometric.d$d, reason: collision with other inner class name */
    public class C0345d implements C {
        public C0345d() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(androidx.biometric.c cVar) {
            if (cVar != null) {
                d.this.u0(cVar.b(), cVar.c());
                d.this.f17462n.H(null);
            }
        }
    }

    public class e implements C {
        public e() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                d.this.w0(charSequence);
                d.this.f17462n.H(null);
            }
        }
    }

    public class f implements C {
        public f() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.v0();
                d.this.f17462n.I(false);
            }
        }
    }

    public class g implements C {
        public g() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (d.this.q0()) {
                    d.this.z0();
                } else {
                    d.this.y0();
                }
                d.this.f17462n.Y(false);
            }
        }
    }

    public class h implements C {
        public h() {
        }

        @Override // androidx.lifecycle.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                d.this.g0(1);
                d.this.dismiss();
                d.this.f17462n.S(false);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f17462n.T(false);
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17474a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f17475b;

        public j(int i10, CharSequence charSequence) {
            this.f17474a = i10;
            this.f17475b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.A0(this.f17474a, this.f17475b);
        }
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BiometricPrompt.b f17477a;

        public k(BiometricPrompt.b bVar) {
            this.f17477a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f17462n.k().h(this.f17477a);
        }
    }

    public static class l {
        public static Intent a(@NonNull KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    public static class m {
        public static void a(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt c(@NonNull BiometricPrompt.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static BiometricPrompt.Builder d(@NonNull Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void f(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void g(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void h(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class n {
        public static void a(@NonNull BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        public static void b(@NonNull BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    public static class o {
        public static void a(@NonNull BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    public static class p implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17479a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f17479a.post(runnable);
        }
    }

    public static class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17480a;

        public q(d dVar) {
            this.f17480a = new WeakReference(dVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17480a.get() != null) {
                ((d) this.f17480a.get()).I0();
            }
        }
    }

    public static class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17481a;

        public r(BiometricViewModel biometricViewModel) {
            this.f17481a = new WeakReference(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17481a.get() != null) {
                ((BiometricViewModel) this.f17481a.get()).R(false);
            }
        }
    }

    public static class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17482a;

        public s(BiometricViewModel biometricViewModel) {
            this.f17482a = new WeakReference(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17482a.get() != null) {
                ((BiometricViewModel) this.f17482a.get()).X(false);
            }
        }
    }

    public static int h0(C6030a c6030a) {
        if (c6030a.f()) {
            return !c6030a.e() ? 11 : 0;
        }
        return 12;
    }

    private boolean n0() {
        AbstractActivityC2168s activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    public static d t0() {
        return new d();
    }

    public void A0(int i10, CharSequence charSequence) {
        B0(i10, charSequence);
        dismiss();
    }

    public final void B0(int i10, CharSequence charSequence) {
        if (this.f17462n.z()) {
            return;
        }
        if (!this.f17462n.x()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f17462n.L(false);
            this.f17462n.l().execute(new a(i10, charSequence));
        }
    }

    public final void C0() {
        if (this.f17462n.x()) {
            this.f17462n.l().execute(new b());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    public final void D0(BiometricPrompt.b bVar) {
        E0(bVar);
        dismiss();
    }

    public final void E0(BiometricPrompt.b bVar) {
        if (!this.f17462n.x()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f17462n.L(false);
            this.f17462n.l().execute(new k(bVar));
        }
    }

    public final void F0() {
        BiometricPrompt.Builder d10 = m.d(requireContext().getApplicationContext());
        CharSequence v10 = this.f17462n.v();
        CharSequence u10 = this.f17462n.u();
        CharSequence n10 = this.f17462n.n();
        if (v10 != null) {
            m.h(d10, v10);
        }
        if (u10 != null) {
            m.g(d10, u10);
        }
        if (n10 != null) {
            m.e(d10, n10);
        }
        CharSequence t10 = this.f17462n.t();
        if (!TextUtils.isEmpty(t10)) {
            m.f(d10, t10, this.f17462n.l(), this.f17462n.s());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(d10, this.f17462n.y());
        }
        int d11 = this.f17462n.d();
        if (i10 >= 30) {
            o.a(d10, d11);
        } else if (i10 >= 29) {
            n.b(d10, androidx.biometric.b.c(d11));
        }
        e0(m.c(d10), getContext());
    }

    public final void G0() {
        Context applicationContext = requireContext().getApplicationContext();
        C6030a c10 = C6030a.c(applicationContext);
        int h02 = h0(c10);
        if (h02 != 0) {
            A0(h02, androidx.biometric.i.a(applicationContext, h02));
            return;
        }
        if (isAdded()) {
            this.f17462n.T(true);
            if (!androidx.biometric.h.f(applicationContext, Build.MODEL)) {
                this.f17461m.postDelayed(new i(), 500L);
                androidx.biometric.j.j0().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f17462n.M(0);
            f0(c10, applicationContext);
        }
    }

    public final void H0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(androidx.biometric.s.f17517b);
        }
        this.f17462n.W(2);
        this.f17462n.U(charSequence);
    }

    public void I0() {
        if (this.f17462n.F()) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f17462n.b0(true);
        this.f17462n.L(true);
        if (r0()) {
            G0();
        } else {
            F0();
        }
    }

    public void d0(BiometricPrompt.d dVar, BiometricPrompt.c cVar) {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f17462n.a0(dVar);
        int b10 = androidx.biometric.b.b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && b10 == 15 && cVar == null) {
            this.f17462n.Q(androidx.biometric.g.a());
        } else {
            this.f17462n.Q(cVar);
        }
        if (q0()) {
            this.f17462n.Z(getString(androidx.biometric.s.f17516a));
        } else {
            this.f17462n.Z(null);
        }
        if (q0() && androidx.biometric.e.g(activity).a(255) != 0) {
            this.f17462n.L(true);
            s0();
        } else if (this.f17462n.A()) {
            this.f17461m.postDelayed(new q(this), 600L);
        } else {
            I0();
        }
    }

    public void dismiss() {
        this.f17462n.b0(false);
        k0();
        if (!this.f17462n.z() && isAdded()) {
            getParentFragmentManager().s().n(this).i();
        }
        Context context = getContext();
        if (context == null || !androidx.biometric.h.e(context, Build.MODEL)) {
            return;
        }
        this.f17462n.R(true);
        this.f17461m.postDelayed(new r(this.f17462n), 600L);
    }

    public void e0(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject d10 = androidx.biometric.g.d(this.f17462n.m());
        CancellationSignal b10 = this.f17462n.j().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback a10 = this.f17462n.e().a();
        try {
            if (d10 == null) {
                m.b(biometricPrompt, b10, pVar, a10);
            } else {
                m.a(biometricPrompt, d10, b10, pVar, a10);
            }
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            A0(1, context != null ? context.getString(androidx.biometric.s.f17517b) : "");
        }
    }

    public void f0(C6030a c6030a, Context context) {
        try {
            c6030a.b(androidx.biometric.g.e(this.f17462n.m()), 0, this.f17462n.j().c(), this.f17462n.e().b(), null);
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            A0(1, androidx.biometric.i.a(context, 1));
        }
    }

    public void g0(int i10) {
        if (i10 == 3 || !this.f17462n.D()) {
            if (r0()) {
                this.f17462n.M(i10);
                if (i10 == 1) {
                    B0(10, androidx.biometric.i.a(getContext(), 10));
                }
            }
            this.f17462n.j().a();
        }
    }

    public final void j0() {
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new U(getActivity()).a(BiometricViewModel.class);
        this.f17462n = biometricViewModel;
        biometricViewModel.h().observe(this, new c());
        this.f17462n.f().observe(this, new C0345d());
        this.f17462n.g().observe(this, new e());
        this.f17462n.w().observe(this, new f());
        this.f17462n.E().observe(this, new g());
        this.f17462n.B().observe(this, new h());
    }

    public final void k0() {
        this.f17462n.b0(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            androidx.biometric.j jVar = (androidx.biometric.j) parentFragmentManager.p0("androidx.biometric.FingerprintDialogFragment");
            if (jVar != null) {
                if (jVar.isAdded()) {
                    jVar.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.s().n(jVar).i();
                }
            }
        }
    }

    public final int l0() {
        Context context = getContext();
        return (context == null || !androidx.biometric.h.f(context, Build.MODEL)) ? 2000 : 0;
    }

    public final void m0(int i10) {
        if (i10 == -1) {
            D0(new BiometricPrompt.b(null, 1));
        } else {
            A0(10, getString(androidx.biometric.s.f17527l));
        }
    }

    public final boolean o0() {
        AbstractActivityC2168s activity = getActivity();
        return (activity == null || this.f17462n.m() == null || !androidx.biometric.h.g(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f17462n.P(false);
            m0(i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.b.c(this.f17462n.d())) {
            this.f17462n.X(true);
            this.f17461m.postDelayed(new s(this.f17462n), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f17462n.z() || n0()) {
            return;
        }
        g0(0);
    }

    public final boolean p0() {
        return Build.VERSION.SDK_INT == 28 && !androidx.biometric.l.a(getContext());
    }

    public boolean q0() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.b.c(this.f17462n.d());
    }

    public final boolean r0() {
        return Build.VERSION.SDK_INT < 28 || o0() || p0();
    }

    public final void s0() {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a10 = androidx.biometric.k.a(activity);
        if (a10 == null) {
            A0(12, getString(androidx.biometric.s.f17526k));
            return;
        }
        CharSequence v10 = this.f17462n.v();
        CharSequence u10 = this.f17462n.u();
        CharSequence n10 = this.f17462n.n();
        if (u10 == null) {
            u10 = n10;
        }
        Intent a11 = l.a(a10, v10, u10);
        if (a11 == null) {
            A0(14, getString(androidx.biometric.s.f17525j));
            return;
        }
        this.f17462n.P(true);
        if (r0()) {
            k0();
        }
        a11.setFlags(134742016);
        startActivityForResult(a11, 1);
    }

    public void u0(int i10, CharSequence charSequence) {
        if (!androidx.biometric.i.b(i10)) {
            i10 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && androidx.biometric.i.c(i10) && context != null && androidx.biometric.k.b(context) && androidx.biometric.b.c(this.f17462n.d())) {
            s0();
            return;
        }
        if (!r0()) {
            if (charSequence == null) {
                charSequence = getString(androidx.biometric.s.f17517b) + " " + i10;
            }
            A0(i10, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = androidx.biometric.i.a(getContext(), i10);
        }
        if (i10 == 5) {
            int i11 = this.f17462n.i();
            if (i11 == 0 || i11 == 3) {
                B0(i10, charSequence);
            }
            dismiss();
            return;
        }
        if (this.f17462n.C()) {
            A0(i10, charSequence);
        } else {
            H0(charSequence);
            this.f17461m.postDelayed(new j(i10, charSequence), l0());
        }
        this.f17462n.T(true);
    }

    public void v0() {
        if (r0()) {
            H0(getString(androidx.biometric.s.f17524i));
        }
        C0();
    }

    public void w0(CharSequence charSequence) {
        if (r0()) {
            H0(charSequence);
        }
    }

    public void x0(BiometricPrompt.b bVar) {
        D0(bVar);
    }

    public void y0() {
        CharSequence t10 = this.f17462n.t();
        if (t10 == null) {
            t10 = getString(androidx.biometric.s.f17517b);
        }
        A0(13, t10);
        g0(2);
    }

    public void z0() {
        s0();
    }
}
