package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$FeedPostAudioPlayMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsFeedStat$FeedPostAudioPlayMode[] $VALUES;

    @pmi0("autoplay")
    public static final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode AUTOPLAY;

    @pmi0("manual")
    public static final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode MANUAL;

    static {
        MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode = new MobileOfficialAppsFeedStat$FeedPostAudioPlayMode("AUTOPLAY", 0);
        AUTOPLAY = mobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
        MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode2 = new MobileOfficialAppsFeedStat$FeedPostAudioPlayMode("MANUAL", 1);
        MANUAL = mobileOfficialAppsFeedStat$FeedPostAudioPlayMode2;
        MobileOfficialAppsFeedStat$FeedPostAudioPlayMode[] mobileOfficialAppsFeedStat$FeedPostAudioPlayModeArr = {mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, mobileOfficialAppsFeedStat$FeedPostAudioPlayMode2};
        $VALUES = mobileOfficialAppsFeedStat$FeedPostAudioPlayModeArr;
        $ENTRIES = new asp(mobileOfficialAppsFeedStat$FeedPostAudioPlayModeArr);
    }

    private MobileOfficialAppsFeedStat$FeedPostAudioPlayMode(String str, int i) {
    }

    public static MobileOfficialAppsFeedStat$FeedPostAudioPlayMode valueOf(String str) {
        return (MobileOfficialAppsFeedStat$FeedPostAudioPlayMode) Enum.valueOf(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.class, str);
    }

    public static MobileOfficialAppsFeedStat$FeedPostAudioPlayMode[] values() {
        return (MobileOfficialAppsFeedStat$FeedPostAudioPlayMode[]) $VALUES.clone();
    }
}
