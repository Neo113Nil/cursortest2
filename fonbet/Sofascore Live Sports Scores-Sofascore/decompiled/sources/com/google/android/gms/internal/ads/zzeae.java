package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeae {
    public final ConcurrentHashMap a;
    public final zzcga b;
    public final zzflw c;
    public final zzbbd d;
    public final Bundle e;
    public final Context f;

    public zzeae(Context context, zzeao zzeaoVar, zzcga zzcgaVar, zzflw zzflwVar, String str, String str2, zzbbd zzbbdVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo zze;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        this.e = new Bundle();
        zzeaoVar.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzeaoVar.a);
        this.a = concurrentHashMap;
        this.b = zzcgaVar;
        this.c = zzflwVar;
        this.d = zzbbdVar;
        this.f = context;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        d();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().k.get()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b3)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                b("mem_avl", String.valueOf(zze.availMem));
                b("mem_tt", String.valueOf(zze.totalMem));
                b("low_m", true != zze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i3)).booleanValue()) {
            b(MolocoMediationAdapter.KEY_AD_UNIT_ID, zzflwVar.g);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c3)).booleanValue()) {
            b("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d3)).booleanValue()) {
            b("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z7)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflwVar) - 1;
            if (zzg == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (zzg == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (zzg == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (zzg != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", zzmVar.zzp);
            b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final synchronized void c(long j, String str) {
        this.e.putLong(str, j);
    }

    public final void d() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cb)).booleanValue()) {
            zzbay zzbayVar = this.d.b;
            boolean z = zzbayVar instanceof zzk;
            ConcurrentHashMap concurrentHashMap = this.a;
            if (z) {
                concurrentHashMap.put("asv", ((zzk) zzbayVar).zzc());
            } else {
                if (!(zzbayVar instanceof zzcoa)) {
                    concurrentHashMap.put("asv", "NA");
                    return;
                }
                zzggu zzgguVar = (zzggu) ((zzcoa) zzbayVar).b.a.b.f.get();
                int zzg = (zzgguVar == null ? 1 : zzgguVar.zzg()) - 1;
                concurrentHashMap.put("asv", zzg != 1 ? zzg != 2 ? zzg != 3 ? "uns" : "3.0" : "2.0" : "1.0");
            }
        }
    }
}
