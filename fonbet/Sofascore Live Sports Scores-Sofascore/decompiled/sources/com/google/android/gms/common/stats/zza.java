package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case '\b':
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\n':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\f':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 15:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 16:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 17:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 18:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
