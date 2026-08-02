package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcd extends zzbev implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzdx zzdvVar;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzdvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
            }
            zzbew.f(parcel);
            zze(readString, zzdvVar);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzbew.f(parcel);
            zzf(readString2);
        } else {
            if (i != 3) {
                return false;
            }
            String readString3 = parcel.readString();
            zze zzeVar = (zze) zzbew.b(parcel, zze.CREATOR);
            zzbew.f(parcel);
            zzg(readString3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
