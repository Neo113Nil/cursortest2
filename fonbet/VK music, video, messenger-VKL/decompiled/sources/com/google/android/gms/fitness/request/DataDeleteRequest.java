package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;
import xsna.sg01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataDeleteRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataDeleteRequest> CREATOR = new sg01();
    public final long b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;

    @Nullable
    public final zzcw i;
    public final boolean j;
    public final boolean k;

    public DataDeleteRequest(long j, long j2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable IBinder iBinder) {
        this.b = j;
        this.c = j2;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = arrayList3;
        this.g = z;
        this.h = z2;
        this.j = z3;
        this.k = z4;
        this.i = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataDeleteRequest)) {
            return false;
        }
        DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) obj;
        return this.b == dataDeleteRequest.b && this.c == dataDeleteRequest.c && dq70.b(this.d, dataDeleteRequest.d) && dq70.b(this.e, dataDeleteRequest.e) && dq70.b(this.f, dataDeleteRequest.f) && this.g == dataDeleteRequest.g && this.h == dataDeleteRequest.h && this.j == dataDeleteRequest.j && this.k == dataDeleteRequest.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "startTimeMillis");
        aVar.a(Long.valueOf(this.c), "endTimeMillis");
        aVar.a(this.d, "dataSources");
        aVar.a(this.e, "dateTypes");
        aVar.a(this.f, "sessions");
        aVar.a(Boolean.valueOf(this.g), "deleteAllData");
        aVar.a(Boolean.valueOf(this.h), "deleteAllSessions");
        if (this.j) {
            aVar.a(Boolean.TRUE, "deleteByTimeRange");
        }
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.u(parcel, 3, this.d, false);
        ozg0.u(parcel, 4, this.e, false);
        ozg0.u(parcel, 5, this.f, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.h ? 1 : 0);
        zzcw zzcwVar = this.i;
        ozg0.h(parcel, 8, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(this.k ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzcw zzcwVar) {
        this.b = j;
        this.c = j2;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = list3;
        this.g = z;
        this.h = z2;
        this.j = z3;
        this.k = z4;
        this.i = zzcwVar;
    }

    public DataDeleteRequest(DataDeleteRequest dataDeleteRequest, zzcw zzcwVar) {
        this(dataDeleteRequest.b, dataDeleteRequest.c, dataDeleteRequest.d, dataDeleteRequest.e, dataDeleteRequest.f, dataDeleteRequest.g, dataDeleteRequest.h, dataDeleteRequest.j, dataDeleteRequest.k, zzcwVar);
    }
}
