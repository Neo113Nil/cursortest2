package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str11 = null;
        String str12 = null;
        int i4 = 100;
        boolean z4 = true;
        boolean z5 = true;
        long j9 = -2147483648L;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\b':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    j9 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\f':
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 14:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 15:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 16:
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 18:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 21:
                    bool = SafeParcelReader.p(parcel, readInt);
                    break;
                case 22:
                    j4 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 25:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 26:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 27:
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 28:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 29:
                    j5 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 30:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 31:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case ' ':
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\"':
                    j6 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '#':
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '$':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '%':
                    j7 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '&':
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\'':
                    j8 = SafeParcelReader.x(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzr(str5, str6, str7, str8, j, j2, str9, z4, z, j9, str10, j3, i, z5, z2, bool, j4, arrayList, str, str2, str11, z3, j5, i4, str3, i2, j6, str12, str4, j7, i3, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
