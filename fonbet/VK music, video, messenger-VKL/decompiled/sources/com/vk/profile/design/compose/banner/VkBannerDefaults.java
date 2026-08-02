package com.vk.profile.design.compose.banner;

import xsna.asp;
import xsna.uog0;
import xsna.vog0;
import xsna.zrp;

/* compiled from: VkBannerDefaults.kt */
/* loaded from: classes5.dex */
public final class VkBannerDefaults {
    public static final float a = 24;
    public static final uog0 b = vog0.b(18);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBannerDefaults.kt */
    public static final class BackgroundMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BackgroundMode[] $VALUES;
        public static final BackgroundMode Dark;
        public static final BackgroundMode Light;

        static {
            BackgroundMode backgroundMode = new BackgroundMode("Dark", 0);
            Dark = backgroundMode;
            BackgroundMode backgroundMode2 = new BackgroundMode("Light", 1);
            Light = backgroundMode2;
            BackgroundMode[] backgroundModeArr = {backgroundMode, backgroundMode2};
            $VALUES = backgroundModeArr;
            $ENTRIES = new asp(backgroundModeArr);
        }

        public BackgroundMode() {
            throw null;
        }

        public static BackgroundMode valueOf(String str) {
            return (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
        }

        public static BackgroundMode[] values() {
            return (BackgroundMode[]) $VALUES.clone();
        }
    }
}
