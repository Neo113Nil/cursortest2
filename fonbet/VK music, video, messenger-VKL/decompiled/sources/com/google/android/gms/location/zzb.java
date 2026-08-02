package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.i501;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new i501();
    public final long b;
    public final boolean c;

    @Nullable
    public final WorkSource d;

    @Nullable
    public final String e;

    @Nullable
    public final int[] f;
    public final boolean g;

    @Nullable
    public final String h;
    public final long i;

    @Nullable
    public String j;

    public zzb(long j, boolean z, @Nullable WorkSource workSource, @Nullable String str, @Nullable int[] iArr, boolean z2, @Nullable String str2, long j2, @Nullable String str3) {
        this.b = j;
        this.c = z;
        this.d = workSource;
        this.e = str;
        this.f = iArr;
        this.g = z2;
        this.h = str2;
        this.i = j2;
        this.j = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        exc0.i(parcel);
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.i(parcel, 5, this.f, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(this.i);
        ozg0.q(parcel, 9, this.j, false);
        ozg0.x(w, parcel);
    }
}
