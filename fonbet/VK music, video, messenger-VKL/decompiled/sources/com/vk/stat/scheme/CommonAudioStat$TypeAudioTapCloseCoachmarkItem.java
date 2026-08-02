package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapCloseCoachmarkItem implements SchemeStat$TypeAction.b {

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

        @pmi0("exit")
        public static final Type EXIT;

        @pmi0("hide")
        public static final Type HIDE;

        static {
            Type type = new Type("HIDE", 0);
            HIDE = type;
            Type type2 = new Type("EXIT", 1);
            EXIT = type2;
            Type[] typeArr = {type, type2};
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

    public CommonAudioStat$TypeAudioTapCloseCoachmarkItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, Type type) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapCloseCoachmarkItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapCloseCoachmarkItem commonAudioStat$TypeAudioTapCloseCoachmarkItem = (CommonAudioStat$TypeAudioTapCloseCoachmarkItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapCloseCoachmarkItem.event) && this.type == commonAudioStat$TypeAudioTapCloseCoachmarkItem.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTapCloseCoachmarkItem(event=" + this.event + ", type=" + this.type + ')';
    }
}
