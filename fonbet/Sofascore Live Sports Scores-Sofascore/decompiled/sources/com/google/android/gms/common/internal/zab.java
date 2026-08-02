package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new zac();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public zab(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
