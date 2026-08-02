package com.google.android.gms.common.internal;

import N9.b;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes2.dex */
public final class t0 extends zza implements v0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.v0
    public final N9.b zzd() {
        Parcel zzB = zzB(1, zza());
        N9.b c10 = b.a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    @Override // com.google.android.gms.common.internal.v0
    public final int zze() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
