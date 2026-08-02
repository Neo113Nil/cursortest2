package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.ilg;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public final int a;
    public final ProtocolVersion b;
    public final byte[] c;
    public final String d;

    public RegisterRequest(String str, String str2, int i, byte[] bArr) {
        this.a = i;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = bArr;
            this.d = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            ilg.k(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.c, registerRequest.c) || this.b != registerRequest.b) {
            return false;
        }
        String str = registerRequest.d;
        String str2 = this.d;
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
        int hashCode = this.b.hashCode() + ((Arrays.hashCode(this.c) + 31) * 31);
        String str = this.d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b.a, false);
        SafeParcelWriter.c(parcel, 3, this.c, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
