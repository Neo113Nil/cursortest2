package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        zzft zzftVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    zzftVar = (zzft) SafeParcelReader.h(parcel, readInt, zzft.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.h(parcel, readInt, Location.CREATOR);
                    break;
                case '\f':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    bundle2 = SafeParcelReader.b(parcel, readInt);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.b(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 16:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 18:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.h(parcel, readInt, zzc.CREATOR);
                    break;
                case 20:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 21:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 23:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 24:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 25:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 26:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 27:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 28:
                    i7 = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzm(i, j, bundle, i2, arrayList, z, i3, z2, str, zzftVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzcVar, i4, str5, arrayList3, i5, str6, i6, j2, j3, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
