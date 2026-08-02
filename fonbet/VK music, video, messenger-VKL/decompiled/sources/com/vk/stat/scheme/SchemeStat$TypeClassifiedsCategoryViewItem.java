package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsCategoryViewItem {

    @pmi0("category_id")
    private final int categoryId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("section")
    private final Section section;

    @pmi0("size")
    private final Integer size;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

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

        @pmi0("classifieds_subscription")
        public static final Section CLASSIFIEDS_SUBSCRIPTION;

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
            Section section9 = new Section("CLASSIFIEDS_SUBSCRIPTION", 8);
            CLASSIFIEDS_SUBSCRIPTION = section9;
            Section[] sectionArr = {section, section2, section3, section4, section5, section6, section7, section8, section9};
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

    public SchemeStat$TypeClassifiedsCategoryViewItem(long j, int i, Integer num, Section section, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.ownerId = j;
        this.categoryId = i;
        this.size = num;
        this.section = section;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsCategoryViewItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem = (SchemeStat$TypeClassifiedsCategoryViewItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsCategoryViewItem.ownerId && this.categoryId == schemeStat$TypeClassifiedsCategoryViewItem.categoryId && epx.f(this.size, schemeStat$TypeClassifiedsCategoryViewItem.size) && this.section == schemeStat$TypeClassifiedsCategoryViewItem.section && this.sourceScreen == schemeStat$TypeClassifiedsCategoryViewItem.sourceScreen;
    }

    public final int hashCode() {
        int a = shy.a(this.categoryId, Long.hashCode(this.ownerId) * 31, 31);
        Integer num = this.size;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Section section = this.section;
        int hashCode2 = (hashCode + (section == null ? 0 : section.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        return hashCode2 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsCategoryViewItem(ownerId=" + this.ownerId + ", categoryId=" + this.categoryId + ", size=" + this.size + ", section=" + this.section + ", sourceScreen=" + this.sourceScreen + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsCategoryViewItem(long j, int i, Integer num, Section section, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : section, (i2 & 16) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
