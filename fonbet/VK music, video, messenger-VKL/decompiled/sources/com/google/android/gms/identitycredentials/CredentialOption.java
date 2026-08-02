package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.drm0;
import xsna.edk;
import xsna.i5s;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialOption> CREATOR = new edk();
    public final String b;
    public final Bundle c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final String g;

    public CredentialOption(@NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.b = str;
        this.c = bundle;
        this.d = bundle2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        boolean z = (drm0.N(str3) || drm0.N(str4)) ? false : true;
        boolean z2 = !drm0.N(str) && str3.length() == 0 && str4.length() == 0;
        if (!z && !z2) {
            throw new IllegalArgumentException(i5s.a(xe9.a("Either type: ", str, ", or requestType: ", str3, " and protocolType: "), str4, " must be specified, but at least one contains an invalid blank value."));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.d(parcel, 2, this.c, false);
        ozg0.d(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.x(w, parcel);
    }
}
