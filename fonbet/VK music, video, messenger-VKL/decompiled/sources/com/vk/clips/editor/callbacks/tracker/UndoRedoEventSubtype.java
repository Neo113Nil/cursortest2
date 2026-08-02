package com.vk.clips.editor.callbacks.tracker;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UndoRedoEventSubtype.kt */
/* loaded from: classes16.dex */
public final class UndoRedoEventSubtype {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UndoRedoEventSubtype[] $VALUES;
    public static final UndoRedoEventSubtype ADD_FRAGMENT;
    public static final UndoRedoEventSubtype ADD_MUSIC;
    public static final UndoRedoEventSubtype ASPECT_RATIO;
    public static final UndoRedoEventSubtype AUDIO_EFFECT;
    public static final UndoRedoEventSubtype AUDIO_VOLUME;
    public static final UndoRedoEventSubtype CHANGE_MUSIC;
    public static final UndoRedoEventSubtype CHANGE_VOLUME;
    public static final UndoRedoEventSubtype COLOR_CORRECTION;
    public static final UndoRedoEventSubtype CROP;
    public static final UndoRedoEventSubtype DOUBLE;
    public static final UndoRedoEventSubtype EDIT_ATTACHMENT;
    public static final UndoRedoEventSubtype EDIT_AUDIO_OFFSET;
    public static final UndoRedoEventSubtype EDIT_MUSIC;
    public static final UndoRedoEventSubtype FRAGMENT_DURATION;
    public static final UndoRedoEventSubtype MUTE;
    public static final UndoRedoEventSubtype REMOVE_FRAGMENT;
    public static final UndoRedoEventSubtype REMOVE_MUSIC;
    public static final UndoRedoEventSubtype REVERSE;
    public static final UndoRedoEventSubtype SPEED;
    public static final UndoRedoEventSubtype SPLIT;
    public static final UndoRedoEventSubtype STICKER;
    public static final UndoRedoEventSubtype SWAP;
    public static final UndoRedoEventSubtype TEXT;
    public static final UndoRedoEventSubtype VIDEO_TRANSFORMATION;
    public static final UndoRedoEventSubtype VOICEOVER;

