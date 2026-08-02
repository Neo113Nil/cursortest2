package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import defpackage.ddb;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewy implements zzfdi {
    public final Context a;
    public final String b;
    public final String c;
    public final long d;
    public final zzdab e;
    public final zzfne f;
    public final zzflw g;
    public final com.google.android.gms.ads.internal.util.zzj h = com.google.android.gms.ads.internal.zzt.zzh().g();
    public final zzeae i;
    public final zzdap j;

    public zzewy(Context context, String str, String str2, zzdab zzdabVar, zzfne zzfneVar, zzflw zzflwVar, zzeae zzeaeVar, zzdap zzdapVar, long j) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = zzdabVar;
        this.f = zzfneVar;
        this.g = zzflwVar;
        this.i = zzeaeVar;
        this.j = zzdapVar;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        Bundle bundle = new Bundle();
        zzeae zzeaeVar = this.i;
        ConcurrentHashMap concurrentHashMap = zzeaeVar.a;
        String str = this.b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue()) {
            zzeaeVar.b("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a() - this.d));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzeaeVar.b(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.a) ? "1" : "0");
        }
        zzdab zzdabVar = this.e;
        zzflw zzflwVar = this.g;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        zzcfp zzcfpVar = zzdabVar.b;
        synchronized (zzcfpVar.d) {
            long elapsedRealtime = zzcfpVar.a.elapsedRealtime();
            zzcfpVar.j = elapsedRealtime;
            zzcga zzcgaVar = zzcfpVar.b;
            synchronized (zzcgaVar.a) {
                zzcgaVar.d.a(zzmVar, elapsedRealtime);
            }
        }
        bundle.putAll(this.f.b());
        return zzhcy.a(new zzewz(this.a, bundle, str, this.c, this.h, zzflwVar.g, this.j));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 12;
    }
}
