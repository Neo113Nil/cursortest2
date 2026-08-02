package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.s801;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes.dex */
public class StoreBytesData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new s801();
    public final byte[] b;
    public final boolean c;
    public final String d;

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.b = bArr;
        this.c = z;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.x(w, parcel);
    }
}
