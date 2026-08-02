package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsEcommStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem {

    @pmi0("checklist_type")
    private final ChecklistType checklistType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsEcommStat.kt */
    public static final class ChecklistType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChecklistType[] $VALUES;

        @pmi0("action_button")
        public static final ChecklistType ACTION_BUTTON;

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        public static final ChecklistType ADDRESS;

        @pmi0(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
        public static final ChecklistType ADS;

        @pmi0("cover_image")
        public static final ChecklistType COVER_IMAGE;

        @pmi0("description")
        public static final ChecklistType DESCRIPTION;

        @pmi0("invite_friends")
        public static final ChecklistType INVITE_FRIENDS;

        @pmi0("load_avatar")
        public static final ChecklistType LOAD_AVATAR;

        @pmi0("make_post")
        public static final ChecklistType MAKE_POST;

        @pmi0("market_item")
        public static final ChecklistType MARKET_ITEM;

        @pmi0("short_url")
        public static final ChecklistType SHORT_URL;

        @pmi0("subscribe_vk_news")
        public static final ChecklistType SUBSCRIBE_VK_NEWS;

        @pmi0("vkconnect")
        public static final ChecklistType VKCONNECT;

        static {
            ChecklistType checklistType = new ChecklistType("LOAD_AVATAR", 0);
            LOAD_AVATAR = checklistType;
            ChecklistType checklistType2 = new ChecklistType("SHORT_URL", 1);
            SHORT_URL = checklistType2;
            ChecklistType checklistType3 = new ChecklistType("ADDRESS", 2);
            ADDRESS = checklistType3;
            ChecklistType checklistType4 = new ChecklistType("COVER_IMAGE", 3);
            COVER_IMAGE = checklistType4;
            ChecklistType checklistType5 = new ChecklistType(NativeAdContent.ViewTag.AD_DESCRIPTION, 4);
            DESCRIPTION = checklistType5;
            ChecklistType checklistType6 = new ChecklistType("ACTION_BUTTON", 5);
            ACTION_BUTTON = checklistType6;
            ChecklistType checklistType7 = new ChecklistType("MARKET_ITEM", 6);
            MARKET_ITEM = checklistType7;
            ChecklistType checklistType8 = new ChecklistType("ADS", 7);
            ADS = checklistType8;
            ChecklistType checklistType9 = new ChecklistType("MAKE_POST", 8);
            MAKE_POST = checklistType9;
            ChecklistType checklistType10 = new ChecklistType("VKCONNECT", 9);
            VKCONNECT = checklistType10;
            ChecklistType checklistType11 = new ChecklistType("SUBSCRIBE_VK_NEWS", 10);
            SUBSCRIBE_VK_NEWS = checklistType11;
            ChecklistType checklistType12 = new ChecklistType("INVITE_FRIENDS", 11);
            INVITE_FRIENDS = checklistType12;
            ChecklistType[] checklistTypeArr = {checklistType, checklistType2, checklistType3, checklistType4, checklistType5, checklistType6, checklistType7, checklistType8, checklistType9, checklistType10, checklistType11, checklistType12};
            $VALUES = checklistTypeArr;
            $ENTRIES = new asp(checklistTypeArr);
        }

        private ChecklistType(String str, int i) {
        }

        public static ChecklistType valueOf(String str) {
            return (ChecklistType) Enum.valueOf(ChecklistType.class, str);
        }

        public static ChecklistType[] values() {
            return (ChecklistType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem(ChecklistType checklistType) {
        this.checklistType = checklistType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem) && this.checklistType == ((MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem) obj).checklistType;
    }

    public final int hashCode() {
        return this.checklistType.hashCode();
    }

    public final String toString() {
        return "TypeAdminTipsChecklistClickItem(checklistType=" + this.checklistType + ')';
    }
}
