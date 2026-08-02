package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeUndoRedo implements MobileOfficialAppsClipsStat$TypeClipEditorItem.a {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("add_fragment")
        public static final EventSubtype ADD_FRAGMENT;

        @pmi0("add_music")
        public static final EventSubtype ADD_MUSIC;

        @pmi0("aspect_ratio")
        public static final EventSubtype ASPECT_RATIO;

        @pmi0("audio_effect")
        public static final EventSubtype AUDIO_EFFECT;

        @pmi0("audio_volume")
        public static final EventSubtype AUDIO_VOLUME;

        @pmi0("change_music")
        public static final EventSubtype CHANGE_MUSIC;

        @pmi0("change_volume")
        public static final EventSubtype CHANGE_VOLUME;

        @pmi0("color_correction")
        public static final EventSubtype COLOR_CORRECTION;

        @pmi0("crop")
        public static final EventSubtype CROP;

        @pmi0("deepfake")
        public static final EventSubtype DEEPFAKE;

        @pmi0("double")
        public static final EventSubtype DOUBLE;

        @pmi0("edit_attachment")
        public static final EventSubtype EDIT_ATTACHMENT;

        @pmi0("edit_audio_offset")
        public static final EventSubtype EDIT_AUDIO_OFFSET;

        @pmi0("edit_music")
        public static final EventSubtype EDIT_MUSIC;

        @pmi0("fragment_duration")
        public static final EventSubtype FRAGMENT_DURATION;

        @pmi0("mute")
        public static final EventSubtype MUTE;

        @pmi0("remove_fragment")
        public static final EventSubtype REMOVE_FRAGMENT;

        @pmi0("remove_music")
        public static final EventSubtype REMOVE_MUSIC;

        @pmi0("reverse")
        public static final EventSubtype REVERSE;

        @pmi0("speed")
        public static final EventSubtype SPEED;

        @pmi0("split")
        public static final EventSubtype SPLIT;

        @pmi0("sticker")
        public static final EventSubtype STICKER;

        @pmi0("swap")
        public static final EventSubtype SWAP;

        @pmi0("text")
        public static final EventSubtype TEXT;

        @pmi0("video_transformation")
        public static final EventSubtype VIDEO_TRANSFORMATION;

        @pmi0("voiceover")
        public static final EventSubtype VOICEOVER;

        static {
            EventSubtype eventSubtype = new EventSubtype("TEXT", 0);
            TEXT = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("STICKER", 1);
            STICKER = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("ADD_MUSIC", 2);
            ADD_MUSIC = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("REMOVE_MUSIC", 3);
            REMOVE_MUSIC = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("EDIT_MUSIC", 4);
            EDIT_MUSIC = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 5);
            MUTE = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("ADD_FRAGMENT", 6);
            ADD_FRAGMENT = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("REMOVE_FRAGMENT", 7);
            REMOVE_FRAGMENT = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("CHANGE_MUSIC", 8);
            CHANGE_MUSIC = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("AUDIO_VOLUME", 9);
            AUDIO_VOLUME = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("CROP", 10);
            CROP = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("EDIT_AUDIO_OFFSET", 11);
            EDIT_AUDIO_OFFSET = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("AUDIO_EFFECT", 12);
            AUDIO_EFFECT = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("CHANGE_VOLUME", 13);
            CHANGE_VOLUME = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("DEEPFAKE", 14);
            DEEPFAKE = eventSubtype15;
            EventSubtype eventSubtype16 = new EventSubtype("COLOR_CORRECTION", 15);
            COLOR_CORRECTION = eventSubtype16;
            EventSubtype eventSubtype17 = new EventSubtype("EDIT_ATTACHMENT", 16);
            EDIT_ATTACHMENT = eventSubtype17;
            EventSubtype eventSubtype18 = new EventSubtype("DOUBLE", 17);
            DOUBLE = eventSubtype18;
            EventSubtype eventSubtype19 = new EventSubtype("SPLIT", 18);
            SPLIT = eventSubtype19;
            EventSubtype eventSubtype20 = new EventSubtype("REVERSE", 19);
            REVERSE = eventSubtype20;
            EventSubtype eventSubtype21 = new EventSubtype("SWAP", 20);
            SWAP = eventSubtype21;
            EventSubtype eventSubtype22 = new EventSubtype("FRAGMENT_DURATION", 21);
            FRAGMENT_DURATION = eventSubtype22;
            EventSubtype eventSubtype23 = new EventSubtype("VIDEO_TRANSFORMATION", 22);
            VIDEO_TRANSFORMATION = eventSubtype23;
            EventSubtype eventSubtype24 = new EventSubtype("SPEED", 23);
            SPEED = eventSubtype24;
            EventSubtype eventSubtype25 = new EventSubtype("ASPECT_RATIO", 24);
            ASPECT_RATIO = eventSubtype25;
            EventSubtype eventSubtype26 = new EventSubtype("VOICEOVER", 25);
            VOICEOVER = eventSubtype26;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15, eventSubtype16, eventSubtype17, eventSubtype18, eventSubtype19, eventSubtype20, eventSubtype21, eventSubtype22, eventSubtype23, eventSubtype24, eventSubtype25, eventSubtype26};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("redo")
        public static final EventType REDO;

        @pmi0("undo")
        public static final EventType UNDO;

        static {
            EventType eventType = new EventType("UNDO", 0);
            UNDO = eventType;
            EventType eventType2 = new EventType("REDO", 1);
            REDO = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeUndoRedo(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeUndoRedo)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeUndoRedo mobileOfficialAppsClipsStat$TypeUndoRedo = (MobileOfficialAppsClipsStat$TypeUndoRedo) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeUndoRedo.eventType && this.eventSubtype == mobileOfficialAppsClipsStat$TypeUndoRedo.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeUndoRedo(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeUndoRedo(EventType eventType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype);
    }
}
