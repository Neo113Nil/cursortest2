package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public zzdb(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.b(parcel, 7, this.d);
        SafeParcelWriter.m(parcel, 8, this.e, false);
        SafeParcelWriter.t(parcel, s);
    }
}
