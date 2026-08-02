package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: VideoAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class VideoAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget AddToMe;
        public static final ClickTarget AddToPlaylist;
        public static final ClickTarget CopyLink;
        public static final ClickTarget Download;
        public static final ClickTarget ExtendEpisodes;
        public static final ClickTarget Fave;
        public static final ClickTarget Like;
        public static final ClickTarget NotInterested;
        public static final ClickTarget Open;
        public static final ClickTarget OpenEpisodes;
        public static final ClickTarget RemoveFromMe;
        public static final ClickTarget RemoveSeen;
        public static final ClickTarget Share;
        public static final ClickTarget ShowAuthor;
        public static final ClickTarget Unfave;
        public static final ClickTarget Unlike;

        static {
            ClickTarget clickTarget = new ClickTarget("Open", 0);
            Open = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("ShowAuthor", 1);
            ShowAuthor = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("Like", 2);
            Like = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("Unlike", 3);
            Unlike = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("Fave", 4);
            Fave = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("Unfave", 5);
            Unfave = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("Download", 6);
            Download = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("AddToMe", 7);
            AddToMe = clickTarget8;
            ClickTarget clickTarget9 = new ClickTarget("RemoveFromMe", 8);
            RemoveFromMe = clickTarget9;
            ClickTarget clickTarget10 = new ClickTarget("RemoveSeen", 9);
            RemoveSeen = clickTarget10;
            ClickTarget clickTarget11 = new ClickTarget("CopyLink", 10);
            CopyLink = clickTarget11;
            ClickTarget clickTarget12 = new ClickTarget("Share", 11);
            Share = clickTarget12;
            ClickTarget clickTarget13 = new ClickTarget("AddToPlaylist", 12);
            AddToPlaylist = clickTarget13;
            ClickTarget clickTarget14 = new ClickTarget("NotInterested", 13);
            NotInterested = clickTarget14;
            ClickTarget clickTarget15 = new ClickTarget("ExtendEpisodes", 14);
            ExtendEpisodes = clickTarget15;
            ClickTarget clickTarget16 = new ClickTarget("OpenEpisodes", 15);
            OpenEpisodes = clickTarget16;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6, clickTarget7, clickTarget8, clickTarget9, clickTarget10, clickTarget11, clickTarget12, clickTarget13, clickTarget14, clickTarget15, clickTarget16};
            $VALUES = clickTargetArr;
            $ENTRIES = new asp(clickTargetArr);
        }

        public ClickTarget() {
            throw null;
        }

        public static ClickTarget valueOf(String str) {
            return (ClickTarget) Enum.valueOf(ClickTarget.class, str);
        }

        public static ClickTarget[] values() {
            return (ClickTarget[]) $VALUES.clone();
        }
    }

    public VideoAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }
}
