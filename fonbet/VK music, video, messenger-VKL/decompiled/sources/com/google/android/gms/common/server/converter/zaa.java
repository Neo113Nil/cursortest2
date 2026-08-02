package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.slz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new slz0();
    public final int b;
    public final StringToIntConverter c;

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.b = i;
        this.c = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.x(w, parcel);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.b = 1;
        this.c = stringToIntConverter;
    }
}
