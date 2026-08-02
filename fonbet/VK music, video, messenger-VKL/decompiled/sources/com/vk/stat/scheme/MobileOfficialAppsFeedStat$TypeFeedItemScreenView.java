package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedItemScreenView implements SchemeStat$TypeView.b {

    @pmi0("section")
    private final Section section;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Section {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;

        @pmi0("comments")
        public static final Section COMMENTS;

        @pmi0("post")
        public static final Section POST;

        static {
            Section section = new Section("POST", 0);
            POST = section;
            Section section2 = new Section("COMMENTS", 1);
            COMMENTS = section2;
            Section[] sectionArr = {section, section2};
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

    public MobileOfficialAppsFeedStat$TypeFeedItemScreenView(Section section) {
        this.section = section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedItemScreenView) && this.section == ((MobileOfficialAppsFeedStat$TypeFeedItemScreenView) obj).section;
    }

    public final int hashCode() {
        return this.section.hashCode();
    }

    public final String toString() {
        return "TypeFeedItemScreenView(section=" + this.section + ')';
    }
}
