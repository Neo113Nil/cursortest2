package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsCategoryClickItem {

    @pmi0("category_id")
    private final int categoryId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("section")
    private final Section section;

    @pmi0("size")
    private final Integer size;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("url")
    private final String url;

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

    public SchemeStat$TypeClassifiedsCategoryClickItem(long j, int i, Integer num, String str, Section section, String str2, String str3) {
        this.ownerId = j;
        this.categoryId = i;
        this.size = num;
        this.url = str;
        this.section = section;
        this.searchId = str2;
        this.trackCode = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsCategoryClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem = (SchemeStat$TypeClassifiedsCategoryClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsCategoryClickItem.ownerId && this.categoryId == schemeStat$TypeClassifiedsCategoryClickItem.categoryId && epx.f(this.size, schemeStat$TypeClassifiedsCategoryClickItem.size) && epx.f(this.url, schemeStat$TypeClassifiedsCategoryClickItem.url) && this.section == schemeStat$TypeClassifiedsCategoryClickItem.section && epx.f(this.searchId, schemeStat$TypeClassifiedsCategoryClickItem.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsCategoryClickItem.trackCode);
    }

    public final int hashCode() {
        int a = shy.a(this.categoryId, Long.hashCode(this.ownerId) * 31, 31);
        Integer num = this.size;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Section section = this.section;
        int hashCode3 = (hashCode2 + (section == null ? 0 : section.hashCode())) * 31;
        String str2 = this.searchId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsCategoryClickItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsCategoryClickItem(long j, int i, Integer num, String str, Section section, String str2, String str3, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : section, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3);
    }
}
