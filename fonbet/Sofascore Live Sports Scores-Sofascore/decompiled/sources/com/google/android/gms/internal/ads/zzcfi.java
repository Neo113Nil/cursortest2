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
public final class zzcfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfi> CREATOR = new zzcfj();
    public final String a;
    public final String b;
    public final com.google.android.gms.ads.internal.client.zzr c;
    public final com.google.android.gms.ads.internal.client.zzm d;

    public zzcfi(String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.a = str;
        this.b = str2;
        this.c = zzrVar;
        this.d = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.l(parcel, 4, this.d, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
