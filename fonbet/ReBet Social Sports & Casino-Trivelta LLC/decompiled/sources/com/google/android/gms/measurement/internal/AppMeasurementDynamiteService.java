package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import z.C6900a;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends zzcq {

    /* renamed from: a, reason: collision with root package name */
    public C3298l3 f33281a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33282b = new C6900a();

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(@NonNull String str, long j10) {
        c();
        this.f33281a.M().i(str, j10);
    }

    public final void c() {
        if (this.f33281a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        c();
        this.f33281a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j10) {
        c();
        this.f33281a.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(@NonNull String str, long j10) {
        c();
        this.f33281a.M().j(str, j10);
    }

    public final void g(zzcu zzcuVar, String str) {
        c();
        this.f33281a.C().a0(zzcuVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(zzcu zzcuVar) {
        c();
        long p02 = this.f33281a.C().p0();
        c();
        this.f33281a.C().b0(zzcuVar, p02);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(zzcu zzcuVar) {
        c();
        this.f33281a.b().t(new RunnableC3242e3(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(zzcu zzcuVar) {
        c();
        g(zzcuVar, this.f33281a.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) {
        c();
        this.f33281a.b().t(new RunnableC3316n5(this, zzcuVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(zzcu zzcuVar) {
        c();
        g(zzcuVar, this.f33281a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(zzcu zzcuVar) {
        c();
        g(zzcuVar, this.f33281a.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(zzcu zzcuVar) {
        c();
        g(zzcuVar, this.f33281a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, zzcu zzcuVar) {
        c();
        this.f33281a.B().L(str);
        c();
        this.f33281a.C().c0(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(zzcu zzcuVar) {
        c();
        W4 B10 = this.f33281a.B();
        B10.f33578a.b().t(new RunnableC3386w4(B10, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(zzcu zzcuVar, int i10) {
        c();
        if (i10 == 0) {
            this.f33281a.C().a0(zzcuVar, this.f33281a.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f33281a.C().b0(zzcuVar, this.f33281a.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f33281a.C().c0(zzcuVar, this.f33281a.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f33281a.C().e0(zzcuVar, this.f33281a.B().i0().booleanValue());
                return;
            }
        }
        b7 C10 = this.f33281a.C();
        double doubleValue = this.f33281a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            C10.f33578a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z10, zzcu zzcuVar) {
        c();
        this.f33281a.b().t(new RunnableC3291k4(this, zzcuVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(@NonNull Map map) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initialize(N9.b bVar, zzdd zzddVar, long j10) {
        C3298l3 c3298l3 = this.f33281a;
        if (c3298l3 == null) {
            this.f33281a = C3298l3.O((Context) AbstractC3191o.m((Context) N9.d.g(bVar)), zzddVar, Long.valueOf(j10));
        } else {
            c3298l3.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(zzcu zzcuVar) {
        c();
        this.f33281a.b().t(new N5(this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) {
        c();
        this.f33281a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j10) {
        c();
        AbstractC3191o.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f33281a.b().t(new J3(this, zzcuVar, new zzbg(str2, new zzbe(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i10, @NonNull String str, @NonNull N9.b bVar, @NonNull N9.b bVar2, @NonNull N9.b bVar3) {
        c();
        this.f33281a.a().y(i10, true, false, str, bVar == null ? null : N9.d.g(bVar), bVar2 == null ? null : N9.d.g(bVar2), bVar3 != null ? N9.d.g(bVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(@NonNull N9.b bVar, @NonNull Bundle bundle, long j10) {
        c();
        onActivityCreatedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        c();
        I4 i42 = this.f33281a.B().f33720c;
        if (i42 != null) {
            this.f33281a.B().h0();
            i42.e(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(@NonNull N9.b bVar, long j10) {
        c();
        onActivityDestroyedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) {
        c();
        I4 i42 = this.f33281a.B().f33720c;
        if (i42 != null) {
            this.f33281a.B().h0();
            i42.b(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(@NonNull N9.b bVar, long j10) {
        c();
        onActivityPausedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) {
        c();
        I4 i42 = this.f33281a.B().f33720c;
        if (i42 != null) {
            this.f33281a.B().h0();
            i42.a(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(@NonNull N9.b bVar, long j10) {
        c();
        onActivityResumedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) {
        c();
        I4 i42 = this.f33281a.B().f33720c;
        if (i42 != null) {
            this.f33281a.B().h0();
            i42.d(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(N9.b bVar, zzcu zzcuVar, long j10) {
        c();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), zzcuVar, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j10) {
        c();
        I4 i42 = this.f33281a.B().f33720c;
        Bundle bundle = new Bundle();
        if (i42 != null) {
            this.f33281a.B().h0();
            i42.c(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33281a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(@NonNull N9.b bVar, long j10) {
        c();
        onActivityStartedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) {
        c();
        if (this.f33281a.B().f33720c != null) {
            this.f33281a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(@NonNull N9.b bVar, long j10) {
        c();
        onActivityStoppedByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) {
        c();
        if (this.f33281a.B().f33720c != null) {
            this.f33281a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, zzcu zzcuVar, long j10) {
        c();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC3211a4 interfaceC3211a4;
        c();
        Map map = this.f33282b;
        synchronized (map) {
            try {
                interfaceC3211a4 = (InterfaceC3211a4) map.get(Integer.valueOf(zzdaVar.zzf()));
                if (interfaceC3211a4 == null) {
                    interfaceC3211a4 = new c7(this, zzdaVar);
                    map.put(Integer.valueOf(zzdaVar.zzf()), interfaceC3211a4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f33281a.B().J(interfaceC3211a4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j10) {
        c();
        this.f33281a.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(final zzcx zzcxVar) {
        c();
        this.f33281a.B().r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.o6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcxVar.zze();
                } catch (RemoteException e10) {
                    ((C3298l3) AbstractC3191o.m(AppMeasurementDynamiteService.this.f33281a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) {
        c();
        if (bundle == null) {
            this.f33281a.a().o().a("Conditional user property must not be null");
        } else {
            this.f33281a.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(@NonNull Bundle bundle, long j10) {
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) {
        c();
        this.f33281a.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(@NonNull N9.b bVar, @NonNull String str, @NonNull String str2, long j10) {
        c();
        setCurrentScreenByScionActivityInfo(zzdf.zza((Activity) AbstractC3191o.m((Activity) N9.d.g(bVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) {
        c();
        this.f33281a.I().t(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z10) {
        c();
        W4 B10 = this.f33281a.B();
        B10.j();
        B10.f33578a.b().t(new RunnableC3275i4(B10, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        c();
        final W4 B10 = this.f33281a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        B10.f33578a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.R4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                W4.this.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(zzda zzdaVar) {
        c();
        L6 l62 = new L6(this, zzdaVar);
        if (this.f33281a.b().p()) {
            this.f33281a.B().I(l62);
        } else {
            this.f33281a.b().t(new K4(this, l62));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(zzdc zzdcVar) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z10, long j10) {
        c();
        this.f33281a.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j10) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j10) {
        c();
        W4 B10 = this.f33281a.B();
        B10.f33578a.b().t(new RunnableC3299l4(B10, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(@NonNull Intent intent) {
        c();
        W4 B10 = this.f33281a.B();
        Uri data = intent.getData();
        if (data == null) {
            B10.f33578a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C3298l3 c3298l3 = B10.f33578a;
            c3298l3.a().u().a("[sgtm] Preview Mode was not enabled.");
            c3298l3.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C3298l3 c3298l32 = B10.f33578a;
            c3298l32.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c3298l32.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(@NonNull final String str, long j10) {
        c();
        final W4 B10 = this.f33281a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            B10.f33578a.a().r().a("User ID must be non-empty or null");
        } else {
            B10.f33578a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.S4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C3298l3 c3298l3 = W4.this.f33578a;
                    if (c3298l3.L().x(str)) {
                        c3298l3.L().p();
                    }
                }
            });
            B10.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull N9.b bVar, boolean z10, long j10) {
        c();
        this.f33281a.B().z(str, str2, N9.d.g(bVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC3211a4 interfaceC3211a4;
        c();
        Map map = this.f33282b;
        synchronized (map) {
            interfaceC3211a4 = (InterfaceC3211a4) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (interfaceC3211a4 == null) {
            interfaceC3211a4 = new c7(this, zzdaVar);
        }
        this.f33281a.B().K(interfaceC3211a4);
    }
}
