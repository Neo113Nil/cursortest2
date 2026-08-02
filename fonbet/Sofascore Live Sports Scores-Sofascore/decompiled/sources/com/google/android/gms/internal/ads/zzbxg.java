package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.b5o;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbxg extends zzbev implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbwd zzbwbVar;
        if (i == 1) {
            ((b5o) this).s(x5n.j(parcel, parcel));
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((b5o) this).zzf(readString);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.f(parcel);
            ((b5o) this).a(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbwbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                zzbwbVar = queryLocalInterface instanceof zzbwd ? (zzbwd) queryLocalInterface : new zzbwb(readStrongBinder);
            }
            zzbew.f(parcel);
            b5o b5oVar = (b5o) this;
            b5oVar.b.d = zzbwbVar;
            ((zzeof) b5oVar.a.c).zzj();
        }
        parcel2.writeNoException();
        return true;
    }
}
