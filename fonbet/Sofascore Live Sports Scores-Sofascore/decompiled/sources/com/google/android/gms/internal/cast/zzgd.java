package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 4:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzgc(i, z, arrayList, i2, str, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgc[i];
    }
}
