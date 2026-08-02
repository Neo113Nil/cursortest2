package com.vk.clips.sdk.shared.api.routing.models;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.vu5;

/* compiled from: ClipFeedCacheInfo.kt */
/* loaded from: classes17.dex */
public final class ClipFeedCacheInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClipFeedCacheInfo> CREATOR = new a();
    public final List<String> b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipFeedCacheInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipFeedCacheInfo a(Serializer serializer) {
            return new ClipFeedCacheInfo(com.vk.core.serialize.a.a(serializer), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipFeedCacheInfo[i];
        }
    }

    public ClipFeedCacheInfo(List<String> list, int i) {
        this.b = list;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipFeedCacheInfo)) {
            return false;
        }
        ClipFeedCacheInfo clipFeedCacheInfo = (ClipFeedCacheInfo) obj;
        return epx.f(this.b, clipFeedCacheInfo.b) && this.c == clipFeedCacheInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipFeedCacheInfo(cacheFeedItemIds=");
        sb.append(this.b);
        sb.append(", cacheSessionId=");
        return vu5.b(sb, this.c, ')');
    }
}
