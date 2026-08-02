package com.google.android.gms.location;

import E9.b;
import V9.C1762s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C1762s();

    /* renamed from: a, reason: collision with root package name */
    public final int f33148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33150c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33151d;

    public zzac(int i10, int i11, long j10, long j11) {
        this.f33148a = i10;
        this.f33149b = i11;
        this.f33150c = j10;
        this.f33151d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.f33148a == zzacVar.f33148a && this.f33149b == zzacVar.f33149b && this.f33150c == zzacVar.f33150c && this.f33151d == zzacVar.f33151d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33149b), Integer.valueOf(this.f33148a), Long.valueOf(this.f33151d), Long.valueOf(this.f33150c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f33148a + " Cell status: " + this.f33149b + " elapsed time NS: " + this.f33151d + " system time ms: " + this.f33150c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f33148a);
        b.u(parcel, 2, this.f33149b);
        b.y(parcel, 3, this.f33150c);
        b.y(parcel, 4, this.f33151d);
        b.b(parcel, a10);
    }
}
