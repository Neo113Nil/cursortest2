package com.vk.newsfeed.api.posting.author;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: PostingAuthorContext.kt */
/* loaded from: classes3.dex */
public final class a {
    public final UserId a;
    public final PostingAuthor.User b;
    public final List<PostingAuthor.Community> c;

    public a(UserId userId, PostingAuthor.User user, List<PostingAuthor.Community> list) {
        this.a = userId;
        this.b = user;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingAuthorContext(latestAuthorId=");
        sb.append(this.a);
        sb.append(", accountUserId=");
        sb.append(this.b);
        sb.append(", administratedCommunities=");
        return ms9.a(')', sb, this.c);
    }
}
