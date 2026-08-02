package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        ArrayList arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        ArrayList arrayList2 = null;
        zzj zzjVar = null;
        zzl zzlVar = null;
        double d = 0.0d;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) SafeParcelReader.h(parcel, readInt, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) SafeParcelReader.h(parcel, readInt, CastMediaOptions.CREATOR);
                    break;
                case '\b':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\n':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\f':
                    z6 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    arrayList2 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 14:
                    z7 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    SafeParcelReader.v(parcel, readInt);
                    break;
                case 16:
                    z8 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 17:
                    zzjVar = (zzj) SafeParcelReader.h(parcel, readInt, zzj.CREATOR);
                    break;
                case 18:
                    zzlVar = (zzl) SafeParcelReader.h(parcel, readInt, zzl.CREATOR);
                    break;
                case 19:
                    z9 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 20:
                    z10 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6, arrayList2, z7, z8, zzjVar, zzlVar, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastOptions[i];
    }
}
