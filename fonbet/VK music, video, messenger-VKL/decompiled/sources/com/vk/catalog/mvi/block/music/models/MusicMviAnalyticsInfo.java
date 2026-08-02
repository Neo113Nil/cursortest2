package com.vk.catalog.mvi.block.music.models;

import xsna.asp;
import xsna.zrp;

/* compiled from: MusicMviAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class MusicMviAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicMviAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget AddToMe;
        public static final ClickTarget AddToPlaylist;
        public static final ClickTarget AddToStory;
        public static final ClickTarget Broadcast;
        public static final ClickTarget CopyLink;
        public static final ClickTarget Download;
        public static final ClickTarget Fave;
        public static final ClickTarget ListenNext;
        public static final ClickTarget LongTap;
        public static final ClickTarget Menu;
        public static final ClickTarget Open;
        public static final ClickTarget OpenAlbum;
        public static final ClickTarget OpenMusician;
        public static final ClickTarget Pause;
        public static final ClickTarget PauseAll;
        public static final ClickTarget Play;
        public static final ClickTarget PlayAll;
        public static final ClickTarget RemoveFromMe;
        public static final ClickTarget SetSleepTimer;
        public static final ClickTarget Share;
        public static final ClickTarget ShowSimilar;
        public static final ClickTarget ShowSimilarSerp;
        public static final ClickTarget Subscribe;
        public static final ClickTarget Unfave;
        public static final ClickTarget Unsubscribe;
        private final String value;

        static {
            ClickTarget clickTarget = new ClickTarget("Open", 0, "Open");
            Open = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("Share", 1, "Share");
            Share = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("AddToMe", 2, "AddToMe");
            AddToMe = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("RemoveFromMe", 3, "RemoveFromMe");
            RemoveFromMe = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("OpenMusician", 4, "OpenMusician");
            OpenMusician = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("Download", 5, "Download");
            Download = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("CopyLink", 6, "CopyLink");
            CopyLink = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("ListenNext", 7, "ListenNext");
            ListenNext = clickTarget8;
            ClickTarget clickTarget9 = new ClickTarget("PlayAll", 8, "PlayAll");
            PlayAll = clickTarget9;
            ClickTarget clickTarget10 = new ClickTarget("PauseAll", 9, "PauseAll");
            PauseAll = clickTarget10;
            ClickTarget clickTarget11 = new ClickTarget("Subscribe", 10, "Subscribe");
            Subscribe = clickTarget11;
            ClickTarget clickTarget12 = new ClickTarget("Unsubscribe", 11, "Unsubscribe");
            Unsubscribe = clickTarget12;
            ClickTarget clickTarget13 = new ClickTarget("Menu", 12, "Menu");
            Menu = clickTarget13;
            ClickTarget clickTarget14 = new ClickTarget("Play", 13, "Play");
            Play = clickTarget14;
            ClickTarget clickTarget15 = new ClickTarget("Pause", 14, "Pause");
            Pause = clickTarget15;
            ClickTarget clickTarget16 = new ClickTarget("OpenAlbum", 15, "OpenAlbum");
            OpenAlbum = clickTarget16;
            ClickTarget clickTarget17 = new ClickTarget("ShowSimilar", 16, "ShowSimilar");
            ShowSimilar = clickTarget17;
            ClickTarget clickTarget18 = new ClickTarget("AddToPlaylist", 17, "AddToPlaylist");
            AddToPlaylist = clickTarget18;
            ClickTarget clickTarget19 = new ClickTarget("SetSleepTimer", 18, "SetSleepTimer");
            SetSleepTimer = clickTarget19;
            ClickTarget clickTarget20 = new ClickTarget("Broadcast", 19, "Broadcast");
            Broadcast = clickTarget20;
            ClickTarget clickTarget21 = new ClickTarget("Fave", 20, "Fave");
            Fave = clickTarget21;
            ClickTarget clickTarget22 = new ClickTarget("Unfave", 21, "Unfave");
            Unfave = clickTarget22;
            ClickTarget clickTarget23 = new ClickTarget("AddToStory", 22, "AddToStory");
            AddToStory = clickTarget23;
            ClickTarget clickTarget24 = new ClickTarget("LongTap", 23, "LongTap");
            LongTap = clickTarget24;
            ClickTarget clickTarget25 = new ClickTarget("ShowSimilarSerp", 24, "ShowSimilarSerp");
            ShowSimilarSerp = clickTarget25;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6, clickTarget7, clickTarget8, clickTarget9, clickTarget10, clickTarget11, clickTarget12, clickTarget13, clickTarget14, clickTarget15, clickTarget16, clickTarget17, clickTarget18, clickTarget19, clickTarget20, clickTarget21, clickTarget22, clickTarget23, clickTarget24, clickTarget25};
            $VALUES = clickTargetArr;
            $ENTRIES = new asp(clickTargetArr);
        }

        public ClickTarget(String str, int i, String str2) {
            this.value = str2;
        }

        public static ClickTarget valueOf(String str) {
            return (ClickTarget) Enum.valueOf(ClickTarget.class, str);
        }

        public static ClickTarget[] values() {
            return (ClickTarget[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public MusicMviAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final ClickTarget a() {
        return this.a;
    }
}
