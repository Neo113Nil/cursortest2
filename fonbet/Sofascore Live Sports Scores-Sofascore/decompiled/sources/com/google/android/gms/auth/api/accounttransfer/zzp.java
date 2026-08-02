package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.ljg;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                arrayList = SafeParcelReader.m(parcel, readInt, zzu.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                i2 = SafeParcelReader.v(parcel, readInt);
                hashSet.add(3);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                zzsVar = (zzs) SafeParcelReader.h(parcel, readInt, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == B) {
            return new zzo(hashSet, i, arrayList, i2, zzsVar);
        }
        throw new SafeParcelReader.ParseException(ljg.j(B, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
