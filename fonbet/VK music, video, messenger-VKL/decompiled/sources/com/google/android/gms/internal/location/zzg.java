package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzg extends AbstractSafeParcelable implements qdg0 {
    private final Status zzb;
    public static final zzg zza = new zzg(Status.f);
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    public zzg(Status status) {
        this.zzb = status;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.zzb, i, false);
        ozg0.x(w, parcel);
    }
}
