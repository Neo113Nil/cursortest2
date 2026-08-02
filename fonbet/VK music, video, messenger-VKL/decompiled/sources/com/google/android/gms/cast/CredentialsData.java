package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.xxz0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class CredentialsData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CredentialsData> CREATOR = new xxz0();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public CredentialsData(@Nullable String str, @Nullable String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return dq70.b(this.b, credentialsData.b) && dq70.b(this.c, credentialsData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
