package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    SafeParcelReader.E(parcel, readInt, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    d2 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 7:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\t':
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzdh(str, i, s, d, d2, f, j, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdh[i];
    }
}
