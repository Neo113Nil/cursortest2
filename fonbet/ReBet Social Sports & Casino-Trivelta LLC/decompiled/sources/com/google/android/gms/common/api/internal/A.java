package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import z.C6900a;

/* loaded from: classes2.dex */
public final class A implements InterfaceC3168z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32314a;

    /* renamed from: b, reason: collision with root package name */
    public final C3123c0 f32315b;

    /* renamed from: c, reason: collision with root package name */
    public final Looper f32316c;

    /* renamed from: d, reason: collision with root package name */
    public final C3131g0 f32317d;

    /* renamed from: e, reason: collision with root package name */
    public final C3131g0 f32318e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f32319f;

    /* renamed from: h, reason: collision with root package name */
    public final C3117a.f f32321h;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f32322i;

    /* renamed from: m, reason: collision with root package name */
    public final Lock f32326m;

    /* renamed from: g, reason: collision with root package name */
    public final Set f32320g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j, reason: collision with root package name */
    public ConnectionResult f32323j = null;

    /* renamed from: k, reason: collision with root package name */
    public ConnectionResult f32324k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32325l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f32327n = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Context context, C3123c0 c3123c0, Lock lock, Looper looper, C3171d c3171d, Map map, Map map2, C3180d c3180d, C3117a.AbstractC0488a abstractC0488a, C3117a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f32314a = context;
        this.f32315b = c3123c0;
        this.f32326m = lock;
        this.f32316c = looper;
        this.f32321h = fVar;
        this.f32317d = new C3131g0(context, c3123c0, lock, looper, c3171d, map2, null, map4, null, arrayList2, new n1(this, null));
        this.f32318e = new C3131g0(context, c3123c0, lock, looper, c3171d, map, c3180d, map3, abstractC0488a, arrayList, new p1(this, 0 == true ? 1 : 0));
        C6900a c6900a = new C6900a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            c6900a.put((C3117a.c) it.next(), this.f32317d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c6900a.put((C3117a.c) it2.next(), this.f32318e);
        }
        this.f32319f = Collections.unmodifiableMap(c6900a);
    }

    public static boolean m(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.l();
    }

    public static A o(Context context, C3123c0 c3123c0, Lock lock, Looper looper, C3171d c3171d, Map map, C3180d c3180d, Map map2, C3117a.AbstractC0488a abstractC0488a, ArrayList arrayList) {
        C6900a c6900a = new C6900a();
        C6900a c6900a2 = new C6900a();
        C3117a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            C3117a.f fVar2 = (C3117a.f) entry.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            if (fVar2.requiresSignIn()) {
                c6900a.put((C3117a.c) entry.getKey(), fVar2);
            } else {
                c6900a2.put((C3117a.c) entry.getKey(), fVar2);
            }
        }
        AbstractC3191o.q(!c6900a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C6900a c6900a3 = new C6900a();
        C6900a c6900a4 = new C6900a();
        for (C3117a c3117a : map2.keySet()) {
            C3117a.c b10 = c3117a.b();
            if (c6900a.containsKey(b10)) {
                c6900a3.put(c3117a, (Boolean) map2.get(c3117a));
            } else {
                if (!c6900a2.containsKey(b10)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c6900a4.put(c3117a, (Boolean) map2.get(c3117a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1 j1Var = (j1) arrayList.get(i10);
            if (c6900a3.containsKey(j1Var.f32525a)) {
                arrayList2.add(j1Var);
            } else {
                if (!c6900a4.containsKey(j1Var.f32525a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(j1Var);
            }
        }
        return new A(context, c3123c0, lock, looper, c3171d, c6900a, c6900a2, c3180d, abstractC0488a, fVar, arrayList2, arrayList3, c6900a3, c6900a4);
    }

    public static /* bridge */ /* synthetic */ void v(A a10, int i10, boolean z10) {
        a10.f32315b.b(i10, z10);
        a10.f32324k = null;
        a10.f32323j = null;
    }

    public static /* bridge */ /* synthetic */ void w(A a10, Bundle bundle) {
        Bundle bundle2 = a10.f32322i;
        if (bundle2 == null) {
            a10.f32322i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void x(A a10) {
        ConnectionResult connectionResult;
        if (!m(a10.f32323j)) {
            if (a10.f32323j != null && m(a10.f32324k)) {
                a10.f32318e.c();
                a10.g((ConnectionResult) AbstractC3191o.m(a10.f32323j));
                return;
            }
            ConnectionResult connectionResult2 = a10.f32323j;
            if (connectionResult2 == null || (connectionResult = a10.f32324k) == null) {
                return;
            }
            if (a10.f32318e.f32514m < a10.f32317d.f32514m) {
                connectionResult2 = connectionResult;
            }
            a10.g(connectionResult2);
            return;
        }
        if (!m(a10.f32324k) && !a10.k()) {
            ConnectionResult connectionResult3 = a10.f32324k;
            if (connectionResult3 != null) {
                if (a10.f32327n == 1) {
                    a10.i();
                    return;
                } else {
                    a10.g(connectionResult3);
                    a10.f32317d.c();
                    return;
                }
            }
            return;
        }
        int i10 = a10.f32327n;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                a10.f32327n = 0;
            }
            ((C3123c0) AbstractC3191o.m(a10.f32315b)).a(a10.f32322i);
        }
        a10.i();
        a10.f32327n = 0;
    }

    public final PendingIntent A() {
        C3117a.f fVar = this.f32321h;
        if (fVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f32314a, System.identityHashCode(this.f32315b), fVar.getSignInIntent(), zap.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void a() {
        this.f32327n = 2;
        this.f32325l = false;
        this.f32324k = null;
        this.f32323j = null;
        this.f32317d.a();
        this.f32318e.a();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void b() {
        this.f32326m.lock();
        try {
            boolean z10 = z();
            this.f32318e.c();
            this.f32324k = new ConnectionResult(4);
            if (z10) {
                new zau(this.f32316c).post(new l1(this));
            } else {
                i();
            }
            this.f32326m.unlock();
        } catch (Throwable th2) {
            this.f32326m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void c() {
        this.f32324k = null;
        this.f32323j = null;
        this.f32327n = 0;
        this.f32317d.c();
        this.f32318e.c();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final boolean d(InterfaceC3155t interfaceC3155t) {
        this.f32326m.lock();
        try {
            boolean z10 = false;
            if (!z()) {
                if (h()) {
                }
                this.f32326m.unlock();
                return z10;
            }
            if (!this.f32318e.h()) {
                this.f32320g.add(interfaceC3155t);
                z10 = true;
                if (this.f32327n == 0) {
                    this.f32327n = 1;
                }
                this.f32324k = null;
                this.f32318e.a();
            }
            this.f32326m.unlock();
            return z10;
        } catch (Throwable th2) {
            this.f32326m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f32318e.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f32317d.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final AbstractC3124d f(AbstractC3124d abstractC3124d) {
        if (!l(abstractC3124d)) {
            this.f32317d.f(abstractC3124d);
            return abstractC3124d;
        }
        if (k()) {
            abstractC3124d.setFailedResult(new Status(4, (String) null, A()));
            return abstractC3124d;
        }
        this.f32318e.f(abstractC3124d);
        return abstractC3124d;
    }

    public final void g(ConnectionResult connectionResult) {
        int i10 = this.f32327n;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f32327n = 0;
            }
            this.f32315b.c(connectionResult);
        }
        i();
        this.f32327n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.f32327n == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        this.f32326m.lock();
        try {
            boolean z10 = false;
            if (this.f32317d.h()) {
                if (!this.f32318e.h() && !k()) {
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.f32326m.unlock();
        }
    }

    public final void i() {
        Iterator it = this.f32320g.iterator();
        while (it.hasNext()) {
            ((InterfaceC3155t) it.next()).onComplete();
        }
        this.f32320g.clear();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3168z0
    public final AbstractC3124d j(AbstractC3124d abstractC3124d) {
        if (!l(abstractC3124d)) {
            return this.f32317d.j(abstractC3124d);
        }
        if (!k()) {
            return this.f32318e.j(abstractC3124d);
        }
        abstractC3124d.setFailedResult(new Status(4, (String) null, A()));
        return abstractC3124d;
    }

    public final boolean k() {
        ConnectionResult connectionResult = this.f32324k;
        return connectionResult != null && connectionResult.h() == 4;
    }

    public final boolean l(AbstractC3124d abstractC3124d) {
        C3131g0 c3131g0 = (C3131g0) this.f32319f.get(abstractC3124d.getClientKey());
        AbstractC3191o.n(c3131g0, "GoogleApiClient is not configured to use the API required for this call.");
        return c3131g0.equals(this.f32318e);
    }

    public final boolean z() {
        this.f32326m.lock();
        try {
            return this.f32327n == 2;
        } finally {
            this.f32326m.unlock();
        }
    }
}
