package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapStatusEventItem implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("tap_event")
    private final CommonAudioStat$AudioDomainTapEvent tapEvent;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("off")
        public static final Type OFF;

        @pmi0("on")
        public static final Type ON;

        static {
            Type type = new Type("ON", 0);
            ON = type;
            Type type2 = new Type("OFF", 1);
            OFF = type2;
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

    public CommonAudioStat$TypeAudioTapStatusEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent, Type type) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.tapEvent = commonAudioStat$AudioDomainTapEvent;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapStatusEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapStatusEventItem commonAudioStat$TypeAudioTapStatusEventItem = (CommonAudioStat$TypeAudioTapStatusEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapStatusEventItem.event) && epx.f(this.tapEvent, commonAudioStat$TypeAudioTapStatusEventItem.tapEvent) && this.type == commonAudioStat$TypeAudioTapStatusEventItem.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + ((this.tapEvent.hashCode() + (this.event.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeAudioTapStatusEventItem(event=" + this.event + ", tapEvent=" + this.tapEvent + ", type=" + this.type + ')';
    }
}
