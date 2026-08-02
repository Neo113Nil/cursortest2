package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.dq70;
import xsna.mkz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new mkz0();
    public final int b;

    @Nullable
    public final String c;

    public ClientIdentity(int i, @Nullable String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.b == this.b && dq70.b(clientIdentity.c, this.c);
    }

    public final int hashCode() {
        return this.b;
    }

    @NonNull
    public final String toString() {
        int i = this.b;
        int length = String.valueOf(i).length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb.append(i);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
