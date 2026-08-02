package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        String str = null;
        String str2 = null;
        zzjf[] zzjfVarArr = null;
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    zzjfVarArr = (zzjf[]) SafeParcelReader.l(parcel, readInt, zzjf.CREATOR);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 7:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzjh(str, str2, zzjfVarArr, z, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjh[i];
    }
}
