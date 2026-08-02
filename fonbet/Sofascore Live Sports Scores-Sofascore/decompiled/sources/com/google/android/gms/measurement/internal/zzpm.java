package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpm implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.a;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i);
        SafeParcelWriter.m(parcel, 2, zzplVar.b, false);
        long j = zzplVar.c;
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(j);
        SafeParcelWriter.k(parcel, 4, zzplVar.d);
        SafeParcelWriter.m(parcel, 6, zzplVar.e, false);
        SafeParcelWriter.m(parcel, 7, zzplVar.f, false);
        SafeParcelWriter.e(parcel, 8, zzplVar.g);
        SafeParcelWriter.t(parcel, s);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                    l = SafeParcelReader.y(parcel, readInt);
                    break;
                case 5:
                    int z = SafeParcelReader.z(parcel, readInt);
                    if (z != 0) {
                        SafeParcelReader.D(parcel, z, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 6:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    d = SafeParcelReader.s(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzpl(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
