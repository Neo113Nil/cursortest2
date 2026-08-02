package com.google.android.gms.location;

import E9.b;
import V9.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    public final int f33152a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33155d;

    public zzaj(int i10, int i11, int i12, int i13) {
        AbstractC3191o.q(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        AbstractC3191o.q(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        AbstractC3191o.q(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        AbstractC3191o.q(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        AbstractC3191o.q(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f33152a = i10;
        this.f33153b = i11;
        this.f33154c = i12;
        this.f33155d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.f33152a == zzajVar.f33152a && this.f33153b == zzajVar.f33153b && this.f33154c == zzajVar.f33154c && this.f33155d == zzajVar.f33155d;
    }

    public final int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33152a), Integer.valueOf(this.f33153b), Integer.valueOf(this.f33154c), Integer.valueOf(this.f33155d));
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.f33152a + ", startMinute=" + this.f33153b + ", endHour=" + this.f33154c + ", endMinute=" + this.f33155d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f33152a);
        b.u(parcel, 2, this.f33153b);
        b.u(parcel, 3, this.f33154c);
        b.u(parcel, 4, this.f33155d);
        b.b(parcel, a10);
    }
}
