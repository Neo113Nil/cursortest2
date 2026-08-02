package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0("more_in_clips")
        public static final ClickType MORE_IN_CLIPS;

        @pmi0("watch_again")
        public static final ClickType WATCH_AGAIN;

        static {
            ClickType clickType = new ClickType("MORE_IN_CLIPS", 0);
            MORE_IN_CLIPS = clickType;
            ClickType clickType2 = new ClickType("WATCH_AGAIN", 1);
            WATCH_AGAIN = clickType2;
            ClickType[] clickTypeArr = {clickType, clickType2};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        private ClickType(String str, int i) {
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem(MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, ClickType clickType) {
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
        this.clickType = clickType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem = (MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem) obj;
        return epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.clipItem) && this.clickType == mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.clickType;
    }

    public final int hashCode() {
        return this.clickType.hashCode() + (this.clipItem.hashCode() * 31);
    }

    public final String toString() {
        return "TypeClipInFeedOverlayClickItem(clipItem=" + this.clipItem + ", clickType=" + this.clickType + ')';
    }
}
