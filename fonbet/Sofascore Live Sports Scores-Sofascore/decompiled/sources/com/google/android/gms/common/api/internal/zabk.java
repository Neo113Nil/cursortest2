package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zau;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.dh0;
import defpackage.f2n;
import defpackage.fc6;
import defpackage.gh0;
import defpackage.h2n;
import defpackage.i2n;
import defpackage.k2n;
import defpackage.q61;
import defpackage.t1n;
import defpackage.w2n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zabk implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zat {
    public final Api.Client b;
    public final ApiKey c;
    public final zaaa d;
    public final int g;
    public final zacm h;
    public boolean i;
    public final /* synthetic */ GoogleApiManager m;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList j = new ArrayList();
    public ConnectionResult k = null;
    public int l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zabk(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        String str;
        this.m = googleApiManager;
        zao zaoVar = googleApiManager.n;
        Looper looper = zaoVar.getLooper();
        ClientSettings.Builder d = googleApi.d();
        Account account = d.a;
        gh0 gh0Var = d.b;
        String str2 = d.c;
        String str3 = d.d;
        SignInOptions signInOptions = SignInOptions.a;
        Api.Client b = googleApi.d.a.b(googleApi.a, looper, new ClientSettings(account, gh0Var, null, str2, str3, signInOptions), googleApi.e, this, this);
        AttributionSourceWrapper attributionSourceWrapper = googleApi.c;
        if (attributionSourceWrapper != null && (b instanceof BaseGmsClient)) {
            ((BaseGmsClient) b).setAttributionSourceWrapper(attributionSourceWrapper);
        } else if ((attributionSourceWrapper == null || !(b instanceof NonGmsServiceBrokerClient)) && (str = googleApi.b) != null && (b instanceof BaseGmsClient)) {
            ((BaseGmsClient) b).setAttributionTag(str);
        }
        this.b = b;
        this.c = googleApi.f;
        this.d = new zaaa();
        this.g = googleApi.h;
        if (!b.requiresSignIn()) {
            this.h = null;
            return;
        }
        Context context = googleApiManager.e;
        ClientSettings.Builder d2 = googleApi.d();
        this.h = new zacm(context, zaoVar, new ClientSettings(d2.a, d2.b, null, d2.c, d2.d, signInOptions));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        l(connectionResult, null);
    }

    public final void a() {
        Api.Client client = this.b;
        GoogleApiManager googleApiManager = this.m;
        Preconditions.d(googleApiManager.n);
        this.k = null;
        i(ConnectionResult.f);
        if (this.i) {
            zao zaoVar = googleApiManager.n;
            ApiKey apiKey = this.c;
            zaoVar.removeMessages(11, apiKey);
            googleApiManager.n.removeMessages(9, apiKey);
            this.i = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            c cVar = ((zacd) it.next()).a;
            if (j(cVar.b) != null) {
                it.remove();
            } else {
                try {
                    cVar.a(client, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    client.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException unused2) {
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i) {
        Preconditions.d(this.m.n);
        this.k = null;
        this.i = true;
        String lastDisconnectMessage = this.b.getLastDisconnectMessage();
        zaaa zaaaVar = this.d;
        zaaaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        zaaaVar.a(true, new Status(20, sb.toString(), null, null));
        ApiKey apiKey = this.c;
        GoogleApiManager googleApiManager = this.m;
        zao zaoVar = googleApiManager.n;
        zaoVar.sendMessageDelayed(Message.obtain(zaoVar, 9, apiKey), 5000L);
        zao zaoVar2 = googleApiManager.n;
        zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 11, apiKey), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        SparseIntArray sparseIntArray = googleApiManager.g.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((zacd) it.next()).c.run();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.r) {
            try {
                GoogleApiManager googleApiManager = this.m;
                if (googleApiManager.k != null && googleApiManager.l.contains(this.c)) {
                    zaab zaabVar = googleApiManager.k;
                    int i = this.g;
                    zaabVar.getClass();
                    new w2n(connectionResult, i);
                    throw null;
                }
            } finally {
            }
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (e(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    public final boolean e(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaaa zaaaVar = this.d;
            Api.Client client = this.b;
            zaiVar.c(zaaaVar, client.requiresSignIn());
            try {
                zaiVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                client.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        zac zacVar = (zac) zaiVar;
        Feature j = j(zacVar.f(this));
        if (j == null) {
            zaaa zaaaVar2 = this.d;
            Api.Client client2 = this.b;
            zaiVar.c(zaaaVar2, client2.requiresSignIn());
            try {
                zaiVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                client2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j.a;
        long Y0 = j.Y0();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(Y0).length() + 2);
        GoogleApiManager googleApiManager = this.m;
        if (!googleApiManager.o || !zacVar.g(this)) {
            zacVar.b(new UnsupportedApiCallException(j));
            return true;
        }
        int h = zacVar.h(this);
        i2n i2nVar = new i2n(this.c, j);
        ArrayList arrayList = this.j;
        int indexOf = arrayList.indexOf(i2nVar);
        if (indexOf >= 0) {
            i2n i2nVar2 = (i2n) arrayList.get(indexOf);
            googleApiManager.n.removeMessages(15, i2nVar2);
            googleApiManager.n.sendMessageDelayed(Message.obtain(googleApiManager.n, 15, i2nVar2), 5000L);
            return false;
        }
        arrayList.add(i2nVar);
        googleApiManager.n.sendMessageDelayed(Message.obtain(googleApiManager.n, 15, i2nVar), 5000L);
        googleApiManager.n.sendMessageDelayed(Message.obtain(googleApiManager.n, 16, i2nVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(h));
        if (c(connectionResult)) {
            String str2 = j.a;
            long Y02 = j.Y0();
            new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(Y02).length());
            return false;
        }
        if (!googleApiManager.g(connectionResult, this.g)) {
            return false;
        }
        String str3 = j.a;
        long Y03 = j.Y0();
        new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(Y03).length());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z) {
        Preconditions.d(this.m.n);
        if ((status == null) == (exc == null)) {
            a70.p("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.a == 2) {
                if (status != null) {
                    zaiVar.a(status);
                } else {
                    zaiVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        Preconditions.d(this.m.n);
        f(status, null, false);
    }

    public final void h() {
        GoogleApiManager googleApiManager = this.m;
        zao zaoVar = googleApiManager.n;
        ApiKey apiKey = this.c;
        zaoVar.removeMessages(12, apiKey);
        zao zaoVar2 = googleApiManager.n;
        zaoVar2.sendMessageDelayed(zaoVar2.obtainMessage(12, apiKey), googleApiManager.a);
    }

    public final void i(ConnectionResult connectionResult) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        zal zalVar = (zal) it.next();
        if (Objects.a(connectionResult, ConnectionResult.f)) {
            this.b.getEndpointPackageName();
        }
        zalVar.getClass();
        throw null;
    }

    public final Feature j(Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        Feature[] availableFeatures = this.b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new Feature[0];
        }
        dh0 dh0Var = new dh0(availableFeatures.length);
        for (Feature feature : availableFeatures) {
            dh0Var.put(feature.a, Long.valueOf(feature.Y0()));
        }
        for (Feature feature2 : featureArr) {
            Long l = (Long) dh0Var.get(feature2.a);
            if (l == null || l.longValue() < feature2.Y0()) {
                return feature2;
            }
        }
        return null;
    }

    public final void k(ConnectionResult connectionResult) {
        Preconditions.d(this.m.n);
        Api.Client client = this.b;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        client.disconnect(fc6.o(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        l(connectionResult, null);
    }

    public final void l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.google.android.gms.signin.zae zaeVar;
        GoogleApiManager googleApiManager = this.m;
        Preconditions.d(googleApiManager.n);
        zacm zacmVar = this.h;
        if (zacmVar != null && (zaeVar = zacmVar.f) != null) {
            zaeVar.disconnect();
        }
        Preconditions.d(this.m.n);
        this.k = null;
        SparseIntArray sparseIntArray = googleApiManager.g.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(connectionResult);
        if ((this.b instanceof zau) && connectionResult.b != 24) {
            googleApiManager.b = true;
            zao zaoVar = googleApiManager.n;
            zaoVar.sendMessageDelayed(zaoVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.b;
        if (i == 4) {
            g(GoogleApiManager.q);
            return;
        }
        if (i == 25) {
            g(GoogleApiManager.d(this.c, connectionResult));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.k = connectionResult;
            return;
        }
        if (runtimeException != null) {
            Preconditions.d(googleApiManager.n);
            f(null, runtimeException, false);
            return;
        }
        boolean z = googleApiManager.o;
        ApiKey apiKey = this.c;
        if (!z) {
            g(GoogleApiManager.d(apiKey, connectionResult));
            return;
        }
        f(GoogleApiManager.d(apiKey, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || googleApiManager.g(connectionResult, this.g)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.i = true;
        }
        if (!this.i) {
            g(GoogleApiManager.d(apiKey, connectionResult));
        } else {
            zao zaoVar2 = googleApiManager.n;
            zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 9, apiKey), 5000L);
        }
    }

    public final void m(zai zaiVar) {
        Preconditions.d(this.m.n);
        boolean isConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (e(zaiVar)) {
                h();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.k;
        if (connectionResult == null || !connectionResult.Y0()) {
            o();
        } else {
            l(this.k, null);
        }
    }

    public final void n() {
        Preconditions.d(this.m.n);
        Status status = GoogleApiManager.p;
        g(status);
        zaaa zaaaVar = this.d;
        zaaaVar.getClass();
        zaaaVar.a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            m(new zah(listenerKey, new TaskCompletionSource()));
        }
        i(new ConnectionResult(4, null, null));
        Api.Client client = this.b;
        if (client.isConnected()) {
            client.onUserSignOut(new h2n(this));
        }
    }

    public final void o() {
        GoogleApiManager googleApiManager = this.m;
        Preconditions.d(googleApiManager.n);
        Api.Client client = this.b;
        if (client.isConnected() || client.isConnecting()) {
            return;
        }
        try {
            int a = googleApiManager.g.a(googleApiManager.e, client);
            if (a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(a, null, null);
                new StringBuilder(client.getClass().getName().length() + 35 + connectionResult.toString().length());
                l(connectionResult, null);
                return;
            }
            k2n k2nVar = new k2n(googleApiManager, client, this.c);
            if (client.requiresSignIn()) {
                zacm zacmVar = this.h;
                Preconditions.i(zacmVar);
                com.google.android.gms.signin.zae zaeVar = zacmVar.f;
                if (zaeVar != null) {
                    zaeVar.disconnect();
                }
                ClientSettings clientSettings = zacmVar.e;
                clientSettings.h = Integer.valueOf(System.identityHashCode(zacmVar));
                t1n t1nVar = zacmVar.c;
                Context context = zacmVar.a;
                Handler handler = zacmVar.b;
                zacmVar.f = (com.google.android.gms.signin.zae) t1nVar.b(context, handler.getLooper(), clientSettings, clientSettings.g, zacmVar, zacmVar);
                zacmVar.g = k2nVar;
                Set set = zacmVar.d;
                if (set == null || set.isEmpty()) {
                    handler.post(new f2n(zacmVar));
                } else {
                    zacmVar.f.l();
                }
            }
            try {
                client.connect(k2nVar);
            } catch (SecurityException e) {
                l(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            l(new ConnectionResult(10, null, null), e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        GoogleApiManager googleApiManager = this.m;
        if (Looper.myLooper() == googleApiManager.n.getLooper()) {
            a();
        } else {
            googleApiManager.n.post(new f2n(this, 0));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        GoogleApiManager googleApiManager = this.m;
        if (Looper.myLooper() == googleApiManager.n.getLooper()) {
            b(i);
        } else {
            googleApiManager.n.post(new q61(this, i, 5));
        }
    }
}
