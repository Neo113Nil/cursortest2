package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
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
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i7 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    i8 = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
