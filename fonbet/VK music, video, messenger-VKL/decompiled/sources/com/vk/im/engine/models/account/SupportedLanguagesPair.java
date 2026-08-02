package com.vk.im.engine.models.account;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SupportedLanguagesPair.kt */
/* loaded from: classes2.dex */
public final class SupportedLanguagesPair extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SupportedLanguagesPair> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SupportedLanguagesPair> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SupportedLanguagesPair a(Serializer serializer) {
            return new SupportedLanguagesPair(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SupportedLanguagesPair[i];
        }
    }

    public SupportedLanguagesPair(String str, String str2) {
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
        if (!(obj instanceof SupportedLanguagesPair)) {
            return false;
        }
        SupportedLanguagesPair supportedLanguagesPair = (SupportedLanguagesPair) obj;
        return epx.f(this.b, supportedLanguagesPair.b) && epx.f(this.c, supportedLanguagesPair.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupportedLanguagesPair(originalLanguage=");
        sb.append(this.b);
        sb.append(", translationLanguage=");
        return ho8.a(sb, this.c, ')');
    }

    public SupportedLanguagesPair(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H());
    }
}
