package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.h(parcel, readInt, LocationRequest.CREATOR);
            } else if (c != 5) {
                switch (c) {
                    case '\b':
                        z = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\t':
                        z2 = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\n':
                        str = SafeParcelReader.i(parcel, readInt);
                        break;
                    case 11:
                        z3 = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\f':
                        z4 = SafeParcelReader.o(parcel, readInt);
                        break;
                    case '\r':
                        str2 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case 14:
                        j = SafeParcelReader.z(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.C(parcel, readInt);
                        break;
                }
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzdd(locationRequest, arrayList, z, z2, str, z3, z4, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
