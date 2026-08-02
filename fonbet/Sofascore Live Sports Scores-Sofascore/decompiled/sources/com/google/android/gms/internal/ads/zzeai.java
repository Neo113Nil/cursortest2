package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.n2o;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeai {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final /* synthetic */ zzeaj b;

    public zzeai(zzeaj zzeajVar) {
        this.b = zzeajVar;
    }

    public final void a(zzfld zzfldVar) {
        b("aai", zzfldVar.w);
        b("request_id", zzfldVar.n0);
        b("ad_format", zzfld.a(zzfldVar.b));
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final void c() {
        this.b.b.execute(new n2o(this, 1));
    }

    public final com.google.android.gms.ads.internal.util.client.zzt d() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.bg)).booleanValue()) {
            c();
            return com.google.android.gms.ads.internal.util.client.zzt.zza;
        }
        zzeao zzeaoVar = this.b.a;
        zzeaoVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty paramMap.");
            return com.google.android.gms.ads.internal.util.client.zzt.zza;
        }
        String generateUrl = zzeaoVar.f.generateUrl(concurrentHashMap);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        return zzeaoVar.d.zzc(generateUrl, null);
    }

    public final void e() {
        this.b.b.execute(new n2o(this, 0));
    }
}
