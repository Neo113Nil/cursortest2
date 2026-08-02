package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import b6.j;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.messaging.m;
import g6.v;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kh.g;
import md.o;
import s.e;
import s7.d1;
import s7.e1;
import s7.e2;
import s7.f0;
import s7.f1;
import s7.h2;
import s7.j2;
import s7.l0;
import s7.l2;
import s7.o2;
import s7.r;
import s7.v1;
import s7.v3;
import s7.w0;
import s7.w1;
import s7.w3;
import s7.y1;
import s7.z1;
import t6.a;
import t6.b;
import x5.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public f1 f5780a;

    /* renamed from: f, reason: collision with root package name */
    public final e f5781f;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f5780a = null;
        this.f5781f = new e(0);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        e();
        r rVar = this.f5780a.f22752n;
        f1.j(rVar);
        rVar.k(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.x(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.k();
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new w0(4, e2Var, (Object) null));
    }

    public final void e() {
        if (this.f5780a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        e();
        r rVar = this.f5780a.f22752n;
        f1.j(rVar);
        rVar.l(j, str);
    }

    public final void f(String str, n0 n0Var) {
        e();
        v3 v3Var = this.f5780a.f22748i;
        f1.k(v3Var);
        v3Var.T(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void generateEventId(n0 n0Var) throws RemoteException {
        e();
        v3 v3Var = this.f5780a.f22748i;
        f1.k(v3Var);
        long h02 = v3Var.h0();
        e();
        v3 v3Var2 = this.f5780a.f22748i;
        f1.k(v3Var2);
        v3Var2.U(n0Var, h02);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getAppInstanceId(n0 n0Var) throws RemoteException {
        e();
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        d1Var.s(new e1(this, n0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCachedAppInstanceId(n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        f((String) e2Var.f22700g.get(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getConditionalUserProperties(String str, String str2, n0 n0Var) throws RemoteException {
        e();
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        d1Var.s(new f(6, this, n0Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenClass(n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        o2 o2Var = ((f1) e2Var.f3328a).f22750l;
        f1.l(o2Var);
        l2 l2Var = o2Var.f22929c;
        f(l2Var != null ? l2Var.f22872b : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenName(n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        o2 o2Var = ((f1) e2Var.f3328a).f22750l;
        f1.l(o2Var);
        l2 l2Var = o2Var.f22929c;
        f(l2Var != null ? l2Var.f22871a : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getGmpAppId(n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        f(e2Var.y(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getMaxUserProperties(String str, n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        v.e(str);
        ((f1) e2Var.f3328a).getClass();
        e();
        v3 v3Var = this.f5780a.f22748i;
        f1.k(v3Var);
        v3Var.V(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getSessionId(n0 n0Var) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new w0(e2Var, n0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getTestFlag(n0 n0Var, int i5) throws RemoteException {
        e();
        if (i5 == 0) {
            v3 v3Var = this.f5780a.f22748i;
            f1.k(v3Var);
            e2 e2Var = this.f5780a.f22751m;
            f1.l(e2Var);
            AtomicReference atomicReference = new AtomicReference();
            d1 d1Var = ((f1) e2Var.f3328a).f22746g;
            f1.m(d1Var);
            v3Var.T((String) d1Var.t(atomicReference, 15000L, "String test flag value", new y1(e2Var, atomicReference, 1)), n0Var);
            return;
        }
        if (i5 == 1) {
            v3 v3Var2 = this.f5780a.f22748i;
            f1.k(v3Var2);
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            d1 d1Var2 = ((f1) e2Var2.f3328a).f22746g;
            f1.m(d1Var2);
            v3Var2.U(n0Var, ((Long) d1Var2.t(atomicReference2, 15000L, "long test flag value", new y1(e2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i5 == 2) {
            v3 v3Var3 = this.f5780a.f22748i;
            f1.k(v3Var3);
            e2 e2Var3 = this.f5780a.f22751m;
            f1.l(e2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            d1 d1Var3 = ((f1) e2Var3.f3328a).f22746g;
            f1.m(d1Var3);
            double doubleValue = ((Double) d1Var3.t(atomicReference3, 15000L, "double test flag value", new y1(e2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                n0Var.b(bundle);
                return;
            } catch (RemoteException e7) {
                s7.n0 n0Var2 = ((f1) v3Var3.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22906i.b(e7, "Error returning double value to wrapper");
                return;
            }
        }
        if (i5 == 3) {
            v3 v3Var4 = this.f5780a.f22748i;
            f1.k(v3Var4);
            e2 e2Var4 = this.f5780a.f22751m;
            f1.l(e2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            d1 d1Var4 = ((f1) e2Var4.f3328a).f22746g;
            f1.m(d1Var4);
            v3Var4.V(n0Var, ((Integer) d1Var4.t(atomicReference4, 15000L, "int test flag value", new y1(e2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i5 != 4) {
            return;
        }
        v3 v3Var5 = this.f5780a.f22748i;
        f1.k(v3Var5);
        e2 e2Var5 = this.f5780a.f22751m;
        f1.l(e2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        d1 d1Var5 = ((f1) e2Var5.f3328a).f22746g;
        f1.m(d1Var5);
        v3Var5.X(n0Var, ((Boolean) d1Var5.t(atomicReference5, 15000L, "boolean test flag value", new y1(e2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getUserProperties(String str, String str2, boolean z5, n0 n0Var) throws RemoteException {
        e();
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        d1Var.s(new j(this, n0Var, str, str2, z5));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initForTests(@NonNull Map map) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initialize(a aVar, zzdd zzddVar, long j) throws RemoteException {
        f1 f1Var = this.f5780a;
        if (f1Var == null) {
            Context context = (Context) b.W(aVar);
            v.h(context);
            this.f5780a = f1.s(context, zzddVar, Long.valueOf(j));
        } else {
            s7.n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22906i.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void isDataCollectionEnabled(n0 n0Var) throws RemoteException {
        e();
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        d1Var.s(new e1(this, n0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z5, boolean z7, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.o(str, str2, bundle, z5, z7, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j) throws RemoteException {
        e();
        v.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        d1Var.s(new f(3, this, n0Var, zzbgVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logHealthData(int i5, @NonNull String str, @NonNull a aVar, @NonNull a aVar2, @NonNull a aVar3) throws RemoteException {
        e();
        Object W = aVar == null ? null : b.W(aVar);
        Object W2 = aVar2 == null ? null : b.W(aVar2);
        Object W3 = aVar3 != null ? b.W(aVar3) : null;
        s7.n0 n0Var = this.f5780a.f22745f;
        f1.m(n0Var);
        n0Var.s(i5, true, false, str, W, W2, W3);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreated(@NonNull a aVar, @NonNull Bundle bundle, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityCreatedByScionActivityInfo(zzdf.c(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        m mVar = e2Var.f22696c;
        if (mVar != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
            mVar.j(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyed(@NonNull a aVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        m mVar = e2Var.f22696c;
        if (mVar != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
            mVar.k(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPaused(@NonNull a aVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityPausedByScionActivityInfo(zzdf.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        m mVar = e2Var.f22696c;
        if (mVar != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
            mVar.l(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumed(@NonNull a aVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityResumedByScionActivityInfo(zzdf.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        m mVar = e2Var.f22696c;
        if (mVar != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
            mVar.m(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceState(a aVar, n0 n0Var, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.c(activity), n0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, n0 n0Var, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        m mVar = e2Var.f22696c;
        Bundle bundle = new Bundle();
        if (mVar != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
            mVar.n(zzdfVar, bundle);
        }
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            s7.n0 n0Var2 = this.f5780a.f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStarted(@NonNull a aVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityStartedByScionActivityInfo(zzdf.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        if (e2Var.f22696c != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStopped(@NonNull a aVar, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        onActivityStoppedByScionActivityInfo(zzdf.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        if (e2Var.f22696c != null) {
            e2 e2Var2 = this.f5780a.f22751m;
            f1.l(e2Var2);
            e2Var2.C();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void performAction(Bundle bundle, n0 n0Var, long j) throws RemoteException {
        e();
        n0Var.b(null);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void registerOnMeasurementEventListener(s0 s0Var) throws RemoteException {
        w3 w3Var;
        e();
        e eVar = this.f5781f;
        synchronized (eVar) {
            try {
                q0 q0Var = (q0) s0Var;
                Parcel N = q0Var.N(q0Var.O(), 2);
                int readInt = N.readInt();
                N.recycle();
                w3Var = (w3) eVar.get(Integer.valueOf(readInt));
                if (w3Var == null) {
                    w3Var = new w3(this, q0Var);
                    Parcel N2 = q0Var.N(q0Var.O(), 2);
                    int readInt2 = N2.readInt();
                    N2.recycle();
                    eVar.put(Integer.valueOf(readInt2), w3Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.k();
        if (e2Var.f22698e.add(w3Var)) {
            return;
        }
        s7.n0 n0Var = ((f1) e2Var.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22906i.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void resetAnalyticsData(long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.f22700g.set(null);
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new w1(e2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void retrieveAndUploadBatches(p0 p0Var) {
        j2 j2Var;
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.k();
        f1 f1Var = (f1) e2Var.f3328a;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        if (d1Var.p()) {
            s7.n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        if (Thread.currentThread() == d1Var2.f22679d) {
            s7.n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (o.f()) {
            s7.n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22903f.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        s7.n0 n0Var4 = f1Var.f22745f;
        f1.m(n0Var4);
        n0Var4.f22910n.a("[sgtm] Started client-side batch upload work.");
        boolean z5 = false;
        int i5 = 0;
        int i10 = 0;
        while (!z5) {
            s7.n0 n0Var5 = f1Var.f22745f;
            f1.m(n0Var5);
            n0Var5.f22910n.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            d1 d1Var3 = f1Var.f22746g;
            f1.m(d1Var3);
            d1Var3.t(atomicReference, 10000L, "[sgtm] Getting upload batches", new y1(e2Var, atomicReference, 6, false));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f5812a;
            if (list.isEmpty()) {
                break;
            }
            s7.n0 n0Var6 = f1Var.f22745f;
            f1.m(n0Var6);
            n0Var6.f22910n.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i5 += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.f5806c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    f0 r5 = ((f1) e2Var.f3328a).r();
                    r5.k();
                    v.h(r5.f22731g);
                    String str = r5.f22731g;
                    f1 f1Var2 = (f1) e2Var.f3328a;
                    s7.n0 n0Var7 = f1Var2.f22745f;
                    f1.m(n0Var7);
                    l0 l0Var = n0Var7.f22910n;
                    Long valueOf = Long.valueOf(zzomVar.f5804a);
                    l0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.f5806c, Integer.valueOf(zzomVar.f5805b.length));
                    if (!TextUtils.isEmpty(zzomVar.f5810g)) {
                        s7.n0 n0Var8 = f1Var2.f22745f;
                        f1.m(n0Var8);
                        n0Var8.f22910n.c(valueOf, zzomVar.f5810g, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = zzomVar.f5807d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    h2 h2Var = f1Var2.f22753o;
                    f1.m(h2Var);
                    byte[] bArr = zzomVar.f5805b;
                    g gVar = new g(e2Var, atomicReference2, zzomVar, 4);
                    h2Var.l();
                    v.h(url);
                    v.h(bArr);
                    d1 d1Var4 = ((f1) h2Var.f3328a).f22746g;
                    f1.m(d1Var4);
                    d1Var4.v(new s7.q0(h2Var, str, url, bArr, hashMap, gVar));
                    try {
                        v3 v3Var = f1Var2.f22748i;
                        f1.k(v3Var);
                        f1 f1Var3 = (f1) v3Var.f3328a;
                        f1Var3.f22749k.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    f1Var3.f22749k.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        s7.n0 n0Var9 = ((f1) e2Var.f3328a).f22745f;
                        f1.m(n0Var9);
                        n0Var9.f22906i.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    j2Var = atomicReference2.get() == null ? j2.UNKNOWN : (j2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e7) {
                    s7.n0 n0Var10 = ((f1) e2Var.f3328a).f22745f;
                    f1.m(n0Var10);
                    n0Var10.f22903f.d("[sgtm] Bad upload url for row_id", zzomVar.f5806c, Long.valueOf(zzomVar.f5804a), e7);
                    j2Var = j2.FAILURE;
                }
                if (j2Var != j2.SUCCESS) {
                    if (j2Var == j2.BACKOFF) {
                        z5 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        s7.n0 n0Var11 = f1Var.f22745f;
        f1.m(n0Var11);
        n0Var11.f22910n.c(Integer.valueOf(i5), Integer.valueOf(i10), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            p0Var.c();
        } catch (RemoteException e9) {
            f1 f1Var4 = this.f5780a;
            v.h(f1Var4);
            s7.n0 n0Var12 = f1Var4.f22745f;
            f1.m(n0Var12);
            n0Var12.f22906i.b(e9, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        e();
        if (bundle == null) {
            s7.n0 n0Var = this.f5780a.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Conditional user property must not be null");
        } else {
            e2 e2Var = this.f5780a.f22751m;
            f1.l(e2Var);
            e2Var.w(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.D(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setCurrentScreen(@NonNull a aVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        e();
        Activity activity = (Activity) b.W(aVar);
        v.h(activity);
        setCurrentScreenByScionActivityInfo(zzdf.c(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        e();
        o2 o2Var = this.f5780a.f22750l;
        f1.l(o2Var);
        f1 f1Var = (f1) o2Var.f3328a;
        if (!f1Var.f22743d.x()) {
            s7.n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22907k.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        l2 l2Var = o2Var.f22929c;
        if (l2Var == null) {
            s7.n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22907k.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = o2Var.f22932f;
        Integer valueOf = Integer.valueOf(zzdfVar.f5388a);
        if (concurrentHashMap.get(valueOf) == null) {
            s7.n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22907k.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = o2Var.q(zzdfVar.f5389b);
        }
        String str3 = l2Var.f22872b;
        String str4 = l2Var.f22871a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            s7.n0 n0Var4 = f1Var.f22745f;
            f1.m(n0Var4);
            n0Var4.f22907k.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                f1Var.f22743d.getClass();
            }
            s7.n0 n0Var5 = f1Var.f22745f;
            f1.m(n0Var5);
            n0Var5.f22907k.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                f1Var.f22743d.getClass();
            }
            s7.n0 n0Var6 = f1Var.f22745f;
            f1.m(n0Var6);
            n0Var6.f22907k.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        s7.n0 n0Var7 = f1Var.f22745f;
        f1.m(n0Var7);
        n0Var7.f22910n.c(str == null ? "null" : str, str2, "Setting current screen to name, class");
        v3 v3Var = f1Var.f22748i;
        f1.k(v3Var);
        l2 l2Var2 = new l2(v3Var.h0(), str, str2);
        concurrentHashMap.put(valueOf, l2Var2);
        o2Var.s(zzdfVar.f5389b, l2Var2, true);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDataCollectionEnabled(boolean z5) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.k();
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new v1(e2Var, z5));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new z1(e2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setEventInterceptor(s0 s0Var) throws RemoteException {
        e();
        h hVar = new h(this, s0Var);
        d1 d1Var = this.f5780a.f22746g;
        f1.m(d1Var);
        if (!d1Var.p()) {
            d1 d1Var2 = this.f5780a.f22746g;
            f1.m(d1Var2);
            d1Var2.s(new w0(6, this, hVar));
            return;
        }
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.j();
        e2Var.k();
        h hVar2 = e2Var.f22697d;
        if (hVar != hVar2) {
            v.j("EventInterceptor already set.", hVar2 == null);
        }
        e2Var.f22697d = hVar;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setInstanceIdProvider(u0 u0Var) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMeasurementEnabled(boolean z5, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        Boolean valueOf = Boolean.valueOf(z5);
        e2Var.k();
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new w0(4, e2Var, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        d1 d1Var = ((f1) e2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new w1(e2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        f1 f1Var = (f1) e2Var.f3328a;
        Uri data = intent.getData();
        if (data == null) {
            s7.n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22908l.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            s7.n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22908l.a("[sgtm] Preview Mode was not enabled.");
            f1Var.f22743d.f22690c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        s7.n0 n0Var3 = f1Var.f22745f;
        f1.m(n0Var3);
        n0Var3.f22908l.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        f1Var.f22743d.f22690c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        e();
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        f1 f1Var = (f1) e2Var.f3328a;
        if (str != null && TextUtils.isEmpty(str)) {
            s7.n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22906i.a("User ID must be non-empty or null");
        } else {
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.s(new w0(7, e2Var, str, false));
            e2Var.t(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull a aVar, boolean z5, long j) throws RemoteException {
        e();
        Object W = b.W(aVar);
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.t(str, str2, W, z5, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void unregisterOnMeasurementEventListener(s0 s0Var) throws RemoteException {
        q0 q0Var;
        w3 w3Var;
        e();
        e eVar = this.f5781f;
        synchronized (eVar) {
            q0Var = (q0) s0Var;
            Parcel N = q0Var.N(q0Var.O(), 2);
            int readInt = N.readInt();
            N.recycle();
            w3Var = (w3) eVar.remove(Integer.valueOf(readInt));
        }
        if (w3Var == null) {
            w3Var = new w3(this, q0Var);
        }
        e2 e2Var = this.f5780a.f22751m;
        f1.l(e2Var);
        e2Var.k();
        if (e2Var.f22698e.remove(w3Var)) {
            return;
        }
        s7.n0 n0Var = ((f1) e2Var.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22906i.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
    }
}
