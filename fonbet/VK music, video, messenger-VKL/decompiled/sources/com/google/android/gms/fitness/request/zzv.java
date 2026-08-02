package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.ozg0;
import xsna.pr01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new pr01();
    public final zzcw b;

    public zzv(IBinder iBinder) {
        this.b = zzcv.zzc(iBinder);
    }

    public final String toString() {
        return "DisableFitRequest";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.h(parcel, 1, this.b.asBinder());
        ozg0.x(w, parcel);
    }

    public zzv(zzcw zzcwVar) {
        this.b = zzcwVar;
    }
}
