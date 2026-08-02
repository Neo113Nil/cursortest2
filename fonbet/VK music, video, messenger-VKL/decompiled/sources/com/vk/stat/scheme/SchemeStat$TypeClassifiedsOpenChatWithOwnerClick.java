package com.vk.stat.scheme;

import com.android.billingclient.api.BillingClient;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsOpenChatWithOwnerClick {

    @pmi0("classified_id")
    private final String classifiedId;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final SchemeStat$TypeClassifiedsContentItem content;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("section")
    private final Section section;

    @pmi0("size")
    private final Integer size;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Section {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;

        @pmi0("anticlassifieds_update")
        public static final Section ANTICLASSIFIEDS_UPDATE;

        @pmi0("classified")
        public static final Section CLASSIFIED;

        @pmi0("classified_category")
        public static final Section CLASSIFIED_CATEGORY;

        @pmi0("main_section")
        public static final Section MAIN_SECTION;

        @pmi0("recommendations")
        public static final Section RECOMMENDATIONS;

        @pmi0("side_block")
        public static final Section SIDE_BLOCK;

        @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
        public static final Section SUBSCRIPTIONS;

        static {
            Section section = new Section("RECOMMENDATIONS", 0);
            RECOMMENDATIONS = section;
            Section section2 = new Section("SUBSCRIPTIONS", 1);
            SUBSCRIPTIONS = section2;
            Section section3 = new Section("CLASSIFIED_CATEGORY", 2);
            CLASSIFIED_CATEGORY = section3;
            Section section4 = new Section("ANTICLASSIFIEDS_UPDATE", 3);
            ANTICLASSIFIEDS_UPDATE = section4;
            Section section5 = new Section("MAIN_SECTION", 4);
            MAIN_SECTION = section5;
            Section section6 = new Section("CLASSIFIED", 5);
            CLASSIFIED = section6;
            Section section7 = new Section("SIDE_BLOCK", 6);
            SIDE_BLOCK = section7;
            Section[] sectionArr = {section, section2, section3, section4, section5, section6, section7};
            $VALUES = sectionArr;
            $ENTRIES = new asp(sectionArr);
        }

        private Section(String str, int i) {
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsOpenChatWithOwnerClick(String str, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, String str2, String str3, Section section, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num) {
        this.classifiedId = str;
        this.content = schemeStat$TypeClassifiedsContentItem;
        this.searchId = str2;
        this.trackCode = str3;
        this.section = section;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.size = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsOpenChatWithOwnerClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsOpenChatWithOwnerClick schemeStat$TypeClassifiedsOpenChatWithOwnerClick = (SchemeStat$TypeClassifiedsOpenChatWithOwnerClick) obj;
        return epx.f(this.classifiedId, schemeStat$TypeClassifiedsOpenChatWithOwnerClick.classifiedId) && epx.f(this.content, schemeStat$TypeClassifiedsOpenChatWithOwnerClick.content) && epx.f(this.searchId, schemeStat$TypeClassifiedsOpenChatWithOwnerClick.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsOpenChatWithOwnerClick.trackCode) && this.section == schemeStat$TypeClassifiedsOpenChatWithOwnerClick.section && this.sourceScreen == schemeStat$TypeClassifiedsOpenChatWithOwnerClick.sourceScreen && epx.f(this.size, schemeStat$TypeClassifiedsOpenChatWithOwnerClick.size);
    }

    public final int hashCode() {
        int hashCode = this.classifiedId.hashCode() * 31;
        SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem = this.content;
        int hashCode2 = (hashCode + (schemeStat$TypeClassifiedsContentItem == null ? 0 : schemeStat$TypeClassifiedsContentItem.hashCode())) * 31;
        String str = this.searchId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Section section = this.section;
        int hashCode5 = (hashCode4 + (section == null ? 0 : section.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        Integer num = this.size;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsOpenChatWithOwnerClick(classifiedId=");
        sb.append(this.classifiedId);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", sourceScreen=");
        sb.append(this.sourceScreen);
        sb.append(", size=");
        return uqi.b(sb, this.size, ')');
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsOpenChatWithOwnerClick(String str, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, String str2, String str3, Section section, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : schemeStat$TypeClassifiedsContentItem, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : section, (i & 32) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 64) != 0 ? null : num);
    }
}
