package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;

/* compiled from: StorySubscribersHeader.kt */
/* loaded from: classes18.dex */
public final class StorySubscribersHeader extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StorySubscribersHeader> CREATOR = new a();
    public final String b;
    public final List<Owner> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StorySubscribersHeader> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StorySubscribersHeader a(Serializer serializer) {
            String H = serializer.H();
            List j = serializer.j(Owner.CREATOR);
            if (j == null) {
                j = EmptyList.b;
            }
            return new StorySubscribersHeader(H, j);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StorySubscribersHeader[i];
        }
    }

    public StorySubscribersHeader(String str, List<Owner> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.o0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorySubscribersHeader)) {
            return false;
        }
        StorySubscribersHeader storySubscribersHeader = (StorySubscribersHeader) obj;
        return epx.f(this.b, storySubscribersHeader.b) && epx.f(this.c, storySubscribersHeader.c);
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorySubscribersHeader(title=");
        sb.append(this.b);
        sb.append(", subscribes=");
        return ms9.a(')', sb, this.c);
    }
}
