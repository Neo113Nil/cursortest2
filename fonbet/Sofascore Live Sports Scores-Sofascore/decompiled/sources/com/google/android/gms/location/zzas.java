package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.fn0;
import defpackage.me4;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zzas(int i, int i2, int i3, int i4) {
        Preconditions.k("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        Preconditions.k("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        Preconditions.k("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        Preconditions.k("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        Preconditions.k("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.a == zzasVar.a && this.b == zzasVar.b && this.c == zzasVar.c && this.d == zzasVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(fn0.b(length, 50, length2, 10, length3, 12, String.valueOf(i4).length()) + 1);
        me4.r(sb, "UserPreferredSleepWindow [startHour=", i, ", startMinute=", i2);
        me4.r(sb, ", endHour=", i3, ", endMinute=", i4);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.t(parcel, s);
    }
}
