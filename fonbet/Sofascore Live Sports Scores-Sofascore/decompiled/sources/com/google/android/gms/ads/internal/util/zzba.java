package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfmy;
import defpackage.b0a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final int zzb;

    public zzba(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzba zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze a = zzfmy.a(th);
        return new zzba(b0a.U(th.getMessage()) ? a.zzb : th.getMessage(), a.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, str, false);
        int i2 = this.zzb;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.t(parcel, s);
    }

    public final zzaz zzb() {
        return new zzaz(this.zza, this.zzb);
    }
}
