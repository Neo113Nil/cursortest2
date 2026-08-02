package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        ClientIdentity clientIdentity = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 6) {
                str3 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 7) {
                clientIdentity = (ClientIdentity) SafeParcelReader.h(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c != '\b') {
                SafeParcelReader.A(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, Feature.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClientIdentity(i, str, str2, str3, arrayList, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
