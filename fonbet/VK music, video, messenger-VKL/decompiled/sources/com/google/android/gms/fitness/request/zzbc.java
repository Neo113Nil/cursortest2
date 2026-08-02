package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.b301;
import xsna.ozg0;
import xsna.puz0;
import xsna.zs01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new b301();
    public final puz0 b;

    @Nullable
    public final zzcw c;

    public zzbc(IBinder iBinder, @Nullable IBinder iBinder2) {
        puz0 zs01Var;
        if (iBinder == null) {
            zs01Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zs01Var = queryLocalInterface instanceof puz0 ? (puz0) queryLocalInterface : new zs01(iBinder);
        }
        this.b = zs01Var;
        this.c = iBinder2 != null ? zzcv.zzc(iBinder2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.h(parcel, 1, this.b.asBinder());
        zzcw zzcwVar = this.c;
        ozg0.h(parcel, 2, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzbc(puz0 puz0Var, @Nullable zzcw zzcwVar) {
        this.b = puz0Var;
        this.c = zzcwVar;
    }
}
