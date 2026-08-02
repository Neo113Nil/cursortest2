package com.vk.clips.viewer.api.prefs;

import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsTrendsPrefs.kt */
/* loaded from: classes17.dex */
public interface ClipsTrendsPrefs {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsTrendsPrefs.kt */
    public static final class BannerClosedFlag {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerClosedFlag[] $VALUES;
        public static final BannerClosedFlag EXPIRED;
        public static final BannerClosedFlag SET;
        public static final BannerClosedFlag UNSET;
        private final boolean shouldShow;

        static {
            BannerClosedFlag bannerClosedFlag = new BannerClosedFlag("UNSET", 0, true);
            UNSET = bannerClosedFlag;
            BannerClosedFlag bannerClosedFlag2 = new BannerClosedFlag("EXPIRED", 1, true);
            EXPIRED = bannerClosedFlag2;
            BannerClosedFlag bannerClosedFlag3 = new BannerClosedFlag("SET", 2, false);
            SET = bannerClosedFlag3;
            BannerClosedFlag[] bannerClosedFlagArr = {bannerClosedFlag, bannerClosedFlag2, bannerClosedFlag3};
            $VALUES = bannerClosedFlagArr;
            $ENTRIES = new asp(bannerClosedFlagArr);
        }

        public BannerClosedFlag(String str, int i, boolean z) {
            this.shouldShow = z;
        }

        public static BannerClosedFlag valueOf(String str) {
            return (BannerClosedFlag) Enum.valueOf(BannerClosedFlag.class, str);
        }

        public static BannerClosedFlag[] values() {
            return (BannerClosedFlag[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.shouldShow;
        }
    }

    void a(long j, String str);

    void b();

    BannerClosedFlag c(String str);

    boolean d();
}
