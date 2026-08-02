package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzd;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.ouz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@KeepName
/* loaded from: classes12.dex */
public final class RawDataSet extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RawDataSet> CREATOR = new ouz0();
    public final int b;

    @NonNull
    public final List c;

    public RawDataSet(int i, @NonNull List list) {
        this.b = i;
        this.c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawDataSet)) {
            return false;
        }
        RawDataSet rawDataSet = (RawDataSet) obj;
        return this.b == rawDataSet.b && dq70.b(this.c, rawDataSet.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b)});
    }

    @NonNull
    public final String toString() {
        return String.format("RawDataSet{%s@[%s]}", Integer.valueOf(this.b), this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.u(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }

    public RawDataSet(@NonNull DataSet dataSet, @NonNull List list) {
        this.c = dataSet.k(list);
        this.b = zzd.zza(dataSet.c, list);
    }
}
