package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.h(parcel, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    iBinder5 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 11:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\f':
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\r':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.h(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 16:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 19:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 24:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 25:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 27:
                    iBinder8 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 29:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 30:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, versionInfoParcel, str4, zzlVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
