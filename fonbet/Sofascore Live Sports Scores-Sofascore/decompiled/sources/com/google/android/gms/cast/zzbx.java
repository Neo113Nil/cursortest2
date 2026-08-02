package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
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
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) SafeParcelReader.h(parcel, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.m(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case '\t':
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\n':
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        MediaQueueData mediaQueueData = new MediaQueueData();
        mediaQueueData.a = str;
        mediaQueueData.b = str2;
        mediaQueueData.c = i;
        mediaQueueData.d = str3;
        mediaQueueData.e = mediaQueueContainerMetadata;
        mediaQueueData.f = i2;
        mediaQueueData.g = arrayList;
        mediaQueueData.h = i3;
        mediaQueueData.i = j;
        mediaQueueData.j = z;
        return mediaQueueData;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
