package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem {

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("checklist")
        public static final Source CHECKLIST;

        @pmi0(X3.i.Z)
        public static final Source MAIN;

        @pmi0("wizard")
        public static final Source WIZARD;

        static {
            Source source = new Source("MAIN", 0);
            MAIN = source;
            Source source2 = new Source("WIZARD", 1);
            WIZARD = source2;
            Source source3 = new Source("CHECKLIST", 2);
            CHECKLIST = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem(Source source) {
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem) && this.source == ((CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem) obj).source;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "TypeCommunityOnboardingInvitationFriendsViewItem(source=" + this.source + ')';
    }
}
