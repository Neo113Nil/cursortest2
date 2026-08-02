package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.np01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class Tile extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Tile> CREATOR = new np01();
    public final int b;
    public final int c;

    @Nullable
    public final byte[] d;

    public Tile(int i, int i2, @Nullable byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.e(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }
}
