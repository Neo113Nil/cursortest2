package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.ozg0;
import xsna.wb01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new wb01();
    public final String b;

    @Nullable
    public final BleDevice c;
    public final zzcw d;

    public zzf(String str, @Nullable BleDevice bleDevice, IBinder iBinder) {
        this.b = str;
        this.c = bleDevice;
        this.d = zzcv.zzc(iBinder);
    }

    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.p(parcel, 2, this.c, i, false);
        zzcw zzcwVar = this.d;
        ozg0.h(parcel, 3, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzf(String str, @Nullable BleDevice bleDevice, zzcw zzcwVar) {
        this.b = str;
        this.c = bleDevice;
        this.d = zzcwVar;
    }
}
