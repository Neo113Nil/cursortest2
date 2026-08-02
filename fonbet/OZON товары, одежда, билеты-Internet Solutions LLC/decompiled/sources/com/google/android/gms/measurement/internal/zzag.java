package com.google.android.gms.measurement.internal;

import N3.C3661l;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes.dex */
public final class zzag extends zzhd {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    zzag(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzen.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e11) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e11);
            return "";
        } catch (IllegalAccessException e12) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e12);
            return "";
        } catch (NoSuchMethodException e13) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e13);
            return "";
        } catch (InvocationTargetException e14) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e14);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzen.zzc.zza(null)).longValue();
    }

    public final double zza(String str, zzem zzemVar) {
        if (str == null) {
            return ((Double) zzemVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzemVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzemVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzemVar.zza(null)).doubleValue();
        }
    }

    final int zzb(String str) {
        return zzf(str, zzen.zzG, CounterView.COUNTER_MAX_DEFAULT, 2000);
    }

    public final int zzc() {
        zzlt zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() < 201500) {
            return (zzj == null || zzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzen.zzH, 25, 100);
    }

    public final int zze(String str, zzem zzemVar) {
        if (str == null) {
            return ((Integer) zzemVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzemVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzemVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzemVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzem zzemVar, int i11, int i12) {
        return Math.max(Math.min(zze(str, zzemVar), i12), i11);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 64000L;
    }

    public final long zzi(String str, zzem zzemVar) {
        if (str == null) {
            return ((Long) zzemVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzemVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzemVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzemVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e11);
            return null;
        }
    }

    @VisibleForTesting
    final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            C3661l.b(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzem zzemVar) {
        return str == null ? (String) zzemVar.zza(null) : (String) zzemVar.zza(this.zzb.zza(str, zzemVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zzp(String str) {
        Integer valueOf;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle zzj = zzj();
        if (zzj == null) {
            C3661l.b(this.zzs, "Failed to load metadata: Metadata bundle is null");
        } else if (zzj.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(zzj.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.zzs.zzau().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e11) {
                    this.zzs.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e11);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzs(String str, zzem zzemVar) {
        if (str == null) {
            return ((Boolean) zzemVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zzb());
        return TextUtils.isEmpty(zza) ? ((Boolean) zzemVar.zza(null)).booleanValue() : ((Boolean) zzemVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z11 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z11 = true;
                            }
                            this.zzc = Boolean.valueOf(z11);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
