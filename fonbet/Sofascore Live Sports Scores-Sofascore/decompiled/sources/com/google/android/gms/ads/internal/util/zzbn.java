package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbn extends zzbev implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzbew.f(parcel);
            boolean zze = zze(S1, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
            zzbew.f(parcel);
            zzf(S12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
        com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbew.b(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
        zzbew.f(parcel);
        boolean zzg = zzg(S13, zzaVar);
        parcel2.writeNoException();
        parcel2.writeInt(zzg ? 1 : 0);
        return true;
    }
}
