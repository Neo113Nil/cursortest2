package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new a(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f5758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5759b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5761d;

    public zzal(int i5, int i10, long j, long j6) {
        this.f5758a = i5;
        this.f5759b = i10;
        this.f5760c = j;
        this.f5761d = j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.f5758a == zzalVar.f5758a && this.f5759b == zzalVar.f5759b && this.f5760c == zzalVar.f5760c && this.f5761d == zzalVar.f5761d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5759b), Integer.valueOf(this.f5758a), Long.valueOf(this.f5761d), Long.valueOf(this.f5760c)});
    }

    public final String toString() {
        int i5 = this.f5758a;
        int length = String.valueOf(i5).length();
        int i10 = this.f5759b;
        int length2 = String.valueOf(i10).length();
        long j = this.f5761d;
        int length3 = String.valueOf(j).length();
        long j6 = this.f5760c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j6).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i5);
        sb2.append(" Cell status: ");
        sb2.append(i10);
        sb2.append(" elapsed time NS: ");
        sb2.append(j);
        sb2.append(" system time ms: ");
        sb2.append(j6);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5758a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5759b);
        b.U(parcel, 3, 8);
        parcel.writeLong(this.f5760c);
        b.U(parcel, 4, 8);
        parcel.writeLong(this.f5761d);
        b.W(parcel, V);
    }
}
