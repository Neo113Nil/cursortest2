package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    workSource = (WorkSource) SafeParcelReader.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    iArr = SafeParcelReader.e(parcel, readInt);
                    break;
                case 6:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\t':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzb(j, z, workSource, str, iArr, z2, str2, j2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