    static {
        UndoRedoEventSubtype undoRedoEventSubtype = new UndoRedoEventSubtype("TEXT", 0);
        TEXT = undoRedoEventSubtype;
        UndoRedoEventSubtype undoRedoEventSubtype2 = new UndoRedoEventSubtype("STICKER", 1);
        STICKER = undoRedoEventSubtype2;
        UndoRedoEventSubtype undoRedoEventSubtype3 = new UndoRedoEventSubtype("ADD_MUSIC", 2);
        ADD_MUSIC = undoRedoEventSubtype3;
        UndoRedoEventSubtype undoRedoEventSubtype4 = new UndoRedoEventSubtype("REMOVE_MUSIC", 3);
        REMOVE_MUSIC = undoRedoEventSubtype4;
        UndoRedoEventSubtype undoRedoEventSubtype5 = new UndoRedoEventSubtype("EDIT_MUSIC", 4);
        EDIT_MUSIC = undoRedoEventSubtype5;
        UndoRedoEventSubtype undoRedoEventSubtype6 = new UndoRedoEventSubtype(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 5);
        MUTE = undoRedoEventSubtype6;
        UndoRedoEventSubtype undoRedoEventSubtype7 = new UndoRedoEventSubtype("ADD_FRAGMENT", 6);
        ADD_FRAGMENT = undoRedoEventSubtype7;
        UndoRedoEventSubtype undoRedoEventSubtype8 = new UndoRedoEventSubtype("REMOVE_FRAGMENT", 7);
        REMOVE_FRAGMENT = undoRedoEventSubtype8;
        UndoRedoEventSubtype undoRedoEventSubtype9 = new UndoRedoEventSubtype("CHANGE_MUSIC", 8);
        CHANGE_MUSIC = undoRedoEventSubtype9;
        UndoRedoEventSubtype undoRedoEventSubtype10 = new UndoRedoEventSubtype("AUDIO_VOLUME", 9);
        AUDIO_VOLUME = undoRedoEventSubtype10;
        UndoRedoEventSubtype undoRedoEventSubtype11 = new UndoRedoEventSubtype("CROP", 10);
        CROP = undoRedoEventSubtype11;
        UndoRedoEventSubtype undoRedoEventSubtype12 = new UndoRedoEventSubtype("EDIT_AUDIO_OFFSET", 11);
        EDIT_AUDIO_OFFSET = undoRedoEventSubtype12;
        UndoRedoEventSubtype undoRedoEventSubtype13 = new UndoRedoEventSubtype("AUDIO_EFFECT", 12);
        AUDIO_EFFECT = undoRedoEventSubtype13;
        UndoRedoEventSubtype undoRedoEventSubtype14 = new UndoRedoEventSubtype("CHANGE_VOLUME", 13);
        CHANGE_VOLUME = undoRedoEventSubtype14;
        UndoRedoEventSubtype undoRedoEventSubtype15 = new UndoRedoEventSubtype("COLOR_CORRECTION", 14);
        COLOR_CORRECTION = undoRedoEventSubtype15;
        UndoRedoEventSubtype undoRedoEventSubtype16 = new UndoRedoEventSubtype("EDIT_ATTACHMENT", 15);
        EDIT_ATTACHMENT = undoRedoEventSubtype16;
        UndoRedoEventSubtype undoRedoEventSubtype17 = new UndoRedoEventSubtype("DOUBLE", 16);
        DOUBLE = undoRedoEventSubtype17;
        UndoRedoEventSubtype undoRedoEventSubtype18 = new UndoRedoEventSubtype("SPLIT", 17);
        SPLIT = undoRedoEventSubtype18;
        UndoRedoEventSubtype undoRedoEventSubtype19 = new UndoRedoEventSubtype("REVERSE", 18);
        REVERSE = undoRedoEventSubtype19;
        UndoRedoEventSubtype undoRedoEventSubtype20 = new UndoRedoEventSubtype("SWAP", 19);
        SWAP = undoRedoEventSubtype20;
        UndoRedoEventSubtype undoRedoEventSubtype21 = new UndoRedoEventSubtype("FRAGMENT_DURATION", 20);
        FRAGMENT_DURATION = undoRedoEventSubtype21;
        UndoRedoEventSubtype undoRedoEventSubtype22 = new UndoRedoEventSubtype("VIDEO_TRANSFORMATION", 21);
        VIDEO_TRANSFORMATION = undoRedoEventSubtype22;
        UndoRedoEventSubtype undoRedoEventSubtype23 = new UndoRedoEventSubtype("SPEED", 22);
        SPEED = undoRedoEventSubtype23;
        UndoRedoEventSubtype undoRedoEventSubtype24 = new UndoRedoEventSubtype("ASPECT_RATIO", 23);
        ASPECT_RATIO = undoRedoEventSubtype24;
        UndoRedoEventSubtype undoRedoEventSubtype25 = new UndoRedoEventSubtype("VOICEOVER", 24);
        VOICEOVER = undoRedoEventSubtype25;
        UndoRedoEventSubtype[] undoRedoEventSubtypeArr = {undoRedoEventSubtype, undoRedoEventSubtype2, undoRedoEventSubtype3, undoRedoEventSubtype4, undoRedoEventSubtype5, undoRedoEventSubtype6, undoRedoEventSubtype7, undoRedoEventSubtype8, undoRedoEventSubtype9, undoRedoEventSubtype10, undoRedoEventSubtype11, undoRedoEventSubtype12, undoRedoEventSubtype13, undoRedoEventSubtype14, undoRedoEventSubtype15, undoRedoEventSubtype16, undoRedoEventSubtype17, undoRedoEventSubtype18, undoRedoEventSubtype19, undoRedoEventSubtype20, undoRedoEventSubtype21, undoRedoEventSubtype22, undoRedoEventSubtype23, undoRedoEventSubtype24, undoRedoEventSubtype25};
        $VALUES = undoRedoEventSubtypeArr;
        $ENTRIES = new asp(undoRedoEventSubtypeArr);
    }

    public UndoRedoEventSubtype() {
        throw null;
    }

    public static UndoRedoEventSubtype valueOf(String str) {
        return (UndoRedoEventSubtype) Enum.valueOf(UndoRedoEventSubtype.class, str);
    }

    public static UndoRedoEventSubtype[] values() {
        return (UndoRedoEventSubtype[]) $VALUES.clone();
    }
}
