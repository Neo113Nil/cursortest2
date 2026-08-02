package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        double d = 0.0d;
        long j = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\b':
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\t':
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\n':
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzjo(str, j, z, d, str2, bArr, i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjo[i];
    }
}
