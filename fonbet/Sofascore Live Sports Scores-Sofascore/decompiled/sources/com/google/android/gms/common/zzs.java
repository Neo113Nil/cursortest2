package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = -1;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 4) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzr(i, i2, j, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
