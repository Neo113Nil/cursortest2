package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: WebStoryAttachment.kt */
/* loaded from: classes6.dex */
public final class WebStoryAttachment extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebStoryAttachment> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Integer f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebStoryAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebStoryAttachment a(Serializer serializer) {
            return new WebStoryAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebStoryAttachment[i];
        }
    }

    public WebStoryAttachment(String str, String str2, String str3, Long l, Integer num, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = num;
        this.g = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.b0(this.e);
        serializer.V(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebStoryAttachment)) {
            return false;
        }
        WebStoryAttachment webStoryAttachment = (WebStoryAttachment) obj;
        return epx.f(this.b, webStoryAttachment.b) && epx.f(this.c, webStoryAttachment.c) && epx.f(this.d, webStoryAttachment.d) && epx.f(this.e, webStoryAttachment.e) && epx.f(this.f, webStoryAttachment.f) && epx.f(this.g, webStoryAttachment.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebStoryAttachment(text=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", accessKey=");
        return ho8.a(sb, this.g, ')');
    }

    public WebStoryAttachment(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.x(), serializer.v(), serializer.H());
    }
}
