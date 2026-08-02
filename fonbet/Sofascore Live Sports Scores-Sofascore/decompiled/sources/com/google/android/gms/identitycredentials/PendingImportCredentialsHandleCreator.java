package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class PendingImportCredentialsHandleCreator implements Parcelable.Creator<PendingImportCredentialsHandle> {
    @Override // android.os.Parcelable.Creator
    public final PendingImportCredentialsHandle createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new PendingImportCredentialsHandle(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final PendingImportCredentialsHandle[] newArray(int i) {
        return new PendingImportCredentialsHandle[i];
    }
}
