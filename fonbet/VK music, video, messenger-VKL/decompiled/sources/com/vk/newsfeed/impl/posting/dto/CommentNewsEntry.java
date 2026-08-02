package com.vk.newsfeed.impl.posting.dto;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: CommentNewsEntry.kt */
/* loaded from: classes4.dex */
public abstract class CommentNewsEntry extends NewsEntry {
    public final UserId i;
    public final String j;
    public final List<Attachment> k;
    public final String l = "wall";

    /* JADX WARN: Multi-variable type inference failed */
    public CommentNewsEntry(UserId userId, String str, List<? extends Attachment> list) {
        this.i = userId;
        this.j = str;
        this.k = list;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.l;
    }
}
