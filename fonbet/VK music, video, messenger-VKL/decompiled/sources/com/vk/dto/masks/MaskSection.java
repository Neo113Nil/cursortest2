package com.vk.dto.masks;

import com.vk.core.serialize.Serializer;
import defpackage.q0;

/* compiled from: MaskSection.kt */
/* loaded from: classes18.dex */
public final class MaskSection extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MaskSection> CREATOR;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public int f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MaskSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MaskSection a(Serializer serializer) {
            return new MaskSection(serializer.u(), serializer.H(), serializer.H(), serializer.p() > 0, serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskSection[i];
        }
    }

    static {
        new MaskSection(-1, null, null, false, 0);
        new MaskSection(-3, null, null, false, 0);
        CREATOR = new a();
    }

    public MaskSection(int i, String str, String str2, boolean z, int i2) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.S(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MaskSection.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MaskSection maskSection = (MaskSection) obj;
        return this.b == maskSection.b && this.f == maskSection.f;
    }

    public final int hashCode() {
        return (this.b * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskSection{id=");
        sb.append(this.b);
        sb.append(", icon='");
        sb.append(this.c);
        sb.append("', hasNew=");
        return q0.a(sb, this.e, '}');
    }
}
