package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zao;
import defpackage.ah0;
import defpackage.b1l;
import defpackage.d1l;
import defpackage.dh0;
import defpackage.f2n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g implements zabv {
    public final Context a;
    public final zaaz b;
    public final Looper c;
    public final zabd d;
    public final zabd e;
    public final Map f;
    public final Api.Client h;
    public Bundle i;
    public final Lock m;
    public final Set g = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult j = null;
    public ConnectionResult k = null;
    public boolean l = false;
    public int n = 0;

    public g(Context context, zaaz zaazVar, ReentrantLock reentrantLock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, dh0 dh0Var, dh0 dh0Var2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, dh0 dh0Var3, dh0 dh0Var4) {
        this.a = context;
        this.b = zaazVar;
        this.m = reentrantLock;
        this.c = looper;
        this.h = client;
        this.d = new zabd(context, zaazVar, reentrantLock, looper, googleApiAvailabilityLight, dh0Var2, null, dh0Var4, null, arrayList2, new b1l(this, 1));
        this.e = new zabd(context, zaazVar, reentrantLock, looper, googleApiAvailabilityLight, dh0Var, clientSettings, dh0Var3, abstractClientBuilder, arrayList, new d1l(this, 2));
        dh0 dh0Var5 = new dh0(0);
        Iterator it = ((ah0) dh0Var2.keySet()).iterator();
        while (it.hasNext()) {
            dh0Var5.put((Api.AnyClientKey) it.next(), this.d);
        }
        Iterator it2 = ((ah0) dh0Var.keySet()).iterator();
        while (it2.hasNext()) {
            dh0Var5.put((Api.AnyClientKey) it2.next(), this.e);
        }
        this.f = Collections.unmodifiableMap(dh0Var5);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.a(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.a(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void b() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.b();
        this.e.b();
        f();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean c(SignInConnectionListener signInConnectionListener) {
        Lock lock;
        this.m.lock();
        try {
            lock = this.m;
            lock.lock();
            try {
                boolean z = true;
                boolean z2 = this.n == 2;
                lock.unlock();
                if (!z2) {
                    if (e()) {
                    }
                    z = false;
                    return z;
                }
                zabd zabdVar = this.e;
                if (!(zabdVar.k instanceof zaag)) {
                    this.g.add(signInConnectionListener);
                    if (this.n == 0) {
                        this.n = 1;
                    }
                    this.k = null;
                    zabdVar.m();
                    return z;
                }
                z = false;
                return z;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.m;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void d() {
        Lock lock = this.m;
        lock.lock();
        try {
            lock.lock();
            try {
                int i = 2;
                boolean z = this.n == 2;
                lock.unlock();
                this.e.b();
                this.k = new ConnectionResult(4, null, null);
                if (z) {
                    new zao(this.c).post(new f2n(this, i));
                } else {
                    f();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.n == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.zabv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        this.m.lock();
        try {
            boolean z = false;
            if (this.d.k instanceof zaag) {
                if (!(this.e.k instanceof zaag) && !g()) {
                }
                z = true;
            }
            return z;
        } finally {
            this.m.unlock();
        }
    }

    public final void f() {
        Set set = this.g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        set.clear();
    }

    public final boolean g() {
        ConnectionResult connectionResult = this.k;
        return connectionResult != null && connectionResult.b == 4;
    }

    public final void h() {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3 = this.j;
        zabd zabdVar = this.d;
        if (connectionResult3 == null || !connectionResult3.Z0()) {
            ConnectionResult connectionResult4 = this.j;
            zabd zabdVar2 = this.e;
            if (connectionResult4 != null && (connectionResult2 = this.k) != null && connectionResult2.Z0()) {
                zabdVar2.b();
                ConnectionResult connectionResult5 = this.j;
                Preconditions.i(connectionResult5);
                i(connectionResult5);
                return;
            }
            ConnectionResult connectionResult6 = this.j;
            if (connectionResult6 == null || (connectionResult = this.k) == null) {
                return;
            }
            if (zabdVar2.l < zabdVar.l) {
                connectionResult6 = connectionResult;
            }
            i(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = this.k;
        if ((connectionResult7 == null || !connectionResult7.Z0()) && !g()) {
            ConnectionResult connectionResult8 = this.k;
            if (connectionResult8 != null) {
                if (this.n == 1) {
                    f();
                    return;
                } else {
                    i(connectionResult8);
                    zabdVar.b();
                    return;
                }
            }
            return;
        }
        int i = this.n;
        if (i != 1) {
            if (i != 2) {
                new AssertionError();
                this.n = 0;
            } else {
                zaaz zaazVar = this.b;
                Preconditions.i(zaazVar);
                zaazVar.g(this.i);
            }
        }
        f();
        this.n = 0;
    }

    public final void i(ConnectionResult connectionResult) {
        int i = this.n;
        if (i != 1) {
            if (i != 2) {
                new Exception();
                this.n = 0;
            }
            this.b.k(connectionResult);
        }
        f();
        this.n = 0;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void m() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.m();
        this.e.m();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl n(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabd zabdVar = (zabd) this.f.get(apiMethodImpl.o);
        Preconditions.j(zabdVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (zabdVar != this.e) {
            zabd zabdVar2 = this.d;
            zabdVar2.getClass();
            apiMethodImpl.l();
            return zabdVar2.k.n(apiMethodImpl);
        }
        if (g()) {
            Api.Client client = this.h;
            apiMethodImpl.o(new Status(4, null, client == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), client.getSignInIntent(), com.google.android.gms.internal.base.zak.a | 134217728), null));
            return apiMethodImpl;
        }
        zabd zabdVar3 = this.e;
        zabdVar3.getClass();
        apiMethodImpl.l();
        return zabdVar3.k.n(apiMethodImpl);
    }
}
