package com.vk.newsfeed.common.posting.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AttachmentsNewsEntry.kt */
/* loaded from: classes4.dex */
public final class AttachmentsNewsEntry extends NewsEntry {
    public static final Serializer.c<AttachmentsNewsEntry> CREATOR = new a();
    public final List<Attachment> i;
    public final String j = "wall";

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachmentsNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachmentsNewsEntry a(Serializer serializer) {
            List k = serializer.k(Attachment.class);
            if (k == null) {
                k = EmptyList.b;
            }
            return new AttachmentsNewsEntry(k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachmentsNewsEntry[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentsNewsEntry(List<? extends Attachment> list) {
        this.i = list;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.i);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return -1;
    }
}
