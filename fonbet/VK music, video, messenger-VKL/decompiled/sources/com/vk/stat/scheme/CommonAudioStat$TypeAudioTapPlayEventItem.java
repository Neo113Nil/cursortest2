package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapPlayEventItem implements SchemeStat$TypeAction.b {

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

        @pmi0("longtap")
        public static final Type LONGTAP;

        @pmi0("shuffle")
        public static final Type SHUFFLE;

        @pmi0("start")
        public static final Type START;

        static {
            Type type = new Type("START", 0);
            START = type;
            Type type2 = new Type("SHUFFLE", 1);
            SHUFFLE = type2;
            Type type3 = new Type("LONGTAP", 2);
            LONGTAP = type3;
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

    public CommonAudioStat$TypeAudioTapPlayEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, Type type) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapPlayEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem = (CommonAudioStat$TypeAudioTapPlayEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapPlayEventItem.event) && this.type == commonAudioStat$TypeAudioTapPlayEventItem.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTapPlayEventItem(event=" + this.event + ", type=" + this.type + ')';
    }
}
