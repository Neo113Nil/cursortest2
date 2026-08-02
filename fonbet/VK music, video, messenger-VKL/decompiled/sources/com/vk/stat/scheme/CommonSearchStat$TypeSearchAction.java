package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchAction {

    @pmi0("search_action_type")
    private final SearchActionType searchActionType;

    @pmi0("type_search_music_action")
    private final CommonSearchStat$TypeSearchMusicAction typeSearchMusicAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonSearchStat.kt */
    public static final class SearchActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchActionType[] $VALUES;

        @pmi0("type_search_music_action")
        public static final SearchActionType TYPE_SEARCH_MUSIC_ACTION;

        static {
            SearchActionType searchActionType = new SearchActionType("TYPE_SEARCH_MUSIC_ACTION", 0);
            TYPE_SEARCH_MUSIC_ACTION = searchActionType;
            SearchActionType[] searchActionTypeArr = {searchActionType};
            $VALUES = searchActionTypeArr;
            $ENTRIES = new asp(searchActionTypeArr);
        }

        private SearchActionType(String str, int i) {
        }

        public static SearchActionType valueOf(String str) {
            return (SearchActionType) Enum.valueOf(SearchActionType.class, str);
        }

        public static SearchActionType[] values() {
            return (SearchActionType[]) $VALUES.clone();
        }
    }

    public CommonSearchStat$TypeSearchAction(SearchActionType searchActionType, CommonSearchStat$TypeSearchMusicAction commonSearchStat$TypeSearchMusicAction) {
        this.searchActionType = searchActionType;
        this.typeSearchMusicAction = commonSearchStat$TypeSearchMusicAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeSearchAction)) {
            return false;
        }
        CommonSearchStat$TypeSearchAction commonSearchStat$TypeSearchAction = (CommonSearchStat$TypeSearchAction) obj;
        return this.searchActionType == commonSearchStat$TypeSearchAction.searchActionType && epx.f(this.typeSearchMusicAction, commonSearchStat$TypeSearchAction.typeSearchMusicAction);
    }

    public final int hashCode() {
        int hashCode = this.searchActionType.hashCode() * 31;
        CommonSearchStat$TypeSearchMusicAction commonSearchStat$TypeSearchMusicAction = this.typeSearchMusicAction;
        return hashCode + (commonSearchStat$TypeSearchMusicAction == null ? 0 : commonSearchStat$TypeSearchMusicAction.hashCode());
    }

    public final String toString() {
        return "TypeSearchAction(searchActionType=" + this.searchActionType + ", typeSearchMusicAction=" + this.typeSearchMusicAction + ')';
    }

    public /* synthetic */ CommonSearchStat$TypeSearchAction(SearchActionType searchActionType, CommonSearchStat$TypeSearchMusicAction commonSearchStat$TypeSearchMusicAction, int i, zcl zclVar) {
        this(searchActionType, (i & 2) != 0 ? null : commonSearchStat$TypeSearchMusicAction);
    }
}
