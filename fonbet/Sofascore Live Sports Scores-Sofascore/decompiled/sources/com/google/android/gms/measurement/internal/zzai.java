package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        zzpl zzplVar = null;
        String str3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
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
                    zzplVar = (zzpl) SafeParcelReader.h(parcel, readInt, zzpl.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    zzbhVar = (zzbh) SafeParcelReader.h(parcel, readInt, zzbh.CREATOR);
                    break;
                case '\t':
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\n':
                    zzbhVar2 = (zzbh) SafeParcelReader.h(parcel, readInt, zzbh.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\f':
                    zzbhVar3 = (zzbh) SafeParcelReader.h(parcel, readInt, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzah(str, str2, zzplVar, j, z, str3, zzbhVar, j2, zzbhVar2, j3, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
