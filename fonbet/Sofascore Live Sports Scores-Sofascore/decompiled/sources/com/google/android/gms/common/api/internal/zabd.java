package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.b2n;
import defpackage.dh0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zabd implements zabv, zat {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    public final b2n e;
    public final Map f;
    public final HashMap g = new HashMap();
    public final ClientSettings h;
    public final Map i;
    public final Api.AbstractClientBuilder j;
    public volatile zaba k;
    public int l;
    public final zaaz m;
    public final zabu n;

    public zabd(Context context, zaaz zaazVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, dh0 dh0Var, ClientSettings clientSettings, dh0 dh0Var2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabu zabuVar) {
        this.c = context;
        this.a = lock;
        this.d = googleApiAvailabilityLight;
        this.f = dh0Var;
        this.h = clientSettings;
        this.i = dh0Var2;
        this.j = abstractClientBuilder;
        this.m = zaazVar;
        this.n = zabuVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zas) arrayList.get(i)).c = this;
        }
        this.e = new b2n(this, looper, 1);
        this.b = lock.newCondition();
        this.k = new zaas(this);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (Api api : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.c).println(":");
            Api.Client client = (Api.Client) this.f.get(api.b);
            Preconditions.i(client);
            client.dump(str.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void b() {
        if (this.k.l()) {
            this.g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean c(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean e() {
        return this.k instanceof zaag;
    }

    public final void f() {
        this.a.lock();
        try {
            this.k = new zaas(this);
            this.k.p();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void m() {
        this.k.m();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl n(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.l();
        return this.k.n(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.k.o(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.k.q(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void d() {
    }
}
