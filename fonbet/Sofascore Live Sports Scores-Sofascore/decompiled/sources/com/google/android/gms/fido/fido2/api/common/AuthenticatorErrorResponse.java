package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ilg;
import defpackage.lmn;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzl();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            ilg.k(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return Objects.a(this.a, authenticatorErrorResponse.a) && Objects.a(this.b, authenticatorErrorResponse.b) && Objects.a(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        String valueOf = String.valueOf(this.a.a);
        lmn lmnVar = new lmn(24, false);
        a.c.d = lmnVar;
        a.c = lmnVar;
        lmnVar.b = valueOf;
        lmnVar.c = IronSourceConstants.EVENTS_ERROR_CODE;
        String str = this.b;
        if (str != null) {
            a.a(str, "errorMessage");
        }
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = this.a.a;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
