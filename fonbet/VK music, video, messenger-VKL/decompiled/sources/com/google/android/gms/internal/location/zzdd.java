package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import xsna.dq70;
import xsna.exx0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    LocationRequest zza;

    public zzdd(LocationRequest locationRequest, @Nullable List list, boolean z, boolean z2, @Nullable String str, boolean z3, boolean z4, @Nullable String str2, long j) {
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
                    exx0.a(workSource, clientIdentity.b, clientIdentity.c);
                }
            }
            aVar.n = workSource;
        }
        if (z) {
            aVar.c(1);
        }
        if (z2) {
            aVar.i(2);
        }
        if (str != null) {
            aVar.h(str);
        } else if (str2 != null) {
            aVar.h(str2);
        }
        if (z3) {
            aVar.m = true;
        }
        if (z4) {
            aVar.h = true;
        }
        if (j != Long.MAX_VALUE) {
            aVar.d(j);
        }
        this.zza = aVar.a();
    }

    @Deprecated
    public static zzdd zza(@Nullable String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzdd) {
            return dq70.b(this.zza, ((zzdd) obj).zza);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.zza, i, false);
        ozg0.x(w, parcel);
    }
}
