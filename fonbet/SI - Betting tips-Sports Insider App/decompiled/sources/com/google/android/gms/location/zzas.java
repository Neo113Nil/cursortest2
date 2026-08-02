package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new a(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f5762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5765d;

    public zzas(int i5, int i10, int i11, int i12) {
        v.j("Start hour must be in range [0, 23].", i5 >= 0 && i5 <= 23);
        v.j("Start minute must be in range [0, 59].", i10 >= 0 && i10 <= 59);
        v.j("End hour must be in range [0, 23].", i11 >= 0 && i11 <= 23);
        v.j("End minute must be in range [0, 59].", i12 >= 0 && i12 <= 59);
        v.j("Parameters can't be all 0.", ((i5 + i10) + i11) + i12 > 0);
        this.f5762a = i5;
        this.f5763b = i10;
        this.f5764c = i11;
        this.f5765d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.f5762a == zzasVar.f5762a && this.f5763b == zzasVar.f5763b && this.f5764c == zzasVar.f5764c && this.f5765d == zzasVar.f5765d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5762a), Integer.valueOf(this.f5763b), Integer.valueOf(this.f5764c), Integer.valueOf(this.f5765d)});
    }

    public final String toString() {
        int i5 = this.f5762a;
        int length = String.valueOf(i5).length();
        int i10 = this.f5763b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f5764c;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f5765d;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i12).length() + 1);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i5);
        sb2.append(", startMinute=");
        sb2.append(i10);
        sb2.append(", endHour=");
        sb2.append(i11);
        sb2.append(", endMinute=");
        sb2.append(i12);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5762a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5763b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5764c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f5765d);
        b.W(parcel, V);
    }
}
