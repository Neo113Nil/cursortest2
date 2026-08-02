package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbi implements Parcelable.Creator {
    public static void a(zzbh zzbhVar, Parcel parcel, int i) {
        String str = zzbhVar.a;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, str, false);
        SafeParcelWriter.l(parcel, 3, zzbhVar.b, i, false);
        SafeParcelWriter.m(parcel, 4, zzbhVar.c, false);
        long j = zzbhVar.d;
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zzbhVar.e;
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.t(parcel, s);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        zzbf zzbfVar = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                zzbfVar = (zzbf) SafeParcelReader.h(parcel, readInt, zzbf.CREATOR);
            } else if (c == 4) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 5) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j2 = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzbh(str, zzbfVar, str2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
