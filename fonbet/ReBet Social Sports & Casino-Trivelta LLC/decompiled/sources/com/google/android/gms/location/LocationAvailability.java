package com.google.android.gms.location;

import E9.b;
import V9.O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f33092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33093b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33094c;

    /* renamed from: d, reason: collision with root package name */
    public int f33095d;
    private final zzac[] zzg;

    /* renamed from: e, reason: collision with root package name */
    public static final LocationAvailability f33090e = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f33091f = new LocationAvailability(1000, 1, 1, 0, null, false);

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new O();

    public LocationAvailability(int i10, int i11, int i12, long j10, zzac[] zzacVarArr, boolean z10) {
        this.f33095d = i10 < 1000 ? 0 : 1000;
        this.f33092a = i11;
        this.f33093b = i12;
        this.f33094c = j10;
        this.zzg = zzacVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f33092a == locationAvailability.f33092a && this.f33093b == locationAvailability.f33093b && this.f33094c == locationAvailability.f33094c && this.f33095d == locationAvailability.f33095d && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return this.f33095d < 1000;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33095d));
    }

    public String toString() {
        return "LocationAvailability[" + g() + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f33092a);
        b.u(parcel, 2, this.f33093b);
        b.y(parcel, 3, this.f33094c);
        b.u(parcel, 4, this.f33095d);
        b.I(parcel, 5, this.zzg, i10, false);
        b.g(parcel, 6, g());
        b.b(parcel, a10);
    }
}
