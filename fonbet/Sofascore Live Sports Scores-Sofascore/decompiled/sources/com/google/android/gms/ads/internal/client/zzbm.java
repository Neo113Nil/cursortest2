package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbm extends zzbev implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzm zzmVar = (zzm) zzbew.b(parcel, zzm.CREATOR);
            zzbew.f(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
            return true;
        }
        if (i == 3) {
            boolean zzg = zzg();
            parcel2.writeNoException();
            ClassLoader classLoader = zzbew.a;
            parcel2.writeInt(zzg ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzm zzmVar2 = (zzm) zzbew.b(parcel, zzm.CREATOR);
        int readInt = parcel.readInt();
        zzbew.f(parcel);
        zzi(zzmVar2, readInt);
        parcel2.writeNoException();
        return true;
    }
}
