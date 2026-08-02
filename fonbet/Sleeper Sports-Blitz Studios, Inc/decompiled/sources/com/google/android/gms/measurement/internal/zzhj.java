package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.measurement.internal.zzin;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public class zzhj implements zzil {
    private static volatile zzhj zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzad zzh;
    private final zzae zzi;
    private final zzgl zzj;
    private final zzfw zzk;
    private final zzhg zzl;
    private final zzml zzm;
    private final zznt zzn;
    private final zzfv zzo;
    private final Clock zzp;
    private final zzks zzq;
    private final zziz zzr;
    private final zza zzs;
    private final zzkn zzt;
    private final String zzu;
    private zzft zzv;
    private zzlb zzw;
    private zzaz zzx;
    private zzfq zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzw()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean zzv = zzn().zzv();
        if (zzv != null) {
            return zzv.booleanValue() ? 0 : 3;
        }
        Boolean zzf = this.zzi.zzf("firebase_analytics_collection_enabled");
        if (zzf != null) {
            return zzf.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzad;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    @Pure
    public final zza zze() {
        zza zzaVar = this.zzs;
        if (zzaVar != null) {
            return zzaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzad zzd() {
        return this.zzh;
    }

    @Pure
    public final zzae zzf() {
        return this.zzi;
    }

    @Pure
    public final zzaz zzg() {
        zza((zzim) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzfq zzh() {
        zza((zzg) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzft zzi() {
        zza((zzg) this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzfv zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzfw zzj() {
        zza((zzim) this.zzk);
        return this.zzk;
    }

    public final zzfw zzm() {
        zzfw zzfwVar = this.zzk;
        if (zzfwVar == null || !zzfwVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzgl zzn() {
        zza((zzij) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Pure
    public final zzhg zzl() {
        zza((zzim) this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    final zzhg zzo() {
        return this.zzl;
    }

    public static zzhj zza(Context context, com.google.android.gms.internal.measurement.zzdl zzdlVar, Long l) {
        if (zzdlVar != null && (zzdlVar.zze == null || zzdlVar.zzf == null)) {
            zzdlVar = new com.google.android.gms.internal.measurement.zzdl(zzdlVar.zza, zzdlVar.zzb, zzdlVar.zzc, zzdlVar.zzd, null, null, zzdlVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhj.class) {
                if (zzb == null) {
                    zzb = new zzhj(new zzix(context, zzdlVar, l));
                }
            }
        } else if (zzdlVar != null && zzdlVar.zzg != null && zzdlVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdlVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @Pure
    public final zziz zzp() {
        zza((zzg) this.zzr);
        return this.zzr;
    }

    @Pure
    private final zzkn zzai() {
        zza((zzim) this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzks zzq() {
        zza((zzg) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzlb zzr() {
        zza((zzg) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zzml zzs() {
        zza((zzg) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zznt zzt() {
        zza((zzij) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzu() {
        return this.zzd;
    }

    @Pure
    public final String zzv() {
        return this.zze;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzu;
    }

    static /* synthetic */ void zza(zzhj zzhjVar, zzix zzixVar) {
        zzhjVar.zzl().zzt();
        zzaz zzazVar = new zzaz(zzhjVar);
        zzazVar.zzad();
        zzhjVar.zzx = zzazVar;
        zzfq zzfqVar = new zzfq(zzhjVar, zzixVar.zzf);
        zzfqVar.zzv();
        zzhjVar.zzy = zzfqVar;
        zzft zzftVar = new zzft(zzhjVar);
        zzftVar.zzv();
        zzhjVar.zzv = zzftVar;
        zzlb zzlbVar = new zzlb(zzhjVar);
        zzlbVar.zzv();
        zzhjVar.zzw = zzlbVar;
        zzhjVar.zzn.zzae();
        zzhjVar.zzj.zzae();
        zzhjVar.zzy.zzw();
        zzhjVar.zzj().zzn().zza("App measurement initialized, version", 95001L);
        zzhjVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzad = zzfqVar.zzad();
        if (TextUtils.isEmpty(zzhjVar.zzd)) {
            if (zzhjVar.zzt().zzd(zzad, zzhjVar.zzi.zzp())) {
                zzhjVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhjVar.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzad);
            }
        }
        zzhjVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhjVar.zzag != zzhjVar.zzai.get()) {
            zzhjVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhjVar.zzag), Integer.valueOf(zzhjVar.zzai.get()));
        }
        zzhjVar.zzz = true;
    }

    private zzhj(zzix zzixVar) {
        long currentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzixVar);
        zzad zzadVar = new zzad(zzixVar.zza);
        this.zzh = zzadVar;
        zzfk.zza = zzadVar;
        Context context = zzixVar.zza;
        this.zzc = context;
        this.zzd = zzixVar.zzb;
        this.zze = zzixVar.zzc;
        this.zzf = zzixVar.zzd;
        this.zzg = zzixVar.zzh;
        this.zzac = zzixVar.zze;
        this.zzu = zzixVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdl zzdlVar = zzixVar.zzg;
        if (zzdlVar != null && zzdlVar.zzg != null) {
            Object obj = zzdlVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdlVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzgw.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        if (zzixVar.zzi != null) {
            currentTimeMillis = zzixVar.zzi.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzae(this);
        zzgl zzglVar = new zzgl(this);
        zzglVar.zzad();
        this.zzj = zzglVar;
        zzfw zzfwVar = new zzfw(this);
        zzfwVar.zzad();
        this.zzk = zzfwVar;
        zznt zzntVar = new zznt(this);
        zzntVar.zzad();
        this.zzn = zzntVar;
        this.zzo = new zzfv(new zziw(zzixVar, this));
        this.zzs = new zza(this);
        zzks zzksVar = new zzks(this);
        zzksVar.zzv();
        this.zzq = zzksVar;
        zziz zzizVar = new zziz(this);
        zzizVar.zzv();
        this.zzr = zzizVar;
        zzml zzmlVar = new zzml(this);
        zzmlVar.zzv();
        this.zzm = zzmlVar;
        zzkn zzknVar = new zzkn(this);
        zzknVar.zzad();
        this.zzt = zzknVar;
        zzhg zzhgVar = new zzhg(this);
        zzhgVar.zzad();
        this.zzl = zzhgVar;
        if (zzixVar.zzg != null && zzixVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzp().zzb(z2);
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzhgVar.zzb(new zzho(this, zzixVar));
    }

    private static void zza(zzij zzijVar) {
        if (zzijVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzgVar.zzy()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzgVar.getClass()));
    }

    private static void zza(zzim zzimVar) {
        if (zzimVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzimVar.zzaf()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzimVar.getClass()));
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }

    final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "");
            if (TextUtils.isEmpty(optString)) {
                zzj().zzc().zza("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            String optString4 = jSONObject.optString("gad_source", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            if (zzok.zza() && this.zzi.zza(zzbh.zzco)) {
                if (!zzt().zzi(optString)) {
                    zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("gbraid", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("gad_source", optString4);
                }
                long longValue = Double.valueOf(optDouble).longValue();
                if (longValue > 0) {
                    bundle.putLong("click_timestamp", longValue);
                }
            } else if (!zzt().zzi(optString)) {
                zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            if (zzok.zza()) {
                this.zzi.zza(zzbh.zzco);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zzc("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
            zznt zzt = zzt();
            if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                return;
            }
            zzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    final void zzaa() {
        this.zzag++;
    }

    final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final void zzb(boolean z) {
        zzl().zzt();
        this.zzaf = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ee, code lost:
    
        if (r1.zzk() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0163, code lost:
    
        if (r1.zzk() != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdl zzdlVar) {
        zzin zzinVar;
        Boolean zza;
        zzax zza2;
        zzl().zzt();
        if (zzpd.zza() && this.zzi.zza(zzbh.zzcc) && zzt().zzw()) {
            zznt zzt = zzt();
            zzt.zzt();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            ContextCompat.registerReceiver(zzt.zza(), new zzo(zzt.zzu), intentFilter, 2);
            zzt.zzj().zzc().zza("Registered app receiver");
        }
        zzin zzn = zzn().zzn();
        int zza3 = zzn.zza();
        if (com.google.android.gms.internal.measurement.zznb.zza() && this.zzi.zza(zzbh.zzcx)) {
            zziq zze = this.zzi.zze("google_analytics_default_allow_ad_storage");
            zziq zze2 = this.zzi.zze("google_analytics_default_allow_analytics_storage");
            if ((zze != zziq.UNINITIALIZED || zze2 != zziq.UNINITIALIZED) && zzn().zza(-10)) {
                zzinVar = zzin.zza(zze, zze2, -10);
            } else {
                if (!TextUtils.isEmpty(zzh().zzae()) && (zza3 == 0 || zza3 == 30 || zza3 == 10 || zza3 == 30 || zza3 == 30 || zza3 == 40)) {
                    zzp().zza(new zzin(null, null, -10), this.zza, false);
                } else if (TextUtils.isEmpty(zzh().zzae()) && zzdlVar != null && zzdlVar.zzg != null && zzn().zza(30)) {
                    zzinVar = zzin.zza(zzdlVar.zzg, 30);
                }
                zzinVar = null;
            }
        } else {
            Boolean zzf = this.zzi.zzf("google_analytics_default_allow_ad_storage");
            Boolean zzf2 = this.zzi.zzf("google_analytics_default_allow_analytics_storage");
            if ((zzf != null || zzf2 != null) && zzn().zza(-10)) {
                zzinVar = new zzin(zzf, zzf2, -10);
            } else {
                if (!TextUtils.isEmpty(zzh().zzae()) && (zza3 == 0 || zza3 == 30 || zza3 == 10 || zza3 == 30 || zza3 == 30 || zza3 == 40)) {
                    zzp().zza(new zzin(null, null, -10), this.zza, false);
                } else if (TextUtils.isEmpty(zzh().zzae()) && zzdlVar != null && zzdlVar.zzg != null && zzn().zza(30)) {
                    zzinVar = zzin.zza(zzdlVar.zzg, 30);
                }
                zzinVar = null;
            }
        }
        if (zzinVar != null) {
            zzp().zza(zzinVar, this.zza, this.zzi.zza(zzbh.zzda));
            zzn = zzinVar;
        }
        zzp().zza(zzn);
        int zza4 = zzn().zzm().zza();
        if (com.google.android.gms.internal.measurement.zznb.zza() && this.zzi.zza(zzbh.zzcx)) {
            zziq zze3 = this.zzi.zze("google_analytics_default_allow_ad_user_data");
            if (zze3 != zziq.UNINITIALIZED && zzin.zza(-10, zza4)) {
                zzp().zza(zzax.zza(zze3, -10), this.zzi.zza(zzbh.zzda));
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
                zza2 = zzax.zza(zzdlVar.zzg, 30);
                if (zza2.zzg()) {
                }
            }
            if (TextUtils.isEmpty(zzh().zzae())) {
                zzp().zza(zzdlVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza.toString(), false);
            }
        } else {
            Boolean zzf3 = this.zzi.zzf("google_analytics_default_allow_ad_user_data");
            if (zzf3 != null && zzin.zza(-10, zza4)) {
                zzp().zza(new zzax(zzf3, -10), this.zzi.zza(zzbh.zzda));
            }
            if (TextUtils.isEmpty(zzh().zzae()) && (zza4 == 0 || zza4 == 30)) {
                zzp().zza(new zzax(null, -10), this.zzi.zza(zzbh.zzda));
            } else {
                if (TextUtils.isEmpty(zzh().zzae()) && zzdlVar != null && zzdlVar.zzg != null && zzin.zza(30, zza4)) {
                    zza2 = zzax.zza(zzdlVar.zzg, 30);
                    if (zza2.zzg()) {
                        zzp().zza(zza2, this.zzi.zza(zzbh.zzda));
                    }
                }
                if (TextUtils.isEmpty(zzh().zzae()) && zzdlVar != null && zzdlVar.zzg != null && zzn().zzh.zza() == null && (zza = zzax.zza(zzdlVar.zzg)) != null) {
                    zzp().zza(zzdlVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza.toString(), false);
                }
            }
        }
        if (zzpp.zza() && this.zzi.zza(zzbh.zzcu)) {
            Boolean zzf4 = this.zzi.zzf("google_analytics_tcf_data_enabled");
            if (zzf4 == null ? true : zzf4.booleanValue()) {
                zzj().zzc().zza("TCF client enabled.");
                zzp().zzas();
                zzp().zzaq();
            }
        }
        if (zzn().zzc.zza() == 0) {
            zzj().zzp().zza("Persisting first open", Long.valueOf(this.zza));
            zzn().zzc.zza(this.zza);
        }
        zzp().zza.zzb();
        if (!zzaf()) {
            if (zzac()) {
                if (!zzt().zze("android.permission.INTERNET")) {
                    zzj().zzg().zza("App is missing INTERNET permission");
                }
                if (!zzt().zze("android.permission.ACCESS_NETWORK_STATE")) {
                    zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzx()) {
                    if (!zznt.zza(this.zzc)) {
                        zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zznt.zza(this.zzc, false)) {
                        zzj().zzg().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzj().zzg().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                zzt();
                if (zznt.zza(zzh().zzae(), zzn().zzy(), zzh().zzac(), zzn().zzx())) {
                    zzj().zzn().zza("Rechecking which service to use due to a GMP App Id change");
                    zzn().zzz();
                    zzi().zzaa();
                    this.zzw.zzae();
                    this.zzw.zzad();
                    zzn().zzc.zza(this.zza);
                    zzn().zze.zza(null);
                }
                zzn().zzc(zzh().zzae());
                zzn().zzb(zzh().zzac());
            }
            if (!zzn().zzn().zza(zzin.zza.ANALYTICS_STORAGE)) {
                zzn().zze.zza(null);
            }
            zzp().zzc(zzn().zze.zza());
            if (!zzt().zzx() && !TextUtils.isEmpty(zzn().zzq.zza())) {
                zzj().zzu().zza("Remote config removed with active feature rollouts");
                zzn().zzq.zza(null);
            }
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                boolean zzac = zzac();
                if (!zzn().zzab() && !this.zzi.zzw()) {
                    zzn().zzb(!zzac);
                }
                if (zzac) {
                    zzp().zzam();
                }
                zzs().zza.zza();
                zzr().zza(new AtomicReference<>());
                zzr().zza(zzn().zzt.zza());
            }
        }
        if (zzpd.zza() && this.zzi.zza(zzbh.zzcc) && zzt().zzw()) {
            final zziz zzp = zzp();
            Objects.requireNonNull(zzp);
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                @Override // java.lang.Runnable
                public final void run() {
                    zziz.this.zzao();
                }
            }).start();
        }
        zzn().zzj.zza(true);
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return zzc() == 0;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @Pure
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzx() || (zznt.zza(this.zzc) && zznt.zza(this.zzc, false))));
            this.zzaa = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    @Pure
    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        zzl().zzt();
        zza((zzim) zzai());
        String zzad = zzh().zzad();
        Pair<String, Boolean> zza = zzn().zza(zzad);
        if (!this.zzi.zzu() || ((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!zzai().zzc()) {
            zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzlb zzr = zzr();
        zzr.zzt();
        zzr.zzu();
        if (!zzr.zzao() || zzr.zzq().zzg() >= 234200) {
            zzal zzab = zzp().zzab();
            Bundle bundle = zzab != null ? zzab.zza : null;
            if (bundle == null) {
                int i = this.zzah;
                this.zzah = i + 1;
                boolean z = i < 10;
                zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.zzah));
                return z;
            }
            zzin zza2 = zzin.zza(bundle, 100);
            sb.append("&gcs=");
            sb.append(zza2.zzg());
            zzax zza3 = zzax.zza(bundle, 100);
            sb.append("&dma=");
            sb.append(zza3.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zza3.zze())) {
                sb.append("&dma_cps=");
                sb.append(zza3.zze());
            }
            int i2 = zzax.zza(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i2);
            zzj().zzp().zza("Consent query parameters to Bow", sb);
        }
        zznt zzt = zzt();
        zzh();
        URL zza4 = zzt.zza(95001L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
        if (zza4 != null) {
            zzkn zzai = zzai();
            zzkm zzkmVar = new zzkm() { // from class: com.google.android.gms.measurement.internal.zzhl
                @Override // com.google.android.gms.measurement.internal.zzkm
                public final void zza(String str, int i3, Throwable th, byte[] bArr, Map map) {
                    zzhj.this.zza(str, i3, th, bArr, map);
                }
            };
            zzai.zzt();
            zzai.zzac();
            Preconditions.checkNotNull(zza4);
            Preconditions.checkNotNull(zzkmVar);
            zzai.zzl().zza(new zzkp(zzai, zzad, zza4, null, null, zzkmVar));
        }
        return false;
    }
}
