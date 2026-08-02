package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsOpenVkoItem {

    @pmi0("category_id")
    private final String categoryId;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("tab_name")
    private final TabName tabName;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("utm_campaign")
    private final String utmCampaign;

    @pmi0("utm_content")
    private final String utmContent;

    @pmi0("utm_medium")
    private final String utmMedium;

    @pmi0("utm_source")
    private final String utmSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class TabName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabName[] $VALUES;

        @pmi0("open_vko")
        public static final TabName OPEN_VKO;

        @pmi0("open_vko_faves")
        public static final TabName OPEN_VKO_FAVES;

        @pmi0("open_vko_my_items")
        public static final TabName OPEN_VKO_MY_ITEMS;

        static {
            TabName tabName = new TabName("OPEN_VKO", 0);
            OPEN_VKO = tabName;
            TabName tabName2 = new TabName("OPEN_VKO_MY_ITEMS", 1);
            OPEN_VKO_MY_ITEMS = tabName2;
            TabName tabName3 = new TabName("OPEN_VKO_FAVES", 2);
            OPEN_VKO_FAVES = tabName3;
            TabName[] tabNameArr = {tabName, tabName2, tabName3};
            $VALUES = tabNameArr;
            $ENTRIES = new asp(tabNameArr);
        }

        private TabName(String str, int i) {
        }

        public static TabName valueOf(String str) {
            return (TabName) Enum.valueOf(TabName.class, str);
        }

        public static TabName[] values() {
            return (TabName[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsOpenVkoItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsOpenVkoItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsOpenVkoItem schemeStat$TypeClassifiedsOpenVkoItem = (SchemeStat$TypeClassifiedsOpenVkoItem) obj;
        return this.tabName == schemeStat$TypeClassifiedsOpenVkoItem.tabName && epx.f(this.utmSource, schemeStat$TypeClassifiedsOpenVkoItem.utmSource) && epx.f(this.utmMedium, schemeStat$TypeClassifiedsOpenVkoItem.utmMedium) && epx.f(this.utmContent, schemeStat$TypeClassifiedsOpenVkoItem.utmContent) && epx.f(this.utmCampaign, schemeStat$TypeClassifiedsOpenVkoItem.utmCampaign) && epx.f(this.categoryId, schemeStat$TypeClassifiedsOpenVkoItem.categoryId) && epx.f(this.searchId, schemeStat$TypeClassifiedsOpenVkoItem.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsOpenVkoItem.trackCode);
    }

    public final int hashCode() {
        TabName tabName = this.tabName;
        int hashCode = (tabName == null ? 0 : tabName.hashCode()) * 31;
        String str = this.utmSource;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.utmMedium;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.utmContent;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.utmCampaign;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.categoryId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.searchId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.trackCode;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsOpenVkoItem(tabName=");
        sb.append(this.tabName);
        sb.append(", utmSource=");
        sb.append(this.utmSource);
        sb.append(", utmMedium=");
        sb.append(this.utmMedium);
        sb.append(", utmContent=");
        sb.append(this.utmContent);
        sb.append(", utmCampaign=");
        sb.append(this.utmCampaign);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public SchemeStat$TypeClassifiedsOpenVkoItem(TabName tabName, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.tabName = tabName;
        this.utmSource = str;
        this.utmMedium = str2;
        this.utmContent = str3;
        this.utmCampaign = str4;
        this.categoryId = str5;
        this.searchId = str6;
        this.trackCode = str7;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsOpenVkoItem(TabName tabName, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : tabName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
