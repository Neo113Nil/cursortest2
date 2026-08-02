package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public zzaa(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        return this.a == zzaaVar.a && this.b == zzaaVar.b && this.c == zzaaVar.c && TextUtils.equals(this.d, zzaaVar.d) && TextUtils.equals(this.e, zzaaVar.e) && TextUtils.equals(this.f, zzaaVar.f) && TextUtils.equals(this.g, zzaaVar.g) && TextUtils.equals(this.h, zzaaVar.h) && this.i == zzaaVar.i && this.j == zzaaVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.m(parcel, 6, this.e, false);
        SafeParcelWriter.m(parcel, 7, this.f, false);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.m(parcel, 9, this.h, false);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.j ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
