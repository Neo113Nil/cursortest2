package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdan implements zzdjk, zzdfd {
    public final Clock a;
    public final zzdap b;
    public final zzflw c;
    public final String d;

    public zzdan(Clock clock, zzdap zzdapVar, zzflw zzflwVar, String str) {
        this.a = clock;
        this.b = zzdapVar;
        this.c = zzflwVar;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdjk
    public final void zza() {
        this.b.c.put(this.d, Long.valueOf(this.a.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        long elapsedRealtime = this.a.elapsedRealtime();
        String str = this.c.g;
        zzdap zzdapVar = this.b;
        ConcurrentHashMap concurrentHashMap = zzdapVar.c;
        String str2 = this.d;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        zzdapVar.d.put(str, Long.valueOf(elapsedRealtime - l.longValue()));
    }
}
