package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zan;
import com.google.android.gms.internal.base.zao;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ah0;
import defpackage.b2n;
import defpackage.bka;
import defpackage.c2n;
import defpackage.ch0;
import defpackage.dh0;
import defpackage.eq3;
import defpackage.fc6;
import defpackage.yg0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaaz extends GoogleApiClient implements zabu {
    public final ReentrantLock b;
    public final zan c;
    public final int e;
    public final Context f;
    public final Looper g;
    public volatile boolean i;
    public final b2n l;
    public final GoogleApiAvailability m;
    public zabs n;
    public final dh0 o;
    public final ClientSettings q;
    public final dh0 r;
    public final Api.AbstractClientBuilder s;
    public final ArrayList u;
    public final zacu w;
    public zabv d = null;
    public final LinkedList h = new LinkedList();
    public final long j = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    public final long k = 5000;
    public Set p = new HashSet();
    public final ListenerHolders t = new ListenerHolders();
    public Integer v = null;

    public zaaz(Context context, ReentrantLock reentrantLock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, dh0 dh0Var, ArrayList arrayList, ArrayList arrayList2, dh0 dh0Var2, int i, ArrayList arrayList3) {
        bka bkaVar = new bka(this, 28);
        this.f = context;
        this.b = reentrantLock;
        this.c = new zan(looper, bkaVar);
        this.g = looper;
        this.l = new b2n(this, looper, 0);
        this.m = googleApiAvailability;
        this.e = -1;
        this.r = dh0Var;
        this.o = dh0Var2;
        this.u = arrayList3;
        this.w = new zacu();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
            zan zanVar = this.c;
            zanVar.getClass();
            Preconditions.i(connectionCallbacks);
            synchronized (zanVar.i) {
                try {
                    ArrayList arrayList4 = zanVar.b;
                    if (arrayList4.contains(connectionCallbacks)) {
                        new StringBuilder(String.valueOf(connectionCallbacks).length() + 62);
                    } else {
                        arrayList4.add(connectionCallbacks);
                    }
                } finally {
                }
            }
            if (zanVar.a.t()) {
                zao zaoVar = zanVar.h;
                zaoVar.sendMessage(zaoVar.obtainMessage(1, connectionCallbacks));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it2.next();
            zan zanVar2 = this.c;
            zanVar2.getClass();
            Preconditions.i(onConnectionFailedListener);
            synchronized (zanVar2.i) {
                try {
                    ArrayList arrayList5 = zanVar2.d;
                    if (arrayList5.contains(onConnectionFailedListener)) {
                        new StringBuilder(String.valueOf(onConnectionFailedListener).length() + 67);
                    } else {
                        arrayList5.add(onConnectionFailedListener);
                    }
                } finally {
                }
            }
        }
        this.q = clientSettings;
        this.s = abstractClientBuilder;
    }

    public static int i(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z2 |= client.requiresSignIn();
            z3 |= client.providesSignIn();
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = this.e;
            Integer num = this.v;
            int i2 = 2;
            boolean z = false;
            if (i >= 0) {
                Preconditions.k("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.v = Integer.valueOf(i(this.o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.v;
            Preconditions.i(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i2);
                    Preconditions.a(sb.toString(), z);
                    m(i2);
                    n();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i2);
                Preconditions.a(sb2.toString(), z);
                m(i2);
                n();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void b() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.w.a();
            zabv zabvVar = this.d;
            if (zabvVar != null) {
                zabvVar.b();
            }
            Set set = this.t.a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ListenerHolder) it.next()).b = null;
            }
            set.clear();
            LinkedList<BaseImplementation.ApiMethodImpl> linkedList = this.h;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : linkedList) {
                apiMethodImpl.g.set(null);
                apiMethodImpl.d();
            }
            linkedList.clear();
            if (this.d != null) {
                h();
                zan zanVar = this.c;
                zanVar.e = false;
                zanVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper c() {
        return this.g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean d(SignInConnectionListener signInConnectionListener) {
        zabv zabvVar = this.d;
        return zabvVar != null && zabvVar.c(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void e() {
        zabv zabvVar = this.d;
        if (zabvVar != null) {
            zabvVar.d();
        }
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.i);
        printWriter.append(" mWorkQueue.size()=").print(this.h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.w.a.size());
        zabv zabvVar = this.d;
        if (zabvVar != null) {
            zabvVar.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void g(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.h;
            if (linkedList.isEmpty()) {
                zan zanVar = this.c;
                zao zaoVar = zanVar.h;
                if (Looper.myLooper() != zaoVar.getLooper()) {
                    a70.r("onConnectionSuccess must only be called on the Handler thread");
                    return;
                }
                synchronized (zanVar.i) {
                    try {
                        Preconditions.l(!zanVar.g);
                        zaoVar.removeMessages(1);
                        zanVar.g = true;
                        ArrayList arrayList = zanVar.c;
                        Preconditions.l(arrayList.isEmpty());
                        ArrayList arrayList2 = new ArrayList(zanVar.b);
                        AtomicInteger atomicInteger = zanVar.f;
                        int i = atomicInteger.get();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                            if (!zanVar.e || !zanVar.a.t() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(connectionCallbacks)) {
                                connectionCallbacks.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        zanVar.g = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) linkedList.remove();
            dh0 dh0Var = this.o;
            Api api = apiMethodImpl.p;
            boolean containsKey = dh0Var.containsKey(apiMethodImpl.o);
            String str = api != null ? api.c : "the API";
            StringBuilder sb = new StringBuilder(str.length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            Preconditions.a(sb.toString(), containsKey);
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                zabv zabvVar = this.d;
                if (zabvVar == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.i) {
                    LinkedList linkedList2 = this.h;
                    linkedList2.add(apiMethodImpl);
                    while (!linkedList2.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl2 = (BaseImplementation.ApiMethodImpl) linkedList2.remove();
                        zacu zacuVar = this.w;
                        zacuVar.a.add(apiMethodImpl2);
                        apiMethodImpl2.g.set(zacuVar.b);
                        apiMethodImpl2.o(Status.g);
                    }
                    reentrantLock.unlock();
                } else {
                    zabvVar.n(apiMethodImpl);
                }
            } finally {
                this.b.unlock();
            }
        }
    }

    public final boolean h() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        b2n b2nVar = this.l;
        b2nVar.removeMessages(2);
        b2nVar.removeMessages(1);
        zabs zabsVar = this.n;
        if (zabsVar != null) {
            zabsVar.a();
            this.n = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void j(int i) {
        if (i == 1) {
            if (!this.i) {
                this.i = true;
                if (this.n == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.m;
                        Context applicationContext = this.f.getApplicationContext();
                        c2n c2nVar = new c2n(this);
                        googleApiAvailability.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        zabs zabsVar = new zabs(c2nVar);
                        eq3.K(applicationContext, zabsVar, intentFilter, null, 2);
                        zabsVar.a = applicationContext;
                        if (!GooglePlayServicesUtilLight.d(applicationContext)) {
                            c2nVar.a();
                            zabsVar.a();
                            zabsVar = null;
                        }
                        this.n = zabsVar;
                    } catch (SecurityException unused) {
                    }
                }
                b2n b2nVar = this.l;
                b2nVar.sendMessageDelayed(b2nVar.obtainMessage(1), this.j);
                b2nVar.sendMessageDelayed(b2nVar.obtainMessage(2), this.k);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.w.a.toArray(new BasePendingResult[0])) {
            basePendingResult.f(zacu.c);
        }
        zan zanVar = this.c;
        zao zaoVar = zanVar.h;
        if (Looper.myLooper() != zaoVar.getLooper()) {
            a70.r("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        zaoVar.removeMessages(1);
        synchronized (zanVar.i) {
            try {
                zanVar.g = true;
                ArrayList arrayList = zanVar.b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = zanVar.f;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!zanVar.e || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                zanVar.c.clear();
                zanVar.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        zanVar.e = false;
        zanVar.f.incrementAndGet();
        if (i == 2) {
            n();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void k(ConnectionResult connectionResult) {
        GoogleApiAvailability googleApiAvailability = this.m;
        Context context = this.f;
        int i = connectionResult.b;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        if (!(i == 18 ? true : i == 1 ? GooglePlayServicesUtilLight.d(context) : false)) {
            h();
        }
        if (this.i) {
            return;
        }
        zan zanVar = this.c;
        zao zaoVar = zanVar.h;
        if (Looper.myLooper() != zaoVar.getLooper()) {
            a70.r("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        zaoVar.removeMessages(1);
        synchronized (zanVar.i) {
            try {
                ArrayList arrayList = zanVar.d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = zanVar.f;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (zanVar.e && atomicInteger.get() == i2) {
                        if (arrayList.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.J(connectionResult);
                        }
                    }
                }
            } finally {
            }
        }
        zanVar.e = false;
        zanVar.f.incrementAndGet();
    }

    public final /* synthetic */ void l() {
        this.b.lock();
        try {
            if (this.i) {
                n();
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void m(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.v.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(fc6.o(new StringBuilder(str.length() + str2.length() + 51), "Cannot use sign-in mode: ", str2, ". Mode was already set to ", str));
        }
        if (this.d != null) {
            return;
        }
        dh0 dh0Var = this.o;
        Iterator it = ((ch0) dh0Var.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z |= client.requiresSignIn();
            z2 |= client.providesSignIn();
        }
        int intValue2 = this.v.intValue();
        ArrayList arrayList = this.u;
        dh0 dh0Var2 = this.r;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                a70.r("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    a70.r("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                dh0Var = dh0Var;
            }
        } else {
            if (intValue2 == 2 && z) {
                dh0 dh0Var3 = new dh0(0);
                dh0 dh0Var4 = new dh0(0);
                Iterator it2 = ((yg0) dh0Var.entrySet()).iterator();
                Api.Client client2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Api.Client client3 = (Api.Client) entry.getValue();
                    if (true == client3.providesSignIn()) {
                        client2 = client3;
                    }
                    if (client3.requiresSignIn()) {
                        dh0Var3.put((Api.AnyClientKey) entry.getKey(), client3);
                    } else {
                        dh0Var4.put((Api.AnyClientKey) entry.getKey(), client3);
                    }
                }
                Preconditions.k("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !dh0Var3.isEmpty());
                dh0 dh0Var5 = new dh0(0);
                dh0 dh0Var6 = new dh0(0);
                Iterator it3 = ((ah0) dh0Var2.keySet()).iterator();
                while (it3.hasNext()) {
                    Api api = (Api) it3.next();
                    Api.ClientKey clientKey = api.b;
                    if (dh0Var3.containsKey(clientKey)) {
                        dh0Var5.put(api, (Boolean) dh0Var2.get(api));
                    } else {
                        if (!dh0Var4.containsKey(clientKey)) {
                            a70.r("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        dh0Var6.put(api, (Boolean) dh0Var2.get(api));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zas zasVar = (zas) arrayList.get(i2);
                    Api api2 = zasVar.a;
                    if (dh0Var5.containsKey(api2)) {
                        arrayList2.add(zasVar);
                    } else {
                        if (!dh0Var6.containsKey(api2)) {
                            a70.r("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(zasVar);
                    }
                }
                this.d = new g(this.f, this, reentrantLock2, this.g, this.m, dh0Var3, dh0Var4, this.q, this.s, client2, arrayList2, arrayList3, dh0Var5, dh0Var6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new zabd(this.f, this, reentrantLock, this.g, this.m, dh0Var, this.q, dh0Var2, this.s, arrayList, this);
    }

    public final void n() {
        this.c.e = true;
        zabv zabvVar = this.d;
        Preconditions.i(zabvVar);
        zabvVar.m();
    }
}
