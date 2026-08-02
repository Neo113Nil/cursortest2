package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjv();
    public final int a;
    public final int b;

    public zzju(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzju zzjuVar) {
        zzju zzjuVar2 = zzjuVar;
        int i = zzjuVar2.a;
        int i2 = this.a;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = zzjuVar2.b;
        int i4 = this.b;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r3 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        return (obj instanceof zzju) && (i2 = this.a) >= i && i2 <= i && (i4 = this.b) >= i3 && i4 <= i3;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        me4.r(sb, "GenericDimension(", i, ", ", i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.t(parcel, s);
    }
}
