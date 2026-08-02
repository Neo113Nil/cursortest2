package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem {

    @pmi0("trending_status")
    private final TrendingStatus trendingStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class TrendingStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrendingStatus[] $VALUES;

        @pmi0("not_trend")
        public static final TrendingStatus NOT_TREND;

        @pmi0("trend_music")
        public static final TrendingStatus TREND_MUSIC;

        static {
            TrendingStatus trendingStatus = new TrendingStatus("TREND_MUSIC", 0);
            TREND_MUSIC = trendingStatus;
            TrendingStatus trendingStatus2 = new TrendingStatus("NOT_TREND", 1);
            NOT_TREND = trendingStatus2;
            TrendingStatus[] trendingStatusArr = {trendingStatus, trendingStatus2};
            $VALUES = trendingStatusArr;
            $ENTRIES = new asp(trendingStatusArr);
        }

        private TrendingStatus(String str, int i) {
        }

        public static TrendingStatus valueOf(String str) {
            return (TrendingStatus) Enum.valueOf(TrendingStatus.class, str);
        }

        public static TrendingStatus[] values() {
            return (TrendingStatus[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem(TrendingStatus trendingStatus) {
        this.trendingStatus = trendingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem) && this.trendingStatus == ((MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem) obj).trendingStatus;
    }

    public final int hashCode() {
        return this.trendingStatus.hashCode();
    }

    public final String toString() {
        return "TypeClipClickToMusicEventItem(trendingStatus=" + this.trendingStatus + ')';
    }
}
