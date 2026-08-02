package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.dq70;
import xsna.ozg0;
import xsna.ys01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@KeepName
/* loaded from: classes12.dex */
public final class RawBucket extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RawBucket> CREATOR = new ys01();
    public final long b;
    public final long c;

    @Nullable
    public final Session d;
    public final int e;

    @NonNull
    public final List f;
    public final int g;

    public RawBucket(long j, long j2, @Nullable Session session, int i, @NonNull List list, int i2) {
        this.b = j;
        this.c = j2;
        this.d = session;
        this.e = i;
        this.f = list;
        this.g = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawBucket)) {
            return false;
        }
        RawBucket rawBucket = (RawBucket) obj;
        return this.b == rawBucket.b && this.c == rawBucket.c && this.e == rawBucket.e && dq70.b(this.f, rawBucket.f) && this.g == rawBucket.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.g)});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "startTime");
        aVar.a(Long.valueOf(this.c), "endTime");
        aVar.a(Integer.valueOf(this.e), "activity");
        aVar.a(this.f, "dataSets");
        aVar.a(Integer.valueOf(this.g), "bucketType");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.u(parcel, 5, this.f, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g);
        ozg0.x(w, parcel);
    }

    public RawBucket(@NonNull Bucket bucket, @NonNull List list) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = bucket.l();
        this.c = bucket.j();
        this.d = bucket.d;
        this.e = bucket.e;
        this.g = bucket.g;
        List list2 = bucket.f;
        this.f = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.f.add(new RawDataSet((DataSet) it.next(), list));
        }
    }
}
