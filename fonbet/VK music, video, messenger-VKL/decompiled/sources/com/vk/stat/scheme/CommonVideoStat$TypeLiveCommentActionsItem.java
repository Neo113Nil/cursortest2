package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeLiveCommentActionsItem {

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("copy_pinned_comment")
        public static final Type COPY_PINNED_COMMENT;

        @pmi0("pin_comment")
        public static final Type PIN_COMMENT;

        @pmi0("unpin_comment")
        public static final Type UNPIN_COMMENT;

        static {
            Type type = new Type("PIN_COMMENT", 0);
            PIN_COMMENT = type;
            Type type2 = new Type("UNPIN_COMMENT", 1);
            UNPIN_COMMENT = type2;
            Type type3 = new Type("COPY_PINNED_COMMENT", 2);
            COPY_PINNED_COMMENT = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeLiveCommentActionsItem(Type type, int i) {
        this.type = type;
        this.commentId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeLiveCommentActionsItem)) {
            return false;
        }
        CommonVideoStat$TypeLiveCommentActionsItem commonVideoStat$TypeLiveCommentActionsItem = (CommonVideoStat$TypeLiveCommentActionsItem) obj;
        return this.type == commonVideoStat$TypeLiveCommentActionsItem.type && this.commentId == commonVideoStat$TypeLiveCommentActionsItem.commentId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.commentId) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeLiveCommentActionsItem(type=");
        sb.append(this.type);
        sb.append(", commentId=");
        return vu5.b(sb, this.commentId, ')');
    }
}
