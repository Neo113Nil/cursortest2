package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 1;
        zzdd zzddVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    zzddVar = (zzdd) SafeParcelReader.h(parcel, readInt, zzdd.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\b':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzdf(i, zzddVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdf[i];
    }
}
