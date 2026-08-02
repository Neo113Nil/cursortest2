package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 2) {
                int z = SafeParcelReader.z(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (z == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, z);
                    parcel.setDataPosition(dataPosition + z);
                    parcel2 = obtain;
                }
            } else if (c != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                zanVar = (zan) SafeParcelReader.h(parcel, readInt, zan.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new SafeParcelResponse(i, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
