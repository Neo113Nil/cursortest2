package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.d501;
import xsna.dq70;
import xsna.l6g;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataReadResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<DataReadResult> CREATOR = new d501();
    public final List b;
    public final Status c;
    public final List d;
    public final int e;
    public final List f;

    public DataReadResult(ArrayList arrayList, Status status, ArrayList arrayList2, int i, ArrayList arrayList3) {
        this.c = status;
        this.e = i;
        this.f = arrayList3;
        this.b = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.add(new DataSet((RawDataSet) it.next(), arrayList3));
        }
        this.d = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.d.add(new Bucket((RawBucket) it2.next(), arrayList3));
        }
    }

    public static void i(DataSet dataSet, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DataSet dataSet2 = (DataSet) it.next();
            if (dataSet2.c.equals(dataSet.c)) {
                for (DataPoint dataPoint : Collections.unmodifiableList(dataSet.d)) {
                    List list2 = dataSet2.e;
                    dataSet2.d.add(dataPoint);
                    DataSource i = dataPoint.i();
                    if (i != null && !list2.contains(i)) {
                        list2.add(i);
                    }
                }
                return;
            }
        }
        list.add(dataSet);
    }

    public final void b(@NonNull DataReadResult dataReadResult) {
        Iterator it = dataReadResult.b.iterator();
        while (it.hasNext()) {
            i((DataSet) it.next(), this.b);
        }
        for (Bucket bucket : dataReadResult.d) {
            List list = this.d;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    list.add(bucket);
                    break;
                }
                Bucket bucket2 = (Bucket) it2.next();
                if (bucket2.b == bucket.b && bucket2.c == bucket.c && bucket2.e == bucket.e && bucket2.g == bucket.g) {
                    Iterator it3 = bucket.f.iterator();
                    while (it3.hasNext()) {
                        i((DataSet) it3.next(), bucket2.f);
                    }
                }
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataReadResult)) {
            return false;
        }
        DataReadResult dataReadResult = (DataReadResult) obj;
        return this.c.equals(dataReadResult.c) && dq70.b(this.b, dataReadResult.b) && dq70.b(this.d, dataReadResult.d);
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b, this.d});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.c, "status");
        List list = this.b;
        int size = list.size();
        Object obj = list;
        if (size > 5) {
            obj = l6g.a(list.size(), " data sets");
        }
        aVar.a(obj, "dataSets");
        List list2 = this.d;
        int size2 = list2.size();
        Object obj2 = list2;
        if (size2 > 5) {
            obj2 = l6g.a(list2.size(), " buckets");
        }
        aVar.a(obj2, "buckets");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        List list;
        int w = ozg0.w(20293, parcel);
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f;
            if (!hasNext) {
                break;
            } else {
                arrayList.add(new RawDataSet((DataSet) it.next(), list));
            }
        }
        ozg0.l(parcel, arrayList, 1);
        ozg0.p(parcel, 2, this.c, i, false);
        List list3 = this.d;
        ArrayList arrayList2 = new ArrayList(list3.size());
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new RawBucket((Bucket) it2.next(), list));
        }
        ozg0.l(parcel, arrayList2, 3);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e);
        ozg0.u(parcel, 6, list, false);
        ozg0.x(w, parcel);
    }

    public DataReadResult(@NonNull List list, @NonNull List list2, @NonNull Status status) {
        this.b = list;
        this.c = status;
        this.d = list2;
        this.e = 1;
        this.f = new ArrayList();
    }
}
