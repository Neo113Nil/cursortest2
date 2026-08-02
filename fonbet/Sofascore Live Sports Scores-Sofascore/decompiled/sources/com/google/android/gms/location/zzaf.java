package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        long j = -1;
        float f = 0.0f;
        int i3 = Integer.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        long j5 = 600000;
        long j6 = 3600000;
        int i4 = 102;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    j6 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                    j5 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 5:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 6:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\b':
                    j4 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\t':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 11:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\f':
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\r':
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 15:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) SafeParcelReader.h(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new LocationRequest(i4, j6, j5, j4, j2, j3, i3, f, z, j, i, i2, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
