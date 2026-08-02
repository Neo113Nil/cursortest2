package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrf extends zzhri {
    public final zzhrg a;
    public final zzicj b;

    public zzhrf(zzhrg zzhrgVar, zzicj zzicjVar) {
        this.a = zzhrgVar;
        this.b = zzicjVar;
    }

    public static zzhrf c(zzhrg zzhrgVar, zzicj zzicjVar) {
        if (zzhrgVar.a == zzicjVar.a.a.length) {
            return new zzhrf(zzhrgVar, zzicjVar);
        }
        defpackage.zzl.x("Key size mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhri, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer b() {
        return null;
    }
}
