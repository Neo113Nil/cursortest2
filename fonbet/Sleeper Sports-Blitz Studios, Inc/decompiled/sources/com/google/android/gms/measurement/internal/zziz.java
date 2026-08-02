package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzin;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zziz extends zzg {
    final zzt zza;
    private zzki zzb;
    private zziv zzc;
    private final Set<zziu> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzav zzj;
    private PriorityQueue<zzmu> zzk;
    private zzin zzl;
    private final AtomicLong zzm;
    private long zzn;
    private boolean zzo;
    private zzav zzp;
    private SharedPreferences.OnSharedPreferenceChangeListener zzq;
    private zzav zzr;
    private final zzns zzs;

    public static int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzz() {
        return false;
    }

    public final Application.ActivityLifecycleCallbacks zzaa() {
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzad zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzae zze() {
        return super.zze();
    }

    public final zzal zzab() {
        zzt();
        return zzo().zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzft zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzfv zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzgl zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzhg zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzlb zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzml zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, 15000L, "boolean test flag value", new zzjj(this, atomicReference));
    }

    public final Double zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, 15000L, "double test flag value", new zzkf(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, 15000L, "int test flag value", new zzkc(this, atomicReference));
    }

    public final Long zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, 15000L, "long test flag value", new zzkd(this, atomicReference));
    }

    public final String zzag() {
        return this.zzf.get();
    }

    public final String zzah() {
        zzkt zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzai() {
        zzkt zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhd(zza(), this.zzu.zzx()).zza("google_app_id");
        } catch (IllegalStateException e) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final String zzak() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, 15000L, "String test flag value", new zzjs(this, atomicReference));
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zzad.zza()) {
            zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get conditional user properties", new zzjz(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return zznt.zzb((List<zzac>) list);
    }

    public final List<zzno> zza(boolean z) {
        zzu();
        zzj().zzp().zza("Getting user properties (FE)");
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        if (zzad.zza()) {
            zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzjt(this, atomicReference, z));
        List<zzno> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.EMPTY_LIST;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (zzad.zza()) {
            zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzjy(this, atomicReference, null, str, str2, z));
        List<zzno> list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzno zznoVar : list) {
            Object zza = zznoVar.zza();
            if (zza != null) {
                arrayMap.put(zznoVar.zza, zza);
            }
        }
        return arrayMap;
    }

    final PriorityQueue<zzmu> zzal() {
        if (this.zzk == null) {
            this.zzk = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zziy
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((zzmu) obj).zzb);
                    return valueOf;
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzjb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.zzk;
    }

    static /* synthetic */ void zza(zziz zzizVar, Bundle bundle) {
        zzizVar.zzt();
        zzizVar.zzu();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzizVar.zzu.zzac()) {
            zzizVar.zzj().zzp().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzizVar.zzo().zza(new zzac(bundle.getString("app_id"), "", new zzno(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean("active"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzizVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void zza(zziz zzizVar, zzin zzinVar, zzin zzinVar2) {
        if (com.google.android.gms.internal.measurement.zznh.zza() && zzizVar.zze().zza(zzbh.zzdb)) {
            return;
        }
        boolean zza = zzinVar.zza(zzinVar2, zzin.zza.ANALYTICS_STORAGE, zzin.zza.AD_STORAGE);
        boolean zzb = zzinVar.zzb(zzinVar2, zzin.zza.ANALYTICS_STORAGE, zzin.zza.AD_STORAGE);
        if (zza || zzb) {
            zzizVar.zzg().zzag();
        }
    }

    static /* synthetic */ void zzb(zziz zzizVar, Bundle bundle) {
        zzizVar.zzt();
        zzizVar.zzu();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzizVar.zzu.zzac()) {
            zzizVar.zzj().zzp().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzno zznoVar = new zzno(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            zzbf zza = zzizVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzizVar.zzo().zza(new zzac(bundle.getString("app_id"), string2, zznoVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzizVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzizVar.zzq().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void zza(zziz zzizVar, zzin zzinVar, long j, boolean z, boolean z2) {
        zzizVar.zzt();
        zzizVar.zzu();
        zzin zzn = zzizVar.zzk().zzn();
        if (j <= zzizVar.zzn && zzin.zza(zzn.zza(), zzinVar.zza())) {
            zzizVar.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zzinVar);
            return;
        }
        if (zzizVar.zzk().zza(zzinVar)) {
            zzizVar.zzj().zzp().zza("Setting storage consent. consent", zzinVar);
            zzizVar.zzn = j;
            if (zzizVar.zze().zza(zzbh.zzcl) && zzizVar.zzo().zzan()) {
                zzizVar.zzo().zzb(z);
            } else {
                zzizVar.zzo().zza(z);
            }
            if (z2) {
                zzizVar.zzo().zza(new AtomicReference<>());
                return;
            }
            return;
        }
        zzizVar.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzinVar.zza()));
    }

    static /* synthetic */ void zzb(zziz zzizVar, int i) {
        if (zzizVar.zzj == null) {
            zzizVar.zzj = new zzjk(zzizVar, zzizVar.zzu);
        }
        zzizVar.zzj.zza(i * 1000);
    }

    protected zziz(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzo = true;
        this.zzs = new zzka(this);
        this.zzf = new AtomicReference<>();
        this.zzl = zzin.zza;
        this.zzn = -1L;
        this.zzm = new AtomicLong(0L);
        this.zza = new zzt(zzhjVar);
    }

    public final void zzam() {
        zzt();
        zzu();
        if (this.zzu.zzaf()) {
            Boolean zzf = zze().zzf("google_analytics_deferred_deep_link_enabled");
            if (zzf != null && zzf.booleanValue()) {
                zzj().zzc().zza("Deferred Deep Link feature enabled.");
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzje
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziz.this.zzap();
                    }
                });
            }
            zzo().zzac();
            this.zzo = false;
            String zzw = zzk().zzw();
            if (TextUtils.isEmpty(zzw)) {
                return;
            }
            zzf().zzac();
            if (zzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzw);
            zzc("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zza(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzl().zzb(new zzjw(this, bundle2));
    }

    public final void zzan() {
        if (!(zza().getApplicationContext() instanceof Application) || this.zzb == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzb);
    }

    final void zzao() {
        if (zzpd.zza() && zze().zza(zzbh.zzcc)) {
            if (zzl().zzg()) {
                zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzad.zza()) {
                zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzu();
            zzj().zzp().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().zza(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
                @Override // java.lang.Runnable
                public final void run() {
                    zziz.this.zza(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get trigger URIs");
            } else {
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zziz.this.zza(list);
                    }
                });
            }
        }
    }

    public final void zzap() {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzk().zzp.zza();
        zzk().zzp.zza(1 + zza);
        if (zza >= 5) {
            zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzk().zzo.zza(true);
        } else {
            if (this.zzp == null) {
                this.zzp = new zzjv(this, this.zzu);
            }
            this.zzp.zza(0L);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdd zzddVar) throws RemoteException {
        zzl().zzb(new zzkb(this, zzddVar));
    }

    public final void zzaq() {
        zzt();
        zzj().zzc().zza("Handle tcf update.");
        zzms zza = zzms.zza(zzk().zzc());
        zzj().zzp().zza("Tcf preferences read", zza);
        if (zzk().zza(zza)) {
            Bundle zza2 = zza.zza();
            zzj().zzp().zza("Consent generated from Tcf", zza2);
            if (zza2 != Bundle.EMPTY) {
                zza(zza2, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", zza.zzb());
            zzc("auto", "_tcf", bundle);
        }
    }

    final /* synthetic */ void zza(AtomicReference atomicReference) {
        Bundle zza = zzk().zzi.zza();
        zzlb zzo = zzo();
        if (zza == null) {
            zza = new Bundle();
        }
        zzo.zza((AtomicReference<List<zzmu>>) atomicReference, zza);
    }

    final /* synthetic */ void zza(List list) {
        boolean contains;
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> zzh = zzk().zzh();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmu zzmuVar = (zzmu) it.next();
                contains = zzh.contains(zzmuVar.zzc);
                if (!contains || zzh.get(zzmuVar.zzc).longValue() < zzmuVar.zzb) {
                    zzal().add(zzmuVar);
                }
            }
            zzar();
        }
    }

    final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
            ((zzav) Preconditions.checkNotNull(this.zzr)).zza(500L);
        }
    }

    final /* synthetic */ void zza(Bundle bundle, long j) {
        if (TextUtils.isEmpty(zzg().zzae())) {
            zza(bundle, 0, j);
        } else {
            zzj().zzv().zza("Using developer consent only; google app id found");
        }
    }

    final /* synthetic */ void zza(Bundle bundle) {
        if (bundle == null) {
            zzk().zzt.zza(new Bundle());
            return;
        }
        Bundle zza = zzk().zzt.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzq();
                if (zznt.zza(obj)) {
                    zzq();
                    zznt.zza(this.zzs, 27, (String) null, (String) null, 0);
                }
                zzj().zzv().zza("Invalid default event parameter type. Name, value", str, obj);
            } else if (zznt.zzg(str)) {
                zzj().zzv().zza("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else if (zzq().zza("param", str, zze().zza((String) null, false), obj)) {
                zzq().zza(zza, str, obj);
            }
        }
        zzq();
        if (zznt.zza(zza, zze().zzg())) {
            zzq();
            zznt.zza(this.zzs, 26, (String) null, (String) null, 0);
            zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzk().zzt.zza(zza);
        zzo().zza(zza);
    }

    final /* synthetic */ void zzb(String str) {
        if (zzg().zzb(str)) {
            zzg().zzag();
        }
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = App.TYPE;
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzn().zza(bundle2, j);
        } else {
            zzb(str3, str2, j, bundle2, z2, !z2 || this.zzc == null || zznt.zzg(str2), z, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zza(String str, String str2, Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, j);
    }

    final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    final void zza(String str, String str2, long j, Bundle bundle) {
        zzt();
        zza(str, str2, j, bundle, true, this.zzc == null || zznt.zzg(str2), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zziz zzizVar;
        zzkt zza;
        boolean z4;
        long j2;
        boolean zza2;
        long j3;
        String str4;
        int length;
        zznt zzt;
        int i;
        String str5;
        Class<?> cls;
        zziz zzizVar2 = this;
        String str6 = str;
        Preconditions.checkNotEmpty(str6);
        Preconditions.checkNotNull(bundle);
        zzizVar2.zzt();
        zzizVar2.zzu();
        if (!zzizVar2.zzu.zzac()) {
            zzizVar2.zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzaf = zzizVar2.zzg().zzaf();
        if (zzaf != null && !zzaf.contains(str2)) {
            zzizVar2.zzj().zzc().zza("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        if (!zzizVar2.zze) {
            zzizVar2.zze = true;
            try {
                if (!zzizVar2.zzu.zzag()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zzizVar2.zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zzizVar2.zza());
                } catch (Exception e) {
                    zzizVar2.zzj().zzu().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzizVar2.zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            if (bundle.containsKey("gclid")) {
                zzizVar2.zza("auto", "_lgclid", bundle.getString("gclid"), zzizVar2.zzb().currentTimeMillis());
                if (zze().zza(zzbh.zzbl)) {
                    zza("auto", "_dl_gclid", bundle.getString("gclid"), zzb().currentTimeMillis());
                }
            }
            if (zzok.zza() && zze().zza(zzbh.zzco) && bundle.containsKey("gbraid")) {
                if (zze().zza(zzbh.zzcq)) {
                    str5 = "_dl_gbraid";
                } else {
                    str5 = "_gbraid";
                }
                zzizVar2 = this;
                zzizVar2.zza("auto", str5, bundle.getString("gbraid"), zzb().currentTimeMillis());
            } else {
                zzizVar = this;
                if (z && zznt.zzj(str2)) {
                    zzizVar.zzq().zza(bundle, zzizVar.zzk().zzt.zza());
                }
                if (!z3 && !"_iap".equals(str2)) {
                    zzt = zzizVar.zzu.zzt();
                    i = 2;
                    if (zzt.zzc("event", str2)) {
                        if (!zzt.zza("event", zzir.zza, zzir.zzb, str2)) {
                            i = 13;
                        } else if (zzt.zza("event", 40, str2)) {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        zzizVar.zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzizVar.zzi().zza(str2));
                        zzizVar.zzu.zzt();
                        String zza3 = zznt.zza(str2, 40, true);
                        length = str2 != null ? str2.length() : 0;
                        zzizVar.zzu.zzt();
                        zznt.zza(zzizVar.zzs, i, "_ev", zza3, length);
                        return;
                    }
                }
                zza = zzizVar.zzn().zza(false);
                if (zza != null && !bundle.containsKey("_sc")) {
                    zza.zzd = true;
                }
                zznt.zza(zza, bundle, (z || z3) ? false : true);
                boolean equals = "am".equals(str6);
                boolean zzg = zznt.zzg(str2);
                if (!z && zzizVar.zzc != null && !zzg && !equals) {
                    zzizVar.zzj().zzc().zza("Passing event to registered event handler (FE)", zzizVar.zzi().zza(str2), zzizVar.zzi().zza(bundle));
                    Preconditions.checkNotNull(zzizVar.zzc);
                    zzizVar.zzc.interceptEvent(str6, str2, bundle, j);
                    return;
                }
                long j4 = j;
                if (zzizVar.zzu.zzaf()) {
                    return;
                }
                int zza4 = zzizVar.zzq().zza(str2);
                if (zza4 != 0) {
                    zzizVar.zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", zzizVar.zzi().zza(str2));
                    zzizVar.zzq();
                    String zza5 = zznt.zza(str2, 40, true);
                    length = str2 != null ? str2.length() : 0;
                    zzizVar.zzu.zzt();
                    zznt.zza(zzizVar.zzs, str3, zza4, "_ev", zza5, length);
                    return;
                }
                Bundle zza6 = zzizVar.zzq().zza(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
                Preconditions.checkNotNull(zza6);
                if (zzizVar.zzn().zza(false) == null || !"_ae".equals(str2)) {
                    z4 = equals;
                    j2 = 0;
                } else {
                    zzmr zzmrVar = zzizVar.zzp().zzb;
                    j2 = 0;
                    long elapsedRealtime = zzmrVar.zzb.zzb().elapsedRealtime();
                    z4 = equals;
                    long j5 = elapsedRealtime - zzmrVar.zza;
                    zzmrVar.zza = elapsedRealtime;
                    if (j5 > 0) {
                        zzizVar.zzq().zza(zza6, j5);
                    }
                }
                if (!"auto".equals(str6) && "_ssr".equals(str2)) {
                    zznt zzq = zzizVar.zzq();
                    String string = zza6.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Objects.equals(string, zzq.zzk().zzq.zza())) {
                        zzq.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzq.zzk().zzq.zza(string);
                } else if ("_ae".equals(str2)) {
                    String zza7 = zzizVar.zzq().zzk().zzq.zza();
                    if (!TextUtils.isEmpty(zza7)) {
                        zza6.putString("_ffr", zza7);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(zza6);
                if (zzizVar.zze().zza(zzbh.zzch)) {
                    zza2 = zzizVar.zzp().zzaa();
                } else {
                    zza2 = zzizVar.zzk().zzn.zza();
                }
                if (zzizVar.zzk().zzk.zza() <= j2 || !zzizVar.zzk().zza(j4) || !zza2) {
                    j3 = j2;
                    str4 = "_ae";
                } else {
                    zzizVar.zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j3 = j2;
                    str4 = "_ae";
                    zza("auto", "_sid", (Object) null, zzizVar.zzb().currentTimeMillis());
                    zza("auto", "_sno", (Object) null, zzb().currentTimeMillis());
                    zza("auto", "_se", (Object) null, zzb().currentTimeMillis());
                    zzizVar = this;
                    zzizVar.zzk().zzl.zza(j3);
                }
                if (zza6.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
                    zzizVar.zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    zzizVar.zzu.zzs().zza.zza(j4, true);
                }
                ArrayList arrayList2 = new ArrayList(zza6.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    String str7 = (String) obj;
                    if (str7 != null) {
                        zzizVar.zzq();
                        Bundle[] zzb = zznt.zzb(zza6.get(str7));
                        if (zzb != null) {
                            zza6.putParcelableArray(str7, zzb);
                        }
                    }
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i3);
                    String str8 = i3 != 0 ? "_ep" : str2;
                    bundle2.putString("_o", str6);
                    if (z2) {
                        bundle2 = zzizVar.zzq().zza(bundle2, (String) null);
                    }
                    String str9 = str6;
                    Bundle bundle3 = bundle2;
                    zzizVar.zzo().zza(new zzbf(str8, new zzba(bundle2), str9, j4), str3);
                    if (!z4) {
                        Iterator<zziu> it = zzizVar.zzd.iterator();
                        while (it.hasNext()) {
                            it.next().onEvent(str, str2, new Bundle(bundle3), j);
                        }
                    }
                    i3++;
                    str6 = str;
                    j4 = j;
                }
                if (zzizVar.zzn().zza(false) == null || !str4.equals(str2)) {
                    return;
                }
                zzizVar.zzp().zza(true, true, zzizVar.zzb().elapsedRealtime());
                return;
            }
        }
        zzizVar = zzizVar2;
        if (z) {
            zzizVar.zzq().zza(bundle, zzizVar.zzk().zzt.zza());
        }
        if (!z3) {
            zzt = zzizVar.zzu.zzt();
            i = 2;
            if (zzt.zzc("event", str2)) {
            }
            if (i != 0) {
            }
        }
        zza = zzizVar.zzn().zza(false);
        if (zza != null) {
            zza.zzd = true;
        }
        zznt.zza(zza, bundle, (z || z3) ? false : true);
        boolean equals2 = "am".equals(str6);
        boolean zzg2 = zznt.zzg(str2);
        if (!z) {
        }
        long j42 = j;
        if (zzizVar.zzu.zzaf()) {
        }
    }

    final void zzar() {
        zzmu poll;
        MeasurementManagerFutures zzn;
        zzt();
        if (zzal().isEmpty() || this.zzh || (poll = zzal().poll()) == null || (zzn = zzq().zzn()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza("Registering trigger URI", poll.zza);
        ListenableFuture<Unit> registerTriggerAsync = zzn.registerTriggerAsync(Uri.parse(poll.zza));
        if (registerTriggerAsync == null) {
            this.zzh = false;
            zzal().add(poll);
            return;
        }
        if (!zze().zza(zzbh.zzcg)) {
            SparseArray<Long> zzh = zzk().zzh();
            zzh.put(poll.zzc, Long.valueOf(poll.zzb));
            zzk().zza(zzh);
        }
        Futures.addCallback(registerTriggerAsync, new zzjl(this, poll), new zzji(this));
    }

    public final void zza(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.add(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener already registered");
    }

    public final void zzas() {
        zzt();
        zzj().zzc().zza("Register tcfPrefChangeListener.");
        if (this.zzq == null) {
            this.zzr = new zzjo(this, this.zzu);
            this.zzq = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjh
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zziz.this.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzq);
    }

    public final void zza(long j) {
        zzc((String) null);
        zzl().zzb(new zzju(this, j));
    }

    final void zzb(long j) {
        zza(j, true);
    }

    final void zza(long j, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Resetting analytics data (FE)");
        zzml zzp = zzp();
        zzp.zzt();
        zzp.zzb.zza();
        zzg().zzag();
        boolean zzac = this.zzu.zzac();
        zzgl zzk = zzk();
        zzk.zzc.zza(j);
        if (!TextUtils.isEmpty(zzk.zzk().zzq.zza())) {
            zzk.zzq.zza(null);
        }
        zzk.zzk.zza(0L);
        zzk.zzl.zza(0L);
        if (!zzk.zze().zzw()) {
            zzk.zzb(!zzac);
        }
        zzk.zzr.zza(null);
        zzk.zzs.zza(0L);
        zzk.zzt.zza(null);
        if (z) {
            zzo().zzah();
        }
        zzp().zza.zza();
        this.zzo = !zzac;
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzl().zzb(new zzjr(this, str, str2, j, zznt.zza(bundle), z, z2, z3, str3));
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzl().zzb(new zzjq(this, str, str2, obj, j));
    }

    public final void zzb(boolean z) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.zzb == null) {
                this.zzb = new zzki(this);
            }
            if (z) {
                application.unregisterActivityLifecycleCallbacks(this.zzb);
                application.registerActivityLifecycleCallbacks(this.zzb);
                zzj().zzp().zza("Registered activity lifecycle callback");
            }
        }
    }

    final void zzc(String str) {
        this.zzf.set(str);
    }

    public final void zzb(Bundle bundle) {
        zzb(bundle, zzb().currentTimeMillis());
    }

    public final void zzb(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzio.zza(bundle2, "app_id", String.class, null);
        zzio.zza(bundle2, "origin", String.class, null);
        zzio.zza(bundle2, "name", String.class, null);
        zzio.zza(bundle2, "value", Object.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzio.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza("Invalid conditional user property name", zzi().zzc(string));
            return;
        }
        if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza("Invalid conditional user property value", zzi().zzc(string), obj);
            return;
        }
        Object zzc = zzq().zzc(string, obj);
        if (zzc == null) {
            zzj().zzg().zza("Unable to normalize conditional user property value", zzi().zzc(string), obj);
            return;
        }
        zzio.zza(bundle2, zzc);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
            zzj().zzg().zza("Invalid conditional user property timeout", zzi().zzc(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        if (j3 > 15552000000L || j3 < 1) {
            zzj().zzg().zza("Invalid conditional user property time to live", zzi().zzc(string), Long.valueOf(j3));
        } else {
            zzl().zzb(new zzjx(this, bundle2));
        }
    }

    public final void zzc(final Bundle bundle, final long j) {
        zzl().zzc(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjf
            @Override // java.lang.Runnable
            public final void run() {
                zziz.this.zza(bundle, j);
            }
        });
    }

    private final void zza(Bundle bundle, int i, long j) {
        String str;
        zzu();
        String zza = zzin.zza(bundle);
        if (zza != null) {
            zzj().zzv().zza("Ignoring invalid consent setting", zza);
            zzj().zzv().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean z = zze().zza(zzbh.zzcm) && zzl().zzg();
        zzin zza2 = zzin.zza(bundle, i);
        if (zza2.zzk()) {
            zza(zza2, j, z);
        }
        zzax zza3 = zzax.zza(bundle, i);
        if (zza3.zzg()) {
            zza(zza3, z);
        }
        Boolean zza4 = zzax.zza(bundle);
        if (zza4 != null) {
            if (i == -30) {
                str = "tcf";
            } else {
                str = App.TYPE;
            }
            zza(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza4.toString(), false);
        }
    }

    public final void zzd(Bundle bundle, long j) {
        zza(bundle, -20, j);
    }

    public final void zzc(boolean z) {
        zzu();
        zzl().zzb(new zzjn(this, z));
    }

    public final void zzc(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final void run() {
                zziz.this.zza(bundle2);
            }
        });
    }

    final void zza(zzax zzaxVar, boolean z) {
        zzkh zzkhVar = new zzkh(this, zzaxVar);
        if (z) {
            zzt();
            zzkhVar.run();
        } else {
            zzl().zzb(zzkhVar);
        }
    }

    public final void zza(zziv zzivVar) {
        zziv zzivVar2;
        zzt();
        zzu();
        if (zzivVar != null && zzivVar != (zzivVar2 = this.zzc)) {
            Preconditions.checkState(zzivVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzivVar;
    }

    public final void zza(Boolean bool) {
        zzu();
        zzl().zzb(new zzke(this, bool));
    }

    final void zza(zzin zzinVar) {
        zzt();
        boolean z = (zzinVar.zzj() && zzinVar.zzi()) || zzo().zzam();
        if (z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean zzu = zzk().zzu();
            if (!z || zzu == null || zzu.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) {
        zzt();
        zzu();
        zzj().zzc().zza("Setting app measurement enabled (FE)", bool);
        zzk().zza(bool);
        if (z) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    public final void zzc(long j) {
        zzl().zzb(new zzjp(this, j));
    }

    public final void zza(Intent intent) {
        if (zzpo.zza() && zze().zza(zzbh.zzbv)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().zzn().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzj().zzn().zza("Preview Mode was not enabled.");
                zze().zzi(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzj().zzn().zza("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zze().zzi(queryParameter2);
        }
    }

    public final void zza(zzin zzinVar, long j, boolean z) {
        zzin zzinVar2;
        boolean z2;
        zzin zzinVar3;
        boolean z3;
        boolean z4;
        zzu();
        int zza = zzinVar.zza();
        if (com.google.android.gms.internal.measurement.zznb.zza() && zze().zza(zzbh.zzcx)) {
            if (zza != -10 && zzinVar.zzc() == zziq.UNINITIALIZED && zzinVar.zzd() == zziq.UNINITIALIZED) {
                zzj().zzv().zza("Ignoring empty consent settings");
                return;
            }
        } else if (zza != -10 && zzinVar.zze() == null && zzinVar.zzf() == null) {
            zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzg) {
            zzinVar2 = this.zzl;
            z2 = false;
            if (zzin.zza(zza, zzinVar2.zza())) {
                z3 = zzinVar.zzc(this.zzl);
                if (zzinVar.zzj() && !this.zzl.zzj()) {
                    z2 = true;
                }
                zzinVar3 = zzinVar.zzb(this.zzl);
                this.zzl = zzinVar3;
                z4 = z2;
                z2 = true;
            } else {
                zzinVar3 = zzinVar;
                z3 = false;
                z4 = false;
            }
        }
        if (!z2) {
            zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zzinVar3);
            return;
        }
        long andIncrement = this.zzm.getAndIncrement();
        if (z3) {
            zzc((String) null);
            zzkg zzkgVar = new zzkg(this, zzinVar3, j, andIncrement, z4, zzinVar2);
            if (z) {
                zzt();
                zzkgVar.run();
                return;
            } else {
                zzl().zzc(zzkgVar);
                return;
            }
        }
        zzkj zzkjVar = new zzkj(this, zzinVar3, andIncrement, z4, zzinVar2);
        if (z) {
            zzt();
            zzkjVar.run();
        } else if (zza == 30 || zza == -10) {
            zzl().zzc(zzkjVar);
        } else {
            zzl().zzb(zzkjVar);
        }
    }

    public final void zza(final String str, long j) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.zzu.zzj().zzu().zza("User ID must be non-empty or null");
        } else {
            zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjg
                @Override // java.lang.Runnable
                public final void run() {
                    zziz.this.zzb(str);
                }
            });
            zza((String) null, "_id", (Object) str, true, j);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        if (str == null) {
            str = App.TYPE;
        }
        String str3 = str;
        if (z) {
            i = zzq().zzb(str2);
        } else {
            zznt zzq = zzq();
            if (zzq.zzc("user property", str2)) {
                if (!zzq.zza("user property", zzis.zza, str2)) {
                    i = 15;
                } else if (zzq.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzq();
            String zza = zznt.zza(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zznt.zza(this.zzs, i, "_ev", zza, length);
            return;
        }
        if (obj != null) {
            int zza2 = zzq().zza(str2, obj);
            if (zza2 != 0) {
                zzq();
                String zza3 = zznt.zza(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
                this.zzu.zzt();
                zznt.zza(this.zzs, zza2, "_ev", zza3, length);
                return;
            }
            Object zzc = zzq().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j, zzc);
                return;
            }
            return;
        }
        zza(str3, str2, j, (Object) null);
    }

    final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzu();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzk().zzh.zza(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    zzj().zzp().zza("Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)", obj, str);
                }
            }
            if (obj == null) {
                zzk().zzh.zza("unset");
                str2 = "_npa";
            }
            zzj().zzp().zza("Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)", obj, str);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzu.zzac()) {
            zzj().zzp().zza("User property not set since app measurement is disabled");
        } else if (this.zzu.zzaf()) {
            zzo().zza(new zzno(str4, j, obj2, str));
        }
    }

    public final void zzb(zziu zziuVar) {
        zzu();
        Preconditions.checkNotNull(zziuVar);
        if (this.zzd.remove(zziuVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        zziz zzizVar;
        zzt();
        String zza = zzk().zzh.zza();
        if (zza == null) {
            zzizVar = this;
        } else if ("unset".equals(zza)) {
            zzizVar = this;
            zzizVar.zza(App.TYPE, "_npa", (Object) null, zzb().currentTimeMillis());
        } else {
            zza(App.TYPE, "_npa", Long.valueOf("true".equals(zza) ? 1L : 0L), zzb().currentTimeMillis());
            zzizVar = this;
        }
        if (zzizVar.zzu.zzac() && zzizVar.zzo) {
            zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzam();
            zzp().zza.zza();
            zzl().zzb(new zzjm(this));
            return;
        }
        zzj().zzc().zza("Updating Scion state (FE)");
        zzo().zzaj();
    }
}
