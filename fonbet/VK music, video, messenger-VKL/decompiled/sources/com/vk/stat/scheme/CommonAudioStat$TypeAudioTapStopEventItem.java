package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapStopEventItem implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(TtmlNode.END)
        public static final Type END;

        @pmi0("next")
        public static final Type NEXT;

        @pmi0("prev")
        public static final Type PREV;

        static {
            Type type = new Type("END", 0);
            END = type;
            Type type2 = new Type("NEXT", 1);
            NEXT = type2;
            Type type3 = new Type("PREV", 2);
            PREV = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioTapStopEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, Type type) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapStopEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem = (CommonAudioStat$TypeAudioTapStopEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapStopEventItem.event) && this.type == commonAudioStat$TypeAudioTapStopEventItem.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTapStopEventItem(event=" + this.event + ", type=" + this.type + ')';
    }
}
