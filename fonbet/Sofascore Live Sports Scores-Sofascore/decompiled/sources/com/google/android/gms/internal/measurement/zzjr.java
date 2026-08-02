package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        zzjo zzjoVar = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                zzjoVar = (zzjo) SafeParcelReader.h(parcel, readInt, zzjo.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzjq(str, str2, zzjoVar, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjq[i];
    }
}
