package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaf extends zza implements zzah {
    @Override // com.google.android.gms.cast.framework.zzah
    public final void A1(com.google.android.gms.internal.cast.zzax zzaxVar) {
        Parcel J = J();
        zzc.c(J, zzaxVar);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.cast.framework.zzah
    public final Bundle zze() {
        Parcel S1 = S1(J(), 1);
        Bundle bundle = (Bundle) zzc.a(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.cast.framework.zzah
    public final zzaw zzg() {
        zzaw zzavVar;
        Parcel S1 = S1(J(), 5);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzavVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            zzavVar = queryLocalInterface instanceof zzaw ? (zzaw) queryLocalInterface : new zzav(readStrongBinder, "com.google.android.gms.cast.framework.ISessionManager");
        }
        S1.recycle();
        return zzavVar;
    }

    @Override // com.google.android.gms.cast.framework.zzah
    public final zzao zzh() {
        zzao zzanVar;
        Parcel S1 = S1(J(), 6);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzanVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            zzanVar = queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new zzan(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
        }
        S1.recycle();
        return zzanVar;
    }
}
