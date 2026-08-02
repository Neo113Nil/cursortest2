package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdzm implements zzfqj {
    public final Map a;
    public final zzbif b;

    public zzdzm(zzbif zzbifVar, Map map) {
        this.a = map;
        this.b = zzbifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void D(zzfqc zzfqcVar, String str, Throwable th) {
        Map map = this.a;
        if (map.containsKey(zzfqcVar)) {
            this.b.c(((zzdzl) map.get(zzfqcVar)).c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void h(zzfqc zzfqcVar, String str) {
        Map map = this.a;
        if (map.containsKey(zzfqcVar)) {
            this.b.c(((zzdzl) map.get(zzfqcVar)).a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void t(zzfqc zzfqcVar, String str) {
        Map map = this.a;
        if (map.containsKey(zzfqcVar)) {
            this.b.c(((zzdzl) map.get(zzfqcVar)).b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void A(String str) {
    }
}
