package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        NotificationOptions notificationOptions = null;
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
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) SafeParcelReader.h(parcel, readInt, NotificationOptions.CREATOR);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CastMediaOptions(str, str2, iBinder, notificationOptions, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastMediaOptions[i];
    }
}
