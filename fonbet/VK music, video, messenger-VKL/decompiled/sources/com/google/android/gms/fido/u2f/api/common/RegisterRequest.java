package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import xsna.ozg0;
import xsna.ub01;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new ub01();
    public final int b;
    public final ProtocolVersion c;
    public final byte[] d;
    public final String e;

    public RegisterRequest(String str, String str2, int i, byte[] bArr) {
        this.b = i;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = bArr;
            this.e = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        byte[] bArr = registerRequest.d;
        String str = registerRequest.e;
        if (!Arrays.equals(this.d, bArr) || this.c != registerRequest.c) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() + ((Arrays.hashCode(this.d) + 31) * 31);
        String str = this.e;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c.toString(), false);
        ozg0.e(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
