package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbml implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    zzfwVar = (com.google.android.gms.ads.internal.client.zzfw) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.client.zzfw.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\b':
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\t':
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\n':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzbmk(i, z, i2, z2, i3, zzfwVar, z3, i4, i5, z4, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbmk[i];
    }
}
