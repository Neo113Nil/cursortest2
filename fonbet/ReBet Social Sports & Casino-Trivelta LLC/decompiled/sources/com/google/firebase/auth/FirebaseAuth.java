package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzz;
import eb.C4196f;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kb.AbstractC5221f;
import kb.AbstractC5223h;
import kb.AbstractC5232q;
import kb.AbstractC5239y;
import kb.C5215A;
import kb.C5220e;
import kb.D;
import kb.J;
import kb.h0;
import kb.i0;
import kb.j0;
import kb.l0;
import kb.n0;
import lb.C5425d;
import lb.C5444x;
import lb.F;
import lb.H;
import lb.InterfaceC5422a;
import lb.T;
import lb.X;
import lb.Y;
import lb.c0;
import lb.d0;
import lb.k0;
import lb.m0;
import lb.r;
import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public class FirebaseAuth implements InterfaceC5422a {

    /* renamed from: A, reason: collision with root package name */
    public final Executor f37555A;

    /* renamed from: B, reason: collision with root package name */
    public String f37556B;

    /* renamed from: a, reason: collision with root package name */
    public final C4196f f37557a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37558b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37559c;

    /* renamed from: d, reason: collision with root package name */
    public final List f37560d;

    /* renamed from: e, reason: collision with root package name */
    public final zzacq f37561e;

    /* renamed from: f, reason: collision with root package name */
    public FirebaseUser f37562f;

    /* renamed from: g, reason: collision with root package name */
    public final C5425d f37563g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f37564h;

    /* renamed from: i, reason: collision with root package name */
    public String f37565i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f37566j;

    /* renamed from: k, reason: collision with root package name */
    public String f37567k;

    /* renamed from: l, reason: collision with root package name */
    public T f37568l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f37569m;

    /* renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f37570n;

    /* renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f37571o;

    /* renamed from: p, reason: collision with root package name */
    public final RecaptchaAction f37572p;

    /* renamed from: q, reason: collision with root package name */
    public final RecaptchaAction f37573q;

    /* renamed from: r, reason: collision with root package name */
    public final RecaptchaAction f37574r;

    /* renamed from: s, reason: collision with root package name */
    public final Y f37575s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f37576t;

    /* renamed from: u, reason: collision with root package name */
    public final C5444x f37577u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC6736b f37578v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC6736b f37579w;

    /* renamed from: x, reason: collision with root package name */
    public X f37580x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f37581y;

    /* renamed from: z, reason: collision with root package name */
    public final Executor f37582z;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public class c implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f37583a;

        public c(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f37583a = firebaseAuth;
        }

        @Override // lb.m0
        public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
            AbstractC3191o.m(zzahvVar);
            AbstractC3191o.m(firebaseUser);
            firebaseUser.o0(zzahvVar);
            this.f37583a.h0(firebaseUser, zzahvVar, true);
        }
    }

    public class d implements r, m0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f37584a;

        public d(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f37584a = firebaseAuth;
        }

        @Override // lb.m0
        public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
            AbstractC3191o.m(zzahvVar);
            AbstractC3191o.m(firebaseUser);
            firebaseUser.o0(zzahvVar);
            this.f37584a.i0(firebaseUser, zzahvVar, true, true);
        }

        @Override // lb.r
        public final void zza(Status status) {
            if (status.i() == 17011 || status.i() == 17021 || status.i() == 17005 || status.i() == 17091) {
                this.f37584a.F();
            }
        }
    }

    public FirebaseAuth(C4196f c4196f, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(c4196f, new zzacq(c4196f, executor2, scheduledExecutorService), new Y(c4196f.l(), c4196f.r()), d0.g(), C5444x.b(), interfaceC6736b, interfaceC6736b2, executor, executor2, executor3, executor4);
    }

    public static X D0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f37580x == null) {
            firebaseAuth.f37580x = new X((C4196f) AbstractC3191o.m(firebaseAuth.f37557a));
        }
        return firebaseAuth.f37580x;
    }

    public static void f0(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            firebaseUser.a();
        }
        firebaseAuth.f37555A.execute(new l(firebaseAuth));
    }

    public static void g0(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahv zzahvVar, boolean z10, boolean z11) {
        boolean z12;
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(zzahvVar);
        boolean z13 = true;
        boolean z14 = firebaseAuth.f37562f != null && firebaseUser.a().equals(firebaseAuth.f37562f.a());
        if (z14 || !z11) {
            FirebaseUser firebaseUser2 = firebaseAuth.f37562f;
            if (firebaseUser2 == null) {
                z12 = true;
            } else {
                boolean z15 = (z14 && firebaseUser2.r0().zzc().equals(zzahvVar.zzc())) ? false : true;
                z12 = z14 ? false : true;
                z13 = z15;
            }
            AbstractC3191o.m(firebaseUser);
            if (firebaseAuth.f37562f == null || !firebaseUser.a().equals(firebaseAuth.p())) {
                firebaseAuth.f37562f = firebaseUser;
            } else {
                firebaseAuth.f37562f.m0(firebaseUser.k());
                if (!firebaseUser.m()) {
                    firebaseAuth.f37562f.p0();
                }
                List b10 = firebaseUser.j().b();
                List t02 = firebaseUser.t0();
                firebaseAuth.f37562f.s0(b10);
                firebaseAuth.f37562f.q0(t02);
            }
            if (z10) {
                firebaseAuth.f37575s.j(firebaseAuth.f37562f);
            }
            if (z13) {
                FirebaseUser firebaseUser3 = firebaseAuth.f37562f;
                if (firebaseUser3 != null) {
                    firebaseUser3.o0(zzahvVar);
                }
                r0(firebaseAuth, firebaseAuth.f37562f);
            }
            if (z12) {
                f0(firebaseAuth, firebaseAuth.f37562f);
            }
            if (z10) {
                firebaseAuth.f37575s.e(firebaseUser, zzahvVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.f37562f;
            if (firebaseUser4 != null) {
                D0(firebaseAuth).c(firebaseUser4.r0());
            }
        }
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C4196f.n().j(FirebaseAuth.class);
    }

    public static void j0(com.google.firebase.auth.a aVar) {
        String g10;
        String b10;
        if (!aVar.p()) {
            FirebaseAuth d10 = aVar.d();
            String g11 = AbstractC3191o.g(aVar.k());
            if (aVar.g() == null && zzagb.zza(g11, aVar.h(), aVar.b(), aVar.l())) {
                return;
            }
            d10.f37577u.a(d10, g11, aVar.b(), d10.F0(), aVar.m(), aVar.o(), d10.f37572p).addOnCompleteListener(new h0(d10, aVar, g11));
            return;
        }
        FirebaseAuth d11 = aVar.d();
        zzam zzamVar = (zzam) AbstractC3191o.m(aVar.f());
        if (zzamVar.k()) {
            b10 = AbstractC3191o.g(aVar.k());
            g10 = b10;
        } else {
            PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) AbstractC3191o.m(aVar.i());
            g10 = AbstractC3191o.g(phoneMultiFactorInfo.a());
            b10 = phoneMultiFactorInfo.b();
        }
        if (aVar.g() == null || !zzagb.zza(g10, aVar.h(), aVar.b(), aVar.l())) {
            d11.f37577u.a(d11, b10, aVar.b(), d11.F0(), aVar.m(), aVar.o(), zzamVar.k() ? d11.f37573q : d11.f37574r).addOnCompleteListener(new e(d11, aVar, g10));
        }
    }

    public static void l0(final eb.k kVar, com.google.firebase.auth.a aVar, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final PhoneAuthProvider.a zza = zzagb.zza(str, aVar.h(), null);
        aVar.l().execute(new Runnable() { // from class: kb.g0
            @Override // java.lang.Runnable
            public final void run() {
                PhoneAuthProvider.a.this.onVerificationFailed(kVar);
            }
        });
    }

    public static void r0(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            firebaseUser.a();
        }
        firebaseAuth.f37555A.execute(new k(firebaseAuth, new Ab.b(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    public Task A() {
        FirebaseUser firebaseUser = this.f37562f;
        if (firebaseUser == null || !firebaseUser.m()) {
            return this.f37561e.zza(this.f37557a, new c(this), this.f37567k);
        }
        zzaf zzafVar = (zzaf) this.f37562f;
        zzafVar.y0(false);
        return Tasks.forResult(new zzz(zzafVar));
    }

    public Task B(AuthCredential authCredential) {
        AbstractC3191o.m(authCredential);
        AuthCredential i10 = authCredential.i();
        if (i10 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) i10;
            return !emailAuthCredential.m() ? Z(emailAuthCredential.zzc(), (String) AbstractC3191o.m(emailAuthCredential.zzd()), this.f37567k, null, false) : s0(AbstractC3191o.g(emailAuthCredential.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : N(emailAuthCredential, null, false);
        }
        if (i10 instanceof PhoneAuthCredential) {
            return this.f37561e.zza(this.f37557a, (PhoneAuthCredential) i10, this.f37567k, (m0) new c(this));
        }
        return this.f37561e.zza(this.f37557a, i10, this.f37567k, new c(this));
    }

    public final Executor B0() {
        return this.f37581y;
    }

    public Task C(String str) {
        AbstractC3191o.g(str);
        return this.f37561e.zza(this.f37557a, str, this.f37567k, new c(this));
    }

    public final Executor C0() {
        return this.f37582z;
    }

    public Task D(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        return Z(str, str2, this.f37567k, null, false);
    }

    public Task E(String str, String str2) {
        return B(AbstractC5221f.b(str, str2));
    }

    public final void E0() {
        AbstractC3191o.m(this.f37575s);
        FirebaseUser firebaseUser = this.f37562f;
        if (firebaseUser != null) {
            this.f37575s.h(firebaseUser);
            this.f37562f = null;
        }
        this.f37575s.g();
        r0(this, null);
        f0(this, null);
    }

    public void F() {
        E0();
        X x10 = this.f37580x;
        if (x10 != null) {
            x10.b();
        }
    }

    public final boolean F0() {
        return zzaeu.zza(i().l());
    }

    public Task G(Activity activity, AbstractC5223h abstractC5223h) {
        AbstractC3191o.m(abstractC5223h);
        AbstractC3191o.m(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f37576t.d(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        H.e(activity.getApplicationContext(), this);
        abstractC5223h.c(activity);
        return taskCompletionSource.getTask();
    }

    public void H() {
        synchronized (this.f37564h) {
            this.f37565i = zzafd.zza();
        }
    }

    public void I(String str, int i10) {
        AbstractC3191o.g(str);
        AbstractC3191o.b(i10 >= 0 && i10 <= 65535, "Port number must be in the range 0-65535");
        zzagl.zza(this.f37557a, str, i10);
    }

    public Task J(String str) {
        AbstractC3191o.g(str);
        return this.f37561e.zzd(this.f37557a, str, this.f37567k);
    }

    public final Task K() {
        return this.f37561e.zza();
    }

    public final Task L(Activity activity, AbstractC5223h abstractC5223h, FirebaseUser firebaseUser) {
        AbstractC3191o.m(activity);
        AbstractC3191o.m(abstractC5223h);
        AbstractC3191o.m(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f37576t.e(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        H.f(activity.getApplicationContext(), this, firebaseUser);
        abstractC5223h.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task M(ActionCodeSettings actionCodeSettings, String str) {
        AbstractC3191o.g(str);
        if (this.f37565i != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.a0();
            }
            actionCodeSettings.Z(this.f37565i);
        }
        return this.f37561e.zza(this.f37557a, actionCodeSettings, str);
    }

    public final Task N(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z10) {
        return new com.google.firebase.auth.b(this, z10, firebaseUser, emailAuthCredential).b(this, this.f37567k, this.f37569m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task O(FirebaseUser firebaseUser) {
        return U(firebaseUser, new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task P(FirebaseUser firebaseUser, AuthCredential authCredential) {
        AbstractC3191o.m(authCredential);
        AbstractC3191o.m(firebaseUser);
        return authCredential instanceof EmailAuthCredential ? new i(this, firebaseUser, (EmailAuthCredential) authCredential.i()).b(this, firebaseUser.l(), this.f37571o, "EMAIL_PASSWORD_PROVIDER") : this.f37561e.zza(this.f37557a, firebaseUser, authCredential.i(), (String) null, (c0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task Q(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(phoneAuthCredential);
        return this.f37561e.zza(this.f37557a, firebaseUser, (PhoneAuthCredential) phoneAuthCredential.i(), (c0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task R(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(userProfileChangeRequest);
        return this.f37561e.zza(this.f37557a, firebaseUser, userProfileChangeRequest, (c0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task S(FirebaseUser firebaseUser, String str) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.g(str);
        return this.f37561e.zza(this.f37557a, firebaseUser, str, this.f37567k, (c0) new d(this)).continueWithTask(new l0(this));
    }

    public final Task T(FirebaseUser firebaseUser, AbstractC5239y abstractC5239y, String str) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(abstractC5239y);
        return abstractC5239y instanceof C5215A ? this.f37561e.zza(this.f37557a, (C5215A) abstractC5239y, firebaseUser, str, new c(this)) : abstractC5239y instanceof D ? this.f37561e.zza(this.f37557a, (D) abstractC5239y, firebaseUser, str, this.f37567k, new c(this)) : Tasks.forException(zzaen.zza(new Status(17499)));
    }

    public final Task U(FirebaseUser firebaseUser, c0 c0Var) {
        AbstractC3191o.m(firebaseUser);
        return this.f37561e.zza(this.f37557a, firebaseUser, c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kb.n0, lb.c0] */
    public final Task V(FirebaseUser firebaseUser, boolean z10) {
        if (firebaseUser == null) {
            return Tasks.forException(zzaen.zza(new Status(17495)));
        }
        zzahv r02 = firebaseUser.r0();
        return (!r02.zzg() || z10) ? this.f37561e.zza(this.f37557a, firebaseUser, r02.zzd(), (c0) new n0(this)) : Tasks.forResult(F.a(r02.zzc()));
    }

    public final Task W(zzam zzamVar) {
        AbstractC3191o.m(zzamVar);
        return this.f37561e.zza(zzamVar, this.f37567k).continueWithTask(new kb.m0(this));
    }

    public final Task X(String str) {
        return this.f37561e.zza(this.f37567k, str);
    }

    public final Task Y(String str, String str2, ActionCodeSettings actionCodeSettings) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.a0();
        }
        String str3 = this.f37565i;
        if (str3 != null) {
            actionCodeSettings.Z(str3);
        }
        return this.f37561e.zza(str, str2, actionCodeSettings);
    }

    public final Task Z(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z10) {
        return new m(this, str, z10, firebaseUser, str2, str3).b(this, str3, this.f37570n, "EMAIL_PASSWORD_PROVIDER");
    }

    public void a(a aVar) {
        this.f37559c.add(aVar);
        this.f37555A.execute(new j(this, aVar));
    }

    public final Task a0(AbstractC5239y abstractC5239y, zzam zzamVar, FirebaseUser firebaseUser) {
        AbstractC3191o.m(abstractC5239y);
        AbstractC3191o.m(zzamVar);
        if (abstractC5239y instanceof C5215A) {
            return this.f37561e.zza(this.f37557a, firebaseUser, (C5215A) abstractC5239y, AbstractC3191o.g(zzamVar.zzc()), new c(this));
        }
        if (abstractC5239y instanceof D) {
            return this.f37561e.zza(this.f37557a, firebaseUser, (D) abstractC5239y, AbstractC3191o.g(zzamVar.zzc()), this.f37567k, new c(this));
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public void b(b bVar) {
        this.f37558b.add(bVar);
        this.f37555A.execute(new com.google.firebase.auth.d(this, bVar));
    }

    public Task c(String str) {
        AbstractC3191o.g(str);
        return this.f37561e.zza(this.f37557a, str, this.f37567k);
    }

    public final PhoneAuthProvider.a c0(com.google.firebase.auth.a aVar, PhoneAuthProvider.a aVar2, k0 k0Var) {
        return aVar.m() ? aVar2 : new f(this, aVar, k0Var, aVar2);
    }

    public Task d(String str) {
        AbstractC3191o.g(str);
        return this.f37561e.zzb(this.f37557a, str, this.f37567k);
    }

    public final PhoneAuthProvider.a d0(String str, PhoneAuthProvider.a aVar) {
        return (this.f37563g.g() && str != null && str.equals(this.f37563g.d())) ? new g(this, aVar) : aVar;
    }

    public Task e(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        return this.f37561e.zza(this.f37557a, str, str2, this.f37567k);
    }

    public Task f(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        return new h(this, str, str2).b(this, this.f37567k, this.f37571o, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task g(String str) {
        AbstractC3191o.g(str);
        return this.f37561e.zzc(this.f37557a, str, this.f37567k);
    }

    public Task h(boolean z10) {
        return V(this.f37562f, z10);
    }

    public final void h0(FirebaseUser firebaseUser, zzahv zzahvVar, boolean z10) {
        i0(firebaseUser, zzahvVar, true, false);
    }

    public C4196f i() {
        return this.f37557a;
    }

    public final void i0(FirebaseUser firebaseUser, zzahv zzahvVar, boolean z10, boolean z11) {
        g0(this, firebaseUser, zzahvVar, true, z11);
    }

    public FirebaseUser j() {
        return this.f37562f;
    }

    public String k() {
        return this.f37556B;
    }

    public final void k0(com.google.firebase.auth.a aVar, k0 k0Var) {
        com.google.firebase.auth.a aVar2;
        long longValue = aVar.j().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String g10 = AbstractC3191o.g(aVar.k());
        String c10 = k0Var.c();
        String b10 = k0Var.b();
        String d10 = k0Var.d();
        if (zzac.zzc(c10) && q0() != null && q0().d("PHONE_PROVIDER")) {
            c10 = "NO_RECAPTCHA";
        }
        String str = c10;
        zzaij zzaijVar = new zzaij(g10, longValue, aVar.g() != null, this.f37565i, this.f37567k, d10, b10, str, F0());
        PhoneAuthProvider.a d02 = d0(g10, aVar.h());
        if (TextUtils.isEmpty(k0Var.d())) {
            aVar2 = aVar;
            d02 = c0(aVar2, d02, k0.a().d(d10).c(str).a(b10).b());
        } else {
            aVar2 = aVar;
        }
        this.f37561e.zza(this.f37557a, zzaijVar, d02, aVar2.b(), aVar2.l());
    }

    public AbstractC5232q l() {
        return this.f37563g;
    }

    public String m() {
        String str;
        synchronized (this.f37564h) {
            str = this.f37565i;
        }
        return str;
    }

    public final synchronized void m0(T t10) {
        this.f37568l = t10;
    }

    public Task n() {
        return this.f37576t.a();
    }

    public final Task n0(Activity activity, AbstractC5223h abstractC5223h, FirebaseUser firebaseUser) {
        AbstractC3191o.m(activity);
        AbstractC3191o.m(abstractC5223h);
        AbstractC3191o.m(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f37576t.e(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        H.f(activity.getApplicationContext(), this, firebaseUser);
        abstractC5223h.b(activity);
        return taskCompletionSource.getTask();
    }

    public String o() {
        String str;
        synchronized (this.f37566j) {
            str = this.f37567k;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task o0(FirebaseUser firebaseUser, String str) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(firebaseUser);
        return this.f37561e.zzb(this.f37557a, firebaseUser, str, new d(this));
    }

    public String p() {
        FirebaseUser firebaseUser = this.f37562f;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.a();
    }

    public Task q() {
        if (this.f37568l == null) {
            this.f37568l = new T(this.f37557a, this);
        }
        return this.f37568l.a(this.f37567k, Boolean.FALSE).continueWithTask(new J(this));
    }

    public final synchronized T q0() {
        return this.f37568l;
    }

    public boolean r(String str) {
        return EmailAuthCredential.k(str);
    }

    public void s(a aVar) {
        this.f37559c.remove(aVar);
    }

    public final boolean s0(String str) {
        C5220e c10 = C5220e.c(str);
        return (c10 == null || TextUtils.equals(this.f37567k, c10.d())) ? false : true;
    }

    public void t(b bVar) {
        this.f37558b.remove(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task t0(FirebaseUser firebaseUser, AuthCredential authCredential) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(authCredential);
        AuthCredential i10 = authCredential.i();
        if (!(i10 instanceof EmailAuthCredential)) {
            return i10 instanceof PhoneAuthCredential ? this.f37561e.zzb(this.f37557a, firebaseUser, (PhoneAuthCredential) i10, this.f37567k, (c0) new d(this)) : this.f37561e.zzc(this.f37557a, firebaseUser, i10, firebaseUser.l(), new d(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) i10;
        return "password".equals(emailAuthCredential.h()) ? Z(emailAuthCredential.zzc(), AbstractC3191o.g(emailAuthCredential.zzd()), firebaseUser.l(), firebaseUser, true) : s0(AbstractC3191o.g(emailAuthCredential.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : N(emailAuthCredential, firebaseUser, true);
    }

    public Task u(String str) {
        AbstractC3191o.g(str);
        return v(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task u0(FirebaseUser firebaseUser, String str) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.g(str);
        return this.f37561e.zzc(this.f37557a, firebaseUser, str, new d(this));
    }

    public Task v(String str, ActionCodeSettings actionCodeSettings) {
        AbstractC3191o.g(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.a0();
        }
        String str2 = this.f37565i;
        if (str2 != null) {
            actionCodeSettings.Z(str2);
        }
        actionCodeSettings.Y(1);
        return new j0(this, str, actionCodeSettings).b(this, this.f37567k, this.f37569m, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task w(String str, ActionCodeSettings actionCodeSettings) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(actionCodeSettings);
        if (!actionCodeSettings.g()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f37565i;
        if (str2 != null) {
            actionCodeSettings.Z(str2);
        }
        return new i0(this, str, actionCodeSettings).b(this, this.f37567k, this.f37569m, "EMAIL_PASSWORD_PROVIDER");
    }

    public final InterfaceC6736b w0() {
        return this.f37578v;
    }

    public void x(String str) {
        String str2;
        AbstractC3191o.g(str);
        if (str.startsWith("chrome-extension://")) {
            this.f37556B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f37556B = (String) AbstractC3191o.m(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.f37556B = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    public final Task x0(FirebaseUser firebaseUser, String str) {
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.g(str);
        return this.f37561e.zzd(this.f37557a, firebaseUser, str, new d(this));
    }

    public void y(String str) {
        AbstractC3191o.g(str);
        synchronized (this.f37564h) {
            this.f37565i = str;
        }
    }

    public void z(String str) {
        AbstractC3191o.g(str);
        synchronized (this.f37566j) {
            this.f37567k = str;
        }
    }

    public final InterfaceC6736b z0() {
        return this.f37579w;
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull C4196f c4196f) {
        return (FirebaseAuth) c4196f.j(FirebaseAuth.class);
    }

    public FirebaseAuth(C4196f c4196f, zzacq zzacqVar, Y y10, d0 d0Var, C5444x c5444x, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzahv a10;
        this.f37558b = new CopyOnWriteArrayList();
        this.f37559c = new CopyOnWriteArrayList();
        this.f37560d = new CopyOnWriteArrayList();
        this.f37564h = new Object();
        this.f37566j = new Object();
        this.f37569m = RecaptchaAction.custom("getOobCode");
        this.f37570n = RecaptchaAction.custom("signInWithPassword");
        this.f37571o = RecaptchaAction.custom("signUpPassword");
        this.f37572p = RecaptchaAction.custom("sendVerificationCode");
        this.f37573q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f37574r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f37557a = (C4196f) AbstractC3191o.m(c4196f);
        this.f37561e = (zzacq) AbstractC3191o.m(zzacqVar);
        Y y11 = (Y) AbstractC3191o.m(y10);
        this.f37575s = y11;
        this.f37563g = new C5425d();
        d0 d0Var2 = (d0) AbstractC3191o.m(d0Var);
        this.f37576t = d0Var2;
        this.f37577u = (C5444x) AbstractC3191o.m(c5444x);
        this.f37578v = interfaceC6736b;
        this.f37579w = interfaceC6736b2;
        this.f37581y = executor2;
        this.f37582z = executor3;
        this.f37555A = executor4;
        FirebaseUser b10 = y11.b();
        this.f37562f = b10;
        if (b10 != null && (a10 = y11.a(b10)) != null) {
            g0(this, this.f37562f, a10, false, false);
        }
        d0Var2.c(this);
    }
}
