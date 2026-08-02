package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzam;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f37614a;

    /* renamed from: b, reason: collision with root package name */
    public Long f37615b;

    /* renamed from: c, reason: collision with root package name */
    public PhoneAuthProvider.a f37616c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f37617d;

    /* renamed from: e, reason: collision with root package name */
    public String f37618e;

    /* renamed from: f, reason: collision with root package name */
    public Activity f37619f;

    /* renamed from: g, reason: collision with root package name */
    public PhoneAuthProvider.ForceResendingToken f37620g;

    /* renamed from: h, reason: collision with root package name */
    public MultiFactorSession f37621h;

    /* renamed from: i, reason: collision with root package name */
    public PhoneMultiFactorInfo f37622i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37623j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37624k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37625l;

    /* renamed from: com.google.firebase.auth.a$a, reason: collision with other inner class name */
    public static final class C0523a {

        /* renamed from: a, reason: collision with root package name */
        public final FirebaseAuth f37626a;

        /* renamed from: b, reason: collision with root package name */
        public String f37627b;

        /* renamed from: c, reason: collision with root package name */
        public Long f37628c;

        /* renamed from: d, reason: collision with root package name */
        public PhoneAuthProvider.a f37629d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f37630e;

        /* renamed from: f, reason: collision with root package name */
        public Activity f37631f;

        /* renamed from: g, reason: collision with root package name */
        public PhoneAuthProvider.ForceResendingToken f37632g;

        /* renamed from: h, reason: collision with root package name */
        public MultiFactorSession f37633h;

        /* renamed from: i, reason: collision with root package name */
        public PhoneMultiFactorInfo f37634i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f37635j;

        public C0523a(FirebaseAuth firebaseAuth) {
            this.f37626a = (FirebaseAuth) AbstractC3191o.m(firebaseAuth);
        }

        public final a a() {
            AbstractC3191o.n(this.f37626a, "FirebaseAuth instance cannot be null");
            AbstractC3191o.n(this.f37628c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            AbstractC3191o.n(this.f37629d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f37630e = this.f37626a.f37555A;
            if (this.f37628c.longValue() < 0 || this.f37628c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            MultiFactorSession multiFactorSession = this.f37633h;
            if (multiFactorSession == null) {
                AbstractC3191o.h(this.f37627b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                AbstractC3191o.b(!this.f37635j, "You cannot require sms validation without setting a multi-factor session.");
                AbstractC3191o.b(this.f37634i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (multiFactorSession == null || !((zzam) multiFactorSession).k()) {
                AbstractC3191o.b(this.f37634i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                AbstractC3191o.b(this.f37627b == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            } else {
                AbstractC3191o.g(this.f37627b);
                AbstractC3191o.b(this.f37634i == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            }
            return new a(this.f37626a, this.f37628c, this.f37629d, this.f37630e, this.f37627b, this.f37631f, this.f37632g, this.f37633h, this.f37634i, this.f37635j);
        }

        public final C0523a b(boolean z10) {
            this.f37635j = z10;
            return this;
        }

        public final C0523a c(Activity activity) {
            this.f37631f = activity;
            return this;
        }

        public final C0523a d(PhoneAuthProvider.a aVar) {
            this.f37629d = aVar;
            return this;
        }

        public final C0523a e(PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.f37632g = forceResendingToken;
            return this;
        }

        public final C0523a f(PhoneMultiFactorInfo phoneMultiFactorInfo) {
            this.f37634i = phoneMultiFactorInfo;
            return this;
        }

        public final C0523a g(MultiFactorSession multiFactorSession) {
            this.f37633h = multiFactorSession;
            return this;
        }

        public final C0523a h(String str) {
            this.f37627b = str;
            return this;
        }

        public final C0523a i(Long l10, TimeUnit timeUnit) {
            this.f37628c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    public static C0523a a(FirebaseAuth firebaseAuth) {
        return new C0523a(firebaseAuth);
    }

    public final Activity b() {
        return this.f37619f;
    }

    public final void c(boolean z10) {
        this.f37624k = true;
    }

    public final FirebaseAuth d() {
        return this.f37614a;
    }

    public final void e(boolean z10) {
        this.f37625l = true;
    }

    public final MultiFactorSession f() {
        return this.f37621h;
    }

    public final PhoneAuthProvider.ForceResendingToken g() {
        return this.f37620g;
    }

    public final PhoneAuthProvider.a h() {
        return this.f37616c;
    }

    public final PhoneMultiFactorInfo i() {
        return this.f37622i;
    }

    public final Long j() {
        return this.f37615b;
    }

    public final String k() {
        return this.f37618e;
    }

    public final Executor l() {
        return this.f37617d;
    }

    public final boolean m() {
        return this.f37624k;
    }

    public final boolean n() {
        return this.f37623j;
    }

    public final boolean o() {
        return this.f37625l;
    }

    public final boolean p() {
        return this.f37621h != null;
    }

    public a(FirebaseAuth firebaseAuth, Long l10, PhoneAuthProvider.a aVar, Executor executor, String str, Activity activity, PhoneAuthProvider.ForceResendingToken forceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z10) {
        this.f37614a = firebaseAuth;
        this.f37618e = str;
        this.f37615b = l10;
        this.f37616c = aVar;
        this.f37619f = activity;
        this.f37617d = executor;
        this.f37620g = forceResendingToken;
        this.f37621h = multiFactorSession;
        this.f37622i = phoneMultiFactorInfo;
        this.f37623j = z10;
    }
}
