package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                clientIdentity = (ClientIdentity) SafeParcelReader.h(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new LastLocationRequest(j, i, z, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
