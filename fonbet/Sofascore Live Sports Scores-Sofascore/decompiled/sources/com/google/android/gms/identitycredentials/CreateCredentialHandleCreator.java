package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CreateCredentialHandleCreator implements Parcelable.Creator<CreateCredentialHandle> {
    @Override // android.os.Parcelable.Creator
    public final CreateCredentialHandle createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                createCredentialResponse = (CreateCredentialResponse) SafeParcelReader.h(parcel, readInt, CreateCredentialResponse.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final CreateCredentialHandle[] newArray(int i) {
        return new CreateCredentialHandle[i];
    }
}
