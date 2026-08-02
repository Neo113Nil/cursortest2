package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a2n;
import defpackage.kac;
import defpackage.u1n;
import defpackage.x1n;
import defpackage.y1n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaar implements zaba {
    public final zabd a;
    public final Lock b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    public ConnectionResult e;
    public int f;
    public int h;
    public com.google.android.gms.signin.zae k;
    public boolean l;
    public boolean m;
    public boolean n;
    public IAccountAccessor o;
    public boolean p;
    public boolean q;
    public final ClientSettings r;
    public final Map s;
    public final Api.AbstractClientBuilder t;
    public int g = 0;
    public final Bundle i = new Bundle();
    public final HashSet j = new HashSet();
    public final ArrayList u = new ArrayList();

    public zaar(zabd zabdVar, ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.a = zabdVar;
        this.r = clientSettings;
        this.s = map;
        this.d = googleApiAvailabilityLight;
        this.t = abstractClientBuilder;
        this.b = lock;
        this.c = context;
    }

    public final void a() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            zabd zabdVar = this.a;
            Map map = zabdVar.f;
            this.h = map.size();
            for (Api.AnyClientKey anyClientKey : map.keySet()) {
                if (!zabdVar.g.containsKey(anyClientKey)) {
                    arrayList.add((Api.Client) map.get(anyClientKey));
                } else if (h()) {
                    b();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(zabe.a.submit(new y1n(this, arrayList)));
        }
    }

    public final void b() {
        zabd zabdVar = this.a;
        zabdVar.a.lock();
        try {
            zabdVar.m.h();
            zabdVar.k = new zaag(zabdVar);
            zabdVar.k.p();
            zabdVar.b.signalAll();
            zabdVar.a.unlock();
            zabe.a.execute(new kac(this, 29));
            com.google.android.gms.signin.zae zaeVar = this.k;
            if (zaeVar != null) {
                if (this.p) {
                    IAccountAccessor iAccountAccessor = this.o;
                    Preconditions.i(iAccountAccessor);
                    zaeVar.a(iAccountAccessor, this.q);
                }
                f(false);
            }
            Iterator it = zabdVar.g.keySet().iterator();
            while (it.hasNext()) {
                Api.Client client = (Api.Client) zabdVar.f.get((Api.AnyClientKey) it.next());
                Preconditions.i(client);
                client.disconnect();
            }
            Bundle bundle = this.i;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            zabdVar.n.g(bundle);
        } catch (Throwable th) {
            zabdVar.a.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.d.a(null, r3.b, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ConnectionResult connectionResult, Api api, boolean z) {
        Api.AbstractClientBuilder abstractClientBuilder = api.a;
        if (z && !connectionResult.Y0()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = connectionResult;
            this.f = Integer.MAX_VALUE;
        }
        this.a.g.put(api.b, connectionResult);
    }

    public final void d() {
        this.m = false;
        zabd zabdVar = this.a;
        zabdVar.m.p = Collections.EMPTY_SET;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            Api.AnyClientKey anyClientKey = (Api.AnyClientKey) it.next();
            HashMap hashMap = zabdVar.g;
            if (!hashMap.containsKey(anyClientKey)) {
                hashMap.put(anyClientKey, new ConnectionResult(17, null, null));
            }
        }
    }

    public final void e(ConnectionResult connectionResult) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        f(!connectionResult.Y0());
        zabd zabdVar = this.a;
        zabdVar.f();
        zabdVar.n.k(connectionResult);
    }

    public final void f(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.k;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.n();
            }
            zaeVar.disconnect();
            Preconditions.i(this.r);
            this.o = null;
        }
    }

    public final boolean g(int i) {
        if (this.g == i) {
            return true;
        }
        zaaz zaazVar = this.a.m;
        zaazVar.getClass();
        StringWriter stringWriter = new StringWriter();
        zaazVar.f("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        "Unexpected callback in ".concat(toString());
        new StringBuilder(String.valueOf(this.h).length() + 22);
        String str = this.g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        new StringBuilder((i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN").length() + str.length() + 70);
        new Exception();
        e(new ConnectionResult(8, null, null));
        return false;
    }

    public final boolean h() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        zabd zabdVar = this.a;
        if (i >= 0) {
            ConnectionResult connectionResult = this.e;
            if (connectionResult == null) {
                return true;
            }
            zabdVar.l = this.f;
            e(connectionResult);
            return false;
        }
        zaaz zaazVar = zabdVar.m;
        zaazVar.getClass();
        StringWriter stringWriter = new StringWriter();
        zaazVar.f("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        new Exception();
        e(new ConnectionResult(8, null, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean l() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        f(true);
        this.a.f();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final BaseImplementation.ApiMethodImpl n(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void o(Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (h()) {
                b();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void p() {
        zabd zabdVar = this.a;
        HashMap hashMap = zabdVar.g;
        Map map = zabdVar.f;
        hashMap.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.s;
        for (Api api : map2.keySet()) {
            Api.Client client = (Api.Client) map.get(api.b);
            Preconditions.i(client);
            boolean booleanValue = ((Boolean) map2.get(api)).booleanValue();
            if (client.requiresSignIn()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(api.b);
                } else {
                    this.l = false;
                }
            }
            hashMap2.put(client, new u1n(this, api, booleanValue));
        }
        if (this.m) {
            ClientSettings clientSettings = this.r;
            Preconditions.i(clientSettings);
            Api.AbstractClientBuilder abstractClientBuilder = this.t;
            Preconditions.i(abstractClientBuilder);
            zaaz zaazVar = zabdVar.m;
            clientSettings.h = Integer.valueOf(System.identityHashCode(zaazVar));
            a2n a2nVar = new a2n(this);
            this.k = (com.google.android.gms.signin.zae) abstractClientBuilder.b(this.c, zaazVar.g, clientSettings, clientSettings.g, a2nVar, a2nVar);
        }
        this.h = map.size();
        this.u.add(zabe.a.submit(new x1n(this, hashMap2)));
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void q(int i) {
        e(new ConnectionResult(8, null, null));
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void r(ConnectionResult connectionResult, Api api, boolean z) {
        if (g(1)) {
            c(connectionResult, api, z);
            if (h()) {
                b();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void m() {
    }
}
