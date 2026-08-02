package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbva;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.ddb;
import defpackage.dff;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.inn;
import defpackage.ue8;
import defpackage.vlo;
import defpackage.xlo;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf {
    public Context a;
    public long b = 0;

    public static final void b(zzeaj zzeajVar, String str, long j) {
        if (zzeajVar != null) {
            if (((Boolean) zzba.zzc().a(zzbjg.qe)).booleanValue()) {
                zzeai a = zzeajVar.a();
                a.b("action", "lat_init");
                a.b(str, Long.toString(j));
                a.c();
            }
        }
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcfq zzcfqVar, String str, String str2, Runnable runnable, final zzfrj zzfrjVar, final zzeaj zzeajVar, final Long l, boolean z2) {
        PackageInfo b;
        if (zzt.zzk().elapsedRealtime() - this.b < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.b = zzt.zzk().elapsedRealtime();
        if (zzcfqVar != null && !TextUtils.isEmpty(zzcfqVar.e)) {
            if (zzt.zzk().a() - zzcfqVar.f <= ((Long) zzba.zzc().a(zzbjg.j5)).longValue() && zzcfqVar.h) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.a = applicationContext;
        final zzfqw e = zzfqw.e(4, context);
        e.zza();
        zzbva b2 = zzt.zzr().b(this.a, versionInfoParcel, zzfrjVar);
        dff dffVar = zzbux.a;
        zzbve a = b2.a("google.afma.config.fetchAppSettings", dffVar, dffVar);
        int i4 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(MBridgeConstans.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(MolocoMediationAdapter.KEY_AD_UNIT_ID, str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            inn innVar = zzbjg.a;
            jSONObject.put("experiment_ids", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, zzba.zzb().a()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzba.zzc().a(zzbjg.bb)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                if (applicationInfo != null && (b = Wrappers.a(context).b(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", b.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ddb a2 = a.a(jSONObject);
            zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final ddb zza(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        zzt.zzh().g().zzh(jSONObject2.getString("appSettingsJson"));
                        Long l2 = l;
                        if (l2 != null) {
                            zzf.b(zzeajVar, "cld_s", zzt.zzk().elapsedRealtime() - l2.longValue());
                        }
                    }
                    String optString = jSONObject2.optString("errorReason", "");
                    boolean isEmpty = TextUtils.isEmpty(optString);
                    zzfqw zzfqwVar = e;
                    if (!isEmpty) {
                        zzfqwVar.zzk(optString);
                    }
                    zzfqwVar.zzd(optBoolean);
                    zzfrjVar.b(zzfqwVar.zzm());
                    return xlo.b;
                }
            };
            hsn hsnVar = zzcgj.h;
            hlo h = zzhcy.h(a2, zzhcgVar, hsnVar);
            if (runnable != null) {
                a2.addListener(runnable, hsnVar);
            }
            if (l != null) {
                a2.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.b(zzeaj.this, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, hsnVar);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) zzba.zzc().a(zzbjg.M8)).booleanValue()) {
                h.addListener(new vlo(i4, h, new ue8(str3, 2)), hsnVar);
            } else {
                zzcgm.a(h, "ConfigLoader.maybeFetchNewAppSettings", hsnVar);
            }
        } catch (Exception e2) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", e2);
            e.a(e2);
            e.zzd(false);
            zzfrjVar.b(e.zzm());
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfrj zzfrjVar, @Nullable zzeaj zzeajVar, @Nullable Long l, boolean z) {
        a(context, versionInfoParcel, true, null, str, null, runnable, zzfrjVar, zzeajVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcfq zzcfqVar, zzfrj zzfrjVar, boolean z) {
        a(context, versionInfoParcel, false, zzcfqVar, zzcfqVar != null ? zzcfqVar.d : null, str, null, zzfrjVar, null, null, z);
    }
}
