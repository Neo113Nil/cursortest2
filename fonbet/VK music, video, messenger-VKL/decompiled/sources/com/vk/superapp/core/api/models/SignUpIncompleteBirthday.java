package com.vk.superapp.core.api.models;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SignUpIncompleteBirthday.kt */
/* loaded from: classes6.dex */
public final class SignUpIncompleteBirthday extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SignUpIncompleteBirthday> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SignUpIncompleteBirthday> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SignUpIncompleteBirthday a(Serializer serializer) {
            return new SignUpIncompleteBirthday(serializer.v(), serializer.v(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpIncompleteBirthday[i];
        }
    }

    public SignUpIncompleteBirthday() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
        serializer.V(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpIncompleteBirthday)) {
            return false;
        }
        SignUpIncompleteBirthday signUpIncompleteBirthday = (SignUpIncompleteBirthday) obj;
        return epx.f(this.b, signUpIncompleteBirthday.b) && epx.f(this.c, signUpIncompleteBirthday.c) && epx.f(this.d, signUpIncompleteBirthday.d);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignUpIncompleteBirthday(day=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", year=");
        return uqi.b(sb, this.d, ')');
    }

    public /* synthetic */ SignUpIncompleteBirthday(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }

    public SignUpIncompleteBirthday(Integer num, Integer num2, Integer num3) {
        this.b = num;
        this.c = num2;
        this.d = num3;
    }
}
