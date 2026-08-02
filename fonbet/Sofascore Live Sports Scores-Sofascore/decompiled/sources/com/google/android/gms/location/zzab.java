package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        zzal[] zzalVarArr = null;
        long j = 0;
        int i = 1;
        int i2 = 1;
        int i3 = 1000;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    zzalVarArr = (zzal[]) SafeParcelReader.l(parcel, readInt, zzal.CREATOR);
                    break;
                case 6:
                    SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new LocationAvailability(i3, i, i2, j, zzalVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
