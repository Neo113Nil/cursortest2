package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    vastAdsRequest = (VastAdsRequest) SafeParcelReader.h(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }
}
