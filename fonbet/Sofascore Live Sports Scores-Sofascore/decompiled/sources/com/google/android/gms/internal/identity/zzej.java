package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        zzeg zzegVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i = 1;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    zzegVar = (zzeg) SafeParcelReader.h(parcel, readInt, zzeg.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 7:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case '\b':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzei(i, zzegVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzei[i];
    }
}
