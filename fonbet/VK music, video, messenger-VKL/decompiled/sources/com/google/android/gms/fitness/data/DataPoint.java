package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.rqi;
import xsna.tdj;
import xsna.tj0;
import xsna.vb01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class DataPoint extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DataPoint> CREATOR = new vb01();
    public final DataSource b;
    public final long c;
    public final long d;
    public final Value[] e;

    @Nullable
    public final DataSource f;
    public final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataPoint(List list, RawDataPoint rawDataPoint) {
        this(r3, rawDataPoint.b, rawDataPoint.c, rawDataPoint.d, r1, rawDataPoint.g);
        int i = rawDataPoint.e;
        DataSource dataSource = null;
        DataSource dataSource2 = (i < 0 || i >= list.size()) ? null : (DataSource) list.get(i);
        exc0.i(dataSource2);
        int i2 = rawDataPoint.f;
        if (i2 >= 0 && i2 < list.size()) {
            dataSource = (DataSource) list.get(i2);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPoint)) {
            return false;
        }
        DataPoint dataPoint = (DataPoint) obj;
        return dq70.b(this.b, dataPoint.b) && this.c == dataPoint.c && this.d == dataPoint.d && Arrays.equals(this.e, dataPoint.e) && dq70.b(i(), dataPoint.i());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    @NonNull
    public final DataSource i() {
        DataSource dataSource = this.f;
        return dataSource != null ? dataSource : this.b;
    }

    @NonNull
    public final Value j(@NonNull Field field) {
        DataType dataType = this.b.b;
        int indexOf = dataType.c.indexOf(field);
        exc0.c(indexOf >= 0, "%s not a field of %s", field, dataType);
        return this.e[indexOf];
    }

    @NonNull
    public final String toString() {
        String arrays = Arrays.toString(this.e);
        String zzb = this.b.zzb();
        DataSource dataSource = this.f;
        String zzb2 = dataSource != null ? dataSource.zzb() : "N/A";
        StringBuilder d = rqi.d(this.d, "DataPoint{", arrays, "@[");
        tj0.d(d, ", ", this.c, ",raw=");
        d.append(this.g);
        d.append("](");
        d.append(zzb);
        return tdj.a(d, " ", zzb2, ")}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.c);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.d);
        ozg0.t(parcel, 5, this.e, i);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.v(parcel, 7, 8);
        parcel.writeLong(this.g);
        ozg0.x(w, parcel);
    }

    public DataPoint(@NonNull DataSource dataSource, long j, long j2, @NonNull Value[] valueArr, @Nullable DataSource dataSource2, long j3) {
        this.b = dataSource;
        this.f = dataSource2;
        this.c = j;
        this.d = j2;
        this.e = valueArr;
        this.g = j3;
    }
}
