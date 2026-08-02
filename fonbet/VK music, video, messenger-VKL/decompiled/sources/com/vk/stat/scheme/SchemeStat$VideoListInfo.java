package com.vk.stat.scheme;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$VideoListInfo {

    @pmi0("current_video_state")
    private final CurrentVideoState currentVideoState;

    @pmi0("list_state")
    private final ListState listState;

    @pmi0("stall_count")
    private final int stallCount;

    @pmi0("total_stall_duration")
    private final int totalStallDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class CurrentVideoState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrentVideoState[] $VALUES;

        @pmi0("error")
        public static final CurrentVideoState ERROR;

        @pmi0("loading")
        public static final CurrentVideoState LOADING;

        @pmi0("none")
        public static final CurrentVideoState NONE;

        @pmi0("pause")
        public static final CurrentVideoState PAUSE;

        @pmi0("play")
        public static final CurrentVideoState PLAY;

        static {
            CurrentVideoState currentVideoState = new CurrentVideoState("PLAY", 0);
            PLAY = currentVideoState;
            CurrentVideoState currentVideoState2 = new CurrentVideoState("LOADING", 1);
            LOADING = currentVideoState2;
            CurrentVideoState currentVideoState3 = new CurrentVideoState("ERROR", 2);
            ERROR = currentVideoState3;
            CurrentVideoState currentVideoState4 = new CurrentVideoState("PAUSE", 3);
            PAUSE = currentVideoState4;
            CurrentVideoState currentVideoState5 = new CurrentVideoState("NONE", 4);
            NONE = currentVideoState5;
            CurrentVideoState[] currentVideoStateArr = {currentVideoState, currentVideoState2, currentVideoState3, currentVideoState4, currentVideoState5};
            $VALUES = currentVideoStateArr;
            $ENTRIES = new asp(currentVideoStateArr);
        }

        private CurrentVideoState(String str, int i) {
        }

        public static CurrentVideoState valueOf(String str) {
            return (CurrentVideoState) Enum.valueOf(CurrentVideoState.class, str);
        }

        public static CurrentVideoState[] values() {
            return (CurrentVideoState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ListState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ListState[] $VALUES;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        public static final ListState CONTENT;

        @pmi0("empty")
        public static final ListState EMPTY;

        @pmi0("error")
        public static final ListState ERROR;

        @pmi0("loading")
        public static final ListState LOADING;

        static {
            ListState listState = new ListState("LOADING", 0);
            LOADING = listState;
            ListState listState2 = new ListState("ERROR", 1);
            ERROR = listState2;
            ListState listState3 = new ListState("CONTENT", 2);
            CONTENT = listState3;
            ListState listState4 = new ListState("EMPTY", 3);
            EMPTY = listState4;
            ListState[] listStateArr = {listState, listState2, listState3, listState4};
            $VALUES = listStateArr;
            $ENTRIES = new asp(listStateArr);
        }

        private ListState(String str, int i) {
        }

        public static ListState valueOf(String str) {
            return (ListState) Enum.valueOf(ListState.class, str);
        }

        public static ListState[] values() {
            return (ListState[]) $VALUES.clone();
        }
    }

    public SchemeStat$VideoListInfo(int i, int i2, CurrentVideoState currentVideoState, ListState listState) {
        this.stallCount = i;
        this.totalStallDuration = i2;
        this.currentVideoState = currentVideoState;
        this.listState = listState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$VideoListInfo)) {
            return false;
        }
        SchemeStat$VideoListInfo schemeStat$VideoListInfo = (SchemeStat$VideoListInfo) obj;
        return this.stallCount == schemeStat$VideoListInfo.stallCount && this.totalStallDuration == schemeStat$VideoListInfo.totalStallDuration && this.currentVideoState == schemeStat$VideoListInfo.currentVideoState && this.listState == schemeStat$VideoListInfo.listState;
    }

    public final int hashCode() {
        return this.listState.hashCode() + ((this.currentVideoState.hashCode() + shy.a(this.totalStallDuration, Integer.hashCode(this.stallCount) * 31, 31)) * 31);
    }

    public final String toString() {
        return "VideoListInfo(stallCount=" + this.stallCount + ", totalStallDuration=" + this.totalStallDuration + ", currentVideoState=" + this.currentVideoState + ", listState=" + this.listState + ')';
    }
}
