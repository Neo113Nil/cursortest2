package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        zzi zziVar = null;
        zzg zzgVar = null;
        boolean z6 = true;
        boolean z7 = true;
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
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\b':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\r':
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 14:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    z6 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 16:
                    zziVar = (zzi) SafeParcelReader.h(parcel, readInt, zzi.CREATOR);
                    break;
                case 17:
                    z7 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 18:
                    zzgVar = (zzg) SafeParcelReader.h(parcel, readInt, zzg.CREATOR);
                    break;
                case 19:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 20:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 21:
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList, z4, z6, zziVar, z7, zzgVar, i4, i5, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
