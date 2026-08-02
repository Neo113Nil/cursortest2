package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;
import defpackage.bf3;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzib extends AbstractSafeParcelable implements Node {
    public static final Parcelable.Creator<zzib> CREATOR = new zzic();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public zzib(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzib) {
            return ((zzib) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        int length2 = String.valueOf(str2).length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(fn0.b(length, 10, length2, 7, length3, 11, String.valueOf(z).length()) + 1);
        bf3.v(sb, "Node{", str, ", id=", str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
