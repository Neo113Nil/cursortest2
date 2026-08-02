package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
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

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzij extends zzf {
    protected zzii zza;
    final zzs zzb;
    protected boolean zzc;
    private zzhe zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzai zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzln zzn;

    protected zzij(zzge zzgeVar) {
        super(zzgeVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhy(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzgeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzfj zzm = this.zzt.zzm();
            zzge zzgeVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzij zzijVar;
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza == null) {
            zzijVar = this;
        } else if ("unset".equals(zza)) {
            zzijVar = this;
            zzijVar.zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
        } else {
            zzijVar = this;
            zzijVar.zzY("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), zzijVar.zzt.zzax().currentTimeMillis());
        }
        if (!zzijVar.zzt.zzJ() || !zzijVar.zzc) {
            zzijVar.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            zzijVar.zzt.zzt().zzI();
            return;
        }
        zzijVar.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzpe.zzc();
        if (zzijVar.zzt.zzf().zzs(null, zzeh.zzaf)) {
            zzijVar.zzt.zzu().zza.zza();
        }
        zzijVar.zzt.zzaB().zzp(new zzhm(this));
    }

    static /* bridge */ /* synthetic */ void zzv(zzij zzijVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || zzl) {
            zzijVar.zzt.zzh().zzo();
        }
    }

    static /* synthetic */ void zzw(zzij zzijVar, zzai zzaiVar, int i, long j, boolean z, boolean z2) {
        zzijVar.zzg();
        zzijVar.zza();
        if (j <= zzijVar.zzl && zzai.zzj(zzijVar.zzm, i)) {
            zzijVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzfj zzm = zzijVar.zzt.zzm();
        zzge zzgeVar = zzm.zzt;
        zzm.zzg();
        if (!zzm.zzl(i)) {
            zzijVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzaiVar.zzh());
        edit.putInt("consent_source", i);
        edit.apply();
        zzijVar.zzl = j;
        zzijVar.zzm = i;
        zzijVar.zzt.zzt().zzF(z);
        if (z2) {
            zzijVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzht(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzn, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlo.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlo zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            int i = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i++;
                if (i > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzn, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 == FirebaseAnalytics.Event.SCREEN_VIEW || (str2 != null && str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            this.zzt.zzs().zzx(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.zzd != null && !zzlo.zzaj(str2)) {
            z3 = false;
        }
        boolean z4 = z3;
        if (str == null) {
            str = "app";
        }
        zzM(str, str2, j, bundle2, z2, z4, z, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzge.zzO();
        zzM("auto", str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    final void zzH(String str, String str2, long j, Bundle bundle) {
        zzg();
        boolean z = true;
        if (this.zzd != null && !zzlo.zzaj(str2)) {
            z = false;
        }
        zzI(str, str2, j, bundle, true, z, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j2;
        boolean z4;
        int i;
        long j3;
        ArrayList arrayList;
        long j4;
        String str4;
        Bundle[] bundleArr;
        int i2;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzt.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e) {
                    this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzay();
            zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
        }
        zzij zzijVar = this;
        zzijVar.zzt.zzay();
        if (z && zzlo.zzan(str2)) {
            zzijVar.zzt.zzv().zzL(bundle, zzijVar.zzt.zzm().zzs.zza());
        }
        if (!z3) {
            zzijVar.zzt.zzay();
            if (!"_iap".equals(str2)) {
                zzlo zzv = zzijVar.zzt.zzv();
                if (zzv.zzad("event", str2)) {
                    if (zzv.zzaa("event", zzhb.zza, zzhb.zzb, str2)) {
                        zzv.zzt.zzf();
                        if (zzv.zzZ("event", 40, str2)) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 13;
                    }
                    if (i2 != 0) {
                        zzijVar.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", zzijVar.zzt.zzj().zzd(str2));
                        zzlo zzv2 = zzijVar.zzt.zzv();
                        zzijVar.zzt.zzf();
                        zzijVar.zzt.zzv().zzO(zzijVar.zzn, null, i2, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
                i2 = 2;
                if (i2 != 0) {
                }
            }
        }
        zzijVar.zzt.zzay();
        zziq zzj = zzijVar.zzt.zzs().zzj(false);
        if (zzj != null && !bundle.containsKey("_sc")) {
            zzj.zzd = true;
        }
        zzlo.zzK(zzj, bundle, z && !z3);
        boolean equals = "am".equals(str5);
        boolean zzaj = zzlo.zzaj(str2);
        if (!z || zzijVar.zzd == null || zzaj) {
            j2 = j;
            z4 = equals;
        } else {
            if (!equals) {
                zzijVar.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", zzijVar.zzt.zzj().zzd(str2), zzijVar.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzijVar.zzd);
                zzijVar.zzd.interceptEvent(str5, str2, bundle, j);
                return;
            }
            j2 = j;
            z4 = true;
        }
        if (zzijVar.zzt.zzM()) {
            int zzh = zzijVar.zzt.zzv().zzh(str2);
            if (zzh != 0) {
                zzijVar.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", zzijVar.zzt.zzj().zzd(str2));
                zzlo zzv3 = zzijVar.zzt.zzv();
                zzijVar.zzt.zzf();
                zzijVar.zzt.zzv().zzO(zzijVar.zzn, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzu = zzijVar.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(zzu);
            zzijVar.zzt.zzay();
            if (zzijVar.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                i = 0;
                j3 = 0;
            } else {
                zzkm zzkmVar = zzijVar.zzt.zzu().zzb;
                j3 = 0;
                long elapsedRealtime = zzkmVar.zzc.zzt.zzax().elapsedRealtime();
                i = 0;
                long j5 = elapsedRealtime - zzkmVar.zzb;
                zzkmVar.zzb = elapsedRealtime;
                if (j5 > 0) {
                    zzijVar.zzt.zzv().zzI(zzu, j5);
                }
            }
            zzos.zzc();
            if (zzijVar.zzt.zzf().zzs(null, zzeh.zzae)) {
                if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                    zzlo zzv4 = zzijVar.zzt.zzv();
                    String string = zzu.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzlm.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                        zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String zza = zzijVar.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzu.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzu);
            if (zzijVar.zzt.zzm().zzj.zza() > j3 && zzijVar.zzt.zzm().zzk(j2) && zzijVar.zzt.zzm().zzm.zzb()) {
                zzijVar.zzt.zzaA().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                long j6 = j3;
                arrayList = arrayList2;
                j4 = j6;
                str4 = "_ae";
                zzY("auto", "_sid", null, zzijVar.zzt.zzax().currentTimeMillis());
                zzY("auto", "_sno", null, this.zzt.zzax().currentTimeMillis());
                zzY("auto", "_se", null, this.zzt.zzax().currentTimeMillis());
                zzijVar = this;
                zzijVar.zzt.zzm().zzk.zzb(j4);
            } else {
                long j7 = j3;
                arrayList = arrayList2;
                j4 = j7;
                str4 = "_ae";
            }
            if (zzu.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j4) == 1) {
                zzijVar.zzt.zzaA().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzijVar.zzt.zzu().zza.zzb(j2, true);
            }
            ArrayList arrayList3 = new ArrayList(zzu.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i3 = i; i3 < size; i3++) {
                String str6 = (String) arrayList3.get(i3);
                if (str6 != null) {
                    zzijVar.zzt.zzv();
                    Object obj = zzu.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i] = (Bundle) obj;
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
                        zzu.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i4 = i;
            while (i4 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i4);
                String str7 = i4 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = zzijVar.zzt.zzv().zzt(bundle2);
                }
                String str8 = str5;
                Bundle bundle3 = bundle2;
                zzijVar.zzt.zzt().zzA(new zzaw(str7, new zzau(bundle2), str8, j2), str3);
                if (!z4) {
                    Iterator it = zzijVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhf) it.next()).onEvent(str, str2, new Bundle(bundle3), j);
                    }
                }
                i4++;
                str5 = str;
                j2 = j;
                arrayList = arrayList5;
            }
            zzijVar.zzt.zzay();
            if (zzijVar.zzt.zzs().zzj(i) == null || !str4.equals(str2)) {
                return;
            }
            zzijVar.zzt.zzu().zzb.zzd(true, true, zzijVar.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhf zzhfVar) {
        zza();
        Preconditions.checkNotNull(zzhfVar);
        if (this.zze.add(zzhfVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhr(this, j));
    }

    final void zzL(long j, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzko zzu = this.zzt.zzu();
        zzu.zzg();
        zzkn zzknVar = zzu.zza;
        zzu.zzb.zza();
        zzqr.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfj zzm = this.zzt.zzm();
        zzm.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzpe.zzc();
        if (zzm.zzt.zzf().zzs(null, zzeh.zzaf)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzpe.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzho(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    final void zzN(String str, String str2, long j, Object obj) {
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, obj, j));
    }

    final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzt.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzha.zza(bundle2, "app_id", String.class, null);
        zzha.zza(bundle2, "origin", String.class, null);
        zzha.zza(bundle2, "name", String.class, null);
        zzha.zza(bundle2, "value", Object.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzha.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzt.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzha.zzb(bundle2, zzB);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j3));
        } else {
            this.zzt.zzaB().zzp(new zzhs(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String zzg = zzai.zzg(bundle);
        if (zzg != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i, j);
    }

    public final void zzS(zzai zzaiVar, int i, long j) {
        boolean zzk;
        boolean z;
        boolean z2;
        zza();
        if (i != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzai zzaiVar2 = this.zzi;
                boolean z3 = false;
                if (zzai.zzj(i, this.zzj)) {
                    try {
                        zzk = zzaiVar.zzk(this.zzi);
                        z = true;
                        if (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && !this.zzi.zzi(zzah.ANALYTICS_STORAGE)) {
                            z3 = true;
                        }
                        zzaiVar = zzaiVar.zzd(this.zzi);
                        this.zzi = zzaiVar;
                        this.zzj = i;
                        z2 = z3;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    zzk = false;
                    z = false;
                    z2 = false;
                }
                zzai zzaiVar3 = zzaiVar;
                if (!z) {
                    this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
                    return;
                }
                long andIncrement = this.zzk.getAndIncrement();
                if (zzk) {
                    this.zzg.set(null);
                    this.zzt.zzaB().zzq(new zzie(this, zzaiVar3, j, i, andIncrement, z2, zzaiVar2));
                    return;
                }
                zzif zzifVar = new zzif(this, zzaiVar3, i, andIncrement, z2, zzaiVar2);
                if (i == 30 || i == -10) {
                    this.zzt.zzaB().zzq(zzifVar);
                } else {
                    this.zzt.zzaB().zzp(zzifVar);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void zzT(zzhe zzheVar) {
        zzhe zzheVar2;
        zzg();
        zza();
        if (zzheVar != null && zzheVar != (zzheVar2 = this.zzd)) {
            Preconditions.checkState(zzheVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzheVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzid(this, bool));
    }

    final void zzV(zzai zzaiVar) {
        zzg();
        boolean z = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzfj zzm = this.zzt.zzm();
            zzge zzgeVar = zzm.zzt;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Object obj3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long valueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.zzt.zzm().zzh.zzb(valueOf.longValue() == 1 ? "true" : "false");
                    obj3 = valueOf;
                    obj2 = obj3;
                    str3 = "_npa";
                    if (!this.zzt.zzJ()) {
                        this.zzt.zzaA().zzj().zza("User property not set since app measurement is disabled");
                        return;
                    } else {
                        if (this.zzt.zzM()) {
                            this.zzt.zzt().zzK(new zzlj(str3, j, obj2, str));
                            return;
                        }
                        return;
                    }
                }
            }
            if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                obj3 = obj;
                obj2 = obj3;
                str3 = "_npa";
                if (!this.zzt.zzJ()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.zzt.zzJ()) {
        }
    }

    public final void zzZ(zzhf zzhfVar) {
        zza();
        Preconditions.checkNotNull(zzhfVar);
        if (this.zze.remove(zzhfVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhv(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzic(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzib(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzia(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zziq zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zziq zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzhz(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhu(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlo.zzH(list);
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        this.zzt.zzaA().zzj().zza("Getting user properties (FE)");
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhq(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhw(this, atomicReference, null, str, str2, z));
        List<zzlj> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlj zzljVar : list) {
            Object zza = zzljVar.zza();
            if (zza != null) {
                arrayMap.put(zzljVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeh.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzij zzijVar = zzij.this;
                            zzijVar.zzg();
                            if (zzijVar.zzt.zzm().zzn.zzb()) {
                                zzijVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzijVar.zzt.zzm().zzo.zza();
                            zzijVar.zzt.zzm().zzo.zzb(1 + zza);
                            zzijVar.zzt.zzf();
                            if (zza < 5) {
                                zzijVar.zzt.zzE();
                            } else {
                                zzijVar.zzt.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzijVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfj zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        if (z) {
            i2 = this.zzt.zzv().zzl(str2);
        } else {
            zzlo zzv = this.zzt.zzv();
            if (zzv.zzad("user property", str2)) {
                if (zzv.zzaa("user property", zzhd.zza, null, str2)) {
                    zzv.zzt.zzf();
                    if (zzv.zzZ("user property", 24, str2)) {
                        i = 0;
                        if (i != 0) {
                            zzlo zzv2 = this.zzt.zzv();
                            this.zzt.zzf();
                            this.zzt.zzv().zzO(this.zzn, null, i, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                        String str3 = str == null ? "app" : str;
                        if (obj == null) {
                            zzN(str3, str2, j, null);
                            return;
                        }
                        int zzd = this.zzt.zzv().zzd(str2, obj);
                        if (zzd != 0) {
                            zzlo zzv3 = this.zzt.zzv();
                            this.zzt.zzf();
                            this.zzt.zzv().zzO(this.zzn, null, zzd, "_ev", zzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                            return;
                        } else {
                            Object zzB = this.zzt.zzv().zzB(str2, obj);
                            if (zzB != null) {
                                zzN(str3, str2, j, zzB);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    i2 = 15;
                }
            }
            i = 6;
            if (i != 0) {
            }
        }
        i = i2;
        if (i != 0) {
        }
    }
}
