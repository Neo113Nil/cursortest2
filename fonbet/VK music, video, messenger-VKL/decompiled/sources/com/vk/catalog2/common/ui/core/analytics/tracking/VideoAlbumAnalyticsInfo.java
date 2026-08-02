package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: VideoAlbumAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class VideoAlbumAnalyticsInfo {
    public final ClickTarget a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAlbumAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget CancelUnsubscribe;
        public static final ClickTarget CollapseVideos;
        public static final ClickTarget CopyLink;
        public static final ClickTarget ExpandVideos;
        public static final ClickTarget Open;
        public static final ClickTarget PlayAll;
        public static final ClickTarget Share;
        public static final ClickTarget ShowAuthor;
        public static final ClickTarget Subscribe;
        public static final ClickTarget Unsubscribe;

        static {
            ClickTarget clickTarget = new ClickTarget("Open", 0);
            Open = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("ShowAuthor", 1);
            ShowAuthor = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("PlayAll", 2);
            PlayAll = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("Subscribe", 3);
            Subscribe = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("Unsubscribe", 4);
            Unsubscribe = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("CancelUnsubscribe", 5);
            CancelUnsubscribe = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("CopyLink", 6);
            CopyLink = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("Share", 7);
            Share = clickTarget8;
            ClickTarget clickTarget9 = new ClickTarget("ExpandVideos", 8);
            ExpandVideos = clickTarget9;
            ClickTarget clickTarget10 = new ClickTarget("CollapseVideos", 9);
            CollapseVideos = clickTarget10;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6, clickTarget7, clickTarget8, clickTarget9, clickTarget10};
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

    public VideoAlbumAnalyticsInfo(ClickTarget clickTarget, String str) {
        this.a = clickTarget;
        this.b = str;
    }
}
