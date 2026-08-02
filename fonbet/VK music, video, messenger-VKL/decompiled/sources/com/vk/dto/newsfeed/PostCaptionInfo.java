package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import xsna.epx;

/* compiled from: PostCaptionInfo.kt */
/* loaded from: classes18.dex */
public final class PostCaptionInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PostCaptionInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final LinkButton e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostCaptionInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostCaptionInfo a(Serializer serializer) {
            return new PostCaptionInfo(serializer.H(), serializer.H(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostCaptionInfo[i];
        }
    }

    public PostCaptionInfo(String str, String str2, String str3, LinkButton linkButton) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = linkButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostCaptionInfo)) {
            return false;
        }
        PostCaptionInfo postCaptionInfo = (PostCaptionInfo) obj;
        return epx.f(this.b, postCaptionInfo.b) && epx.f(this.c, postCaptionInfo.c) && epx.f(this.d, postCaptionInfo.d) && epx.f(this.e, postCaptionInfo.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkButton linkButton = this.e;
        return hashCode3 + (linkButton != null ? linkButton.hashCode() : 0);
    }

    public final String toString() {
        return "PostCaptionInfo(type=" + this.b + ", title=" + this.c + ", text=" + this.d + ", button=" + this.e + ')';
    }
}
