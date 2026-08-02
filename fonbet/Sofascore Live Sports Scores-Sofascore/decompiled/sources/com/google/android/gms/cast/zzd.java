package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
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
                    SafeParcelReader.m(parcel, readInt, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
                    break;
                case '\b':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    bool = SafeParcelReader.p(parcel, readInt);
                    break;
                case 11:
                    bool2 = SafeParcelReader.p(parcel, readInt);
                    break;
                case '\f':
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ApplicationMetadata(str, str2, arrayList, str3, uri, str4, str5, bool, bool2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
