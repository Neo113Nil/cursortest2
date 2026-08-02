package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import xsna.af01;
import xsna.bbq;
import xsna.bf01;
import xsna.bq70;
import xsna.c2f0;
import xsna.dg01;
import xsna.dtx0;
import xsna.dyu;
import xsna.exc0;
import xsna.fh9;
import xsna.gd01;
import xsna.hd01;
import xsna.hl01;
import xsna.icu;
import xsna.je01;
import xsna.k901;
import xsna.kb01;
import xsna.kg01;
import xsna.ma01;
import xsna.mb01;
import xsna.me01;
import xsna.ni01;
import xsna.nn01;
import xsna.qe01;
import xsna.se01;
import xsna.sk01;
import xsna.te01;
import xsna.ue01;
import xsna.ve01;
import xsna.vnv;
import xsna.wg01;
import xsna.xj01;
import xsna.ye01;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
@DynamiteApi
/* loaded from: classes13.dex */
public class AppMeasurementDynamiteService extends zzcb {

    @VisibleForTesting
    public mb01 a = null;
    public final zk3 b = new zk3();

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        f();
        this.a.m().l(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.l();
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new ve01(bf01Var, null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        f();
        this.a.m().m(j, str);
    }

    public final void f() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void g(String str, zzcf zzcfVar) {
        f();
        sk01 sk01Var = this.a.m;
        mb01.i(sk01Var);
        sk01Var.H(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcfVar) throws RemoteException {
        f();
        sk01 sk01Var = this.a.m;
        mb01.i(sk01Var);
        long j0 = sk01Var.j0();
        f();
        sk01 sk01Var2 = this.a.m;
        mb01.i(sk01Var2);
        sk01Var2.G(zzcfVar, j0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        f();
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.s(new dyu(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        g(bf01Var.D(), zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        f();
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.s(new hl01(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        kg01 kg01Var = ((mb01) bf01Var.b).p;
        mb01.j(kg01Var);
        dg01 dg01Var = kg01Var.f;
        g(dg01Var != null ? dg01Var.b : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        kg01 kg01Var = ((mb01) bf01Var.b).p;
        mb01.j(kg01Var);
        dg01 dg01Var = kg01Var.f;
        g(dg01Var != null ? dg01Var.a : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        mb01 mb01Var = (mb01) bf01Var.b;
        String str = mb01Var.c;
        if (str == null) {
            try {
                str = bbq.d(mb01Var.b, mb01Var.t);
            } catch (IllegalStateException e) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.i.b(e, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        g(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        exc0.f(str);
        ((mb01) bf01Var.b).getClass();
        f();
        sk01 sk01Var = this.a.m;
        mb01.i(sk01Var);
        sk01Var.F(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(zzcf zzcfVar) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new se01(bf01Var, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcfVar, int i) throws RemoteException {
        f();
        if (i == 0) {
            sk01 sk01Var = this.a.m;
            mb01.i(sk01Var);
            bf01 bf01Var = this.a.q;
            mb01.j(bf01Var);
            AtomicReference atomicReference = new AtomicReference();
            kb01 kb01Var = ((mb01) bf01Var.b).k;
            mb01.k(kb01Var);
            sk01Var.H((String) kb01Var.p(atomicReference, 15000L, "String test flag value", new icu(bf01Var, atomicReference)), zzcfVar);
            return;
        }
        if (i == 1) {
            sk01 sk01Var2 = this.a.m;
            mb01.i(sk01Var2);
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            kb01 kb01Var2 = ((mb01) bf01Var2.b).k;
            mb01.k(kb01Var2);
            sk01Var2.G(zzcfVar, ((Long) kb01Var2.p(atomicReference2, 15000L, "long test flag value", new te01(bf01Var2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            sk01 sk01Var3 = this.a.m;
            mb01.i(sk01Var3);
            bf01 bf01Var3 = this.a.q;
            mb01.j(bf01Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            kb01 kb01Var3 = ((mb01) bf01Var3.b).k;
            mb01.k(kb01Var3);
            double doubleValue = ((Double) kb01Var3.p(atomicReference3, 15000L, "double test flag value", new dtx0(bf01Var3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcfVar.zze(bundle);
                return;
            } catch (RemoteException e) {
                k901 k901Var = ((mb01) sk01Var3.b).j;
                mb01.k(k901Var);
                k901Var.l.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            sk01 sk01Var4 = this.a.m;
            mb01.i(sk01Var4);
            bf01 bf01Var4 = this.a.q;
            mb01.j(bf01Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            kb01 kb01Var4 = ((mb01) bf01Var4.b).k;
            mb01.k(kb01Var4);
            sk01Var4.F(zzcfVar, ((Integer) kb01Var4.p(atomicReference4, 15000L, "int test flag value", new ue01(0, bf01Var4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        sk01 sk01Var5 = this.a.m;
        mb01.i(sk01Var5);
        bf01 bf01Var5 = this.a.q;
        mb01.j(bf01Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        kb01 kb01Var5 = ((mb01) bf01Var5.b).k;
        mb01.k(kb01Var5);
        sk01Var5.B(zzcfVar, ((Boolean) kb01Var5.p(atomicReference5, 15000L, "boolean test flag value", new qe01(bf01Var5, atomicReference5))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) throws RemoteException {
        f();
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.s(new ni01(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(vnv vnvVar, zzcl zzclVar, long j) throws RemoteException {
        mb01 mb01Var = this.a;
        if (mb01Var == null) {
            Context context = (Context) bq70.g(vnvVar);
            exc0.i(context);
            this.a = mb01.r(context, zzclVar, Long.valueOf(j));
        } else {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.l.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        f();
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.s(new ma01(2, this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.q(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        f();
        exc0.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        zzaw zzawVar = new zzaw(str2, new zzau(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j);
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.s(new wg01(this, zzcfVar, zzawVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, @NonNull String str, @NonNull vnv vnvVar, @NonNull vnv vnvVar2, @NonNull vnv vnvVar3) throws RemoteException {
        f();
        Object g = vnvVar == null ? null : bq70.g(vnvVar);
        Object g2 = vnvVar2 == null ? null : bq70.g(vnvVar2);
        Object g3 = vnvVar3 != null ? bq70.g(vnvVar3) : null;
        k901 k901Var = this.a.j;
        mb01.k(k901Var);
        k901Var.v(i, true, false, str, g, g2, g3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull vnv vnvVar, @NonNull Bundle bundle, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        af01 af01Var = bf01Var.f;
        if (af01Var != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
            af01Var.onActivityCreated((Activity) bq70.g(vnvVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull vnv vnvVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        af01 af01Var = bf01Var.f;
        if (af01Var != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
            af01Var.onActivityDestroyed((Activity) bq70.g(vnvVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull vnv vnvVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        af01 af01Var = bf01Var.f;
        if (af01Var != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
            af01Var.onActivityPaused((Activity) bq70.g(vnvVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull vnv vnvVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        af01 af01Var = bf01Var.f;
        if (af01Var != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
            af01Var.onActivityResumed((Activity) bq70.g(vnvVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(vnv vnvVar, zzcf zzcfVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        af01 af01Var = bf01Var.f;
        Bundle bundle = new Bundle();
        if (af01Var != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
            af01Var.onActivitySaveInstanceState((Activity) bq70.g(vnvVar), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = this.a.j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull vnv vnvVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        if (bf01Var.f != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull vnv vnvVar, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        if (bf01Var.f != null) {
            bf01 bf01Var2 = this.a.q;
            mb01.j(bf01Var2);
            bf01Var2.p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, zzcf zzcfVar, long j) throws RemoteException {
        f();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Object obj;
        f();
        synchronized (this.b) {
            try {
                obj = (hd01) this.b.get(Integer.valueOf(zzciVar.zzd()));
                if (obj == null) {
                    obj = new nn01(this, zzciVar);
                    this.b.put(Integer.valueOf(zzciVar.zzd()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.l();
        if (bf01Var.h.add(obj)) {
            return;
        }
        k901 k901Var = ((mb01) bf01Var.b).j;
        mb01.k(k901Var);
        k901Var.l.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.j.set(null);
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new me01(bf01Var, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        f();
        if (bundle == null) {
            k901 k901Var = this.a.j;
            mb01.k(k901Var);
            k901Var.i.a("Conditional user property must not be null");
        } else {
            bf01 bf01Var = this.a.q;
            mb01.j(bf01Var);
            bf01Var.v(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        f();
        final bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.t(new Runnable() { // from class: xsna.jd01
            @Override // java.lang.Runnable
            public final void run() {
                bf01 bf01Var2 = bf01.this;
                if (TextUtils.isEmpty(((mb01) bf01Var2.b).o().p())) {
                    bf01Var2.w(bundle, 0, j);
                    return;
                }
                k901 k901Var = ((mb01) bf01Var2.b).j;
                mb01.k(k901Var);
                k901Var.n.a("Using developer consent only; google app id found");
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.w(bundle, -20, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r4.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r5.length() <= 100) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreen(@NonNull vnv vnvVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        f();
        kg01 kg01Var = this.a.p;
        mb01.j(kg01Var);
        Activity activity = (Activity) bq70.g(vnvVar);
        if (!((mb01) kg01Var.b).h.v()) {
            k901 k901Var = ((mb01) kg01Var.b).j;
            mb01.k(k901Var);
            k901Var.n.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        dg01 dg01Var = kg01Var.f;
        if (dg01Var == null) {
            k901 k901Var2 = ((mb01) kg01Var.b).j;
            mb01.k(k901Var2);
            k901Var2.n.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (kg01Var.i.get(activity) == null) {
            k901 k901Var3 = ((mb01) kg01Var.b).j;
            mb01.k(k901Var3);
            k901Var3.n.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = kg01Var.r(activity.getClass());
        }
        boolean f = c2f0.f(dg01Var.b, str2);
        boolean f2 = c2f0.f(dg01Var.a, str);
        if (f && f2) {
            k901 k901Var4 = ((mb01) kg01Var.b).j;
            mb01.k(k901Var4);
            k901Var4.n.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                ((mb01) kg01Var.b).getClass();
            }
            k901 k901Var5 = ((mb01) kg01Var.b).j;
            mb01.k(k901Var5);
            k901Var5.n.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                ((mb01) kg01Var.b).getClass();
            }
            k901 k901Var6 = ((mb01) kg01Var.b).j;
            mb01.k(k901Var6);
            k901Var6.n.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        k901 k901Var7 = ((mb01) kg01Var.b).j;
        mb01.k(k901Var7);
        k901Var7.q.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        sk01 sk01Var = ((mb01) kg01Var.b).m;
        mb01.i(sk01Var);
        dg01 dg01Var2 = new dg01(str, str2, sk01Var.j0());
        kg01Var.i.put(activity, dg01Var2);
        kg01Var.u(activity, dg01Var2, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.l();
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new ye01(bf01Var, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        f();
        final bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new Runnable() { // from class: xsna.kd01
            @Override // java.lang.Runnable
            public final void run() {
                bf01 bf01Var2 = bf01.this;
                com.vk.movika.sdk.base.asset.b bVar = bf01Var2.s;
                mb01 mb01Var = (mb01) bf01Var2.b;
                Bundle bundle3 = bundle2;
                if (bundle3 == null) {
                    x901 x901Var = mb01Var.i;
                    mb01.i(x901Var);
                    x901Var.z.b(new Bundle());
                    return;
                }
                x901 x901Var2 = mb01Var.i;
                sk01 sk01Var = mb01Var.m;
                k901 k901Var = mb01Var.j;
                mb01.i(x901Var2);
                Bundle a = x901Var2.z.a();
                for (String str : bundle3.keySet()) {
                    Object obj = bundle3.get(str);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        mb01.i(sk01Var);
                        if (sk01.R(obj)) {
                            sk01.z(bVar, null, 27, null, null, 0);
                        }
                        mb01.k(k901Var);
                        k901Var.n.c("Invalid default event parameter type. Name, value", str, obj);
                    } else if (sk01.T(str)) {
                        mb01.k(k901Var);
                        k901Var.n.b(str, "Invalid default event parameter name. Name");
                    } else if (obj == null) {
                        a.remove(str);
                    } else {
                        mb01.i(sk01Var);
                        if (sk01Var.N("param", str, obj, 100)) {
                            sk01Var.A(str, a, obj);
                        }
                    }
                }
                mb01.i(sk01Var);
                int n = mb01Var.h.n();
                if (a.size() > n) {
                    Iterator it = new TreeSet(a.keySet()).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        i++;
                        if (i > n) {
                            a.remove(str2);
                        }
                    }
                    mb01.i(sk01Var);
                    sk01.z(bVar, null, 26, null, null, 0);
                    mb01.k(k901Var);
                    k901Var.n.a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                x901 x901Var3 = mb01Var.i;
                mb01.i(x901Var3);
                x901Var3.z.b(a);
                yh01 s = mb01Var.s();
                s.k();
                s.l();
                s.w(new og01(s, s.t(false), a));
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzciVar) throws RemoteException {
        f();
        fh9 fh9Var = new fh9(this, zzciVar);
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        if (!kb01Var.u()) {
            kb01 kb01Var2 = this.a.k;
            mb01.k(kb01Var2);
            kb01Var2.s(new xj01(this, fh9Var));
            return;
        }
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.k();
        bf01Var.l();
        gd01 gd01Var = bf01Var.g;
        if (fh9Var != gd01Var) {
            exc0.k("EventInterceptor already set.", gd01Var == null);
        }
        bf01Var.g = fh9Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        Boolean valueOf = Boolean.valueOf(z);
        bf01Var.l();
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new ve01(bf01Var, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        f();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        f();
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        kb01 kb01Var = ((mb01) bf01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new je01(bf01Var, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        f();
        final bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        mb01 mb01Var = (mb01) bf01Var.b;
        if (str != null && TextUtils.isEmpty(str)) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.l.a("User ID must be non-empty or null");
        } else {
            kb01 kb01Var = mb01Var.k;
            mb01.k(kb01Var);
            kb01Var.s(new Runnable() { // from class: xsna.ld01
                @Override // java.lang.Runnable
                public final void run() {
                    bf01 bf01Var2 = bf01.this;
                    w701 o = ((mb01) bf01Var2.b).o();
                    String str2 = o.s;
                    String str3 = str;
                    boolean z = false;
                    if (str2 != null && !str2.equals(str3)) {
                        z = true;
                    }
                    o.s = str3;
                    if (z) {
                        ((mb01) bf01Var2.b).o().q();
                    }
                }
            });
            bf01Var.z(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull vnv vnvVar, boolean z, long j) throws RemoteException {
        f();
        Object g = bq70.g(vnvVar);
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.z(str, str2, g, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Object obj;
        f();
        synchronized (this.b) {
            obj = (hd01) this.b.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (obj == null) {
            obj = new nn01(this, zzciVar);
        }
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.l();
        if (bf01Var.h.remove(obj)) {
            return;
        }
        k901 k901Var = ((mb01) bf01Var.b).j;
        mb01.k(k901Var);
        k901Var.l.a("OnEventListener had not been registered");
    }
}
