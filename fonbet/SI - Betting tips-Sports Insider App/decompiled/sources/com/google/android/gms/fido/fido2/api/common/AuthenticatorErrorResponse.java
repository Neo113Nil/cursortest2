package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v0;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.c;
import y6.f;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new l(22);

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f4671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4673c;

    public AuthenticatorErrorResponse(int i5, String str, int i10) {
        try {
            this.f4671a = ErrorCode.a(i5);
            this.f4672b = str;
            this.f4673c = i10;
        } catch (f e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return v.k(this.f4671a, authenticatorErrorResponse.f4671a) && v.k(this.f4672b, authenticatorErrorResponse.f4672b) && v.k(Integer.valueOf(this.f4673c), Integer.valueOf(authenticatorErrorResponse.f4673c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4671a, this.f4672b, Integer.valueOf(this.f4673c)});
    }

    public final String toString() {
        v0 c2 = k7.a.c(this);
        String valueOf = String.valueOf(this.f4671a.f4697a);
        c cVar = new c(26, false);
        ((v0) c2.f366d).f366d = cVar;
        c2.f366d = cVar;
        cVar.f365c = valueOf;
        cVar.f364b = "errorCode";
        String str = this.f4672b;
        if (str != null) {
            c2.a0(str, "errorMessage");
        }
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        int i10 = this.f4671a.f4697a;
        b.U(parcel, 2, 4);
        parcel.writeInt(i10);
        b.O(parcel, 3, this.f4672b, false);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4673c);
        b.W(parcel, V);
    }
}
