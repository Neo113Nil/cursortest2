package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeSuggestsItem {

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0("source")
    private final Source source;

    @pmi0("suggests")
    private final List<MobileOfficialAppsMarusiaStat$TypeSuggest> suggests;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("backend")
        public static final Source BACKEND;

        @pmi0("commands")
        public static final Source COMMANDS;

        @pmi0("last_message_commands")
        public static final Source LAST_MESSAGE_COMMANDS;

        @pmi0("longpoll")
        public static final Source LONGPOLL;

        static {
            Source source = new Source("BACKEND", 0);
            BACKEND = source;
            Source source2 = new Source("COMMANDS", 1);
            COMMANDS = source2;
            Source source3 = new Source("LAST_MESSAGE_COMMANDS", 2);
            LAST_MESSAGE_COMMANDS = source3;
            Source source4 = new Source("LONGPOLL", 3);
            LONGPOLL = source4;
            Source[] sourceArr = {source, source2, source3, source4};
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

    public MobileOfficialAppsMarusiaStat$TypeSuggestsItem(List<MobileOfficialAppsMarusiaStat$TypeSuggest> list, Integer num, Source source) {
        this.suggests = list;
        this.actionIndex = num;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeSuggestsItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeSuggestsItem mobileOfficialAppsMarusiaStat$TypeSuggestsItem = (MobileOfficialAppsMarusiaStat$TypeSuggestsItem) obj;
        return epx.f(this.suggests, mobileOfficialAppsMarusiaStat$TypeSuggestsItem.suggests) && epx.f(this.actionIndex, mobileOfficialAppsMarusiaStat$TypeSuggestsItem.actionIndex) && this.source == mobileOfficialAppsMarusiaStat$TypeSuggestsItem.source;
    }

    public final int hashCode() {
        int hashCode = this.suggests.hashCode() * 31;
        Integer num = this.actionIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Source source = this.source;
        return hashCode2 + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSuggestsItem(suggests=" + this.suggests + ", actionIndex=" + this.actionIndex + ", source=" + this.source + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeSuggestsItem(List list, Integer num, Source source, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : source);
    }
}
