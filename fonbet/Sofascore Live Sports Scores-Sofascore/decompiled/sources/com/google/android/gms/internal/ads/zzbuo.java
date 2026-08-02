package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbuo implements zzbtf, zzbun {
    public final zzbtp a;
    public final HashSet b = new HashSet();

    public zzbuo(zzbtp zzbtpVar) {
        this.a = zzbtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void a0(String str, zzbqh zzbqhVar) {
        this.a.a0(str, zzbqhVar);
        this.b.remove(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void c0(String str, zzbqh zzbqhVar) {
        this.a.c0(str, zzbqhVar);
        this.b.add(new AbstractMap.SimpleEntry(str, zzbqhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtf, com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        this.a.zza(str);
    }
}
