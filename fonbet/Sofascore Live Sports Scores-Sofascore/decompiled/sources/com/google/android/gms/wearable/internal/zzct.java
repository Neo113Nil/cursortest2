package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzct implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        String str = null;
        Long l = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 4:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m(parcel, readInt, zzb.CREATOR);
                    break;
                case 7:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    l = SafeParcelReader.y(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzcs(i, z, z2, z3, z4, arrayList, str, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcs[i];
    }
}
