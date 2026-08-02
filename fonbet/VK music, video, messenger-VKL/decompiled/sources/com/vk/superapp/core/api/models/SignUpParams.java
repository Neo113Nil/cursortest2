package com.vk.superapp.core.api.models;

import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: SignUpParams.kt */
/* loaded from: classes6.dex */
public final class SignUpParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SignUpParams> CREATOR = new a();
    public final int b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SignUpParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SignUpParams a(Serializer serializer) {
            return new SignUpParams(serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpParams[i];
        }
    }

    public SignUpParams(int i) {
        this.b = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignUpParams) && this.b == ((SignUpParams) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SignUpParams(passwordMinLength="), this.b, ')');
    }
}
