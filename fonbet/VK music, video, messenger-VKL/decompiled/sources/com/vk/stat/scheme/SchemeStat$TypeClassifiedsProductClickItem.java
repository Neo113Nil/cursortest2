package com.vk.stat.scheme;

import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsProductClickItem {

    @pmi0("classified_id")
    private final String classifiedId;

    @pmi0("classified_url")
    private final String classifiedUrl;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final SchemeStat$TypeClassifiedsContentItem content;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("section")
    private final Section section;

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

        @pmi0("classified_category_bar")
        public static final Section CLASSIFIED_CATEGORY_BAR;

        @pmi0("main_category")
        public static final Section MAIN_CATEGORY;

        @pmi0("main_empty")
        public static final Section MAIN_EMPTY;

        @pmi0("main_section")
        public static final Section MAIN_SECTION;

        @pmi0("side_block")
        public static final Section SIDE_BLOCK;

        static {
            Section section = new Section("ANTICLASSIFIEDS_UPDATE", 0);
            ANTICLASSIFIEDS_UPDATE = section;
            Section section2 = new Section("MAIN_CATEGORY", 1);
            MAIN_CATEGORY = section2;
            Section section3 = new Section("MAIN_SECTION", 2);
            MAIN_SECTION = section3;
            Section section4 = new Section("MAIN_EMPTY", 3);
            MAIN_EMPTY = section4;
            Section section5 = new Section("CLASSIFIED", 4);
            CLASSIFIED = section5;
            Section section6 = new Section("SIDE_BLOCK", 5);
            SIDE_BLOCK = section6;
            Section section7 = new Section("CLASSIFIED_CATEGORY", 6);
            CLASSIFIED_CATEGORY = section7;
            Section section8 = new Section("CLASSIFIED_CATEGORY_BAR", 7);
            CLASSIFIED_CATEGORY_BAR = section8;
            Section[] sectionArr = {section, section2, section3, section4, section5, section6, section7, section8};
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

    public SchemeStat$TypeClassifiedsProductClickItem() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsProductClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem = (SchemeStat$TypeClassifiedsProductClickItem) obj;
        return epx.f(this.classifiedId, schemeStat$TypeClassifiedsProductClickItem.classifiedId) && epx.f(this.classifiedUrl, schemeStat$TypeClassifiedsProductClickItem.classifiedUrl) && epx.f(this.ownerId, schemeStat$TypeClassifiedsProductClickItem.ownerId) && epx.f(this.content, schemeStat$TypeClassifiedsProductClickItem.content) && this.section == schemeStat$TypeClassifiedsProductClickItem.section && epx.f(this.searchId, schemeStat$TypeClassifiedsProductClickItem.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsProductClickItem.trackCode) && epx.f(this.position, schemeStat$TypeClassifiedsProductClickItem.position) && this.sourceScreen == schemeStat$TypeClassifiedsProductClickItem.sourceScreen;
    }

    public final int hashCode() {
        String str = this.classifiedId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.classifiedUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem = this.content;
        int hashCode4 = (hashCode3 + (schemeStat$TypeClassifiedsContentItem == null ? 0 : schemeStat$TypeClassifiedsContentItem.hashCode())) * 31;
        Section section = this.section;
        int hashCode5 = (hashCode4 + (section == null ? 0 : section.hashCode())) * 31;
        String str3 = this.searchId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.position;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        return hashCode8 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsProductClickItem(classifiedId=" + this.classifiedId + ", classifiedUrl=" + this.classifiedUrl + ", ownerId=" + this.ownerId + ", content=" + this.content + ", section=" + this.section + ", searchId=" + this.searchId + ", trackCode=" + this.trackCode + ", position=" + this.position + ", sourceScreen=" + this.sourceScreen + ')';
    }

    public SchemeStat$TypeClassifiedsProductClickItem(String str, String str2, Long l, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, Section section, String str3, String str4, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.classifiedId = str;
        this.classifiedUrl = str2;
        this.ownerId = l;
        this.content = schemeStat$TypeClassifiedsContentItem;
        this.section = section;
        this.searchId = str3;
        this.trackCode = str4;
        this.position = num;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsProductClickItem(String str, String str2, Long l, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, Section section, String str3, String str4, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : schemeStat$TypeClassifiedsContentItem, (i & 16) != 0 ? null : section, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
