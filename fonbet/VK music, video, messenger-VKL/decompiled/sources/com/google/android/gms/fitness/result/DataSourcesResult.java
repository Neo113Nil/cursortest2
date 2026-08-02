package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;
import xsna.p601;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataSourcesResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<DataSourcesResult> CREATOR = new p601();
    public final List b;
    public final Status c;

    public DataSourcesResult(@NonNull List list, @NonNull Status status) {
        this.b = Collections.unmodifiableList(list);
        this.c = status;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataSourcesResult) {
            DataSourcesResult dataSourcesResult = (DataSourcesResult) obj;
            if (this.c.equals(dataSourcesResult.c) && dq70.b(this.b, dataSourcesResult.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.c, "status");
        aVar.a(this.b, "dataSources");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.x(w, parcel);
    }
}
