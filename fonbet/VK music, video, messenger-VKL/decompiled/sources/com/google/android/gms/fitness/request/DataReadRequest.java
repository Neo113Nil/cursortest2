package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzbs;
import com.google.android.gms.internal.fitness.zzbt;
import defpackage.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.dq70;
import xsna.exc0;
import xsna.fl01;
import xsna.nsz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataReadRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataReadRequest> CREATOR = new fl01();
    public final List b;
    public final List c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final int h;
    public final long i;
    public final DataSource j;
    public final int k;
    public final boolean l;
    public final boolean m;

    @Nullable
    public final zzbt n;
    public final List o;
    public final List p;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static class a {
        public long e;
        public long f;
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList g = new ArrayList();
        public final ArrayList h = new ArrayList();
        public int i = 0;
        public long j = 0;
        public boolean k = false;

        @NonNull
        @Deprecated
        public final void a(@NonNull DataSource dataSource, @NonNull DataType dataType) {
            exc0.k("Cannot add the same data source for aggregated and detailed", !this.b.contains(dataSource));
            DataType dataType2 = dataSource.b;
            dataType2.getClass();
            DataType dataType3 = (DataType) nsz0.a.get(dataType2);
            if (dataType3 == null) {
                throw new IllegalArgumentException("Unsupported input data type specified for aggregation: ".concat(String.valueOf(dataType2)));
            }
            exc0.c(dataType3.equals(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
            ArrayList arrayList = this.d;
            if (arrayList.contains(dataSource)) {
                return;
            }
            arrayList.add(dataSource);
        }

        @NonNull
        public final void b(@NonNull DataType dataType) {
            exc0.j(dataType, "Attempting to use a null data type");
            exc0.k("Cannot add the same data type as aggregated and detailed", !this.a.contains(dataType));
            exc0.c(((DataType) nsz0.a.get(dataType)) != null, "Unsupported input data type specified for aggregation: %s", dataType);
            ArrayList arrayList = this.c;
            if (arrayList.contains(dataType)) {
                return;
            }
            arrayList.add(dataType);
        }

        @NonNull
        @Deprecated
        public final void c(@NonNull DataType dataType, @NonNull DataType dataType2) {
            exc0.j(dataType, "Attempting to use a null data type");
            exc0.k("Cannot add the same data type as aggregated and detailed", !this.a.contains(dataType));
            DataType dataType3 = (DataType) nsz0.a.get(dataType);
            if (dataType3 == null) {
                throw new IllegalArgumentException("Unsupported input data type specified for aggregation: ".concat(String.valueOf(dataType)));
            }
            exc0.c(dataType3.equals(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            ArrayList arrayList = this.c;
            if (arrayList.contains(dataType)) {
                return;
            }
            arrayList.add(dataType);
        }

        @NonNull
        public final void d() {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i = this.i;
            exc0.c(i == 0, "Bucketing strategy already set to %s", Integer.valueOf(i));
            this.i = 2;
            this.j = timeUnit.toMillis(1);
        }

        @NonNull
        public final void e(int i, @NonNull TimeUnit timeUnit) {
            int i2 = this.i;
            exc0.c(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            exc0.c(i > 0, "Must specify a valid minimum duration: %d", Integer.valueOf(i));
            this.i = 1;
            this.j = timeUnit.toMillis(i);
        }

        @NonNull
        public final DataReadRequest f() {
            ArrayList arrayList = this.b;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.a;
            ArrayList arrayList3 = this.c;
            ArrayList arrayList4 = this.d;
            exc0.k("Must add at least one data source (aggregated or detailed)", (isEmpty && arrayList2.isEmpty() && arrayList4.isEmpty() && arrayList3.isEmpty()) ? false : true);
            long j = this.e;
            if (!(j > 0)) {
                throw new IllegalStateException(k0.a(j, "Invalid start time: "));
            }
            long j2 = this.f;
            if (!(j2 > 0 && j2 > this.e)) {
                throw new IllegalStateException(k0.a(j2, "Invalid end time: "));
            }
            boolean z = arrayList4.isEmpty() && arrayList3.isEmpty();
            if (this.i == 0) {
                exc0.k("Must specify a valid bucketing strategy while requesting aggregation", z);
            }
            if (!z) {
                exc0.k("Must specify a valid bucketing strategy while requesting aggregation", this.i != 0);
            }
            return new DataReadRequest((List) arrayList2, (List) arrayList, this.e, this.f, (List) arrayList3, (List) arrayList4, this.i, this.j, (DataSource) null, 0, false, this.k, (zzbt) null, (List) this.g, (List) this.h);
        }

        @NonNull
        public final void g() {
            this.k = true;
        }

        @NonNull
        public final void h(long j, long j2, @NonNull TimeUnit timeUnit) {
            this.e = timeUnit.toMillis(j);
            this.f = timeUnit.toMillis(j2);
        }
    }

    public DataReadRequest(DataReadRequest dataReadRequest, zzbt zzbtVar) {
        this(dataReadRequest.b, dataReadRequest.c, dataReadRequest.d, dataReadRequest.e, dataReadRequest.f, dataReadRequest.g, dataReadRequest.h, dataReadRequest.i, dataReadRequest.j, dataReadRequest.k, dataReadRequest.l, dataReadRequest.m, zzbtVar, dataReadRequest.o, dataReadRequest.p);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataReadRequest) {
            DataReadRequest dataReadRequest = (DataReadRequest) obj;
            if (this.b.equals(dataReadRequest.b) && this.c.equals(dataReadRequest.c) && this.d == dataReadRequest.d && this.e == dataReadRequest.e && this.h == dataReadRequest.h && this.g.equals(dataReadRequest.g) && this.f.equals(dataReadRequest.f) && dq70.b(this.j, dataReadRequest.j) && this.i == dataReadRequest.i && this.m == dataReadRequest.m && this.k == dataReadRequest.k && this.l == dataReadRequest.l && dq70.b(this.n, dataReadRequest.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataReadRequest{");
        List list = this.b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(((DataType) it.next()).zzc());
                sb.append(" ");
            }
        }
        List list2 = this.c;
        if (!list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                sb.append(((DataSource) it2.next()).zzb());
                sb.append(" ");
            }
        }
        int i = this.h;
        if (i != 0) {
            sb.append("bucket by ");
            sb.append(Bucket.n(i));
            long j = this.i;
            if (j > 0) {
                sb.append(" >");
                sb.append(j);
                sb.append(UcumUtils.UCUM_MILLISECODS);
            }
            sb.append(": ");
        }
        List list3 = this.f;
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                sb.append(((DataType) it3.next()).zzc());
                sb.append(" ");
            }
        }
        List list4 = this.g;
        if (!list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                sb.append(((DataSource) it4.next()).zzb());
                sb.append(" ");
            }
        }
        Locale locale = Locale.US;
        long j2 = this.d;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j2);
        long j3 = this.e;
        sb.append(String.format(locale, "(%tF %tT - %tF %tT)", valueOf, valueOf2, Long.valueOf(j3), Long.valueOf(j3)));
        DataSource dataSource = this.j;
        if (dataSource != null) {
            sb.append("activities: ");
            sb.append(dataSource.zzb());
        }
        if (this.m) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.u(parcel, 5, this.f, false);
        ozg0.u(parcel, 6, this.g, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.h);
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(this.i);
        ozg0.p(parcel, 9, this.j, i, false);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.k);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.l ? 1 : 0);
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(this.m ? 1 : 0);
        zzbt zzbtVar = this.n;
        ozg0.h(parcel, 14, zzbtVar == null ? null : zzbtVar.asBinder());
        ozg0.n(parcel, this.o, 18);
        ozg0.n(parcel, this.p, 19);
        ozg0.x(w, parcel);
    }

    public DataReadRequest(List list, List list2, long j, long j2, List list3, List list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, @Nullable IBinder iBinder, List list5, List list6) {
        this.b = list;
        this.c = list2;
        this.d = j;
        this.e = j2;
        this.f = list3;
        this.g = list4;
        this.h = i;
        this.i = j3;
        this.j = dataSource;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.n = iBinder == null ? null : zzbs.zzc(iBinder);
        List list7 = list5 == null ? Collections.EMPTY_LIST : list5;
        this.o = list7;
        List list8 = list6 == null ? Collections.EMPTY_LIST : list6;
        this.p = list8;
        exc0.a("Unequal number of interval start and end times.", list7.size() == list8.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r17v2 */
    public DataReadRequest(List list, List list2, long j, long j2, List list3, List list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, @Nullable zzbt zzbtVar, List list5, List list6) {
        this(list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, (IBinder) (zzbtVar == null ? 0 : zzbtVar), list5, list6);
    }
}
