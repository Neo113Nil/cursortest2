package com.google.android.gms.internal.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfi> CREATOR = new zzfj();
    private final DataSource zza;

    public zzfi(DataSource dataSource) {
        this.zza = dataSource;
    }

    public final String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.zza, i, false);
        ozg0.x(w, parcel);
    }

    public final DataSource zza() {
        return this.zza;
    }
}
