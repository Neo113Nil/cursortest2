package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = -1;
        int i2 = 0;
        short s = 0;
        int i3 = 0;
        long j = 0;
        float f = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                    SafeParcelReader.C(parcel, readInt, 4);
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
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\t':
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzek(str, i2, s, d, d2, f, j, i3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzek[i];
    }
}
