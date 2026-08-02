package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i, String str, int i2) {
        this.zza = 1;
        exc0.i(str);
        this.zzb = str;
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 2, this.zzb, false);
        int i3 = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i3);
        ozg0.x(w, parcel);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
