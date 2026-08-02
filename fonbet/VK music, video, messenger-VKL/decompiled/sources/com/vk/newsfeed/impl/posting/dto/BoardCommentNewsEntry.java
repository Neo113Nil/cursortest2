package com.vk.newsfeed.impl.posting.dto;

import com.vk.comments.core.BoardComment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommentNewsEntry.kt */
/* loaded from: classes4.dex */
public final class BoardCommentNewsEntry extends CommentNewsEntry {
    public static final Serializer.c<BoardCommentNewsEntry> CREATOR = new a();
    public final int m;
    public final BoardComment n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BoardCommentNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BoardCommentNewsEntry a(Serializer serializer) {
            return new BoardCommentNewsEntry(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), (BoardComment) serializer.G(BoardComment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BoardCommentNewsEntry[i];
        }
    }

    public BoardCommentNewsEntry(int i, UserId userId, BoardComment boardComment) {
        super(userId, (boardComment == null || (r0 = boardComment.c) == null) ? "" : r0, (boardComment == null || (r1 = boardComment.f) == null) ? EmptyList.b : r1);
        List list;
        String str;
        this.m = i;
        this.n = boardComment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.m);
        serializer.e0(this.i);
        serializer.i0(this.n);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 14;
    }
}
