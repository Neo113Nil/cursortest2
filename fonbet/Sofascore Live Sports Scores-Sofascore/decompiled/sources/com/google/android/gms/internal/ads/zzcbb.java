package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzbmk zzbmkVar = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzee zzeeVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzbst zzbstVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.h(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.h(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.h(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundle2 = SafeParcelReader.b(parcel, readInt);
                    break;
                case '\r':
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.b(parcel, readInt);
                    break;
                case 16:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 18:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 19:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 20:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 21:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 25:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 26:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 28:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 29:
                    zzbmkVar = (zzbmk) SafeParcelReader.h(parcel, readInt, zzbmk.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 31:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '!':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\"':
                    f2 = SafeParcelReader.t(parcel, readInt);
                    break;
                case '#':
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '$':
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '%':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\'':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '(':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case ')':
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '*':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '+':
                    i7 = SafeParcelReader.v(parcel, readInt);
                    break;
                case ',':
                    bundle4 = SafeParcelReader.b(parcel, readInt);
                    break;
                case '-':
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '.':
                    zzeeVar = (zzee) SafeParcelReader.h(parcel, readInt, zzee.CREATOR);
                    break;
                case '/':
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '0':
                    bundle5 = SafeParcelReader.b(parcel, readInt);
                    break;
                case '1':
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '2':
                    str13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '3':
                    str14 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '4':
                    z6 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '5':
                    arrayList4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '6':
                    str15 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '7':
                    arrayList5 = SafeParcelReader.k(parcel, readInt);
                    break;
                case '8':
                    i8 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '9':
                    z7 = SafeParcelReader.o(parcel, readInt);
                    break;
                case ':':
                    z8 = SafeParcelReader.o(parcel, readInt);
                    break;
                case ';':
                    z9 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '<':
                    arrayList6 = SafeParcelReader.k(parcel, readInt);
                    break;
                case '=':
                    str16 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '?':
                    zzbstVar = (zzbst) SafeParcelReader.h(parcel, readInt, zzbst.CREATOR);
                    break;
                case '@':
                    str17 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 'A':
                    bundle6 = SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzcba(i, bundle, zzmVar, zzrVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzbmkVar, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzeeVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbstVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcba[i];
    }
}
