package com.vk.im.engine.models.typing;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComposingType.kt */
/* loaded from: classes2.dex */
public final class ComposingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ComposingType[] $VALUES;
    public static final ComposingType AUDIO;
    public static final ComposingType FILE;
    public static final ComposingType PHOTO;
    public static final ComposingType TEXT;
    public static final ComposingType VIDEO;
    public static final ComposingType VIDEO_MSG;

    static {
        ComposingType composingType = new ComposingType("TEXT", 0);
        TEXT = composingType;
        ComposingType composingType2 = new ComposingType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
        AUDIO = composingType2;
        ComposingType composingType3 = new ComposingType("PHOTO", 2);
        PHOTO = composingType3;
        ComposingType composingType4 = new ComposingType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3);
        VIDEO = composingType4;
        ComposingType composingType5 = new ComposingType("FILE", 4);
        FILE = composingType5;
        ComposingType composingType6 = new ComposingType("VIDEO_MSG", 5);
        VIDEO_MSG = composingType6;
        ComposingType[] composingTypeArr = {composingType, composingType2, composingType3, composingType4, composingType5, composingType6};
        $VALUES = composingTypeArr;
        $ENTRIES = new asp(composingTypeArr);
    }

    public ComposingType() {
        throw null;
    }

    public static ComposingType valueOf(String str) {
        return (ComposingType) Enum.valueOf(ComposingType.class, str);
    }

    public static ComposingType[] values() {
        return (ComposingType[]) $VALUES.clone();
    }
}
