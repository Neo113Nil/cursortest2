package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzap extends zza implements zzar {
    @Override // com.google.android.gms.cast.framework.zzar
    public final int c2(int i, int i2, Intent intent) {
        Parcel J = J();
        zzc.b(J, intent);
        J.writeInt(i);
        J.writeInt(i2);
        Parcel S1 = S1(J, 2);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzar
    public final void l4() {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.cast.framework.zzar
    public final IBinder y0(Intent intent) {
        Parcel J = J();
        zzc.b(J, intent);
        Parcel S1 = S1(J, 3);
        IBinder readStrongBinder = S1.readStrongBinder();
        S1.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.cast.framework.zzar
    public final void zzh() {
        Z1(J(), 4);
    }
}
