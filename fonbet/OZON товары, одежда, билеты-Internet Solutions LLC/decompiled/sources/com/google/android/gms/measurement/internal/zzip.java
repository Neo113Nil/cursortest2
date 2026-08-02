package com.google.android.gms.measurement.internal;

import N3.C3661l;
import T7.E;
import U7.C4056a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.C5132a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tagmanager.TagManagerService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzip extends zzf {

    @VisibleForTesting
    protected zzio zza;
    final zzs zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzhk zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzai zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzls zzn;

    protected zzip(zzgk zzgkVar) {
        super(zzgkVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzid(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzgkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final void zzC(Bundle bundle, long j11) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzS(bundle, 0, j11);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(Boolean bool, boolean z11) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z11) {
            zzfp zzm = this.zzs.zzm();
            zzgk zzgkVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae() {
        zzip zzipVar;
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza == null) {
            zzipVar = this;
        } else if ("unset".equals(zza)) {
            zzipVar = this;
            zzipVar.zzaa("app", "_npa", null, this.zzs.zzav().currentTimeMillis());
        } else {
            zzipVar = this;
            zzipVar.zzaa("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), zzipVar.zzs.zzav().currentTimeMillis());
        }
        if (!zzipVar.zzs.zzJ() || !zzipVar.zzc) {
            zzipVar.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            zzipVar.zzs.zzt().zzI();
            return;
        }
        zzipVar.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzoo.zzc();
        if (zzipVar.zzs.zzf().zzs(null, zzen.zzae)) {
            zzipVar.zzs.zzu().zza.zza();
        }
        zzipVar.zzs.zzaz().zzp(new zzhs(this));
    }

    static /* bridge */ /* synthetic */ void zzv(zzip zzipVar, zzai zzaiVar, zzai zzaiVar2) {
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            zzah zzahVar = zzahVarArr[i11];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z11 = true;
                break;
            }
            i11++;
        }
        boolean zzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z11 || zzl) {
            zzipVar.zzs.zzh().zzo();
        }
    }

    static /* synthetic */ void zzw(zzip zzipVar, zzai zzaiVar, int i11, long j11, boolean z11, boolean z12) {
        zzipVar.zzg();
        zzipVar.zza();
        if (j11 <= zzipVar.zzl && zzai.zzj(zzipVar.zzm, i11)) {
            zzipVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzfp zzm = zzipVar.zzs.zzm();
        zzgk zzgkVar = zzm.zzs;
        zzm.zzg();
        if (!zzm.zzl(i11)) {
            zzipVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i11));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzaiVar.zzh());
        edit.putInt("consent_source", i11);
        edit.apply();
        zzipVar.zzl = j11;
        zzipVar.zzm = i11;
        zzipVar.zzs.zzt().zzF(z11);
        if (z12) {
            zzipVar.zzs.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhz(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final /* synthetic */ void zzD(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzaf(obj)) {
                    this.zzs.zzv().zzN(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlt.zzah(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlt zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzaa("param", str, 100, obj)) {
                    this.zzs.zzv().zzO(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i11++;
                if (i11 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().zzN(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzE(String str, String str2, Bundle bundle) {
        zzF(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzF(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.zzs.zzs().zzx(bundle2, j11);
            return;
        }
        boolean z13 = true;
        if (z12 && this.zzd != null && !zzlt.zzah(str2)) {
            z13 = false;
        }
        zzN(str3, str2, j11, bundle2, z12, z13, z11, null);
    }

    public final void zzG(String str, String str2, Bundle bundle, String str3) {
        zzgk.zzO();
        zzN("auto", str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void zzH(String str, String str2, Bundle bundle) {
        zzg();
        zzI(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    final void zzI(String str, String str2, long j11, Bundle bundle) {
        zzg();
        boolean z11 = true;
        if (this.zzd != null && !zzlt.zzah(str2)) {
            z11 = false;
        }
        zzJ(str, str2, j11, bundle, true, z11, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzJ(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        boolean z14;
        int i11;
        long j12;
        ArrayList arrayList;
        long j13;
        String str4;
        int i12;
        String str5;
        long j14;
        Bundle[] bundleArr;
        Class cls;
        String str6 = str;
        Preconditions.checkNotEmpty(str6);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzs.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                if (this.zzs.zzN()) {
                    cls = TagManagerService.class;
                    int i13 = TagManagerService.f57868a;
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader());
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e11) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e11);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            zzaa("auto", "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
        }
        zzip zzipVar = this;
        zzipVar.zzs.zzaw();
        if (z11 && zzlt.zzal(str2)) {
            zzipVar.zzs.zzv().zzL(bundle, zzipVar.zzs.zzm().zzr.zza());
        }
        if (!z13) {
            zzipVar.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzlt zzv = zzipVar.zzs.zzv();
                int i14 = 2;
                if (zzv.zzac("event", str2)) {
                    if (zzv.zzZ("event", zzhh.zza, zzhh.zzb, str2)) {
                        zzv.zzs.zzf();
                        if (zzv.zzY("event", 40, str2)) {
                            i14 = 0;
                        }
                    } else {
                        i14 = 13;
                    }
                }
                if (i14 != 0) {
                    zzipVar.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", zzipVar.zzs.zzj().zzd(str2));
                    zzlt zzv2 = zzipVar.zzs.zzv();
                    zzipVar.zzs.zzf();
                    zzipVar.zzs.zzv().zzN(zzipVar.zzn, null, i14, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzpp.zzc();
        if (zzipVar.zzs.zzf().zzs(null, zzen.zzat)) {
            zzipVar.zzs.zzaw();
            zziw zzj = zzipVar.zzs.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = true;
            }
            zzlt.zzK(zzj, bundle, z11 && !z13);
        } else {
            zzipVar.zzs.zzaw();
            zziw zzj2 = zzipVar.zzs.zzs().zzj(false);
            if (zzj2 != null && !bundle.containsKey("_sc")) {
                zzj2.zzd = true;
            }
            zzlt.zzK(zzj2, bundle, z11 && !z13);
        }
        boolean equals = "am".equals(str6);
        boolean zzah = zzlt.zzah(str2);
        if (!z11 || zzipVar.zzd == null || zzah) {
            z14 = equals;
        } else {
            if (!equals) {
                zzipVar.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", zzipVar.zzs.zzj().zzd(str2), zzipVar.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzipVar.zzd);
                zzipVar.zzd.interceptEvent(str6, str2, bundle, j11);
                return;
            }
            z14 = true;
        }
        if (zzipVar.zzs.zzM()) {
            int zzh = zzipVar.zzs.zzv().zzh(str2);
            if (zzh != 0) {
                zzipVar.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", zzipVar.zzs.zzj().zzd(str2));
                zzlt zzv3 = zzipVar.zzs.zzv();
                zzipVar.zzs.zzf();
                zzipVar.zzs.zzv().zzN(zzipVar.zzn, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzy = zzipVar.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z13);
            Preconditions.checkNotNull(zzy);
            zzipVar.zzs.zzaw();
            if (zzipVar.zzs.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                i11 = 0;
                j12 = 0;
            } else {
                zzks zzksVar = zzipVar.zzs.zzu().zzb;
                j12 = 0;
                long elapsedRealtime = zzksVar.zzc.zzs.zzav().elapsedRealtime();
                i11 = 0;
                long j15 = elapsedRealtime - zzksVar.zzb;
                zzksVar.zzb = elapsedRealtime;
                if (j15 > 0) {
                    zzipVar.zzs.zzv().zzI(zzy, j15);
                }
            }
            zzoc.zzc();
            if (zzipVar.zzs.zzf().zzs(null, zzen.zzad)) {
                if (!"auto".equals(str6) && "_ssr".equals(str2)) {
                    zzlt zzv4 = zzipVar.zzs.zzv();
                    String string = zzy.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzlr.zza(string, zzv4.zzs.zzm().zzo.zza())) {
                        zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzs.zzm().zzo.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String zza = zzipVar.zzs.zzv().zzs.zzm().zzo.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzy.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzy);
            if (zzipVar.zzs.zzm().zzj.zza() <= j12) {
                long j16 = j12;
                arrayList = arrayList2;
                j13 = j16;
                str4 = "_ae";
                i12 = i11;
                str5 = "_o";
                j14 = j11;
            } else if (zzipVar.zzs.zzm().zzk(j11) && zzipVar.zzs.zzm().zzl.zzb()) {
                E.g(zzipVar.zzs, "Current session is expired, remove the session number, ID, and engagement time");
                long j17 = j12;
                arrayList = arrayList2;
                j13 = j17;
                str4 = "_ae";
                i12 = i11;
                str5 = "_o";
                j14 = j11;
                zzipVar.zzaa("auto", "_sid", null, zzipVar.zzs.zzav().currentTimeMillis());
                zzipVar.zzaa("auto", "_sno", null, zzipVar.zzs.zzav().currentTimeMillis());
                zzipVar.zzaa("auto", "_se", null, zzipVar.zzs.zzav().currentTimeMillis());
                zzipVar = zzipVar;
            } else {
                long j18 = j12;
                arrayList = arrayList2;
                j13 = j18;
                str4 = "_ae";
                i12 = i11;
                str5 = "_o";
                j14 = j11;
            }
            if (zzy.getLong("extend_session", j13) == 1) {
                E.g(zzipVar.zzs, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzipVar.zzs.zzu().zza.zzb(j14, true);
            }
            ArrayList arrayList3 = new ArrayList(zzy.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i15 = i12; i15 < size; i15++) {
                String str7 = (String) arrayList3.get(i15);
                if (str7 != null) {
                    zzipVar.zzs.zzv();
                    Object obj = zzy.get(str7);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i12] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzy.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            int i16 = i12;
            while (i16 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i16);
                String str8 = i16 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str6);
                if (z12) {
                    bundle2 = zzipVar.zzs.zzv().zzt(bundle2);
                }
                String str9 = str6;
                Bundle bundle3 = bundle2;
                zzipVar.zzs.zzt().zzA(new zzaw(str8, new zzau(bundle2), str9, j14), str3);
                if (!z14) {
                    Iterator it = zzipVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhl) it.next()).onEvent(str, str2, new Bundle(bundle3), j11);
                    }
                }
                i16++;
                str6 = str;
                j14 = j11;
                arrayList = arrayList5;
            }
            zzipVar.zzs.zzaw();
            if (zzipVar.zzs.zzs().zzj(i12) == null || !str4.equals(str2)) {
                return;
            }
            zzipVar.zzs.zzu().zzb.zzd(true, true, zzipVar.zzs.zzav().elapsedRealtime());
        }
    }

    public final void zzK(zzhl zzhlVar) {
        zza();
        Preconditions.checkNotNull(zzhlVar);
        if (this.zze.add(zzhlVar)) {
            return;
        }
        C4056a.a(this.zzs, "OnEventListener already registered");
    }

    public final void zzL(long j11) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhx(this, j11));
    }

    final void zzM(long j11, boolean z11) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzku zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzps.zzc();
        if (this.zzs.zzf().zzs(null, zzen.zzaI)) {
            this.zzs.zzh().zzo();
        }
        boolean zzJ = this.zzs.zzJ();
        zzfp zzm = this.zzs.zzm();
        zzm.zzc.zzb(j11);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        zzoo.zzc();
        zzag zzf = zzm.zzs.zzf();
        zzem zzemVar = zzen.zzae;
        if (zzf.zzs(null, zzemVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z11) {
            this.zzs.zzt().zzC();
        }
        zzoo.zzc();
        if (this.zzs.zzf().zzs(null, zzemVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzN(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhu(this, str, str2, j11, bundle2, z11, z12, z13, str3));
    }

    final void zzO(String str, String str2, long j11, Object obj) {
        this.zzs.zzaz().zzp(new zzhv(this, str, str2, obj, j11));
    }

    final void zzP(String str) {
        this.zzg.set(str);
    }

    public final void zzQ(Bundle bundle) {
        zzR(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzR(Bundle bundle, long j11) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C4056a.a(this.zzs, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzhg.zza(bundle2, "app_id", String.class, null);
        zzhg.zza(bundle2, "origin", String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzhg.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j11);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
            return;
        }
        if (this.zzs.zzv().zzd(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzs.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        zzhg.zzb(bundle2, zzB);
        long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzs.zzf();
            if (j12 > 15552000000L || j12 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j12));
                return;
            }
        }
        long j13 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzs.zzf();
        if (j13 > 15552000000L || j13 < 1) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j13));
        } else {
            this.zzs.zzaz().zzp(new zzhy(this, bundle2));
        }
    }

    public final void zzS(Bundle bundle, int i11, long j11) {
        zza();
        String zzg = zzai.zzg(bundle);
        if (zzg != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzT(zzai.zza(bundle), i11, j11);
    }

    public final void zzT(zzai zzaiVar, int i11, long j11) {
        zzai zzaiVar2;
        boolean z11;
        boolean z12;
        zzai zzaiVar3;
        int i12;
        boolean z13;
        zza();
        if (i11 != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzaiVar2 = this.zzi;
                boolean z14 = false;
                if (zzai.zzj(i11, this.zzj)) {
                    z11 = zzaiVar.zzk(this.zzi);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    z12 = true;
                    if (zzaiVar.zzi(zzahVar) && !this.zzi.zzi(zzahVar)) {
                        z14 = true;
                    }
                    zzai zzd = zzaiVar.zzd(this.zzi);
                    this.zzi = zzd;
                    this.zzj = i11;
                    boolean z15 = z14;
                    zzaiVar3 = zzd;
                    i12 = -10;
                    z13 = z15;
                } else {
                    z11 = false;
                    z12 = false;
                    zzaiVar3 = zzaiVar;
                    i12 = -10;
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z11) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzij(this, zzaiVar3, j11, i11, andIncrement, z13, zzaiVar2));
            return;
        }
        zzik zzikVar = new zzik(this, zzaiVar3, i11, andIncrement, z13, zzaiVar2);
        if (i11 == 30 || i11 == i12) {
            this.zzs.zzaz().zzq(zzikVar);
        } else {
            this.zzs.zzaz().zzp(zzikVar);
        }
    }

    public final void zzU(final Bundle bundle, final long j11) {
        zzof.zzc();
        if (this.zzs.zzf().zzs(null, zzen.zzal)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzho
                @Override // java.lang.Runnable
                public final void run() {
                    zzip.this.zzC(bundle, j11);
                }
            });
        } else {
            zzC(bundle, j11);
        }
    }

    public final void zzV(zzhk zzhkVar) {
        zzhk zzhkVar2;
        zzg();
        zza();
        if (zzhkVar != null && zzhkVar != (zzhkVar2 = this.zzd)) {
            Preconditions.checkState(zzhkVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhkVar;
    }

    public final void zzW(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzii(this, bool));
    }

    final void zzX(zzai zzaiVar) {
        zzg();
        boolean z11 = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzs.zzt().zzM();
        if (z11 != this.zzs.zzK()) {
            this.zzs.zzG(z11);
            zzfp zzm = this.zzs.zzm();
            zzgk zzgkVar = zzm.zzs;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z11 || valueOf == null || valueOf.booleanValue()) {
                zzad(Boolean.valueOf(z11), false);
            }
        }
    }

    public final void zzY(String str, String str2, Object obj, boolean z11) {
        zzZ("auto", "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(String str, String str2, Object obj, boolean z11, long j11) {
        int i11;
        int i12;
        String str3 = str == null ? "app" : str;
        if (z11) {
            i12 = this.zzs.zzv().zzl(str2);
        } else {
            zzlt zzv = this.zzs.zzv();
            if (zzv.zzac("user property", str2)) {
                if (zzv.zzZ("user property", zzhj.zza, null, str2)) {
                    zzv.zzs.zzf();
                    if (zzv.zzY("user property", 24, str2)) {
                        i11 = 0;
                        if (i11 != 0) {
                            zzlt zzv2 = this.zzs.zzv();
                            this.zzs.zzf();
                            this.zzs.zzv().zzN(this.zzn, null, i11, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        } else {
                            if (obj == null) {
                                zzO(str3, str2, j11, null);
                                return;
                            }
                            int zzd = this.zzs.zzv().zzd(str2, obj);
                            if (zzd != 0) {
                                zzlt zzv3 = this.zzs.zzv();
                                this.zzs.zzf();
                                this.zzs.zzv().zzN(this.zzn, null, zzd, "_ev", zzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                                return;
                            } else {
                                Object zzB = this.zzs.zzv().zzB(str2, obj);
                                if (zzB != null) {
                                    zzO(str3, str2, j11, zzB);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } else {
                    i12 = 15;
                }
            }
            i11 = 6;
            if (i11 != 0) {
            }
        }
        i11 = i12;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzaa(String str, String str2, Object obj, long j11) {
        String str3;
        Object obj2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    long j12 = true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    Long valueOf = Long.valueOf(j12);
                    this.zzs.zzm().zzh.zzb(j12 == 1 ? "true" : "false");
                    obj2 = valueOf;
                    str3 = "_npa";
                    if (!this.zzs.zzJ()) {
                        E.g(this.zzs, "User property not set since app measurement is disabled");
                        return;
                    } else {
                        if (this.zzs.zzM()) {
                            this.zzs.zzt().zzK(new zzlo(str3, j11, obj2, str));
                            return;
                        }
                        return;
                    }
                }
            }
            if (obj == null) {
                this.zzs.zzm().zzh.zzb("unset");
                obj2 = obj;
                str3 = "_npa";
                if (!this.zzs.zzJ()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.zzs.zzJ()) {
        }
    }

    public final void zzab(zzhl zzhlVar) {
        zza();
        Preconditions.checkNotNull(zzhlVar);
        if (this.zze.remove(zzhlVar)) {
            return;
        }
        C4056a.a(this.zzs, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzib(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzih(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzig(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzif(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zziw zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zziw zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzie(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzia(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlt.zzH(list);
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z11) {
        zza();
        E.g(this.zzs, "Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            C3661l.b(this.zzs, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            C3661l.b(this.zzs, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhw(this, atomicReference, z11));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z11));
        return Collections.EMPTY_LIST;
    }

    public final Map zzu(String str, String str2, boolean z11) {
        if (this.zzs.zzaz().zzs()) {
            C3661l.b(this.zzs, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            C3661l.b(this.zzs, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzic(this, atomicReference, null, str, str2, z11));
        List<zzlo> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z11));
            return Collections.EMPTY_MAP;
        }
        C5132a c5132a = new C5132a(list.size());
        for (zzlo zzloVar : list) {
            Object zza = zzloVar.zza();
            if (zza != null) {
                c5132a.put(zzloVar.zzb, zza);
            }
        }
        return c5132a;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzen.zzY)) {
                zzag zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhr
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzip zzipVar = zzip.this;
                            zzipVar.zzg();
                            if (zzipVar.zzs.zzm().zzm.zzb()) {
                                zzipVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzipVar.zzs.zzm().zzn.zza();
                            zzipVar.zzs.zzm().zzn.zzb(1 + zza);
                            zzipVar.zzs.zzf();
                            if (zza < 5) {
                                zzipVar.zzs.zzE();
                            } else {
                                C4056a.a(zzipVar.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzipVar.zzs.zzm().zzm.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzfp zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzH("auto", "_ou", bundle);
        }
    }
}
