package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzae extends zzij {
    private Boolean zza;
    private String zzb;
    private zzag zzc;
    private Boolean zzd;

    public final double zza(String str, zzfn<Double> zzfnVar) {
        if (str == null) {
            return zzfnVar.zza(null).doubleValue();
        }
        String zza = this.zzc.zza(str, zzfnVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfnVar.zza(null).doubleValue();
        }
        try {
            return zzfnVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfnVar.zza(null).doubleValue();
        }
    }

    final int zzc() {
        return (zzor.zza() && zze().zzf(null, zzbh.zzbz) && zzq().zza(231100000, true)) ? 35 : 0;
    }

    final int zza(String str) {
        return zza(str, zzbh.zzah, 500, 2000);
    }

    final int zza(String str, boolean z) {
        if (!zzoq.zza() || !zze().zzf(null, zzbh.zzcs)) {
            return 100;
        }
        if (z) {
            return zza(str, zzbh.zzar, 100, 500);
        }
        return 500;
    }

    final int zzb(String str, boolean z) {
        return Math.max(zza(str, z), 256);
    }

    public final int zzg() {
        return zzq().zza(201500000, true) ? 100 : 25;
    }

    public final int zzb(String str) {
        return zza(str, zzbh.zzai, 25, 100);
    }

    public final int zzc(String str) {
        return zzb(str, zzbh.zzo);
    }

    public final int zzb(String str, zzfn<Integer> zzfnVar) {
        if (str == null) {
            return zzfnVar.zza(null).intValue();
        }
        String zza = this.zzc.zza(str, zzfnVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfnVar.zza(null).intValue();
        }
        try {
            return zzfnVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzfnVar.zza(null).intValue();
        }
    }

    public final int zza(String str, zzfn<Integer> zzfnVar, int i, int i2) {
        return Math.max(Math.min(zzb(str, zzfnVar), i2), i);
    }

    final long zzd(String str) {
        return zzc(str, zzbh.zza);
    }

    public static long zzh() {
        return zzbh.zzd.zza(null).longValue();
    }

    public static long zzm() {
        return zzbh.zzad.zza(null).longValue();
    }

    public final long zzc(String str, zzfn<Long> zzfnVar) {
        if (str == null) {
            return zzfnVar.zza(null).longValue();
        }
        String zza = this.zzc.zza(str, zzfnVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfnVar.zza(null).longValue();
        }
        try {
            return zzfnVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzfnVar.zza(null).longValue();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final Bundle zzz() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().zzg().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(zza().getPackageName(), 128);
            if (applicationInfo == null) {
                zzj().zzg().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            zzj().zzg().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
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

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
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

    public final zziq zze(String str) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = zzz.get(str);
        }
        if (obj == null) {
            return zziq.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zziq.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zziq.DENIED;
        }
        if ("default".equals(obj)) {
            return zziq.DEFAULT;
        }
        zzj().zzu().zza("Invalid manifest metadata for", str);
        return zziq.UNINITIALIZED;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    final Boolean zzf(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzz.containsKey(str)) {
            return Boolean.valueOf(zzz.getBoolean(str));
        }
        return null;
    }

    public final String zzn() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final String zzo() {
        return zza("debug.deferred.deeplink", "");
    }

    public final String zzd(String str, zzfn<String> zzfnVar) {
        if (str == null) {
            return zzfnVar.zza(null);
        }
        return zzfnVar.zza(this.zzc.zza(str, zzfnVar.zza()));
    }

    public final String zzp() {
        return this.zzb;
    }

    final String zzg(String str) {
        return zzd(str, zzbh.zzal);
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            zzj().zzg().zza("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            zzj().zzg().zza("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            zzj().zzg().zza("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            zzj().zzg().zza("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List<String> zzh(String str) {
        Integer valueOf;
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
        } else if (zzz.containsKey(str)) {
            valueOf = Integer.valueOf(zzz.getInt(str));
            if (valueOf != null) {
                return null;
            }
            try {
                String[] stringArray = zza().getResources().getStringArray(valueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e) {
                zzj().zzg().zza("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        valueOf = null;
        if (valueOf != null) {
        }
    }

    zzae(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzc = new zzag() { // from class: com.google.android.gms.measurement.internal.zzah
            @Override // com.google.android.gms.measurement.internal.zzag
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    final void zza(zzag zzagVar) {
        this.zzc = zzagVar;
    }

    public final void zzi(String str) {
        this.zzb = str;
    }

    public final boolean zzu() {
        Boolean zzf = zzf("google_analytics_adid_collection_enabled");
        return zzf == null || zzf.booleanValue();
    }

    final boolean zzj(String str) {
        return zzf(str, zzbh.zzak);
    }

    public final boolean zza(zzfn<Boolean> zzfnVar) {
        return zzf(null, zzfnVar);
    }

    public final boolean zze(String str, zzfn<Boolean> zzfnVar) {
        return zzf(str, zzfnVar);
    }

    public final boolean zzf(String str, zzfn<Boolean> zzfnVar) {
        if (str == null) {
            return zzfnVar.zza(null).booleanValue();
        }
        String zza = this.zzc.zza(str, zzfnVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfnVar.zza(null).booleanValue();
        }
        return zzfnVar.zza(Boolean.valueOf("1".equals(zza))).booleanValue();
    }

    public final boolean zzk(String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzv() {
        Boolean zzf = zzf("google_analytics_automatic_screen_reporting_enabled");
        return zzf == null || zzf.booleanValue();
    }

    public final boolean zzw() {
        Boolean zzf = zzf("firebase_analytics_collection_deactivated");
        return zzf != null && zzf.booleanValue();
    }

    public final boolean zzl(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzx() {
        if (this.zza == null) {
            Boolean zzf = zzf("app_measurement_lite");
            this.zza = zzf;
            if (zzf == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzag();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzd == null) {
            synchronized (this) {
                if (this.zzd == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzd = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzd == null) {
                        this.zzd = Boolean.TRUE;
                        zzj().zzg().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzd.booleanValue();
    }
}
