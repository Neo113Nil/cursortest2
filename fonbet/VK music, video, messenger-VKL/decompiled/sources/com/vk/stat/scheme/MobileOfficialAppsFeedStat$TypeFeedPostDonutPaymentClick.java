package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("attachment_background")
        public static final Subtype ATTACHMENT_BACKGROUND;

        @pmi0("attachment_button")
        public static final Subtype ATTACHMENT_BUTTON;

        @pmi0("footer")
        public static final Subtype FOOTER;

        @pmi0("likes_activity")
        public static final Subtype LIKES_ACTIVITY;

        static {
            Subtype subtype = new Subtype("ATTACHMENT_BACKGROUND", 0);
            ATTACHMENT_BACKGROUND = subtype;
            Subtype subtype2 = new Subtype("ATTACHMENT_BUTTON", 1);
            ATTACHMENT_BUTTON = subtype2;
            Subtype subtype3 = new Subtype("LIKES_ACTIVITY", 2);
            LIKES_ACTIVITY = subtype3;
            Subtype subtype4 = new Subtype("FOOTER", 3);
            FOOTER = subtype4;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick) && this.subtype == ((MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostDonutPaymentClick(subtype=" + this.subtype + ')';
    }
}
