package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.u9k;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class CreateRestoreCredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateRestoreCredentialRequest> CREATOR = new u9k();
    public final Bundle b;

    public CreateRestoreCredentialRequest(@NonNull Bundle bundle) {
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.d(parcel, 1, this.b, false);
        ozg0.x(w, parcel);
    }
}
