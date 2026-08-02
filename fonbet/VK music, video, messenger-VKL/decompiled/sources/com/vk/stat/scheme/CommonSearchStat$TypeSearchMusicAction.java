package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchMusicAction {

    @pmi0("action_object")
    private final CommonSearchStat$TypeSearchMusicActionObject actionObject;

    @pmi0("action_type")
    private final ActionType actionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonSearchStat.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @pmi0("album_add_me")
        public static final ActionType ALBUM_ADD_ME;

        @pmi0("album_copy_link")
        public static final ActionType ALBUM_COPY_LINK;

        @pmi0("album_download")
        public static final ActionType ALBUM_DOWNLOAD;

        @pmi0("album_listen_next")
        public static final ActionType ALBUM_LISTEN_NEXT;

        @pmi0("album_share")
        public static final ActionType ALBUM_SHARE;

        @pmi0("clip_open")
        public static final ActionType CLIP_OPEN;

        @pmi0("curator_subscribe")
        public static final ActionType CURATOR_SUBSCRIBE;

        @pmi0("musician_share")
        public static final ActionType MUSICIAN_SHARE;

        @pmi0("musician_subscribe")
        public static final ActionType MUSICIAN_SUBSCRIBE;

        @pmi0("playlist_add_me")
        public static final ActionType PLAYLIST_ADD_ME;

        @pmi0("playlist_copy_link")
        public static final ActionType PLAYLIST_COPY_LINK;

        @pmi0("playlist_download")
        public static final ActionType PLAYLIST_DOWNLOAD;

        @pmi0("playlist_listen_next")
        public static final ActionType PLAYLIST_LISTEN_NEXT;

        @pmi0("playlist_share")
        public static final ActionType PLAYLIST_SHARE;

        @pmi0("track_add_me")
        public static final ActionType TRACK_ADD_ME;

        @pmi0("track_download")
        public static final ActionType TRACK_DOWNLOAD;

        @pmi0("track_listen_next")
        public static final ActionType TRACK_LISTEN_NEXT;

        @pmi0("track_share")
        public static final ActionType TRACK_SHARE;

        static {
            ActionType actionType = new ActionType("TRACK_ADD_ME", 0);
            TRACK_ADD_ME = actionType;
            ActionType actionType2 = new ActionType("TRACK_DOWNLOAD", 1);
            TRACK_DOWNLOAD = actionType2;
            ActionType actionType3 = new ActionType("TRACK_LISTEN_NEXT", 2);
            TRACK_LISTEN_NEXT = actionType3;
            ActionType actionType4 = new ActionType("TRACK_SHARE", 3);
            TRACK_SHARE = actionType4;
            ActionType actionType5 = new ActionType("ALBUM_ADD_ME", 4);
            ALBUM_ADD_ME = actionType5;
            ActionType actionType6 = new ActionType("ALBUM_DOWNLOAD", 5);
            ALBUM_DOWNLOAD = actionType6;
            ActionType actionType7 = new ActionType("ALBUM_LISTEN_NEXT", 6);
            ALBUM_LISTEN_NEXT = actionType7;
            ActionType actionType8 = new ActionType("ALBUM_SHARE", 7);
            ALBUM_SHARE = actionType8;
            ActionType actionType9 = new ActionType("ALBUM_COPY_LINK", 8);
            ALBUM_COPY_LINK = actionType9;
            ActionType actionType10 = new ActionType("PLAYLIST_ADD_ME", 9);
            PLAYLIST_ADD_ME = actionType10;
            ActionType actionType11 = new ActionType("PLAYLIST_DOWNLOAD", 10);
            PLAYLIST_DOWNLOAD = actionType11;
            ActionType actionType12 = new ActionType("PLAYLIST_LISTEN_NEXT", 11);
            PLAYLIST_LISTEN_NEXT = actionType12;
            ActionType actionType13 = new ActionType("PLAYLIST_SHARE", 12);
            PLAYLIST_SHARE = actionType13;
            ActionType actionType14 = new ActionType("PLAYLIST_COPY_LINK", 13);
            PLAYLIST_COPY_LINK = actionType14;
            ActionType actionType15 = new ActionType("MUSICIAN_SUBSCRIBE", 14);
            MUSICIAN_SUBSCRIBE = actionType15;
            ActionType actionType16 = new ActionType("MUSICIAN_SHARE", 15);
            MUSICIAN_SHARE = actionType16;
            ActionType actionType17 = new ActionType("CURATOR_SUBSCRIBE", 16);
            CURATOR_SUBSCRIBE = actionType17;
            ActionType actionType18 = new ActionType("CLIP_OPEN", 17);
            CLIP_OPEN = actionType18;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13, actionType14, actionType15, actionType16, actionType17, actionType18};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        private ActionType(String str, int i) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public CommonSearchStat$TypeSearchMusicAction(ActionType actionType, CommonSearchStat$TypeSearchMusicActionObject commonSearchStat$TypeSearchMusicActionObject) {
        this.actionType = actionType;
        this.actionObject = commonSearchStat$TypeSearchMusicActionObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeSearchMusicAction)) {
            return false;
        }
        CommonSearchStat$TypeSearchMusicAction commonSearchStat$TypeSearchMusicAction = (CommonSearchStat$TypeSearchMusicAction) obj;
        return this.actionType == commonSearchStat$TypeSearchMusicAction.actionType && epx.f(this.actionObject, commonSearchStat$TypeSearchMusicAction.actionObject);
    }

    public final int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        CommonSearchStat$TypeSearchMusicActionObject commonSearchStat$TypeSearchMusicActionObject = this.actionObject;
        return hashCode + (commonSearchStat$TypeSearchMusicActionObject == null ? 0 : commonSearchStat$TypeSearchMusicActionObject.hashCode());
    }

    public final String toString() {
        return "TypeSearchMusicAction(actionType=" + this.actionType + ", actionObject=" + this.actionObject + ')';
    }

    public /* synthetic */ CommonSearchStat$TypeSearchMusicAction(ActionType actionType, CommonSearchStat$TypeSearchMusicActionObject commonSearchStat$TypeSearchMusicActionObject, int i, zcl zclVar) {
        this(actionType, (i & 2) != 0 ? null : commonSearchStat$TypeSearchMusicActionObject);
    }
}
