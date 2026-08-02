package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.yf01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class DataSet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DataSet> CREATOR = new yf01();
    public final int b;
    public final DataSource c;
    public final ArrayList d;
    public final List e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public DataSet(int i, DataSource dataSource, ArrayList arrayList, ArrayList arrayList2) {
        this.b = i;
        this.c = dataSource;
        this.d = new ArrayList(arrayList.size());
        this.e = i < 2 ? Collections.singletonList(dataSource) : arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.add(new DataPoint(this.e, (RawDataPoint) it.next()));
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataSet)) {
            return false;
        }
        DataSet dataSet = (DataSet) obj;
        return dq70.b(this.c, dataSet.c) && dq70.b(this.d, dataSet.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    @NonNull
    public final List<DataPoint> i() {
        return Collections.unmodifiableList(this.d);
    }

    @NonNull
    public final DataType j() {
        return this.c.b;
    }

    public final ArrayList k(List list) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new RawDataPoint((DataPoint) it.next(), list));
        }
        return arrayList2;
    }

    @NonNull
    public final String toString() {
        ArrayList k = k(this.e);
        Locale locale = Locale.US;
        String zzb = this.c.zzb();
        ArrayList arrayList = this.d;
        Object obj = k;
        if (arrayList.size() >= 10) {
            obj = String.format(locale, "%d data points, first 5: %s", Integer.valueOf(arrayList.size()), k.subList(0, 5));
        }
        return String.format(locale, "DataSet{%s %s}", zzb, obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.c, i, false);
        List list = this.e;
        ozg0.l(parcel, k(list), 3);
        ozg0.u(parcel, 4, list, false);
        ozg0.v(parcel, 1000, 4);
        parcel.writeInt(this.b);
        ozg0.x(w, parcel);
    }

    public DataSet(@NonNull DataSource dataSource) {
        this.b = 3;
        exc0.i(dataSource);
        this.c = dataSource;
        this.d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add(dataSource);
    }

    public DataSet(@NonNull RawDataSet rawDataSet, @NonNull List list) {
        this.b = 3;
        this.c = (DataSource) list.get(rawDataSet.b);
        this.e = list;
        List list2 = rawDataSet.c;
        this.d = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.d.add(new DataPoint(this.e, (RawDataPoint) it.next()));
        }
    }
}
