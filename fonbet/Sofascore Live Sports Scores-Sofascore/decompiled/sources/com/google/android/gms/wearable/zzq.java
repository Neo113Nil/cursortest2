package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
            } else if (c == 4) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (c == 5) {
                bArr = SafeParcelReader.c(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new PutDataRequest(uri, bundle, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
