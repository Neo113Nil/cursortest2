package com.vk.superapp.api.dto.auth.validatephonecheck;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AuthValidatePhoneCheckResponse.kt */
/* loaded from: classes6.dex */
public final class AuthValidatePhoneCheckResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AuthValidatePhoneCheckResponse> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AuthValidatePhoneCheckResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AuthValidatePhoneCheckResponse a(Serializer serializer) {
            return new AuthValidatePhoneCheckResponse(serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthValidatePhoneCheckResponse[i];
        }
    }

    public AuthValidatePhoneCheckResponse(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidatePhoneCheckResponse)) {
            return false;
        }
        AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse = (AuthValidatePhoneCheckResponse) obj;
        return this.b == authValidatePhoneCheckResponse.b && epx.f(this.c, authValidatePhoneCheckResponse.c) && epx.f(this.d, authValidatePhoneCheckResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidatePhoneCheckResponse(status=");
        sb.append(this.b);
        sb.append(", phoneMask=");
        sb.append(this.c);
        sb.append(", sid=");
        return ho8.a(sb, this.d, ')');
    }

    public final int zb() {
        return this.b;
    }
}
