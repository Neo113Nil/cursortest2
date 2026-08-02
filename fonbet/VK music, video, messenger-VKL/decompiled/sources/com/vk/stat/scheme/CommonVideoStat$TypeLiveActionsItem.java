package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeLiveActionsItem implements SchemeStat$TypeAction.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_live_comment_actions")
    private final CommonVideoStat$TypeLiveCommentActionsItem typeLiveCommentActions;

    @pmi0("video_id")
    private final int videoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_live_comment_actions")
        public static final Type TYPE_LIVE_COMMENT_ACTIONS;

        static {
            Type type = new Type("TYPE_LIVE_COMMENT_ACTIONS", 0);
            TYPE_LIVE_COMMENT_ACTIONS = type;
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

    public /* synthetic */ CommonVideoStat$TypeLiveActionsItem(Type type, long j, int i, CommonVideoStat$TypeLiveCommentActionsItem commonVideoStat$TypeLiveCommentActionsItem, zcl zclVar) {
        this(type, j, i, commonVideoStat$TypeLiveCommentActionsItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeLiveActionsItem)) {
            return false;
        }
        CommonVideoStat$TypeLiveActionsItem commonVideoStat$TypeLiveActionsItem = (CommonVideoStat$TypeLiveActionsItem) obj;
        return this.type == commonVideoStat$TypeLiveActionsItem.type && this.ownerId == commonVideoStat$TypeLiveActionsItem.ownerId && this.videoId == commonVideoStat$TypeLiveActionsItem.videoId && epx.f(this.typeLiveCommentActions, commonVideoStat$TypeLiveActionsItem.typeLiveCommentActions);
    }

    public final int hashCode() {
        int a = shy.a(this.videoId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId), 31);
        CommonVideoStat$TypeLiveCommentActionsItem commonVideoStat$TypeLiveCommentActionsItem = this.typeLiveCommentActions;
        return a + (commonVideoStat$TypeLiveCommentActionsItem == null ? 0 : commonVideoStat$TypeLiveCommentActionsItem.hashCode());
    }

    public final String toString() {
        return "TypeLiveActionsItem(type=" + this.type + ", ownerId=" + this.ownerId + ", videoId=" + this.videoId + ", typeLiveCommentActions=" + this.typeLiveCommentActions + ')';
    }

    private CommonVideoStat$TypeLiveActionsItem(Type type, long j, int i, CommonVideoStat$TypeLiveCommentActionsItem commonVideoStat$TypeLiveCommentActionsItem) {
        this.type = type;
        this.ownerId = j;
        this.videoId = i;
        this.typeLiveCommentActions = commonVideoStat$TypeLiveCommentActionsItem;
    }

    public /* synthetic */ CommonVideoStat$TypeLiveActionsItem(Type type, long j, int i, CommonVideoStat$TypeLiveCommentActionsItem commonVideoStat$TypeLiveCommentActionsItem, int i2, zcl zclVar) {
        this(type, j, i, (i2 & 8) != 0 ? null : commonVideoStat$TypeLiveCommentActionsItem);
    }
}
