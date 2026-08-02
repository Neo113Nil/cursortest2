package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.art;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class GetCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCredentialResponse> CREATOR = new art();
    public final Credential b;

    public GetCredentialResponse(@NonNull Credential credential) {
        this.b = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.x(w, parcel);
    }
}
