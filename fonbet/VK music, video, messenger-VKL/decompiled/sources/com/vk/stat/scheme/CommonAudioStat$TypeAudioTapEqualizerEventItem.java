package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapEqualizerEventItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

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

    public CommonAudioStat$TypeAudioTapEqualizerEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, Type type) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapEqualizerEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem = (CommonAudioStat$TypeAudioTapEqualizerEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapEqualizerEventItem.event) && this.type == commonAudioStat$TypeAudioTapEqualizerEventItem.type;
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        Type type = this.type;
        return hashCode + (type == null ? 0 : type.hashCode());
    }

    public final String toString() {
        return "TypeAudioTapEqualizerEventItem(event=" + this.event + ", type=" + this.type + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioTapEqualizerEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, Type type, int i, zcl zclVar) {
        this(commonAudioStat$TypeAudioDomainEventItem, (i & 2) != 0 ? null : type);
    }
}
