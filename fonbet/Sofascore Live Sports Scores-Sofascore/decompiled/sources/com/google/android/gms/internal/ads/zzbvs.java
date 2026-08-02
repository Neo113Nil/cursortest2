package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvs extends zzbeu implements zzbvu {
    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean A(String str) {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 4);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbxt n(String str) {
        zzbxt zzbxrVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 3);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzbxs.a;
        if (readStrongBinder == null) {
            zzbxrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            zzbxrVar = queryLocalInterface instanceof zzbxt ? (zzbxt) queryLocalInterface : new zzbxr(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        S1.recycle();
        return zzbxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbvx zza(String str) {
        zzbvx zzbvvVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvvVar = queryLocalInterface instanceof zzbvx ? (zzbvx) queryLocalInterface : new zzbvv(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        S1.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzb(String str) {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 2);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }
}
