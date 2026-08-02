package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzbp;
import com.google.android.gms.internal.fitness.zzbq;
import xsna.ef01;
import xsna.ozg0;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new ef01();
    public final zzbq b;

    @Nullable
    public final DataType c;
    public final boolean d;

    public zzh(IBinder iBinder, @Nullable DataType dataType, boolean z) {
        this.b = zzbp.zzb(iBinder);
        this.c = dataType;
        this.d = z;
    }

    public final String toString() {
        DataType dataType = this.c;
        return zr.a("DailyTotalRequest{", dataType == null ? "null" : dataType.zzc(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.h(parcel, 1, this.b.asBinder());
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public zzh(zzbq zzbqVar, @Nullable DataType dataType, boolean z) {
        this.b = zzbqVar;
        this.c = dataType;
        this.d = z;
    }
}
