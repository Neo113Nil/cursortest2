package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$AudioListeningStopEvent implements CommonAudioStat$AudioListeningEvent.a {

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

        @pmi0("adv")
        public static final Subtype ADV;

        @pmi0("autoplay")
        public static final Subtype AUTOPLAY;

        @pmi0("change_source")
        public static final Subtype CHANGE_SOURCE;

        @pmi0("client_restore")
        public static final Subtype CLIENT_RESTORE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Subtype CLOSE;

        @pmi0("error")
        public static final Subtype ERROR;

        @pmi0("next")
        public static final Subtype NEXT;

        @pmi0("next_double_tap")
        public static final Subtype NEXT_DOUBLE_TAP;

        @pmi0("pause_btn")
        public static final Subtype PAUSE_BTN;

        @pmi0("pause_by_system")
        public static final Subtype PAUSE_BY_SYSTEM;

        @pmi0("paywall_pause")
        public static final Subtype PAYWALL_PAUSE;

        @pmi0("prev")
        public static final Subtype PREV;

        @pmi0("prev_double_tap")
        public static final Subtype PREV_DOUBLE_TAP;

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

        @pmi0("session_terminated")
        public static final Subtype SESSION_TERMINATED;

        @pmi0("unhandled_on_client")
        public static final Subtype UNHANDLED_ON_CLIENT;

        @pmi0("voice")
        public static final Subtype VOICE;

        static {
            Subtype subtype = new Subtype("PAUSE_BTN", 0);
            PAUSE_BTN = subtype;
            Subtype subtype2 = new Subtype("SESSION_TERMINATED", 1);
            SESSION_TERMINATED = subtype2;
            Subtype subtype3 = new Subtype("PULL_SLIDER_FORWARD", 2);
            PULL_SLIDER_FORWARD = subtype3;
            Subtype subtype4 = new Subtype("PULL_SLIDER_BACK", 3);
            PULL_SLIDER_BACK = subtype4;
            Subtype subtype5 = new Subtype("SEEK_TAP_FORWARD", 4);
            SEEK_TAP_FORWARD = subtype5;
            Subtype subtype6 = new Subtype("SEEK_TAP_BACK", 5);
            SEEK_TAP_BACK = subtype6;
            Subtype subtype7 = new Subtype("NEXT_DOUBLE_TAP", 6);
            NEXT_DOUBLE_TAP = subtype7;
            Subtype subtype8 = new Subtype("PREV_DOUBLE_TAP", 7);
            PREV_DOUBLE_TAP = subtype8;
            Subtype subtype9 = new Subtype("ERROR", 8);
            ERROR = subtype9;
            Subtype subtype10 = new Subtype("NEXT", 9);
            NEXT = subtype10;
            Subtype subtype11 = new Subtype("PREV", 10);
            PREV = subtype11;
            Subtype subtype12 = new Subtype("AUTOPLAY", 11);
            AUTOPLAY = subtype12;
            Subtype subtype13 = new Subtype("ADV", 12);
            ADV = subtype13;
            Subtype subtype14 = new Subtype("REPEAT", 13);
            REPEAT = subtype14;
            Subtype subtype15 = new Subtype("CHANGE_SOURCE", 14);
            CHANGE_SOURCE = subtype15;
            Subtype subtype16 = new Subtype("CLOSE", 15);
            CLOSE = subtype16;
            Subtype subtype17 = new Subtype("UNHANDLED_ON_CLIENT", 16);
            UNHANDLED_ON_CLIENT = subtype17;
            Subtype subtype18 = new Subtype("PAUSE_BY_SYSTEM", 17);
            PAUSE_BY_SYSTEM = subtype18;
            Subtype subtype19 = new Subtype("VOICE", 18);
            VOICE = subtype19;
            Subtype subtype20 = new Subtype("PAYWALL_PAUSE", 19);
            PAYWALL_PAUSE = subtype20;
            Subtype subtype21 = new Subtype("CLIENT_RESTORE", 20);
            CLIENT_RESTORE = subtype21;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9, subtype10, subtype11, subtype12, subtype13, subtype14, subtype15, subtype16, subtype17, subtype18, subtype19, subtype20, subtype21};
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

        @pmi0(TtmlNode.END)
        public static final Type END;

        @pmi0("pause")
        public static final Type PAUSE;

        static {
            Type type = new Type("PAUSE", 0);
            PAUSE = type;
            Type type2 = new Type("END", 1);
            END = type2;
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

    public CommonAudioStat$AudioListeningStopEvent(Type type, Subtype subtype) {
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
        if (!(obj instanceof CommonAudioStat$AudioListeningStopEvent)) {
            return false;
        }
        CommonAudioStat$AudioListeningStopEvent commonAudioStat$AudioListeningStopEvent = (CommonAudioStat$AudioListeningStopEvent) obj;
        return this.type == commonAudioStat$AudioListeningStopEvent.type && this.subtype == commonAudioStat$AudioListeningStopEvent.subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AudioListeningStopEvent(type=" + this.type + ", subtype=" + this.subtype + ')';
    }
}
