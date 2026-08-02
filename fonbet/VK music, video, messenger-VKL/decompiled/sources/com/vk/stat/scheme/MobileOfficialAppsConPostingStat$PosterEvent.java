package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$PosterEvent {

    @pmi0("poster_event_type")
    private final PosterEventType posterEventType;

    @pmi0("poster_info")
    private final MobileOfficialAppsConPostingStat$PosterInfo posterInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PosterEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PosterEventType[] $VALUES;

        @pmi0("add_custom_background")
        public static final PosterEventType ADD_CUSTOM_BACKGROUND;

        @pmi0("close_poster")
        public static final PosterEventType CLOSE_POSTER;

        @pmi0("open_poster")
        public static final PosterEventType OPEN_POSTER;

        @pmi0("open_poster_custom")
        public static final PosterEventType OPEN_POSTER_CUSTOM;

        @pmi0("save_custom_background")
        public static final PosterEventType SAVE_CUSTOM_BACKGROUND;

        @pmi0("select_background")
        public static final PosterEventType SELECT_BACKGROUND;

        @pmi0("select_custom_background")
        public static final PosterEventType SELECT_CUSTOM_BACKGROUND;

        static {
            PosterEventType posterEventType = new PosterEventType("OPEN_POSTER", 0);
            OPEN_POSTER = posterEventType;
            PosterEventType posterEventType2 = new PosterEventType("CLOSE_POSTER", 1);
            CLOSE_POSTER = posterEventType2;
            PosterEventType posterEventType3 = new PosterEventType("SELECT_BACKGROUND", 2);
            SELECT_BACKGROUND = posterEventType3;
            PosterEventType posterEventType4 = new PosterEventType("OPEN_POSTER_CUSTOM", 3);
            OPEN_POSTER_CUSTOM = posterEventType4;
            PosterEventType posterEventType5 = new PosterEventType("ADD_CUSTOM_BACKGROUND", 4);
            ADD_CUSTOM_BACKGROUND = posterEventType5;
            PosterEventType posterEventType6 = new PosterEventType("SELECT_CUSTOM_BACKGROUND", 5);
            SELECT_CUSTOM_BACKGROUND = posterEventType6;
            PosterEventType posterEventType7 = new PosterEventType("SAVE_CUSTOM_BACKGROUND", 6);
            SAVE_CUSTOM_BACKGROUND = posterEventType7;
            PosterEventType[] posterEventTypeArr = {posterEventType, posterEventType2, posterEventType3, posterEventType4, posterEventType5, posterEventType6, posterEventType7};
            $VALUES = posterEventTypeArr;
            $ENTRIES = new asp(posterEventTypeArr);
        }

        private PosterEventType(String str, int i) {
        }

        public static PosterEventType valueOf(String str) {
            return (PosterEventType) Enum.valueOf(PosterEventType.class, str);
        }

        public static PosterEventType[] values() {
            return (PosterEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$PosterEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$PosterEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent = (MobileOfficialAppsConPostingStat$PosterEvent) obj;
        return this.posterEventType == mobileOfficialAppsConPostingStat$PosterEvent.posterEventType && epx.f(this.posterInfo, mobileOfficialAppsConPostingStat$PosterEvent.posterInfo);
    }

    public final int hashCode() {
        PosterEventType posterEventType = this.posterEventType;
        int hashCode = (posterEventType == null ? 0 : posterEventType.hashCode()) * 31;
        MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo = this.posterInfo;
        return hashCode + (mobileOfficialAppsConPostingStat$PosterInfo != null ? mobileOfficialAppsConPostingStat$PosterInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PosterEvent(posterEventType=" + this.posterEventType + ", posterInfo=" + this.posterInfo + ')';
    }

    public MobileOfficialAppsConPostingStat$PosterEvent(PosterEventType posterEventType, MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo) {
        this.posterEventType = posterEventType;
        this.posterInfo = mobileOfficialAppsConPostingStat$PosterInfo;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$PosterEvent(PosterEventType posterEventType, MobileOfficialAppsConPostingStat$PosterInfo mobileOfficialAppsConPostingStat$PosterInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : posterEventType, (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$PosterInfo);
    }
}
