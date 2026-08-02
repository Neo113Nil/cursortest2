package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        ChannelIdValue channelIdValue = null;
        String str = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    d = SafeParcelReader.s(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m(parcel, readInt, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) SafeParcelReader.h(parcel, readInt, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new SignRequestParams(num, d, uri, bArr, arrayList, channelIdValue, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }
}
