package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcnw {
    public final int a;
    public final int b;
    public final int c;

    public zzcnw(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static zzcnw a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcnw(3, 0, 0) : zzrVar.zzi ? new zzcnw(2, 0, 0) : zzrVar.zzh ? new zzcnw(0, 0, 0) : new zzcnw(1, zzrVar.zzf, zzrVar.zzc);
    }

    public final boolean b() {
        return this.a == 3;
    }
}
