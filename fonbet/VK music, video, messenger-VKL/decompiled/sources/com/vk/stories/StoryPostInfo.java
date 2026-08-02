package com.vk.stories;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import xsna.epx;

/* compiled from: StoryPostInfo.kt */
/* loaded from: classes6.dex */
public final class StoryPostInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryPostInfo> CREATOR = new a();
    public final Post b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryPostInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryPostInfo a(Serializer serializer) {
            return new StoryPostInfo((Post) serializer.G(Post.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryPostInfo[i];
        }
    }

    public StoryPostInfo(Post post) {
        this.b = post;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryPostInfo) && epx.f(this.b, ((StoryPostInfo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StoryPostInfo(post=" + this.b + ')';
    }
}
