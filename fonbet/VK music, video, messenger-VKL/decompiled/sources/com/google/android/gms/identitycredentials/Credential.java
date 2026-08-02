package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.bdk;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class Credential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new bdk();
    public final String b;
    public final Bundle c;

    public Credential(@NonNull String str, @NonNull Bundle bundle) {
        this.b = str;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.d(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
