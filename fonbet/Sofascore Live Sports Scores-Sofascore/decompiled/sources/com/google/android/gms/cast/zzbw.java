package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        double d = 0.0d;
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                arrayList2 = SafeParcelReader.m(parcel, readInt, MediaMetadata.CREATOR);
            } else if (c == 5) {
                arrayList = SafeParcelReader.m(parcel, readInt, WebImage.CREATOR);
            } else if (c != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                d = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
        mediaQueueContainerMetadata.a = i;
        mediaQueueContainerMetadata.b = str;
        mediaQueueContainerMetadata.c = arrayList2;
        mediaQueueContainerMetadata.d = arrayList;
        mediaQueueContainerMetadata.e = d;
        return mediaQueueContainerMetadata;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
