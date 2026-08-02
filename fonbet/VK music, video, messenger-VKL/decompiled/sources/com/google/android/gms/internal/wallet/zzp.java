package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
public final class zzp implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final zzm createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = SafeParcelReader.j(parcel, readInt);
            } else if (c == 2) {
                iArr = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                remoteViews = (RemoteViews) SafeParcelReader.h(parcel, readInt, RemoteViews.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                bArr = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzm(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
