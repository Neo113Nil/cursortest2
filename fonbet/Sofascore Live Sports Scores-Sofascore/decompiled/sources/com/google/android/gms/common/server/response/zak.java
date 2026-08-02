package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        int i = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.h(parcel, readInt, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zam(i, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
