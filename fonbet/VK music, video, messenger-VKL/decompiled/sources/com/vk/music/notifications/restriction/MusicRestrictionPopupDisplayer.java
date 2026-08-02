package com.vk.music.notifications.restriction;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import xsna.asp;
import xsna.ep40;
import xsna.ezb0;
import xsna.zrp;

/* compiled from: MusicRestrictionPopupDisplayer.kt */
/* loaded from: classes.dex */
public interface MusicRestrictionPopupDisplayer extends ep40 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicRestrictionPopupDisplayer.kt */
    /* loaded from: classes3.dex */
    public static final class SubscriptionPopupType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubscriptionPopupType[] $VALUES;
        public static final SubscriptionPopupType COMBO_UPGRADE;
        public static final a Companion;
        public static final SubscriptionPopupType DEFAULT;
        public static final SubscriptionPopupType WINK_UPGRADE;
        private final String value;

        /* compiled from: MusicRestrictionPopupDisplayer.kt */
        public static final class a {
        }

        static {
            SubscriptionPopupType subscriptionPopupType = new SubscriptionPopupType("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = subscriptionPopupType;
            SubscriptionPopupType subscriptionPopupType2 = new SubscriptionPopupType("COMBO_UPGRADE", 1, "combo_upgrade");
            COMBO_UPGRADE = subscriptionPopupType2;
            SubscriptionPopupType subscriptionPopupType3 = new SubscriptionPopupType("WINK_UPGRADE", 2, "wink_upgrade");
            WINK_UPGRADE = subscriptionPopupType3;
            SubscriptionPopupType[] subscriptionPopupTypeArr = {subscriptionPopupType, subscriptionPopupType2, subscriptionPopupType3};
            $VALUES = subscriptionPopupTypeArr;
            $ENTRIES = new asp(subscriptionPopupTypeArr);
            Companion = new a();
        }

        public SubscriptionPopupType(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubscriptionPopupType valueOf(String str) {
            return (SubscriptionPopupType) Enum.valueOf(SubscriptionPopupType.class, str);
        }

        public static SubscriptionPopupType[] values() {
            return (SubscriptionPopupType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    static /* synthetic */ void d(MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, SubscriptionPopupType subscriptionPopupType, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            subscriptionPopupType = SubscriptionPopupType.DEFAULT;
        }
        musicRestrictionPopupDisplayer.i(str, musicPlaybackLaunchContext, str2, subscriptionPopupType);
    }

    static /* synthetic */ void e(MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, Context context, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, SubscriptionPopupType subscriptionPopupType, String str3, int i) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            subscriptionPopupType = SubscriptionPopupType.DEFAULT;
        }
        SubscriptionPopupType subscriptionPopupType2 = subscriptionPopupType;
        if ((i & 32) != 0) {
            str3 = null;
        }
        musicRestrictionPopupDisplayer.b(context, str, musicPlaybackLaunchContext, str4, subscriptionPopupType2, str3);
    }

    void a(MusicDynamicRestriction musicDynamicRestriction, ezb0 ezb0Var);

    void b(Context context, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, SubscriptionPopupType subscriptionPopupType, String str3);

    void c(MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void f();

    void g(MusicTrack musicTrack);

    void i(String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, SubscriptionPopupType subscriptionPopupType);
}
