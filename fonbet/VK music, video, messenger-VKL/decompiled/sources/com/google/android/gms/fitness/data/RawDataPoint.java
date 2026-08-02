package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import xsna.buz0;
import xsna.ozg0;
import xsna.rqi;
import xsna.rzl;
import xsna.tj0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@KeepName
/* loaded from: classes12.dex */
public final class RawDataPoint extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RawDataPoint> CREATOR = new buz0();
    public final long b;
    public final long c;
    public final Value[] d;
    public final int e;
    public final int f;
    public final long g;

    public RawDataPoint(long j, long j2, @NonNull Value[] valueArr, int i, int i2, long j3) {
        this.b = j;
        this.c = j2;
        this.e = i;
        this.f = i2;
        this.g = j3;
        this.d = valueArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawDataPoint)) {
            return false;
        }
        RawDataPoint rawDataPoint = (RawDataPoint) obj;
        return this.b == rawDataPoint.b && this.c == rawDataPoint.c && Arrays.equals(this.d, rawDataPoint.d) && this.e == rawDataPoint.e && this.f == rawDataPoint.f && this.g == rawDataPoint.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        StringBuilder d = rqi.d(this.c, "RawDataPoint{", Arrays.toString(this.d), "@[");
        tj0.d(d, ", ", this.b, "](");
        return rzl.a(this.e, this.f, StringUtils.COMMA, ")}", d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.t(parcel, 3, this.d, i);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(this.g);
        ozg0.x(w, parcel);
    }

    public RawDataPoint(DataPoint dataPoint, List list) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.b = timeUnit.convert(dataPoint.c, timeUnit);
        this.c = timeUnit.convert(dataPoint.d, timeUnit);
        this.d = dataPoint.e;
        this.e = zzd.zza(dataPoint.b, list);
        this.f = zzd.zza(dataPoint.f, list);
        this.g = dataPoint.g;
    }
}
