package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.luz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new luz0();
    public final int b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;
    public final boolean j;
    public final boolean k;

    public zzaa(int i, boolean z, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3, boolean z4) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z3;
        this.k = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        return this.b == zzaaVar.b && this.c == zzaaVar.c && this.d == zzaaVar.d && TextUtils.equals(this.e, zzaaVar.e) && TextUtils.equals(this.f, zzaaVar.f) && TextUtils.equals(this.g, zzaaVar.g) && TextUtils.equals(this.h, zzaaVar.h) && TextUtils.equals(this.i, zzaaVar.i) && this.j == zzaaVar.j && this.k == zzaaVar.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(this.k ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
