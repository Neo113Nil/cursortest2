package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbhf extends zzbev implements zzbhg {
    public zzbhf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((zzbgw) this).zzb();
        } else if (i == 2) {
            ((zzbgw) this).zzc();
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.f(parcel);
            ((zzbgw) this).E0(zzeVar);
        } else if (i == 4) {
            ((zzbgw) this).zze();
        } else {
            if (i != 5) {
                return false;
            }
            ((zzbgw) this).zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
