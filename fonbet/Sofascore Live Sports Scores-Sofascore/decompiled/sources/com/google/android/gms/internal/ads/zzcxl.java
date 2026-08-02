package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxl implements zzinw {
    public final zzepu a;
    public final zzert b;

    public zzcxl(zzepu zzepuVar, zzert zzertVar) {
        this.a = zzepuVar;
        this.b = zzertVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K6);
        bool.booleanValue();
        return true == bool.booleanValue() ? this.a.zzb() : this.b.zzb();
    }
}
