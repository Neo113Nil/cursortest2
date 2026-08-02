package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        zzih[] zzihVarArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                zzihVarArr = (zzih[]) SafeParcelReader.l(parcel, readInt, zzih.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzen(i, z, zzihVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzen[i];
    }
}
