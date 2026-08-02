package com.google.android.gms.common.api.internal;

import ai.verisoul.sdk.Core;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import z.C6900a;

/* renamed from: com.google.android.gms.common.api.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3147o0 implements f.b, f.c, k1 {

    /* renamed from: b, reason: collision with root package name */
    public final C3117a.f f32542b;

    /* renamed from: c, reason: collision with root package name */
    public final C3120b f32543c;

    /* renamed from: d, reason: collision with root package name */
    public final D f32544d;

    /* renamed from: g, reason: collision with root package name */
    public final int f32547g;

    /* renamed from: h, reason: collision with root package name */
    public final O0 f32548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32549i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C3130g f32553m;

    /* renamed from: a, reason: collision with root package name */
    public final Queue f32541a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f32545e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Map f32546f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final List f32550j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ConnectionResult f32551k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f32552l = 0;

    public C3147o0(C3130g c3130g, com.google.android.gms.common.api.e eVar) {
        this.f32553m = c3130g;
        C3117a.f zab = eVar.zab(c3130g.f32500n.getLooper(), this);
        this.f32542b = zab;
        this.f32543c = eVar.getApiKey();
        this.f32544d = new D();
        this.f32547g = eVar.zaa();
        if (zab.requiresSignIn()) {
            this.f32548h = eVar.zac(c3130g.f32491e, c3130g.f32500n);
        } else {
            this.f32548h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void B(C3147o0 c3147o0, C3151q0 c3151q0) {
        if (c3147o0.f32550j.contains(c3151q0) && !c3147o0.f32549i) {
            if (c3147o0.f32542b.isConnected()) {
                c3147o0.j();
            } else {
                c3147o0.E();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(C3147o0 c3147o0, C3151q0 c3151q0) {
        Feature feature;
        Feature[] g10;
        if (c3147o0.f32550j.remove(c3151q0)) {
            c3147o0.f32553m.f32500n.removeMessages(15, c3151q0);
            c3147o0.f32553m.f32500n.removeMessages(16, c3151q0);
            feature = c3151q0.f32560b;
            ArrayList arrayList = new ArrayList(c3147o0.f32541a.size());
            for (a1 a1Var : c3147o0.f32541a) {
                if ((a1Var instanceof AbstractC3166y0) && (g10 = ((AbstractC3166y0) a1Var).g(c3147o0)) != null && K9.b.b(g10, feature)) {
                    arrayList.add(a1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a1 a1Var2 = (a1) arrayList.get(i10);
                c3147o0.f32541a.remove(a1Var2);
                a1Var2.b(new com.google.android.gms.common.api.q(feature));
            }
        }
    }

    public final void D() {
        AbstractC3191o.d(this.f32553m.f32500n);
        this.f32551k = null;
    }

    public final void E() {
        AbstractC3191o.d(this.f32553m.f32500n);
        if (this.f32542b.isConnected() || this.f32542b.isConnecting()) {
            return;
        }
        try {
            C3130g c3130g = this.f32553m;
            int b10 = c3130g.f32493g.b(c3130g.f32491e, this.f32542b);
            if (b10 == 0) {
                C3130g c3130g2 = this.f32553m;
                C3117a.f fVar = this.f32542b;
                C3154s0 c3154s0 = new C3154s0(c3130g2, fVar, this.f32543c);
                if (fVar.requiresSignIn()) {
                    ((O0) AbstractC3191o.m(this.f32548h)).N0(c3154s0);
                }
                try {
                    this.f32542b.connect(c3154s0);
                    return;
                } catch (SecurityException e10) {
                    H(new ConnectionResult(10), e10);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(b10, null);
            Log.w("GoogleApiManager", "The service for " + this.f32542b.getClass().getName() + " is not available: " + connectionResult.toString());
            H(connectionResult, null);
        } catch (IllegalStateException e11) {
            H(new ConnectionResult(10), e11);
        }
    }

    public final void F(a1 a1Var) {
        AbstractC3191o.d(this.f32553m.f32500n);
        if (this.f32542b.isConnected()) {
            if (p(a1Var)) {
                m();
                return;
            } else {
                this.f32541a.add(a1Var);
                return;
            }
        }
        this.f32541a.add(a1Var);
        ConnectionResult connectionResult = this.f32551k;
        if (connectionResult == null || !connectionResult.k()) {
            E();
        } else {
            H(this.f32551k, null);
        }
    }

    public final void G() {
        this.f32552l++;
    }

    public final void H(ConnectionResult connectionResult, Exception exc) {
        AbstractC3191o.d(this.f32553m.f32500n);
        O0 o02 = this.f32548h;
        if (o02 != null) {
            o02.O0();
        }
        D();
        this.f32553m.f32493g.c();
        e(connectionResult);
        if ((this.f32542b instanceof F9.e) && connectionResult.h() != 24) {
            this.f32553m.f32488b = true;
            C3130g c3130g = this.f32553m;
            c3130g.f32500n.sendMessageDelayed(c3130g.f32500n.obtainMessage(19), Core.sensorDataTimeout);
        }
        if (connectionResult.h() == 4) {
            f(C3130g.f32484q);
            return;
        }
        if (this.f32541a.isEmpty()) {
            this.f32551k = connectionResult;
            return;
        }
        if (exc != null) {
            AbstractC3191o.d(this.f32553m.f32500n);
            h(null, exc, false);
            return;
        }
        if (!this.f32553m.f32501o) {
            f(C3130g.g(this.f32543c, connectionResult));
            return;
        }
        h(C3130g.g(this.f32543c, connectionResult), null, true);
        if (this.f32541a.isEmpty() || q(connectionResult) || this.f32553m.f(connectionResult, this.f32547g)) {
            return;
        }
        if (connectionResult.h() == 18) {
            this.f32549i = true;
        }
        if (!this.f32549i) {
            f(C3130g.g(this.f32543c, connectionResult));
            return;
        }
        C3130g c3130g2 = this.f32553m;
        c3130g2.f32500n.sendMessageDelayed(Message.obtain(c3130g2.f32500n, 9, this.f32543c), 5000L);
    }

    public final void I(ConnectionResult connectionResult) {
        AbstractC3191o.d(this.f32553m.f32500n);
        C3117a.f fVar = this.f32542b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        H(connectionResult, null);
    }

    public final void J() {
        AbstractC3191o.d(this.f32553m.f32500n);
        if (this.f32549i) {
            E();
        }
    }

    public final void K() {
        AbstractC3191o.d(this.f32553m.f32500n);
        f(C3130g.f32483p);
        this.f32544d.f();
        for (C3140l.a aVar : (C3140l.a[]) this.f32546f.keySet().toArray(new C3140l.a[0])) {
            F(new Z0(aVar, new TaskCompletionSource()));
        }
        e(new ConnectionResult(4));
        if (this.f32542b.isConnected()) {
            this.f32542b.onUserSignOut(new C3145n0(this));
        }
    }

    public final void L() {
        AbstractC3191o.d(this.f32553m.f32500n);
        if (this.f32549i) {
            o();
            C3130g c3130g = this.f32553m;
            f(c3130g.f32492f.i(c3130g.f32491e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f32542b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f32542b.requiresSignIn();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public final void c(ConnectionResult connectionResult) {
        H(connectionResult, null);
    }

    public final Feature d(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f32542b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C6900a c6900a = new C6900a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c6900a.put(feature.h(), Long.valueOf(feature.i()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) c6900a.get(feature2.h());
                if (l10 == null || l10.longValue() < feature2.i()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void e(ConnectionResult connectionResult) {
        Iterator it = this.f32545e.iterator();
        if (!it.hasNext()) {
            this.f32545e.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (AbstractC3189m.b(connectionResult, ConnectionResult.f32216f)) {
            this.f32542b.getEndpointPackageName();
        }
        throw null;
    }

    public final void f(Status status) {
        AbstractC3191o.d(this.f32553m.f32500n);
        h(status, null, false);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void g(Bundle bundle) {
        if (Looper.myLooper() == this.f32553m.f32500n.getLooper()) {
            k();
        } else {
            this.f32553m.f32500n.post(new RunnableC3139k0(this));
        }
    }

    public final void h(Status status, Exception exc, boolean z10) {
        AbstractC3191o.d(this.f32553m.f32500n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f32541a.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (!z10 || a1Var.f32435a == 2) {
                if (status != null) {
                    a1Var.a(status);
                } else {
                    a1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void i(int i10) {
        if (Looper.myLooper() == this.f32553m.f32500n.getLooper()) {
            l(i10);
        } else {
            this.f32553m.f32500n.post(new RunnableC3141l0(this, i10));
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void i0(ConnectionResult connectionResult, C3117a c3117a, boolean z10) {
        throw null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList(this.f32541a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            if (!this.f32542b.isConnected()) {
                return;
            }
            if (p(a1Var)) {
                this.f32541a.remove(a1Var);
            }
        }
    }

    public final void k() {
        D();
        e(ConnectionResult.f32216f);
        o();
        Iterator it = this.f32546f.values().iterator();
        while (it.hasNext()) {
            F0 f02 = (F0) it.next();
            if (d(f02.f32353a.c()) != null) {
                it.remove();
            } else {
                try {
                    f02.f32353a.d(this.f32542b, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    i(3);
                    this.f32542b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        j();
        m();
    }

    public final void l(int i10) {
        D();
        this.f32549i = true;
        this.f32544d.e(i10, this.f32542b.getLastDisconnectMessage());
        C3120b c3120b = this.f32543c;
        C3130g c3130g = this.f32553m;
        c3130g.f32500n.sendMessageDelayed(Message.obtain(c3130g.f32500n, 9, c3120b), 5000L);
        C3120b c3120b2 = this.f32543c;
        C3130g c3130g2 = this.f32553m;
        c3130g2.f32500n.sendMessageDelayed(Message.obtain(c3130g2.f32500n, 11, c3120b2), 120000L);
        this.f32553m.f32493g.c();
        Iterator it = this.f32546f.values().iterator();
        while (it.hasNext()) {
            ((F0) it.next()).f32355c.run();
        }
    }

    public final void m() {
        this.f32553m.f32500n.removeMessages(12, this.f32543c);
        C3120b c3120b = this.f32543c;
        C3130g c3130g = this.f32553m;
        c3130g.f32500n.sendMessageDelayed(c3130g.f32500n.obtainMessage(12, c3120b), this.f32553m.f32487a);
    }

    public final void n(a1 a1Var) {
        a1Var.d(this.f32544d, a());
        try {
            a1Var.c(this);
        } catch (DeadObjectException unused) {
            i(1);
            this.f32542b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void o() {
        if (this.f32549i) {
            C3130g c3130g = this.f32553m;
            c3130g.f32500n.removeMessages(11, this.f32543c);
            C3130g c3130g2 = this.f32553m;
            c3130g2.f32500n.removeMessages(9, this.f32543c);
            this.f32549i = false;
        }
    }

    public final boolean p(a1 a1Var) {
        if (!(a1Var instanceof AbstractC3166y0)) {
            n(a1Var);
            return true;
        }
        AbstractC3166y0 abstractC3166y0 = (AbstractC3166y0) a1Var;
        Feature d10 = d(abstractC3166y0.g(this));
        if (d10 == null) {
            n(a1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f32542b.getClass().getName() + " could not execute call because it requires feature (" + d10.h() + ", " + d10.i() + ").");
        if (!this.f32553m.f32501o || !abstractC3166y0.f(this)) {
            abstractC3166y0.b(new com.google.android.gms.common.api.q(d10));
            return true;
        }
        C3151q0 c3151q0 = new C3151q0(this.f32543c, d10, null);
        int indexOf = this.f32550j.indexOf(c3151q0);
        if (indexOf >= 0) {
            C3151q0 c3151q02 = (C3151q0) this.f32550j.get(indexOf);
            this.f32553m.f32500n.removeMessages(15, c3151q02);
            C3130g c3130g = this.f32553m;
            c3130g.f32500n.sendMessageDelayed(Message.obtain(c3130g.f32500n, 15, c3151q02), 5000L);
            return false;
        }
        this.f32550j.add(c3151q0);
        C3130g c3130g2 = this.f32553m;
        c3130g2.f32500n.sendMessageDelayed(Message.obtain(c3130g2.f32500n, 15, c3151q0), 5000L);
        C3130g c3130g3 = this.f32553m;
        c3130g3.f32500n.sendMessageDelayed(Message.obtain(c3130g3.f32500n, 16, c3151q0), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (q(connectionResult)) {
            return false;
        }
        this.f32553m.f(connectionResult, this.f32547g);
        return false;
    }

    public final boolean q(ConnectionResult connectionResult) {
        synchronized (C3130g.f32485r) {
            try {
                C3130g c3130g = this.f32553m;
                if (c3130g.f32497k == null || !c3130g.f32498l.contains(this.f32543c)) {
                    return false;
                }
                this.f32553m.f32497k.h(connectionResult, this.f32547g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean r(boolean z10) {
        AbstractC3191o.d(this.f32553m.f32500n);
        if (!this.f32542b.isConnected() || !this.f32546f.isEmpty()) {
            return false;
        }
        if (!this.f32544d.g()) {
            this.f32542b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final int s() {
        return this.f32547g;
    }

    public final int t() {
        return this.f32552l;
    }

    public final C3117a.f v() {
        return this.f32542b;
    }

    public final Map x() {
        return this.f32546f;
    }
}
