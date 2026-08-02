package com.vk.stat.scheme;

import com.ironsource.Ad;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedImageLoading implements SchemeStat$TypeView.b {

    @pmi0(TtmlNode.END)
    private final List<MobileOfficialAppsFeedStat$FeedImageLoadingEvent> end;

    @pmi0(X3.a.t)
    private final Mode mode;

    @pmi0("start")
    private final List<MobileOfficialAppsFeedStat$FeedImageLoadingEvent> start;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;

        @pmi0("carousel")
        public static final Mode CAROUSEL;

        @pmi0("grid")
        public static final Mode GRID;

        @pmi0(Ad.d)
        public static final Mode SINGLE;

        static {
            Mode mode = new Mode("SINGLE", 0);
            SINGLE = mode;
            Mode mode2 = new Mode(SignalingProtocol.KEY_GRID, 1);
            GRID = mode2;
            Mode mode3 = new Mode("CAROUSEL", 2);
            CAROUSEL = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        private Mode(String str, int i) {
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedImageLoading(List<MobileOfficialAppsFeedStat$FeedImageLoadingEvent> list, List<MobileOfficialAppsFeedStat$FeedImageLoadingEvent> list2, Mode mode) {
        this.start = list;
        this.end = list2;
        this.mode = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedImageLoading)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedImageLoading mobileOfficialAppsFeedStat$TypeFeedImageLoading = (MobileOfficialAppsFeedStat$TypeFeedImageLoading) obj;
        return epx.f(this.start, mobileOfficialAppsFeedStat$TypeFeedImageLoading.start) && epx.f(this.end, mobileOfficialAppsFeedStat$TypeFeedImageLoading.end) && this.mode == mobileOfficialAppsFeedStat$TypeFeedImageLoading.mode;
    }

    public final int hashCode() {
        int a = fw3.a(this.start.hashCode() * 31, 31, this.end);
        Mode mode = this.mode;
        return a + (mode == null ? 0 : mode.hashCode());
    }

    public final String toString() {
        return "TypeFeedImageLoading(start=" + this.start + ", end=" + this.end + ", mode=" + this.mode + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedImageLoading(List list, List list2, Mode mode, int i, zcl zclVar) {
        this(list, list2, (i & 4) != 0 ? null : mode);
    }
}
