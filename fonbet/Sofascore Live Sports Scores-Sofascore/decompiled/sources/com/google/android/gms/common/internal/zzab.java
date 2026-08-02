package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzab extends zza implements zzad {
    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr E3(zzp zzpVar) {
        Parcel S1 = S1();
        int i = com.google.android.gms.internal.common.zzc.a;
        S1.writeInt(1);
        zzpVar.writeToParcel(S1, 0);
        Parcel J = J(S1, 6);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.a(J, com.google.android.gms.common.zzr.CREATOR);
        J.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean Y(com.google.android.gms.common.zzt zztVar, ObjectWrapper objectWrapper) {
        Parcel S1 = S1();
        int i = com.google.android.gms.internal.common.zzc.a;
        S1.writeInt(1);
        zztVar.writeToParcel(S1, 0);
        com.google.android.gms.internal.common.zzc.b(S1, objectWrapper);
        Parcel J = J(S1, 5);
        boolean z = J.readInt() != 0;
        J.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() {
        Parcel J = J(S1(), 7);
        int i = com.google.android.gms.internal.common.zzc.a;
        boolean z = J.readInt() != 0;
        J.recycle();
        return z;
    }
}
