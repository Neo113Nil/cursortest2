package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: LegalNotice.kt */
/* loaded from: classes18.dex */
public final class LegalNotice extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LegalNotice> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LegalNotice> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LegalNotice a(Serializer serializer) {
            return new LegalNotice(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegalNotice[i];
        }
    }

    public LegalNotice(String str, String str2) {
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
        if (!(obj instanceof LegalNotice)) {
            return false;
        }
        LegalNotice legalNotice = (LegalNotice) obj;
        return epx.f(this.b, legalNotice.b) && epx.f(this.c, legalNotice.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalNotice(title=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
