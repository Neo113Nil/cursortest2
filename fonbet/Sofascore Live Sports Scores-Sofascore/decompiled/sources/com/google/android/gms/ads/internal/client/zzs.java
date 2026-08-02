package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                    zzrVarArr = (zzr[]) SafeParcelReader.l(parcel, readInt, zzr.CREATOR);
                    break;
                case '\t':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\f':
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    z6 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 14:
                    z7 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    z8 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 16:
                    z9 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 17:
                    z10 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzr(str, i, i2, z, i3, i4, zzrVarArr, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
