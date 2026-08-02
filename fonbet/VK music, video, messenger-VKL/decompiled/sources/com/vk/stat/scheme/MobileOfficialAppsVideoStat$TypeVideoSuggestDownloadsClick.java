package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final ClickType CLOSE;

        @pmi0("open_downloads")
        public static final ClickType OPEN_DOWNLOADS;

        static {
            ClickType clickType = new ClickType("CLOSE", 0);
            CLOSE = clickType;
            ClickType clickType2 = new ClickType("OPEN_DOWNLOADS", 1);
            OPEN_DOWNLOADS = clickType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick(ClickType clickType) {
        this.clickType = clickType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick) && this.clickType == ((MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick) obj).clickType;
    }

    public final int hashCode() {
        return this.clickType.hashCode();
    }

    public final String toString() {
        return "TypeVideoSuggestDownloadsClick(clickType=" + this.clickType + ')';
    }
}
