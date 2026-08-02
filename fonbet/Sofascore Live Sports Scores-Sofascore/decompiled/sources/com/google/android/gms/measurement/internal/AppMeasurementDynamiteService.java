package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.a70;
import defpackage.bnn;
import defpackage.dbo;
import defpackage.dh0;
import defpackage.fuo;
import defpackage.gt7;
import defpackage.gvo;
import defpackage.jyo;
import defpackage.k2p;
import defpackage.n2;
import defpackage.nkn;
import defpackage.ouo;
import defpackage.pcp;
import defpackage.tto;
import defpackage.ugn;
import defpackage.vvo;
import defpackage.wh0;
import defpackage.wjn;
import defpackage.wto;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends zzco {
    public zzic a = null;
    public final dh0 b = new dh0(0);

    public final void H() {
        if (this.a != null) {
            return;
        }
        a70.r("Attempting to perform action before initialize.");
    }

    public final void S1(String str, zzcs zzcsVar) {
        H();
        zzpp zzppVar = this.a.i;
        zzic.k(zzppVar);
        zzppVar.D0(str, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        H();
        zzd zzdVar = this.a.n;
        zzic.j(zzdVar);
        zzdVar.R(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.e0(str, bundle, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearMeasurementEnabled(long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.R();
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        Object obj = null;
        zzhzVar.Z(new bnn(zzljVar, obj, false, 28));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        H();
        zzd zzdVar = this.a.n;
        zzic.j(zzdVar);
        zzdVar.S(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void generateEventId(zzcs zzcsVar) throws RemoteException {
        H();
        zzpp zzppVar = this.a.i;
        zzic.k(zzppVar);
        long O0 = zzppVar.O0();
        H();
        zzpp zzppVar2 = this.a.i;
        zzic.k(zzppVar2);
        zzppVar2.E0(zzcsVar, O0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getAppInstanceId(zzcs zzcsVar) throws RemoteException {
        H();
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new nkn(27, this, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCachedAppInstanceId(zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        S1((String) zzljVar.h.get(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) throws RemoteException {
        H();
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new n2(this, zzcsVar, str, str2, 14));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenClass(zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzmb zzmbVar = ((zzic) zzljVar.b).l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.d;
        S1(zzluVar != null ? zzluVar.b : null, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenName(zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzmb zzmbVar = ((zzic) zzljVar.b).l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.d;
        S1(zzluVar != null ? zzluVar.a : null, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getGmpAppId(zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        S1(zzljVar.f0(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getMaxUserProperties(String str, zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        Preconditions.f(str);
        zzal zzalVar = ((zzic) zzljVar.b).d;
        H();
        zzpp zzppVar = this.a.i;
        zzic.k(zzppVar);
        zzppVar.F0(zzcsVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getSessionId(zzcs zzcsVar) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new wjn(zzljVar, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getTestFlag(zzcs zzcsVar, int i) throws RemoteException {
        H();
        if (i == 0) {
            zzpp zzppVar = this.a.i;
            zzic.k(zzppVar);
            zzlj zzljVar = this.a.m;
            zzic.l(zzljVar);
            AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar = ((zzic) zzljVar.b).g;
            zzic.m(zzhzVar);
            zzppVar.D0((String) zzhzVar.a0(atomicReference, 15000L, "String test flag value", new ouo(zzljVar, atomicReference, 0)), zzcsVar);
            return;
        }
        if (i == 1) {
            zzpp zzppVar2 = this.a.i;
            zzic.k(zzppVar2);
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            zzhz zzhzVar2 = ((zzic) zzljVar2.b).g;
            zzic.m(zzhzVar2);
            zzppVar2.E0(zzcsVar, ((Long) zzhzVar2.a0(atomicReference2, 15000L, "long test flag value", new bnn(zzljVar2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            zzpp zzppVar3 = this.a.i;
            zzic.k(zzppVar3);
            zzlj zzljVar3 = this.a.m;
            zzic.l(zzljVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            zzhz zzhzVar3 = ((zzic) zzljVar3.b).g;
            zzic.m(zzhzVar3);
            double doubleValue = ((Double) zzhzVar3.a0(atomicReference3, 15000L, "double test flag value", new ouo(zzljVar3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcsVar.F(bundle);
                return;
            } catch (RemoteException e) {
                zzgu zzguVar = ((zzic) zzppVar3.b).f;
                zzic.m(zzguVar);
                zzguVar.j.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            zzpp zzppVar4 = this.a.i;
            zzic.k(zzppVar4);
            zzlj zzljVar4 = this.a.m;
            zzic.l(zzljVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            zzhz zzhzVar4 = ((zzic) zzljVar4.b).g;
            zzic.m(zzhzVar4);
            zzppVar4.F0(zzcsVar, ((Integer) zzhzVar4.a0(atomicReference4, 15000L, "int test flag value", new wto(zzljVar4, atomicReference4, 1))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        zzpp zzppVar5 = this.a.i;
        zzic.k(zzppVar5);
        zzlj zzljVar5 = this.a.m;
        zzic.l(zzljVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        zzhz zzhzVar5 = ((zzic) zzljVar5.b).g;
        zzic.m(zzhzVar5);
        zzppVar5.H0(zzcsVar, ((Boolean) zzhzVar5.a0(atomicReference5, 15000L, "boolean test flag value", new wto(zzljVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) throws RemoteException {
        H();
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new dbo(this, zzcsVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initForTests(@NonNull Map map) throws RemoteException {
        H();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j) throws RemoteException {
        zzic zzicVar = this.a;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
            Preconditions.i(context);
            this.a = zzic.r(context, zzdbVar, Long.valueOf(j), null);
        } else {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j, long j2) {
        zzic zzicVar = this.a;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
            Preconditions.i(context);
            this.a = zzic.r(context, zzdbVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void isDataCollectionEnabled(zzcs zzcsVar) throws RemoteException {
        H();
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new jyo(0, this, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.V(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcs zzcsVar, long j) throws RemoteException {
        H();
        Preconditions.f(str2);
        String str3 = true != this.a.d.b0(null, zzfy.f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), str3, j, 0L);
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new n2(this, zzcsVar, zzbhVar, str, 9));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventWithElapsedTime(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j, long j2) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.V(str, str2, bundle, z, z2, j, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        H();
        Object Z1 = iObjectWrapper == null ? null : ObjectWrapper.Z1(iObjectWrapper);
        Object Z12 = iObjectWrapper2 == null ? null : ObjectWrapper.Z1(iObjectWrapper2);
        Object Z13 = iObjectWrapper3 != null ? ObjectWrapper.Z1(iObjectWrapper3) : null;
        zzgu zzguVar = this.a.f;
        zzic.m(zzguVar);
        zzguVar.V(i, true, false, str, Z1, Z12, Z13);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityCreatedByScionActivityInfo(zzdd.Y0(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        gt7 gt7Var = zzljVar.d;
        if (gt7Var != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
            gt7Var.m(zzddVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityDestroyedByScionActivityInfo(zzdd.Y0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        gt7 gt7Var = zzljVar.d;
        if (gt7Var != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
            gt7Var.n(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityPausedByScionActivityInfo(zzdd.Y0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        gt7 gt7Var = zzljVar.d;
        if (gt7Var != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
            gt7Var.o(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityResumedByScionActivityInfo(zzdd.Y0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        gt7 gt7Var = zzljVar.d;
        if (gt7Var != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
            gt7Var.p(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcs zzcsVar, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdd.Y0(activity), zzcsVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        gt7 gt7Var = zzljVar.d;
        Bundle bundle = new Bundle();
        if (gt7Var != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
            gt7Var.q(zzddVar, bundle);
        }
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = this.a.f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityStartedByScionActivityInfo(zzdd.Y0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        if (zzljVar.d != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        onActivityStoppedByScionActivityInfo(zzdd.Y0(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        if (zzljVar.d != null) {
            zzlj zzljVar2 = this.a.m;
            zzic.l(zzljVar2);
            zzljVar2.j0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void performAction(Bundle bundle, zzcs zzcsVar, long j) throws RemoteException {
        H();
        zzcsVar.F(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void registerOnMeasurementEventListener(zzcy zzcyVar) throws RemoteException {
        Object obj;
        H();
        dh0 dh0Var = this.b;
        synchronized (dh0Var) {
            try {
                obj = (zzjq) dh0Var.get(Integer.valueOf(zzcyVar.zzf()));
                if (obj == null) {
                    obj = new k2p(this, zzcyVar);
                    dh0Var.put(Integer.valueOf(zzcyVar.zzf()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.R();
        if (zzljVar.f.add(obj)) {
            return;
        }
        zzgu zzguVar = ((zzic) zzljVar.b).f;
        zzic.m(zzguVar);
        zzguVar.j.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    @Deprecated
    public void resetAnalyticsData(long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.h.set(null);
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new tto(zzljVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.h.set(null);
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new tto(zzljVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void retrieveAndUploadBatches(zzcv zzcvVar) {
        zzlr zzlrVar;
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.R();
        zzic zzicVar = (zzic) zzljVar.b;
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        if (zzhzVar.W()) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        zzhz zzhzVar2 = zzicVar.g;
        zzic.m(zzhzVar2);
        if (Thread.currentThread() == zzhzVar2.e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean a = zzae.a();
        zzgu zzguVar3 = zzicVar.f;
        if (a) {
            zzic.m(zzguVar3);
            zzguVar3.g.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzic.m(zzguVar3);
        zzguVar3.o.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (!z2) {
            zzgu zzguVar4 = zzicVar.f;
            zzic.m(zzguVar4);
            zzguVar4.o.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar3 = zzicVar.g;
            zzic.m(zzhzVar3);
            zzhzVar3.a0(atomicReference, Ua.s, "[sgtm] Getting upload batches", new wto(zzljVar, atomicReference, 3, z));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.a;
            if (list.isEmpty()) {
                break;
            }
            zzgu zzguVar5 = zzicVar.f;
            zzic.m(zzguVar5);
            zzguVar5.o.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    zzgi q = ((zzic) zzljVar.b).q();
                    q.R();
                    Preconditions.i(q.h);
                    String str = q.h;
                    zzic zzicVar2 = (zzic) zzljVar.b;
                    zzgu zzguVar6 = zzicVar2.f;
                    zzic.m(zzguVar6);
                    zzgs zzgsVar = zzguVar6.o;
                    Long valueOf = Long.valueOf(zzomVar.a);
                    zzgsVar.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.c, Integer.valueOf(zzomVar.b.length));
                    if (!TextUtils.isEmpty(zzomVar.g)) {
                        zzgu zzguVar7 = zzicVar2.f;
                        zzic.m(zzguVar7);
                        zzguVar7.o.c(valueOf, zzomVar.g, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = zzomVar.d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    zzlo zzloVar = zzicVar2.o;
                    zzic.m(zzloVar);
                    byte[] bArr = zzomVar.b;
                    pcp pcpVar = new pcp(zzljVar, atomicReference2, zzomVar);
                    zzloVar.S();
                    Preconditions.i(url);
                    Preconditions.i(bArr);
                    zzhz zzhzVar4 = ((zzic) zzloVar.b).g;
                    zzic.m(zzhzVar4);
                    zzhzVar4.c0(new ugn(zzloVar, str, url, bArr, hashMap, pcpVar));
                    try {
                        zzpp zzppVar = zzicVar2.i;
                        zzic.k(zzppVar);
                        zzic zzicVar3 = (zzic) zzppVar.b;
                        zzicVar3.k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        synchronized (atomicReference2) {
                            for (long j2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS; atomicReference2.get() == null && j2 > 0; j2 = j - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j2);
                                    zzicVar3.k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        zzgu zzguVar8 = ((zzic) zzljVar.b).f;
                        zzic.m(zzguVar8);
                        zzguVar8.j.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    zzlrVar = atomicReference2.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    zzgu zzguVar9 = ((zzic) zzljVar.b).f;
                    zzic.m(zzguVar9);
                    zzguVar9.g.d("[sgtm] Bad upload url for row_id", zzomVar.c, Long.valueOf(zzomVar.a), e);
                    zzlrVar = zzlr.FAILURE;
                }
                if (zzlrVar != zzlr.SUCCESS) {
                    if (zzlrVar == zzlr.BACKOFF) {
                        z2 = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
        }
        zzgu zzguVar10 = zzicVar.f;
        zzic.m(zzguVar10);
        zzguVar10.o.c(Integer.valueOf(i), Integer.valueOf(i2), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            zzcvVar.zze();
        } catch (RemoteException e2) {
            zzic zzicVar4 = this.a;
            Preconditions.i(zzicVar4);
            zzgu zzguVar11 = zzicVar4.f;
            zzic.m(zzguVar11);
            zzguVar11.j.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        H();
        zzic zzicVar = this.a;
        if (bundle == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Conditional user property must not be null");
        } else {
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.d0(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.k0(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        H();
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        Preconditions.i(activity);
        setCurrentScreenByScionActivityInfo(zzdd.Y0(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) throws RemoteException {
        H();
        zzmb zzmbVar = this.a.l;
        zzic.l(zzmbVar);
        zzic zzicVar = (zzic) zzmbVar.b;
        if (!zzicVar.d.f0()) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.l.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlu zzluVar = zzmbVar.d;
        if (zzluVar == null) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.l.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = zzmbVar.g;
        Integer valueOf = Integer.valueOf(zzddVar.a);
        if (concurrentHashMap.get(valueOf) == null) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.l.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzmbVar.V(zzddVar.b);
        }
        String str3 = zzluVar.b;
        String str4 = zzluVar.a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            zzgu zzguVar4 = zzicVar.f;
            zzic.m(zzguVar4);
            zzguVar4.l.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                zzicVar.d.getClass();
            }
            zzgu zzguVar5 = zzicVar.f;
            zzic.m(zzguVar5);
            zzguVar5.l.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            zzicVar.d.getClass();
            if (length2 <= 500) {
                zzgu zzguVar6 = zzicVar.f;
                zzic.m(zzguVar6);
                zzguVar6.o.c(str == null ? "null" : str, str2, "Setting current screen to name, class");
                zzpp zzppVar = zzicVar.i;
                zzic.k(zzppVar);
                zzlu zzluVar2 = new zzlu(str, str2, zzppVar.O0());
                concurrentHashMap.put(valueOf, zzluVar2);
                zzmbVar.Y(zzddVar.b, zzluVar2, true);
                return;
            }
        }
        zzgu zzguVar7 = zzicVar.f;
        zzic.m(zzguVar7);
        zzguVar7.l.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.R();
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new wh0(zzljVar, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new fuo(zzljVar, bundle2, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setEventInterceptor(zzcy zzcyVar) throws RemoteException {
        H();
        gvo gvoVar = new gvo(this, zzcyVar);
        zzhz zzhzVar = this.a.g;
        zzic.m(zzhzVar);
        boolean W = zzhzVar.W();
        zzic zzicVar = this.a;
        if (!W) {
            zzhz zzhzVar2 = zzicVar.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Z(new bnn(this, gvoVar, r2, 29));
            return;
        }
        zzlj zzljVar = zzicVar.m;
        zzic.l(zzljVar);
        zzljVar.Q();
        zzljVar.R();
        zzjp zzjpVar = zzljVar.e;
        if (gvoVar != zzjpVar) {
            Preconditions.k("EventInterceptor already set.", zzjpVar == null);
        }
        zzljVar.e = gvoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setInstanceIdProvider(zzda zzdaVar) throws RemoteException {
        H();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        Boolean valueOf = Boolean.valueOf(z);
        zzljVar.R();
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new bnn(zzljVar, valueOf, false, 28));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMinimumSessionDuration(long j) throws RemoteException {
        H();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzhz zzhzVar = ((zzic) zzljVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new tto(zzljVar, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzic zzicVar = (zzic) zzljVar.b;
        Uri data = intent.getData();
        if (data == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.m.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.m.a("[sgtm] Preview Mode was not enabled.");
            zzicVar.d.d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        zzgu zzguVar3 = zzicVar.f;
        zzic.m(zzguVar3);
        zzguVar3.m.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        zzicVar.d.d = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        H();
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzic zzicVar = (zzic) zzljVar.b;
        if (str != null && TextUtils.isEmpty(str)) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.a("User ID must be non-empty or null");
        } else {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new vvo(0, zzljVar, str));
            zzljVar.a0(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        H();
        Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.a0(str, str2, Z1, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void unregisterOnMeasurementEventListener(zzcy zzcyVar) throws RemoteException {
        Object obj;
        H();
        dh0 dh0Var = this.b;
        synchronized (dh0Var) {
            obj = (zzjq) dh0Var.remove(Integer.valueOf(zzcyVar.zzf()));
        }
        if (obj == null) {
            obj = new k2p(this, zzcyVar);
        }
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.R();
        if (zzljVar.f.remove(obj)) {
            return;
        }
        zzgu zzguVar = ((zzic) zzljVar.b).f;
        zzic.m(zzguVar);
        zzguVar.j.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
    }
}
