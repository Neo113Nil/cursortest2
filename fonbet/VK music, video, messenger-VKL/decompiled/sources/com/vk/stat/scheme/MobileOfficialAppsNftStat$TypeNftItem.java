package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsNftStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsNftStat$TypeNftItem implements SchemeStat$TypeClick.b {

    @pmi0("source")
    private final Source source;

    @pmi0("type_event_item")
    private final CommonStat$TypeCommonEventItem typeEventItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsNftStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("from_own_profile")
        public static final Source FROM_OWN_PROFILE;

        @pmi0("from_user_collection")
        public static final Source FROM_USER_COLLECTION;

        @pmi0("from_user_profile")
        public static final Source FROM_USER_PROFILE;

        static {
            Source source = new Source("FROM_OWN_PROFILE", 0);
            FROM_OWN_PROFILE = source;
            Source source2 = new Source("FROM_USER_COLLECTION", 1);
            FROM_USER_COLLECTION = source2;
            Source source3 = new Source("FROM_USER_PROFILE", 2);
            FROM_USER_PROFILE = source3;
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

    public MobileOfficialAppsNftStat$TypeNftItem(Source source, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.source = source;
        this.typeEventItem = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsNftStat$TypeNftItem)) {
            return false;
        }
        MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem = (MobileOfficialAppsNftStat$TypeNftItem) obj;
        return this.source == mobileOfficialAppsNftStat$TypeNftItem.source && epx.f(this.typeEventItem, mobileOfficialAppsNftStat$TypeNftItem.typeEventItem);
    }

    public final int hashCode() {
        return this.typeEventItem.hashCode() + (this.source.hashCode() * 31);
    }

    public final String toString() {
        return "TypeNftItem(source=" + this.source + ", typeEventItem=" + this.typeEventItem + ')';
    }
}
