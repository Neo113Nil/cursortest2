package com.vk.clips.editor.state.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.brm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FragmentType.kt */
/* loaded from: classes16.dex */
public final class FragmentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FragmentType[] $VALUES;
    public static final FragmentType AUDIO;
    public static final a Companion;
    public static final FragmentType LICENSED_MUSIC;
    public static final FragmentType STICKER;
    public static final FragmentType VIDEO;

    /* compiled from: FragmentType.kt */
    public static final class a {
        public static FragmentType a(String str) {
            for (FragmentType fragmentType : FragmentType.values()) {
                if (brm0.w(fragmentType.name(), str, true)) {
                    return fragmentType;
                }
            }
            return null;
        }
    }

    static {
        FragmentType fragmentType = new FragmentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = fragmentType;
        FragmentType fragmentType2 = new FragmentType("LICENSED_MUSIC", 1);
        LICENSED_MUSIC = fragmentType2;
        FragmentType fragmentType3 = new FragmentType(SignalingProtocol.MEDIA_OPTION_AUDIO, 2);
        AUDIO = fragmentType3;
        FragmentType fragmentType4 = new FragmentType("STICKER", 3);
        STICKER = fragmentType4;
        FragmentType[] fragmentTypeArr = {fragmentType, fragmentType2, fragmentType3, fragmentType4};
        $VALUES = fragmentTypeArr;
        $ENTRIES = new asp(fragmentTypeArr);
        Companion = new a();
    }

    public FragmentType() {
        throw null;
    }

    public static FragmentType valueOf(String str) {
        return (FragmentType) Enum.valueOf(FragmentType.class, str);
    }

    public static FragmentType[] values() {
        return (FragmentType[]) $VALUES.clone();
    }
}
