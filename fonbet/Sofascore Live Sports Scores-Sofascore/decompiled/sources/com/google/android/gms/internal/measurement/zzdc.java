package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c == 2) {
                j2 = SafeParcelReader.x(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 7) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (c != '\b') {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzdb(j, j2, z, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdb[i];
    }
}
