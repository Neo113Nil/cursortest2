package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i3 = 102;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 2:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case '\t':
                    clientIdentity = (ClientIdentity) SafeParcelReader.h(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CurrentLocationRequest(j, i, i3, j2, z, i2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
