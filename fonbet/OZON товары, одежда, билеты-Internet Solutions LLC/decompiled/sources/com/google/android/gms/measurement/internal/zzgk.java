package com.google.android.gms.measurement.internal;

import N3.C3661l;
import T7.E;
import U7.C4056a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzgk implements zzhf {
    private static volatile zzgk zzd;
    private zzer zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;

    @VisibleForTesting
    protected Boolean zza;

    @VisibleForTesting
    protected Boolean zzb;

    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfp zzl;
    private final zzfa zzm;
    private final zzgh zzn;
    private final zzku zzo;
    private final zzlt zzp;
    private final zzev zzq;
    private final Clock zzr;
    private final zzje zzs;
    private final zzip zzt;
    private final zzd zzu;
    private final zzit zzv;
    private final String zzw;
    private zzet zzx;
    private zzke zzy;
    private zzaq zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    zzgk(zzhn zzhnVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzhnVar);
        Context context = zzhnVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzek.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhnVar.zzb;
        this.zzg = zzhnVar.zzc;
        this.zzh = zzhnVar.zzd;
        this.zzi = zzhnVar.zzh;
        this.zzE = zzhnVar.zze;
        this.zzw = zzhnVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhnVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhy.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l11 = zzhnVar.zzi;
        this.zzc = l11 != null ? l11.longValue() : defaultClock.currentTimeMillis();
        this.zzk = new zzag(this);
        zzfp zzfpVar = new zzfp(this);
        zzfpVar.zzv();
        this.zzl = zzfpVar;
        zzfa zzfaVar = new zzfa(this);
        zzfaVar.zzv();
        this.zzm = zzfaVar;
        zzlt zzltVar = new zzlt(this);
        zzltVar.zzv();
        this.zzp = zzltVar;
        this.zzq = new zzev(new zzhm(zzhnVar, this));
        this.zzu = new zzd(this);
        zzje zzjeVar = new zzje(this);
        zzjeVar.zzb();
        this.zzs = zzjeVar;
        zzip zzipVar = new zzip(this);
        zzipVar.zzb();
        this.zzt = zzipVar;
        zzku zzkuVar = new zzku(this);
        zzkuVar.zzb();
        this.zzo = zzkuVar;
        zzit zzitVar = new zzit(this);
        zzitVar.zzv();
        this.zzv = zzitVar;
        zzgh zzghVar = new zzgh(this);
        zzghVar.zzv();
        this.zzn = zzghVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhnVar.zzg;
        boolean z11 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzip zzq = zzq();
            if (zzq.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzs.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzio(zzq, null);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    E.g(zzq.zzs, "Registered activity lifecycle callback");
                }
            }
        } else {
            C4056a.a(this, "Application context is not an Application");
        }
        zzghVar.zzp(new zzgj(this, zzhnVar));
    }

    static /* bridge */ /* synthetic */ void zzA(zzgk zzgkVar, zzhn zzhnVar) {
        zzgkVar.zzaz().zzg();
        zzgkVar.zzk.zzn();
        zzaq zzaqVar = new zzaq(zzgkVar);
        zzaqVar.zzv();
        zzgkVar.zzz = zzaqVar;
        zzer zzerVar = new zzer(zzgkVar, zzhnVar.zzf);
        zzerVar.zzb();
        zzgkVar.zzA = zzerVar;
        zzet zzetVar = new zzet(zzgkVar);
        zzetVar.zzb();
        zzgkVar.zzx = zzetVar;
        zzke zzkeVar = new zzke(zzgkVar);
        zzkeVar.zzb();
        zzgkVar.zzy = zzkeVar;
        zzgkVar.zzp.zzw();
        zzgkVar.zzl.zzw();
        zzgkVar.zzA.zzc();
        zzey zzi = zzgkVar.zzay().zzi();
        zzgkVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 64000L);
        zzgkVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzerVar.zzl();
        if (TextUtils.isEmpty(zzgkVar.zzf)) {
            if (zzgkVar.zzv().zzae(zzl)) {
                zzgkVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgkVar.zzay().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgkVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzgkVar.zzG != zzgkVar.zzH.get()) {
            zzgkVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzgkVar.zzG), Integer.valueOf(zzgkVar.zzH.get()));
        }
        zzgkVar.zzB = true;
    }

    static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzhd zzhdVar) {
        if (zzhdVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzfVar.zze()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
        }
    }

    private static final void zzR(zzhe zzheVar) {
        if (zzheVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzheVar.zzx()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzheVar.getClass())));
        }
    }

    public static zzgk zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l11) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgk.class) {
                try {
                    if (zzd == null) {
                        zzd = new zzgk(new zzhn(context, zzclVar, l11));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    final void zzB() {
        this.zzH.incrementAndGet();
    }

    final /* synthetic */ void zzC(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i11 != 200 && i11 != 204) {
            if (i11 == 304) {
                i11 = 304;
            }
            zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        if (th2 == null) {
            zzm().zzm.zza(true);
            if (bArr == null || bArr.length == 0) {
                zzay().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    zzay().zzc().zza("Deferred Deep Link is empty.");
                    return;
                }
                zzlt zzv = zzv();
                zzgk zzgkVar = zzv.zzs;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.zzt.zzH("auto", "_cmp", bundle);
                    zzlt zzv2 = zzv();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = zzv2.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            zzv2.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e11) {
                        zzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e11);
                        return;
                    }
                }
                zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e12) {
                zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e12);
                return;
            }
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaz().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (!this.zzk.zzr() || ((Boolean) zzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzit zzr = zzr();
        zzr.zzu();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzs.zze.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            C4056a.a(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlt zzv = zzv();
        zzh().zzs.zzk.zzh();
        URL zzE = zzv.zzE(64000L, zzl, (String) zzb.first, zzm().zzn.zza() - 1);
        if (zzE != null) {
            zzit zzr2 = zzr();
            zzgi zzgiVar = new zzgi(this);
            zzr2.zzg();
            zzr2.zzu();
            Preconditions.checkNotNull(zzE);
            Preconditions.checkNotNull(zzgiVar);
            zzr2.zzs.zzaz().zzo(new zzis(zzr2, zzl, zzE, null, null, zzgiVar, null));
        }
    }

    final void zzF(boolean z11) {
        this.zzE = Boolean.valueOf(z11);
    }

    public final void zzG(boolean z11) {
        zzaz().zzg();
        this.zzF = z11;
    }

    protected final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaz().zzg();
        zzai zzc = zzm().zzc();
        zzfp zzm = zzm();
        zzgk zzgkVar = zzm.zzs;
        zzm.zzg();
        int i11 = 100;
        int i12 = zzm.zza().getInt("consent_source", 100);
        zzag zzagVar = this.zzk;
        zzgk zzgkVar2 = zzagVar.zzs;
        Boolean zzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzgk zzgkVar3 = zzagVar2.zzs;
        Boolean zzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if (!(zzk == null && zzk2 == null) && zzm().zzl(-10)) {
            zzaiVar = new zzai(zzk, zzk2);
            i11 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i12 == 0 || i12 == 30 || i12 == 10 || i12 == 30 || i12 == 30 || i12 == 40)) {
                zzq().zzT(zzai.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i11 = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzq().zzT(zzaiVar, i11, this.zzc);
            zzc = zzaiVar;
        }
        zzq().zzX(zzc);
        if (zzm().zzc.zza() == 0) {
            zzay().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (zzM()) {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlt zzv = zzv();
                String zzm2 = zzh().zzm();
                zzfp zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzfp zzm4 = zzm();
                zzm4.zzg();
                if (zzv.zzam(zzm2, string, zzk3, zzm4.zza().getString("admob_app_id", null))) {
                    zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfp zzm5 = zzm();
                    zzm5.zzg();
                    Boolean zzd2 = zzm5.zzd();
                    SharedPreferences.Editor edit = zzm5.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm5.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfp zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.zza().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                zzfp zzm8 = zzm();
                String zzk4 = zzh().zzk();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzP(zzm().zze.zza());
            zzoc.zzc();
            if (this.zzk.zzs(null, zzen.zzad)) {
                try {
                    zzv().zzs.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzo.zza())) {
                        zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzo.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzr.zza());
            }
        } else if (zzJ()) {
            if (!zzv().zzad("android.permission.INTERNET")) {
                C3661l.b(this, "App is missing INTERNET permission");
            }
            if (!zzv().zzad("android.permission.ACCESS_NETWORK_STATE")) {
                C3661l.b(this, "App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                if (!zzlt.zzaj(this.zze)) {
                    C3661l.b(this, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlt.zzak(this.zze, false)) {
                    C3661l.b(this, "AppMeasurementService not registered/enabled");
                }
            }
            C3661l.b(this, "Uploading is not possible. App measurement disabled");
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaz().zzg();
        return this.zzF;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    protected final boolean zzM() {
        if (!this.zzB) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaz().zzg();
        Boolean bool = this.zzC;
        if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
            this.zzD = this.zzr.elapsedRealtime();
            boolean z11 = true;
            Boolean valueOf = Boolean.valueOf(zzv().zzad("android.permission.INTERNET") && zzv().zzad("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlt.zzaj(this.zze) && zzlt.zzak(this.zze, false))));
            this.zzC = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzv().zzX(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                    z11 = false;
                }
                this.zzC = Boolean.valueOf(z11);
            }
        }
        return this.zzC.booleanValue();
    }

    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaz().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean zzd2 = zzm().zzd();
        if (zzd2 != null) {
            return zzd2.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzs.zzj;
        Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (zzk != null) {
            return zzk.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zza;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Context zzau() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Clock zzav() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzab zzaw() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzfa zzay() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzgh zzaz() {
        zzR(this.zzn);
        return this.zzn;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag zzf() {
        return this.zzk;
    }

    public final zzaq zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    public final zzer zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    public final zzet zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    public final zzev zzj() {
        return this.zzq;
    }

    public final zzfa zzl() {
        zzfa zzfaVar = this.zzm;
        if (zzfaVar == null || !zzfaVar.zzx()) {
            return null;
        }
        return zzfaVar;
    }

    public final zzfp zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    final zzgh zzo() {
        return this.zzn;
    }

    public final zzip zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    public final zzit zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    public final zzje zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    public final zzke zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    public final zzku zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    public final zzlt zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzg;
    }

    public final String zzy() {
        return this.zzh;
    }

    public final String zzz() {
        return this.zzw;
    }
}
