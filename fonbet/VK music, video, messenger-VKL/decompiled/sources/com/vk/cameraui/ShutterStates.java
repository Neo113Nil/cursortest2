package com.vk.cameraui;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShutterStates.kt */
/* loaded from: classes16.dex */
public final class ShutterStates {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShutterStates[] $VALUES;
    public static final ShutterStates EMPTY;
    public static final ShutterStates LIVE;
    public static final ShutterStates LIVE_LOADING;
    public static final ShutterStates LOOP;
    public static final ShutterStates PHOTO;
    public static final ShutterStates REVERSE;
    public static final ShutterStates SEND_CLIP_MULTIPLE_EMPTY;
    public static final ShutterStates SEND_LOOP_PROCESSING;
    public static final ShutterStates SEND_LOOP_STOP;
    public static final ShutterStates SEND_REVERSE;
    public static final ShutterStates START_LIVE;
    public static final ShutterStates STORY;
    public static final ShutterStates STORY_VIDEO;
    public static final ShutterStates VIDEO;
    public static final ShutterStates VIDEO_RECORDING;
    private final boolean isEditorState = false;

    static {
        ShutterStates shutterStates = new ShutterStates("LIVE", 0);
        LIVE = shutterStates;
        ShutterStates shutterStates2 = new ShutterStates("STORY", 1);
        STORY = shutterStates2;
        ShutterStates shutterStates3 = new ShutterStates("LOOP", 2);
        LOOP = shutterStates3;
        ShutterStates shutterStates4 = new ShutterStates("REVERSE", 3);
        REVERSE = shutterStates4;
        ShutterStates shutterStates5 = new ShutterStates("PHOTO", 4);
        PHOTO = shutterStates5;
        ShutterStates shutterStates6 = new ShutterStates(SignalingProtocol.MEDIA_OPTION_VIDEO, 5);
        VIDEO = shutterStates6;
        ShutterStates shutterStates7 = new ShutterStates("STORY_VIDEO", 6);
        STORY_VIDEO = shutterStates7;
        ShutterStates shutterStates8 = new ShutterStates("SEND_LOOP_PROCESSING", 7);
        SEND_LOOP_PROCESSING = shutterStates8;
        ShutterStates shutterStates9 = new ShutterStates("SEND_LOOP_STOP", 8);
        SEND_LOOP_STOP = shutterStates9;
        ShutterStates shutterStates10 = new ShutterStates("SEND_REVERSE", 9);
        SEND_REVERSE = shutterStates10;
        ShutterStates shutterStates11 = new ShutterStates("START_LIVE", 10);
        START_LIVE = shutterStates11;
        ShutterStates shutterStates12 = new ShutterStates("LIVE_LOADING", 11);
        LIVE_LOADING = shutterStates12;
        ShutterStates shutterStates13 = new ShutterStates("VIDEO_RECORDING", 12);
        VIDEO_RECORDING = shutterStates13;
        ShutterStates shutterStates14 = new ShutterStates("SEND_CLIP_MULTIPLE_EMPTY", 13);
        SEND_CLIP_MULTIPLE_EMPTY = shutterStates14;
        ShutterStates shutterStates15 = new ShutterStates("EMPTY", 14);
        EMPTY = shutterStates15;
        ShutterStates[] shutterStatesArr = {shutterStates, shutterStates2, shutterStates3, shutterStates4, shutterStates5, shutterStates6, shutterStates7, shutterStates8, shutterStates9, shutterStates10, shutterStates11, shutterStates12, shutterStates13, shutterStates14, shutterStates15};
        $VALUES = shutterStatesArr;
        $ENTRIES = new asp(shutterStatesArr);
    }

    public ShutterStates(String str, int i) {
    }

    public static ShutterStates valueOf(String str) {
        return (ShutterStates) Enum.valueOf(ShutterStates.class, str);
    }

    public static ShutterStates[] values() {
        return (ShutterStates[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isEditorState;
    }
}
