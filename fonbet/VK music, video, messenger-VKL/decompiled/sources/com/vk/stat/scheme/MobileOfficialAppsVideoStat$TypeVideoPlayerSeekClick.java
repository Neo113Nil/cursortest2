package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick implements SchemeStat$TypeClick.b {

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("source")
    private final Source source;

    @pmi0("time_seconds")
    private final String timeSeconds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("double_tap")
        public static final Source DOUBLE_TAP;

        @pmi0("episode")
        public static final Source EPISODE;

        @pmi0("fast_seek")
        public static final Source FAST_SEEK;

        @pmi0("live")
        public static final Source LIVE;

        @pmi0("precise_slider")
        public static final Source PRECISE_SLIDER;

        @pmi0("slider")
        public static final Source SLIDER;

        static {
            Source source = new Source("SLIDER", 0);
            SLIDER = source;
            Source source2 = new Source("DOUBLE_TAP", 1);
            DOUBLE_TAP = source2;
            Source source3 = new Source("EPISODE", 2);
            EPISODE = source3;
            Source source4 = new Source("LIVE", 3);
            LIVE = source4;
            Source source5 = new Source("FAST_SEEK", 4);
            FAST_SEEK = source5;
            Source source6 = new Source("PRECISE_SLIDER", 5);
            PRECISE_SLIDER = source6;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick(Source source, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.source = source;
        this.timeSeconds = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick = (MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick) obj;
        return this.source == mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.source && epx.f(this.timeSeconds, mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.timeSeconds) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode() + urd0.a(this.source.hashCode() * 31, 31, this.timeSeconds);
    }

    public final String toString() {
        return "TypeVideoPlayerSeekClick(source=" + this.source + ", timeSeconds=" + this.timeSeconds + ", screenMode=" + this.screenMode + ')';
    }
}
