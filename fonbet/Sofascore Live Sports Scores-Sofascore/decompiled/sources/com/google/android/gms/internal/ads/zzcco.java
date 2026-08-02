package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcco extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcco> CREATOR = new zzccp();
    public final com.google.android.gms.ads.internal.client.zzm a;
    public final String b;

    public zzcco(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        this.a = zzmVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
