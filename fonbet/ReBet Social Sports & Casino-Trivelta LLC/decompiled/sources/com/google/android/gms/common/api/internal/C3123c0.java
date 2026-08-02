package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123c0 extends com.google.android.gms.common.api.f implements InterfaceC3164x0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lock f32450b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.internal.G f32451c;

    /* renamed from: e, reason: collision with root package name */
    public final int f32453e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f32454f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f32455g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f32457i;

    /* renamed from: j, reason: collision with root package name */
    public long f32458j;

    /* renamed from: k, reason: collision with root package name */
    public long f32459k;

    /* renamed from: l, reason: collision with root package name */
    public final HandlerC3119a0 f32460l;

    /* renamed from: m, reason: collision with root package name */
    public final GoogleApiAvailability f32461m;

    /* renamed from: n, reason: collision with root package name */
    public C3160v0 f32462n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f32463o;

    /* renamed from: p, reason: collision with root package name */
    public Set f32464p;

    /* renamed from: q, reason: collision with root package name */
    public final C3180d f32465q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f32466r;

    /* renamed from: s, reason: collision with root package name */
    public final C3117a.AbstractC0488a f32467s;

    /* renamed from: t, reason: collision with root package name */
    public final C3142m f32468t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f32469u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f32470v;

    /* renamed from: w, reason: collision with root package name */
    public Set f32471w;

    /* renamed from: x, reason: collision with root package name */
    public final V0 f32472x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.common.internal.F f32473y;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3168z0 f32452d = null;

    /* renamed from: h, reason: collision with root package name */
    public final Queue f32456h = new LinkedList();

    public C3123c0(Context context, Lock lock, Looper looper, C3180d c3180d, GoogleApiAvailability googleApiAvailability, C3117a.AbstractC0488a abstractC0488a, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.f32458j = true != K9.d.a() ? 120000L : 10000L;
        this.f32459k = 5000L;
        this.f32464p = new HashSet();
        this.f32468t = new C3142m();
        this.f32470v = null;
        this.f32471w = null;
        Z z10 = new Z(this);
        this.f32473y = z10;
        this.f32454f = context;
        this.f32450b = lock;
        this.f32451c = new com.google.android.gms.common.internal.G(looper, z10);
        this.f32455g = looper;
        this.f32460l = new HandlerC3119a0(this, looper);
        this.f32461m = googleApiAvailability;
        this.f32453e = i10;
        if (i10 >= 0) {
            this.f32470v = Integer.valueOf(i11);
        }
        this.f32466r = map;
        this.f32463o = map2;
        this.f32469u = arrayList;
        this.f32472x = new V0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f32451c.f((f.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f32451c.g((f.c) it2.next());
        }
        this.f32465q = c3180d;
        this.f32467s = abstractC0488a;
    }

    public static int s(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            C3117a.f fVar = (C3117a.f) it.next();
            z11 |= fVar.requiresSignIn();
            z12 |= fVar.providesSignIn();
        }
        if (z11) {
            return (z12 && z10) ? 2 : 1;
        }
        return 3;
    }

    public static String u(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void v(C3123c0 c3123c0) {
        c3123c0.f32450b.lock();
        try {
            if (c3123c0.f32457i) {
                c3123c0.z();
            }
        } finally {
            c3123c0.f32450b.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void w(C3123c0 c3123c0) {
        c3123c0.f32450b.lock();
        try {
            if (c3123c0.x()) {
                c3123c0.z();
            }
        } finally {
            c3123c0.f32450b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void a(Bundle bundle) {
        while (!this.f32456h.isEmpty()) {
            h((AbstractC3124d) this.f32456h.remove());
        }
        this.f32451c.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void b(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f32457i) {
                this.f32457i = true;
                if (this.f32462n == null && !K9.d.a()) {
                    try {
                        this.f32462n = this.f32461m.x(this.f32454f.getApplicationContext(), new C3121b0(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC3119a0 handlerC3119a0 = this.f32460l;
                handlerC3119a0.sendMessageDelayed(handlerC3119a0.obtainMessage(1), this.f32458j);
                HandlerC3119a0 handlerC3119a02 = this.f32460l;
                handlerC3119a02.sendMessageDelayed(handlerC3119a02.obtainMessage(2), this.f32459k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f32472x.f32402a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(V0.f32401c);
        }
        this.f32451c.e(i10);
        this.f32451c.a();
        if (i10 == 2) {
            z();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3164x0
    public final void c(ConnectionResult connectionResult) {
        if (!this.f32461m.k(this.f32454f, connectionResult.h())) {
            x();
        }
        if (this.f32457i) {
            return;
        }
        this.f32451c.c(connectionResult);
        this.f32451c.a();
    }

    @Override // com.google.android.gms.common.api.f
    public final void d() {
        this.f32450b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f32453e >= 0) {
                AbstractC3191o.q(this.f32470v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f32470v;
                if (num == null) {
                    this.f32470v = Integer.valueOf(s(this.f32463o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) AbstractC3191o.m(this.f32470v)).intValue();
            this.f32450b.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    AbstractC3191o.b(z10, "Illegal sign-in mode: " + i10);
                    y(i10);
                    z();
                    this.f32450b.unlock();
                    return;
                }
                AbstractC3191o.b(z10, "Illegal sign-in mode: " + i10);
                y(i10);
                z();
                this.f32450b.unlock();
                return;
            } finally {
                this.f32450b.unlock();
            }
            z10 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void e() {
        this.f32450b.lock();
        try {
            this.f32472x.b();
            InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
            if (interfaceC3168z0 != null) {
                interfaceC3168z0.c();
            }
            this.f32468t.d();
            for (AbstractC3124d abstractC3124d : this.f32456h) {
                abstractC3124d.zan(null);
                abstractC3124d.cancel();
            }
            this.f32456h.clear();
            if (this.f32452d != null) {
                x();
                this.f32451c.a();
            }
            this.f32450b.unlock();
        } catch (Throwable th2) {
            this.f32450b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f32454f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f32457i);
        printWriter.append(" mWorkQueue.size()=").print(this.f32456h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f32472x.f32402a.size());
        InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
        if (interfaceC3168z0 != null) {
            interfaceC3168z0.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC3124d g(AbstractC3124d abstractC3124d) {
        C3117a api = abstractC3124d.getApi();
        AbstractC3191o.b(this.f32463o.containsKey(abstractC3124d.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.d() : "the API") + " required for this call.");
        this.f32450b.lock();
        try {
            InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
            if (interfaceC3168z0 == null) {
                this.f32456h.add(abstractC3124d);
            } else {
                abstractC3124d = interfaceC3168z0.f(abstractC3124d);
            }
            this.f32450b.unlock();
            return abstractC3124d;
        } catch (Throwable th2) {
            this.f32450b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC3124d h(AbstractC3124d abstractC3124d) {
        Map map = this.f32463o;
        C3117a api = abstractC3124d.getApi();
        AbstractC3191o.b(map.containsKey(abstractC3124d.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.d() : "the API") + " required for this call.");
        this.f32450b.lock();
        try {
            InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
            if (interfaceC3168z0 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f32457i) {
                this.f32456h.add(abstractC3124d);
                while (!this.f32456h.isEmpty()) {
                    AbstractC3124d abstractC3124d2 = (AbstractC3124d) this.f32456h.remove();
                    this.f32472x.a(abstractC3124d2);
                    abstractC3124d2.setFailedResult(Status.f32277h);
                }
            } else {
                abstractC3124d = interfaceC3168z0.j(abstractC3124d);
            }
            this.f32450b.unlock();
            return abstractC3124d;
        } catch (Throwable th2) {
            this.f32450b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final C3117a.f j(C3117a.c cVar) {
        C3117a.f fVar = (C3117a.f) this.f32463o.get(cVar);
        AbstractC3191o.n(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final Context k() {
        return this.f32454f;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper l() {
        return this.f32455g;
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean m() {
        InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
        return interfaceC3168z0 != null && interfaceC3168z0.h();
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean n(InterfaceC3155t interfaceC3155t) {
        InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
        return interfaceC3168z0 != null && interfaceC3168z0.d(interfaceC3155t);
    }

    @Override // com.google.android.gms.common.api.f
    public final void o() {
        InterfaceC3168z0 interfaceC3168z0 = this.f32452d;
        if (interfaceC3168z0 != null) {
            interfaceC3168z0.b();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void p(f.c cVar) {
        this.f32451c.g(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void q(f.c cVar) {
        this.f32451c.h(cVar);
    }

    public final String t() {
        StringWriter stringWriter = new StringWriter();
        f("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final boolean x() {
        if (!this.f32457i) {
            return false;
        }
        this.f32457i = false;
        this.f32460l.removeMessages(2);
        this.f32460l.removeMessages(1);
        C3160v0 c3160v0 = this.f32462n;
        if (c3160v0 != null) {
            c3160v0.b();
            this.f32462n = null;
        }
        return true;
    }

    public final void y(int i10) {
        C3123c0 c3123c0;
        Integer num = this.f32470v;
        if (num == null) {
            this.f32470v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + u(i10) + ". Mode was already set to " + u(this.f32470v.intValue()));
        }
        if (this.f32452d != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (C3117a.f fVar : this.f32463o.values()) {
            z10 |= fVar.requiresSignIn();
            z11 |= fVar.providesSignIn();
        }
        int intValue = this.f32470v.intValue();
        if (intValue == 1) {
            c3123c0 = this;
            if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (intValue == 2 && z10) {
                this.f32452d = A.o(this.f32454f, this, this.f32450b, this.f32455g, this.f32461m, this.f32463o, this.f32465q, this.f32466r, this.f32467s, this.f32469u);
                return;
            }
            c3123c0 = this;
        }
        c3123c0.f32452d = new C3131g0(c3123c0.f32454f, c3123c0, c3123c0.f32450b, c3123c0.f32455g, c3123c0.f32461m, c3123c0.f32463o, c3123c0.f32465q, c3123c0.f32466r, c3123c0.f32467s, c3123c0.f32469u, this);
    }

    public final void z() {
        this.f32451c.b();
        ((InterfaceC3168z0) AbstractC3191o.m(this.f32452d)).a();
    }
}
