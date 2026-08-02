package com.vk.im.ui.utils;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bvt0;
import xsna.zrp;

/* compiled from: EduMaxTransitionTracker.kt */
/* loaded from: classes2.dex */
public final class EduMaxTransitionTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EduMaxTransitionTracker.kt */
    public static final class BannerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerType[] $VALUES;
        public static final BannerType BANNER_BLOCKED_CHAT;
        public static final BannerType BANNER_BLOCKED_CHAT_INFO;
        public static final BannerType BANNER_COUNTER;
        public static final BannerType BANNER_EXPANDED_CHAT;
        public static final BannerType BANNER_EXPANDED_CHAT_LIST;
        private final String rawName;

        static {
            BannerType bannerType = new BannerType("BANNER_EXPANDED_CHAT", 0, "sferum_to_max_expanded_chat");
            BANNER_EXPANDED_CHAT = bannerType;
            BannerType bannerType2 = new BannerType("BANNER_EXPANDED_CHAT_LIST", 1, "sferum_to_max_expanded_chatlist");
            BANNER_EXPANDED_CHAT_LIST = bannerType2;
            BannerType bannerType3 = new BannerType("BANNER_COUNTER", 2, "sferum_to_max_chat_counter");
            BANNER_COUNTER = bannerType3;
            BannerType bannerType4 = new BannerType("BANNER_BLOCKED_CHAT", 3, "sferum_to_max_blocked_input_chat");
            BANNER_BLOCKED_CHAT = bannerType4;
            BannerType bannerType5 = new BannerType("BANNER_BLOCKED_CHAT_INFO", 4, "sferum_to_max_blocked_input_chat_info");
            BANNER_BLOCKED_CHAT_INFO = bannerType5;
            BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3, bannerType4, bannerType5};
            $VALUES = bannerTypeArr;
            $ENTRIES = new asp(bannerTypeArr);
        }

        public BannerType(String str, int i, String str2) {
            this.rawName = str2;
        }

        public static BannerType valueOf(String str) {
            return (BannerType) Enum.valueOf(BannerType.class, str);
        }

        public static BannerType[] values() {
            return (BannerType[]) $VALUES.clone();
        }

        public final String h() {
            return this.rawName;
        }
    }

    public static void a(BannerType bannerType) {
        b(bannerType, MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.EventType.CLICK);
    }

    public static void b(BannerType bannerType, MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), String.valueOf(0L), String.valueOf(0L), null, new MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem(new CommonStat$TypeTrackCodeItem(bannerType.h()), eventType), 8)).q();
    }
}
