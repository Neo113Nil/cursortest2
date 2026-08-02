package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ca.InterfaceC2905e;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.common.internal.InterfaceC3184h;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class X implements InterfaceC3125d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3131g0 f32406a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f32407b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f32408c;

    /* renamed from: d, reason: collision with root package name */
    public final C3171d f32409d;

    /* renamed from: e, reason: collision with root package name */
    public ConnectionResult f32410e;

    /* renamed from: f, reason: collision with root package name */
    public int f32411f;

    /* renamed from: h, reason: collision with root package name */
    public int f32413h;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2905e f32416k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32417l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32418m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32419n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC3184h f32420o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32421p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32422q;

    /* renamed from: r, reason: collision with root package name */
    public final C3180d f32423r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f32424s;

    /* renamed from: t, reason: collision with root package name */
    public final C3117a.AbstractC0488a f32425t;

    /* renamed from: g, reason: collision with root package name */
    public int f32412g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f32414i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    public final Set f32415j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f32426u = new ArrayList();

    public X(C3131g0 c3131g0, C3180d c3180d, Map map, C3171d c3171d, C3117a.AbstractC0488a abstractC0488a, Lock lock, Context context) {
        this.f32406a = c3131g0;
        this.f32423r = c3180d;
        this.f32424s = map;
        this.f32409d = c3171d;
        this.f32425t = abstractC0488a;
        this.f32407b = lock;
        this.f32408c = context;
    }

    public static /* bridge */ /* synthetic */ void B(X x10, zak zakVar) {
        if (x10.o(0)) {
            ConnectionResult g10 = zakVar.g();
            if (!g10.l()) {
                if (!x10.q(g10)) {
                    x10.l(g10);
                    return;
                } else {
                    x10.i();
                    x10.n();
                    return;
                }
            }
            zav zavVar = (zav) AbstractC3191o.m(zakVar.h());
            ConnectionResult g11 = zavVar.g();
            if (!g11.l()) {
                String valueOf = String.valueOf(g11);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                x10.l(g11);
                return;
            }
            x10.f32419n = true;
            x10.f32420o = (InterfaceC3184h) AbstractC3191o.m(zavVar.h());
            x10.f32421p = zavVar.i();
            x10.f32422q = zavVar.j();
            x10.n();
        }
    }

    public static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set y(X x10) {
        C3180d c3180d = x10.f32423r;
        if (c3180d == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(c3180d.g());
        Map k10 = x10.f32423r.k();
        for (C3117a c3117a : k10.keySet()) {
            C3131g0 c3131g0 = x10.f32406a;
            if (!c3131g0.f32508g.containsKey(c3117a.b())) {
                android.support.v4.media.session.b.a(k10.get(c3117a));
                throw null;
            }
        }
        return hashSet;
    }

    public final void J() {
        ArrayList arrayList = this.f32426u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f32426u.clear();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void a(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f32414i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ca.e, com.google.android.gms.common.api.a$f] */
    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void b() {
        this.f32406a.f32508g.clear();
        this.f32418m = false;
        T t10 = null;
        this.f32410e = null;
        this.f32412g = 0;
        this.f32417l = true;
        this.f32419n = false;
        this.f32421p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (C3117a c3117a : this.f32424s.keySet()) {
            C3117a.f fVar = (C3117a.f) AbstractC3191o.m((C3117a.f) this.f32406a.f32507f.get(c3117a.b()));
            z10 |= c3117a.c().getPriority() == 1;
            boolean booleanValue = ((Boolean) this.f32424s.get(c3117a)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f32418m = true;
                if (booleanValue) {
                    this.f32415j.add(c3117a.b());
                } else {
                    this.f32417l = false;
                }
            }
            hashMap.put(fVar, new L(this, c3117a, booleanValue));
        }
        if (z10) {
            this.f32418m = false;
        }
        if (this.f32418m) {
            AbstractC3191o.m(this.f32423r);
            AbstractC3191o.m(this.f32425t);
            this.f32423r.l(Integer.valueOf(System.identityHashCode(this.f32406a.f32515n)));
            U u10 = new U(this, t10);
            C3117a.AbstractC0488a abstractC0488a = this.f32425t;
            Context context = this.f32408c;
            C3131g0 c3131g0 = this.f32406a;
            C3180d c3180d = this.f32423r;
            this.f32416k = abstractC0488a.buildClient(context, c3131g0.f32515n.l(), c3180d, (Object) c3180d.h(), (f.b) u10, (f.c) u10);
        }
        this.f32413h = this.f32406a.f32507f.size();
        this.f32426u.add(AbstractC3133h0.a().submit(new O(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void c() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void d(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
        if (o(1)) {
            m(connectionResult, c3117a, z10);
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final void e(int i10) {
        l(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d f(AbstractC3124d abstractC3124d) {
        this.f32406a.f32515n.f32456h.add(abstractC3124d);
        return abstractC3124d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final boolean g() {
        J();
        j(true);
        this.f32406a.o(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3125d0
    public final AbstractC3124d h(AbstractC3124d abstractC3124d) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void i() {
        this.f32418m = false;
        this.f32406a.f32515n.f32464p = Collections.EMPTY_SET;
        for (C3117a.c cVar : this.f32415j) {
            if (!this.f32406a.f32508g.containsKey(cVar)) {
                C3131g0 c3131g0 = this.f32406a;
                c3131g0.f32508g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    public final void j(boolean z10) {
        InterfaceC2905e interfaceC2905e = this.f32416k;
        if (interfaceC2905e != null) {
            if (interfaceC2905e.isConnected() && z10) {
                interfaceC2905e.a();
            }
            interfaceC2905e.disconnect();
            this.f32420o = null;
        }
    }

    public final void k() {
        this.f32406a.m();
        AbstractC3133h0.a().execute(new K(this));
        InterfaceC2905e interfaceC2905e = this.f32416k;
        if (interfaceC2905e != null) {
            if (this.f32421p) {
                interfaceC2905e.d((InterfaceC3184h) AbstractC3191o.m(this.f32420o), this.f32422q);
            }
            j(false);
        }
        Iterator it = this.f32406a.f32508g.keySet().iterator();
        while (it.hasNext()) {
            ((C3117a.f) AbstractC3191o.m((C3117a.f) this.f32406a.f32507f.get((C3117a.c) it.next()))).disconnect();
        }
        this.f32406a.f32516o.a(this.f32414i.isEmpty() ? null : this.f32414i);
    }

    public final void l(ConnectionResult connectionResult) {
        J();
        j(!connectionResult.k());
        this.f32406a.o(connectionResult);
        this.f32406a.f32516o.c(connectionResult);
    }

    public final void m(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
        int priority = c3117a.c().getPriority();
        if ((!z10 || connectionResult.k() || this.f32409d.c(connectionResult.h()) != null) && (this.f32410e == null || priority < this.f32411f)) {
            this.f32410e = connectionResult;
            this.f32411f = priority;
        }
        C3131g0 c3131g0 = this.f32406a;
        c3131g0.f32508g.put(c3117a.b(), connectionResult);
    }

    public final void n() {
        if (this.f32413h != 0) {
            return;
        }
        if (!this.f32418m || this.f32419n) {
            ArrayList arrayList = new ArrayList();
            this.f32412g = 1;
            this.f32413h = this.f32406a.f32507f.size();
            for (C3117a.c cVar : this.f32406a.f32507f.keySet()) {
                if (!this.f32406a.f32508g.containsKey(cVar)) {
                    arrayList.add((C3117a.f) this.f32406a.f32507f.get(cVar));
                } else if (p()) {
                    k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f32426u.add(AbstractC3133h0.a().submit(new P(this, arrayList)));
        }
    }

    public final boolean o(int i10) {
        if (this.f32412g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f32406a.f32515n.t());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f32413h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + r(this.f32412g) + " but received callback for step " + r(i10), new Exception());
        l(new ConnectionResult(8, null));
        return false;
    }

    public final boolean p() {
        int i10 = this.f32413h - 1;
        this.f32413h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f32406a.f32515n.t());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            l(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f32410e;
        if (connectionResult == null) {
            return true;
        }
        this.f32406a.f32514m = this.f32411f;
        l(connectionResult);
        return false;
    }

    public final boolean q(ConnectionResult connectionResult) {
        return this.f32417l && !connectionResult.k();
    }
}
