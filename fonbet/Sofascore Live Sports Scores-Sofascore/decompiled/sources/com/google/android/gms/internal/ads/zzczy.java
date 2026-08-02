package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzczy implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzddg c;

    public zzczy(zzinv zzinvVar, zzcpd zzcpdVar, zzddg zzddgVar) {
        this.a = zzinvVar;
        this.b = zzcpdVar;
        this.c = zzddgVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        String bigInteger;
        Clock clock = (Clock) this.a.zzb();
        zzcga zzb = ((zzcpd) this.b).zzb();
        String str = this.c.a().g;
        zzcfy zzcfyVar = zzb.c;
        synchronized (zzcfyVar) {
            bigInteger = zzcfyVar.a.toString();
            zzcfyVar.a = zzcfyVar.a.add(BigInteger.ONE);
            zzcfyVar.b = bigInteger;
        }
        return new zzcfp(clock, zzb, bigInteger, str);
    }
}
