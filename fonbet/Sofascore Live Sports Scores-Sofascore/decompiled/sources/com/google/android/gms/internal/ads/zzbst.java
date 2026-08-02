package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzbst extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbst> CREATOR = new zzbsu();
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public zzbst(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.m(parcel, 2, this.c, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.r(parcel, 1000, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.t(parcel, s);
    }
}
