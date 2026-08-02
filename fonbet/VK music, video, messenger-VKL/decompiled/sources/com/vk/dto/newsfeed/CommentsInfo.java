package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;

/* compiled from: CommentsInfo.kt */
/* loaded from: classes18.dex */
public final class CommentsInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommentsInfo> CREATOR = new a();
    public PostDonut b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentsInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentsInfo a(Serializer serializer) {
            return new CommentsInfo((PostDonut) serializer.G(PostDonut.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentsInfo[i];
        }
    }

    public CommentsInfo(PostDonut postDonut) {
        this.b = postDonut;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }
}
