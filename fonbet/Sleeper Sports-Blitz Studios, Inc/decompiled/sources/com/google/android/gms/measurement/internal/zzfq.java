package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.internal.zzin;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzfq extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List<String> zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    final int zzaa() {
        zzu();
        return this.zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzz() {
        return true;
    }

    final int zzab() {
        zzu();
        return this.zzc;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzn zza(String str) {
        long min;
        List<String> list;
        String str2;
        String str3;
        int i;
        String str4;
        zzt();
        String zzad = zzad();
        String zzae = zzae();
        zzu();
        String str5 = this.zzb;
        long zzab = zzab();
        zzu();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        zzu();
        zzt();
        if (this.zze == 0) {
            this.zze = this.zzu.zzt().zza(zza(), zza().getPackageName());
        }
        long j = this.zze;
        boolean zzac = this.zzu.zzac();
        boolean z = !zzk().zzm;
        zzt();
        String zzah = !this.zzu.zzac() ? null : zzah();
        long j2 = 0;
        zzhj zzhjVar = this.zzu;
        long zza = zzhjVar.zzn().zzc.zza();
        if (zza == 0) {
            min = zzhjVar.zza;
        } else {
            min = Math.min(zzhjVar.zza, zza);
        }
        int zzaa = zzaa();
        boolean zzu = zze().zzu();
        zzgl zzk = zzk();
        zzk.zzt();
        boolean z2 = zzk.zzg().getBoolean("deferred_analytics_collection", false);
        String zzac2 = zzac();
        Boolean valueOf = zze().zzf("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r9.booleanValue());
        long j3 = min;
        long j4 = this.zzf;
        List<String> list2 = this.zzg;
        String zzh = zzk().zzn().zzh();
        if (this.zzh == null) {
            this.zzh = zzq().zzp();
        }
        String str7 = this.zzh;
        if (com.google.android.gms.internal.measurement.zznh.zza()) {
            list = list2;
            str2 = str7;
            if (zze().zza(zzbh.zzdb) && !zzk().zzn().zza(zzin.zza.ANALYTICS_STORAGE)) {
                str3 = null;
                Boolean zzf = zze().zzf("google_analytics_sgtm_upload_enabled");
                boolean booleanValue = zzf != null ? false : zzf.booleanValue();
                long zzc = zzq().zzc(zzad());
                int zza2 = zzk().zzn().zza();
                String zzf2 = zzk().zzm().zzf();
                if (zzpd.zza() || !zze().zza(zzbh.zzcc)) {
                    i = 0;
                } else {
                    zzq();
                    i = zznt.zzc();
                }
                if (zzpd.zza() && zze().zza(zzbh.zzcc)) {
                    j2 = zzq().zzh();
                }
                long j5 = j2;
                String zzp = zze().zzp();
                if (!com.google.android.gms.internal.measurement.zznb.zza() && zze().zza(zzbh.zzcx)) {
                    str4 = new zzgi(zze().zze("google_analytics_default_allow_ad_personalization_signals")).zzb();
                } else {
                    str4 = "";
                }
                return new zzn(zzad, zzae, str5, zzab, str6, 95001L, j, str, zzac, z, zzah, 0L, j3, zzaa, zzu, z2, zzac2, valueOf, j4, list, (String) null, zzh, str2, str3, booleanValue, zzc, zza2, zzf2, i, j5, zzp, str4);
            }
        } else {
            list = list2;
            str2 = str7;
        }
        zzt();
        if (this.zzm != 0) {
            long currentTimeMillis = zzb().currentTimeMillis() - this.zzm;
            if (this.zzl != null && currentTimeMillis > 86400000 && this.zzn == null) {
                zzag();
            }
        }
        if (this.zzl == null) {
            zzag();
        }
        str3 = this.zzl;
        Boolean zzf3 = zze().zzf("google_analytics_sgtm_upload_enabled");
        if (zzf3 != null) {
        }
        long zzc2 = zzq().zzc(zzad());
        int zza22 = zzk().zzn().zza();
        String zzf22 = zzk().zzm().zzf();
        if (zzpd.zza()) {
        }
        i = 0;
        if (zzpd.zza()) {
            j2 = zzq().zzh();
        }
        long j52 = j2;
        String zzp2 = zze().zzp();
        if (!com.google.android.gms.internal.measurement.zznb.zza()) {
        }
        str4 = "";
        return new zzn(zzad, zzae, str5, zzab, str6, 95001L, j, str, zzac, z, zzah, 0L, j3, zzaa, zzu, z2, zzac2, valueOf, j4, list, (String) null, zzh, str2, str3, booleanValue, zzc2, zza22, zzf22, i, j52, zzp2, str4);
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

    final String zzac() {
        zzu();
        return this.zzk;
    }

    final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    private final String zzah() {
        if (zzpu.zza() && zze().zza(zzbh.zzbn)) {
            zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    final List<String> zzaf() {
        return this.zzg;
    }

    zzfq(zzhj zzhjVar, long j) {
        super(zzhjVar);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = j;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0190 A[Catch: IllegalStateException -> 0x01c6, TryCatch #3 {IllegalStateException -> 0x01c6, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01a9, B:27:0x01bd, B:28:0x01c2, B:30:0x01c0), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a9 A[Catch: IllegalStateException -> 0x01c6, TryCatch #3 {IllegalStateException -> 0x01c6, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01a9, B:27:0x01bd, B:28:0x01c2, B:30:0x01c0), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzx() {
        String str;
        Object[] objArr;
        int zzc;
        boolean z;
        List<String> zzh;
        String zza;
        String packageName = zza().getPackageName();
        PackageManager packageManager = zza().getPackageManager();
        String str2 = "";
        String str3 = "unknown";
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzj().zzg().zza("PackageManager is null, app identity information might be inaccurate. appId", zzfw.zza(packageName));
        } else {
            try {
                str3 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzj().zzg().zza("Error retrieving app installer package name. appId", zzfw.zza(packageName));
            }
            if (str3 == null) {
                str3 = "manual_install";
            } else if ("com.android.vending".equals(str3)) {
                str3 = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(zza().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String obj = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    try {
                        str4 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str4;
                        str4 = obj;
                        zzj().zzg().zza("Error retrieving package info. appId, appName", zzfw.zza(packageName), str4);
                        str4 = str;
                        this.zza = packageName;
                        this.zzd = str3;
                        this.zzb = str4;
                        this.zzc = i;
                        this.zze = 0L;
                        if (TextUtils.isEmpty(this.zzu.zzu())) {
                        }
                        zzc = this.zzu.zzc();
                        switch (zzc) {
                        }
                        if (zzc == 0) {
                        }
                        this.zzj = "";
                        this.zzk = "";
                        if (objArr != false) {
                        }
                        zza = new zzhd(zza(), this.zzu.zzx()).zza("google_app_id");
                        if (TextUtils.isEmpty(zza)) {
                        }
                        this.zzj = str2;
                        if (!TextUtils.isEmpty(zza)) {
                        }
                        if (z) {
                        }
                        this.zzg = null;
                        zzh = zze().zzh("analytics.safelisted_events");
                        if (zzh != null) {
                        }
                        this.zzg = zzh;
                        if (packageManager != null) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
        }
        this.zza = packageName;
        this.zzd = str3;
        this.zzb = str4;
        this.zzc = i;
        this.zze = 0L;
        objArr = TextUtils.isEmpty(this.zzu.zzu()) && "am".equals(this.zzu.zzv());
        zzc = this.zzu.zzc();
        switch (zzc) {
            case 0:
                zzj().zzp().zza("App measurement collection enabled");
                break;
            case 1:
                zzj().zzn().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                zzj().zzp().zza("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzj().zzn().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzj().zzn().zza("App measurement disabled via the manifest");
                break;
            case 5:
                zzj().zzp().zza("App measurement disabled via the init parameters");
                break;
            case 6:
                zzj().zzv().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzj().zzn().zza("App measurement disabled via the global data collection setting");
                break;
            case 8:
                zzj().zzn().zza("App measurement disabled due to denied storage consent");
                break;
            default:
                zzj().zzn().zza("App measurement disabled");
                zzj().zzm().zza("Invalid scion state in identity");
                break;
        }
        z = zzc == 0;
        this.zzj = "";
        this.zzk = "";
        if (objArr != false) {
            this.zzk = this.zzu.zzu();
        }
        try {
            zza = new zzhd(zza(), this.zzu.zzx()).zza("google_app_id");
            if (TextUtils.isEmpty(zza)) {
                str2 = zza;
            }
            this.zzj = str2;
            if (!TextUtils.isEmpty(zza)) {
                this.zzk = new zzhd(zza(), this.zzu.zzx()).zza("admob_app_id");
            }
            if (z) {
                zzj().zzp().zza("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzj) ? this.zzk : this.zzj);
            }
        } catch (IllegalStateException e) {
            zzj().zzg().zza("Fetching Google App Id failed with exception. appId", zzfw.zza(packageName), e);
        }
        this.zzg = null;
        zzh = zze().zzh("analytics.safelisted_events");
        if (zzh != null) {
            if (zzh.isEmpty()) {
                zzj().zzv().zza("Safelisted event list is empty. Ignoring");
            } else {
                Iterator<String> it = zzh.iterator();
                while (it.hasNext()) {
                    if (!zzq().zzb("safelisted event", it.next())) {
                    }
                }
            }
            if (packageManager != null) {
                this.zzi = InstantApps.isInstantApp(zza()) ? 1 : 0;
                return;
            } else {
                this.zzi = 0;
                return;
            }
        }
        this.zzg = zzh;
        if (packageManager != null) {
        }
    }

    final void zzag() {
        String format;
        zzt();
        if (!zzk().zzn().zza(zzin.zza.ANALYTICS_STORAGE)) {
            zzj().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            zzq().zzv().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzj().zzc().zza(String.format("Resetting session stitching token to %s", format == null ? AbstractJsonLexerKt.NULL : "not null"));
        this.zzl = format;
        this.zzm = zzb().currentTimeMillis();
    }

    final boolean zzb(String str) {
        String str2 = this.zzn;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.zzn = str;
        return z;
    }
}
