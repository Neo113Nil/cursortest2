package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.fn0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzcs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcs> CREATOR = new zzct();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public zzcs(int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = arrayList;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcs)) {
            return false;
        }
        zzcs zzcsVar = (zzcs) obj;
        if (this.a == zzcsVar.a && this.b == zzcsVar.b && this.c == zzcsVar.c && this.d == zzcsVar.d && this.e == zzcsVar.e) {
            List list = zzcsVar.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                if (Objects.a(this.g, zzcsVar.g) && Objects.a(this.h, zzcsVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        int i = this.a;
        int length = String.valueOf(i).length();
        boolean z = this.b;
        int length2 = String.valueOf(z).length();
        boolean z2 = this.c;
        int length3 = String.valueOf(z2).length();
        boolean z3 = this.d;
        int length4 = String.valueOf(z3).length();
        boolean z4 = this.e;
        int length5 = String.valueOf(z4).length();
        int length6 = valueOf.length();
        String str = this.g;
        int length7 = String.valueOf(str).length();
        Long l = this.h;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 21 + length3 + 23 + length4 + 22 + length5 + 25 + length6 + 10 + length7 + 27 + String.valueOf(l).length() + 1);
        sb.append("ConsentResponse {statusCode =");
        sb.append(i);
        sb.append(", hasTosConsent =");
        sb.append(z);
        fn0.y(", hasLoggingConsent =", ", hasCloudSyncConsent =", sb, z2, z3);
        sb.append(", hasLocationConsent =");
        sb.append(z4);
        sb.append(", accountConsentRecords =");
        sb.append(valueOf);
        sb.append(", nodeId =");
        sb.append(str);
        sb.append(", lastUpdateRequestedTime =");
        sb.append(l);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.q(parcel, 6, this.f, false);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.k(parcel, 8, this.h);
        SafeParcelWriter.t(parcel, s);
    }
}
