package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        zze zzeVar = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                zzeVar = (zze) SafeParcelReader.h(parcel, readInt, zze.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                iBinder = SafeParcelReader.u(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zze(i, str, str2, zzeVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
