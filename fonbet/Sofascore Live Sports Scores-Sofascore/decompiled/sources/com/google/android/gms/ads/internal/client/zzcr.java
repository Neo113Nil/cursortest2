package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcr extends zzbev implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zze zzeVar = (zze) zzbew.b(parcel, zze.CREATOR);
            zzbew.f(parcel);
            zza(zzeVar);
        } else if (i == 2) {
            zzb();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zzd();
        } else {
            if (i != 5) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
