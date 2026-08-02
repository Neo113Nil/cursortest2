package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import xsna.ozg0;
import xsna.zvz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zvz0();

    @Nullable
    public final DataType b;

    @Nullable
    public final zzcn c;

    public zzae(@Nullable DataType dataType, @Nullable IBinder iBinder) {
        this.b = dataType;
        this.c = iBinder == null ? null : zzcm.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        zzcn zzcnVar = this.c;
        ozg0.h(parcel, 2, zzcnVar == null ? null : zzcnVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzae(@Nullable DataType dataType, zzcn zzcnVar) {
        this.b = dataType;
        this.c = zzcnVar;
    }
}
