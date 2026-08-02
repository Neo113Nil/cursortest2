package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.ljg;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzw zzwVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                zzwVar = (zzw) SafeParcelReader.h(parcel, readInt, zzw.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
                hashSet.add(3);
            } else if (c == 4) {
                str2 = SafeParcelReader.i(parcel, readInt);
                hashSet.add(4);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str3 = SafeParcelReader.i(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == B) {
            return new zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new SafeParcelReader.ParseException(ljg.j(B, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
