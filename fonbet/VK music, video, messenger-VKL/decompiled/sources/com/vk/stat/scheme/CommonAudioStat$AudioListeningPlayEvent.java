package com.vk.stat.scheme;

import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$AudioListeningPlayEvent implements CommonAudioStat$AudioListeningEvent.a {

    @pmi0("subtype")
    private final Subtype subtype;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("autoplay")
        public static final Subtype AUTOPLAY;

        @pmi0("autoplay_error")
        public static final Subtype AUTOPLAY_ERROR;

        @pmi0("fastplay")
        public static final Subtype FASTPLAY;

        @pmi0("fastplay_audio_btn")
        public static final Subtype FASTPLAY_AUDIO_BTN;

        @pmi0("fastplay_list_btn")
        public static final Subtype FASTPLAY_LIST_BTN;

        @pmi0("heartbeat")
        public static final Subtype HEARTBEAT;

        @pmi0("mix_and_play_btn")
        public static final Subtype MIX_AND_PLAY_BTN;

        @pmi0("next_btn")
        public static final Subtype NEXT_BTN;

        @pmi0("next_by_system")
        public static final Subtype NEXT_BY_SYSTEM;

        @pmi0("next_double_tap")
        public static final Subtype NEXT_DOUBLE_TAP;

        @pmi0("next_voice")
        public static final Subtype NEXT_VOICE;

        @pmi0("paywall_pause")
        public static final Subtype PAYWALL_PAUSE;

        @pmi0("play_btn")
        public static final Subtype PLAY_BTN;

        @pmi0("prev_btn")
        public static final Subtype PREV_BTN;

        @pmi0("prev_by_system")
        public static final Subtype PREV_BY_SYSTEM;

        @pmi0("prev_double_tap")
        public static final Subtype PREV_DOUBLE_TAP;

        @pmi0("prev_voice")
        public static final Subtype PREV_VOICE;

        @pmi0("pull_slider_back")
        public static final Subtype PULL_SLIDER_BACK;

        @pmi0("pull_slider_forward")
        public static final Subtype PULL_SLIDER_FORWARD;

        @pmi0("repeat")
        public static final Subtype REPEAT;

        @pmi0("seek_tap_back")
        public static final Subtype SEEK_TAP_BACK;

        @pmi0("seek_tap_forward")
        public static final Subtype SEEK_TAP_FORWARD;

        @pmi0("session_terminated_autostart")
        public static final Subtype SESSION_TERMINATED_AUTOSTART;

        @pmi0("unhandled_on_client")
        public static final Subtype UNHANDLED_ON_CLIENT;

        @pmi0("voice")
        public static final Subtype VOICE;

        static {
            Subtype subtype = new Subtype("PLAY_BTN", 0);
            PLAY_BTN = subtype;
            Subtype subtype2 = new Subtype("FASTPLAY", 1);
            FASTPLAY = subtype2;
            Subtype subtype3 = new Subtype("FASTPLAY_LIST_BTN", 2);
            FASTPLAY_LIST_BTN = subtype3;
            Subtype subtype4 = new Subtype("FASTPLAY_AUDIO_BTN", 3);
            FASTPLAY_AUDIO_BTN = subtype4;
            Subtype subtype5 = new Subtype("AUTOPLAY", 4);
            AUTOPLAY = subtype5;
            Subtype subtype6 = new Subtype("AUTOPLAY_ERROR", 5);
            AUTOPLAY_ERROR = subtype6;
            Subtype subtype7 = new Subtype("REPEAT", 6);
            REPEAT = subtype7;
            Subtype subtype8 = new Subtype("VOICE", 7);
            VOICE = subtype8;
            Subtype subtype9 = new Subtype("MIX_AND_PLAY_BTN", 8);
            MIX_AND_PLAY_BTN = subtype9;
            Subtype subtype10 = new Subtype("NEXT_VOICE", 9);
            NEXT_VOICE = subtype10;
            Subtype subtype11 = new Subtype("PREV_VOICE", 10);
            PREV_VOICE = subtype11;
            Subtype subtype12 = new Subtype("NEXT_BTN", 11);
            NEXT_BTN = subtype12;
            Subtype subtype13 = new Subtype("PREV_BTN", 12);
            PREV_BTN = subtype13;
            Subtype subtype14 = new Subtype("PULL_SLIDER_FORWARD", 13);
            PULL_SLIDER_FORWARD = subtype14;
            Subtype subtype15 = new Subtype("PULL_SLIDER_BACK", 14);
            PULL_SLIDER_BACK = subtype15;
            Subtype subtype16 = new Subtype("SEEK_TAP_FORWARD", 15);
            SEEK_TAP_FORWARD = subtype16;
            Subtype subtype17 = new Subtype("SEEK_TAP_BACK", 16);
            SEEK_TAP_BACK = subtype17;
            Subtype subtype18 = new Subtype("NEXT_DOUBLE_TAP", 17);
            NEXT_DOUBLE_TAP = subtype18;
            Subtype subtype19 = new Subtype("PREV_DOUBLE_TAP", 18);
            PREV_DOUBLE_TAP = subtype19;
            Subtype subtype20 = new Subtype("HEARTBEAT", 19);
            HEARTBEAT = subtype20;
            Subtype subtype21 = new Subtype("SESSION_TERMINATED_AUTOSTART", 20);
            SESSION_TERMINATED_AUTOSTART = subtype21;
            Subtype subtype22 = new Subtype("UNHANDLED_ON_CLIENT", 21);
            UNHANDLED_ON_CLIENT = subtype22;
            Subtype subtype23 = new Subtype("NEXT_BY_SYSTEM", 22);
            NEXT_BY_SYSTEM = subtype23;
            Subtype subtype24 = new Subtype("PREV_BY_SYSTEM", 23);
            PREV_BY_SYSTEM = subtype24;
            Subtype subtype25 = new Subtype("PAYWALL_PAUSE", 24);
            PAYWALL_PAUSE = subtype25;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10, subtype11, subtype12, subtype13, subtype14, subtype15, subtype16, subtype17, subtype18, subtype19, subtype20, subtype21, subtype22, subtype23, subtype24, subtype25};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("start")
        public static final Type START;

        static {
            Type type = new Type("START", 0);
            START = type;
            Type[] typeArr = {type};
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

    public CommonAudioStat$AudioListeningPlayEvent(Type type, Subtype subtype) {
        this.type = type;
        this.subtype = subtype;
    }

    public final Subtype a() {
        return this.subtype;
    }

    public final Type b() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$AudioListeningPlayEvent)) {
            return false;
        }
        CommonAudioStat$AudioListeningPlayEvent commonAudioStat$AudioListeningPlayEvent = (CommonAudioStat$AudioListeningPlayEvent) obj;
        return this.type == commonAudioStat$AudioListeningPlayEvent.type && this.subtype == commonAudioStat$AudioListeningPlayEvent.subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AudioListeningPlayEvent(type=" + this.type + ", subtype=" + this.subtype + ')';
    }
}
