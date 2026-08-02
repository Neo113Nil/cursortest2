package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("type_restriction")
    private final TypeRestriction typeRestriction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final ClickType CLOSE;

        @pmi0("close_exit")
        public static final ClickType CLOSE_EXIT;

        @pmi0("download")
        public static final ClickType DOWNLOAD;

        @pmi0("vk_video_enter")
        public static final ClickType VK_VIDEO_ENTER;

        static {
            ClickType clickType = new ClickType("DOWNLOAD", 0);
            DOWNLOAD = clickType;
            ClickType clickType2 = new ClickType("VK_VIDEO_ENTER", 1);
            VK_VIDEO_ENTER = clickType2;
            ClickType clickType3 = new ClickType("CLOSE_EXIT", 2);
            CLOSE_EXIT = clickType3;
            ClickType clickType4 = new ClickType("CLOSE", 3);
            CLOSE = clickType4;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class TypeRestriction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeRestriction[] $VALUES;

        @pmi0("type_background_watching")
        public static final TypeRestriction TYPE_BACKGROUND_WATCHING;

        @pmi0("type_download")
        public static final TypeRestriction TYPE_DOWNLOAD;

        @pmi0("type_usp")
        public static final TypeRestriction TYPE_USP;

        static {
            TypeRestriction typeRestriction = new TypeRestriction("TYPE_BACKGROUND_WATCHING", 0);
            TYPE_BACKGROUND_WATCHING = typeRestriction;
            TypeRestriction typeRestriction2 = new TypeRestriction("TYPE_DOWNLOAD", 1);
            TYPE_DOWNLOAD = typeRestriction2;
            TypeRestriction typeRestriction3 = new TypeRestriction("TYPE_USP", 2);
            TYPE_USP = typeRestriction3;
            TypeRestriction[] typeRestrictionArr = {typeRestriction, typeRestriction2, typeRestriction3};
            $VALUES = typeRestrictionArr;
            $ENTRIES = new asp(typeRestrictionArr);
        }

        private TypeRestriction(String str, int i) {
        }

        public static TypeRestriction valueOf(String str) {
            return (TypeRestriction) Enum.valueOf(TypeRestriction.class, str);
        }

        public static TypeRestriction[] values() {
            return (TypeRestriction[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem(ClickType clickType, TypeRestriction typeRestriction) {
        this.clickType = clickType;
        this.typeRestriction = typeRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem = (MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem) obj;
        return this.clickType == mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.clickType && this.typeRestriction == mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.typeRestriction;
    }

    public final int hashCode() {
        return this.typeRestriction.hashCode() + (this.clickType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoRestrictionClickItem(clickType=" + this.clickType + ", typeRestriction=" + this.typeRestriction + ')';
    }
}
