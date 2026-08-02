package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.tu90;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class PendingGetCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PendingGetCredentialHandle> CREATOR = new tu90();
    public final PendingIntent b;

    public PendingGetCredentialHandle(@NonNull PendingIntent pendingIntent) {
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.x(w, parcel);
    }
}
