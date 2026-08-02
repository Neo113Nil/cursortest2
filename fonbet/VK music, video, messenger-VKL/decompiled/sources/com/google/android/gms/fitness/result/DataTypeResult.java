package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;
import xsna.dq70;
import xsna.g801;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public class DataTypeResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<DataTypeResult> CREATOR = new g801();
    public final Status b;

    @Nullable
    public final DataType c;

    public DataTypeResult(@NonNull Status status, @Nullable DataType dataType) {
        this.b = status;
        this.c = dataType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataTypeResult)) {
            return false;
        }
        DataTypeResult dataTypeResult = (DataTypeResult) obj;
        return this.b.equals(dataTypeResult.b) && dq70.b(this.c, dataTypeResult.c);
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "status");
        aVar.a(this.c, "dataType");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.x(w, parcel);
    }
}
