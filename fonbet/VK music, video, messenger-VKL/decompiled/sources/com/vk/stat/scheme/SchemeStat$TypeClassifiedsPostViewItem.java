package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsPostViewItem {

    @pmi0("content_id")
    private final int contentId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("post_extension")
    private final PostExtension postExtension;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PostExtension {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostExtension[] $VALUES;

        @pmi0("youla_create_product")
        public static final PostExtension YOULA_CREATE_PRODUCT;

        static {
            PostExtension postExtension = new PostExtension("YOULA_CREATE_PRODUCT", 0);
            YOULA_CREATE_PRODUCT = postExtension;
            PostExtension[] postExtensionArr = {postExtension};
            $VALUES = postExtensionArr;
            $ENTRIES = new asp(postExtensionArr);
        }

        private PostExtension(String str, int i) {
        }

        public static PostExtension valueOf(String str) {
            return (PostExtension) Enum.valueOf(PostExtension.class, str);
        }

        public static PostExtension[] values() {
            return (PostExtension[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsPostViewItem(long j, PostExtension postExtension, int i) {
        this.ownerId = j;
        this.postExtension = postExtension;
        this.contentId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsPostViewItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsPostViewItem schemeStat$TypeClassifiedsPostViewItem = (SchemeStat$TypeClassifiedsPostViewItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsPostViewItem.ownerId && this.postExtension == schemeStat$TypeClassifiedsPostViewItem.postExtension && this.contentId == schemeStat$TypeClassifiedsPostViewItem.contentId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.contentId) + ((this.postExtension.hashCode() + (Long.hashCode(this.ownerId) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsPostViewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", postExtension=");
        sb.append(this.postExtension);
        sb.append(", contentId=");
        return vu5.b(sb, this.contentId, ')');
    }
}
