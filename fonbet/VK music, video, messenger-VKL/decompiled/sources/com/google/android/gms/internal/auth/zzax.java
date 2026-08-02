package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    public zzax(int i, String str) {
        this.zza = 1;
        exc0.i(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 2, this.zzb, false);
        ozg0.x(w, parcel);
    }

    public zzax(String str) {
        this(1, str);
    }
}
