package com.google.android.gms.internal.location;

import E9.b;
import K9.t;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    LocationRequest zza;

    public zzdd(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    t.a(workSource, clientIdentity.f32622a, clientIdentity.f32623b);
                }
            }
            aVar.j(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.i(2);
        }
        if (str != null) {
            aVar.h(str);
        } else if (str2 != null) {
            aVar.h(str2);
        }
        if (z12) {
            aVar.g(true);
        }
        if (z13) {
            aVar.f(true);
        }
        if (j10 != LongCompanionObject.MAX_VALUE) {
            aVar.d(j10);
        }
        this.zza = aVar.a();
    }

    @Deprecated
    public static zzdd zza(String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, LongCompanionObject.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdd) {
            return AbstractC3189m.b(this.zza, ((zzdd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, this.zza, i10, false);
        b.b(parcel, a10);
    }
}
