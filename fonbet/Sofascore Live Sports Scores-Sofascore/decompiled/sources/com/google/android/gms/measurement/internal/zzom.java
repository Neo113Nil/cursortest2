package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.c(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.b(parcel, 4, this.d);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(this.f);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }
}
