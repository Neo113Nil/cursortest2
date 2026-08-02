package com.vk.music.bottomsheets.tracker;

import com.vk.dto.search.SearchStatsLoggingInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: MusicBottomSheetActionTracker.kt */
/* loaded from: classes3.dex */
public interface MusicBottomSheetActionTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicBottomSheetActionTracker.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action AddToMyMusic;
        public static final Action AddToPlaylist;
        public static final Action AddToStory;
        public static final Action Broadcast;
        public static final Action CopyLink;
        public static final Action Download;
        public static final Action Fave;
        public static final Action GoToArtists;
        public static final Action ListenNext;
        public static final Action OpenAlbum;
        public static final Action RemoveFromMyMusic;
        public static final Action SetSleepTimer;
        public static final Action Share;
        public static final Action ShowSimilar;
        public static final Action Unfave;

        static {
            Action action = new Action("ListenNext", 0);
            ListenNext = action;
            Action action2 = new Action("AddToMyMusic", 1);
            AddToMyMusic = action2;
            Action action3 = new Action("RemoveFromMyMusic", 2);
            RemoveFromMyMusic = action3;
            Action action4 = new Action("GoToArtists", 3);
            GoToArtists = action4;
            Action action5 = new Action("Download", 4);
            Download = action5;
            Action action6 = new Action("Share", 5);
            Share = action6;
            Action action7 = new Action("CopyLink", 6);
            CopyLink = action7;
            Action action8 = new Action("OpenAlbum", 7);
            OpenAlbum = action8;
            Action action9 = new Action("ShowSimilar", 8);
            ShowSimilar = action9;
            Action action10 = new Action("AddToPlaylist", 9);
            AddToPlaylist = action10;
            Action action11 = new Action("SetSleepTimer", 10);
            SetSleepTimer = action11;
            Action action12 = new Action("Broadcast", 11);
            Broadcast = action12;
            Action action13 = new Action("Fave", 12);
            Fave = action13;
            Action action14 = new Action("Unfave", 13);
            Unfave = action14;
            Action action15 = new Action("AddToStory", 14);
            AddToStory = action15;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    SearchStatsLoggingInfo a();

    void b(Action action);
}
