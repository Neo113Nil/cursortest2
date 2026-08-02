package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$StoryTypeOpen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsConStoriesStat$StoryTypeOpen[] $VALUES;

    @pmi0("NEXT_OPEN_STORY")
    public static final MobileOfficialAppsConStoriesStat$StoryTypeOpen NEXT_OPEN_STORY;

    @pmi0("OPEN_STORY_BY_CLICK")
    public static final MobileOfficialAppsConStoriesStat$StoryTypeOpen OPEN_STORY_BY_CLICK;

    @pmi0(GrsBaseInfo.CountryCodeSource.UNKNOWN)
    public static final MobileOfficialAppsConStoriesStat$StoryTypeOpen UNKNOWN;

    static {
        MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen = new MobileOfficialAppsConStoriesStat$StoryTypeOpen("OPEN_STORY_BY_CLICK", 0);
        OPEN_STORY_BY_CLICK = mobileOfficialAppsConStoriesStat$StoryTypeOpen;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen2 = new MobileOfficialAppsConStoriesStat$StoryTypeOpen("NEXT_OPEN_STORY", 1);
        NEXT_OPEN_STORY = mobileOfficialAppsConStoriesStat$StoryTypeOpen2;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen3 = new MobileOfficialAppsConStoriesStat$StoryTypeOpen(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = mobileOfficialAppsConStoriesStat$StoryTypeOpen3;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen[] mobileOfficialAppsConStoriesStat$StoryTypeOpenArr = {mobileOfficialAppsConStoriesStat$StoryTypeOpen, mobileOfficialAppsConStoriesStat$StoryTypeOpen2, mobileOfficialAppsConStoriesStat$StoryTypeOpen3};
        $VALUES = mobileOfficialAppsConStoriesStat$StoryTypeOpenArr;
        $ENTRIES = new asp(mobileOfficialAppsConStoriesStat$StoryTypeOpenArr);
    }

    private MobileOfficialAppsConStoriesStat$StoryTypeOpen(String str, int i) {
    }

    public static MobileOfficialAppsConStoriesStat$StoryTypeOpen valueOf(String str) {
        return (MobileOfficialAppsConStoriesStat$StoryTypeOpen) Enum.valueOf(MobileOfficialAppsConStoriesStat$StoryTypeOpen.class, str);
    }

    public static MobileOfficialAppsConStoriesStat$StoryTypeOpen[] values() {
        return (MobileOfficialAppsConStoriesStat$StoryTypeOpen[]) $VALUES.clone();
    }
}
