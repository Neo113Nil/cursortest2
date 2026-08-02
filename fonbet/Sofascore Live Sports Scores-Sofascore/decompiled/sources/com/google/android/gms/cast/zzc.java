package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c == 3) {
                j2 = SafeParcelReader.x(parcel, readInt);
            } else if (c == 4) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 5) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j3 = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new AdBreakStatus(j, j2, str, str2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdBreakStatus[i];
    }
}
