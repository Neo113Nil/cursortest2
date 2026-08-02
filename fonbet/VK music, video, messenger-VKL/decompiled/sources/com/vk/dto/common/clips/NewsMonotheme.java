package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: NewsMonotheme.kt */
/* loaded from: classes18.dex */
public final class NewsMonotheme extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NewsMonotheme> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewsMonotheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsMonotheme a(Serializer serializer) {
            return new NewsMonotheme(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsMonotheme[i];
        }
    }

    public NewsMonotheme(String str, String str2) {
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
        if (!(obj instanceof NewsMonotheme)) {
            return false;
        }
        NewsMonotheme newsMonotheme = (NewsMonotheme) obj;
        return epx.f(this.b, newsMonotheme.b) && epx.f(this.c, newsMonotheme.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsMonotheme(objectId=");
        sb.append(this.b);
        sb.append(", header=");
        return ho8.a(sb, this.c, ')');
    }
}
