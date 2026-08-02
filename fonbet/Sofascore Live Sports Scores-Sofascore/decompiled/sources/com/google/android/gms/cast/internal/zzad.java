package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        ApplicationMetadata applicationMetadata = null;
        com.google.android.gms.cast.zzao zzaoVar = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) SafeParcelReader.h(parcel, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    zzaoVar = (com.google.android.gms.cast.zzao) SafeParcelReader.h(parcel, readInt, com.google.android.gms.cast.zzao.CREATOR);
                    break;
                case '\b':
                    d2 = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzac(d, z, i, applicationMetadata, i2, zzaoVar, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
