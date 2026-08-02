package com.vk.newsfeed.impl.posting.dto;

import com.vk.comments.core.BoardComment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommentNewsEntry.kt */
/* loaded from: classes4.dex */
public final class MarketCommentNewsEntry extends CommentNewsEntry {
    public static final Serializer.c<MarketCommentNewsEntry> CREATOR = new a();
    public final BoardComment m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarketCommentNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketCommentNewsEntry a(Serializer serializer) {
            return new MarketCommentNewsEntry((UserId) serializer.A(UserId.class.getClassLoader()), (BoardComment) serializer.G(BoardComment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketCommentNewsEntry[i];
        }
    }

    public MarketCommentNewsEntry(UserId userId, BoardComment boardComment) {
        super(userId, (boardComment == null || (r0 = boardComment.c) == null) ? "" : r0, (boardComment == null || (r1 = boardComment.f) == null) ? EmptyList.b : r1);
        List list;
        String str;
        this.m = boardComment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.i);
        serializer.i0(this.m);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 17;
    }
}
