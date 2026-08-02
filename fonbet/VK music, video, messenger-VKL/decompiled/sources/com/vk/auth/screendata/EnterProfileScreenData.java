package com.vk.auth.screendata;

import com.vk.auth.entername.RequiredNameType;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.Locale;
import xsna.qoy;

/* compiled from: EnterProfileScreenData.kt */
/* loaded from: classes15.dex */
public final class EnterProfileScreenData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<EnterProfileScreenData> CREATOR = new a();
    public final RequiredNameType b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EnterProfileScreenData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EnterProfileScreenData a(Serializer serializer) {
            String H = serializer.H();
            Enum r1 = null;
            if (H != null) {
                try {
                    r1 = Enum.valueOf(RequiredNameType.class, H.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
            }
            return new EnterProfileScreenData((RequiredNameType) r1, serializer.m(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EnterProfileScreenData[i];
        }
    }

    public EnterProfileScreenData(RequiredNameType requiredNameType, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = requiredNameType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterProfileScreenData)) {
            return false;
        }
        EnterProfileScreenData enterProfileScreenData = (EnterProfileScreenData) obj;
        return this.b == enterProfileScreenData.b && this.c == enterProfileScreenData.c && this.d == enterProfileScreenData.d && this.e == enterProfileScreenData.e && this.f == enterProfileScreenData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnterProfileScreenData(requiredNameType=");
        sb.append(this.b);
        sb.append(", needGender=");
        sb.append(this.c);
        sb.append(", needBirthday=");
        sb.append(this.d);
        sb.append(", isAdditionalSignUp=");
        sb.append(this.e);
        sb.append(", areFieldsEditable=");
        return q0.a(sb, this.f, ')');
    }

    public final boolean zb() {
        return this.e;
    }
}
