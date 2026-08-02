package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.D1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.dq70;
import xsna.e801;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class Bucket extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Bucket> CREATOR = new e801();
    public final long b;
    public final long c;

    @Nullable
    public final Session d;
    public final int e;
    public final List f;
    public final int g;

    public Bucket(long j, long j2, @Nullable Session session, int i, ArrayList arrayList, int i2) {
        this.b = j;
        this.c = j2;
        this.d = session;
        this.e = i;
        this.f = arrayList;
        this.g = i2;
    }

    @NonNull
    public static String n(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "bug" : "intervals" : D1.i : "type" : "session" : "time" : "none";
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) obj;
        return this.b == bucket.b && this.c == bucket.c && this.e == bucket.e && dq70.b(this.f, bucket.f) && this.g == bucket.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(this.g)});
    }

    @NonNull
    public final List<DataSet> i() {
        return this.f;
    }

    public final long j() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return timeUnit.convert(this.c, timeUnit);
    }

    @Nullable
    public final Session k() {
        return this.d;
    }

    public final long l() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return timeUnit.convert(this.b, timeUnit);
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "startTime");
        aVar.a(Long.valueOf(this.c), "endTime");
        aVar.a(Integer.valueOf(this.e), "activity");
        aVar.a(this.f, "dataSets");
        aVar.a(n(this.g), "bucketType");
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bucket(@NonNull RawBucket rawBucket, @NonNull List list) {
        this(r1, r3, r5, r6, r7, rawBucket.g);
        long j = rawBucket.b;
        long j2 = rawBucket.c;
        Session session = rawBucket.d;
        int i = rawBucket.e;
        List list2 = rawBucket.f;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DataSet((RawDataSet) it.next(), list));
        }
    }
}
