package com.vk.im.engine.models.attaches;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: AuthorAd.kt */
/* loaded from: classes2.dex */
public final class AuthorAd extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AuthorAd> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AuthorAd> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AuthorAd a(Serializer serializer) {
            return new AuthorAd(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthorAd[i];
        }
    }

    public AuthorAd(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorAd)) {
            return false;
        }
        AuthorAd authorAd = (AuthorAd) obj;
        return epx.f(this.b, authorAd.b) && epx.f(this.c, authorAd.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorAd(advertiserInfoUrl=");
        sb.append(this.b);
        sb.append(", adMarker=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthorAd(Serializer serializer, zcl zclVar) {
        this(r3, r2 != null ? r2 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
