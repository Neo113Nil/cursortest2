package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzas extends zza implements zzau {
    @Override // com.google.android.gms.cast.framework.zzau
    public final void E(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 13);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final int zze() {
        Parcel S1 = S1(J(), 17);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final IObjectWrapper zzf() {
        return x5n.i(S1(J(), 1));
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final String zzh() {
        Parcel S1 = S1(J(), 3);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final boolean zzi() {
        Parcel S1 = S1(J(), 5);
        int i = zzc.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final boolean zzj() {
        Parcel S1 = S1(J(), 6);
        int i = zzc.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final boolean zzm() {
        Parcel S1 = S1(J(), 9);
        int i = zzc.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final int zzo() {
        Parcel S1 = S1(J(), 18);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzq() {
        Parcel J = J();
        J.writeInt(2151);
        Z1(J, 12);
    }

    @Override // com.google.android.gms.cast.framework.zzau
    public final void zzt() {
        Parcel J = J();
        J.writeInt(2153);
        Z1(J, 15);
    }
}
