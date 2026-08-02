package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzel extends zzf {
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

    zzel(zzge zzgeVar, long j) {
        super(zzgeVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:66|67|(1:69)(2:84|(1:86))|70|71|(20:73|(1:75)(1:82)|77|78|5|(1:65)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:54)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|65|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01db, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01dc, code lost:
    
        r11.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0194 A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bc, B:30:0x01d2, B:31:0x01d7, B:33:0x01d5), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bc A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bc, B:30:0x01d2, B:31:0x01d7, B:33:0x01d5), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzd() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z;
        int zza;
        List zzp;
        String zzc;
        String packageName = this.zzt.zzaw().getPackageName();
        PackageManager packageManager = this.zzt.zzaw().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String str5 = "unknown";
        if (packageManager == null) {
            this.zzt.zzaA().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeu.zzn(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzt.zzaA().zzd().zzb("Error retrieving app installer package name. appId", zzeu.zzn(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzt.zzaw().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzt.zzaA().zzd().zzc("Error retrieving package info. appId, appName", zzeu.zzn(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    if (TextUtils.isEmpty(this.zzt.zzw())) {
                    }
                    zza = this.zzt.zza();
                    switch (zza) {
                    }
                    this.zzk = "";
                    this.zzl = "";
                    this.zzt.zzay();
                    if (z) {
                    }
                    zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
                    if (!TextUtils.isEmpty(zzc)) {
                    }
                    this.zzk = str3;
                    if (!TextUtils.isEmpty(zzc)) {
                    }
                    if (zza == 0) {
                    }
                    this.zzh = null;
                    this.zzt.zzay();
                    zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                    if (zzp != null) {
                    }
                    this.zzh = zzp;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                z = TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx());
                zza = this.zzt.zza();
                switch (zza) {
                    case 0:
                        this.zzt.zzaA().zzj().zza("App measurement collection enabled");
                        break;
                    case 1:
                        this.zzt.zzaA().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        this.zzt.zzaA().zzj().zza("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzt.zzaA().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        this.zzt.zzaA().zzj().zza("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzt.zzaA().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzt.zzaA().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzt.zzay();
                if (z) {
                    this.zzl = this.zzt.zzw();
                }
                zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
                if (!TextUtils.isEmpty(zzc)) {
                    str3 = zzc;
                }
                this.zzk = str3;
                if (!TextUtils.isEmpty(zzc)) {
                    Context zzaw = this.zzt.zzaw();
                    String zzz = this.zzt.zzz();
                    Preconditions.checkNotNull(zzaw);
                    Resources resources = zzaw.getResources();
                    if (TextUtils.isEmpty(zzz)) {
                        zzz = zzfw.zza(zzaw);
                    }
                    this.zzl = zzfw.zzb("admob_app_id", resources, zzz);
                }
                if (zza == 0) {
                    this.zzt.zzaA().zzj().zzc("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk);
                }
                this.zzh = null;
                this.zzt.zzay();
                zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                if (zzp != null) {
                    if (zzp.isEmpty()) {
                        this.zzt.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzp.iterator();
                        while (it.hasNext()) {
                            if (!this.zzt.zzv().zzac("safelisted event", (String) it.next())) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzj = InstantApps.isInstantApp(this.zzt.zzaw()) ? 1 : 0;
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
        str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
        }
        zza = this.zzt.zza();
        switch (zza) {
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzay();
        if (z) {
        }
        zzc = zzip.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
        if (!TextUtils.isEmpty(zzc)) {
        }
        this.zzk = str3;
        if (!TextUtils.isEmpty(zzc)) {
        }
        if (zza == 0) {
        }
        this.zzh = null;
        this.zzt.zzay();
        zzp = this.zzt.zzf().zzp("analytics.safelisted_events");
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzq, still in use, count: 2, list:
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x01ac: MOVE (r13v10 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
          (r2v0 com.google.android.gms.measurement.internal.zzq) from 0x01a8: MOVE (r13v13 com.google.android.gms.measurement.internal.zzq) = (r2v0 com.google.android.gms.measurement.internal.zzq)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzel.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
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
        zzg();
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
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        }
        this.zzt.zzaA().zzc().zza(String.format("Resetting session stitching token to %s", format == null ? AbstractJsonLexerKt.NULL : "not null"));
        this.zzm = format;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
