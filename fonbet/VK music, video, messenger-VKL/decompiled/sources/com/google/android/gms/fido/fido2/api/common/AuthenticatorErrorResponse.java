package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import java.util.Arrays;
import xsna.dq70;
import xsna.ok01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new ok01();

    @NonNull
    public final ErrorCode b;

    @Nullable
    public final String c;
    public final int d;

    public AuthenticatorErrorResponse(int i, @Nullable String str, int i2) {
        try {
            this.b = ErrorCode.j(i);
            this.c = str;
            this.d = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return dq70.b(this.b, authenticatorErrorResponse.b) && dq70.b(this.c, authenticatorErrorResponse.c) && dq70.b(Integer.valueOf(this.d), Integer.valueOf(authenticatorErrorResponse.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d)});
    }

    @NonNull
    public final String toString() {
        zzbi zza = zzbj.zza(this);
        zza.zza("errorCode", this.b.i());
        String str = this.c;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b.i();
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
