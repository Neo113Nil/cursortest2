package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfnt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
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
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzfns(i, str, i2, i3, i4, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfns[i];
    }
}
