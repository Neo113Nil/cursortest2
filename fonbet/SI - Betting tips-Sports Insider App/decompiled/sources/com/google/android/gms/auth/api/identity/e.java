package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import f3.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int F0 = x.F0(parcel);
        boolean z5 = false;
        while (parcel.dataPosition() < F0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                x.B0(parcel, readInt);
            } else {
                z5 = x.r0(parcel, readInt);
            }
        }
        x.b0(parcel, F0);
        return new BeginSignInRequest.PasswordRequestOptions(z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new BeginSignInRequest.PasswordRequestOptions[i5];
    }
}
