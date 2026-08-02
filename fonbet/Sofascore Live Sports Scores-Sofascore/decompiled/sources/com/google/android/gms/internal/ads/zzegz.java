package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegz extends zzcbl {
    public final zzcgo a;
    public final zzcbv b;

    public zzegz(zzcgo zzcgoVar, zzcbv zzcbvVar) {
        this.a = zzcgoVar;
        this.b = zzcbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void A3(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.zzc(new zzehq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.b));
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void D2(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.a.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void T2(ParcelFileDescriptor parcelFileDescriptor, zzcbv zzcbvVar) {
        this.a.zzc(new zzehq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbvVar));
    }
}
