package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdiv implements zzdgv {
    public int a = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X1)).intValue();
    public int b = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ie)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void N(zzflo zzfloVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y1)).booleanValue()) {
            try {
                zzflg zzflgVar = zzfloVar.b.b;
                this.a = zzflgVar.c;
                this.b = zzflgVar.d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
    }
}
