package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzj();
    private byte[] zzej;

    public zzg(byte[] bArr) {
        this.zzej = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 2, this.zzej, false);
        ozg0.x(w, parcel);
    }

    public zzg() {
        this(new byte[0]);
    }
}
