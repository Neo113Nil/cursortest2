package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public Bundle a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.b(parcel, 1, this.a);
        SafeParcelWriter.p(parcel, 2, this.b, i);
        int i2 = this.c;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.l(parcel, 4, this.d, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
