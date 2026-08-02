package com.vk.dto.articles;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.shy;

/* compiled from: AMP.kt */
/* loaded from: classes18.dex */
public final class AMP extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AMP> CREATOR = new a();
    public final String b;
    public final int c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AMP> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AMP a(Serializer serializer) {
            return new AMP(serializer.H(), serializer.u(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AMP[i];
        }
    }

    public AMP(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMP)) {
            return false;
        }
        AMP amp = (AMP) obj;
        return epx.f(this.b, amp.b) && this.c == amp.c && this.d == amp.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AMP(url=");
        sb.append(this.b);
        sb.append(", viewCount=");
        sb.append(this.c);
        sb.append(", isFavorite=");
        return q0.a(sb, this.d, ')');
    }
}
