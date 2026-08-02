package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonBookmarksStat.kt */
/* loaded from: classes5.dex */
public final class CommonBookmarksStat$TypeBookmarksAction implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_bookmarks_open_bookmarks_action")
    private final CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem typeBookmarksOpenBookmarksAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonBookmarksStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_bookmarks_open_bookmarks_action")
        public static final Type TYPE_BOOKMARKS_OPEN_BOOKMARKS_ACTION;

        static {
            Type type = new Type("TYPE_BOOKMARKS_OPEN_BOOKMARKS_ACTION", 0);
            TYPE_BOOKMARKS_OPEN_BOOKMARKS_ACTION = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ CommonBookmarksStat$TypeBookmarksAction(Type type, CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem, zcl zclVar) {
        this(type, commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonBookmarksStat$TypeBookmarksAction)) {
            return false;
        }
        CommonBookmarksStat$TypeBookmarksAction commonBookmarksStat$TypeBookmarksAction = (CommonBookmarksStat$TypeBookmarksAction) obj;
        return this.type == commonBookmarksStat$TypeBookmarksAction.type && epx.f(this.typeBookmarksOpenBookmarksAction, commonBookmarksStat$TypeBookmarksAction.typeBookmarksOpenBookmarksAction);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem = this.typeBookmarksOpenBookmarksAction;
        return hashCode + (commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem != null ? commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeBookmarksAction(type=" + this.type + ", typeBookmarksOpenBookmarksAction=" + this.typeBookmarksOpenBookmarksAction + ')';
    }

    private CommonBookmarksStat$TypeBookmarksAction(Type type, CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem) {
        this.type = type;
        this.typeBookmarksOpenBookmarksAction = commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem;
    }

    public /* synthetic */ CommonBookmarksStat$TypeBookmarksAction(Type type, CommonBookmarksStat$TypeBookmarksOpenBookmarksActionItem commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : commonBookmarksStat$TypeBookmarksOpenBookmarksActionItem);
    }
}
