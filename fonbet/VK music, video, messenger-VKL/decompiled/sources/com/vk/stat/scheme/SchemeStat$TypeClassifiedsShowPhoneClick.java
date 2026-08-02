package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsShowPhoneClick {

    @pmi0("classified_id")
    private final String classifiedId;

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("section")
    private final Section section;

    @pmi0("source_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen sourceScreen;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("wallitem_id")
    private final String wallitemId;

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

        @pmi0("main_section")
        public static final Section MAIN_SECTION;

        @pmi0("side_block")
        public static final Section SIDE_BLOCK;

        static {
            Section section = new Section("ANTICLASSIFIEDS_UPDATE", 0);
            ANTICLASSIFIEDS_UPDATE = section;
            Section section2 = new Section("MAIN_SECTION", 1);
            MAIN_SECTION = section2;
            Section section3 = new Section("CLASSIFIED", 2);
            CLASSIFIED = section3;
            Section section4 = new Section("SIDE_BLOCK", 3);
            SIDE_BLOCK = section4;
            Section[] sectionArr = {section, section2, section3, section4};
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

    public SchemeStat$TypeClassifiedsShowPhoneClick(String str, long j, Long l, String str2, Section section, String str3, String str4, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.classifiedId = str;
        this.ownerId = j;
        this.itemId = l;
        this.searchId = str2;
        this.section = section;
        this.trackCode = str3;
        this.wallitemId = str4;
        this.sourceScreen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsShowPhoneClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsShowPhoneClick schemeStat$TypeClassifiedsShowPhoneClick = (SchemeStat$TypeClassifiedsShowPhoneClick) obj;
        return epx.f(this.classifiedId, schemeStat$TypeClassifiedsShowPhoneClick.classifiedId) && this.ownerId == schemeStat$TypeClassifiedsShowPhoneClick.ownerId && epx.f(this.itemId, schemeStat$TypeClassifiedsShowPhoneClick.itemId) && epx.f(this.searchId, schemeStat$TypeClassifiedsShowPhoneClick.searchId) && this.section == schemeStat$TypeClassifiedsShowPhoneClick.section && epx.f(this.trackCode, schemeStat$TypeClassifiedsShowPhoneClick.trackCode) && epx.f(this.wallitemId, schemeStat$TypeClassifiedsShowPhoneClick.wallitemId) && this.sourceScreen == schemeStat$TypeClassifiedsShowPhoneClick.sourceScreen;
    }

    public final int hashCode() {
        int a = bh10.a(this.classifiedId.hashCode() * 31, 31, this.ownerId);
        Long l = this.itemId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.searchId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Section section = this.section;
        int hashCode3 = (hashCode2 + (section == null ? 0 : section.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wallitemId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.sourceScreen;
        return hashCode5 + (mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsShowPhoneClick(classifiedId=" + this.classifiedId + ", ownerId=" + this.ownerId + ", itemId=" + this.itemId + ", searchId=" + this.searchId + ", section=" + this.section + ", trackCode=" + this.trackCode + ", wallitemId=" + this.wallitemId + ", sourceScreen=" + this.sourceScreen + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsShowPhoneClick(String str, long j, Long l, String str2, Section section, String str3, String str4, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i, zcl zclVar) {
        this(str, j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : section, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
