package com.vk.newsfeed.impl.posting.dto;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommentNewsEntry.kt */
/* loaded from: classes4.dex */
public final class PostCommentNewsEntry extends CommentNewsEntry {
    public static final Serializer.c<PostCommentNewsEntry> CREATOR = new a();
    public final int m;
    public final UserId n;
    public final String o;
    public final String p;
    public final NewsComment q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostCommentNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostCommentNewsEntry a(Serializer serializer) {
            int u = serializer.u();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new PostCommentNewsEntry(u, userId, H, serializer.H(), (NewsComment) serializer.G(NewsComment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostCommentNewsEntry[i];
        }
    }

    public PostCommentNewsEntry(int i, UserId userId, String str, String str2, NewsComment newsComment) {
        super((newsComment == null || (r0 = newsComment.j) == null) ? UserId.d : r0, (newsComment == null || (r1 = newsComment.b) == null) ? "" : r1, (newsComment == null || (r2 = newsComment.J) == null) ? EmptyList.b : r2);
        List list;
        String str3;
        UserId userId2;
        this.m = i;
        this.n = userId;
        this.o = str;
        this.p = str2;
        this.q = newsComment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.m);
        serializer.e0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.i0(this.q);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 5;
    }
}
