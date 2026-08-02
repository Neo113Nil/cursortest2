package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$AudioListeningEvent {

    @pmi0("play")
    private final CommonAudioStat$AudioListeningPlayEvent play;

    @pmi0("stop")
    private final CommonAudioStat$AudioListeningStopEvent stop;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("play")
        public static final Type PLAY;

        @pmi0("stop")
        public static final Type STOP;

        static {
            Type type = new Type("PLAY", 0);
            PLAY = type;
            Type type2 = new Type("STOP", 1);
            STOP = type2;
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

    /* compiled from: CommonAudioStat.kt */
    public interface a {
    }

    private CommonAudioStat$AudioListeningEvent(Type type, CommonAudioStat$AudioListeningPlayEvent commonAudioStat$AudioListeningPlayEvent, CommonAudioStat$AudioListeningStopEvent commonAudioStat$AudioListeningStopEvent) {
        this.type = type;
        this.play = commonAudioStat$AudioListeningPlayEvent;
        this.stop = commonAudioStat$AudioListeningStopEvent;
    }

    public final CommonAudioStat$AudioListeningPlayEvent a() {
        return this.play;
    }

    public final CommonAudioStat$AudioListeningStopEvent b() {
        return this.stop;
    }

    public final Type c() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$AudioListeningEvent)) {
            return false;
        }
        CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent = (CommonAudioStat$AudioListeningEvent) obj;
        return this.type == commonAudioStat$AudioListeningEvent.type && epx.f(this.play, commonAudioStat$AudioListeningEvent.play) && epx.f(this.stop, commonAudioStat$AudioListeningEvent.stop);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        CommonAudioStat$AudioListeningPlayEvent commonAudioStat$AudioListeningPlayEvent = this.play;
        int hashCode2 = (hashCode + (commonAudioStat$AudioListeningPlayEvent == null ? 0 : commonAudioStat$AudioListeningPlayEvent.hashCode())) * 31;
        CommonAudioStat$AudioListeningStopEvent commonAudioStat$AudioListeningStopEvent = this.stop;
        return hashCode2 + (commonAudioStat$AudioListeningStopEvent != null ? commonAudioStat$AudioListeningStopEvent.hashCode() : 0);
    }

    public final String toString() {
        return "AudioListeningEvent(type=" + this.type + ", play=" + this.play + ", stop=" + this.stop + ')';
    }

    public /* synthetic */ CommonAudioStat$AudioListeningEvent(Type type, CommonAudioStat$AudioListeningPlayEvent commonAudioStat$AudioListeningPlayEvent, CommonAudioStat$AudioListeningStopEvent commonAudioStat$AudioListeningStopEvent, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : commonAudioStat$AudioListeningPlayEvent, (i & 4) != 0 ? null : commonAudioStat$AudioListeningStopEvent);
    }
}
