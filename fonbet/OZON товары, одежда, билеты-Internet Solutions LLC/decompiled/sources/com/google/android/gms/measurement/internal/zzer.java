package com.google.android.gms.measurement.internal;

import T7.E;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzof;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzer extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzer(zzgk zzgkVar, long j11) {
        super(zzgkVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:66|67|(1:69)(2:84|(1:86))|70|71|(20:73|(1:75)(1:82)|77|78|5|(1:65)(1:9)|10|11|13|(1:15)|16|17|(1:19)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|65|10|11|13|(0)|16|17|(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a2, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c5, code lost:
    
        r11.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r0), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:17:0x015a, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a6, B:30:0x01bc, B:31:0x01c1, B:33:0x01bf), top: B:16:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:17:0x015a, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a6, B:30:0x01bc, B:31:0x01c1, B:33:0x01bf), top: B:16:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b6  */
    @Override // com.google.android.gms.measurement.internal.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzd() {
        String str;
        String str2;
        PackageInfo packageInfo;
        Object[] objArr;
        int zza;
        List zzp;
        String zzc;
        String packageName = this.zzs.zzau().getPackageName();
        PackageManager packageManager = this.zzs.zzau().getPackageManager();
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        String str3 = "unknown";
        String str4 = "Unknown";
        if (packageManager == null) {
            this.zzs.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzfa.zzn(packageName));
        } else {
            try {
                str3 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzs.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzfa.zzn(packageName));
            }
            if (str3 == null) {
                str3 = "manual_install";
            } else if ("com.android.vending".equals(str3)) {
                str3 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzs.zzau().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i11 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzs.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzfa.zzn(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str3;
                    this.zzb = str4;
                    this.zzc = i11;
                    this.zze = str2;
                    this.zzf = 0L;
                    if (TextUtils.isEmpty(this.zzs.zzw())) {
                    }
                    zza = this.zzs.zza();
                    switch (zza) {
                    }
                    this.zzk = "";
                    this.zzl = "";
                    this.zzs.zzaw();
                    if (objArr != false) {
                    }
                    zzc = zziv.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
                    this.zzk = true != TextUtils.isEmpty(zzc) ? zzc : "";
                    if (!TextUtils.isEmpty(zzc)) {
                    }
                    if (zza == 0) {
                    }
                    this.zzh = null;
                    this.zzs.zzaw();
                    zzp = this.zzs.zzf().zzp("analytics.safelisted_events");
                    if (zzp != null) {
                    }
                    this.zzh = zzp;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str3;
                this.zzb = str4;
                this.zzc = i11;
                this.zze = str2;
                this.zzf = 0L;
                objArr = TextUtils.isEmpty(this.zzs.zzw()) && "am".equals(this.zzs.zzx());
                zza = this.zzs.zza();
                switch (zza) {
                    case 0:
                        E.g(this.zzs, "App measurement collection enabled");
                        break;
                    case 1:
                        this.zzs.zzay().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        E.g(this.zzs, "App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzs.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        E.g(this.zzs, "App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzs.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzs.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzs.zzaw();
                if (objArr != false) {
                    this.zzl = this.zzs.zzw();
                }
                zzc = zziv.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
                this.zzk = true != TextUtils.isEmpty(zzc) ? zzc : "";
                if (!TextUtils.isEmpty(zzc)) {
                    Context zzau = this.zzs.zzau();
                    String zzz = this.zzs.zzz();
                    Preconditions.checkNotNull(zzau);
                    Resources resources = zzau.getResources();
                    if (TextUtils.isEmpty(zzz)) {
                        zzz = zzgc.zza(zzau);
                    }
                    this.zzl = zzgc.zzb("admob_app_id", resources, zzz);
                }
                if (zza == 0) {
                    this.zzs.zzay().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk);
                }
                this.zzh = null;
                this.zzs.zzaw();
                zzp = this.zzs.zzf().zzp("analytics.safelisted_events");
                if (zzp != null) {
                    if (zzp.isEmpty()) {
                        this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzp.iterator();
                        while (it.hasNext()) {
                            if (!this.zzs.zzv().zzab("safelisted event", (String) it.next())) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzj = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
                        return;
                    } else {
                        this.zzj = 0;
                        return;
                    }
                }
                this.zzh = zzp;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str3;
        this.zzb = str4;
        this.zzc = i11;
        this.zze = str2;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzs.zzw())) {
        }
        zza = this.zzs.zza();
        switch (zza) {
        }
        this.zzk = "";
        this.zzl = "";
        this.zzs.zzaw();
        if (objArr != false) {
        }
        zzc = zziv.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
        this.zzk = true != TextUtils.isEmpty(zzc) ? zzc : "";
        if (!TextUtils.isEmpty(zzc)) {
        }
        if (zza == 0) {
        }
        this.zzh = null;
        this.zzs.zzaw();
        zzp = this.zzs.zzf().zzp("analytics.safelisted_events");
        if (zzp != null) {
        }
        this.zzh = zzp;
        if (packageManager == null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        zza();
        return this.zzj;
    }

    final int zzi() {
        zza();
        return this.zzc;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzq, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x016f: MOVE (r20v0 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x015d: MOVE (r20v2 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x0138: MOVE (r20v3 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x00e8: MOVE (r20v5 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzer.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    final String zzk() {
        zza();
        return this.zzl;
    }

    final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzm() {
        zzof.zzc();
        if (this.zzs.zzf().zzs(null, zzen.zzal)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    final List zzn() {
        return this.zzh;
    }

    final void zzo() {
        String format;
        zzg();
        if (this.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzs.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzs.zzay().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        }
        this.zzs.zzay().zzc().zza("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = this.zzs.zzav().currentTimeMillis();
    }

    final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z11 = false;
        if (str2 != null && !str2.equals(str)) {
            z11 = true;
        }
        this.zzo = str;
        return z11;
    }
}
