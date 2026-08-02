package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfns zzfnsVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.h(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.h(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.h(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case '\t':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    zzfnsVar = (zzfns) SafeParcelReader.h(parcel, readInt, zzfns.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 14:
                    bundle2 = SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzcbv(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfnsVar, str4, z, z2, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbv[i];
    }
}
