package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcb;
import com.google.android.gms.internal.fitness.zzcc;
import com.google.android.gms.internal.fitness.zzgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;
import xsna.ps01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class GoalsReadRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoalsReadRequest> CREATOR = new ps01();

    @Nullable
    public final zzcc b;
    public final List c;
    public final List d;
    public final List e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public GoalsReadRequest(GoalsReadRequest goalsReadRequest, zzcc zzccVar) {
        this(zzccVar == null ? 0 : zzccVar, goalsReadRequest.c, goalsReadRequest.d, goalsReadRequest.e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoalsReadRequest)) {
            return false;
        }
        GoalsReadRequest goalsReadRequest = (GoalsReadRequest) obj;
        return dq70.b(this.c, goalsReadRequest.c) && dq70.b(this.d, goalsReadRequest.d) && dq70.b(this.e, goalsReadRequest.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, i()});
    }

    @Nullable
    public final ArrayList i() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzgo.zzb(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.c, "dataTypes");
        aVar.a(this.d, "objectiveTypes");
        aVar.a(i(), "activities");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        zzcc zzccVar = this.b;
        ozg0.h(parcel, 1, zzccVar == null ? null : zzccVar.asBinder());
        ozg0.l(parcel, this.c, 2);
        ozg0.l(parcel, this.d, 3);
        ozg0.l(parcel, this.e, 4);
        ozg0.x(w, parcel);
    }

    public GoalsReadRequest(@Nullable IBinder iBinder, List list, List list2, List list3) {
        this.b = iBinder == null ? null : zzcb.zzb(iBinder);
        this.c = list;
        this.d = list2;
        this.e = list3;
    }
}
