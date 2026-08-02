package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.ts01;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new ts01();
    public final int b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public DeviceMetaData(long j, int i, boolean z, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
